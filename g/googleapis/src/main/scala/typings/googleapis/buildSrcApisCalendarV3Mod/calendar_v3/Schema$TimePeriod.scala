package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TimePeriod extends js.Object {
  /**
    * The (exclusive) end of the time period.
    */
  var end: js.UndefOr[String] = js.native
  /**
    * The (inclusive) start of the time period.
    */
  var start: js.UndefOr[String] = js.native
}

object Schema$TimePeriod {
  @scala.inline
  def apply(end: String = null, start: String = null): Schema$TimePeriod = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TimePeriod]
  }
}

