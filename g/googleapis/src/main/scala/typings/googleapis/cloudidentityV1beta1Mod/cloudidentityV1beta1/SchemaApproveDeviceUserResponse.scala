package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApproveDeviceUserResponse extends StObject {
  
  /**
    * Resultant DeviceUser object for the action.
    */
  var deviceUser: js.UndefOr[SchemaDeviceUser] = js.undefined
}
object SchemaApproveDeviceUserResponse {
  
  inline def apply(): SchemaApproveDeviceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApproveDeviceUserResponse]
  }
  
  extension [Self <: SchemaApproveDeviceUserResponse](x: Self) {
    
    inline def setDeviceUser(value: SchemaDeviceUser): Self = StObject.set(x, "deviceUser", value.asInstanceOf[js.Any])
    
    inline def setDeviceUserUndefined: Self = StObject.set(x, "deviceUser", js.undefined)
  }
}
