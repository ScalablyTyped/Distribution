package typings.draggabilly.draggabillyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.draggabilly.draggabillyStrings.dragStart
  - typings.draggabilly.draggabillyStrings.dragEnd
  - typings.draggabilly.draggabillyStrings.pointerDown
  - typings.draggabilly.draggabillyStrings.pointerUp
  - typings.draggabilly.draggabillyStrings.staticClick
*/
trait DraggabillyClickEventName extends js.Object

object DraggabillyClickEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dragEnd: typings.draggabilly.draggabillyStrings.dragEnd = this.cast("dragEnd")
  @scala.inline
  def dragStart: typings.draggabilly.draggabillyStrings.dragStart = this.cast("dragStart")
  @scala.inline
  def pointerDown: typings.draggabilly.draggabillyStrings.pointerDown = this.cast("pointerDown")
  @scala.inline
  def pointerUp: typings.draggabilly.draggabillyStrings.pointerUp = this.cast("pointerUp")
  @scala.inline
  def staticClick: typings.draggabilly.draggabillyStrings.staticClick = this.cast("staticClick")
}

