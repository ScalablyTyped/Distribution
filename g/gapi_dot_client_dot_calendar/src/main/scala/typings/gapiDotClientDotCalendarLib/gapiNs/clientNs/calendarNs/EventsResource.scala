package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EventsResource extends js.Object {
  /** Deletes an event. */
  def delete(request: gapiDotClientDotCalendarLib.Anon_PrettyPrintEventIdQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns an event. */
  def get(request: gapiDotClientDotCalendarLib.Anon_PrettyPrintEventIdQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Event]
  /** Imports an event. This operation is used to add a private copy of an existing event to a calendar. */
  def `import`(request: gapiDotClientDotCalendarLib.Anon_PrettyPrintQuotaUserSupportsAttachmentsKey): gapiDotClientLib.gapiNs.clientNs.Request[Event]
  /** Creates an event. */
  def insert(request: gapiDotClientDotCalendarLib.Anon_PrettyPrintQuotaUserSupportsAttachments): gapiDotClientLib.gapiNs.clientNs.Request[Event]
  /** Returns instances of the specified recurring event. */
  def instances(request: gapiDotClientDotCalendarLib.Anon_TimeMinMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[Events]
  /** Returns events on the specified calendar. */
  def list(request: gapiDotClientDotCalendarLib.Anon_TimeMin): gapiDotClientLib.gapiNs.clientNs.Request[Events]
  /** Moves an event to another calendar, i.e. changes an event's organizer. */
  def move(request: gapiDotClientDotCalendarLib.Anon_PrettyPrintEventId): gapiDotClientLib.gapiNs.clientNs.Request[Event]
  /** Updates an event. This method supports patch semantics. */
  def patch(request: gapiDotClientDotCalendarLib.Anon_PrettyPrintEventIdQuotaUserSupportsAttachments): gapiDotClientLib.gapiNs.clientNs.Request[Event]
  /** Creates an event based on a simple text string. */
  def quickAdd(request: gapiDotClientDotCalendarLib.Anon_PrettyPrintText): gapiDotClientLib.gapiNs.clientNs.Request[Event]
  /** Updates an event. */
  def update(request: gapiDotClientDotCalendarLib.Anon_PrettyPrintEventIdQuotaUserSupportsAttachments): gapiDotClientLib.gapiNs.clientNs.Request[Event]
  /** Watch for changes to Events resources. */
  def watch(request: gapiDotClientDotCalendarLib.Anon_TimeMin): gapiDotClientLib.gapiNs.clientNs.Request[Channel]
}

