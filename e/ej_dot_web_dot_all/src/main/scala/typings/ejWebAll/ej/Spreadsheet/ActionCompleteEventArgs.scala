package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionCompleteEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** Returns the request type.
    */
  var reqType: js.UndefOr[String] = js.native
  
  /** Returns the applied cell format object.
    */
  var selectedCell: js.UndefOr[js.Array[_] | js.Any] = js.native
  
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[Double] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ActionCompleteEventArgs {
  
  @scala.inline
  def apply(): ActionCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionCompleteEventArgs]
  }
  
  @scala.inline
  implicit class ActionCompleteEventArgsOps[Self <: ActionCompleteEventArgs] (val x: Self) extends AnyVal {
    
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
    def setReqType(value: String): Self = this.set("reqType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReqType: Self = this.set("reqType", js.undefined)
    
    @scala.inline
    def setSelectedCellVarargs(value: js.Any*): Self = this.set("selectedCell", js.Array(value :_*))
    
    @scala.inline
    def setSelectedCell(value: js.Array[_] | js.Any): Self = this.set("selectedCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedCell: Self = this.set("selectedCell", js.undefined)
    
    @scala.inline
    def setSheetIdx(value: Double): Self = this.set("sheetIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetIdx: Self = this.set("sheetIdx", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
