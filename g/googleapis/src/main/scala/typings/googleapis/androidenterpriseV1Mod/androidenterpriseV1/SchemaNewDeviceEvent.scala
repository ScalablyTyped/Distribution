package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated when a new device is ready to be managed.
  */
trait SchemaNewDeviceEvent extends StObject {
  
  /**
    * The Android ID of the device. This field will always be present.
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * Policy app on the device.
    */
  var dpcPackageName: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the extent to which the device is controlled by an Android EMM
    * in various deployment configurations.  Possible values include:  -
    * &quot;managedDevice&quot;, a device where the DPC is set as device owner,
    * - &quot;managedProfile&quot;, a device where the DPC is set as profile
    * owner.
    */
  var managementType: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the user. This field will always be present.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object SchemaNewDeviceEvent {
  
  inline def apply(): SchemaNewDeviceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNewDeviceEvent]
  }
  
  extension [Self <: SchemaNewDeviceEvent](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDpcPackageName(value: String): Self = StObject.set(x, "dpcPackageName", value.asInstanceOf[js.Any])
    
    inline def setDpcPackageNameUndefined: Self = StObject.set(x, "dpcPackageName", js.undefined)
    
    inline def setManagementType(value: String): Self = StObject.set(x, "managementType", value.asInstanceOf[js.Any])
    
    inline def setManagementTypeUndefined: Self = StObject.set(x, "managementType", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
