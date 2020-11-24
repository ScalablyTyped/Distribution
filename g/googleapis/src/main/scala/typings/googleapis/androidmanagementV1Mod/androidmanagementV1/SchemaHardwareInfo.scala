package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about device hardware. The fields related to temperature
  * thresholds are only available if hardwareStatusEnabled is true in the
  * device&#39;s policy.
  */
@js.native
trait SchemaHardwareInfo extends js.Object {
  
  /**
    * Battery shutdown temperature thresholds in Celsius for each battery on
    * the device.
    */
  var batteryShutdownTemperatures: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Battery throttling temperature thresholds in Celsius for each battery on
    * the device.
    */
  var batteryThrottlingTemperatures: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Brand of the device. For example, Google.
    */
  var brand: js.UndefOr[String] = js.native
  
  /**
    * CPU shutdown temperature thresholds in Celsius for each CPU on the
    * device.
    */
  var cpuShutdownTemperatures: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * CPU throttling temperature thresholds in Celsius for each CPU on the
    * device.
    */
  var cpuThrottlingTemperatures: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Baseband version. For example, MDM9625_104662.22.05.34p.
    */
  var deviceBasebandVersion: js.UndefOr[String] = js.native
  
  /**
    * GPU shutdown temperature thresholds in Celsius for each GPU on the
    * device.
    */
  var gpuShutdownTemperatures: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * GPU throttling temperature thresholds in Celsius for each GPU on the
    * device.
    */
  var gpuThrottlingTemperatures: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Name of the hardware. For example, Angler.
    */
  var hardware: js.UndefOr[String] = js.native
  
  /**
    * Manufacturer. For example, Motorola.
    */
  var manufacturer: js.UndefOr[String] = js.native
  
  /**
    * The model of the device. For example, Asus Nexus 7.
    */
  var model: js.UndefOr[String] = js.native
  
  /**
    * The device serial number.
    */
  var serialNumber: js.UndefOr[String] = js.native
  
  /**
    * Device skin shutdown temperature thresholds in Celsius.
    */
  var skinShutdownTemperatures: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Device skin throttling temperature thresholds in Celsius.
    */
  var skinThrottlingTemperatures: js.UndefOr[js.Array[Double]] = js.native
}
object SchemaHardwareInfo {
  
  @scala.inline
  def apply(): SchemaHardwareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHardwareInfo]
  }
  
  @scala.inline
  implicit class SchemaHardwareInfoOps[Self <: SchemaHardwareInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBatteryShutdownTemperaturesVarargs(value: Double*): Self = this.set("batteryShutdownTemperatures", js.Array(value :_*))
    
    @scala.inline
    def setBatteryShutdownTemperatures(value: js.Array[Double]): Self = this.set("batteryShutdownTemperatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatteryShutdownTemperatures: Self = this.set("batteryShutdownTemperatures", js.undefined)
    
    @scala.inline
    def setBatteryThrottlingTemperaturesVarargs(value: Double*): Self = this.set("batteryThrottlingTemperatures", js.Array(value :_*))
    
    @scala.inline
    def setBatteryThrottlingTemperatures(value: js.Array[Double]): Self = this.set("batteryThrottlingTemperatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatteryThrottlingTemperatures: Self = this.set("batteryThrottlingTemperatures", js.undefined)
    
    @scala.inline
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    
    @scala.inline
    def setCpuShutdownTemperaturesVarargs(value: Double*): Self = this.set("cpuShutdownTemperatures", js.Array(value :_*))
    
    @scala.inline
    def setCpuShutdownTemperatures(value: js.Array[Double]): Self = this.set("cpuShutdownTemperatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuShutdownTemperatures: Self = this.set("cpuShutdownTemperatures", js.undefined)
    
    @scala.inline
    def setCpuThrottlingTemperaturesVarargs(value: Double*): Self = this.set("cpuThrottlingTemperatures", js.Array(value :_*))
    
    @scala.inline
    def setCpuThrottlingTemperatures(value: js.Array[Double]): Self = this.set("cpuThrottlingTemperatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuThrottlingTemperatures: Self = this.set("cpuThrottlingTemperatures", js.undefined)
    
    @scala.inline
    def setDeviceBasebandVersion(value: String): Self = this.set("deviceBasebandVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceBasebandVersion: Self = this.set("deviceBasebandVersion", js.undefined)
    
    @scala.inline
    def setGpuShutdownTemperaturesVarargs(value: Double*): Self = this.set("gpuShutdownTemperatures", js.Array(value :_*))
    
    @scala.inline
    def setGpuShutdownTemperatures(value: js.Array[Double]): Self = this.set("gpuShutdownTemperatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGpuShutdownTemperatures: Self = this.set("gpuShutdownTemperatures", js.undefined)
    
    @scala.inline
    def setGpuThrottlingTemperaturesVarargs(value: Double*): Self = this.set("gpuThrottlingTemperatures", js.Array(value :_*))
    
    @scala.inline
    def setGpuThrottlingTemperatures(value: js.Array[Double]): Self = this.set("gpuThrottlingTemperatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGpuThrottlingTemperatures: Self = this.set("gpuThrottlingTemperatures", js.undefined)
    
    @scala.inline
    def setHardware(value: String): Self = this.set("hardware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardware: Self = this.set("hardware", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
    
    @scala.inline
    def setSkinShutdownTemperaturesVarargs(value: Double*): Self = this.set("skinShutdownTemperatures", js.Array(value :_*))
    
    @scala.inline
    def setSkinShutdownTemperatures(value: js.Array[Double]): Self = this.set("skinShutdownTemperatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkinShutdownTemperatures: Self = this.set("skinShutdownTemperatures", js.undefined)
    
    @scala.inline
    def setSkinThrottlingTemperaturesVarargs(value: Double*): Self = this.set("skinThrottlingTemperatures", js.Array(value :_*))
    
    @scala.inline
    def setSkinThrottlingTemperatures(value: js.Array[Double]): Self = this.set("skinThrottlingTemperatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkinThrottlingTemperatures: Self = this.set("skinThrottlingTemperatures", js.undefined)
  }
}
