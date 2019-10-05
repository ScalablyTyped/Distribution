package typings.foundationDashSites.FoundationSites

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
    decimal: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledClass: String = null,
    doubleSided: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    initialEnd: Int | Double = null,
    initialStart: Int | Double = null,
    moveTime: Int | Double = null,
    start: Int | Double = null,
    step: Int | Double = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ISliderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binding)) __obj.updateDynamic("binding")(binding)
    if (!js.isUndefined(clickSelect)) __obj.updateDynamic("clickSelect")(clickSelect)
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledClass != null) __obj.updateDynamic("disabledClass")(disabledClass)
    if (!js.isUndefined(doubleSided)) __obj.updateDynamic("doubleSided")(doubleSided)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (initialEnd != null) __obj.updateDynamic("initialEnd")(initialEnd.asInstanceOf[js.Any])
    if (initialStart != null) __obj.updateDynamic("initialStart")(initialStart.asInstanceOf[js.Any])
    if (moveTime != null) __obj.updateDynamic("moveTime")(moveTime.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[ISliderOptions]
  }
}

