package typings.googlePicker.google.picker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocsUploadView extends js.Object {
  
  // Allows the user to select a folder in Google Drive to upload to.
  def setIncludeFolders(included: Boolean): DocsUploadView = js.native
  
  // Sets the upload destination to the specified folder. This overrides ".setIncludeFolders" to false.
  def setParent(parentId: String): DocsUploadView = js.native
}
object DocsUploadView {
  
  @scala.inline
  def apply(setIncludeFolders: Boolean => DocsUploadView, setParent: String => DocsUploadView): DocsUploadView = {
    val __obj = js.Dynamic.literal(setIncludeFolders = js.Any.fromFunction1(setIncludeFolders), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[DocsUploadView]
  }
  
  @scala.inline
  implicit class DocsUploadViewOps[Self <: DocsUploadView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSetIncludeFolders(value: Boolean => DocsUploadView): Self = this.set("setIncludeFolders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetParent(value: String => DocsUploadView): Self = this.set("setParent", js.Any.fromFunction1(value))
  }
}
