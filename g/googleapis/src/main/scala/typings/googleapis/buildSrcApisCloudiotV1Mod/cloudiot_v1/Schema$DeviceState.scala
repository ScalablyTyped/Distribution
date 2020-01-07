package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The device state, as reported by the device.
  */
@js.native
trait Schema$DeviceState extends js.Object {
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

object Schema$DeviceState {
  @scala.inline
  def apply(binaryData: String = null, updateTime: String = null): Schema$DeviceState = {
    val __obj = js.Dynamic.literal()
    if (binaryData != null) __obj.updateDynamic("binaryData")(binaryData.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeviceState]
  }
}

