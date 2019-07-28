package typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod

import typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphStrings.reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends Sentinel {
  @JSName("$type")
  var $type: reference
  var value: Path
}

object Reference {
  @scala.inline
  def apply($type: reference, value: Path, $expires: Int | Double = null): Reference = {
    val __obj = js.Dynamic.literal($type = $type, value = value)
    if ($expires != null) __obj.updateDynamic("$expires")($expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
}

