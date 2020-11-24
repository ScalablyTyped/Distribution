package typings.fineUploader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIDisplayOptions extends js.Object {
  
  /**
    * Enable or disable the display of the file size next to the file after it has been submitted
    *
    * @default `false`
    */
  var fileSizeOnSubmit: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true` batches of files are added to the top of the UI's file list. The default is to append file(s) to the bottom of the list
    *
    * @default `false`
    */
  var prependFiles: js.UndefOr[Boolean] = js.native
}
object UIDisplayOptions {
  
  @scala.inline
  def apply(): UIDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIDisplayOptions]
  }
  
  @scala.inline
  implicit class UIDisplayOptionsOps[Self <: UIDisplayOptions] (val x: Self) extends AnyVal {
    
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
    def setFileSizeOnSubmit(value: Boolean): Self = this.set("fileSizeOnSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSizeOnSubmit: Self = this.set("fileSizeOnSubmit", js.undefined)
    
    @scala.inline
    def setPrependFiles(value: Boolean): Self = this.set("prependFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrependFiles: Self = this.set("prependFiles", js.undefined)
  }
}
