package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPerDeviceStatusInBatch extends StObject {
  
  /**
    * If processing succeeds, the device ID of the device.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If processing fails, the error type.
    */
  var errorIdentifier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If processing fails, a developer message explaining what went wrong.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The result status of the device after processing.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaPerDeviceStatusInBatch {
  
  inline def apply(): SchemaPerDeviceStatusInBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerDeviceStatusInBatch]
  }
  
  extension [Self <: SchemaPerDeviceStatusInBatch](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setErrorIdentifier(value: String): Self = StObject.set(x, "errorIdentifier", value.asInstanceOf[js.Any])
    
    inline def setErrorIdentifierNull: Self = StObject.set(x, "errorIdentifier", null)
    
    inline def setErrorIdentifierUndefined: Self = StObject.set(x, "errorIdentifier", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
