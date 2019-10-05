package typings.gapiDotClientDotCalendar.gapi.client.calendar

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCalendar.Anon_AltCalendarId
import typings.gapiDotClientDotCalendar.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarsResource extends js.Object {
  /** Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account. */
  def clear(request: Anon_AltCalendarId): Request[Unit]
  /** Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars. */
  def delete(request: Anon_AltCalendarId): Request[Unit]
  /** Returns metadata for a calendar. */
  def get(request: Anon_AltCalendarId): Request[Calendar]
  /** Creates a secondary calendar. */
  def insert(request: Anon_AltFieldsKey): Request[Calendar]
  /** Updates metadata for a calendar. This method supports patch semantics. */
  def patch(request: Anon_AltCalendarId): Request[Calendar]
  /** Updates metadata for a calendar. */
  def update(request: Anon_AltCalendarId): Request[Calendar]
}

object CalendarsResource {
  @scala.inline
  def apply(
    clear: Anon_AltCalendarId => Request[Unit],
    delete: Anon_AltCalendarId => Request[Unit],
    get: Anon_AltCalendarId => Request[Calendar],
    insert: Anon_AltFieldsKey => Request[Calendar],
    patch: Anon_AltCalendarId => Request[Calendar],
    update: Anon_AltCalendarId => Request[Calendar]
  ): CalendarsResource = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CalendarsResource]
  }
}

