package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var anyoneCanAddSelf: js.UndefOr[scala.Boolean] = js.undefined
  var attachments: js.UndefOr[js.Array[EventAttachment]] = js.undefined
  var attendees: js.UndefOr[js.Array[EventAttendee]] = js.undefined
  var attendeesOmitted: js.UndefOr[scala.Boolean] = js.undefined
  var colorId: js.UndefOr[java.lang.String] = js.undefined
  var conferenceData: js.UndefOr[ConferenceData] = js.undefined
  var created: js.UndefOr[java.lang.String] = js.undefined
  var creator: js.UndefOr[EventCreator] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[EventDateTime] = js.undefined
  var endTimeUnspecified: js.UndefOr[scala.Boolean] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var extendedProperties: js.UndefOr[EventExtendedProperties] = js.undefined
  var gadget: js.UndefOr[EventGadget] = js.undefined
  var guestsCanInviteOthers: js.UndefOr[scala.Boolean] = js.undefined
  var guestsCanModify: js.UndefOr[scala.Boolean] = js.undefined
  var guestsCanSeeOtherGuests: js.UndefOr[scala.Boolean] = js.undefined
  var hangoutLink: js.UndefOr[java.lang.String] = js.undefined
  var htmlLink: js.UndefOr[java.lang.String] = js.undefined
  var iCalUID: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var locked: js.UndefOr[scala.Boolean] = js.undefined
  var organizer: js.UndefOr[EventOrganizer] = js.undefined
  var originalStartTime: js.UndefOr[EventDateTime] = js.undefined
  var privateCopy: js.UndefOr[scala.Boolean] = js.undefined
  var recurrence: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var recurringEventId: js.UndefOr[java.lang.String] = js.undefined
  var reminders: js.UndefOr[EventReminders] = js.undefined
  var sequence: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[EventSource] = js.undefined
  var start: js.UndefOr[EventDateTime] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var summary: js.UndefOr[java.lang.String] = js.undefined
  var transparency: js.UndefOr[java.lang.String] = js.undefined
  var updated: js.UndefOr[java.lang.String] = js.undefined
  var visibility: js.UndefOr[java.lang.String] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    anyoneCanAddSelf: js.UndefOr[scala.Boolean] = js.undefined,
    attachments: js.Array[EventAttachment] = null,
    attendees: js.Array[EventAttendee] = null,
    attendeesOmitted: js.UndefOr[scala.Boolean] = js.undefined,
    colorId: java.lang.String = null,
    conferenceData: ConferenceData = null,
    created: java.lang.String = null,
    creator: EventCreator = null,
    description: java.lang.String = null,
    end: EventDateTime = null,
    endTimeUnspecified: js.UndefOr[scala.Boolean] = js.undefined,
    etag: java.lang.String = null,
    extendedProperties: EventExtendedProperties = null,
    gadget: EventGadget = null,
    guestsCanInviteOthers: js.UndefOr[scala.Boolean] = js.undefined,
    guestsCanModify: js.UndefOr[scala.Boolean] = js.undefined,
    guestsCanSeeOtherGuests: js.UndefOr[scala.Boolean] = js.undefined,
    hangoutLink: java.lang.String = null,
    htmlLink: java.lang.String = null,
    iCalUID: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    location: java.lang.String = null,
    locked: js.UndefOr[scala.Boolean] = js.undefined,
    organizer: EventOrganizer = null,
    originalStartTime: EventDateTime = null,
    privateCopy: js.UndefOr[scala.Boolean] = js.undefined,
    recurrence: js.Array[java.lang.String] = null,
    recurringEventId: java.lang.String = null,
    reminders: EventReminders = null,
    sequence: scala.Int | scala.Double = null,
    source: EventSource = null,
    start: EventDateTime = null,
    status: java.lang.String = null,
    summary: java.lang.String = null,
    transparency: java.lang.String = null,
    updated: java.lang.String = null,
    visibility: java.lang.String = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anyoneCanAddSelf)) __obj.updateDynamic("anyoneCanAddSelf")(anyoneCanAddSelf)
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (attendees != null) __obj.updateDynamic("attendees")(attendees)
    if (!js.isUndefined(attendeesOmitted)) __obj.updateDynamic("attendeesOmitted")(attendeesOmitted)
    if (colorId != null) __obj.updateDynamic("colorId")(colorId)
    if (conferenceData != null) __obj.updateDynamic("conferenceData")(conferenceData)
    if (created != null) __obj.updateDynamic("created")(created)
    if (creator != null) __obj.updateDynamic("creator")(creator)
    if (description != null) __obj.updateDynamic("description")(description)
    if (end != null) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(endTimeUnspecified)) __obj.updateDynamic("endTimeUnspecified")(endTimeUnspecified)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (extendedProperties != null) __obj.updateDynamic("extendedProperties")(extendedProperties)
    if (gadget != null) __obj.updateDynamic("gadget")(gadget)
    if (!js.isUndefined(guestsCanInviteOthers)) __obj.updateDynamic("guestsCanInviteOthers")(guestsCanInviteOthers)
    if (!js.isUndefined(guestsCanModify)) __obj.updateDynamic("guestsCanModify")(guestsCanModify)
    if (!js.isUndefined(guestsCanSeeOtherGuests)) __obj.updateDynamic("guestsCanSeeOtherGuests")(guestsCanSeeOtherGuests)
    if (hangoutLink != null) __obj.updateDynamic("hangoutLink")(hangoutLink)
    if (htmlLink != null) __obj.updateDynamic("htmlLink")(htmlLink)
    if (iCalUID != null) __obj.updateDynamic("iCalUID")(iCalUID)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (location != null) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    if (organizer != null) __obj.updateDynamic("organizer")(organizer)
    if (originalStartTime != null) __obj.updateDynamic("originalStartTime")(originalStartTime)
    if (!js.isUndefined(privateCopy)) __obj.updateDynamic("privateCopy")(privateCopy)
    if (recurrence != null) __obj.updateDynamic("recurrence")(recurrence)
    if (recurringEventId != null) __obj.updateDynamic("recurringEventId")(recurringEventId)
    if (reminders != null) __obj.updateDynamic("reminders")(reminders)
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (start != null) __obj.updateDynamic("start")(start)
    if (status != null) __obj.updateDynamic("status")(status)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (transparency != null) __obj.updateDynamic("transparency")(transparency)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[Event]
  }
}

