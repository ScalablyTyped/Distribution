package typings.foundationDashSites.FoundationSitesNs

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
    hOffset: Int | Double = null,
    hover: js.UndefOr[Boolean] = js.undefined,
    hoverDelay: Int | Double = null,
    hoverPane: js.UndefOr[Boolean] = js.undefined,
    positionClass: String = null,
    trapFocus: js.UndefOr[Boolean] = js.undefined,
    vOffset: Int | Double = null
  ): IDropdownOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (hOffset != null) __obj.updateDynamic("hOffset")(hOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(hover)) __obj.updateDynamic("hover")(hover)
    if (hoverDelay != null) __obj.updateDynamic("hoverDelay")(hoverDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverPane)) __obj.updateDynamic("hoverPane")(hoverPane)
    if (positionClass != null) __obj.updateDynamic("positionClass")(positionClass)
    if (!js.isUndefined(trapFocus)) __obj.updateDynamic("trapFocus")(trapFocus)
    if (vOffset != null) __obj.updateDynamic("vOffset")(vOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownOptions]
  }
}

