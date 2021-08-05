package typings.googleapis.betaMod.computeBeta

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInstancesGetguestattributes
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Name of the instance scoping this request.
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the guest attributes path to be queried.
    */
  var queryPath: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the key for the guest attributes entry.
    */
  var variableKey: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the zone for this request.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceInstancesGetguestattributes {
  
  inline def apply(): ParamsResourceInstancesGetguestattributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInstancesGetguestattributes]
  }
  
  extension [Self <: ParamsResourceInstancesGetguestattributes](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setQueryPath(value: String): Self = StObject.set(x, "queryPath", value.asInstanceOf[js.Any])
    
    inline def setQueryPathUndefined: Self = StObject.set(x, "queryPath", js.undefined)
    
    inline def setVariableKey(value: String): Self = StObject.set(x, "variableKey", value.asInstanceOf[js.Any])
    
    inline def setVariableKeyUndefined: Self = StObject.set(x, "variableKey", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
