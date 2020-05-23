package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeOfDay extends js.Object {
  /**
    * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
    * to allow the value "24:00:00" for scenarios like business closing time.
    */
  var hours: js.UndefOr[Double] = js.undefined
  /** Minutes of hour of day. Must be from 0 to 59. */
  var minutes: js.UndefOr[Double] = js.undefined
  /** Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999. */
  var nanos: js.UndefOr[Double] = js.undefined
  /**
    * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
    * allow the value 60 if it allows leap-seconds.
    */
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

