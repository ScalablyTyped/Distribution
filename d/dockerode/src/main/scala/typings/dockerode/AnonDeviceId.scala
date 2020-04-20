package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeviceId extends js.Object {
  var DeviceId: String
  var DeviceName: String
  var DeviceSize: String
}

object AnonDeviceId {
  @scala.inline
  def apply(DeviceId: String, DeviceName: String, DeviceSize: String): AnonDeviceId = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any], DeviceSize = DeviceSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeviceId]
  }
}

