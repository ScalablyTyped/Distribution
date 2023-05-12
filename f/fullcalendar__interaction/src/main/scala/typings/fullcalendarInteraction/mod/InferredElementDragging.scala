package typings.fullcalendarInteraction.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementDragging * / any */ trait InferredElementDragging extends StObject {
  
  var currentMirrorEl: HTMLElement | Null
  
  def destroy(): Unit
  
  def handlePointerDown(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit
  
  def handlePointerMove(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit
  
  def handlePointerUp(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit
  
  var mirrorSelector: String
  
  var pointer: PointerDragging
  
  def setIgnoreMove(bool: Boolean): Unit
  
  def setMirrorIsVisible(bool: Boolean): Unit
  
  var shouldIgnoreMove: Boolean
}
object InferredElementDragging {
  
  inline def apply(
    destroy: () => Unit,
    handlePointerDown: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit,
    handlePointerMove: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit,
    handlePointerUp: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit,
    mirrorSelector: String,
    pointer: PointerDragging,
    setIgnoreMove: Boolean => Unit,
    setMirrorIsVisible: Boolean => Unit,
    shouldIgnoreMove: Boolean
  ): InferredElementDragging = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), handlePointerDown = js.Any.fromFunction1(handlePointerDown), handlePointerMove = js.Any.fromFunction1(handlePointerMove), handlePointerUp = js.Any.fromFunction1(handlePointerUp), mirrorSelector = mirrorSelector.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], setIgnoreMove = js.Any.fromFunction1(setIgnoreMove), setMirrorIsVisible = js.Any.fromFunction1(setMirrorIsVisible), shouldIgnoreMove = shouldIgnoreMove.asInstanceOf[js.Any], currentMirrorEl = null)
    __obj.asInstanceOf[InferredElementDragging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InferredElementDragging] (val x: Self) extends AnyVal {
    
    inline def setCurrentMirrorEl(value: HTMLElement): Self = StObject.set(x, "currentMirrorEl", value.asInstanceOf[js.Any])
    
    inline def setCurrentMirrorElNull: Self = StObject.set(x, "currentMirrorEl", null)
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setHandlePointerDown(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit
    ): Self = StObject.set(x, "handlePointerDown", js.Any.fromFunction1(value))
    
    inline def setHandlePointerMove(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit
    ): Self = StObject.set(x, "handlePointerMove", js.Any.fromFunction1(value))
    
    inline def setHandlePointerUp(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit
    ): Self = StObject.set(x, "handlePointerUp", js.Any.fromFunction1(value))
    
    inline def setMirrorSelector(value: String): Self = StObject.set(x, "mirrorSelector", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: PointerDragging): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setSetIgnoreMove(value: Boolean => Unit): Self = StObject.set(x, "setIgnoreMove", js.Any.fromFunction1(value))
    
    inline def setSetMirrorIsVisible(value: Boolean => Unit): Self = StObject.set(x, "setMirrorIsVisible", js.Any.fromFunction1(value))
    
    inline def setShouldIgnoreMove(value: Boolean): Self = StObject.set(x, "shouldIgnoreMove", value.asInstanceOf[js.Any])
  }
}
