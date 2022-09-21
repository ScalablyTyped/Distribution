package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1BatteryStatusReport extends StObject {
  
  /**
    * Output only. Battery health.
    */
  var batteryHealth: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Cycle count.
    */
  var cycleCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Full charge capacity (mAmpere-hours).
    */
  var fullChargeCapacity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp of when the sample was collected on device
    */
  var reportTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Sampling data for the battery sorted in a decreasing order of report_time.
    */
  var sample: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1BatterySampleReport]] = js.undefined
  
  /**
    * Output only. Battery serial number.
    */
  var serialNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1BatteryStatusReport {
  
  inline def apply(): SchemaGoogleChromeManagementV1BatteryStatusReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1BatteryStatusReport]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1BatteryStatusReport](x: Self) {
    
    inline def setBatteryHealth(value: String): Self = StObject.set(x, "batteryHealth", value.asInstanceOf[js.Any])
    
    inline def setBatteryHealthNull: Self = StObject.set(x, "batteryHealth", null)
    
    inline def setBatteryHealthUndefined: Self = StObject.set(x, "batteryHealth", js.undefined)
    
    inline def setCycleCount(value: Double): Self = StObject.set(x, "cycleCount", value.asInstanceOf[js.Any])
    
    inline def setCycleCountNull: Self = StObject.set(x, "cycleCount", null)
    
    inline def setCycleCountUndefined: Self = StObject.set(x, "cycleCount", js.undefined)
    
    inline def setFullChargeCapacity(value: String): Self = StObject.set(x, "fullChargeCapacity", value.asInstanceOf[js.Any])
    
    inline def setFullChargeCapacityNull: Self = StObject.set(x, "fullChargeCapacity", null)
    
    inline def setFullChargeCapacityUndefined: Self = StObject.set(x, "fullChargeCapacity", js.undefined)
    
    inline def setReportTime(value: String): Self = StObject.set(x, "reportTime", value.asInstanceOf[js.Any])
    
    inline def setReportTimeNull: Self = StObject.set(x, "reportTime", null)
    
    inline def setReportTimeUndefined: Self = StObject.set(x, "reportTime", js.undefined)
    
    inline def setSample(value: js.Array[SchemaGoogleChromeManagementV1BatterySampleReport]): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
    
    inline def setSampleUndefined: Self = StObject.set(x, "sample", js.undefined)
    
    inline def setSampleVarargs(value: SchemaGoogleChromeManagementV1BatterySampleReport*): Self = StObject.set(x, "sample", js.Array(value*))
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
  }
}
