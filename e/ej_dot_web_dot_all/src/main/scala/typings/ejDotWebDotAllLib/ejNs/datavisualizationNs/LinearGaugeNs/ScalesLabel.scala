package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesLabel extends js.Object {
  /** Specifies the angle of labels.
    * @Default {0}
    */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the DistanceFromScale of labels.
    * @Default {null}
    */
  var distanceFromScale: js.UndefOr[ScalesLabelsDistanceFromScale] = js.undefined
  /** Specifies the font of labels.
    * @Default {null}
    */
  var font: js.UndefOr[ScalesLabelsFont] = js.undefined
  /** need to includeFirstValue.
    * @Default {true}
    */
  var includeFirstValue: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the opacity of label.
    * @Default {0}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the label Placement of label. See
    * @Default {Near}
    */
  var placement: js.UndefOr[PointerPlacement | java.lang.String] = js.undefined
  /** Specifies the textColor of font.
    * @Default {null}
    */
  var textColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the label Style of label. See
    * @Default {ej.datavisualization.LinearGauge.LabelType.Major}
    */
  var `type`: js.UndefOr[ScaleType | java.lang.String] = js.undefined
  /** Specifies the unitText of label.
    */
  var unitText: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the unitText Position of label.See
    * @Default {Back}
    */
  var unitTextPlacement: js.UndefOr[UnitTextPlacement | java.lang.String] = js.undefined
}

object ScalesLabel {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    distanceFromScale: ScalesLabelsDistanceFromScale = null,
    font: ScalesLabelsFont = null,
    includeFirstValue: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null,
    placement: PointerPlacement | java.lang.String = null,
    textColor: java.lang.String = null,
    `type`: ScaleType | java.lang.String = null,
    unitText: java.lang.String = null,
    unitTextPlacement: UnitTextPlacement | java.lang.String = null
  ): ScalesLabel = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (distanceFromScale != null) __obj.updateDynamic("distanceFromScale")(distanceFromScale)
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(includeFirstValue)) __obj.updateDynamic("includeFirstValue")(includeFirstValue)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unitText != null) __obj.updateDynamic("unitText")(unitText)
    if (unitTextPlacement != null) __obj.updateDynamic("unitTextPlacement")(unitTextPlacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesLabel]
  }
}

