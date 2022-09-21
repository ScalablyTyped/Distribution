package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceCompromisedSecurityDetail extends StObject {
  
  /**
    * The device compromised state. Possible values are "`Compromised`" or "`Not Compromised`".
    */
  var deviceCompromisedState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The device ID.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The model of the device.
    */
  var deviceModel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the device.
    */
  var deviceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required for iOS, empty for others.
    */
  var iosVendorId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device resource ID.
    */
  var resourceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The serial number of the device.
    */
  var serialNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeviceCompromisedSecurityDetail {
  
  inline def apply(): SchemaDeviceCompromisedSecurityDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceCompromisedSecurityDetail]
  }
  
  extension [Self <: SchemaDeviceCompromisedSecurityDetail](x: Self) {
    
    inline def setDeviceCompromisedState(value: String): Self = StObject.set(x, "deviceCompromisedState", value.asInstanceOf[js.Any])
    
    inline def setDeviceCompromisedStateNull: Self = StObject.set(x, "deviceCompromisedState", null)
    
    inline def setDeviceCompromisedStateUndefined: Self = StObject.set(x, "deviceCompromisedState", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceModel(value: String): Self = StObject.set(x, "deviceModel", value.asInstanceOf[js.Any])
    
    inline def setDeviceModelNull: Self = StObject.set(x, "deviceModel", null)
    
    inline def setDeviceModelUndefined: Self = StObject.set(x, "deviceModel", js.undefined)
    
    inline def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeNull: Self = StObject.set(x, "deviceType", null)
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
    
    inline def setIosVendorId(value: String): Self = StObject.set(x, "iosVendorId", value.asInstanceOf[js.Any])
    
    inline def setIosVendorIdNull: Self = StObject.set(x, "iosVendorId", null)
    
    inline def setIosVendorIdUndefined: Self = StObject.set(x, "iosVendorId", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdNull: Self = StObject.set(x, "resourceId", null)
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
  }
}
