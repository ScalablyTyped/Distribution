package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesDevicesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The name of the device in the form
    * enterprises/{enterpriseId}/devices/{deviceId}.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional flags that control the device wiping behavior.
    */
  var wipeDataFlags: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceEnterprisesDevicesDelete {
  
  inline def apply(): ParamsResourceEnterprisesDevicesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesDevicesDelete]
  }
  
  extension [Self <: ParamsResourceEnterprisesDevicesDelete](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setWipeDataFlags(value: js.Array[String]): Self = StObject.set(x, "wipeDataFlags", value.asInstanceOf[js.Any])
    
    inline def setWipeDataFlagsUndefined: Self = StObject.set(x, "wipeDataFlags", js.undefined)
    
    inline def setWipeDataFlagsVarargs(value: String*): Self = StObject.set(x, "wipeDataFlags", js.Array(value :_*))
  }
}
