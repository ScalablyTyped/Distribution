package typings.evernote.anon

import typings.evernote.mod.Types.BusinessInvitationStatus
import typings.evernote.mod.Types.BusinessUserRole
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessId extends StObject {
  
  var businessId: js.UndefOr[Double] = js.undefined
  
  var created: js.UndefOr[Timestamp] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var fromWorkChat: js.UndefOr[Boolean] = js.undefined
  
  var requesterId: js.UndefOr[UserID] = js.undefined
  
  var role: js.UndefOr[BusinessUserRole] = js.undefined
  
  var status: js.UndefOr[BusinessInvitationStatus] = js.undefined
}
object BusinessId {
  
  inline def apply(): BusinessId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BusinessId] (val x: Self) extends AnyVal {
    
    inline def setBusinessId(value: Double): Self = StObject.set(x, "businessId", value.asInstanceOf[js.Any])
    
    inline def setBusinessIdUndefined: Self = StObject.set(x, "businessId", js.undefined)
    
    inline def setCreated(value: Timestamp): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFromWorkChat(value: Boolean): Self = StObject.set(x, "fromWorkChat", value.asInstanceOf[js.Any])
    
    inline def setFromWorkChatUndefined: Self = StObject.set(x, "fromWorkChat", js.undefined)
    
    inline def setRequesterId(value: UserID): Self = StObject.set(x, "requesterId", value.asInstanceOf[js.Any])
    
    inline def setRequesterIdUndefined: Self = StObject.set(x, "requesterId", js.undefined)
    
    inline def setRole(value: BusinessUserRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setStatus(value: BusinessInvitationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
