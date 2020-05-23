package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesRange extends js.Object {
  /** Specify backgroundColor for the ranges of circular gauge
    * @Default {#32b3c6}
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Specify border for ranges of circular gauge
    * @Default {Object}
    */
  var border: js.UndefOr[ScalesRangesBorder] = js.undefined
  /** Specify distanceFromScale value for ranges of circular gauge
    * @Default {25}
    */
  var distanceFromScale: js.UndefOr[Double] = js.undefined
  /** Specify endValue for ranges of circular gauge
    * @Default {null}
    */
  var endValue: js.UndefOr[Double] = js.undefined
  /** Specify endWidth for ranges of circular gauge
    * @Default {10}
    */
  var endWidth: js.UndefOr[Double] = js.undefined
  /** Specify range gradients of circular gauge
    * @Default {null}
    */
  var gradients: js.UndefOr[js.Any] = js.undefined
  /** Specify text for the ranges of circular gauge
    * @Default {null}
    */
  var legendText: js.UndefOr[String] = js.undefined
  /** Specify opacity value for ranges of circular gauge
    * @Default {null}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specify placement of circular gauge. See RangePlacement
    * @Default {Near}
    */
  var placement: js.UndefOr[Placement | String] = js.undefined
  /** Specify size of the range value of circular gauge
    * @Default {5}
    */
  var size: js.UndefOr[Double] = js.undefined
  /** Specify startValue for ranges of circular gauge
    * @Default {null}
    */
  var startValue: js.UndefOr[Double] = js.undefined
  /** Specify startWidth of circular gauge
    * @Default {[Array.number] scale.ranges.startWidth = 10}
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
    legendText: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    placement: Placement | String = null,
    size: js.UndefOr[Double] = js.undefined,
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
    if (legendText != null) __obj.updateDynamic("legendText")(legendText.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startValue)) __obj.updateDynamic("startValue")(startValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startWidth)) __obj.updateDynamic("startWidth")(startWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesRange]
  }
}

