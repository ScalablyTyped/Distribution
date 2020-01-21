package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for `SendCommandToDevice`.
  */
@js.native
trait SchemaSendCommandToDeviceRequest extends js.Object {
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
  def apply(binaryData: String = null, subfolder: String = null): SchemaSendCommandToDeviceRequest = {
    val __obj = js.Dynamic.literal()
    if (binaryData != null) __obj.updateDynamic("binaryData")(binaryData.asInstanceOf[js.Any])
    if (subfolder != null) __obj.updateDynamic("subfolder")(subfolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSendCommandToDeviceRequest]
  }
}

