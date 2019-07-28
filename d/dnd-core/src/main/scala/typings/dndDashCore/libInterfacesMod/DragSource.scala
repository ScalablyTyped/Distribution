package typings.dndDashCore.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragSource extends js.Object {
  def beginDrag(monitor: DragDropMonitor, targetId: Identifier): Unit
  def canDrag(monitor: DragDropMonitor, targetId: Identifier): Boolean
  def endDrag(monitor: DragDropMonitor, targetId: Identifier): Unit
  def isDragging(monitor: DragDropMonitor, targetId: Identifier): Boolean
}

object DragSource {
  @scala.inline
  def apply(
    beginDrag: (DragDropMonitor, Identifier) => Unit,
    canDrag: (DragDropMonitor, Identifier) => Boolean,
    endDrag: (DragDropMonitor, Identifier) => Unit,
    isDragging: (DragDropMonitor, Identifier) => Boolean
  ): DragSource = {
    val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction2(beginDrag), canDrag = js.Any.fromFunction2(canDrag), endDrag = js.Any.fromFunction2(endDrag), isDragging = js.Any.fromFunction2(isDragging))
  
    __obj.asInstanceOf[DragSource]
  }
}

