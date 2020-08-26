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
  def apply(): SchemaSendCommandToDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSendCommandToDeviceRequest]
  }
  @scala.inline
  implicit class SchemaSendCommandToDeviceRequestOps[Self <: SchemaSendCommandToDeviceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBinaryData(value: String): Self = this.set("binaryData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryData: Self = this.set("binaryData", js.undefined)
    @scala.inline
    def setSubfolder(value: String): Self = this.set("subfolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubfolder: Self = this.set("subfolder", js.undefined)
  }
  
}

