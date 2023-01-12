package typings.domSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialPortFilter extends StObject {
  
  var usbProductId: js.UndefOr[Double] = js.undefined
  
  var usbVendorId: Double
}
object SerialPortFilter {
  
  inline def apply(usbVendorId: Double): SerialPortFilter = {
    val __obj = js.Dynamic.literal(usbVendorId = usbVendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialPortFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerialPortFilter] (val x: Self) extends AnyVal {
    
    inline def setUsbProductId(value: Double): Self = StObject.set(x, "usbProductId", value.asInstanceOf[js.Any])
    
    inline def setUsbProductIdUndefined: Self = StObject.set(x, "usbProductId", js.undefined)
    
    inline def setUsbVendorId(value: Double): Self = StObject.set(x, "usbVendorId", value.asInstanceOf[js.Any])
  }
}
