package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpeningPeriod extends js.Object {
  /**
    * may contain a pair of day and time objects describing when the place closes.
    * **Note:** If a place is **always open**, the `close` section will be missing from the response.
    * Clients can rely on always-open being represented as an `open` period containing `day` with value 0
    * and `time` with value 0000, and no `close`.
    */
  var close: js.UndefOr[OpeningHoursTime] = js.undefined
  /** contains a pair of day and time objects describing when the place opens. */
  var open: OpeningHoursTime
}

object OpeningPeriod {
  @scala.inline
  def apply(open: OpeningHoursTime, close: OpeningHoursTime = null): OpeningPeriod = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpeningPeriod]
  }
}

