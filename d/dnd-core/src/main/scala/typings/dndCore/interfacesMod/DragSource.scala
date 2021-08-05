package typings.dndCore.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragSource extends StObject {
  
  def beginDrag(monitor: DragDropMonitor, targetId: Identifier): Unit
  
  def canDrag(monitor: DragDropMonitor, targetId: Identifier): Boolean
  
  def endDrag(monitor: DragDropMonitor, targetId: Identifier): Unit
  
  def isDragging(monitor: DragDropMonitor, targetId: Identifier): Boolean
}
object DragSource {
  
  inline def apply(
    beginDrag: (DragDropMonitor, Identifier) => Unit,
    canDrag: (DragDropMonitor, Identifier) => Boolean,
    endDrag: (DragDropMonitor, Identifier) => Unit,
    isDragging: (DragDropMonitor, Identifier) => Boolean
  ): DragSource = {
    val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction2(beginDrag), canDrag = js.Any.fromFunction2(canDrag), endDrag = js.Any.fromFunction2(endDrag), isDragging = js.Any.fromFunction2(isDragging))
    __obj.asInstanceOf[DragSource]
  }
  
  extension [Self <: DragSource](x: Self) {
    
    inline def setBeginDrag(value: (DragDropMonitor, Identifier) => Unit): Self = StObject.set(x, "beginDrag", js.Any.fromFunction2(value))
    
    inline def setCanDrag(value: (DragDropMonitor, Identifier) => Boolean): Self = StObject.set(x, "canDrag", js.Any.fromFunction2(value))
    
    inline def setEndDrag(value: (DragDropMonitor, Identifier) => Unit): Self = StObject.set(x, "endDrag", js.Any.fromFunction2(value))
    
    inline def setIsDragging(value: (DragDropMonitor, Identifier) => Boolean): Self = StObject.set(x, "isDragging", js.Any.fromFunction2(value))
  }
}
