package typings.domSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerialPortFilter extends StObject {
  
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
  implicit class SerialPortFilterMutableBuilder[Self <: SerialPortFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsbProductId(value: Double): Self = StObject.set(x, "usbProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsbProductIdUndefined: Self = StObject.set(x, "usbProductId", js.undefined)
    
    @scala.inline
    def setUsbVendorId(value: Double): Self = StObject.set(x, "usbVendorId", value.asInstanceOf[js.Any])
  }
}
