package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1CpuStatusReport extends StObject {
  
  /**
    * Output only. CPU temperature sample info per CPU core in Celsius
    */
  var cpuTemperatureInfo: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1CpuTemperatureInfo]] = js.undefined
  
  /**
    * Output only. Sample of CPU utilization (0-100 percent).
    */
  var cpuUtilizationPct: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The timestamp in milliseconds representing time at which this report was sampled.
    */
  var reportTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Frequency the report is sampled.
    */
  var sampleFrequency: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1CpuStatusReport {
  
  inline def apply(): SchemaGoogleChromeManagementV1CpuStatusReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1CpuStatusReport]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1CpuStatusReport](x: Self) {
    
    inline def setCpuTemperatureInfo(value: js.Array[SchemaGoogleChromeManagementV1CpuTemperatureInfo]): Self = StObject.set(x, "cpuTemperatureInfo", value.asInstanceOf[js.Any])
    
    inline def setCpuTemperatureInfoUndefined: Self = StObject.set(x, "cpuTemperatureInfo", js.undefined)
    
    inline def setCpuTemperatureInfoVarargs(value: SchemaGoogleChromeManagementV1CpuTemperatureInfo*): Self = StObject.set(x, "cpuTemperatureInfo", js.Array(value*))
    
    inline def setCpuUtilizationPct(value: Double): Self = StObject.set(x, "cpuUtilizationPct", value.asInstanceOf[js.Any])
    
    inline def setCpuUtilizationPctNull: Self = StObject.set(x, "cpuUtilizationPct", null)
    
    inline def setCpuUtilizationPctUndefined: Self = StObject.set(x, "cpuUtilizationPct", js.undefined)
    
    inline def setReportTime(value: String): Self = StObject.set(x, "reportTime", value.asInstanceOf[js.Any])
    
    inline def setReportTimeNull: Self = StObject.set(x, "reportTime", null)
    
    inline def setReportTimeUndefined: Self = StObject.set(x, "reportTime", js.undefined)
    
    inline def setSampleFrequency(value: String): Self = StObject.set(x, "sampleFrequency", value.asInstanceOf[js.Any])
    
    inline def setSampleFrequencyNull: Self = StObject.set(x, "sampleFrequency", null)
    
    inline def setSampleFrequencyUndefined: Self = StObject.set(x, "sampleFrequency", js.undefined)
  }
}
