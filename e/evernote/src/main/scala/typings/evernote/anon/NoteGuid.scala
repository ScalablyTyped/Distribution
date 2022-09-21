package typings.evernote.anon

import typings.evernote.mod.Types.Contact
import typings.evernote.mod.Types.MessageThreadID
import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoteGuid extends StObject {
  
  var noteGuid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.undefined
  
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.undefined
  
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.undefined
}
object NoteGuid {
  
  inline def apply(): NoteGuid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteGuid]
  }
  
  extension [Self <: NoteGuid](x: Self) {
    
    inline def setNoteGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "noteGuid", value.asInstanceOf[js.Any])
    
    inline def setNoteGuidUndefined: Self = StObject.set(x, "noteGuid", js.undefined)
    
    inline def setPrivilege(value: SharedNotePrivilegeLevel): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    inline def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    inline def setRecipientContacts(value: js.Array[Contact]): Self = StObject.set(x, "recipientContacts", value.asInstanceOf[js.Any])
    
    inline def setRecipientContactsUndefined: Self = StObject.set(x, "recipientContacts", js.undefined)
    
    inline def setRecipientContactsVarargs(value: Contact*): Self = StObject.set(x, "recipientContacts", js.Array(value*))
    
    inline def setRecipientThreadId(value: MessageThreadID): Self = StObject.set(x, "recipientThreadId", value.asInstanceOf[js.Any])
    
    inline def setRecipientThreadIdUndefined: Self = StObject.set(x, "recipientThreadId", js.undefined)
  }
}
