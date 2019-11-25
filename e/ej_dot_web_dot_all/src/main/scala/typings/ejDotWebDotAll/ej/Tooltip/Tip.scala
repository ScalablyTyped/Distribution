package typings.ejDotWebDotAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tip extends js.Object {
  /** Sets gap between tooltip against the target element.
    */
  var adjust: js.UndefOr[TipAdjust] = js.undefined
  /** Sets the Tooltip size.
    */
  var size: js.UndefOr[TipSize] = js.undefined
}

object Tip {
  @scala.inline
  def apply(adjust: TipAdjust = null, size: TipSize = null): Tip = {
    val __obj = js.Dynamic.literal()
    if (adjust != null) __obj.updateDynamic("adjust")(adjust.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tip]
  }
}

