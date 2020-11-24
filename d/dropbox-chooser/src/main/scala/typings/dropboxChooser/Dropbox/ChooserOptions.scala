package typings.dropboxChooser.Dropbox

import typings.dropboxChooser.dropboxChooserStrings.direct
import typings.dropboxChooser.dropboxChooserStrings.preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooserOptions extends js.Object {
  
  // called when the user closes the dialog without selecting a file
  var cancel: js.UndefOr[js.Function0[Unit]] = js.native
  
  // eg. '.png'
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  // default: false
  var folderselect: js.UndefOr[Boolean] = js.native
  
  // default: 'preview'
  var linkType: js.UndefOr[preview | direct] = js.native
  
  // default: false
  var multiselect: js.UndefOr[Boolean] = js.native
  
  // any positive number
  var sizeLimit: js.UndefOr[Double] = js.native
  
  // called when a user selects an item in the Chooser
  def success(files: js.Array[ChooserFile]): Unit = js.native
}
object ChooserOptions {
  
  @scala.inline
  def apply(success: js.Array[ChooserFile] => Unit): ChooserOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooserOptions]
  }
  
  @scala.inline
  implicit class ChooserOptionsOps[Self <: ChooserOptions] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: js.Array[ChooserFile] => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setFolderselect(value: Boolean): Self = this.set("folderselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolderselect: Self = this.set("folderselect", js.undefined)
    
    @scala.inline
    def setLinkType(value: preview | direct): Self = this.set("linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkType: Self = this.set("linkType", js.undefined)
    
    @scala.inline
    def setMultiselect(value: Boolean): Self = this.set("multiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiselect: Self = this.set("multiselect", js.undefined)
    
    @scala.inline
    def setSizeLimit(value: Double): Self = this.set("sizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeLimit: Self = this.set("sizeLimit", js.undefined)
  }
}
