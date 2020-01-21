package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.AnonAdditionalGuestsComment
import typings.gapiCalendar.AnonDate
import typings.gapiCalendar.AnonDateDateTimeTimeZone
import typings.gapiCalendar.AnonDisplayHeight
import typings.gapiCalendar.AnonDisplayName
import typings.gapiCalendar.AnonFileId
import typings.gapiCalendar.AnonKey
import typings.gapiCalendar.AnonOverridesUseDefault
import typings.gapiCalendar.AnonTitle
import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersignevent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.calendar.Event")
@js.native
class Event () extends js.Object {
  var anyoneCanAddSelf: js.UndefOr[Boolean] = js.native
  // File attachments for the event. Currently only Google Drive attachments are supported.
  var attachments: js.UndefOr[js.Array[AnonFileId]] = js.native
  // The attendees of the event.
  var attendees: js.UndefOr[js.Array[AnonAdditionalGuestsComment]] = js.native
  var attendeesOmitted: js.UndefOr[Boolean] = js.native
  var colorId: js.UndefOr[String] = js.native
  var created: datetime = js.native
  // The creator of the event. Read-only.
  var creator: AnonDisplayName = js.native
  var description: String = js.native
  // The (exclusive) end time of the event. For a recurring event, this is the end time of the first instance.
  var end: AnonDate = js.native
  // 	Whether the end time is actually unspecified. An end time is still provided for compatibility reasons, even if this attribute is set to True.
  // The default is False.
  var endTimeUnspecified: js.UndefOr[Boolean] = js.native
  var etag: typings.gapiCalendar.gapi.client.calendar.etag = js.native
  // Extended properties of the event.
  var extendedProperties: js.UndefOr[AnonKey] = js.native
  // A gadget that extends this event.
  var gadget: js.UndefOr[AnonDisplayHeight] = js.native
  var guestsCanInviteOthers: js.UndefOr[Boolean] = js.native
  var guestsCanModify: js.UndefOr[Boolean] = js.native
  var guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.native
  // An absolute link to the Google+ hangout associated with this event. Read-only.
  var hangoutLink: js.UndefOr[String] = js.native
  var htmlLink: String = js.native
  var iCalUID: String = js.native
  var id: String = js.native
  var kind: calendarNumbersignevent = js.native
  var location: js.UndefOr[String] = js.native
  // Whether this is a locked event copy where no changes can be made to the main event fields "summary", "description", "location", "start", "end" or "recurrence". The default is False. Read-Only.
  var locked: js.UndefOr[Boolean] = js.native
  // The organizer of the event.
  var organizer: AnonDisplayName = js.native
  // Whether the organizer corresponds to the calendar on which this copy of the event appears. Read-only. The default is False.
  var originalStartTime: js.UndefOr[AnonDateDateTimeTimeZone] = js.native
  var privateCopy: js.UndefOr[Boolean] = js.native
  var recurrence: js.Array[String] = js.native
  // For an instance of a recurring event, this is the id of the recurring event to which this instance belongs. Immutable.
  var recurringEventId: js.UndefOr[String] = js.native
  var reminders: AnonOverridesUseDefault = js.native
  var sequence: integer = js.native
  // Source from which the event was created. For example, a web page, an email message or any document identifiable by an URL with HTTP or HTTPS scheme.
  // Can only be seen or modified by the creator of the event.
  var source: js.UndefOr[AnonTitle] = js.native
  // The (inclusive) start time of the event. For a recurring event, this is the start time of the first instance.
  var start: AnonDate = js.native
  var status: js.UndefOr[EventStatus] = js.native
  var summary: String = js.native
  var transparency: js.UndefOr[EventTransparency] = js.native
  var updated: datetime = js.native
  var visibility: js.UndefOr[EventVisibility] = js.native
}

