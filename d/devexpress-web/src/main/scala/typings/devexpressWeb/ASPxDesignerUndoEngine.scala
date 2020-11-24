package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxDesignerUndoEngine extends js.Object {
  
  def clearHistory(): Unit = js.native
  
  var isDirty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  
  def redo(): Unit = js.native
  
  var redoEnabled: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  
  def undo(): Unit = js.native
  
  def undoAll(): Unit = js.native
  
  var undoEnabled: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
}
object ASPxDesignerUndoEngine {
  
  @scala.inline
  def apply(
    clearHistory: () => Unit,
    isDirty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    redo: () => Unit,
    redoEnabled: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    undo: () => Unit,
    undoAll: () => Unit,
    undoEnabled: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
  ): ASPxDesignerUndoEngine = {
    val __obj = js.Dynamic.literal(clearHistory = js.Any.fromFunction0(clearHistory), isDirty = isDirty.asInstanceOf[js.Any], redo = js.Any.fromFunction0(redo), redoEnabled = redoEnabled.asInstanceOf[js.Any], undo = js.Any.fromFunction0(undo), undoAll = js.Any.fromFunction0(undoAll), undoEnabled = undoEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerUndoEngine]
  }
  
  @scala.inline
  implicit class ASPxDesignerUndoEngineOps[Self <: ASPxDesignerUndoEngine] (val x: Self) extends AnyVal {
    
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
    def setClearHistory(value: () => Unit): Self = this.set("clearHistory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDirty(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = this.set("isDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedo(value: () => Unit): Self = this.set("redo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRedoEnabled(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = this.set("redoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndo(value: () => Unit): Self = this.set("undo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndoAll(value: () => Unit): Self = this.set("undoAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndoEnabled(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = this.set("undoEnabled", value.asInstanceOf[js.Any])
  }
}
