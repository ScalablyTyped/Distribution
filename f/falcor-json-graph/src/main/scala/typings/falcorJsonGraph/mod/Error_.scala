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
    $expires: js.UndefOr[Double] = js.undefined
  ): Error_ = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined($expires)) __obj.updateDynamic("$expires")($expires.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error_]
  }
}

