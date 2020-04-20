package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /**
  	 * Hex string for alpha-red-green-blue e.g. FF00FF00
  	 */
  var argb: String
  /**
  	 * Choose a theme by index
  	 */
  var theme: Double
}

object Color {
  @scala.inline
  def apply(argb: String, theme: Double): Color = {
    val __obj = js.Dynamic.literal(argb = argb.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

