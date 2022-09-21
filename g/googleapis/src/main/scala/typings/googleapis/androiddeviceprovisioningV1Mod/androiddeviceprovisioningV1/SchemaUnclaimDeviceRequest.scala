package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUnclaimDeviceRequest extends StObject {
  
  /**
    * Required. The device ID returned by `ClaimDevice`.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The device identifier you used when you claimed this device.
    */
  var deviceIdentifier: js.UndefOr[SchemaDeviceIdentifier] = js.undefined
  
  /**
    * Required. The section type of the device's provisioning record.
    */
  var sectionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The duration of the vacation unlock starting from when the request is processed. (1 day is treated as 24 hours)
    */
  var vacationModeDays: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The expiration time of the vacation unlock.
    */
  var vacationModeExpireTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaUnclaimDeviceRequest {
  
  inline def apply(): SchemaUnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnclaimDeviceRequest]
  }
  
  extension [Self <: SchemaUnclaimDeviceRequest](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceIdentifier(value: SchemaDeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    inline def setSectionType(value: String): Self = StObject.set(x, "sectionType", value.asInstanceOf[js.Any])
    
    inline def setSectionTypeNull: Self = StObject.set(x, "sectionType", null)
    
    inline def setSectionTypeUndefined: Self = StObject.set(x, "sectionType", js.undefined)
    
    inline def setVacationModeDays(value: Double): Self = StObject.set(x, "vacationModeDays", value.asInstanceOf[js.Any])
    
    inline def setVacationModeDaysNull: Self = StObject.set(x, "vacationModeDays", null)
    
    inline def setVacationModeDaysUndefined: Self = StObject.set(x, "vacationModeDays", js.undefined)
    
    inline def setVacationModeExpireTime(value: String): Self = StObject.set(x, "vacationModeExpireTime", value.asInstanceOf[js.Any])
    
    inline def setVacationModeExpireTimeNull: Self = StObject.set(x, "vacationModeExpireTime", null)
    
    inline def setVacationModeExpireTimeUndefined: Self = StObject.set(x, "vacationModeExpireTime", js.undefined)
  }
}
