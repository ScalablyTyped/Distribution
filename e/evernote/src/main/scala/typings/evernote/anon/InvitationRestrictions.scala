package typings.evernote.anon

import typings.evernote.mod.NoteStore.NoteInvitationShareRelationship
import typings.evernote.mod.NoteStore.NoteMemberShareRelationship
import typings.evernote.mod.NoteStore.NoteShareRelationshipRestrictions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvitationRestrictions extends StObject {
  
  var invitationRestrictions: js.UndefOr[NoteShareRelationshipRestrictions] = js.undefined
  
  var invitations: js.UndefOr[js.Array[NoteInvitationShareRelationship]] = js.undefined
  
  var memberships: js.UndefOr[js.Array[NoteMemberShareRelationship]] = js.undefined
}
object InvitationRestrictions {
  
  inline def apply(): InvitationRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitationRestrictions]
  }
  
  extension [Self <: InvitationRestrictions](x: Self) {
    
    inline def setInvitationRestrictions(value: NoteShareRelationshipRestrictions): Self = StObject.set(x, "invitationRestrictions", value.asInstanceOf[js.Any])
    
    inline def setInvitationRestrictionsUndefined: Self = StObject.set(x, "invitationRestrictions", js.undefined)
    
    inline def setInvitations(value: js.Array[NoteInvitationShareRelationship]): Self = StObject.set(x, "invitations", value.asInstanceOf[js.Any])
    
    inline def setInvitationsUndefined: Self = StObject.set(x, "invitations", js.undefined)
    
    inline def setInvitationsVarargs(value: NoteInvitationShareRelationship*): Self = StObject.set(x, "invitations", js.Array(value*))
    
    inline def setMemberships(value: js.Array[NoteMemberShareRelationship]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    inline def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
    
    inline def setMembershipsVarargs(value: NoteMemberShareRelationship*): Self = StObject.set(x, "memberships", js.Array(value*))
  }
}
