package typings.expressSocketIoSession.mod.socketIoAugmentingMod

import typings.expressSocketIoSession.anon.SessionPartialSessionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handshake extends js.Object {
  
  var session: js.UndefOr[SessionPartialSessionData] = js.native
  
  var sessionID: js.UndefOr[String] = js.native
}
object Handshake {
  
  @scala.inline
  def apply(): Handshake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Handshake]
  }
  
  @scala.inline
  implicit class HandshakeOps[Self <: Handshake] (val x: Self) extends AnyVal {
    
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
    def setSession(value: SessionPartialSessionData): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setSessionID(value: String): Self = this.set("sessionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionID: Self = this.set("sessionID", js.undefined)
  }
}
