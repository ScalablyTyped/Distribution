package typings
package falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sentinel extends js.Object {
  @JSName("$expires")
  var $expires: js.UndefOr[scala.Double] = js.undefined
}

object Sentinel {
  @scala.inline
  def apply($expires: scala.Int | scala.Double = null): Sentinel = {
    val __obj = js.Dynamic.literal()
    if ($expires != null) __obj.updateDynamic("$expires")($expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sentinel]
  }
}

