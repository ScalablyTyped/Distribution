package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HIDDevice extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/hid-device
  /**
    * Unique identifier for the device.
    */
  var deviceId: String
  
  /**
    * Unique identifier for the HID interface.  A device may have multiple HID
    * interfaces.
    */
  var guid: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the device.
    */
  var name: String
  
  /**
    * The USB product ID.
    */
  var productId: Double
  
  /**
    * The USB device serial number.
    */
  var serialNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The USB vendor ID.
    */
  var vendorId: Double
}
object HIDDevice {
  
  inline def apply(deviceId: String, name: String, productId: Double, vendorId: Double): HIDDevice = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HIDDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HIDDevice] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: Double): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setVendorId(value: Double): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
  }
}
