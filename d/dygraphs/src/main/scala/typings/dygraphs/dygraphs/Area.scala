package typings.dygraphs.dygraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Area extends js.Object {
  var h: Double
  var w: Double
  var x: Double
  var y: Double
}

object Area {
  @scala.inline
  def apply(h: Double, w: Double, x: Double, y: Double): Area = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Area]
  }
}

