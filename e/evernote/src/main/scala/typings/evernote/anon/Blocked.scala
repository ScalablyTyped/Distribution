package typings.evernote.anon

import typings.evernote.mod.Types.Contact
import typings.evernote.mod.Types.MessageEventID
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blocked extends js.Object {
  
  var blocked: js.UndefOr[Boolean] = js.native
  
  var contact: js.UndefOr[Contact] = js.native
  
  var deactivated: js.UndefOr[Boolean] = js.native
  
  var eventId: js.UndefOr[MessageEventID] = js.native
  
  var id: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.native
  
  var sameBusiness: js.UndefOr[Boolean] = js.native
  
  var userConnected: js.UndefOr[Boolean] = js.native
  
  var userId: js.UndefOr[UserID] = js.native
}
object Blocked {
  
  @scala.inline
  def apply(): Blocked = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blocked]
  }
  
  @scala.inline
  implicit class BlockedOps[Self <: Blocked] (val x: Self) extends AnyVal {
    
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
    def setBlocked(value: Boolean): Self = this.set("blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocked: Self = this.set("blocked", js.undefined)
    
    @scala.inline
    def setContact(value: Contact): Self = this.set("contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    
    @scala.inline
    def setDeactivated(value: Boolean): Self = this.set("deactivated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeactivated: Self = this.set("deactivated", js.undefined)
    
    @scala.inline
    def setEventId(value: MessageEventID): Self = this.set("eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventId: Self = this.set("eventId", js.undefined)
    
    @scala.inline
    def setId(value: typings.evernote.mod.Types.IdentityID): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setSameBusiness(value: Boolean): Self = this.set("sameBusiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSameBusiness: Self = this.set("sameBusiness", js.undefined)
    
    @scala.inline
    def setUserConnected(value: Boolean): Self = this.set("userConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserConnected: Self = this.set("userConnected", js.undefined)
    
    @scala.inline
    def setUserId(value: UserID): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
