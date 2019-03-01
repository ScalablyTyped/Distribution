package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownOptions extends js.Object {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var hOffset: js.UndefOr[scala.Double] = js.undefined
  var hover: js.UndefOr[scala.Boolean] = js.undefined
  var hoverDelay: js.UndefOr[scala.Double] = js.undefined
  var hoverPane: js.UndefOr[scala.Boolean] = js.undefined
  var positionClass: js.UndefOr[java.lang.String] = js.undefined
  var trapFocus: js.UndefOr[scala.Boolean] = js.undefined
  var vOffset: js.UndefOr[scala.Double] = js.undefined
}

object IDropdownOptions {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    hOffset: scala.Int | scala.Double = null,
    hover: js.UndefOr[scala.Boolean] = js.undefined,
    hoverDelay: scala.Int | scala.Double = null,
    hoverPane: js.UndefOr[scala.Boolean] = js.undefined,
    positionClass: java.lang.String = null,
    trapFocus: js.UndefOr[scala.Boolean] = js.undefined,
    vOffset: scala.Int | scala.Double = null
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

