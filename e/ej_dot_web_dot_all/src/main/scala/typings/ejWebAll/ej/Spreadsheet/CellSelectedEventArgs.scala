package typings.ejWebAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellSelectedEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** Returns the selected range.
    */
  var selectedRange: js.UndefOr[js.Array[_]] = js.native
  
  /** Returns the active sheet index.
    */
  var sheetIdx: js.UndefOr[Double] = js.native
  
  /** Returns the target element.
    */
  var target: js.UndefOr[HTMLElement] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object CellSelectedEventArgs {
  
  @scala.inline
  def apply(): CellSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellSelectedEventArgs]
  }
  
  @scala.inline
  implicit class CellSelectedEventArgsOps[Self <: CellSelectedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setSelectedRangeVarargs(value: js.Any*): Self = this.set("selectedRange", js.Array(value :_*))
    
    @scala.inline
    def setSelectedRange(value: js.Array[_]): Self = this.set("selectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRange: Self = this.set("selectedRange", js.undefined)
    
    @scala.inline
    def setSheetIdx(value: Double): Self = this.set("sheetIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetIdx: Self = this.set("sheetIdx", js.undefined)
    
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
