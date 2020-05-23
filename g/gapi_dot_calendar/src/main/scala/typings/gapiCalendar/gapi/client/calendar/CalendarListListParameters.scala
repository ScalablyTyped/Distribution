package typings.gapiCalendar.gapi.client.calendar

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
    maxResults: js.UndefOr[integer] = js.undefined,
    minAccessRole: AccessRoleWithoutNone = null,
    pageToken: String = null,
    showDeleted: js.UndefOr[Boolean] = js.undefined,
    showHidden: js.UndefOr[Boolean] = js.undefined,
    syncToken: String = null
  ): CalendarListListParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (minAccessRole != null) __obj.updateDynamic("minAccessRole")(minAccessRole.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(showDeleted)) __obj.updateDynamic("showDeleted")(showDeleted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHidden)) __obj.updateDynamic("showHidden")(showHidden.get.asInstanceOf[js.Any])
    if (syncToken != null) __obj.updateDynamic("syncToken")(syncToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarListListParameters]
  }
}

