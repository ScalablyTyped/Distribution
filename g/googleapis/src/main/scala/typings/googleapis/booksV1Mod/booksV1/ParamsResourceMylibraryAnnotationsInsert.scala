package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMylibraryAnnotationsInsert
  extends StObject
     with StandardParameters {
  
  /**
    * The ID for the annotation to insert.
    */
  var annotationId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * ISO-3166-1 code to override the IP-based location.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAnnotation] = js.undefined
  
  /**
    * Requests that only the summary of the specified layer be provided in the
    * response.
    */
  var showOnlySummaryInResponse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
}
object ParamsResourceMylibraryAnnotationsInsert {
  
  inline def apply(): ParamsResourceMylibraryAnnotationsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMylibraryAnnotationsInsert]
  }
  
  extension [Self <: ParamsResourceMylibraryAnnotationsInsert](x: Self) {
    
    inline def setAnnotationId(value: String): Self = StObject.set(x, "annotationId", value.asInstanceOf[js.Any])
    
    inline def setAnnotationIdUndefined: Self = StObject.set(x, "annotationId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setRequestBody(value: SchemaAnnotation): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setShowOnlySummaryInResponse(value: Boolean): Self = StObject.set(x, "showOnlySummaryInResponse", value.asInstanceOf[js.Any])
    
    inline def setShowOnlySummaryInResponseUndefined: Self = StObject.set(x, "showOnlySummaryInResponse", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
