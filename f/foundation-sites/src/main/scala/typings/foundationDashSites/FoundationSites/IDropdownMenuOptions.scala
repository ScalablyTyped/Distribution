package typings.foundationDashSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownMenuOptions extends js.Object {
  var alignment: js.UndefOr[String] = js.undefined
  var autoclose: js.UndefOr[Boolean] = js.undefined
  var clickOpen: js.UndefOr[Boolean] = js.undefined
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var closingTime: js.UndefOr[Double] = js.undefined
  var disableHover: js.UndefOr[Boolean] = js.undefined
  var forceFollow: js.UndefOr[Boolean] = js.undefined
  var hoverDelay: js.UndefOr[Double] = js.undefined
  var rightClass: js.UndefOr[String] = js.undefined
  var verticalClass: js.UndefOr[String] = js.undefined
}

object IDropdownMenuOptions {
  @scala.inline
  def apply(
    alignment: String = null,
    autoclose: js.UndefOr[Boolean] = js.undefined,
    clickOpen: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    closingTime: Int | Double = null,
    disableHover: js.UndefOr[Boolean] = js.undefined,
    forceFollow: js.UndefOr[Boolean] = js.undefined,
    hoverDelay: Int | Double = null,
    rightClass: String = null,
    verticalClass: String = null
  ): IDropdownMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose.asInstanceOf[js.Any])
    if (!js.isUndefined(clickOpen)) __obj.updateDynamic("clickOpen")(clickOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (closingTime != null) __obj.updateDynamic("closingTime")(closingTime.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHover)) __obj.updateDynamic("disableHover")(disableHover.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFollow)) __obj.updateDynamic("forceFollow")(forceFollow.asInstanceOf[js.Any])
    if (hoverDelay != null) __obj.updateDynamic("hoverDelay")(hoverDelay.asInstanceOf[js.Any])
    if (rightClass != null) __obj.updateDynamic("rightClass")(rightClass.asInstanceOf[js.Any])
    if (verticalClass != null) __obj.updateDynamic("verticalClass")(verticalClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownMenuOptions]
  }
}

