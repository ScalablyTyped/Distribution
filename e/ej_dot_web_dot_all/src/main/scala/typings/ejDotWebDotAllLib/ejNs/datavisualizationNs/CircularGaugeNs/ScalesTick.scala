package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesTick extends js.Object {
  /** Specify the angle for the ticks of circular gauge
    * @Default {0}
    */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /** Specify tick color of circular gauge
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specify distanceFromScale value for ticks of circular gauge
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[scala.Double] = js.undefined
  /** Specify tick height of circular gauge
    * @Default {16}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Specify tick placement of circular gauge. See TickPlacement
    * @Default {Near}
    */
  var placement: js.UndefOr[Placement | java.lang.String] = js.undefined
  /** Specify tick Style of circular gauge. See TickType
    * @Default {Major}
    */
  var `type`: js.UndefOr[LabelType | java.lang.String] = js.undefined
  /** Specify tick width of circular gauge
    * @Default {3}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ScalesTick {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    distanceFromScale: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    placement: Placement | java.lang.String = null,
    `type`: LabelType | java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): ScalesTick = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (distanceFromScale != null) __obj.updateDynamic("distanceFromScale")(distanceFromScale.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesTick]
  }
}

