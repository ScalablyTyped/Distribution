package typings.ejWebAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellFormattingEventArgs extends js.Object {
  
  /** Returns the cell index.
    */
  var Cell: js.UndefOr[Double] = js.native
  
  /** Returns the applied style format object
    */
  var Format: js.UndefOr[js.Any] = js.native
  
  /** Returns the sheet index
    */
  var SheetIdx: js.UndefOr[Double] = js.native
  
  /** Returns the name of the CSS theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** Returns the target element.
    */
  var target: js.UndefOr[HTMLElement] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object CellFormattingEventArgs {
  
  @scala.inline
  def apply(): CellFormattingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellFormattingEventArgs]
  }
  
  @scala.inline
  implicit class CellFormattingEventArgsOps[Self <: CellFormattingEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCell(value: Double): Self = this.set("Cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCell: Self = this.set("Cell", js.undefined)
    
    @scala.inline
    def setFormat(value: js.Any): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
    
    @scala.inline
    def setSheetIdx(value: Double): Self = this.set("SheetIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetIdx: Self = this.set("SheetIdx", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
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
