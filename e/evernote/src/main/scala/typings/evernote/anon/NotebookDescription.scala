package typings.evernote.anon

import typings.evernote.mod.Types.SharedNotebookPrivilegeLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookDescription extends StObject {
  
  var notebookDescription: js.UndefOr[String] = js.native
  
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.native
  
  var recommended: js.UndefOr[Boolean] = js.native
}
object NotebookDescription {
  
  @scala.inline
  def apply(): NotebookDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookDescription]
  }
  
  @scala.inline
  implicit class NotebookDescriptionMutableBuilder[Self <: NotebookDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookDescription(value: String): Self = StObject.set(x, "notebookDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookDescriptionUndefined: Self = StObject.set(x, "notebookDescription", js.undefined)
    
    @scala.inline
    def setPrivilege(value: SharedNotebookPrivilegeLevel): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    @scala.inline
    def setRecommended(value: Boolean): Self = StObject.set(x, "recommended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendedUndefined: Self = StObject.set(x, "recommended", js.undefined)
  }
}
