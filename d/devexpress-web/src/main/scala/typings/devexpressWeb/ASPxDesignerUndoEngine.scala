package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerUndoEngine extends StObject {
  
  def clearHistory(): Unit
  
  var isDirty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  
  def redo(): Unit
  
  var redoEnabled: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  
  def undo(): Unit
  
  def undoAll(): Unit
  
  var undoEnabled: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
}
object ASPxDesignerUndoEngine {
  
  inline def apply(
    clearHistory: () => Unit,
    isDirty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
    redo: () => Unit,
    redoEnabled: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
    undo: () => Unit,
    undoAll: () => Unit,
    undoEnabled: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  ): ASPxDesignerUndoEngine = {
    val __obj = js.Dynamic.literal(clearHistory = js.Any.fromFunction0(clearHistory), isDirty = isDirty.asInstanceOf[js.Any], redo = js.Any.fromFunction0(redo), redoEnabled = redoEnabled.asInstanceOf[js.Any], undo = js.Any.fromFunction0(undo), undoAll = js.Any.fromFunction0(undoAll), undoEnabled = undoEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerUndoEngine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxDesignerUndoEngine] (val x: Self) extends AnyVal {
    
    inline def setClearHistory(value: () => Unit): Self = StObject.set(x, "clearHistory", js.Any.fromFunction0(value))
    
    inline def setIsDirty(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    inline def setRedo(value: () => Unit): Self = StObject.set(x, "redo", js.Any.fromFunction0(value))
    
    inline def setRedoEnabled(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "redoEnabled", value.asInstanceOf[js.Any])
    
    inline def setUndo(value: () => Unit): Self = StObject.set(x, "undo", js.Any.fromFunction0(value))
    
    inline def setUndoAll(value: () => Unit): Self = StObject.set(x, "undoAll", js.Any.fromFunction0(value))
    
    inline def setUndoEnabled(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "undoEnabled", value.asInstanceOf[js.Any])
  }
}
