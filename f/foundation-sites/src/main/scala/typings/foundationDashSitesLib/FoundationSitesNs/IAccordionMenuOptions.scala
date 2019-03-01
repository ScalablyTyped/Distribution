package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccordionMenuOptions extends js.Object {
  var multiOpen: js.UndefOr[scala.Boolean] = js.undefined
  var slideSpeed: js.UndefOr[scala.Double] = js.undefined
}

object IAccordionMenuOptions {
  @scala.inline
  def apply(multiOpen: js.UndefOr[scala.Boolean] = js.undefined, slideSpeed: scala.Int | scala.Double = null): IAccordionMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multiOpen)) __obj.updateDynamic("multiOpen")(multiOpen)
    if (slideSpeed != null) __obj.updateDynamic("slideSpeed")(slideSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccordionMenuOptions]
  }
}

