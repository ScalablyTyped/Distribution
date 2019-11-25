package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesTick extends js.Object {
  /** Specify the angle for the ticks of circular gauge
    * @Default {0}
    */
  var angle: js.UndefOr[Double] = js.undefined
  /** Specify tick color of circular gauge
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specify distanceFromScale value for ticks of circular gauge
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[Double] = js.undefined
  /** Specify tick height of circular gauge
    * @Default {16}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Specify tick placement of circular gauge. See TickPlacement
    * @Default {Near}
    */
  var placement: js.UndefOr[Placement | String] = js.undefined
  /** Specify tick Style of circular gauge. See TickType
    * @Default {Major}
    */
  var `type`: js.UndefOr[LabelType | String] = js.undefined
  /** Specify tick width of circular gauge
    * @Default {3}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ScalesTick {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    color: String = null,
    distanceFromScale: Int | Double = null,
    height: Int | Double = null,
    placement: Placement | String = null,
    `type`: LabelType | String = null,
    width: Int | Double = null
  ): ScalesTick = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (distanceFromScale != null) __obj.updateDynamic("distanceFromScale")(distanceFromScale.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesTick]
  }
}

