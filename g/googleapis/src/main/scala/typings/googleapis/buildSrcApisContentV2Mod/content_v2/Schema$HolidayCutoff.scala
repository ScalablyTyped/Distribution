package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$HolidayCutoff extends js.Object {
  /**
    * Date of the order deadline, in ISO 8601 format. E.g.
    * &quot;2016-11-29&quot; for 29th November 2016. Required.
    */
  var deadlineDate: js.UndefOr[String] = js.native
  /**
    * Hour of the day on the deadline date until which the order has to be
    * placed to qualify for the delivery guarantee. Possible values are: 0
    * (midnight), 1, ..., 12 (noon), 13, ..., 23. Required.
    */
  var deadlineHour: js.UndefOr[Double] = js.native
  /**
    * Timezone identifier for the deadline hour. A list of identifiers can be
    * found in  the AdWords API documentation. E.g. &quot;Europe/Zurich&quot;.
    * Required.
    */
  var deadlineTimezone: js.UndefOr[String] = js.native
  /**
    * Unique identifier for the holiday. Required.
    */
  var holidayId: js.UndefOr[String] = js.native
  /**
    * Date on which the deadline will become visible to consumers in ISO 8601
    * format. E.g. &quot;2016-10-31&quot; for 31st October 2016. Required.
    */
  var visibleFromDate: js.UndefOr[String] = js.native
}

object Schema$HolidayCutoff {
  @scala.inline
  def apply(
    deadlineDate: String = null,
    deadlineHour: Int | Double = null,
    deadlineTimezone: String = null,
    holidayId: String = null,
    visibleFromDate: String = null
  ): Schema$HolidayCutoff = {
    val __obj = js.Dynamic.literal()
    if (deadlineDate != null) __obj.updateDynamic("deadlineDate")(deadlineDate.asInstanceOf[js.Any])
    if (deadlineHour != null) __obj.updateDynamic("deadlineHour")(deadlineHour.asInstanceOf[js.Any])
    if (deadlineTimezone != null) __obj.updateDynamic("deadlineTimezone")(deadlineTimezone.asInstanceOf[js.Any])
    if (holidayId != null) __obj.updateDynamic("holidayId")(holidayId.asInstanceOf[js.Any])
    if (visibleFromDate != null) __obj.updateDynamic("visibleFromDate")(visibleFromDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HolidayCutoff]
  }
}

