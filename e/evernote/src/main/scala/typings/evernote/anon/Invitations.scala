package typings.evernote.anon

import typings.evernote.mod.NoteStore.InvitationShareRelationship
import typings.evernote.mod.NoteStore.MemberShareRelationship
import typings.evernote.mod.NoteStore.ShareRelationshipRestrictions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invitations extends StObject {
  
  var invitationRestrictions: js.UndefOr[ShareRelationshipRestrictions] = js.undefined
  
  var invitations: js.UndefOr[js.Array[InvitationShareRelationship]] = js.undefined
  
  var memberships: js.UndefOr[js.Array[MemberShareRelationship]] = js.undefined
}
object Invitations {
  
  inline def apply(): Invitations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invitations]
  }
  
  extension [Self <: Invitations](x: Self) {
    
    inline def setInvitationRestrictions(value: ShareRelationshipRestrictions): Self = StObject.set(x, "invitationRestrictions", value.asInstanceOf[js.Any])
    
    inline def setInvitationRestrictionsUndefined: Self = StObject.set(x, "invitationRestrictions", js.undefined)
    
    inline def setInvitations(value: js.Array[InvitationShareRelationship]): Self = StObject.set(x, "invitations", value.asInstanceOf[js.Any])
    
    inline def setInvitationsUndefined: Self = StObject.set(x, "invitations", js.undefined)
    
    inline def setInvitationsVarargs(value: InvitationShareRelationship*): Self = StObject.set(x, "invitations", js.Array(value*))
    
    inline def setMemberships(value: js.Array[MemberShareRelationship]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    inline def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
    
    inline def setMembershipsVarargs(value: MemberShareRelationship*): Self = StObject.set(x, "memberships", js.Array(value*))
  }
}
