package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesLabel extends js.Object {
  /** Specify the angle for the labels of circular gauge
    * @Default {0}
    */
  var angle: js.UndefOr[Double] = js.undefined
  /** Specify labels autoAngle value of circular gauge
    * @Default {false}
    */
  var autoAngle: js.UndefOr[Boolean] = js.undefined
  /** Specify label color of circular gauge
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specify distanceFromScale value for labels of circular gauge
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[Double] = js.undefined
  /** Specify font for labels of circular gauge
    * @Default {Object}
    */
  var font: js.UndefOr[ScalesLabelsFont] = js.undefined
  /** Specify includeFirstValue of circular gauge
    * @Default {true}
    */
  var includeFirstValue: js.UndefOr[Boolean] = js.undefined
  /** Specify opacity value for labels of circular gauge
    * @Default {null}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specify label placement of circular gauge. See
    * @Default {Near}
    */
  var placement: js.UndefOr[Placement | String] = js.undefined
  /** Specify label Style of circular gauge. See
    * @Default {Major}
    */
  var `type`: js.UndefOr[LabelType | String] = js.undefined
  /** Specify unitText of circular gauge
    */
  var unitText: js.UndefOr[String] = js.undefined
  /** Specify unitTextPosition of circular gauge. See UnitTextPosition
    * @Default {Back}
    */
  var unitTextPosition: js.UndefOr[UnitTextPlacement | String] = js.undefined
}

object ScalesLabel {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    autoAngle: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    distanceFromScale: js.UndefOr[Double] = js.undefined,
    font: ScalesLabelsFont = null,
    includeFirstValue: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    placement: Placement | String = null,
    `type`: LabelType | String = null,
    unitText: String = null,
    unitTextPosition: UnitTextPlacement | String = null
  ): ScalesLabel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAngle)) __obj.updateDynamic("autoAngle")(autoAngle.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(distanceFromScale)) __obj.updateDynamic("distanceFromScale")(distanceFromScale.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(includeFirstValue)) __obj.updateDynamic("includeFirstValue")(includeFirstValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unitText != null) __obj.updateDynamic("unitText")(unitText.asInstanceOf[js.Any])
    if (unitTextPosition != null) __obj.updateDynamic("unitTextPosition")(unitTextPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesLabel]
  }
}

