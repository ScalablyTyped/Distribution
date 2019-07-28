package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Season extends js.Object {
  /** Inclusive end date of the recurrence period. */
  var end: js.UndefOr[MonthDay] = js.undefined
  /**
    * Optionally present list of prorations for the season. Each proration is a one-off discounted entry into a subscription. Each proration contains the
    * first date on which the discount is available and the new pricing information.
    */
  var prorations: js.UndefOr[js.Array[Prorate]] = js.undefined
  /** Inclusive start date of the recurrence period. */
  var start: js.UndefOr[MonthDay] = js.undefined
}

object Season {
  @scala.inline
  def apply(end: MonthDay = null, prorations: js.Array[Prorate] = null, start: MonthDay = null): Season = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (prorations != null) __obj.updateDynamic("prorations")(prorations)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Season]
  }
}

