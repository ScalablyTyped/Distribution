package typings.fineUploader.mod

import typings.fineUploader.coreMod.Messages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIMessages extends Messages {
  
  /**
    * Text sent to `showMessage` when `multiple` is `false` and more than one file is dropped at once
    *
    * @default `'You may only drop one file.'`
    */
  var tooManyFilesError: js.UndefOr[String] = js.native
  
  /**
    * Text displayed to users who have ancient browsers
    *
    * @default `'Unrecoverable error - the browser does not permit uploading of any kind.'`
    */
  var unsupportedBrowser: js.UndefOr[String] = js.native
}
object UIMessages {
  
  @scala.inline
  def apply(): UIMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIMessages]
  }
  
  @scala.inline
  implicit class UIMessagesOps[Self <: UIMessages] (val x: Self) extends AnyVal {
    
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
    def setTooManyFilesError(value: String): Self = this.set("tooManyFilesError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooManyFilesError: Self = this.set("tooManyFilesError", js.undefined)
    
    @scala.inline
    def setUnsupportedBrowser(value: String): Self = this.set("unsupportedBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsupportedBrowser: Self = this.set("unsupportedBrowser", js.undefined)
  }
}
