package typings.gapiDotClientDotCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyCloudToDeviceConfigRequest extends js.Object {
  /** The configuration data for the device. */
  var binaryData: js.UndefOr[String] = js.undefined
  /**
    * The version number to update. If this value is zero, it will not check the
    * version number of the server and will always update the current version;
    * otherwise, this update will fail if the version number found on the server
    * does not match this version number. This is used to support multiple
    * simultaneous updates without losing data.
    */
  var versionToUpdate: js.UndefOr[String] = js.undefined
}

object ModifyCloudToDeviceConfigRequest {
  @scala.inline
  def apply(binaryData: String = null, versionToUpdate: String = null): ModifyCloudToDeviceConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (binaryData != null) __obj.updateDynamic("binaryData")(binaryData.asInstanceOf[js.Any])
    if (versionToUpdate != null) __obj.updateDynamic("versionToUpdate")(versionToUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCloudToDeviceConfigRequest]
  }
}

