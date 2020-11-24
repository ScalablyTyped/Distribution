package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteParagraphBulletsRequest extends js.Object {
  
  var cellLocation: js.UndefOr[TableCellLocation] = js.native
  
  var objectId: js.UndefOr[String] = js.native
  
  var textRange: js.UndefOr[Range] = js.native
}
object DeleteParagraphBulletsRequest {
  
  @scala.inline
  def apply(): DeleteParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteParagraphBulletsRequest]
  }
  
  @scala.inline
  implicit class DeleteParagraphBulletsRequestOps[Self <: DeleteParagraphBulletsRequest] (val x: Self) extends AnyVal {
    
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
    def setCellLocation(value: TableCellLocation): Self = this.set("cellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellLocation: Self = this.set("cellLocation", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setTextRange(value: Range): Self = this.set("textRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextRange: Self = this.set("textRange", js.undefined)
  }
}
