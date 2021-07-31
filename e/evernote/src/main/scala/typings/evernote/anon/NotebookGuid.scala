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
  
  @scala.inline
  def apply(): NotebookGuid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookGuid]
  }
  
  @scala.inline
  implicit class NotebookGuidMutableBuilder[Self <: NotebookGuid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "notebookGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookGuidUndefined: Self = StObject.set(x, "notebookGuid", js.undefined)
    
    @scala.inline
    def setPrivilege(value: SharedNotebookPrivilegeLevel): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    @scala.inline
    def setRecipientContacts(value: js.Array[Contact]): Self = StObject.set(x, "recipientContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientContactsUndefined: Self = StObject.set(x, "recipientContacts", js.undefined)
    
    @scala.inline
    def setRecipientContactsVarargs(value: Contact*): Self = StObject.set(x, "recipientContacts", js.Array(value :_*))
    
    @scala.inline
    def setRecipientThreadId(value: MessageThreadID): Self = StObject.set(x, "recipientThreadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientThreadIdUndefined: Self = StObject.set(x, "recipientThreadId", js.undefined)
  }
}
