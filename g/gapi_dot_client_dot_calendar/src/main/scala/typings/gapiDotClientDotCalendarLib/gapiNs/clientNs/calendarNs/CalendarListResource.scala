package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListResource extends js.Object {
  /** Deletes an entry on the user's calendar list. */
  def delete(request: gapiDotClientDotCalendarLib.Anon_AltCalendarId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns an entry on the user's calendar list. */
  def get(request: gapiDotClientDotCalendarLib.Anon_AltCalendarId): gapiDotClientLib.gapiNs.clientNs.Request[CalendarListEntry]
  /** Adds an entry to the user's calendar list. */
  def insert(request: gapiDotClientDotCalendarLib.Anon_AltColorRgbFormat): gapiDotClientLib.gapiNs.clientNs.Request[CalendarListEntry]
  /** Returns entries on the user's calendar list. */
  def list(request: gapiDotClientDotCalendarLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[CalendarList]
  /** Updates an entry on the user's calendar list. This method supports patch semantics. */
  def patch(request: gapiDotClientDotCalendarLib.Anon_AltCalendarIdColorRgbFormat): gapiDotClientLib.gapiNs.clientNs.Request[CalendarListEntry]
  /** Updates an entry on the user's calendar list. */
  def update(request: gapiDotClientDotCalendarLib.Anon_AltCalendarIdColorRgbFormat): gapiDotClientLib.gapiNs.clientNs.Request[CalendarListEntry]
  /** Watch for changes to CalendarList resources. */
  def watch(request: gapiDotClientDotCalendarLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Channel]
}

object CalendarListResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotCalendarLib.Anon_AltCalendarId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotCalendarLib.Anon_AltCalendarId => gapiDotClientLib.gapiNs.clientNs.Request[CalendarListEntry],
    insert: gapiDotClientDotCalendarLib.Anon_AltColorRgbFormat => gapiDotClientLib.gapiNs.clientNs.Request[CalendarListEntry],
    list: gapiDotClientDotCalendarLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[CalendarList],
    patch: gapiDotClientDotCalendarLib.Anon_AltCalendarIdColorRgbFormat => gapiDotClientLib.gapiNs.clientNs.Request[CalendarListEntry],
    update: gapiDotClientDotCalendarLib.Anon_AltCalendarIdColorRgbFormat => gapiDotClientLib.gapiNs.clientNs.Request[CalendarListEntry],
    watch: gapiDotClientDotCalendarLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Channel]
  ): CalendarListResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[CalendarListResource]
  }
}

