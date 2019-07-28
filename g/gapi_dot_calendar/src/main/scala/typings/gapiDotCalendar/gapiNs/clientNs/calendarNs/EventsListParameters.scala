package typings.gapiDotCalendar.gapiNs.clientNs.calendarNs

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
    val __obj = js.Dynamic.literal(calendarId = calendarId)
    if (!js.isUndefined(alwaysIncludeEmail)) __obj.updateDynamic("alwaysIncludeEmail")(alwaysIncludeEmail)
    if (iCalUID != null) __obj.updateDynamic("iCalUID")(iCalUID)
    if (!js.isUndefined(maxAttendees)) __obj.updateDynamic("maxAttendees")(maxAttendees)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (privateExtendedProperty != null) __obj.updateDynamic("privateExtendedProperty")(privateExtendedProperty)
    if (q != null) __obj.updateDynamic("q")(q)
    if (sharedExtendedProperty != null) __obj.updateDynamic("sharedExtendedProperty")(sharedExtendedProperty)
    if (!js.isUndefined(showDeleted)) __obj.updateDynamic("showDeleted")(showDeleted)
    if (!js.isUndefined(showHiddenInvitations)) __obj.updateDynamic("showHiddenInvitations")(showHiddenInvitations)
    if (!js.isUndefined(singleEvents)) __obj.updateDynamic("singleEvents")(singleEvents)
    if (syncToken != null) __obj.updateDynamic("syncToken")(syncToken)
    if (timeMax != null) __obj.updateDynamic("timeMax")(timeMax)
    if (timeMin != null) __obj.updateDynamic("timeMin")(timeMin)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (updatedMin != null) __obj.updateDynamic("updatedMin")(updatedMin)
    __obj.asInstanceOf[EventsListParameters]
  }
}

