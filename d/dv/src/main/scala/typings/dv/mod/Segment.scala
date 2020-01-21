package typings.dv.mod

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
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Segment]
  }
}

