package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for `ListServices`.
  */
trait SchemaListServicesResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListServices` again with the `page_token` field set to this value.
    * This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of services.
    */
  var services: js.UndefOr[js.Array[SchemaService]] = js.undefined
}
object SchemaListServicesResponse {
  
  inline def apply(): SchemaListServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServicesResponse]
  }
  
  extension [Self <: SchemaListServicesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setServices(value: js.Array[SchemaService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: SchemaService*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
