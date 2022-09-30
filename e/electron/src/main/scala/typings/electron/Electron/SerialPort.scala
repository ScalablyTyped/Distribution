package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialPort extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/serial-port
  /**
    * A stable identifier on Windows that can be used for device permissions.
    */
  var deviceInstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * A string suitable for display to the user for describing this device.
    */
  var displayName: String
  
  /**
    * Unique identifier for the port.
    */
  var portId: String
  
  /**
    * Name of the port.
    */
  var portName: String
  
  /**
    * Optional USB product ID.
    */
  var productId: String
  
  /**
    * The USB device serial number.
    */
  var serialNumber: String
  
  /**
    * Represents a single serial port on macOS can be enumerated by multiple drivers.
    */
  var usbDriverName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional USB vendor ID.
    */
  var vendorId: String
}
object SerialPort {
  
  inline def apply(
    displayName: String,
    portId: String,
    portName: String,
    productId: String,
    serialNumber: String,
    vendorId: String
  ): SerialPort = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any], portName = portName.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialPort]
  }
  
  extension [Self <: SerialPort](x: Self) {
    
    inline def setDeviceInstanceId(value: String): Self = StObject.set(x, "deviceInstanceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceInstanceIdUndefined: Self = StObject.set(x, "deviceInstanceId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setPortId(value: String): Self = StObject.set(x, "portId", value.asInstanceOf[js.Any])
    
    inline def setPortName(value: String): Self = StObject.set(x, "portName", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setUsbDriverName(value: String): Self = StObject.set(x, "usbDriverName", value.asInstanceOf[js.Any])
    
    inline def setUsbDriverNameUndefined: Self = StObject.set(x, "usbDriverName", js.undefined)
    
    inline def setVendorId(value: String): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
  }
}
