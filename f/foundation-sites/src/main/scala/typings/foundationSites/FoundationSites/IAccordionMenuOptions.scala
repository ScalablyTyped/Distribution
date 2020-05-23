package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccordionMenuOptions extends js.Object {
  var multiOpen: js.UndefOr[Boolean] = js.undefined
  var slideSpeed: js.UndefOr[Double] = js.undefined
}

object IAccordionMenuOptions {
  @scala.inline
  def apply(multiOpen: js.UndefOr[Boolean] = js.undefined, slideSpeed: js.UndefOr[Double] = js.undefined): IAccordionMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multiOpen)) __obj.updateDynamic("multiOpen")(multiOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slideSpeed)) __obj.updateDynamic("slideSpeed")(slideSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccordionMenuOptions]
  }
}

