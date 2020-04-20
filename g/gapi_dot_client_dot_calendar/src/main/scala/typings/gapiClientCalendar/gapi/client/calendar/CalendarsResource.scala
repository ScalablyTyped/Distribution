package typings.gapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCalendar.AnonCalendarId
import typings.gapiClientCalendar.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarsResource extends js.Object {
  /** Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account. */
  def clear(request: AnonCalendarId): Request_[Unit]
  /** Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars. */
  def delete(request: AnonCalendarId): Request_[Unit]
  /** Returns metadata for a calendar. */
  def get(request: AnonCalendarId): Request_[Calendar]
  /** Creates a secondary calendar. */
  def insert(request: AnonPrettyPrint): Request_[Calendar]
  /** Updates metadata for a calendar. This method supports patch semantics. */
  def patch(request: AnonCalendarId): Request_[Calendar]
  /** Updates metadata for a calendar. */
  def update(request: AnonCalendarId): Request_[Calendar]
}

object CalendarsResource {
  @scala.inline
  def apply(
    clear: AnonCalendarId => Request_[Unit],
    delete: AnonCalendarId => Request_[Unit],
    get: AnonCalendarId => Request_[Calendar],
    insert: AnonPrettyPrint => Request_[Calendar],
    patch: AnonCalendarId => Request_[Calendar],
    update: AnonCalendarId => Request_[Calendar]
  ): CalendarsResource = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CalendarsResource]
  }
}

