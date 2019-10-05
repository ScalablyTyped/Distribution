package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

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
    distanceFromScale: Int | Double = null,
    endValue: Int | Double = null,
    endWidth: Int | Double = null,
    gradients: js.Any = null,
    legendText: String = null,
    opacity: Int | Double = null,
    placement: Placement | String = null,
    size: Int | Double = null,
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
    if (legendText != null) __obj.updateDynamic("legendText")(legendText)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (startWidth != null) __obj.updateDynamic("startWidth")(startWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesRange]
  }
}

