package typings.domSerial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerialPortInfo
  extends SerialPortInfoBase
     with SerialPortFilter
object SerialPortInfo {
  
  @scala.inline
  def apply(
    locationId: String,
    manufacturer: String,
    product: String,
    productId: String,
    serialNumber: String,
    usbVendorId: Double,
    vendor: String,
    vendorId: String
  ): SerialPortInfo = {
    val __obj = js.Dynamic.literal(locationId = locationId.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], usbVendorId = usbVendorId.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialPortInfo]
  }
}
