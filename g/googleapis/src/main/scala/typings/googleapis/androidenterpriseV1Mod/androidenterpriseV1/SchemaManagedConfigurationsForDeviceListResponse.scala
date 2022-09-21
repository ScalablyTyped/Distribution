package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedConfigurationsForDeviceListResponse extends StObject {
  
  /**
    * A managed configuration for an app on a specific device.
    */
  var managedConfigurationForDevice: js.UndefOr[js.Array[SchemaManagedConfiguration]] = js.undefined
}
object SchemaManagedConfigurationsForDeviceListResponse {
  
  inline def apply(): SchemaManagedConfigurationsForDeviceListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationsForDeviceListResponse]
  }
  
  extension [Self <: SchemaManagedConfigurationsForDeviceListResponse](x: Self) {
    
    inline def setManagedConfigurationForDevice(value: js.Array[SchemaManagedConfiguration]): Self = StObject.set(x, "managedConfigurationForDevice", value.asInstanceOf[js.Any])
    
    inline def setManagedConfigurationForDeviceUndefined: Self = StObject.set(x, "managedConfigurationForDevice", js.undefined)
    
    inline def setManagedConfigurationForDeviceVarargs(value: SchemaManagedConfiguration*): Self = StObject.set(x, "managedConfigurationForDevice", js.Array(value*))
  }
}
