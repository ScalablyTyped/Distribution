package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceClaim extends StObject {
  
  /**
    * The Additional service registered for the device.
    */
  var additionalService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the Customer that purchased the device.
    */
  var ownerCompanyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the reseller that claimed the device.
    */
  var resellerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The type of claim made on the device.
    */
  var sectionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp when the device will exit ‘vacation mode’. This value is present iff the device is in 'vacation mode'.
    */
  var vacationModeExpireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp when the device was put into ‘vacation mode’. This value is present iff the device is in 'vacation mode'.
    */
  var vacationModeStartTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeviceClaim {
  
  inline def apply(): SchemaDeviceClaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceClaim]
  }
  
  extension [Self <: SchemaDeviceClaim](x: Self) {
    
    inline def setAdditionalService(value: String): Self = StObject.set(x, "additionalService", value.asInstanceOf[js.Any])
    
    inline def setAdditionalServiceNull: Self = StObject.set(x, "additionalService", null)
    
    inline def setAdditionalServiceUndefined: Self = StObject.set(x, "additionalService", js.undefined)
    
    inline def setOwnerCompanyId(value: String): Self = StObject.set(x, "ownerCompanyId", value.asInstanceOf[js.Any])
    
    inline def setOwnerCompanyIdNull: Self = StObject.set(x, "ownerCompanyId", null)
    
    inline def setOwnerCompanyIdUndefined: Self = StObject.set(x, "ownerCompanyId", js.undefined)
    
    inline def setResellerId(value: String): Self = StObject.set(x, "resellerId", value.asInstanceOf[js.Any])
    
    inline def setResellerIdNull: Self = StObject.set(x, "resellerId", null)
    
    inline def setResellerIdUndefined: Self = StObject.set(x, "resellerId", js.undefined)
    
    inline def setSectionType(value: String): Self = StObject.set(x, "sectionType", value.asInstanceOf[js.Any])
    
    inline def setSectionTypeNull: Self = StObject.set(x, "sectionType", null)
    
    inline def setSectionTypeUndefined: Self = StObject.set(x, "sectionType", js.undefined)
    
    inline def setVacationModeExpireTime(value: String): Self = StObject.set(x, "vacationModeExpireTime", value.asInstanceOf[js.Any])
    
    inline def setVacationModeExpireTimeNull: Self = StObject.set(x, "vacationModeExpireTime", null)
    
    inline def setVacationModeExpireTimeUndefined: Self = StObject.set(x, "vacationModeExpireTime", js.undefined)
    
    inline def setVacationModeStartTime(value: String): Self = StObject.set(x, "vacationModeStartTime", value.asInstanceOf[js.Any])
    
    inline def setVacationModeStartTimeNull: Self = StObject.set(x, "vacationModeStartTime", null)
    
    inline def setVacationModeStartTimeUndefined: Self = StObject.set(x, "vacationModeStartTime", js.undefined)
  }
}
