package typings.devextreme

import typings.devextreme.devextremeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowedPageSizes extends js.Object {
  var allowedPageSizes: js.UndefOr[js.Array[Double] | auto] = js.undefined
  var infoText: js.UndefOr[String] = js.undefined
  var showInfo: js.UndefOr[Boolean] = js.undefined
  var showNavigationButtons: js.UndefOr[Boolean] = js.undefined
  var showPageSizeSelector: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean | auto] = js.undefined
}

object AnonAllowedPageSizes {
  @scala.inline
  def apply(
    allowedPageSizes: js.Array[Double] | auto = null,
    infoText: String = null,
    showInfo: js.UndefOr[Boolean] = js.undefined,
    showNavigationButtons: js.UndefOr[Boolean] = js.undefined,
    showPageSizeSelector: js.UndefOr[Boolean] = js.undefined,
    visible: Boolean | auto = null
  ): AnonAllowedPageSizes = {
    val __obj = js.Dynamic.literal()
    if (allowedPageSizes != null) __obj.updateDynamic("allowedPageSizes")(allowedPageSizes.asInstanceOf[js.Any])
    if (infoText != null) __obj.updateDynamic("infoText")(infoText.asInstanceOf[js.Any])
    if (!js.isUndefined(showInfo)) __obj.updateDynamic("showInfo")(showInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(showNavigationButtons)) __obj.updateDynamic("showNavigationButtons")(showNavigationButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(showPageSizeSelector)) __obj.updateDynamic("showPageSizeSelector")(showPageSizeSelector.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowedPageSizes]
  }
}

