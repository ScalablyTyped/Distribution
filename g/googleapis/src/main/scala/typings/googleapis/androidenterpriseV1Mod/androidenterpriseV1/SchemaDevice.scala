package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDevice extends StObject {
  
  /**
    * The Google Play Services Android ID for the device encoded as a lowercase hex string. For example, "123456789abcdef0".
    */
  var androidId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies the extent to which the device is controlled by a managed Google Play EMM in various deployment configurations. Possible values include: - "managedDevice", a device that has the EMM's device policy controller (DPC) as the device owner. - "managedProfile", a device that has a profile managed by the DPC (DPC is profile owner) in addition to a separate, personal profile that is unavailable to the DPC. - "containerApp", no longer used (deprecated). - "unmanagedProfile", a device that has been allowed (by the domain's admin, using the Admin Console to enable the privilege) to use managed Google Play, but the profile is itself not owned by a DPC.
    */
  var managementType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The policy enforced on the device.
    */
  var policy: js.UndefOr[SchemaPolicy] = js.undefined
  
  /**
    * The device report updated with the latest app states.
    */
  var report: js.UndefOr[SchemaDeviceReport] = js.undefined
}
object SchemaDevice {
  
  inline def apply(): SchemaDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevice]
  }
  
  extension [Self <: SchemaDevice](x: Self) {
    
    inline def setAndroidId(value: String): Self = StObject.set(x, "androidId", value.asInstanceOf[js.Any])
    
    inline def setAndroidIdNull: Self = StObject.set(x, "androidId", null)
    
    inline def setAndroidIdUndefined: Self = StObject.set(x, "androidId", js.undefined)
    
    inline def setManagementType(value: String): Self = StObject.set(x, "managementType", value.asInstanceOf[js.Any])
    
    inline def setManagementTypeNull: Self = StObject.set(x, "managementType", null)
    
    inline def setManagementTypeUndefined: Self = StObject.set(x, "managementType", js.undefined)
    
    inline def setPolicy(value: SchemaPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setReport(value: SchemaDeviceReport): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
  }
}
