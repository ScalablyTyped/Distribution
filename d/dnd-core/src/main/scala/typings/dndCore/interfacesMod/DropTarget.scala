package typings.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTarget extends js.Object {
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
}

