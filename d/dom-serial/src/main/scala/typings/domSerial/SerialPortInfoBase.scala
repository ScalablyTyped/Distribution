package typings.domSerial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerialPortInfoBase extends js.Object {
  
  var locationId: String = js.native
  
  var manufacturer: String = js.native
  
  var product: String = js.native
  
  var productId: String = js.native
  
  var serialNumber: String = js.native
  
  var vendor: String = js.native
  
  var vendorId: String = js.native
}
object SerialPortInfoBase {
  
  @scala.inline
  def apply(
    locationId: String,
    manufacturer: String,
    product: String,
    productId: String,
    serialNumber: String,
    vendor: String,
    vendorId: String
  ): SerialPortInfoBase = {
    val __obj = js.Dynamic.literal(locationId = locationId.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialPortInfoBase]
  }
  
  @scala.inline
  implicit class SerialPortInfoBaseOps[Self <: SerialPortInfoBase] (val x: Self) extends AnyVal {
    
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
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorId(value: String): Self = this.set("vendorId", value.asInstanceOf[js.Any])
  }
}
