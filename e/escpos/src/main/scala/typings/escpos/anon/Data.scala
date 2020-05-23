package typings.escpos.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Any
  var density: Double
}

object Data {
  @scala.inline
  def apply(data: js.Any, density: Double): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

