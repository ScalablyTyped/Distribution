package typings.gapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCalendar.AnonAltAlwaysIncludeEmail
import typings.gapiClientCalendar.AnonAltAlwaysIncludeEmailCalendarId
import typings.gapiClientCalendar.AnonAltAlwaysIncludeEmailCalendarIdEventId
import typings.gapiClientCalendar.AnonAltAlwaysIncludeEmailCalendarIdFields
import typings.gapiClientCalendar.AnonAltCalendarIdDestination
import typings.gapiClientCalendar.AnonAltCalendarIdEventId
import typings.gapiClientCalendar.AnonAltCalendarIdFieldsKey
import typings.gapiClientCalendar.AnonAltCalendarIdFieldsKeyMaxAttendees
import typings.gapiClientCalendar.AnonAltCalendarIdFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResource extends js.Object {
  /** Deletes an event. */
  def delete(request: AnonAltCalendarIdEventId): Request_[Unit]
  /** Returns an event. */
  def get(request: AnonAltAlwaysIncludeEmail): Request_[Event]
  /** Imports an event. This operation is used to add a private copy of an existing event to a calendar. */
  def `import`(request: AnonAltCalendarIdFieldsKey): Request_[Event]
  /** Creates an event. */
  def insert(request: AnonAltCalendarIdFieldsKeyMaxAttendees): Request_[Event]
  /** Returns instances of the specified recurring event. */
  def instances(request: AnonAltAlwaysIncludeEmailCalendarId): Request_[Events]
  /** Returns events on the specified calendar. */
  def list(request: AnonAltAlwaysIncludeEmailCalendarIdFields): Request_[Events]
  /** Moves an event to another calendar, i.e. changes an event's organizer. */
  def move(request: AnonAltCalendarIdDestination): Request_[Event]
  /** Updates an event. This method supports patch semantics. */
  def patch(request: AnonAltAlwaysIncludeEmailCalendarIdEventId): Request_[Event]
  /** Creates an event based on a simple text string. */
  def quickAdd(request: AnonAltCalendarIdFieldsKeyOauthtoken): Request_[Event]
  /** Updates an event. */
  def update(request: AnonAltAlwaysIncludeEmailCalendarIdEventId): Request_[Event]
  /** Watch for changes to Events resources. */
  def watch(request: AnonAltAlwaysIncludeEmailCalendarIdFields): Request_[Channel]
}

object EventsResource {
  @scala.inline
  def apply(
    delete: AnonAltCalendarIdEventId => Request_[Unit],
    get: AnonAltAlwaysIncludeEmail => Request_[Event],
    `import`: AnonAltCalendarIdFieldsKey => Request_[Event],
    insert: AnonAltCalendarIdFieldsKeyMaxAttendees => Request_[Event],
    instances: AnonAltAlwaysIncludeEmailCalendarId => Request_[Events],
    list: AnonAltAlwaysIncludeEmailCalendarIdFields => Request_[Events],
    move: AnonAltCalendarIdDestination => Request_[Event],
    patch: AnonAltAlwaysIncludeEmailCalendarIdEventId => Request_[Event],
    quickAdd: AnonAltCalendarIdFieldsKeyOauthtoken => Request_[Event],
    update: AnonAltAlwaysIncludeEmailCalendarIdEventId => Request_[Event],
    watch: AnonAltAlwaysIncludeEmailCalendarIdFields => Request_[Channel]
  ): EventsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), instances = js.Any.fromFunction1(instances), list = js.Any.fromFunction1(list), move = js.Any.fromFunction1(move), patch = js.Any.fromFunction1(patch), quickAdd = js.Any.fromFunction1(quickAdd), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[EventsResource]
  }
}

