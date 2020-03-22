package typings.gapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCalendar.AnonAlwaysIncludeEmail
import typings.gapiClientCalendar.AnonDestination
import typings.gapiClientCalendar.AnonEventId
import typings.gapiClientCalendar.AnonICalUID
import typings.gapiClientCalendar.AnonMaxAttendees
import typings.gapiClientCalendar.AnonMaxResults
import typings.gapiClientCalendar.AnonQuotaUser
import typings.gapiClientCalendar.AnonSendNotifications
import typings.gapiClientCalendar.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResource extends js.Object {
  /** Deletes an event. */
  def delete(request: AnonEventId): Request_[Unit]
  /** Returns an event. */
  def get(request: AnonAlwaysIncludeEmail): Request_[Event]
  /** Imports an event. This operation is used to add a private copy of an existing event to a calendar. */
  def `import`(request: AnonQuotaUser): Request_[Event]
  /** Creates an event. */
  def insert(request: AnonMaxAttendees): Request_[Event]
  /** Returns instances of the specified recurring event. */
  def instances(request: AnonMaxResults): Request_[Events]
  /** Returns events on the specified calendar. */
  def list(request: AnonICalUID): Request_[Events]
  /** Moves an event to another calendar, i.e. changes an event's organizer. */
  def move(request: AnonDestination): Request_[Event]
  /** Updates an event. This method supports patch semantics. */
  def patch(request: AnonSendNotifications): Request_[Event]
  /** Creates an event based on a simple text string. */
  def quickAdd(request: AnonText): Request_[Event]
  /** Updates an event. */
  def update(request: AnonSendNotifications): Request_[Event]
  /** Watch for changes to Events resources. */
  def watch(request: AnonICalUID): Request_[Channel]
}

object EventsResource {
  @scala.inline
  def apply(
    delete: AnonEventId => Request_[Unit],
    get: AnonAlwaysIncludeEmail => Request_[Event],
    `import`: AnonQuotaUser => Request_[Event],
    insert: AnonMaxAttendees => Request_[Event],
    instances: AnonMaxResults => Request_[Events],
    list: AnonICalUID => Request_[Events],
    move: AnonDestination => Request_[Event],
    patch: AnonSendNotifications => Request_[Event],
    quickAdd: AnonText => Request_[Event],
    update: AnonSendNotifications => Request_[Event],
    watch: AnonICalUID => Request_[Channel]
  ): EventsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), instances = js.Any.fromFunction1(instances), list = js.Any.fromFunction1(list), move = js.Any.fromFunction1(move), patch = js.Any.fromFunction1(patch), quickAdd = js.Any.fromFunction1(quickAdd), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[EventsResource]
  }
}

