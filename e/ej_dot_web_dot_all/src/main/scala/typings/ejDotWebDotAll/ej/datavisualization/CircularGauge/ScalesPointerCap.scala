package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesPointerCap extends js.Object {
  /** Specify cap backgroundColor of circular gauge
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Specify cap borderColor of circular gauge
    * @Default {null}
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /** Specify pointerCap borderWidth value of circular gauge
    * @Default {3}
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /** Specify cap interiorGradient value of circular gauge
    * @Default {null}
    */
  var interiorGradient: js.UndefOr[js.Any] = js.undefined
  /** Specify pointerCap Radius value of circular gauge
    * @Default {7}
    */
  var radius: js.UndefOr[Double] = js.undefined
}

object ScalesPointerCap {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    borderWidth: Int | Double = null,
    interiorGradient: js.Any = null,
    radius: Int | Double = null
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

