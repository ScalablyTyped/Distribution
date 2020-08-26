package typings.devtoolsProtocol.mod.Protocol.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayersCreatedEvent extends js.Object {
  var players: js.Array[PlayerId] = js.native
}

object PlayersCreatedEvent {
  @scala.inline
  def apply(players: js.Array[PlayerId]): PlayersCreatedEvent = {
    val __obj = js.Dynamic.literal(players = players.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayersCreatedEvent]
  }
  @scala.inline
  implicit class PlayersCreatedEventOps[Self <: PlayersCreatedEvent] (val x: Self) extends AnyVal {
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
    def setPlayersVarargs(value: PlayerId*): Self = this.set("players", js.Array(value :_*))
    @scala.inline
    def setPlayers(value: js.Array[PlayerId]): Self = this.set("players", value.asInstanceOf[js.Any])
  }
  
}

