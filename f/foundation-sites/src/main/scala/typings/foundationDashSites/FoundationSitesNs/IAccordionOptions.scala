package typings.foundationDashSites.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccordionOptions extends js.Object {
  var allowAllClosed: js.UndefOr[Boolean] = js.undefined
  var multiExpand: js.UndefOr[Boolean] = js.undefined
  var slideSpeed: js.UndefOr[Double] = js.undefined
}

object IAccordionOptions {
  @scala.inline
  def apply(
    allowAllClosed: js.UndefOr[Boolean] = js.undefined,
    multiExpand: js.UndefOr[Boolean] = js.undefined,
    slideSpeed: Int | Double = null
  ): IAccordionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAllClosed)) __obj.updateDynamic("allowAllClosed")(allowAllClosed)
    if (!js.isUndefined(multiExpand)) __obj.updateDynamic("multiExpand")(multiExpand)
    if (slideSpeed != null) __obj.updateDynamic("slideSpeed")(slideSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccordionOptions]
  }
}

