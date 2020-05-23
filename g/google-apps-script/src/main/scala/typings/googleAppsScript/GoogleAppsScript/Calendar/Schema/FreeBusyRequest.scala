package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyRequest extends js.Object {
  var calendarExpansionMax: js.UndefOr[Double] = js.undefined
  var groupExpansionMax: js.UndefOr[Double] = js.undefined
  var items: js.UndefOr[js.Array[FreeBusyRequestItem]] = js.undefined
  var timeMax: js.UndefOr[String] = js.undefined
  var timeMin: js.UndefOr[String] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
}

object FreeBusyRequest {
  @scala.inline
  def apply(
    calendarExpansionMax: js.UndefOr[Double] = js.undefined,
    groupExpansionMax: js.UndefOr[Double] = js.undefined,
    items: js.Array[FreeBusyRequestItem] = null,
    timeMax: String = null,
    timeMin: String = null,
    timeZone: String = null
  ): FreeBusyRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calendarExpansionMax)) __obj.updateDynamic("calendarExpansionMax")(calendarExpansionMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupExpansionMax)) __obj.updateDynamic("groupExpansionMax")(groupExpansionMax.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (timeMax != null) __obj.updateDynamic("timeMax")(timeMax.asInstanceOf[js.Any])
    if (timeMin != null) __obj.updateDynamic("timeMin")(timeMin.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusyRequest]
  }
}

