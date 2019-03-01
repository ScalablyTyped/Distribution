package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesPointerCap extends js.Object {
  /** Specify cap backgroundColor of circular gauge
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specify cap borderColor of circular gauge
    * @Default {null}
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specify pointerCap borderWidth value of circular gauge
    * @Default {3}
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /** Specify cap interiorGradient value of circular gauge
    * @Default {null}
    */
  var interiorGradient: js.UndefOr[js.Any] = js.undefined
  /** Specify pointerCap Radius value of circular gauge
    * @Default {7}
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
}

object ScalesPointerCap {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    borderWidth: scala.Int | scala.Double = null,
    interiorGradient: js.Any = null,
    radius: scala.Int | scala.Double = null
  ): ScalesPointerCap = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (interiorGradient != null) __obj.updateDynamic("interiorGradient")(interiorGradient)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesPointerCap]
  }
}

