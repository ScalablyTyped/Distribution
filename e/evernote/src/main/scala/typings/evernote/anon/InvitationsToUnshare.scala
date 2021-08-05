package typings.evernote.anon

import typings.evernote.mod.NoteStore.NoteInvitationShareRelationship
import typings.evernote.mod.NoteStore.NoteMemberShareRelationship
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvitationsToUnshare extends StObject {
  
  var invitationsToUnshare: js.UndefOr[js.Array[typings.evernote.mod.Types.IdentityID]] = js.undefined
  
  var invitationsToUpdate: js.UndefOr[js.Array[NoteInvitationShareRelationship]] = js.undefined
  
  var membershipsToUnshare: js.UndefOr[js.Array[UserID]] = js.undefined
  
  var membershipsToUpdate: js.UndefOr[js.Array[NoteMemberShareRelationship]] = js.undefined
  
  var noteGuid: js.UndefOr[String] = js.undefined
}
object InvitationsToUnshare {
  
  inline def apply(): InvitationsToUnshare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitationsToUnshare]
  }
  
  extension [Self <: InvitationsToUnshare](x: Self) {
    
    inline def setInvitationsToUnshare(value: js.Array[typings.evernote.mod.Types.IdentityID]): Self = StObject.set(x, "invitationsToUnshare", value.asInstanceOf[js.Any])
    
    inline def setInvitationsToUnshareUndefined: Self = StObject.set(x, "invitationsToUnshare", js.undefined)
    
    inline def setInvitationsToUnshareVarargs(value: typings.evernote.mod.Types.IdentityID*): Self = StObject.set(x, "invitationsToUnshare", js.Array(value :_*))
    
    inline def setInvitationsToUpdate(value: js.Array[NoteInvitationShareRelationship]): Self = StObject.set(x, "invitationsToUpdate", value.asInstanceOf[js.Any])
    
    inline def setInvitationsToUpdateUndefined: Self = StObject.set(x, "invitationsToUpdate", js.undefined)
    
    inline def setInvitationsToUpdateVarargs(value: NoteInvitationShareRelationship*): Self = StObject.set(x, "invitationsToUpdate", js.Array(value :_*))
    
    inline def setMembershipsToUnshare(value: js.Array[UserID]): Self = StObject.set(x, "membershipsToUnshare", value.asInstanceOf[js.Any])
    
    inline def setMembershipsToUnshareUndefined: Self = StObject.set(x, "membershipsToUnshare", js.undefined)
    
    inline def setMembershipsToUnshareVarargs(value: UserID*): Self = StObject.set(x, "membershipsToUnshare", js.Array(value :_*))
    
    inline def setMembershipsToUpdate(value: js.Array[NoteMemberShareRelationship]): Self = StObject.set(x, "membershipsToUpdate", value.asInstanceOf[js.Any])
    
    inline def setMembershipsToUpdateUndefined: Self = StObject.set(x, "membershipsToUpdate", js.undefined)
    
    inline def setMembershipsToUpdateVarargs(value: NoteMemberShareRelationship*): Self = StObject.set(x, "membershipsToUpdate", js.Array(value :_*))
    
    inline def setNoteGuid(value: String): Self = StObject.set(x, "noteGuid", value.asInstanceOf[js.Any])
    
    inline def setNoteGuidUndefined: Self = StObject.set(x, "noteGuid", js.undefined)
  }
}
