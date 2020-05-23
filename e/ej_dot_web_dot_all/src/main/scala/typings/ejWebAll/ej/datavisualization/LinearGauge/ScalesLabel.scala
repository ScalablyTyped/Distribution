package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesLabel extends js.Object {
  /** Specifies the angle of labels.
    * @Default {0}
    */
  var angle: js.UndefOr[Double] = js.undefined
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
  var includeFirstValue: js.UndefOr[Boolean] = js.undefined
  /** Specifies the opacity of label.
    * @Default {0}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies the label Placement of label. See
    * @Default {Near}
    */
  var placement: js.UndefOr[PointerPlacement | String] = js.undefined
  /** Specifies the textColor of font.
    * @Default {null}
    */
  var textColor: js.UndefOr[String] = js.undefined
  /** Specifies the label Style of label. See
    * @Default {ej.datavisualization.LinearGauge.LabelType.Major}
    */
  var `type`: js.UndefOr[ScaleType | String] = js.undefined
  /** Specifies the unitText of label.
    */
  var unitText: js.UndefOr[String] = js.undefined
  /** Specifies the unitText Position of label.See
    * @Default {Back}
    */
  var unitTextPlacement: js.UndefOr[UnitTextPlacement | String] = js.undefined
}

object ScalesLabel {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    distanceFromScale: ScalesLabelsDistanceFromScale = null,
    font: ScalesLabelsFont = null,
    includeFirstValue: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    placement: PointerPlacement | String = null,
    textColor: String = null,
    `type`: ScaleType | String = null,
    unitText: String = null,
    unitTextPlacement: UnitTextPlacement | String = null
  ): ScalesLabel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (distanceFromScale != null) __obj.updateDynamic("distanceFromScale")(distanceFromScale.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(includeFirstValue)) __obj.updateDynamic("includeFirstValue")(includeFirstValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unitText != null) __obj.updateDynamic("unitText")(unitText.asInstanceOf[js.Any])
    if (unitTextPlacement != null) __obj.updateDynamic("unitTextPlacement")(unitTextPlacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesLabel]
  }
}

