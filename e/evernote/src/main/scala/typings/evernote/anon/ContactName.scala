package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactName extends StObject {
  
  var contactName: js.UndefOr[String] = js.undefined
  
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  
  var hasSharedNotebook: js.UndefOr[Boolean] = js.undefined
  
  var joinedUserCount: js.UndefOr[Double] = js.undefined
  
  var notebookDisplayName: js.UndefOr[String] = js.undefined
}
object ContactName {
  
  inline def apply(): ContactName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactName] (val x: Self) extends AnyVal {
    
    inline def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
    
    inline def setContactNameUndefined: Self = StObject.set(x, "contactName", js.undefined)
    
    inline def setGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setHasSharedNotebook(value: Boolean): Self = StObject.set(x, "hasSharedNotebook", value.asInstanceOf[js.Any])
    
    inline def setHasSharedNotebookUndefined: Self = StObject.set(x, "hasSharedNotebook", js.undefined)
    
    inline def setJoinedUserCount(value: Double): Self = StObject.set(x, "joinedUserCount", value.asInstanceOf[js.Any])
    
    inline def setJoinedUserCountUndefined: Self = StObject.set(x, "joinedUserCount", js.undefined)
    
    inline def setNotebookDisplayName(value: String): Self = StObject.set(x, "notebookDisplayName", value.asInstanceOf[js.Any])
    
    inline def setNotebookDisplayNameUndefined: Self = StObject.set(x, "notebookDisplayName", js.undefined)
  }
}
