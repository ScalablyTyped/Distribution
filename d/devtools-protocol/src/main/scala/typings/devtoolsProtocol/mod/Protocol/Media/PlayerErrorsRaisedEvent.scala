package typings.devtoolsProtocol.mod.Protocol.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerErrorsRaisedEvent extends js.Object {
  
  var errors: js.Array[PlayerError] = js.native
  
  var playerId: PlayerId = js.native
}
object PlayerErrorsRaisedEvent {
  
  @scala.inline
  def apply(errors: js.Array[PlayerError], playerId: PlayerId): PlayerErrorsRaisedEvent = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerErrorsRaisedEvent]
  }
  
  @scala.inline
  implicit class PlayerErrorsRaisedEventOps[Self <: PlayerErrorsRaisedEvent] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: PlayerError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[PlayerError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerId(value: PlayerId): Self = this.set("playerId", value.asInstanceOf[js.Any])
  }
}
