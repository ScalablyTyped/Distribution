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
    delete: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltCalendarId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltCalendarId, 
      gapiDotClientLib.gapiNs.clientNs.Request[CalendarListEntry]
    ],
    insert: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltColorRgbFormat, 
      gapiDotClientLib.gapiNs.clientNs.Request[CalendarListEntry]
    ],
    list: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[CalendarList]
    ],
    patch: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltCalendarIdColorRgbFormat, 
      gapiDotClientLib.gapiNs.clientNs.Request[CalendarListEntry]
    ],
    update: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltCalendarIdColorRgbFormat, 
      gapiDotClientLib.gapiNs.clientNs.Request[CalendarListEntry]
    ],
    watch: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Channel]
    ]
  ): CalendarListResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, patch = patch, update = update, watch = watch)
  
    __obj.asInstanceOf[CalendarListResource]
  }
}

