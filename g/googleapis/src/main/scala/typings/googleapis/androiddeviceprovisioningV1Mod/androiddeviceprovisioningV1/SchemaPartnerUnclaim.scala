package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPartnerUnclaim extends StObject {
  
  /**
    * Required. Device ID of the device.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Device identifier of the device.
    */
  var deviceIdentifier: js.UndefOr[SchemaDeviceIdentifier] = js.undefined
  
  /**
    * Required. The section type of the device's provisioning record.
    */
  var sectionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The duration of the vacation unlock starting from when the request is processed. (1 day is treated as 24 hours)
    */
  var vacationModeDays: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. The expiration time of the vacation unlock.
    */
  var vacationModeExpireTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaPartnerUnclaim {
  
  inline def apply(): SchemaPartnerUnclaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartnerUnclaim]
  }
  
  extension [Self <: SchemaPartnerUnclaim](x: Self) {
    
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
