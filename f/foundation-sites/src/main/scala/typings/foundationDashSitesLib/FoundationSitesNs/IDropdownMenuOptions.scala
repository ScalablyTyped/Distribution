package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownMenuOptions extends js.Object {
  var alignment: js.UndefOr[java.lang.String] = js.undefined
  var autoclose: js.UndefOr[scala.Boolean] = js.undefined
  var clickOpen: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var closingTime: js.UndefOr[scala.Double] = js.undefined
  var disableHover: js.UndefOr[scala.Boolean] = js.undefined
  var forceFollow: js.UndefOr[scala.Boolean] = js.undefined
  var hoverDelay: js.UndefOr[scala.Double] = js.undefined
  var rightClass: js.UndefOr[java.lang.String] = js.undefined
  var verticalClass: js.UndefOr[java.lang.String] = js.undefined
}

object IDropdownMenuOptions {
  @scala.inline
  def apply(
    alignment: java.lang.String = null,
    autoclose: js.UndefOr[scala.Boolean] = js.undefined,
    clickOpen: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    closingTime: scala.Int | scala.Double = null,
    disableHover: js.UndefOr[scala.Boolean] = js.undefined,
    forceFollow: js.UndefOr[scala.Boolean] = js.undefined,
    hoverDelay: scala.Int | scala.Double = null,
    rightClass: java.lang.String = null,
    verticalClass: java.lang.String = null
  ): IDropdownMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose)
    if (!js.isUndefined(clickOpen)) __obj.updateDynamic("clickOpen")(clickOpen)
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (closingTime != null) __obj.updateDynamic("closingTime")(closingTime.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHover)) __obj.updateDynamic("disableHover")(disableHover)
    if (!js.isUndefined(forceFollow)) __obj.updateDynamic("forceFollow")(forceFollow)
    if (hoverDelay != null) __obj.updateDynamic("hoverDelay")(hoverDelay.asInstanceOf[js.Any])
    if (rightClass != null) __obj.updateDynamic("rightClass")(rightClass)
    if (verticalClass != null) __obj.updateDynamic("verticalClass")(verticalClass)
    __obj.asInstanceOf[IDropdownMenuOptions]
  }
}

