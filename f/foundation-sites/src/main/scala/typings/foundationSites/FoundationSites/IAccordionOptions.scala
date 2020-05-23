package typings.foundationSites.FoundationSites

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
    slideSpeed: js.UndefOr[Double] = js.undefined
  ): IAccordionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAllClosed)) __obj.updateDynamic("allowAllClosed")(allowAllClosed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiExpand)) __obj.updateDynamic("multiExpand")(multiExpand.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slideSpeed)) __obj.updateDynamic("slideSpeed")(slideSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccordionOptions]
  }
}

