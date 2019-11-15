package typings.figma

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
    val __obj = js.Dynamic.literal(end = end, start = start)
    if (tangentEnd != null) __obj.updateDynamic("tangentEnd")(tangentEnd)
    if (tangentStart != null) __obj.updateDynamic("tangentStart")(tangentStart)
    __obj.asInstanceOf[VectorSegment]
  }
}

