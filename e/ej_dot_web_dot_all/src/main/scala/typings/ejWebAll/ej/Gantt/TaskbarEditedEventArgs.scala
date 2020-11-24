package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskbarEditedEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the data of edited record.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /** Returns 'true' if taskbar is dragged.
    */
  var dragging: js.UndefOr[Boolean] = js.native
  
  /** Returns the field values of record being edited.
    */
  var editingFields: js.UndefOr[js.Any] = js.native
  
  /** Returns 'true' if taskbar is left resized.
    */
  var leftResizing: js.UndefOr[Boolean] = js.native
  
  /** Returns the Gantt model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns the previous data value of edited record.
    */
  var previousData: js.UndefOr[js.Any] = js.native
  
  /** Returns 'true' if taskbar is progress resized.
    */
  var progressResizing: js.UndefOr[Boolean] = js.native
  
  /** Returns 'true' if taskbar is right resized.
    */
  var rightResizing: js.UndefOr[Boolean] = js.native
}
object TaskbarEditedEventArgs {
  
  @scala.inline
  def apply(): TaskbarEditedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskbarEditedEventArgs]
  }
  
  @scala.inline
  implicit class TaskbarEditedEventArgsOps[Self <: TaskbarEditedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragging: Self = this.set("dragging", js.undefined)
    
    @scala.inline
    def setEditingFields(value: js.Any): Self = this.set("editingFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditingFields: Self = this.set("editingFields", js.undefined)
    
    @scala.inline
    def setLeftResizing(value: Boolean): Self = this.set("leftResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftResizing: Self = this.set("leftResizing", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setPreviousData(value: js.Any): Self = this.set("previousData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousData: Self = this.set("previousData", js.undefined)
    
    @scala.inline
    def setProgressResizing(value: Boolean): Self = this.set("progressResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressResizing: Self = this.set("progressResizing", js.undefined)
    
    @scala.inline
    def setRightResizing(value: Boolean): Self = this.set("rightResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightResizing: Self = this.set("rightResizing", js.undefined)
  }
}
