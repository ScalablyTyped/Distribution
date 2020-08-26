package typings.devtoolsProtocol.mod.Protocol.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerPropertiesChangedEvent extends js.Object {
  var playerId: PlayerId = js.native
  var properties: js.Array[PlayerProperty] = js.native
}

object PlayerPropertiesChangedEvent {
  @scala.inline
  def apply(playerId: PlayerId, properties: js.Array[PlayerProperty]): PlayerPropertiesChangedEvent = {
    val __obj = js.Dynamic.literal(playerId = playerId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerPropertiesChangedEvent]
  }
  @scala.inline
  implicit class PlayerPropertiesChangedEventOps[Self <: PlayerPropertiesChangedEvent] (val x: Self) extends AnyVal {
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
    def setPlayerId(value: PlayerId): Self = this.set("playerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertiesVarargs(value: PlayerProperty*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[PlayerProperty]): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
  
}

