package typings
package falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends Sentinel {
  @JSName("$type")
  var $type: falcorDashJsonDashGraphLib.falcorDashJsonDashGraphLibStrings.reference
  var value: Path
}

object Reference {
  @scala.inline
  def apply(
    $type: falcorDashJsonDashGraphLib.falcorDashJsonDashGraphLibStrings.reference,
    value: Path,
    $expires: scala.Int | scala.Double = null
  ): Reference = {
    val __obj = js.Dynamic.literal($type = $type, value = value)
    if ($expires != null) __obj.updateDynamic("$expires")($expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
}

