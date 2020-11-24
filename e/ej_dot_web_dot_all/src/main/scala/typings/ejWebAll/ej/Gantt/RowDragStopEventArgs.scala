package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowDragStopEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the row which we start to drag.
    */
  var draggedRow: js.UndefOr[js.Any] = js.native
  
  /** Returns the row index which we start to drag.
    */
  var draggedRowIndex: js.UndefOr[Double] = js.native
  
  /** Returns the Gantt model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.native
  
  /** Returns the row which we are dropped to row.
    */
  var targetRow: js.UndefOr[js.Any] = js.native
  
  /** Returns the row index which we are dropped to row.
    */
  var targetRowIndex: js.UndefOr[Double] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object RowDragStopEventArgs {
  
  @scala.inline
  def apply(): RowDragStopEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDragStopEventArgs]
  }
  
  @scala.inline
  implicit class RowDragStopEventArgsOps[Self <: RowDragStopEventArgs] (val x: Self) extends AnyVal {
    
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
    def setDraggedRow(value: js.Any): Self = this.set("draggedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggedRow: Self = this.set("draggedRow", js.undefined)
    
    @scala.inline
    def setDraggedRowIndex(value: Double): Self = this.set("draggedRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggedRowIndex: Self = this.set("draggedRowIndex", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    
    @scala.inline
    def setTargetRow(value: js.Any): Self = this.set("targetRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetRow: Self = this.set("targetRow", js.undefined)
    
    @scala.inline
    def setTargetRowIndex(value: Double): Self = this.set("targetRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetRowIndex: Self = this.set("targetRowIndex", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
