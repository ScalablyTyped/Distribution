package typings
package dndDashCoreLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragSource extends js.Object {
  def beginDrag(monitor: DragDropMonitor, targetId: Identifier): scala.Unit
  def canDrag(monitor: DragDropMonitor, targetId: Identifier): scala.Boolean
  def endDrag(monitor: DragDropMonitor, targetId: Identifier): scala.Unit
  def isDragging(monitor: DragDropMonitor, targetId: Identifier): scala.Boolean
}

object DragSource {
  @scala.inline
  def apply(
    beginDrag: (DragDropMonitor, Identifier) => scala.Unit,
    canDrag: (DragDropMonitor, Identifier) => scala.Boolean,
    endDrag: (DragDropMonitor, Identifier) => scala.Unit,
    isDragging: (DragDropMonitor, Identifier) => scala.Boolean
  ): DragSource = {
    val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction2(beginDrag), canDrag = js.Any.fromFunction2(canDrag), endDrag = js.Any.fromFunction2(endDrag), isDragging = js.Any.fromFunction2(isDragging))
  
    __obj.asInstanceOf[DragSource]
  }
}

