package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceId extends js.Object {
  var DeviceId: String
  var DeviceName: String
  var DeviceSize: String
}

object DeviceId {
  @scala.inline
  def apply(DeviceId: String, DeviceName: String, DeviceSize: String): DeviceId = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any], DeviceSize = DeviceSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceId]
  }
}

