package typings.gapiDotClientDotQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeOfDayRange extends js.Object {
  /** The earliest time of day in HH:MM format. */
  var earliestTime: js.UndefOr[String] = js.undefined
  /**
    * Identifies this as a time of day range object, representing two times in a single day defining a time range. Value: the fixed string
    * qpxexpress#timeOfDayRange.
    */
  var kind: js.UndefOr[String] = js.undefined
  /** The latest time of day in HH:MM format. */
  var latestTime: js.UndefOr[String] = js.undefined
}

object TimeOfDayRange {
  @scala.inline
  def apply(earliestTime: String = null, kind: String = null, latestTime: String = null): TimeOfDayRange = {
    val __obj = js.Dynamic.literal()
    if (earliestTime != null) __obj.updateDynamic("earliestTime")(earliestTime.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (latestTime != null) __obj.updateDynamic("latestTime")(latestTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeOfDayRange]
  }
}

