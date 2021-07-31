package typings.dndCore.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropTarget extends StObject {
  
  def canDrop(monitor: DragDropMonitor, targetId: Identifier): Boolean
  
  def drop(monitor: DragDropMonitor, targetId: Identifier): js.Any
  
  def hover(monitor: DragDropMonitor, targetId: Identifier): Unit
}
object DropTarget {
  
  @scala.inline
  def apply(
    canDrop: (DragDropMonitor, Identifier) => Boolean,
    drop: (DragDropMonitor, Identifier) => js.Any,
    hover: (DragDropMonitor, Identifier) => Unit
  ): DropTarget = {
    val __obj = js.Dynamic.literal(canDrop = js.Any.fromFunction2(canDrop), drop = js.Any.fromFunction2(drop), hover = js.Any.fromFunction2(hover))
    __obj.asInstanceOf[DropTarget]
  }
  
  @scala.inline
  implicit class DropTargetMutableBuilder[Self <: DropTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanDrop(value: (DragDropMonitor, Identifier) => Boolean): Self = StObject.set(x, "canDrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDrop(value: (DragDropMonitor, Identifier) => js.Any): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHover(value: (DragDropMonitor, Identifier) => Unit): Self = StObject.set(x, "hover", js.Any.fromFunction2(value))
  }
}
