package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSendCommandToDeviceRequest extends StObject {
  
  /**
    * Required. The command data to send to the device.
    */
  var binaryData: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional subfolder for the command. If empty, the command will be delivered to the /devices/{device-id\}/commands topic, otherwise it will be delivered to the /devices/{device-id\}/commands/{subfolder\} topic. Multi-level subfolders are allowed. This field must not have more than 256 characters, and must not contain any MQTT wildcards ("+" or "#") or null characters.
    */
  var subfolder: js.UndefOr[String | Null] = js.undefined
}
object SchemaSendCommandToDeviceRequest {
  
  inline def apply(): SchemaSendCommandToDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSendCommandToDeviceRequest]
  }
  
  extension [Self <: SchemaSendCommandToDeviceRequest](x: Self) {
    
    inline def setBinaryData(value: String): Self = StObject.set(x, "binaryData", value.asInstanceOf[js.Any])
    
    inline def setBinaryDataNull: Self = StObject.set(x, "binaryData", null)
    
    inline def setBinaryDataUndefined: Self = StObject.set(x, "binaryData", js.undefined)
    
    inline def setSubfolder(value: String): Self = StObject.set(x, "subfolder", value.asInstanceOf[js.Any])
    
    inline def setSubfolderNull: Self = StObject.set(x, "subfolder", null)
    
    inline def setSubfolderUndefined: Self = StObject.set(x, "subfolder", js.undefined)
  }
}
