package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxTouchOptions extends js.Object {
  /**
    * Continue movement after releasing mouse/touch when panning
    */
  var momentum: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  Allow to drag content vertically
    */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object FancyBoxTouchOptions {
  @scala.inline
  def apply(
    momentum: js.UndefOr[scala.Boolean] = js.undefined,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): FancyBoxTouchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(momentum)) __obj.updateDynamic("momentum")(momentum)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[FancyBoxTouchOptions]
  }
}

