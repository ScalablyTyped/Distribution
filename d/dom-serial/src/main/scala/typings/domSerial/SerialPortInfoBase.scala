package typings.domSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialPortInfoBase extends StObject {
  
  var locationId: String
  
  var manufacturer: String
  
  var product: String
  
  var productId: String
  
  var serialNumber: String
  
  var vendor: String
  
  var vendorId: String
}
object SerialPortInfoBase {
  
  inline def apply(
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
  
  extension [Self <: SerialPortInfoBase](x: Self) {
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorId(value: String): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
  }
}
