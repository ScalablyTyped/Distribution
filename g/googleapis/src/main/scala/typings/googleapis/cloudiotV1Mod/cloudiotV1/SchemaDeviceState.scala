package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The device state, as reported by the device.
  */
@js.native
trait SchemaDeviceState extends js.Object {
  /**
    * The device state data.
    */
  var binaryData: js.UndefOr[String] = js.native
  /**
    * [Output only] The time at which this state version was updated in Cloud
    * IoT Core.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaDeviceState {
  @scala.inline
  def apply(): SchemaDeviceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceState]
  }
  @scala.inline
  implicit class SchemaDeviceStateOps[Self <: SchemaDeviceState] (val x: Self) extends AnyVal {
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
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
  
}

