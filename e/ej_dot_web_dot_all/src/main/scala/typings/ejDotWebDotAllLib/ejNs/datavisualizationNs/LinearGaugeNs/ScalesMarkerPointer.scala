package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesMarkerPointer extends js.Object {
  /** Specifies the backgroundColor of marker pointer
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the border of marker pointer
    * @Default {null}
    */
  var border: js.UndefOr[ScalesMarkerPointersBorder] = js.undefined
  /** Specifies the distanceFromScale of marker pointer
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the pointer Gradient of marker pointer
    * @Default {null}
    */
  var gradients: js.UndefOr[js.Any] = js.undefined
  /** Specifies the pointer Length of marker pointer
    * @Default {30}
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the opacity of marker pointer
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the pointer Placement of marker pointer See PointerPlacement
    * @Default {Far}
    */
  var placement: js.UndefOr[PointerPlacement | java.lang.String] = js.undefined
  /** Specifies the marker Style of marker pointerSee
    * @Default {Triangle}
    */
  var `type`: js.UndefOr[MarkerType | java.lang.String] = js.undefined
  /** Specifies the value of marker pointer
    * @Default {null}
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the pointer Width of marker pointer
    * @Default {30}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ScalesMarkerPointer {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    border: ScalesMarkerPointersBorder = null,
    distanceFromScale: scala.Int | scala.Double = null,
    gradients: js.Any = null,
    length: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    placement: PointerPlacement | java.lang.String = null,
    `type`: MarkerType | java.lang.String = null,
    value: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): ScalesMarkerPointer = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (border != null) __obj.updateDynamic("border")(border)
    if (distanceFromScale != null) __obj.updateDynamic("distanceFromScale")(distanceFromScale.asInstanceOf[js.Any])
    if (gradients != null) __obj.updateDynamic("gradients")(gradients)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesMarkerPointer]
  }
}

