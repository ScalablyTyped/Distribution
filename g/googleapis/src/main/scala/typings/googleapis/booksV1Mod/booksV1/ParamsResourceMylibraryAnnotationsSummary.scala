package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMylibraryAnnotationsSummary
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Array of layer IDs to get the summary for.
    */
  var layerIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Volume id to get the summary for.
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceMylibraryAnnotationsSummary {
  
  inline def apply(): ParamsResourceMylibraryAnnotationsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMylibraryAnnotationsSummary]
  }
  
  extension [Self <: ParamsResourceMylibraryAnnotationsSummary](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setLayerIds(value: js.Array[String]): Self = StObject.set(x, "layerIds", value.asInstanceOf[js.Any])
    
    inline def setLayerIdsUndefined: Self = StObject.set(x, "layerIds", js.undefined)
    
    inline def setLayerIdsVarargs(value: String*): Self = StObject.set(x, "layerIds", js.Array(value :_*))
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
