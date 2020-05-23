package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesRange extends js.Object {
  /** Specifies the backgroundColor in the ranges.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Specifies the border in the ranges.
    * @Default {null}
    */
  var border: js.UndefOr[ScalesRangesBorder] = js.undefined
  /** Specifies the distanceFromScale in the ranges.
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[Double] = js.undefined
  /** Specifies the endValue in the ranges.
    * @Default {60}
    */
  var endValue: js.UndefOr[Double] = js.undefined
  /** Specifies the endWidth in the ranges.
    * @Default {10}
    */
  var endWidth: js.UndefOr[Double] = js.undefined
  /** Specifies the range Gradient in the ranges.
    * @Default {null}
    */
  var gradients: js.UndefOr[js.Any] = js.undefined
  /** Specifies the opacity in the ranges.
    * @Default {null}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies the range Position in the ranges. See RangePlacement
    * @Default {Center}
    */
  var placement: js.UndefOr[PointerPlacement | String] = js.undefined
  /** Specifies the startValue in the ranges.
    * @Default {20}
    */
  var startValue: js.UndefOr[Double] = js.undefined
  /** Specifies the startWidth in the ranges.
    * @Default {10}
    */
  var startWidth: js.UndefOr[Double] = js.undefined
}

object ScalesRange {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    border: ScalesRangesBorder = null,
    distanceFromScale: js.UndefOr[Double] = js.undefined,
    endValue: js.UndefOr[Double] = js.undefined,
    endWidth: js.UndefOr[Double] = js.undefined,
    gradients: js.Any = null,
    opacity: js.UndefOr[Double] = js.undefined,
    placement: PointerPlacement | String = null,
    startValue: js.UndefOr[Double] = js.undefined,
    startWidth: js.UndefOr[Double] = js.undefined
  ): ScalesRange = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(distanceFromScale)) __obj.updateDynamic("distanceFromScale")(distanceFromScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endValue)) __obj.updateDynamic("endValue")(endValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endWidth)) __obj.updateDynamic("endWidth")(endWidth.get.asInstanceOf[js.Any])
    if (gradients != null) __obj.updateDynamic("gradients")(gradients.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(startValue)) __obj.updateDynamic("startValue")(startValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startWidth)) __obj.updateDynamic("startWidth")(startWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesRange]
  }
}

