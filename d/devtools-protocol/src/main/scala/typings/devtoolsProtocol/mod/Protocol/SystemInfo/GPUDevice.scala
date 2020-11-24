package typings.devtoolsProtocol.mod.Protocol.SystemInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUDevice extends js.Object {
  
  /**
    * PCI ID of the GPU device, if available; 0 otherwise.
    */
  var deviceId: Double = js.native
  
  /**
    * String description of the GPU device, if the PCI ID is not available.
    */
  var deviceString: String = js.native
  
  /**
    * String description of the GPU driver vendor.
    */
  var driverVendor: String = js.native
  
  /**
    * String description of the GPU driver version.
    */
  var driverVersion: String = js.native
  
  /**
    * Revision of the GPU, only available on Windows.
    */
  var revision: js.UndefOr[Double] = js.native
  
  /**
    * Sub sys ID of the GPU, only available on Windows.
    */
  var subSysId: js.UndefOr[Double] = js.native
  
  /**
    * PCI ID of the GPU vendor, if available; 0 otherwise.
    */
  var vendorId: Double = js.native
  
  /**
    * String description of the GPU vendor, if the PCI ID is not available.
    */
  var vendorString: String = js.native
}
object GPUDevice {
  
  @scala.inline
  def apply(
    deviceId: Double,
    deviceString: String,
    driverVendor: String,
    driverVersion: String,
    vendorId: Double,
    vendorString: String
  ): GPUDevice = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], deviceString = deviceString.asInstanceOf[js.Any], driverVendor = driverVendor.asInstanceOf[js.Any], driverVersion = driverVersion.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any], vendorString = vendorString.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUDevice]
  }
  
  @scala.inline
  implicit class GPUDeviceOps[Self <: GPUDevice] (val x: Self) extends AnyVal {
    
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
    def setDeviceId(value: Double): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceString(value: String): Self = this.set("deviceString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverVendor(value: String): Self = this.set("driverVendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverVersion(value: String): Self = this.set("driverVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorId(value: Double): Self = this.set("vendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorString(value: String): Self = this.set("vendorString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
    
    @scala.inline
    def setSubSysId(value: Double): Self = this.set("subSysId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubSysId: Self = this.set("subSysId", js.undefined)
  }
}
