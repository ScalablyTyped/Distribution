package typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs

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
    distanceFromScale: Int | Double = null,
    endValue: Int | Double = null,
    endWidth: Int | Double = null,
    gradients: js.Any = null,
    opacity: Int | Double = null,
    placement: PointerPlacement | String = null,
    startValue: Int | Double = null,
    startWidth: Int | Double = null
  ): ScalesRange = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (border != null) __obj.updateDynamic("border")(border)
    if (distanceFromScale != null) __obj.updateDynamic("distanceFromScale")(distanceFromScale.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (endWidth != null) __obj.updateDynamic("endWidth")(endWidth.asInstanceOf[js.Any])
    if (gradients != null) __obj.updateDynamic("gradients")(gradients)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (startWidth != null) __obj.updateDynamic("startWidth")(startWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesRange]
  }
}

