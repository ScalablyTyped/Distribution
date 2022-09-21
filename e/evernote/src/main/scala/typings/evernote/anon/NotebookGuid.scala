package typings.evernote.anon

import typings.evernote.mod.Types.Contact
import typings.evernote.mod.Types.MessageThreadID
import typings.evernote.mod.Types.SharedNotebookPrivilegeLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookGuid extends StObject {
  
  var notebookGuid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.undefined
  
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.undefined
  
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.undefined
}
object NotebookGuid {
  
  inline def apply(): NotebookGuid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookGuid]
  }
  
  extension [Self <: NotebookGuid](x: Self) {
    
    inline def setNotebookGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "notebookGuid", value.asInstanceOf[js.Any])
    
    inline def setNotebookGuidUndefined: Self = StObject.set(x, "notebookGuid", js.undefined)
    
    inline def setPrivilege(value: SharedNotebookPrivilegeLevel): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    inline def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    inline def setRecipientContacts(value: js.Array[Contact]): Self = StObject.set(x, "recipientContacts", value.asInstanceOf[js.Any])
    
    inline def setRecipientContactsUndefined: Self = StObject.set(x, "recipientContacts", js.undefined)
    
    inline def setRecipientContactsVarargs(value: Contact*): Self = StObject.set(x, "recipientContacts", js.Array(value*))
    
    inline def setRecipientThreadId(value: MessageThreadID): Self = StObject.set(x, "recipientThreadId", value.asInstanceOf[js.Any])
    
    inline def setRecipientThreadIdUndefined: Self = StObject.set(x, "recipientThreadId", js.undefined)
  }
}
