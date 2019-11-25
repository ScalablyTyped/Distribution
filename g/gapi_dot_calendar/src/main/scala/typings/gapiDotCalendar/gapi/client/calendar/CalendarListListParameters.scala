package typings.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListListParameters extends js.Object {
  var maxResults: js.UndefOr[integer] = js.undefined
  // The minimum access role for the user in the returned entries. Optional. The default is no restriction. Acceptable values are:
  var minAccessRole: js.UndefOr[AccessRoleWithoutNone] = js.undefined
  var pageToken: js.UndefOr[String] = js.undefined
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  var showHidden: js.UndefOr[Boolean] = js.undefined
  var syncToken: js.UndefOr[String] = js.undefined
}

object CalendarListListParameters {
  @scala.inline
  def apply(
    maxResults: Int | Double = null,
    minAccessRole: AccessRoleWithoutNone = null,
    pageToken: String = null,
    showDeleted: js.UndefOr[Boolean] = js.undefined,
    showHidden: js.UndefOr[Boolean] = js.undefined,
    syncToken: String = null
  ): CalendarListListParameters = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (minAccessRole != null) __obj.updateDynamic("minAccessRole")(minAccessRole.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(showDeleted)) __obj.updateDynamic("showDeleted")(showDeleted.asInstanceOf[js.Any])
    if (!js.isUndefined(showHidden)) __obj.updateDynamic("showHidden")(showHidden.asInstanceOf[js.Any])
    if (syncToken != null) __obj.updateDynamic("syncToken")(syncToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarListListParameters]
  }
}

