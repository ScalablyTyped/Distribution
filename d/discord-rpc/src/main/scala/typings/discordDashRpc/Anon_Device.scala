package typings.discordDashRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Device extends js.Object {
  var device: String
  var volume: Double
}

object Anon_Device {
  @scala.inline
  def apply(device: String, volume: Double): Anon_Device = {
    val __obj = js.Dynamic.literal(device = device, volume = volume)
  
    __obj.asInstanceOf[Anon_Device]
  }
}

