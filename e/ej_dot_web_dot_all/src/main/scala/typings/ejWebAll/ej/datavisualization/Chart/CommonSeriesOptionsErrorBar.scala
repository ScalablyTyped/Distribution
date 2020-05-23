package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsErrorBar extends js.Object {
  /** Options for customizing the error bar cap.
    */
  var cap: js.UndefOr[CommonSeriesOptionsErrorBarCap] = js.undefined
  /** Specifies the direction of error bar.
    * @Default {both}
    */
  var direction: js.UndefOr[ErrorBarDirection | String] = js.undefined
  /** Fill color of the error bar.
    * @Default {#000000}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Value of horizontal  error bar.
    * @Default {1}
    */
  var horizontalErrorValue: js.UndefOr[Double] = js.undefined
  /** Value of negative horizontal error bar.
    * @Default {1}
    */
  var horizontalNegativeErrorValue: js.UndefOr[Double] = js.undefined
  /** Value of positive horizontal error bar.
    * @Default {1}
    */
  var horizontalPositiveErrorValue: js.UndefOr[Double] = js.undefined
  /** Specifies the mode of error bar.
    * @Default {vertical}
    */
  var mode: js.UndefOr[ErrorBarMode | String] = js.undefined
  /** Specifies the type of error bar.
    * @Default {FixedValue}
    */
  var `type`: js.UndefOr[ErrorBarType | String] = js.undefined
  /** Value of vertical error bar.
    * @Default {3}
    */
  var verticalErrorValue: js.UndefOr[Double] = js.undefined
  /** Value of negative vertical error bar.
    * @Default {5}
    */
  var verticalNegativeErrorValue: js.UndefOr[Double] = js.undefined
  /** Value of positive vertical error bar.
    * @Default {5}
    */
  var verticalPositiveErrorValue: js.UndefOr[Double] = js.undefined
  /** Show/hides the error bar
    * @Default {visible}
    */
  var visibility: js.UndefOr[Boolean] = js.undefined
  /** Width of the error bar.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CommonSeriesOptionsErrorBar {
  @scala.inline
  def apply(
    cap: CommonSeriesOptionsErrorBarCap = null,
    direction: ErrorBarDirection | String = null,
    fill: String = null,
    horizontalErrorValue: js.UndefOr[Double] = js.undefined,
    horizontalNegativeErrorValue: js.UndefOr[Double] = js.undefined,
    horizontalPositiveErrorValue: js.UndefOr[Double] = js.undefined,
    mode: ErrorBarMode | String = null,
    `type`: ErrorBarType | String = null,
    verticalErrorValue: js.UndefOr[Double] = js.undefined,
    verticalNegativeErrorValue: js.UndefOr[Double] = js.undefined,
    verticalPositiveErrorValue: js.UndefOr[Double] = js.undefined,
    visibility: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): CommonSeriesOptionsErrorBar = {
    val __obj = js.Dynamic.literal()
    if (cap != null) __obj.updateDynamic("cap")(cap.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalErrorValue)) __obj.updateDynamic("horizontalErrorValue")(horizontalErrorValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalNegativeErrorValue)) __obj.updateDynamic("horizontalNegativeErrorValue")(horizontalNegativeErrorValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalPositiveErrorValue)) __obj.updateDynamic("horizontalPositiveErrorValue")(horizontalPositiveErrorValue.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalErrorValue)) __obj.updateDynamic("verticalErrorValue")(verticalErrorValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalNegativeErrorValue)) __obj.updateDynamic("verticalNegativeErrorValue")(verticalNegativeErrorValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalPositiveErrorValue)) __obj.updateDynamic("verticalPositiveErrorValue")(verticalPositiveErrorValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visibility)) __obj.updateDynamic("visibility")(visibility.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsErrorBar]
  }
}

