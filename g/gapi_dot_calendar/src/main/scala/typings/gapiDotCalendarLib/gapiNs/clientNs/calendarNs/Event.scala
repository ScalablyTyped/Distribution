package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.calendar.Event")
@js.native
class Event () extends js.Object {
  var anyoneCanAddSelf: js.UndefOr[scala.Boolean] = js.native
  // File attachments for the event. Currently only Google Drive attachments are supported.
  var attachments: js.UndefOr[js.Array[gapiDotCalendarLib.Anon_FileId]] = js.native
  // The attendees of the event.
  var attendees: js.UndefOr[js.Array[gapiDotCalendarLib.Anon_AdditionalGuestsComment]] = js.native
  var attendeesOmitted: js.UndefOr[scala.Boolean] = js.native
  var colorId: js.UndefOr[java.lang.String] = js.native
  var created: datetime = js.native
  // The creator of the event. Read-only.
  var creator: gapiDotCalendarLib.Anon_DisplayName = js.native
  var description: java.lang.String = js.native
  // The (exclusive) end time of the event. For a recurring event, this is the end time of the first instance.
  var end: gapiDotCalendarLib.Anon_Date = js.native
  // 	Whether the end time is actually unspecified. An end time is still provided for compatibility reasons, even if this attribute is set to True.
  // The default is False.
  var endTimeUnspecified: js.UndefOr[scala.Boolean] = js.native
  var etag: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.etag = js.native
  // Extended properties of the event.
  var extendedProperties: js.UndefOr[gapiDotCalendarLib.Anon_Private] = js.native
  // A gadget that extends this event.
  var gadget: js.UndefOr[gapiDotCalendarLib.Anon_DisplayHeight] = js.native
  var guestsCanInviteOthers: js.UndefOr[scala.Boolean] = js.native
  var guestsCanModify: js.UndefOr[scala.Boolean] = js.native
  var guestsCanSeeOtherGuests: js.UndefOr[scala.Boolean] = js.native
  // An absolute link to the Google+ hangout associated with this event. Read-only.
  var hangoutLink: js.UndefOr[java.lang.String] = js.native
  var htmlLink: java.lang.String = js.native
  var iCalUID: java.lang.String = js.native
  var id: java.lang.String = js.native
  var kind: gapiDotCalendarLib.gapiDotCalendarLibStrings.`calendar#event` = js.native
  var location: js.UndefOr[java.lang.String] = js.native
  // Whether this is a locked event copy where no changes can be made to the main event fields "summary", "description", "location", "start", "end" or "recurrence". The default is False. Read-Only.
  var locked: js.UndefOr[scala.Boolean] = js.native
  // The organizer of the event.
  var organizer: gapiDotCalendarLib.Anon_DisplayName = js.native
  // Whether the organizer corresponds to the calendar on which this copy of the event appears. Read-only. The default is False.
  var originalStartTime: js.UndefOr[gapiDotCalendarLib.Anon_DateDateTimeTimeZone] = js.native
  var privateCopy: js.UndefOr[scala.Boolean] = js.native
  var recurrence: js.Array[java.lang.String] = js.native
  // For an instance of a recurring event, this is the id of the recurring event to which this instance belongs. Immutable.
  var recurringEventId: js.UndefOr[java.lang.String] = js.native
  var reminders: gapiDotCalendarLib.Anon_OverridesUseDefault = js.native
  var sequence: integer = js.native
  // Source from which the event was created. For example, a web page, an email message or any document identifiable by an URL with HTTP or HTTPS scheme.
  // Can only be seen or modified by the creator of the event.
  var source: js.UndefOr[gapiDotCalendarLib.Anon_Title] = js.native
  // The (inclusive) start time of the event. For a recurring event, this is the start time of the first instance.
  var start: gapiDotCalendarLib.Anon_Date = js.native
  var status: js.UndefOr[EventStatus] = js.native
  var summary: java.lang.String = js.native
  var transparency: js.UndefOr[EventTransparency] = js.native
  var updated: datetime = js.native
  var visibility: js.UndefOr[EventVisibility] = js.native
}

