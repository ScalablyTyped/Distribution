package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorSegment extends js.Object {
  val end: Double
  val start: Double
   // Defaults to { x: 0, y: 0 }
  val tangentEnd: js.UndefOr[Vector] = js.undefined
  val tangentStart: js.UndefOr[Vector] = js.undefined
}

object VectorSegment {
  @scala.inline
  def apply(end: Double, start: Double, tangentEnd: Vector = null, tangentStart: Vector = null): VectorSegment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (tangentEnd != null) __obj.updateDynamic("tangentEnd")(tangentEnd.asInstanceOf[js.Any])
    if (tangentStart != null) __obj.updateDynamic("tangentStart")(tangentStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorSegment]
  }
}

