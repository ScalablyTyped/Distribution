package typings.divaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonH extends js.Object {
  var h: Double
  var w: Double
}

object AnonH {
  @scala.inline
  def apply(h: Double, w: Double): AnonH = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonH]
  }
}

