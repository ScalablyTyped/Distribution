package typings.ejWebAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TipSize extends js.Object {
  /** Sets the Tooltip height.
    * @Default {10}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Sets the Tooltip width.
    * @Default {20}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object TipSize {
  @scala.inline
  def apply(height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): TipSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipSize]
  }
}

