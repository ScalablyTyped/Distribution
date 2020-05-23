package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeOfDay extends js.Object {
  var hours: js.UndefOr[Double] = js.undefined
  var minutes: js.UndefOr[Double] = js.undefined
  var nanos: js.UndefOr[Double] = js.undefined
  var seconds: js.UndefOr[Double] = js.undefined
}

object TimeOfDay {
  @scala.inline
  def apply(
    hours: js.UndefOr[Double] = js.undefined,
    minutes: js.UndefOr[Double] = js.undefined,
    nanos: js.UndefOr[Double] = js.undefined,
    seconds: js.UndefOr[Double] = js.undefined
  ): TimeOfDay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hours)) __obj.updateDynamic("hours")(hours.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minutes)) __obj.updateDynamic("minutes")(minutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nanos)) __obj.updateDynamic("nanos")(nanos.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seconds)) __obj.updateDynamic("seconds")(seconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeOfDay]
  }
}

