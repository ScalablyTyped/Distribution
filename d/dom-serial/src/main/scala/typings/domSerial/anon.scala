package typings.domSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<dom-serial.SerialPortInfo> */
  @js.native
  trait PartialSerialPortInfo extends StObject {
    
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
    implicit class PartialSerialPortInfoMutableBuilder[Self <: PartialSerialPortInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
      
      @scala.inline
      def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
      
      @scala.inline
      def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
      
      @scala.inline
      def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      @scala.inline
      def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
      
      @scala.inline
      def setUsbProductId(value: Double): Self = StObject.set(x, "usbProductId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsbProductIdUndefined: Self = StObject.set(x, "usbProductId", js.undefined)
      
      @scala.inline
      def setUsbVendorId(value: Double): Self = StObject.set(x, "usbVendorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsbVendorIdUndefined: Self = StObject.set(x, "usbVendorId", js.undefined)
      
      @scala.inline
      def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVendorId(value: String): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVendorIdUndefined: Self = StObject.set(x, "vendorId", js.undefined)
      
      @scala.inline
      def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    }
  }
}
