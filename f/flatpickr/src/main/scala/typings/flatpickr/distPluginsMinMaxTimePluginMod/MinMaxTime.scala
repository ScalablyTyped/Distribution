package typings.flatpickr.distPluginsMinMaxTimePluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinMaxTime extends js.Object {
  var maxTime: js.UndefOr[String] = js.undefined
  var minTime: js.UndefOr[String] = js.undefined
}

object MinMaxTime {
  @scala.inline
  def apply(maxTime: String = null, minTime: String = null): MinMaxTime = {
    val __obj = js.Dynamic.literal()
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinMaxTime]
  }
}

