package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListListParameters extends js.Object {
  var maxResults: js.UndefOr[integer] = js.undefined
  // The minimum access role for the user in the returned entries. Optional. The default is no restriction. Acceptable values are:
  var minAccessRole: js.UndefOr[AccessRoleWithoutNone] = js.undefined
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  var showDeleted: js.UndefOr[scala.Boolean] = js.undefined
  var showHidden: js.UndefOr[scala.Boolean] = js.undefined
  var syncToken: js.UndefOr[java.lang.String] = js.undefined
}

object CalendarListListParameters {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[integer] = js.undefined,
    minAccessRole: AccessRoleWithoutNone = null,
    pageToken: java.lang.String = null,
    showDeleted: js.UndefOr[scala.Boolean] = js.undefined,
    showHidden: js.UndefOr[scala.Boolean] = js.undefined,
    syncToken: java.lang.String = null
  ): CalendarListListParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (minAccessRole != null) __obj.updateDynamic("minAccessRole")(minAccessRole)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(showDeleted)) __obj.updateDynamic("showDeleted")(showDeleted)
    if (!js.isUndefined(showHidden)) __obj.updateDynamic("showHidden")(showHidden)
    if (syncToken != null) __obj.updateDynamic("syncToken")(syncToken)
    __obj.asInstanceOf[CalendarListListParameters]
  }
}

