package typings.escpos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.Any
  var density: Double
}

object AnonData {
  @scala.inline
  def apply(data: js.Any, density: Double): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

