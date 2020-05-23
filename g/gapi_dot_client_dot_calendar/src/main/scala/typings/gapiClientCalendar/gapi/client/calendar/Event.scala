package typings.gapiClientCalendar.gapi.client.calendar

import typings.gapiClientCalendar.anon.Display
import typings.gapiClientCalendar.anon.DisplayName
import typings.gapiClientCalendar.anon.Overrides
import typings.gapiClientCalendar.anon.Private
import typings.gapiClientCalendar.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /** Whether anyone can invite themselves to the event (currently works for Google+ events only). Optional. The default is False. */
  var anyoneCanAddSelf: js.UndefOr[Boolean] = js.undefined
  /**
    * File attachments for the event. Currently only Google Drive attachments are supported.
    * In order to modify attachments the supportsAttachments request parameter should be set to true.
    * There can be at most 25 attachments per event,
    */
  var attachments: js.UndefOr[js.Array[EventAttachment]] = js.undefined
  /** The attendees of the event. See the Events with attendees guide for more information on scheduling events with other calendar users. */
  var attendees: js.UndefOr[js.Array[EventAttendee]] = js.undefined
  /**
    * Whether attendees may have been omitted from the event's representation. When retrieving an event, this may be due to a restriction specified by the
    * maxAttendee query parameter. When updating an event, this can be used to only update the participant's response. Optional. The default is False.
    */
  var attendeesOmitted: js.UndefOr[Boolean] = js.undefined
  /** The color of the event. This is an ID referring to an entry in the event section of the colors definition (see the  colors endpoint). Optional. */
  var colorId: js.UndefOr[String] = js.undefined
  /**
    * The conference-related information, such as details of a Google Meet conference. To create new conference details use the createRequest field. To
    * persist your changes, remember to set the conferenceDataVersion request parameter to 1 for all event modification requests.
    */
  var conferenceData: js.UndefOr[ConferenceData] = js.undefined
  /** Creation time of the event (as a RFC3339 timestamp). Read-only. */
  var created: js.UndefOr[String] = js.undefined
  /** The creator of the event. Read-only. */
  var creator: js.UndefOr[DisplayName] = js.undefined
  /** Description of the event. Can contain HTML. Optional. */
  var description: js.UndefOr[String] = js.undefined
  /** The (exclusive) end time of the event. For a recurring event, this is the end time of the first instance. */
  var end: js.UndefOr[EventDateTime] = js.undefined
  /**
    * Whether the end time is actually unspecified. An end time is still provided for compatibility reasons, even if this attribute is set to True. The
    * default is False.
    */
  var endTimeUnspecified: js.UndefOr[Boolean] = js.undefined
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** Extended properties of the event. */
  var extendedProperties: js.UndefOr[Private] = js.undefined
  /** A gadget that extends this event. */
  var gadget: js.UndefOr[Display] = js.undefined
  /** Whether attendees other than the organizer can invite others to the event. Optional. The default is True. */
  var guestsCanInviteOthers: js.UndefOr[Boolean] = js.undefined
  /** Whether attendees other than the organizer can modify the event. Optional. The default is False. */
  var guestsCanModify: js.UndefOr[Boolean] = js.undefined
  /** Whether attendees other than the organizer can see who the event's attendees are. Optional. The default is True. */
  var guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.undefined
  /** An absolute link to the Google+ hangout associated with this event. Read-only. */
  var hangoutLink: js.UndefOr[String] = js.undefined
  /** An absolute link to this event in the Google Calendar Web UI. Read-only. */
  var htmlLink: js.UndefOr[String] = js.undefined
  /**
    * Event unique identifier as defined in RFC5545. It is used to uniquely identify events accross calendaring systems and must be supplied when importing
    * events via the import method.
    * Note that the icalUID and the id are not identical and only one of them should be supplied at event creation time. One difference in their semantics is
    * that in recurring events, all occurrences of one event have different ids while they all share the same icalUIDs.
    */
  var iCalUID: js.UndefOr[String] = js.undefined
  /**
    * Opaque identifier of the event. When creating new single or recurring events, you can specify their IDs. Provided IDs must follow these rules:
    * - characters allowed in the ID are those used in base32hex encoding, i.e. lowercase letters a-v and digits 0-9, see section 3.1.2 in RFC2938
    * - the length of the ID must be between 5 and 1024 characters
    * - the ID must be unique per calendar  Due to the globally distributed nature of the system, we cannot guarantee that ID collisions will be detected at
    * event creation time. To minimize the risk of collisions we recommend using an established UUID algorithm such as one described in RFC4122.
    * If you do not specify an ID, it will be automatically generated by the server.
    * Note that the icalUID and the id are not identical and only one of them should be supplied at event creation time. One difference in their semantics is
    * that in recurring events, all occurrences of one event have different ids while they all share the same icalUIDs.
    */
  var id: js.UndefOr[String] = js.undefined
  /** Type of the resource ("calendar#event"). */
  var kind: js.UndefOr[String] = js.undefined
  /** Geographic location of the event as free-form text. Optional. */
  var location: js.UndefOr[String] = js.undefined
  /**
    * Whether this is a locked event copy where no changes can be made to the main event fields "summary", "description", "location", "start", "end" or
    * "recurrence". The default is False. Read-Only.
    */
  var locked: js.UndefOr[Boolean] = js.undefined
  /**
    * The organizer of the event. If the organizer is also an attendee, this is indicated with a separate entry in attendees with the organizer field set to
    * True. To change the organizer, use the move operation. Read-only, except when importing an event.
    */
  var organizer: js.UndefOr[DisplayName] = js.undefined
  /**
    * For an instance of a recurring event, this is the time at which this event would start according to the recurrence data in the recurring event
    * identified by recurringEventId. It uniquely identifies the instance within the recurring event series even if the instance was moved to a different
    * time. Immutable.
    */
  var originalStartTime: js.UndefOr[EventDateTime] = js.undefined
  /**
    * If set to True, Event propagation is disabled. Note that it is not the same thing as Private event properties. Optional. Immutable. The default is
    * False.
    */
  var privateCopy: js.UndefOr[Boolean] = js.undefined
  /**
    * List of RRULE, EXRULE, RDATE and EXDATE lines for a recurring event, as specified in RFC5545. Note that DTSTART and DTEND lines are not allowed in this
    * field; event start and end times are specified in the start and end fields. This field is omitted for single events or instances of recurring events.
    */
  var recurrence: js.UndefOr[js.Array[String]] = js.undefined
  /** For an instance of a recurring event, this is the id of the recurring event to which this instance belongs. Immutable. */
  var recurringEventId: js.UndefOr[String] = js.undefined
  /** Information about the event's reminders for the authenticated user. */
  var reminders: js.UndefOr[Overrides] = js.undefined
  /** Sequence number as per iCalendar. */
  var sequence: js.UndefOr[Double] = js.undefined
  /**
    * Source from which the event was created. For example, a web page, an email message or any document identifiable by an URL with HTTP or HTTPS scheme.
    * Can only be seen or modified by the creator of the event.
    */
  var source: js.UndefOr[Title] = js.undefined
  /** The (inclusive) start time of the event. For a recurring event, this is the start time of the first instance. */
  var start: js.UndefOr[EventDateTime] = js.undefined
  /**
    * Status of the event. Optional. Possible values are:
    * - "confirmed" - The event is confirmed. This is the default status.
    * - "tentative" - The event is tentatively confirmed.
    * - "cancelled" - The event is cancelled (deleted). The list method returns cancelled events only on incremental sync (when syncToken or updatedMin are
    * specified) or if the showDeleted flag is set to true. The get method always returns them.
    * A cancelled status represents two different states depending on the event type:
    * - Cancelled exceptions of an uncancelled recurring event indicate that this instance should no longer be presented to the user. Clients should store
    * these events for the lifetime of the parent recurring event.
    * Cancelled exceptions are only guaranteed to have values for the id, recurringEventId and originalStartTime fields populated. The other fields might be
    * empty.
    * - All other cancelled events represent deleted events. Clients should remove their locally synced copies. Such cancelled events will eventually
    * disappear, so do not rely on them being available indefinitely.
    * Deleted events are only guaranteed to have the id field populated.   On the organizer's calendar, cancelled events continue to expose event details
    * (summary, location, etc.) so that they can be restored (undeleted). Similarly, the events to which the user was invited and that they manually removed
    * continue to provide details. However, incremental sync requests with showDeleted set to false will not return these details.
    * If an event changes its organizer (for example via the move operation) and the original organizer is not on the attendee list, it will leave behind a
    * cancelled event where only the id field is guaranteed to be populated.
    */
  var status: js.UndefOr[String] = js.undefined
  /** Title of the event. */
  var summary: js.UndefOr[String] = js.undefined
  /**
    * Whether the event blocks time on the calendar. Optional. Possible values are:
    * - "opaque" - Default value. The event does block time on the calendar. This is equivalent to setting Show me as to Busy in the Calendar UI.
    * - "transparent" - The event does not block time on the calendar. This is equivalent to setting Show me as to Available in the Calendar UI.
    */
  var transparency: js.UndefOr[String] = js.undefined
  /** Last modification time of the event (as a RFC3339 timestamp). Read-only. */
  var updated: js.UndefOr[String] = js.undefined
  /**
    * Visibility of the event. Optional. Possible values are:
    * - "default" - Uses the default visibility for events on the calendar. This is the default value.
    * - "public" - The event is public and event details are visible to all readers of the calendar.
    * - "private" - The event is private and only event attendees may view event details.
    * - "confidential" - The event is private. This value is provided for compatibility reasons.
    */
  var visibility: js.UndefOr[String] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    anyoneCanAddSelf: js.UndefOr[Boolean] = js.undefined,
    attachments: js.Array[EventAttachment] = null,
    attendees: js.Array[EventAttendee] = null,
    attendeesOmitted: js.UndefOr[Boolean] = js.undefined,
    colorId: String = null,
    conferenceData: ConferenceData = null,
    created: String = null,
    creator: DisplayName = null,
    description: String = null,
    end: EventDateTime = null,
    endTimeUnspecified: js.UndefOr[Boolean] = js.undefined,
    etag: String = null,
    extendedProperties: Private = null,
    gadget: Display = null,
    guestsCanInviteOthers: js.UndefOr[Boolean] = js.undefined,
    guestsCanModify: js.UndefOr[Boolean] = js.undefined,
    guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.undefined,
    hangoutLink: String = null,
    htmlLink: String = null,
    iCalUID: String = null,
    id: String = null,
    kind: String = null,
    location: String = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    organizer: DisplayName = null,
    originalStartTime: EventDateTime = null,
    privateCopy: js.UndefOr[Boolean] = js.undefined,
    recurrence: js.Array[String] = null,
    recurringEventId: String = null,
    reminders: Overrides = null,
    sequence: js.UndefOr[Double] = js.undefined,
    source: Title = null,
    start: EventDateTime = null,
    status: String = null,
    summary: String = null,
    transparency: String = null,
    updated: String = null,
    visibility: String = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anyoneCanAddSelf)) __obj.updateDynamic("anyoneCanAddSelf")(anyoneCanAddSelf.get.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (attendees != null) __obj.updateDynamic("attendees")(attendees.asInstanceOf[js.Any])
    if (!js.isUndefined(attendeesOmitted)) __obj.updateDynamic("attendeesOmitted")(attendeesOmitted.get.asInstanceOf[js.Any])
    if (colorId != null) __obj.updateDynamic("colorId")(colorId.asInstanceOf[js.Any])
    if (conferenceData != null) __obj.updateDynamic("conferenceData")(conferenceData.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (creator != null) __obj.updateDynamic("creator")(creator.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(endTimeUnspecified)) __obj.updateDynamic("endTimeUnspecified")(endTimeUnspecified.get.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (extendedProperties != null) __obj.updateDynamic("extendedProperties")(extendedProperties.asInstanceOf[js.Any])
    if (gadget != null) __obj.updateDynamic("gadget")(gadget.asInstanceOf[js.Any])
    if (!js.isUndefined(guestsCanInviteOthers)) __obj.updateDynamic("guestsCanInviteOthers")(guestsCanInviteOthers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(guestsCanModify)) __obj.updateDynamic("guestsCanModify")(guestsCanModify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(guestsCanSeeOtherGuests)) __obj.updateDynamic("guestsCanSeeOtherGuests")(guestsCanSeeOtherGuests.get.asInstanceOf[js.Any])
    if (hangoutLink != null) __obj.updateDynamic("hangoutLink")(hangoutLink.asInstanceOf[js.Any])
    if (htmlLink != null) __obj.updateDynamic("htmlLink")(htmlLink.asInstanceOf[js.Any])
    if (iCalUID != null) __obj.updateDynamic("iCalUID")(iCalUID.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.get.asInstanceOf[js.Any])
    if (organizer != null) __obj.updateDynamic("organizer")(organizer.asInstanceOf[js.Any])
    if (originalStartTime != null) __obj.updateDynamic("originalStartTime")(originalStartTime.asInstanceOf[js.Any])
    if (!js.isUndefined(privateCopy)) __obj.updateDynamic("privateCopy")(privateCopy.get.asInstanceOf[js.Any])
    if (recurrence != null) __obj.updateDynamic("recurrence")(recurrence.asInstanceOf[js.Any])
    if (recurringEventId != null) __obj.updateDynamic("recurringEventId")(recurringEventId.asInstanceOf[js.Any])
    if (reminders != null) __obj.updateDynamic("reminders")(reminders.asInstanceOf[js.Any])
    if (!js.isUndefined(sequence)) __obj.updateDynamic("sequence")(sequence.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

