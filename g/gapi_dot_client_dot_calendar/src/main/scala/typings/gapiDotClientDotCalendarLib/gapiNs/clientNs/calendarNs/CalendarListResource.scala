package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CalendarListResource extends js.Object {
  /** Deletes an entry on the user's calendar list. */
  def delete(request: gapiDotClientDotCalendarLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns an entry on the user's calendar list. */
  def get(request: gapiDotClientDotCalendarLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[CalendarListEntry]
  /** Adds an entry to the user's calendar list. */
  def insert(request: gapiDotClientDotCalendarLib.Anon_PrettyPrintColorRgbFormat): gapiDotClientLib.gapiNs.clientNs.Request[CalendarListEntry]
  /** Returns entries on the user's calendar list. */
  def list(request: gapiDotClientDotCalendarLib.Anon_MaxResultsPrettyPrintPageToken): gapiDotClientLib.gapiNs.clientNs.Request[CalendarList]
  /** Updates an entry on the user's calendar list. This method supports patch semantics. */
  def patch(request: gapiDotClientDotCalendarLib.Anon_PrettyPrintColorRgbFormatQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[CalendarListEntry]
  /** Updates an entry on the user's calendar list. */
  def update(request: gapiDotClientDotCalendarLib.Anon_PrettyPrintColorRgbFormatQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[CalendarListEntry]
  /** Watch for changes to CalendarList resources. */
  def watch(request: gapiDotClientDotCalendarLib.Anon_MaxResultsPrettyPrintPageToken): gapiDotClientLib.gapiNs.clientNs.Request[Channel]
}

