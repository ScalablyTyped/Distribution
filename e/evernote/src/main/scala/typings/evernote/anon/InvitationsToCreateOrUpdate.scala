package typings.evernote.anon

import typings.evernote.mod.NoteStore.InvitationShareRelationship
import typings.evernote.mod.NoteStore.MemberShareRelationship
import typings.evernote.mod.Types.UserIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvitationsToCreateOrUpdate extends StObject {
  
  var invitationsToCreateOrUpdate: js.UndefOr[js.Array[InvitationShareRelationship]] = js.undefined
  
  var inviteMessage: js.UndefOr[String] = js.undefined
  
  var membershipsToUpdate: js.UndefOr[js.Array[MemberShareRelationship]] = js.undefined
  
  var notebookGuid: js.UndefOr[String] = js.undefined
  
  var unshares: js.UndefOr[js.Array[UserIdentity]] = js.undefined
}
object InvitationsToCreateOrUpdate {
  
  inline def apply(): InvitationsToCreateOrUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitationsToCreateOrUpdate]
  }
  
  extension [Self <: InvitationsToCreateOrUpdate](x: Self) {
    
    inline def setInvitationsToCreateOrUpdate(value: js.Array[InvitationShareRelationship]): Self = StObject.set(x, "invitationsToCreateOrUpdate", value.asInstanceOf[js.Any])
    
    inline def setInvitationsToCreateOrUpdateUndefined: Self = StObject.set(x, "invitationsToCreateOrUpdate", js.undefined)
    
    inline def setInvitationsToCreateOrUpdateVarargs(value: InvitationShareRelationship*): Self = StObject.set(x, "invitationsToCreateOrUpdate", js.Array(value*))
    
    inline def setInviteMessage(value: String): Self = StObject.set(x, "inviteMessage", value.asInstanceOf[js.Any])
    
    inline def setInviteMessageUndefined: Self = StObject.set(x, "inviteMessage", js.undefined)
    
    inline def setMembershipsToUpdate(value: js.Array[MemberShareRelationship]): Self = StObject.set(x, "membershipsToUpdate", value.asInstanceOf[js.Any])
    
    inline def setMembershipsToUpdateUndefined: Self = StObject.set(x, "membershipsToUpdate", js.undefined)
    
    inline def setMembershipsToUpdateVarargs(value: MemberShareRelationship*): Self = StObject.set(x, "membershipsToUpdate", js.Array(value*))
    
    inline def setNotebookGuid(value: String): Self = StObject.set(x, "notebookGuid", value.asInstanceOf[js.Any])
    
    inline def setNotebookGuidUndefined: Self = StObject.set(x, "notebookGuid", js.undefined)
    
    inline def setUnshares(value: js.Array[UserIdentity]): Self = StObject.set(x, "unshares", value.asInstanceOf[js.Any])
    
    inline def setUnsharesUndefined: Self = StObject.set(x, "unshares", js.undefined)
    
    inline def setUnsharesVarargs(value: UserIdentity*): Self = StObject.set(x, "unshares", js.Array(value*))
  }
}
