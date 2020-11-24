package typings.domSerial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerialPortFilter extends js.Object {
  
  var usbProductId: js.UndefOr[Double] = js.native
  
  var usbVendorId: Double = js.native
}
object SerialPortFilter {
  
  @scala.inline
  def apply(usbVendorId: Double): SerialPortFilter = {
    val __obj = js.Dynamic.literal(usbVendorId = usbVendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialPortFilter]
  }
  
  @scala.inline
  implicit class SerialPortFilterOps[Self <: SerialPortFilter] (val x: Self) extends AnyVal {
    
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
    def setUsbVendorId(value: Double): Self = this.set("usbVendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsbProductId(value: Double): Self = this.set("usbProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsbProductId: Self = this.set("usbProductId", js.undefined)
  }
}
