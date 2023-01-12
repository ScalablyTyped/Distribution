package typings.googlePicker.google.picker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocsUploadView extends StObject {
  
  // Allows the user to select a folder in Google Drive to upload to.
  def setIncludeFolders(included: Boolean): DocsUploadView
  
  // Sets the upload destination to the specified folder. This overrides `.setIncludeFolders` to false.
  def setParent(parentId: String): DocsUploadView
}
object DocsUploadView {
  
  inline def apply(setIncludeFolders: Boolean => DocsUploadView, setParent: String => DocsUploadView): DocsUploadView = {
    val __obj = js.Dynamic.literal(setIncludeFolders = js.Any.fromFunction1(setIncludeFolders), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[DocsUploadView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocsUploadView] (val x: Self) extends AnyVal {
    
    inline def setSetIncludeFolders(value: Boolean => DocsUploadView): Self = StObject.set(x, "setIncludeFolders", js.Any.fromFunction1(value))
    
    inline def setSetParent(value: String => DocsUploadView): Self = StObject.set(x, "setParent", js.Any.fromFunction1(value))
  }
}
