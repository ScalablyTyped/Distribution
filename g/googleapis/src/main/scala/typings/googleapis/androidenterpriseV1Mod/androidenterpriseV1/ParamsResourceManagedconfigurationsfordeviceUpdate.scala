package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagedconfigurationsfordeviceUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * The Android ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the managed configuration (a product ID), e.g. "app:com.google.android.gm".
    */
  var managedConfigurationForDeviceId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaManagedConfiguration] = js.undefined
  
  /**
    * The ID of the user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagedconfigurationsfordeviceUpdate {
  
  inline def apply(): ParamsResourceManagedconfigurationsfordeviceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagedconfigurationsfordeviceUpdate]
  }
  
  extension [Self <: ParamsResourceManagedconfigurationsfordeviceUpdate](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    inline def setManagedConfigurationForDeviceId(value: String): Self = StObject.set(x, "managedConfigurationForDeviceId", value.asInstanceOf[js.Any])
    
    inline def setManagedConfigurationForDeviceIdUndefined: Self = StObject.set(x, "managedConfigurationForDeviceId", js.undefined)
    
    inline def setRequestBody(value: SchemaManagedConfiguration): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
