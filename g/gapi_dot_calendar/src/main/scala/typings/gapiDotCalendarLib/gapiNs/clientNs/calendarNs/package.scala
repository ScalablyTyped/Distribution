package typings
package gapiDotCalendarLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object calendarNs {
  // The user's access role for this calendar. Read-only. Possible values are:
  type AccessRole = gapiDotCalendarLib.gapiDotCalendarLibStrings.none | AccessRoleWithoutNone
  type AccessRoleWithoutNone = gapiDotCalendarLib.gapiDotCalendarLibStrings.freeBusyReader | gapiDotCalendarLib.gapiDotCalendarLibStrings.reader | gapiDotCalendarLib.gapiDotCalendarLibStrings.writer | gapiDotCalendarLib.gapiDotCalendarLibStrings.owner
  type AclDeleteParameters = AclGetParameters
  // The attendee's response status. Possible values are:
  type AttendeeResponseStatus = gapiDotCalendarLib.gapiDotCalendarLibStrings.needsAction | gapiDotCalendarLib.gapiDotCalendarLibStrings.declined | gapiDotCalendarLib.gapiDotCalendarLibStrings.tentative | gapiDotCalendarLib.gapiDotCalendarLibStrings.accepted
  // Status of the event. Optional. Possible values are:
  type EventStatus = gapiDotCalendarLib.gapiDotCalendarLibStrings.confirmed | gapiDotCalendarLib.gapiDotCalendarLibStrings.tentative | gapiDotCalendarLib.gapiDotCalendarLibStrings.cancelled
  // Whether the event blocks time on the calendar. Optional. Possible values are:
  type EventTransparency = gapiDotCalendarLib.gapiDotCalendarLibStrings.opaque | gapiDotCalendarLib.gapiDotCalendarLibStrings.transparent
  // Visibility of the event. Optional. Possible values are:
  type EventVisibility = gapiDotCalendarLib.gapiDotCalendarLibStrings.default | gapiDotCalendarLib.gapiDotCalendarLibStrings.public | gapiDotCalendarLib.gapiDotCalendarLibStrings.`private` | gapiDotCalendarLib.gapiDotCalendarLibStrings.confidential
  // The order of the events returned in the result. Optional. The default is an unspecified, stable order.
  // Acceptable values are:
  type EventsOrder = gapiDotCalendarLib.gapiDotCalendarLibStrings.startTime | gapiDotCalendarLib.gapiDotCalendarLibStrings.updated
  // The gadget's display mode. Optional. Possible values are:
  type GadgetDisplayMode = gapiDotCalendarLib.gapiDotCalendarLibStrings.icon | gapiDotCalendarLib.gapiDotCalendarLibStrings.chip
  // The type of notification. Possible values are:
  type NotificationType = gapiDotCalendarLib.gapiDotCalendarLibStrings.eventCreation | gapiDotCalendarLib.gapiDotCalendarLibStrings.eventChange | gapiDotCalendarLib.gapiDotCalendarLibStrings.eventCancellation | gapiDotCalendarLib.gapiDotCalendarLibStrings.eventResponse | gapiDotCalendarLib.gapiDotCalendarLibStrings.agenda
  // The method used by this reminder. Possible values are:
  type ReminderMethod = gapiDotCalendarLib.gapiDotCalendarLibStrings.email | gapiDotCalendarLib.gapiDotCalendarLibStrings.sms | gapiDotCalendarLib.gapiDotCalendarLibStrings.popup
  // The type of the scope. Possible values are:
  type ScopeType = gapiDotCalendarLib.gapiDotCalendarLibStrings.default | gapiDotCalendarLib.gapiDotCalendarLibStrings.user | gapiDotCalendarLib.gapiDotCalendarLibStrings.group | gapiDotCalendarLib.gapiDotCalendarLibStrings.domain
  // Token obtained from the nextSyncToken field returned on the last page of results from the previous list request.
  // It makes the result of this list request contain only entries that have changed since then.
  // All events deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False.
  // There are several query parameters that cannot be specified together with nextSyncToken to ensure consistency of the client state.
  // These are:
  type SyncToken = gapiDotCalendarLib.gapiDotCalendarLibStrings.iCalUID | gapiDotCalendarLib.gapiDotCalendarLibStrings.orderBy | gapiDotCalendarLib.gapiDotCalendarLibStrings.privateExtendedProperty | gapiDotCalendarLib.gapiDotCalendarLibStrings.q | gapiDotCalendarLib.gapiDotCalendarLibStrings.sharedExtendedProperty | gapiDotCalendarLib.gapiDotCalendarLibStrings.timeMin | gapiDotCalendarLib.gapiDotCalendarLibStrings.timeMax | gapiDotCalendarLib.gapiDotCalendarLibStrings.updatedMin
  type date = java.lang.String
  type datetime = java.lang.String
  type etag = java.lang.String
  type integer = scala.Double
}
