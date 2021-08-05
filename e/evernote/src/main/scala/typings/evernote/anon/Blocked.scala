package typings.evernote.anon

import typings.evernote.mod.Types.Contact
import typings.evernote.mod.Types.MessageEventID
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blocked extends StObject {
  
  var blocked: js.UndefOr[Boolean] = js.undefined
  
  var contact: js.UndefOr[Contact] = js.undefined
  
  var deactivated: js.UndefOr[Boolean] = js.undefined
  
  var eventId: js.UndefOr[MessageEventID] = js.undefined
  
  var id: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.undefined
  
  var sameBusiness: js.UndefOr[Boolean] = js.undefined
  
  var userConnected: js.UndefOr[Boolean] = js.undefined
  
  var userId: js.UndefOr[UserID] = js.undefined
}
object Blocked {
  
  inline def apply(): Blocked = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blocked]
  }
  
  extension [Self <: Blocked](x: Self) {
    
    inline def setBlocked(value: Boolean): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    inline def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
    
    inline def setContact(value: Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setDeactivated(value: Boolean): Self = StObject.set(x, "deactivated", value.asInstanceOf[js.Any])
    
    inline def setDeactivatedUndefined: Self = StObject.set(x, "deactivated", js.undefined)
    
    inline def setEventId(value: MessageEventID): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setId(value: typings.evernote.mod.Types.IdentityID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSameBusiness(value: Boolean): Self = StObject.set(x, "sameBusiness", value.asInstanceOf[js.Any])
    
    inline def setSameBusinessUndefined: Self = StObject.set(x, "sameBusiness", js.undefined)
    
    inline def setUserConnected(value: Boolean): Self = StObject.set(x, "userConnected", value.asInstanceOf[js.Any])
    
    inline def setUserConnectedUndefined: Self = StObject.set(x, "userConnected", js.undefined)
    
    inline def setUserId(value: UserID): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
