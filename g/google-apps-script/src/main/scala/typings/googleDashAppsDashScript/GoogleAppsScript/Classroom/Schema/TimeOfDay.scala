package typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema

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
    hours: Int | Double = null,
    minutes: Int | Double = null,
    nanos: Int | Double = null,
    seconds: Int | Double = null
  ): TimeOfDay = {
    val __obj = js.Dynamic.literal()
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (nanos != null) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeOfDay]
  }
}

