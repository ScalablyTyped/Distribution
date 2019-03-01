package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesLabel extends js.Object {
  /** Specify the angle for the labels of circular gauge
    * @Default {0}
    */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /** Specify labels autoAngle value of circular gauge
    * @Default {false}
    */
  var autoAngle: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify label color of circular gauge
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specify distanceFromScale value for labels of circular gauge
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[scala.Double] = js.undefined
  /** Specify font for labels of circular gauge
    * @Default {Object}
    */
  var font: js.UndefOr[ScalesLabelsFont] = js.undefined
  /** Specify includeFirstValue of circular gauge
    * @Default {true}
    */
  var includeFirstValue: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify opacity value for labels of circular gauge
    * @Default {null}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specify label placement of circular gauge. See
    * @Default {Near}
    */
  var placement: js.UndefOr[Placement | java.lang.String] = js.undefined
  /** Specify label Style of circular gauge. See
    * @Default {Major}
    */
  var `type`: js.UndefOr[LabelType | java.lang.String] = js.undefined
  /** Specify unitText of circular gauge
    */
  var unitText: js.UndefOr[java.lang.String] = js.undefined
  /** Specify unitTextPosition of circular gauge. See UnitTextPosition
    * @Default {Back}
    */
  var unitTextPosition: js.UndefOr[UnitTextPlacement | java.lang.String] = js.undefined
}

object ScalesLabel {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    autoAngle: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    distanceFromScale: scala.Int | scala.Double = null,
    font: ScalesLabelsFont = null,
    includeFirstValue: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null,
    placement: Placement | java.lang.String = null,
    `type`: LabelType | java.lang.String = null,
    unitText: java.lang.String = null,
    unitTextPosition: UnitTextPlacement | java.lang.String = null
  ): ScalesLabel = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAngle)) __obj.updateDynamic("autoAngle")(autoAngle)
    if (color != null) __obj.updateDynamic("color")(color)
    if (distanceFromScale != null) __obj.updateDynamic("distanceFromScale")(distanceFromScale.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(includeFirstValue)) __obj.updateDynamic("includeFirstValue")(includeFirstValue)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unitText != null) __obj.updateDynamic("unitText")(unitText)
    if (unitTextPosition != null) __obj.updateDynamic("unitTextPosition")(unitTextPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesLabel]
  }
}

