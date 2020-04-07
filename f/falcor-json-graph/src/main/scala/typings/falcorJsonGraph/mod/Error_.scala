package typings.falcorJsonGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error_ extends Sentinel {
  @JSName("$type")
  var $type: typings.falcorJsonGraph.falcorJsonGraphStrings.error
  var value: js.Any
}

object Error_ {
  @scala.inline
  def apply(
    $type: typings.falcorJsonGraph.falcorJsonGraphStrings.error,
    value: js.Any,
    $expires: Int | Double = null
  ): Error_ = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if ($expires != null) __obj.updateDynamic("$expires")($expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error_]
  }
}

