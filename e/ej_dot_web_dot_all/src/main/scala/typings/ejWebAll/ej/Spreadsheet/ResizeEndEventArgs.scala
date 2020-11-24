package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeEndEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the column index which you resized.
    */
  var colIndex: js.UndefOr[Double] = js.native
  
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns new height of the row or shape.
    */
  var newHeight: js.UndefOr[Double] = js.native
  
  /** Returns new width of the column or shape.
    */
  var newWidth: js.UndefOr[Double] = js.native
  
  /** Returns old height of the row or shape.
    */
  var oldHeight: js.UndefOr[Double] = js.native
  
  /** Returns old width of the column or shape.
    */
  var oldWidth: js.UndefOr[Double] = js.native
  
  /** Returns type of the request.
    */
  var reqType: js.UndefOr[String] = js.native
  
  /** Returns the row index which you resized.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ResizeEndEventArgs {
  
  @scala.inline
  def apply(): ResizeEndEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeEndEventArgs]
  }
  
  @scala.inline
  implicit class ResizeEndEventArgsOps[Self <: ResizeEndEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setColIndex(value: Double): Self = this.set("colIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColIndex: Self = this.set("colIndex", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setNewHeight(value: Double): Self = this.set("newHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewHeight: Self = this.set("newHeight", js.undefined)
    
    @scala.inline
    def setNewWidth(value: Double): Self = this.set("newWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewWidth: Self = this.set("newWidth", js.undefined)
    
    @scala.inline
    def setOldHeight(value: Double): Self = this.set("oldHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldHeight: Self = this.set("oldHeight", js.undefined)
    
    @scala.inline
    def setOldWidth(value: Double): Self = this.set("oldWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldWidth: Self = this.set("oldWidth", js.undefined)
    
    @scala.inline
    def setReqType(value: String): Self = this.set("reqType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReqType: Self = this.set("reqType", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
