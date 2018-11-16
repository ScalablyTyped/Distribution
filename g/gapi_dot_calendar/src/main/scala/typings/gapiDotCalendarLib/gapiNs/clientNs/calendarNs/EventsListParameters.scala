package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EventsListParameters extends js.Object {
  var alwaysIncludeEmail: js.UndefOr[scala.Boolean] = js.undefined
  var calendarId: java.lang.String
  var iCalUID: js.UndefOr[java.lang.String] = js.undefined
  var maxAttendees: js.UndefOr[integer] = js.undefined
  var maxResults: js.UndefOr[integer] = js.undefined
  var orderBy: js.UndefOr[EventsOrder] = js.undefined
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  var privateExtendedProperty: js.UndefOr[java.lang.String] = js.undefined
  var q: js.UndefOr[java.lang.String] = js.undefined
  var sharedExtendedProperty: js.UndefOr[java.lang.String] = js.undefined
  var showDeleted: js.UndefOr[scala.Boolean] = js.undefined
  var showHiddenInvitations: js.UndefOr[scala.Boolean] = js.undefined
  var singleEvents: js.UndefOr[scala.Boolean] = js.undefined
  var syncToken: js.UndefOr[SyncToken] = js.undefined
  var timeMax: js.UndefOr[datetime] = js.undefined
  var timeMin: js.UndefOr[datetime] = js.undefined
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
  var updatedMin: js.UndefOr[datetime] = js.undefined
}

