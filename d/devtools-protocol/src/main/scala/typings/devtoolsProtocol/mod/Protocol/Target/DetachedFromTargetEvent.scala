package typings.devtoolsProtocol.mod.Protocol.Target

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachedFromTargetEvent extends js.Object {
  
  /**
    * Detached session identifier.
    */
  var sessionId: SessionID = js.native
  
  /**
    * Deprecated.
    */
  var targetId: js.UndefOr[TargetID] = js.native
}
object DetachedFromTargetEvent {
  
  @scala.inline
  def apply(sessionId: SessionID): DetachedFromTargetEvent = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachedFromTargetEvent]
  }
  
  @scala.inline
  implicit class DetachedFromTargetEventOps[Self <: DetachedFromTargetEvent] (val x: Self) extends AnyVal {
    
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
    def setSessionId(value: SessionID): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: TargetID): Self = this.set("targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
  }
}
