package typings
package dndDashCoreLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTarget extends js.Object {
  def canDrop(monitor: DragDropMonitor, targetId: java.lang.String): scala.Boolean
  def drop(monitor: DragDropMonitor, targetId: java.lang.String): js.Any
  def hover(monitor: DragDropMonitor, targetId: java.lang.String): scala.Unit
}

object DropTarget {
  @scala.inline
  def apply(
    canDrop: js.Function2[DragDropMonitor, java.lang.String, scala.Boolean],
    drop: js.Function2[DragDropMonitor, java.lang.String, js.Any],
    hover: js.Function2[DragDropMonitor, java.lang.String, scala.Unit]
  ): DropTarget = {
    val __obj = js.Dynamic.literal(canDrop = canDrop, drop = drop, hover = hover)
  
    __obj.asInstanceOf[DropTarget]
  }
}

