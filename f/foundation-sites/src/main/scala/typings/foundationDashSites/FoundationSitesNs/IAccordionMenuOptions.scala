package typings.foundationDashSites.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccordionMenuOptions extends js.Object {
  var multiOpen: js.UndefOr[Boolean] = js.undefined
  var slideSpeed: js.UndefOr[Double] = js.undefined
}

object IAccordionMenuOptions {
  @scala.inline
  def apply(multiOpen: js.UndefOr[Boolean] = js.undefined, slideSpeed: Int | Double = null): IAccordionMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multiOpen)) __obj.updateDynamic("multiOpen")(multiOpen)
    if (slideSpeed != null) __obj.updateDynamic("slideSpeed")(slideSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccordionMenuOptions]
  }
}

