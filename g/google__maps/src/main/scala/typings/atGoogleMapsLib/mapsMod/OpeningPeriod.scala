package typings
package atGoogleMapsLib.mapsMod

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
  /**
    * is an array of seven strings representing the formatted opening hours for each day of the week.
    * If a `language` parameter was specified in the Place Details request, the Places Service will format
    * and localize the opening hours appropriately for that language. The ordering of the elements in this array
    * depends on the `language` parameter. Some languages start the week on Monday while others start on Sunday.
    */
  var weekday_text: js.Array[java.lang.String]
}

