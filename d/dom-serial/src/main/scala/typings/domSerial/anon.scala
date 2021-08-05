package typings.domSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<dom-serial.SerialPortInfo> */
  trait PartialSerialPortInfo extends StObject {
    
    var locationId: js.UndefOr[String] = js.undefined
    
    var manufacturer: js.UndefOr[String] = js.undefined
    
    var product: js.UndefOr[String] = js.undefined
    
    var productId: js.UndefOr[String] = js.undefined
    
    var serialNumber: js.UndefOr[String] = js.undefined
    
    var usbProductId: js.UndefOr[Double] = js.undefined
    
    var usbVendorId: js.UndefOr[Double] = js.undefined
    
    var vendor: js.UndefOr[String] = js.undefined
    
    var vendorId: js.UndefOr[String] = js.undefined
  }
  object PartialSerialPortInfo {
    
    inline def apply(): PartialSerialPortInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSerialPortInfo]
    }
    
    extension [Self <: PartialSerialPortInfo](x: Self) {
      
      inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
      
      inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
      
      inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
      
      inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
      
      inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
      
      inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
      
      inline def setUsbProductId(value: Double): Self = StObject.set(x, "usbProductId", value.asInstanceOf[js.Any])
      
      inline def setUsbProductIdUndefined: Self = StObject.set(x, "usbProductId", js.undefined)
      
      inline def setUsbVendorId(value: Double): Self = StObject.set(x, "usbVendorId", value.asInstanceOf[js.Any])
      
      inline def setUsbVendorIdUndefined: Self = StObject.set(x, "usbVendorId", js.undefined)
      
      inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setVendorId(value: String): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
      
      inline def setVendorIdUndefined: Self = StObject.set(x, "vendorId", js.undefined)
      
      inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    }
  }
}
