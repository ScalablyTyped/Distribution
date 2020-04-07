package typings.falcorJsonGraph.mod

import typings.falcorJsonGraph.falcorJsonGraphStrings.reference
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
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if ($expires != null) __obj.updateDynamic("$expires")($expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
}

