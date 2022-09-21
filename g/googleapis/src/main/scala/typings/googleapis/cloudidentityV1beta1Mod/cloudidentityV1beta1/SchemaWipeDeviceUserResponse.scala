package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWipeDeviceUserResponse extends StObject {
  
  /**
    * Resultant DeviceUser object for the action.
    */
  var deviceUser: js.UndefOr[SchemaDeviceUser] = js.undefined
}
object SchemaWipeDeviceUserResponse {
  
  inline def apply(): SchemaWipeDeviceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWipeDeviceUserResponse]
  }
  
  extension [Self <: SchemaWipeDeviceUserResponse](x: Self) {
    
    inline def setDeviceUser(value: SchemaDeviceUser): Self = StObject.set(x, "deviceUser", value.asInstanceOf[js.Any])
    
    inline def setDeviceUserUndefined: Self = StObject.set(x, "deviceUser", js.undefined)
  }
}
