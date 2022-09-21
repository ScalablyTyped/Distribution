package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1NetworkDevice extends StObject {
  
  /**
    * Output only. The integrated circuit card ID associated with the device's sim card.
    */
  var iccid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. IMEI (if applicable) of the corresponding network device.
    */
  var imei: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. MAC address (if applicable) of the corresponding network device.
    */
  var macAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The mobile directory number associated with the device's sim card.
    */
  var mdn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. MEID (if applicable) of the corresponding network device.
    */
  var meid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Network device type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1NetworkDevice {
  
  inline def apply(): SchemaGoogleChromeManagementV1NetworkDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1NetworkDevice]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1NetworkDevice](x: Self) {
    
    inline def setIccid(value: String): Self = StObject.set(x, "iccid", value.asInstanceOf[js.Any])
    
    inline def setIccidNull: Self = StObject.set(x, "iccid", null)
    
    inline def setIccidUndefined: Self = StObject.set(x, "iccid", js.undefined)
    
    inline def setImei(value: String): Self = StObject.set(x, "imei", value.asInstanceOf[js.Any])
    
    inline def setImeiNull: Self = StObject.set(x, "imei", null)
    
    inline def setImeiUndefined: Self = StObject.set(x, "imei", js.undefined)
    
    inline def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    inline def setMacAddressNull: Self = StObject.set(x, "macAddress", null)
    
    inline def setMacAddressUndefined: Self = StObject.set(x, "macAddress", js.undefined)
    
    inline def setMdn(value: String): Self = StObject.set(x, "mdn", value.asInstanceOf[js.Any])
    
    inline def setMdnNull: Self = StObject.set(x, "mdn", null)
    
    inline def setMdnUndefined: Self = StObject.set(x, "mdn", js.undefined)
    
    inline def setMeid(value: String): Self = StObject.set(x, "meid", value.asInstanceOf[js.Any])
    
    inline def setMeidNull: Self = StObject.set(x, "meid", null)
    
    inline def setMeidUndefined: Self = StObject.set(x, "meid", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
