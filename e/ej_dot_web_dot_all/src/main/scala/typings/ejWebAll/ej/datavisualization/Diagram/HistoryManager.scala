package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryManager extends js.Object {
  
  /** A method that takes a history entry as argument and returns whether the specific entry can be popped or not
    */
  var canPop: js.UndefOr[js.Any] = js.native
  
  /** A method that ends grouping the changes
    */
  var closeGroupAction: js.UndefOr[js.Any] = js.native
  
  /** A method that removes the history of a recent change made in diagram
    */
  var pop: js.UndefOr[js.Any] = js.native
  
  /** A method that allows to track the custom changes made in diagram
    */
  var push: js.UndefOr[js.Any] = js.native
  
  /** Defines what should be happened while trying to restore a custom change
    * @Default {null}
    */
  var redo: js.UndefOr[js.Any] = js.native
  
  /** The redoStack property is used to get the number of redo actions to be stored on the history manager. Its an read-only property and the collection should not be modified.
    * @Default {[]}
    */
  var redoStack: js.UndefOr[js.Array[_]] = js.native
  
  /** The stackLimit property used to restrict the undo and redo actions to a certain limit.
    * @Default {null}
    */
  var stackLimit: js.UndefOr[Double] = js.native
  
  /** A method that starts to group the changes to revert/restore them in a single undo or redo
    */
  var startGroupAction: js.UndefOr[js.Any] = js.native
  
  /** Defines what should be happened while trying to revert a custom change
    */
  var undo: js.UndefOr[js.Any] = js.native
  
  /** The undoStack property is used to get the number of undo actions to be stored on the history manager. Its an read-only property and the collection should not be modified.
    * @Default {[]}
    */
  var undoStack: js.UndefOr[js.Array[_]] = js.native
}
object HistoryManager {
  
  @scala.inline
  def apply(): HistoryManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryManager]
  }
  
  @scala.inline
  implicit class HistoryManagerOps[Self <: HistoryManager] (val x: Self) extends AnyVal {
    
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
    def setCanPop(value: js.Any): Self = this.set("canPop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanPop: Self = this.set("canPop", js.undefined)
    
    @scala.inline
    def setCloseGroupAction(value: js.Any): Self = this.set("closeGroupAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseGroupAction: Self = this.set("closeGroupAction", js.undefined)
    
    @scala.inline
    def setPop(value: js.Any): Self = this.set("pop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePop: Self = this.set("pop", js.undefined)
    
    @scala.inline
    def setPush(value: js.Any): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    
    @scala.inline
    def setRedo(value: js.Any): Self = this.set("redo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedo: Self = this.set("redo", js.undefined)
    
    @scala.inline
    def setRedoStackVarargs(value: js.Any*): Self = this.set("redoStack", js.Array(value :_*))
    
    @scala.inline
    def setRedoStack(value: js.Array[_]): Self = this.set("redoStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedoStack: Self = this.set("redoStack", js.undefined)
    
    @scala.inline
    def setStackLimit(value: Double): Self = this.set("stackLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackLimit: Self = this.set("stackLimit", js.undefined)
    
    @scala.inline
    def setStartGroupAction(value: js.Any): Self = this.set("startGroupAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartGroupAction: Self = this.set("startGroupAction", js.undefined)
    
    @scala.inline
    def setUndo(value: js.Any): Self = this.set("undo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndo: Self = this.set("undo", js.undefined)
    
    @scala.inline
    def setUndoStackVarargs(value: js.Any*): Self = this.set("undoStack", js.Array(value :_*))
    
    @scala.inline
    def setUndoStack(value: js.Array[_]): Self = this.set("undoStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndoStack: Self = this.set("undoStack", js.undefined)
  }
}
