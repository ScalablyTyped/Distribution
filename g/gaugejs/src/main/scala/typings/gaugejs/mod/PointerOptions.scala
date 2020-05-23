package typings.gaugejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerOptions extends js.Object {
  var color: String
  var length: Double
  var strokeWidth: Double
}

object PointerOptions {
  @scala.inline
  def apply(color: String, length: Double, strokeWidth: Double): PointerOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerOptions]
  }
}

