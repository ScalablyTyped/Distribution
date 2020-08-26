package typings.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragSource extends js.Object {
  def beginDrag(monitor: DragDropMonitor, targetId: Identifier): Unit = js.native
  def canDrag(monitor: DragDropMonitor, targetId: Identifier): Boolean = js.native
  def endDrag(monitor: DragDropMonitor, targetId: Identifier): Unit = js.native
  def isDragging(monitor: DragDropMonitor, targetId: Identifier): Boolean = js.native
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
  @scala.inline
  implicit class DragSourceOps[Self <: DragSource] (val x: Self) extends AnyVal {
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
    def setBeginDrag(value: (DragDropMonitor, Identifier) => Unit): Self = this.set("beginDrag", js.Any.fromFunction2(value))
    @scala.inline
    def setCanDrag(value: (DragDropMonitor, Identifier) => Boolean): Self = this.set("canDrag", js.Any.fromFunction2(value))
    @scala.inline
    def setEndDrag(value: (DragDropMonitor, Identifier) => Unit): Self = this.set("endDrag", js.Any.fromFunction2(value))
    @scala.inline
    def setIsDragging(value: (DragDropMonitor, Identifier) => Boolean): Self = this.set("isDragging", js.Any.fromFunction2(value))
  }
  
}

