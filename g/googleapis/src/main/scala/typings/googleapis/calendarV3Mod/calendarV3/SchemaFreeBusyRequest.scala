package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFreeBusyRequest extends js.Object {
  /**
    * Maximal number of calendars for which FreeBusy information is to be
    * provided. Optional. Maximum value is 50.
    */
  var calendarExpansionMax: js.UndefOr[Double] = js.native
  /**
    * Maximal number of calendar identifiers to be provided for a single group.
    * Optional. An error is returned for a group with more members than this
    * value. Maximum value is 100.
    */
  var groupExpansionMax: js.UndefOr[Double] = js.native
  /**
    * List of calendars and/or groups to query.
    */
  var items: js.UndefOr[js.Array[SchemaFreeBusyRequestItem]] = js.native
  /**
    * The end of the interval for the query formatted as per RFC3339.
    */
  var timeMax: js.UndefOr[String] = js.native
  /**
    * The start of the interval for the query formatted as per RFC3339.
    */
  var timeMin: js.UndefOr[String] = js.native
  /**
    * Time zone used in the response. Optional. The default is UTC.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object SchemaFreeBusyRequest {
  @scala.inline
  def apply(
    calendarExpansionMax: Int | Double = null,
    groupExpansionMax: Int | Double = null,
    items: js.Array[SchemaFreeBusyRequestItem] = null,
    timeMax: String = null,
    timeMin: String = null,
    timeZone: String = null
  ): SchemaFreeBusyRequest = {
    val __obj = js.Dynamic.literal()
    if (calendarExpansionMax != null) __obj.updateDynamic("calendarExpansionMax")(calendarExpansionMax.asInstanceOf[js.Any])
    if (groupExpansionMax != null) __obj.updateDynamic("groupExpansionMax")(groupExpansionMax.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (timeMax != null) __obj.updateDynamic("timeMax")(timeMax.asInstanceOf[js.Any])
    if (timeMin != null) __obj.updateDynamic("timeMin")(timeMin.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFreeBusyRequest]
  }
}

