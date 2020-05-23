package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISliderOptions extends js.Object {
  var binding: js.UndefOr[Boolean] = js.undefined
  var clickSelect: js.UndefOr[Boolean] = js.undefined
  var decimal: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledClass: js.UndefOr[String] = js.undefined
  var doubleSided: js.UndefOr[Boolean] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var initialEnd: js.UndefOr[Double] = js.undefined
  var initialStart: js.UndefOr[Double] = js.undefined
  var moveTime: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ISliderOptions {
  @scala.inline
  def apply(
    binding: js.UndefOr[Boolean] = js.undefined,
    clickSelect: js.UndefOr[Boolean] = js.undefined,
    decimal: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledClass: String = null,
    doubleSided: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    end: js.UndefOr[Double] = js.undefined,
    initialEnd: js.UndefOr[Double] = js.undefined,
    initialStart: js.UndefOr[Double] = js.undefined,
    moveTime: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ISliderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binding)) __obj.updateDynamic("binding")(binding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickSelect)) __obj.updateDynamic("clickSelect")(clickSelect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decimal)) __obj.updateDynamic("decimal")(decimal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (disabledClass != null) __obj.updateDynamic("disabledClass")(disabledClass.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleSided)) __obj.updateDynamic("doubleSided")(doubleSided.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialEnd)) __obj.updateDynamic("initialEnd")(initialEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialStart)) __obj.updateDynamic("initialStart")(initialStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(moveTime)) __obj.updateDynamic("moveTime")(moveTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISliderOptions]
  }
}

