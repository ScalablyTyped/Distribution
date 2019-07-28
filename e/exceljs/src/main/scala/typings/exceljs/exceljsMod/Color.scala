package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /**
  	 * Hex string for alpha-red-green-blue e.g. FF00FF00
  	 */
  var argb: js.UndefOr[String] = js.undefined
  /**
  	 * Choose a theme by index
  	 */
  var theme: js.UndefOr[Double] = js.undefined
}

object Color {
  @scala.inline
  def apply(argb: String = null, theme: Int | Double = null): Color = {
    val __obj = js.Dynamic.literal()
    if (argb != null) __obj.updateDynamic("argb")(argb)
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

