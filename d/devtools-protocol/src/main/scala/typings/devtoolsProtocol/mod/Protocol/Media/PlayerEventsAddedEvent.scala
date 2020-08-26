package typings.devtoolsProtocol.mod.Protocol.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerEventsAddedEvent extends js.Object {
  var events: js.Array[PlayerEvent] = js.native
  var playerId: PlayerId = js.native
}

object PlayerEventsAddedEvent {
  @scala.inline
  def apply(events: js.Array[PlayerEvent], playerId: PlayerId): PlayerEventsAddedEvent = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerEventsAddedEvent]
  }
  @scala.inline
  implicit class PlayerEventsAddedEventOps[Self <: PlayerEventsAddedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventsVarargs(value: PlayerEvent*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[PlayerEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayerId(value: PlayerId): Self = this.set("playerId", value.asInstanceOf[js.Any])
  }
  
}

