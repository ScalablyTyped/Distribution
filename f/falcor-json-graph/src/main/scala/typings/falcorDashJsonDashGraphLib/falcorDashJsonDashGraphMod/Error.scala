package typings
package falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends Sentinel {
  @JSName("$type")
  var $type: falcorDashJsonDashGraphLib.falcorDashJsonDashGraphLibStrings.error
  var value: js.Any
}

object Error {
  @scala.inline
  def apply(
    $type: falcorDashJsonDashGraphLib.falcorDashJsonDashGraphLibStrings.error,
    value: js.Any,
    $expires: scala.Int | scala.Double = null
  ): Error = {
    val __obj = js.Dynamic.literal($type = $type, value = value)
    if ($expires != null) __obj.updateDynamic("$expires")($expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

