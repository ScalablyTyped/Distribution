package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesMarkerPointer extends js.Object {
  /** Specifies the backgroundColor of marker pointer
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Specifies the border of marker pointer
    * @Default {null}
    */
  var border: js.UndefOr[ScalesMarkerPointersBorder] = js.undefined
  /** Specifies the distanceFromScale of marker pointer
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[Double] = js.undefined
  /** Specifies the pointer Gradient of marker pointer
    * @Default {null}
    */
  var gradients: js.UndefOr[js.Any] = js.undefined
  /** Specifies the pointer Length of marker pointer
    * @Default {30}
    */
  var length: js.UndefOr[Double] = js.undefined
  /** Specifies the opacity of marker pointer
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies the pointer Placement of marker pointer See PointerPlacement
    * @Default {Far}
    */
  var placement: js.UndefOr[PointerPlacement | String] = js.undefined
  /** Specifies the marker Style of marker pointerSee
    * @Default {Triangle}
    */
  var `type`: js.UndefOr[MarkerType | String] = js.undefined
  /** Specifies the value of marker pointer
    * @Default {null}
    */
  var value: js.UndefOr[Double] = js.undefined
  /** Specifies the pointer Width of marker pointer
    * @Default {30}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ScalesMarkerPointer {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    border: ScalesMarkerPointersBorder = null,
    distanceFromScale: js.UndefOr[Double] = js.undefined,
    gradients: js.Any = null,
    length: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    placement: PointerPlacement | String = null,
    `type`: MarkerType | String = null,
    value: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ScalesMarkerPointer = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(distanceFromScale)) __obj.updateDynamic("distanceFromScale")(distanceFromScale.get.asInstanceOf[js.Any])
    if (gradients != null) __obj.updateDynamic("gradients")(gradients.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesMarkerPointer]
  }
}

