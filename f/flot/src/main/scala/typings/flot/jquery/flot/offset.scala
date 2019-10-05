package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait offset extends js.Object {
  var left: Double
  var top: Double
}

object offset {
  @scala.inline
  def apply(left: Double, top: Double): offset = {
    val __obj = js.Dynamic.literal(left = left, top = top)
  
    __obj.asInstanceOf[offset]
  }
}

