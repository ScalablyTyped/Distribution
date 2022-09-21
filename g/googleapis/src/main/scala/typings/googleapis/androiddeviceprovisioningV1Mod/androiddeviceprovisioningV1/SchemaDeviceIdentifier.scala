package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceIdentifier extends StObject {
  
  /**
    * The device’s IMEI number. Validated on input.
    */
  var imei: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device manufacturer’s name. Matches the device's built-in value returned from `android.os.Build.MANUFACTURER`. Allowed values are listed in [manufacturers](/zero-touch/resources/manufacturer-names#manufacturers-names).
    */
  var manufacturer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device’s MEID number.
    */
  var meid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device model's name. Matches the device's built-in value returned from `android.os.Build.MODEL`. Allowed values are listed in [models](/zero-touch/resources/manufacturer-names#model-names).
    */
  var model: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The manufacturer's serial number for the device. This value might not be unique across different device models.
    */
  var serialNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeviceIdentifier {
  
  inline def apply(): SchemaDeviceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceIdentifier]
  }
  
  extension [Self <: SchemaDeviceIdentifier](x: Self) {
    
    inline def setImei(value: String): Self = StObject.set(x, "imei", value.asInstanceOf[js.Any])
    
    inline def setImeiNull: Self = StObject.set(x, "imei", null)
    
    inline def setImeiUndefined: Self = StObject.set(x, "imei", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNull: Self = StObject.set(x, "manufacturer", null)
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setMeid(value: String): Self = StObject.set(x, "meid", value.asInstanceOf[js.Any])
    
    inline def setMeidNull: Self = StObject.set(x, "meid", null)
    
    inline def setMeidUndefined: Self = StObject.set(x, "meid", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
  }
}
