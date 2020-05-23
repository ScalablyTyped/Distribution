package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownOptions extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var hOffset: js.UndefOr[Double] = js.undefined
  var hover: js.UndefOr[Boolean] = js.undefined
  var hoverDelay: js.UndefOr[Double] = js.undefined
  var hoverPane: js.UndefOr[Boolean] = js.undefined
  var positionClass: js.UndefOr[String] = js.undefined
  var trapFocus: js.UndefOr[Boolean] = js.undefined
  var vOffset: js.UndefOr[Double] = js.undefined
}

object IDropdownOptions {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    hOffset: js.UndefOr[Double] = js.undefined,
    hover: js.UndefOr[Boolean] = js.undefined,
    hoverDelay: js.UndefOr[Double] = js.undefined,
    hoverPane: js.UndefOr[Boolean] = js.undefined,
    positionClass: String = null,
    trapFocus: js.UndefOr[Boolean] = js.undefined,
    vOffset: js.UndefOr[Double] = js.undefined
  ): IDropdownOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hOffset)) __obj.updateDynamic("hOffset")(hOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hover)) __obj.updateDynamic("hover")(hover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverDelay)) __obj.updateDynamic("hoverDelay")(hoverDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverPane)) __obj.updateDynamic("hoverPane")(hoverPane.get.asInstanceOf[js.Any])
    if (positionClass != null) __obj.updateDynamic("positionClass")(positionClass.asInstanceOf[js.Any])
    if (!js.isUndefined(trapFocus)) __obj.updateDynamic("trapFocus")(trapFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vOffset)) __obj.updateDynamic("vOffset")(vOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownOptions]
  }
}

