package typings.gapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCalendar.AnonAltCalendarId
import typings.gapiClientCalendar.AnonAltCalendarIdColorRgbFormat
import typings.gapiClientCalendar.AnonAltColorRgbFormat
import typings.gapiClientCalendar.AnonAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListResource extends js.Object {
  /** Deletes an entry on the user's calendar list. */
  def delete(request: AnonAltCalendarId): Request_[Unit]
  /** Returns an entry on the user's calendar list. */
  def get(request: AnonAltCalendarId): Request_[CalendarListEntry]
  /** Adds an entry to the user's calendar list. */
  def insert(request: AnonAltColorRgbFormat): Request_[CalendarListEntry]
  /** Returns entries on the user's calendar list. */
  def list(request: AnonAltFields): Request_[CalendarList]
  /** Updates an entry on the user's calendar list. This method supports patch semantics. */
  def patch(request: AnonAltCalendarIdColorRgbFormat): Request_[CalendarListEntry]
  /** Updates an entry on the user's calendar list. */
  def update(request: AnonAltCalendarIdColorRgbFormat): Request_[CalendarListEntry]
  /** Watch for changes to CalendarList resources. */
  def watch(request: AnonAltFields): Request_[Channel]
}

object CalendarListResource {
  @scala.inline
  def apply(
    delete: AnonAltCalendarId => Request_[Unit],
    get: AnonAltCalendarId => Request_[CalendarListEntry],
    insert: AnonAltColorRgbFormat => Request_[CalendarListEntry],
    list: AnonAltFields => Request_[CalendarList],
    patch: AnonAltCalendarIdColorRgbFormat => Request_[CalendarListEntry],
    update: AnonAltCalendarIdColorRgbFormat => Request_[CalendarListEntry],
    watch: AnonAltFields => Request_[Channel]
  ): CalendarListResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[CalendarListResource]
  }
}

