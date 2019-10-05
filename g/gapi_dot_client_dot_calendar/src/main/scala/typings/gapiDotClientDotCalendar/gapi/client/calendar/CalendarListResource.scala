package typings.gapiDotClientDotCalendar.gapi.client.calendar

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCalendar.Anon_AltCalendarId
import typings.gapiDotClientDotCalendar.Anon_AltCalendarIdColorRgbFormat
import typings.gapiDotClientDotCalendar.Anon_AltColorRgbFormat
import typings.gapiDotClientDotCalendar.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListResource extends js.Object {
  /** Deletes an entry on the user's calendar list. */
  def delete(request: Anon_AltCalendarId): Request[Unit]
  /** Returns an entry on the user's calendar list. */
  def get(request: Anon_AltCalendarId): Request[CalendarListEntry]
  /** Adds an entry to the user's calendar list. */
  def insert(request: Anon_AltColorRgbFormat): Request[CalendarListEntry]
  /** Returns entries on the user's calendar list. */
  def list(request: Anon_AltFields): Request[CalendarList]
  /** Updates an entry on the user's calendar list. This method supports patch semantics. */
  def patch(request: Anon_AltCalendarIdColorRgbFormat): Request[CalendarListEntry]
  /** Updates an entry on the user's calendar list. */
  def update(request: Anon_AltCalendarIdColorRgbFormat): Request[CalendarListEntry]
  /** Watch for changes to CalendarList resources. */
  def watch(request: Anon_AltFields): Request[Channel]
}

object CalendarListResource {
  @scala.inline
  def apply(
    delete: Anon_AltCalendarId => Request[Unit],
    get: Anon_AltCalendarId => Request[CalendarListEntry],
    insert: Anon_AltColorRgbFormat => Request[CalendarListEntry],
    list: Anon_AltFields => Request[CalendarList],
    patch: Anon_AltCalendarIdColorRgbFormat => Request[CalendarListEntry],
    update: Anon_AltCalendarIdColorRgbFormat => Request[CalendarListEntry],
    watch: Anon_AltFields => Request[Channel]
  ): CalendarListResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[CalendarListResource]
  }
}

