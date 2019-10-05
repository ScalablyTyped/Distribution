package typings.gapiDotClientDotCalendar.gapi.client.calendar

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCalendar.Anon_AltAlwaysIncludeEmail
import typings.gapiDotClientDotCalendar.Anon_AltAlwaysIncludeEmailCalendarId
import typings.gapiDotClientDotCalendar.Anon_AltAlwaysIncludeEmailCalendarIdEventId
import typings.gapiDotClientDotCalendar.Anon_AltAlwaysIncludeEmailCalendarIdFields
import typings.gapiDotClientDotCalendar.Anon_AltCalendarIdDestination
import typings.gapiDotClientDotCalendar.Anon_AltCalendarIdEventId
import typings.gapiDotClientDotCalendar.Anon_AltCalendarIdFieldsKey
import typings.gapiDotClientDotCalendar.Anon_AltCalendarIdFieldsKeyMaxAttendees
import typings.gapiDotClientDotCalendar.Anon_AltCalendarIdFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResource extends js.Object {
  /** Deletes an event. */
  def delete(request: Anon_AltCalendarIdEventId): Request[Unit]
  /** Returns an event. */
  def get(request: Anon_AltAlwaysIncludeEmail): Request[Event]
  /** Imports an event. This operation is used to add a private copy of an existing event to a calendar. */
  def `import`(request: Anon_AltCalendarIdFieldsKey): Request[Event]
  /** Creates an event. */
  def insert(request: Anon_AltCalendarIdFieldsKeyMaxAttendees): Request[Event]
  /** Returns instances of the specified recurring event. */
  def instances(request: Anon_AltAlwaysIncludeEmailCalendarId): Request[Events]
  /** Returns events on the specified calendar. */
  def list(request: Anon_AltAlwaysIncludeEmailCalendarIdFields): Request[Events]
  /** Moves an event to another calendar, i.e. changes an event's organizer. */
  def move(request: Anon_AltCalendarIdDestination): Request[Event]
  /** Updates an event. This method supports patch semantics. */
  def patch(request: Anon_AltAlwaysIncludeEmailCalendarIdEventId): Request[Event]
  /** Creates an event based on a simple text string. */
  def quickAdd(request: Anon_AltCalendarIdFieldsKeyOauthtoken): Request[Event]
  /** Updates an event. */
  def update(request: Anon_AltAlwaysIncludeEmailCalendarIdEventId): Request[Event]
  /** Watch for changes to Events resources. */
  def watch(request: Anon_AltAlwaysIncludeEmailCalendarIdFields): Request[Channel]
}

object EventsResource {
  @scala.inline
  def apply(
    delete: Anon_AltCalendarIdEventId => Request[Unit],
    get: Anon_AltAlwaysIncludeEmail => Request[Event],
    `import`: Anon_AltCalendarIdFieldsKey => Request[Event],
    insert: Anon_AltCalendarIdFieldsKeyMaxAttendees => Request[Event],
    instances: Anon_AltAlwaysIncludeEmailCalendarId => Request[Events],
    list: Anon_AltAlwaysIncludeEmailCalendarIdFields => Request[Events],
    move: Anon_AltCalendarIdDestination => Request[Event],
    patch: Anon_AltAlwaysIncludeEmailCalendarIdEventId => Request[Event],
    quickAdd: Anon_AltCalendarIdFieldsKeyOauthtoken => Request[Event],
    update: Anon_AltAlwaysIncludeEmailCalendarIdEventId => Request[Event],
    watch: Anon_AltAlwaysIncludeEmailCalendarIdFields => Request[Channel]
  ): EventsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), instances = js.Any.fromFunction1(instances), list = js.Any.fromFunction1(list), move = js.Any.fromFunction1(move), patch = js.Any.fromFunction1(patch), quickAdd = js.Any.fromFunction1(quickAdd), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[EventsResource]
  }
}

