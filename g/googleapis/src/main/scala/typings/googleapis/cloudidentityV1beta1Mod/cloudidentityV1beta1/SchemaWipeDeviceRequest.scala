package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWipeDeviceRequest extends StObject {
  
  /**
    * Optional. Specifies if a user is able to factory reset a device after a Device Wipe. On iOS, this is called "Activation Lock", while on Android, this is known as "Factory Reset Protection". If true, this protection will be removed from the device, so that a user can successfully factory reset. If false, the setting is untouched on the device.
    */
  var removeResetLock: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaWipeDeviceRequest {
  
  inline def apply(): SchemaWipeDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWipeDeviceRequest]
  }
  
  extension [Self <: SchemaWipeDeviceRequest](x: Self) {
    
    inline def setRemoveResetLock(value: Boolean): Self = StObject.set(x, "removeResetLock", value.asInstanceOf[js.Any])
    
    inline def setRemoveResetLockNull: Self = StObject.set(x, "removeResetLock", null)
    
    inline def setRemoveResetLockUndefined: Self = StObject.set(x, "removeResetLock", js.undefined)
  }
}
