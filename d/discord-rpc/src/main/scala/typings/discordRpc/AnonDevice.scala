package typings.discordRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDevice extends js.Object {
  var device: String
  var volume: Double
}

object AnonDevice {
  @scala.inline
  def apply(device: String, volume: Double): AnonDevice = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDevice]
  }
}

