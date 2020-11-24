package typings.devtoolsProtocol.mod.Protocol.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerMessagesLoggedEvent extends js.Object {
  
  var messages: js.Array[PlayerMessage] = js.native
  
  var playerId: PlayerId = js.native
}
object PlayerMessagesLoggedEvent {
  
  @scala.inline
  def apply(messages: js.Array[PlayerMessage], playerId: PlayerId): PlayerMessagesLoggedEvent = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerMessagesLoggedEvent]
  }
  
  @scala.inline
  implicit class PlayerMessagesLoggedEventOps[Self <: PlayerMessagesLoggedEvent] (val x: Self) extends AnyVal {
    
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
    def setMessagesVarargs(value: PlayerMessage*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[PlayerMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerId(value: PlayerId): Self = this.set("playerId", value.asInstanceOf[js.Any])
  }
}
