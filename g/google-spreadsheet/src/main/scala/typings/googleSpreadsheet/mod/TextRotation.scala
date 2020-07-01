package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRotation extends js.Object {
  var angle: Double
  var vertical: Boolean
}

object TextRotation {
  @scala.inline
  def apply(angle: Double, vertical: Boolean): TextRotation = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRotation]
  }
}

