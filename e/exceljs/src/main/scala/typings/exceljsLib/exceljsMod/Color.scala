package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /**
  	 * Hex string for alpha-red-green-blue e.g. FF00FF00
  	 */
  var argb: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Choose a theme by index
  	 */
  var theme: js.UndefOr[scala.Double] = js.undefined
}

object Color {
  @scala.inline
  def apply(argb: java.lang.String = null, theme: scala.Int | scala.Double = null): Color = {
    val __obj = js.Dynamic.literal()
    if (argb != null) __obj.updateDynamic("argb")(argb)
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

