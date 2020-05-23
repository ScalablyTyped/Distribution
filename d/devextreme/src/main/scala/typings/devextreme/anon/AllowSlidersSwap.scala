package typings.devextreme.anon

import typings.devextreme.devextremeStrings.onMoving
import typings.devextreme.devextremeStrings.onMovingComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowSlidersSwap extends js.Object {
  var allowSlidersSwap: js.UndefOr[Boolean] = js.undefined
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  var callValueChanged: js.UndefOr[onMoving | onMovingComplete] = js.undefined
  var manualRangeSelectionEnabled: js.UndefOr[Boolean] = js.undefined
  var moveSelectedRangeByClick: js.UndefOr[Boolean] = js.undefined
  var snapToTicks: js.UndefOr[Boolean] = js.undefined
}

object AllowSlidersSwap {
  @scala.inline
  def apply(
    allowSlidersSwap: js.UndefOr[Boolean] = js.undefined,
    animationEnabled: js.UndefOr[Boolean] = js.undefined,
    callValueChanged: onMoving | onMovingComplete = null,
    manualRangeSelectionEnabled: js.UndefOr[Boolean] = js.undefined,
    moveSelectedRangeByClick: js.UndefOr[Boolean] = js.undefined,
    snapToTicks: js.UndefOr[Boolean] = js.undefined
  ): AllowSlidersSwap = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSlidersSwap)) __obj.updateDynamic("allowSlidersSwap")(allowSlidersSwap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEnabled)) __obj.updateDynamic("animationEnabled")(animationEnabled.get.asInstanceOf[js.Any])
    if (callValueChanged != null) __obj.updateDynamic("callValueChanged")(callValueChanged.asInstanceOf[js.Any])
    if (!js.isUndefined(manualRangeSelectionEnabled)) __obj.updateDynamic("manualRangeSelectionEnabled")(manualRangeSelectionEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(moveSelectedRangeByClick)) __obj.updateDynamic("moveSelectedRangeByClick")(moveSelectedRangeByClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToTicks)) __obj.updateDynamic("snapToTicks")(snapToTicks.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowSlidersSwap]
  }
}

