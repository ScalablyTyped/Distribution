package typings.evernote.anon

import typings.evernote.mod.Types.SharedNotebookPrivilegeLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookDescription extends StObject {
  
  var notebookDescription: js.UndefOr[String] = js.undefined
  
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.undefined
  
  var recommended: js.UndefOr[Boolean] = js.undefined
}
object NotebookDescription {
  
  inline def apply(): NotebookDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookDescription] (val x: Self) extends AnyVal {
    
    inline def setNotebookDescription(value: String): Self = StObject.set(x, "notebookDescription", value.asInstanceOf[js.Any])
    
    inline def setNotebookDescriptionUndefined: Self = StObject.set(x, "notebookDescription", js.undefined)
    
    inline def setPrivilege(value: SharedNotebookPrivilegeLevel): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    inline def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    inline def setRecommended(value: Boolean): Self = StObject.set(x, "recommended", value.asInstanceOf[js.Any])
    
    inline def setRecommendedUndefined: Self = StObject.set(x, "recommended", js.undefined)
  }
}
