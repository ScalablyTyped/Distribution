package typings.evernote.anon

import typings.evernote.mod.Types.Contact
import typings.evernote.mod.Types.MessageEventID
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blocked extends StObject {
  
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
  implicit class BlockedMutableBuilder[Self <: Blocked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocked(value: Boolean): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
    
    @scala.inline
    def setContact(value: Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setDeactivated(value: Boolean): Self = StObject.set(x, "deactivated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeactivatedUndefined: Self = StObject.set(x, "deactivated", js.undefined)
    
    @scala.inline
    def setEventId(value: MessageEventID): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    @scala.inline
    def setId(value: typings.evernote.mod.Types.IdentityID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSameBusiness(value: Boolean): Self = StObject.set(x, "sameBusiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSameBusinessUndefined: Self = StObject.set(x, "sameBusiness", js.undefined)
    
    @scala.inline
    def setUserConnected(value: Boolean): Self = StObject.set(x, "userConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserConnectedUndefined: Self = StObject.set(x, "userConnected", js.undefined)
    
    @scala.inline
    def setUserId(value: UserID): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
