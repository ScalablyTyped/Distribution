package typings.domSerial.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<dom-serial.SerialPortInfo> */
@js.native
trait PartialSerialPortInfo extends js.Object {
  
  var locationId: js.UndefOr[String] = js.native
  
  var manufacturer: js.UndefOr[String] = js.native
  
  var product: js.UndefOr[String] = js.native
  
  var productId: js.UndefOr[String] = js.native
  
  var serialNumber: js.UndefOr[String] = js.native
  
  var usbProductId: js.UndefOr[Double] = js.native
  
  var usbVendorId: js.UndefOr[Double] = js.native
  
  var vendor: js.UndefOr[String] = js.native
  
  var vendorId: js.UndefOr[String] = js.native
}
object PartialSerialPortInfo {
  
  @scala.inline
  def apply(): PartialSerialPortInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSerialPortInfo]
  }
  
  @scala.inline
  implicit class PartialSerialPortInfoOps[Self <: PartialSerialPortInfo] (val x: Self) extends AnyVal {
    
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
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
    
    @scala.inline
    def setUsbProductId(value: Double): Self = this.set("usbProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsbProductId: Self = this.set("usbProductId", js.undefined)
    
    @scala.inline
    def setUsbVendorId(value: Double): Self = this.set("usbVendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsbVendorId: Self = this.set("usbVendorId", js.undefined)
    
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendor: Self = this.set("vendor", js.undefined)
    
    @scala.inline
    def setVendorId(value: String): Self = this.set("vendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendorId: Self = this.set("vendorId", js.undefined)
  }
}
