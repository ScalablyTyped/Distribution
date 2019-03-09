package typings
package dndDashCoreLib.libCjsInterfacesMod

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
    beginDrag: js.Function2[DragDropMonitor, Identifier, scala.Unit],
    canDrag: js.Function2[DragDropMonitor, Identifier, scala.Boolean],
    endDrag: js.Function2[DragDropMonitor, Identifier, scala.Unit],
    isDragging: js.Function2[DragDropMonitor, Identifier, scala.Boolean]
  ): DragSource = {
    val __obj = js.Dynamic.literal(beginDrag = beginDrag, canDrag = canDrag, endDrag = endDrag, isDragging = isDragging)
  
    __obj.asInstanceOf[DragSource]
  }
}

