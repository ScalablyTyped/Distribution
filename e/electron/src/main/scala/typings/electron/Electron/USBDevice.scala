package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBDevice extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/usb-device
  /**
    * The device class for the communication interface supported by the device
    */
  var deviceClass: Double
  
  /**
    * Unique identifier for the device.
    */
  var deviceId: String
  
  /**
    * The device protocol for the communication interface supported by the device
    */
  var deviceProtocol: Double
  
  /**
    * The device subclass for the communication interface supported by the device
    */
  var deviceSubclass: Double
  
  /**
    * The major version number of the device as defined by the device manufacturer.
    */
  var deviceVersionMajor: Double
  
  /**
    * The minor version number of the device as defined by the device manufacturer.
    */
  var deviceVersionMinor: Double
  
  /**
    * The subminor version number of the device as defined by the device manufacturer.
    */
  var deviceVersionSubminor: Double
  
  /**
    * The manufacturer name of the device.
    */
  var manufacturerName: js.UndefOr[String] = js.undefined
  
  /**
    * The USB product ID.
    */
  var productId: Double
  
  /**
    * Name of the device.
    */
  var productName: js.UndefOr[String] = js.undefined
  
  /**
    * The USB device serial number.
    */
  var serialNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The USB protocol major version supported by the device
    */
  var usbVersionMajor: Double
  
  /**
    * The USB protocol minor version supported by the device
    */
  var usbVersionMinor: Double
  
  /**
    * The USB protocol subminor version supported by the device
    */
  var usbVersionSubminor: Double
  
  /**
    * The USB vendor ID.
    */
  var vendorId: Double
}
object USBDevice {
  
  inline def apply(
    deviceClass: Double,
    deviceId: String,
    deviceProtocol: Double,
    deviceSubclass: Double,
    deviceVersionMajor: Double,
    deviceVersionMinor: Double,
    deviceVersionSubminor: Double,
    productId: Double,
    usbVersionMajor: Double,
    usbVersionMinor: Double,
    usbVersionSubminor: Double,
    vendorId: Double
  ): USBDevice = {
    val __obj = js.Dynamic.literal(deviceClass = deviceClass.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceProtocol = deviceProtocol.asInstanceOf[js.Any], deviceSubclass = deviceSubclass.asInstanceOf[js.Any], deviceVersionMajor = deviceVersionMajor.asInstanceOf[js.Any], deviceVersionMinor = deviceVersionMinor.asInstanceOf[js.Any], deviceVersionSubminor = deviceVersionSubminor.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], usbVersionMajor = usbVersionMajor.asInstanceOf[js.Any], usbVersionMinor = usbVersionMinor.asInstanceOf[js.Any], usbVersionSubminor = usbVersionSubminor.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: USBDevice] (val x: Self) extends AnyVal {
    
    inline def setDeviceClass(value: Double): Self = StObject.set(x, "deviceClass", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceProtocol(value: Double): Self = StObject.set(x, "deviceProtocol", value.asInstanceOf[js.Any])
    
    inline def setDeviceSubclass(value: Double): Self = StObject.set(x, "deviceSubclass", value.asInstanceOf[js.Any])
    
    inline def setDeviceVersionMajor(value: Double): Self = StObject.set(x, "deviceVersionMajor", value.asInstanceOf[js.Any])
    
    inline def setDeviceVersionMinor(value: Double): Self = StObject.set(x, "deviceVersionMinor", value.asInstanceOf[js.Any])
    
    inline def setDeviceVersionSubminor(value: Double): Self = StObject.set(x, "deviceVersionSubminor", value.asInstanceOf[js.Any])
    
    inline def setManufacturerName(value: String): Self = StObject.set(x, "manufacturerName", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNameUndefined: Self = StObject.set(x, "manufacturerName", js.undefined)
    
    inline def setProductId(value: Double): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setUsbVersionMajor(value: Double): Self = StObject.set(x, "usbVersionMajor", value.asInstanceOf[js.Any])
    
    inline def setUsbVersionMinor(value: Double): Self = StObject.set(x, "usbVersionMinor", value.asInstanceOf[js.Any])
    
    inline def setUsbVersionSubminor(value: Double): Self = StObject.set(x, "usbVersionSubminor", value.asInstanceOf[js.Any])
    
    inline def setVendorId(value: Double): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
  }
}
