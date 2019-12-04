package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distSrcApiQueryMod.Query
import typings.atFirebaseDatabase.distSrcCoreViewEventMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Events extends js.Object {
  var events: js.Array[Event]
  var removed: js.Array[Query]
}

object Anon_Events {
  @scala.inline
  def apply(events: js.Array[Event], removed: js.Array[Query]): Anon_Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Events]
  }
}

