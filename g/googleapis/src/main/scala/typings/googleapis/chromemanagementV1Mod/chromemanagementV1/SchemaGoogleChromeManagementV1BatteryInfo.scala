package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1BatteryInfo extends StObject {
  
  /**
    * Output only. Design capacity (mAmpere-hours).
    */
  var designCapacity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Designed minimum output voltage (mV)
    */
  var designMinVoltage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The date the battery was manufactured.
    */
  var manufactureDate: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
  
  /**
    * Output only. Battery manufacturer.
    */
  var manufacturer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Battery serial number.
    */
  var serialNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Technology of the battery. Example: Li-ion
    */
  var technology: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1BatteryInfo {
  
  inline def apply(): SchemaGoogleChromeManagementV1BatteryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1BatteryInfo]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1BatteryInfo](x: Self) {
    
    inline def setDesignCapacity(value: String): Self = StObject.set(x, "designCapacity", value.asInstanceOf[js.Any])
    
    inline def setDesignCapacityNull: Self = StObject.set(x, "designCapacity", null)
    
    inline def setDesignCapacityUndefined: Self = StObject.set(x, "designCapacity", js.undefined)
    
    inline def setDesignMinVoltage(value: Double): Self = StObject.set(x, "designMinVoltage", value.asInstanceOf[js.Any])
    
    inline def setDesignMinVoltageNull: Self = StObject.set(x, "designMinVoltage", null)
    
    inline def setDesignMinVoltageUndefined: Self = StObject.set(x, "designMinVoltage", js.undefined)
    
    inline def setManufactureDate(value: SchemaGoogleTypeDate): Self = StObject.set(x, "manufactureDate", value.asInstanceOf[js.Any])
    
    inline def setManufactureDateUndefined: Self = StObject.set(x, "manufactureDate", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNull: Self = StObject.set(x, "manufacturer", null)
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setTechnology(value: String): Self = StObject.set(x, "technology", value.asInstanceOf[js.Any])
    
    inline def setTechnologyNull: Self = StObject.set(x, "technology", null)
    
    inline def setTechnologyUndefined: Self = StObject.set(x, "technology", js.undefined)
  }
}
