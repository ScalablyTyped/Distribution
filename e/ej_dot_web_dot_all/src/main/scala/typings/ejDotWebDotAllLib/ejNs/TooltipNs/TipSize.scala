package typings
package ejDotWebDotAllLib.ejNs.TooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TipSize extends js.Object {
  /** Sets the Tooltip height.
    * @Default {10}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Sets the Tooltip width.
    * @Default {20}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TipSize {
  @scala.inline
  def apply(height: scala.Int | scala.Double = null, width: scala.Int | scala.Double = null): TipSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipSize]
  }
}

