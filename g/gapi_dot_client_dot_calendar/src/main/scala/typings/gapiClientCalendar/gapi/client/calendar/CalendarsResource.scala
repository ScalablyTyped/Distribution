package typings.gapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCalendar.AnonAltCalendarId
import typings.gapiClientCalendar.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarsResource extends js.Object {
  /** Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account. */
  def clear(request: AnonAltCalendarId): Request_[Unit]
  /** Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars. */
  def delete(request: AnonAltCalendarId): Request_[Unit]
  /** Returns metadata for a calendar. */
  def get(request: AnonAltCalendarId): Request_[Calendar]
  /** Creates a secondary calendar. */
  def insert(request: AnonAltFieldsKey): Request_[Calendar]
  /** Updates metadata for a calendar. This method supports patch semantics. */
  def patch(request: AnonAltCalendarId): Request_[Calendar]
  /** Updates metadata for a calendar. */
  def update(request: AnonAltCalendarId): Request_[Calendar]
}

object CalendarsResource {
  @scala.inline
  def apply(
    clear: AnonAltCalendarId => Request_[Unit],
    delete: AnonAltCalendarId => Request_[Unit],
    get: AnonAltCalendarId => Request_[Calendar],
    insert: AnonAltFieldsKey => Request_[Calendar],
    patch: AnonAltCalendarId => Request_[Calendar],
    update: AnonAltCalendarId => Request_[Calendar]
  ): CalendarsResource = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CalendarsResource]
  }
}

