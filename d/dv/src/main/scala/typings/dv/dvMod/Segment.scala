package typings.dv.dvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segment extends js.Object {
  var error: Double
  var p1: Point
  var p2: Point
}

object Segment {
  @scala.inline
  def apply(error: Double, p1: Point, p2: Point): Segment = {
    val __obj = js.Dynamic.literal(error = error, p1 = p1, p2 = p2)
  
    __obj.asInstanceOf[Segment]
  }
}

