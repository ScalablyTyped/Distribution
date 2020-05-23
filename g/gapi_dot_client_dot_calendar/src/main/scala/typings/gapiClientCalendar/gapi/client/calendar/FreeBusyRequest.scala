package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyRequest extends js.Object {
  /** Maximal number of calendars for which FreeBusy information is to be provided. Optional. Maximum value is 50. */
  var calendarExpansionMax: js.UndefOr[Double] = js.undefined
  /**
    * Maximal number of calendar identifiers to be provided for a single group. Optional. An error is returned for a group with more members than this value.
    * Maximum value is 100.
    */
  var groupExpansionMax: js.UndefOr[Double] = js.undefined
  /** List of calendars and/or groups to query. */
  var items: js.UndefOr[js.Array[FreeBusyRequestItem]] = js.undefined
  /** The end of the interval for the query formatted as per RFC3339. */
  var timeMax: js.UndefOr[String] = js.undefined
  /** The start of the interval for the query formatted as per RFC3339. */
  var timeMin: js.UndefOr[String] = js.undefined
  /** Time zone used in the response. Optional. The default is UTC. */
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

