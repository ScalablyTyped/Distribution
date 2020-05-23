package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsListParameters extends js.Object {
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined
  var calendarId: String
  var iCalUID: js.UndefOr[String] = js.undefined
  var maxAttendees: js.UndefOr[integer] = js.undefined
  var maxResults: js.UndefOr[integer] = js.undefined
  var orderBy: js.UndefOr[EventsOrder] = js.undefined
  var pageToken: js.UndefOr[String] = js.undefined
  var privateExtendedProperty: js.UndefOr[String] = js.undefined
  var q: js.UndefOr[String] = js.undefined
  var sharedExtendedProperty: js.UndefOr[String] = js.undefined
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  var showHiddenInvitations: js.UndefOr[Boolean] = js.undefined
  var singleEvents: js.UndefOr[Boolean] = js.undefined
  var syncToken: js.UndefOr[SyncToken] = js.undefined
  var timeMax: js.UndefOr[datetime] = js.undefined
  var timeMin: js.UndefOr[datetime] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
  var updatedMin: js.UndefOr[datetime] = js.undefined
}

object EventsListParameters {
  @scala.inline
  def apply(
    calendarId: String,
    alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined,
    iCalUID: String = null,
    maxAttendees: js.UndefOr[integer] = js.undefined,
    maxResults: js.UndefOr[integer] = js.undefined,
    orderBy: EventsOrder = null,
    pageToken: String = null,
    privateExtendedProperty: String = null,
    q: String = null,
    sharedExtendedProperty: String = null,
    showDeleted: js.UndefOr[Boolean] = js.undefined,
    showHiddenInvitations: js.UndefOr[Boolean] = js.undefined,
    singleEvents: js.UndefOr[Boolean] = js.undefined,
    syncToken: SyncToken = null,
    timeMax: datetime = null,
    timeMin: datetime = null,
    timeZone: String = null,
    updatedMin: datetime = null
  ): EventsListParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysIncludeEmail)) __obj.updateDynamic("alwaysIncludeEmail")(alwaysIncludeEmail.get.asInstanceOf[js.Any])
    if (iCalUID != null) __obj.updateDynamic("iCalUID")(iCalUID.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAttendees)) __obj.updateDynamic("maxAttendees")(maxAttendees.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (privateExtendedProperty != null) __obj.updateDynamic("privateExtendedProperty")(privateExtendedProperty.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (sharedExtendedProperty != null) __obj.updateDynamic("sharedExtendedProperty")(sharedExtendedProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(showDeleted)) __obj.updateDynamic("showDeleted")(showDeleted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHiddenInvitations)) __obj.updateDynamic("showHiddenInvitations")(showHiddenInvitations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(singleEvents)) __obj.updateDynamic("singleEvents")(singleEvents.get.asInstanceOf[js.Any])
    if (syncToken != null) __obj.updateDynamic("syncToken")(syncToken.asInstanceOf[js.Any])
    if (timeMax != null) __obj.updateDynamic("timeMax")(timeMax.asInstanceOf[js.Any])
    if (timeMin != null) __obj.updateDynamic("timeMin")(timeMin.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (updatedMin != null) __obj.updateDynamic("updatedMin")(updatedMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsListParameters]
  }
}

