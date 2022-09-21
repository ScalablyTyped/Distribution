package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHardwareStatus extends StObject {
  
  /**
    * Current battery temperatures in Celsius for each battery on the device.
    */
  var batteryTemperatures: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * Current CPU temperatures in Celsius for each CPU on the device.
    */
  var cpuTemperatures: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * CPU usages in percentage for each core available on the device. Usage is 0 for each unplugged core. Empty array implies that CPU usage is not supported in the system.
    */
  var cpuUsages: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * The time the measurements were taken.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Fan speeds in RPM for each fan on the device. Empty array means that there are no fans or fan speed is not supported on the system.
    */
  var fanSpeeds: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * Current GPU temperatures in Celsius for each GPU on the device.
    */
  var gpuTemperatures: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * Current device skin temperatures in Celsius.
    */
  var skinTemperatures: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaHardwareStatus {
  
  inline def apply(): SchemaHardwareStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHardwareStatus]
  }
  
  extension [Self <: SchemaHardwareStatus](x: Self) {
    
    inline def setBatteryTemperatures(value: js.Array[Double]): Self = StObject.set(x, "batteryTemperatures", value.asInstanceOf[js.Any])
    
    inline def setBatteryTemperaturesNull: Self = StObject.set(x, "batteryTemperatures", null)
    
    inline def setBatteryTemperaturesUndefined: Self = StObject.set(x, "batteryTemperatures", js.undefined)
    
    inline def setBatteryTemperaturesVarargs(value: Double*): Self = StObject.set(x, "batteryTemperatures", js.Array(value*))
    
    inline def setCpuTemperatures(value: js.Array[Double]): Self = StObject.set(x, "cpuTemperatures", value.asInstanceOf[js.Any])
    
    inline def setCpuTemperaturesNull: Self = StObject.set(x, "cpuTemperatures", null)
    
    inline def setCpuTemperaturesUndefined: Self = StObject.set(x, "cpuTemperatures", js.undefined)
    
    inline def setCpuTemperaturesVarargs(value: Double*): Self = StObject.set(x, "cpuTemperatures", js.Array(value*))
    
    inline def setCpuUsages(value: js.Array[Double]): Self = StObject.set(x, "cpuUsages", value.asInstanceOf[js.Any])
    
    inline def setCpuUsagesNull: Self = StObject.set(x, "cpuUsages", null)
    
    inline def setCpuUsagesUndefined: Self = StObject.set(x, "cpuUsages", js.undefined)
    
    inline def setCpuUsagesVarargs(value: Double*): Self = StObject.set(x, "cpuUsages", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setFanSpeeds(value: js.Array[Double]): Self = StObject.set(x, "fanSpeeds", value.asInstanceOf[js.Any])
    
    inline def setFanSpeedsNull: Self = StObject.set(x, "fanSpeeds", null)
    
    inline def setFanSpeedsUndefined: Self = StObject.set(x, "fanSpeeds", js.undefined)
    
    inline def setFanSpeedsVarargs(value: Double*): Self = StObject.set(x, "fanSpeeds", js.Array(value*))
    
    inline def setGpuTemperatures(value: js.Array[Double]): Self = StObject.set(x, "gpuTemperatures", value.asInstanceOf[js.Any])
    
    inline def setGpuTemperaturesNull: Self = StObject.set(x, "gpuTemperatures", null)
    
    inline def setGpuTemperaturesUndefined: Self = StObject.set(x, "gpuTemperatures", js.undefined)
    
    inline def setGpuTemperaturesVarargs(value: Double*): Self = StObject.set(x, "gpuTemperatures", js.Array(value*))
    
    inline def setSkinTemperatures(value: js.Array[Double]): Self = StObject.set(x, "skinTemperatures", value.asInstanceOf[js.Any])
    
    inline def setSkinTemperaturesNull: Self = StObject.set(x, "skinTemperatures", null)
    
    inline def setSkinTemperaturesUndefined: Self = StObject.set(x, "skinTemperatures", js.undefined)
    
    inline def setSkinTemperaturesVarargs(value: Double*): Self = StObject.set(x, "skinTemperatures", js.Array(value*))
  }
}
