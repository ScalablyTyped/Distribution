package typings.evernote.anon

import typings.evernote.mod.NoteStore.NoteShareRelationshipRestrictions
import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Privilege extends StObject {
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.undefined
  
  var recipientUserId: js.UndefOr[UserID] = js.undefined
  
  var restrictions: js.UndefOr[NoteShareRelationshipRestrictions] = js.undefined
  
  var sharerUserId: js.UndefOr[UserID] = js.undefined
}
object Privilege {
  
  @scala.inline
  def apply(): Privilege = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Privilege]
  }
  
  @scala.inline
  implicit class PrivilegeMutableBuilder[Self <: Privilege] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setPrivilege(value: SharedNotePrivilegeLevel): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    @scala.inline
    def setRecipientUserId(value: UserID): Self = StObject.set(x, "recipientUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientUserIdUndefined: Self = StObject.set(x, "recipientUserId", js.undefined)
    
    @scala.inline
    def setRestrictions(value: NoteShareRelationshipRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    @scala.inline
    def setSharerUserId(value: UserID): Self = StObject.set(x, "sharerUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharerUserIdUndefined: Self = StObject.set(x, "sharerUserId", js.undefined)
  }
}
