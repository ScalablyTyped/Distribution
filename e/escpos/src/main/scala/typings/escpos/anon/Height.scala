package typings.escpos.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var data: js.Array[Double]
  var height: Double
  var width: Double
}

object Height {
  @scala.inline
  def apply(data: js.Array[Double], height: Double, width: Double): Height = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

