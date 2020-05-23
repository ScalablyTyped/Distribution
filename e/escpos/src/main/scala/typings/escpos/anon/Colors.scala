package typings.escpos.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  var colors: Double
  var height: Double
  var width: Double
}

object Colors {
  @scala.inline
  def apply(colors: Double, height: Double, width: Double): Colors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
}

