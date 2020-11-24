package typings.ejWebAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyDownEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the boolean value.
    */
  var isCommentEdit: js.UndefOr[Boolean] = js.native
  
  /** Returns the boolean value.
    */
  var isEdit: js.UndefOr[Boolean] = js.native
  
  /** Returns the boolean value.
    */
  var isSheetRename: js.UndefOr[Boolean] = js.native
  
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** Returns the sheet index.
    */
  var sheetIndex: js.UndefOr[Double] = js.native
  
  /** Returns the target element.
    */
  var target: js.UndefOr[HTMLElement] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object KeyDownEventArgs {
  
  @scala.inline
  def apply(): KeyDownEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyDownEventArgs]
  }
  
  @scala.inline
  implicit class KeyDownEventArgsOps[Self <: KeyDownEventArgs] (val x: Self) extends AnyVal {
    
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
    def setIsCommentEdit(value: Boolean): Self = this.set("isCommentEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCommentEdit: Self = this.set("isCommentEdit", js.undefined)
    
    @scala.inline
    def setIsEdit(value: Boolean): Self = this.set("isEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEdit: Self = this.set("isEdit", js.undefined)
    
    @scala.inline
    def setIsSheetRename(value: Boolean): Self = this.set("isSheetRename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSheetRename: Self = this.set("isSheetRename", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setSheetIndex(value: Double): Self = this.set("sheetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetIndex: Self = this.set("sheetIndex", js.undefined)
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
