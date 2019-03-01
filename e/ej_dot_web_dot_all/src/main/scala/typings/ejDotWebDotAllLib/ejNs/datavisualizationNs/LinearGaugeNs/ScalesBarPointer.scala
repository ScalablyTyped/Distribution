package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesBarPointer extends js.Object {
  /** Specifies the backgroundColor of bar pointer
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the border of bar pointer
    * @Default {null}
    */
  var border: js.UndefOr[ScalesBarPointersBorder] = js.undefined
  /** Specifies the distanceFromScale of bar pointer
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the scaleBar Gradient of bar pointer
    * @Default {null}
    */
  var gradients: js.UndefOr[js.Any] = js.undefined
  /** Specifies the opacity of bar pointer
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the value of bar pointer
    * @Default {null}
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the pointer Width of bar pointer
    * @Default {width=30}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ScalesBarPointer {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    border: ScalesBarPointersBorder = null,
    distanceFromScale: scala.Int | scala.Double = null,
    gradients: js.Any = null,
    opacity: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): ScalesBarPointer = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (border != null) __obj.updateDynamic("border")(border)
    if (distanceFromScale != null) __obj.updateDynamic("distanceFromScale")(distanceFromScale.asInstanceOf[js.Any])
    if (gradients != null) __obj.updateDynamic("gradients")(gradients)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesBarPointer]
  }
}

