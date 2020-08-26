package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The device configuration. Eventually delivered to devices.
  */
@js.native
trait SchemaDeviceConfig extends js.Object {
  /**
    * The device configuration data.
    */
  var binaryData: js.UndefOr[String] = js.native
  /**
    * [Output only] The time at which this configuration version was updated in
    * Cloud IoT Core. This timestamp is set by the server.
    */
  var cloudUpdateTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The time at which Cloud IoT Core received the
    * acknowledgment from the device, indicating that the device has received
    * this configuration version. If this field is not present, the device has
    * not yet acknowledged that it received this version. Note that when the
    * config was sent to the device, many config versions may have been
    * available in Cloud IoT Core while the device was disconnected, and on
    * connection, only the latest version is sent to the device. Some versions
    * may never be sent to the device, and therefore are never acknowledged.
    * This timestamp is set by Cloud IoT Core.
    */
  var deviceAckTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The version of this update. The version number is assigned
    * by the server, and is always greater than 0 after device creation. The
    * version must be 0 on the `CreateDevice` request if a `config` is
    * specified; the response of `CreateDevice` will always have a value of 1.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaDeviceConfig {
  @scala.inline
  def apply(): SchemaDeviceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceConfig]
  }
  @scala.inline
  implicit class SchemaDeviceConfigOps[Self <: SchemaDeviceConfig] (val x: Self) extends AnyVal {
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
    def setCloudUpdateTime(value: String): Self = this.set("cloudUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudUpdateTime: Self = this.set("cloudUpdateTime", js.undefined)
    @scala.inline
    def setDeviceAckTime(value: String): Self = this.set("deviceAckTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceAckTime: Self = this.set("deviceAckTime", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

