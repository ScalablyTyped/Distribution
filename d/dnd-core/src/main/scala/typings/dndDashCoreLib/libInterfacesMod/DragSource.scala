package typings
package dndDashCoreLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragSource extends js.Object {
  def beginDrag(monitor: DragDropMonitor, targetId: java.lang.String): scala.Unit
  def canDrag(monitor: DragDropMonitor, targetId: java.lang.String): scala.Boolean
  def endDrag(monitor: DragDropMonitor, targetId: java.lang.String): scala.Unit
  def isDragging(monitor: DragDropMonitor, targetId: java.lang.String): scala.Boolean
}

object DragSource {
  @scala.inline
  def apply(
    beginDrag: js.Function2[DragDropMonitor, java.lang.String, scala.Unit],
    canDrag: js.Function2[DragDropMonitor, java.lang.String, scala.Boolean],
    endDrag: js.Function2[DragDropMonitor, java.lang.String, scala.Unit],
    isDragging: js.Function2[DragDropMonitor, java.lang.String, scala.Boolean]
  ): DragSource = {
    val __obj = js.Dynamic.literal(beginDrag = beginDrag, canDrag = canDrag, endDrag = endDrag, isDragging = isDragging)
  
    __obj.asInstanceOf[DragSource]
  }
}

