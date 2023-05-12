package typings.fullcalendarInteraction.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalDraggable extends StObject {
  
  def destroy(): Unit
  
  var dragging: FeaturefulElementDragging
  
  def handleDragStart(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit
  
  def handlePointerDown(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit
  
  var settings: ExternalDraggableSettings
}
object ExternalDraggable {
  
  inline def apply(
    destroy: () => Unit,
    dragging: FeaturefulElementDragging,
    handleDragStart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit,
    handlePointerDown: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit,
    settings: ExternalDraggableSettings
  ): ExternalDraggable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), dragging = dragging.asInstanceOf[js.Any], handleDragStart = js.Any.fromFunction1(handleDragStart), handlePointerDown = js.Any.fromFunction1(handlePointerDown), settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalDraggable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalDraggable] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDragging(value: FeaturefulElementDragging): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setHandleDragStart(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit
    ): Self = StObject.set(x, "handleDragStart", js.Any.fromFunction1(value))
    
    inline def setHandlePointerDown(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit
    ): Self = StObject.set(x, "handlePointerDown", js.Any.fromFunction1(value))
    
    inline def setSettings(value: ExternalDraggableSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
