package typings.firebaseDatabase.anon

import typings.firebaseDatabase.eventMod.Event
import typings.firebaseDatabase.queryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  var events: js.Array[Event]
  var removed: js.Array[Query]
}

object Events {
  @scala.inline
  def apply(events: js.Array[Event], removed: js.Array[Query]): Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
}

