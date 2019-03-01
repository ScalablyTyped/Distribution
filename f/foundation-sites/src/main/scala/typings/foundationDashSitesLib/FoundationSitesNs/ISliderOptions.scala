package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISliderOptions extends js.Object {
  var binding: js.UndefOr[scala.Boolean] = js.undefined
  var clickSelect: js.UndefOr[scala.Boolean] = js.undefined
  var decimal: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var disabledClass: js.UndefOr[java.lang.String] = js.undefined
  var doubleSided: js.UndefOr[scala.Boolean] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var end: js.UndefOr[scala.Double] = js.undefined
  var initialEnd: js.UndefOr[scala.Double] = js.undefined
  var initialStart: js.UndefOr[scala.Double] = js.undefined
  var moveTime: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object ISliderOptions {
  @scala.inline
  def apply(
    binding: js.UndefOr[scala.Boolean] = js.undefined,
    clickSelect: js.UndefOr[scala.Boolean] = js.undefined,
    decimal: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledClass: java.lang.String = null,
    doubleSided: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    end: scala.Int | scala.Double = null,
    initialEnd: scala.Int | scala.Double = null,
    initialStart: scala.Int | scala.Double = null,
    moveTime: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
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

