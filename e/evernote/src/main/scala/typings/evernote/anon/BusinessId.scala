package typings.evernote.anon

import typings.evernote.mod.Types.BusinessInvitationStatus
import typings.evernote.mod.Types.BusinessUserRole
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusinessId extends StObject {
  
  var businessId: js.UndefOr[Double] = js.native
  
  var created: js.UndefOr[Timestamp] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var fromWorkChat: js.UndefOr[Boolean] = js.native
  
  var requesterId: js.UndefOr[UserID] = js.native
  
  var role: js.UndefOr[BusinessUserRole] = js.native
  
  var status: js.UndefOr[BusinessInvitationStatus] = js.native
}
object BusinessId {
  
  @scala.inline
  def apply(): BusinessId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessId]
  }
  
  @scala.inline
  implicit class BusinessIdMutableBuilder[Self <: BusinessId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusinessId(value: Double): Self = StObject.set(x, "businessId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessIdUndefined: Self = StObject.set(x, "businessId", js.undefined)
    
    @scala.inline
    def setCreated(value: Timestamp): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFromWorkChat(value: Boolean): Self = StObject.set(x, "fromWorkChat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromWorkChatUndefined: Self = StObject.set(x, "fromWorkChat", js.undefined)
    
    @scala.inline
    def setRequesterId(value: UserID): Self = StObject.set(x, "requesterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterIdUndefined: Self = StObject.set(x, "requesterId", js.undefined)
    
    @scala.inline
    def setRole(value: BusinessUserRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setStatus(value: BusinessInvitationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
