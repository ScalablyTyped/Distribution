package typings.ejWebAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndoRedoOptions extends js.Object {
  
  /** Pass the action to update undo and redo collection
    */
  var action: js.UndefOr[String] = js.native
  
  /** Pass the cell to update undo and redo collection
    */
  var cell: js.UndefOr[HTMLElement] = js.native
  
  /** Pass the sheet index to update undo and redo collection
    */
  var sheetIndex: js.UndefOr[Double] = js.native
}
object UndoRedoOptions {
  
  @scala.inline
  def apply(): UndoRedoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndoRedoOptions]
  }
  
  @scala.inline
  implicit class UndoRedoOptionsOps[Self <: UndoRedoOptions] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setCell(value: HTMLElement): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    
    @scala.inline
    def setSheetIndex(value: Double): Self = this.set("sheetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetIndex: Self = this.set("sheetIndex", js.undefined)
  }
}
