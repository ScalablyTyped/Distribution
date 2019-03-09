package typings
package dndDashCoreLib.libCjsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTarget extends js.Object {
  def canDrop(monitor: DragDropMonitor, targetId: Identifier): scala.Boolean
  def drop(monitor: DragDropMonitor, targetId: Identifier): js.Any
  def hover(monitor: DragDropMonitor, targetId: Identifier): scala.Unit
}

object DropTarget {
  @scala.inline
  def apply(
    canDrop: js.Function2[DragDropMonitor, Identifier, scala.Boolean],
    drop: js.Function2[DragDropMonitor, Identifier, js.Any],
    hover: js.Function2[DragDropMonitor, Identifier, scala.Unit]
  ): DropTarget = {
    val __obj = js.Dynamic.literal(canDrop = canDrop, drop = drop, hover = hover)
  
    __obj.asInstanceOf[DropTarget]
  }
}

