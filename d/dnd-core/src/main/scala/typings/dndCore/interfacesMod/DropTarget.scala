package typings.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropTarget extends js.Object {
  def canDrop(monitor: DragDropMonitor, targetId: Identifier): Boolean = js.native
  def drop(monitor: DragDropMonitor, targetId: Identifier): js.Any = js.native
  def hover(monitor: DragDropMonitor, targetId: Identifier): Unit = js.native
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
  implicit class DropTargetOps[Self <: DropTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCanDrop(value: (DragDropMonitor, Identifier) => Boolean): Self = this.set("canDrop", js.Any.fromFunction2(value))
    @scala.inline
    def setDrop(value: (DragDropMonitor, Identifier) => js.Any): Self = this.set("drop", js.Any.fromFunction2(value))
    @scala.inline
    def setHover(value: (DragDropMonitor, Identifier) => Unit): Self = this.set("hover", js.Any.fromFunction2(value))
  }
  
}

