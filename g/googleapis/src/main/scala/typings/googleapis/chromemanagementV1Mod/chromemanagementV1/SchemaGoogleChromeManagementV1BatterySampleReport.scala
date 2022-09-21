package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1BatterySampleReport extends StObject {
  
  /**
    * Output only. Battery charge percentage.
    */
  var chargeRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Battery current (mA).
    */
  var current: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The battery discharge rate measured in mW. Positive if the battery is being discharged, negative if it's being charged.
    */
  var dischargeRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Battery remaining capacity (mAmpere-hours).
    */
  var remainingCapacity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp of when the sample was collected on device
    */
  var reportTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Battery status read from sysfs. Example: Discharging
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Temperature in Celsius degrees.
    */
  var temperature: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Battery voltage (millivolt).
    */
  var voltage: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1BatterySampleReport {
  
  inline def apply(): SchemaGoogleChromeManagementV1BatterySampleReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1BatterySampleReport]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1BatterySampleReport](x: Self) {
    
    inline def setChargeRate(value: Double): Self = StObject.set(x, "chargeRate", value.asInstanceOf[js.Any])
    
    inline def setChargeRateNull: Self = StObject.set(x, "chargeRate", null)
    
    inline def setChargeRateUndefined: Self = StObject.set(x, "chargeRate", js.undefined)
    
    inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentNull: Self = StObject.set(x, "current", null)
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setDischargeRate(value: Double): Self = StObject.set(x, "dischargeRate", value.asInstanceOf[js.Any])
    
    inline def setDischargeRateNull: Self = StObject.set(x, "dischargeRate", null)
    
    inline def setDischargeRateUndefined: Self = StObject.set(x, "dischargeRate", js.undefined)
    
    inline def setRemainingCapacity(value: String): Self = StObject.set(x, "remainingCapacity", value.asInstanceOf[js.Any])
    
    inline def setRemainingCapacityNull: Self = StObject.set(x, "remainingCapacity", null)
    
    inline def setRemainingCapacityUndefined: Self = StObject.set(x, "remainingCapacity", js.undefined)
    
    inline def setReportTime(value: String): Self = StObject.set(x, "reportTime", value.asInstanceOf[js.Any])
    
    inline def setReportTimeNull: Self = StObject.set(x, "reportTime", null)
    
    inline def setReportTimeUndefined: Self = StObject.set(x, "reportTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTemperature(value: Double): Self = StObject.set(x, "temperature", value.asInstanceOf[js.Any])
    
    inline def setTemperatureNull: Self = StObject.set(x, "temperature", null)
    
    inline def setTemperatureUndefined: Self = StObject.set(x, "temperature", js.undefined)
    
    inline def setVoltage(value: String): Self = StObject.set(x, "voltage", value.asInstanceOf[js.Any])
    
    inline def setVoltageNull: Self = StObject.set(x, "voltage", null)
    
    inline def setVoltageUndefined: Self = StObject.set(x, "voltage", js.undefined)
  }
}
