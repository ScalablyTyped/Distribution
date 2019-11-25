package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceId extends js.Object {
  var DeviceId: String
  var DeviceName: String
  var DeviceSize: String
}

object Anon_DeviceId {
  @scala.inline
  def apply(DeviceId: String, DeviceName: String, DeviceSize: String): Anon_DeviceId = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any], DeviceSize = DeviceSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DeviceId]
  }
}

