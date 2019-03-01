package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResource extends js.Object {
  /** Deletes an event. */
  def delete(request: gapiDotClientDotCalendarLib.Anon_AltCalendarIdEventId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns an event. */
  def get(request: gapiDotClientDotCalendarLib.Anon_AltAlwaysIncludeEmail): gapiDotClientLib.gapiNs.clientNs.Request[Event]
  /** Imports an event. This operation is used to add a private copy of an existing event to a calendar. */
  def `import`(request: gapiDotClientDotCalendarLib.Anon_AltCalendarIdFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Event]
  /** Creates an event. */
  def insert(request: gapiDotClientDotCalendarLib.Anon_AltCalendarIdFieldsKeyMaxAttendees): gapiDotClientLib.gapiNs.clientNs.Request[Event]
  /** Returns instances of the specified recurring event. */
  def instances(request: gapiDotClientDotCalendarLib.Anon_AltAlwaysIncludeEmailCalendarId): gapiDotClientLib.gapiNs.clientNs.Request[Events]
  /** Returns events on the specified calendar. */
  def list(request: gapiDotClientDotCalendarLib.Anon_AltAlwaysIncludeEmailCalendarIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Events]
  /** Moves an event to another calendar, i.e. changes an event's organizer. */
  def move(request: gapiDotClientDotCalendarLib.Anon_AltCalendarIdDestination): gapiDotClientLib.gapiNs.clientNs.Request[Event]
  /** Updates an event. This method supports patch semantics. */
  def patch(request: gapiDotClientDotCalendarLib.Anon_AltAlwaysIncludeEmailCalendarIdEventId): gapiDotClientLib.gapiNs.clientNs.Request[Event]
  /** Creates an event based on a simple text string. */
  def quickAdd(request: gapiDotClientDotCalendarLib.Anon_AltCalendarIdFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Event]
  /** Updates an event. */
  def update(request: gapiDotClientDotCalendarLib.Anon_AltAlwaysIncludeEmailCalendarIdEventId): gapiDotClientLib.gapiNs.clientNs.Request[Event]
  /** Watch for changes to Events resources. */
  def watch(request: gapiDotClientDotCalendarLib.Anon_AltAlwaysIncludeEmailCalendarIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Channel]
}

object EventsResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltCalendarIdEventId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltAlwaysIncludeEmail, 
      gapiDotClientLib.gapiNs.clientNs.Request[Event]
    ],
    `import`: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltCalendarIdFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Event]
    ],
    insert: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltCalendarIdFieldsKeyMaxAttendees, 
      gapiDotClientLib.gapiNs.clientNs.Request[Event]
    ],
    instances: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltAlwaysIncludeEmailCalendarId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Events]
    ],
    list: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltAlwaysIncludeEmailCalendarIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Events]
    ],
    move: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltCalendarIdDestination, 
      gapiDotClientLib.gapiNs.clientNs.Request[Event]
    ],
    patch: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltAlwaysIncludeEmailCalendarIdEventId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Event]
    ],
    quickAdd: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltCalendarIdFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Event]
    ],
    update: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltAlwaysIncludeEmailCalendarIdEventId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Event]
    ],
    watch: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltAlwaysIncludeEmailCalendarIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Channel]
    ]
  ): EventsResource = {
    val __obj = js.Dynamic.literal(`import` = `import`)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("instances")(instances)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("move")(move)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("quickAdd")(quickAdd)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[EventsResource]
  }
}

