package typings.ejWebAll.ej.Uploadbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogText extends js.Object {
  
  /** Sets the uploaded fileâ€™s Name (header text) to the Dialog popup.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Sets the upload file Size (header text) to the dialog popup.
    */
  var size: js.UndefOr[String] = js.native
  
  /** Sets the upload file Status (header text) to the dialog popup.
    */
  var status: js.UndefOr[String] = js.native
  
  /** Sets the title text of the dialog popup.
    */
  var title: js.UndefOr[String] = js.native
}
object DialogText {
  
  @scala.inline
  def apply(): DialogText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogText]
  }
  
  @scala.inline
  implicit class DialogTextOps[Self <: DialogText] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
