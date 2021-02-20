package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for `SendCommandToDevice`.
  */
@js.native
trait SchemaSendCommandToDeviceRequest extends StObject {
  
  /**
    * The command data to send to the device.
    */
  var binaryData: js.UndefOr[String] = js.native
  
  /**
    * Optional subfolder for the command. If empty, the command will be
    * delivered to the /devices/{device-id}/commands topic, otherwise it will
    * be delivered to the /devices/{device-id}/commands/{subfolder} topic.
    * Multi-level subfolders are allowed. This field must not have more than
    * 256 characters, and must not contain any MQTT wildcards (&quot;+&quot; or
    * &quot;#&quot;) or null characters.
    */
  var subfolder: js.UndefOr[String] = js.native
}
object SchemaSendCommandToDeviceRequest {
  
  @scala.inline
  def apply(): SchemaSendCommandToDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSendCommandToDeviceRequest]
  }
  
  @scala.inline
  implicit class SchemaSendCommandToDeviceRequestMutableBuilder[Self <: SchemaSendCommandToDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryData(value: String): Self = StObject.set(x, "binaryData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryDataUndefined: Self = StObject.set(x, "binaryData", js.undefined)
    
    @scala.inline
    def setSubfolder(value: String): Self = StObject.set(x, "subfolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubfolderUndefined: Self = StObject.set(x, "subfolder", js.undefined)
  }
}
