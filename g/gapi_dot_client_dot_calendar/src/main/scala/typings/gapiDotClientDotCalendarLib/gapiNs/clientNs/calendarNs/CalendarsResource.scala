package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CalendarsResource extends js.Object {
  /** Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account. */
  def clear(request: gapiDotClientDotCalendarLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars. */
  def delete(request: gapiDotClientDotCalendarLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns metadata for a calendar. */
  def get(request: gapiDotClientDotCalendarLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Calendar]
  /** Creates a secondary calendar. */
  def insert(request: gapiDotClientDotCalendarLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Calendar]
  /** Updates metadata for a calendar. This method supports patch semantics. */
  def patch(request: gapiDotClientDotCalendarLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Calendar]
  /** Updates metadata for a calendar. */
  def update(request: gapiDotClientDotCalendarLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Calendar]
}

