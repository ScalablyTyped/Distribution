package typings.evernote.anon

import typings.evernote.mod.Types.BusinessInvitationStatus
import typings.evernote.mod.Types.BusinessUserRole
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusinessId extends js.Object {
  
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
  implicit class BusinessIdOps[Self <: BusinessId] (val x: Self) extends AnyVal {
    
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
    def setBusinessId(value: Double): Self = this.set("businessId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessId: Self = this.set("businessId", js.undefined)
    
    @scala.inline
    def setCreated(value: Timestamp): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFromWorkChat(value: Boolean): Self = this.set("fromWorkChat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromWorkChat: Self = this.set("fromWorkChat", js.undefined)
    
    @scala.inline
    def setRequesterId(value: UserID): Self = this.set("requesterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequesterId: Self = this.set("requesterId", js.undefined)
    
    @scala.inline
    def setRole(value: BusinessUserRole): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setStatus(value: BusinessInvitationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
