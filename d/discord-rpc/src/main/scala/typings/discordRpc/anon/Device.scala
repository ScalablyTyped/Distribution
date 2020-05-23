package typings.discordRpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var device: String
  var volume: Double
}

object Device {
  @scala.inline
  def apply(device: String, volume: Double): Device = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

