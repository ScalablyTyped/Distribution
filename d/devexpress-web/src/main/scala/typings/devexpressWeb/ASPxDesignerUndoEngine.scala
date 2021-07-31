package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerUndoEngine extends StObject {
  
  def clearHistory(): Unit
  
  var isDirty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
  
  def redo(): Unit
  
  var redoEnabled: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
  
  def undo(): Unit
  
  def undoAll(): Unit
  
  var undoEnabled: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
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
  implicit class ASPxDesignerUndoEngineMutableBuilder[Self <: ASPxDesignerUndoEngine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearHistory(value: () => Unit): Self = StObject.set(x, "clearHistory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDirty(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedo(value: () => Unit): Self = StObject.set(x, "redo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRedoEnabled(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = StObject.set(x, "redoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndo(value: () => Unit): Self = StObject.set(x, "undo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndoAll(value: () => Unit): Self = StObject.set(x, "undoAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndoEnabled(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = StObject.set(x, "undoEnabled", value.asInstanceOf[js.Any])
  }
}
