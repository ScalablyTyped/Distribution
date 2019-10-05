package typings.ejDotWebDotAll.ej.Tooltip

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
  def apply(height: Int | Double = null, width: Int | Double = null): TipSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipSize]
  }
}

