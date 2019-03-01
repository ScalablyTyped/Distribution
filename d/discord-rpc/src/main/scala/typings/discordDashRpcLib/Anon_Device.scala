package typings
package discordDashRpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Device extends js.Object {
  var device: java.lang.String
  var volume: scala.Double
}

object Anon_Device {
  @scala.inline
  def apply(device: java.lang.String, volume: scala.Double): Anon_Device = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("device")(device)
    __obj.updateDynamic("volume")(volume)
    __obj.asInstanceOf[Anon_Device]
  }
}

