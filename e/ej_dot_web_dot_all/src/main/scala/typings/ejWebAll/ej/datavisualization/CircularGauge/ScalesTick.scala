package typings.ejWebAll.ej.datavisualization.CircularGauge

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
    angle: js.UndefOr[Double] = js.undefined,
    color: String = null,
    distanceFromScale: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    placement: Placement | String = null,
    `type`: LabelType | String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ScalesTick = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(distanceFromScale)) __obj.updateDynamic("distanceFromScale")(distanceFromScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesTick]
  }
}

