package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

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

