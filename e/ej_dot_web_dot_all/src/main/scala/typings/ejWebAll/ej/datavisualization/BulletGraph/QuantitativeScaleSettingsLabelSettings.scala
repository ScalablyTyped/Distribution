package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantitativeScaleSettingsLabelSettings extends js.Object {
  /** Contains property to customize the font of the labels in bullet graph.
    */
  var font: js.UndefOr[QuantitativeScaleSettingsLabelSettingsFont] = js.undefined
  /** Specifies the placement of labels in bullet graph scale.
    * @Default {outside}
    */
  var labelPlacement: js.UndefOr[LabelPlacement | String] = js.undefined
  /** Specifies the prefix to be added with labels in bullet graph.
    * @Default {Empty string}
    */
  var labelPrefix: js.UndefOr[String] = js.undefined
  /** Specifies the suffix to be added after labels in bullet graph.
    * @Default {Empty string}
    */
  var labelSuffix: js.UndefOr[String] = js.undefined
  /** Specifies the horizontal/vertical padding of labels.
    * @Default {15}
    */
  var offset: js.UndefOr[Double] = js.undefined
  /** Specifies the position of the labels to render either above or below the graph. See
    * @Default {below}
    */
  var position: js.UndefOr[LabelPosition | String] = js.undefined
  /** Specifies the Size of the labels.
    * @Default {12}
    */
  var size: js.UndefOr[Double] = js.undefined
  /** Specifies the stroke color of the labels in bullet graph.
    * @Default {null}
    */
  var stroke: js.UndefOr[String] = js.undefined
}

object QuantitativeScaleSettingsLabelSettings {
  @scala.inline
  def apply(
    font: QuantitativeScaleSettingsLabelSettingsFont = null,
    labelPlacement: LabelPlacement | String = null,
    labelPrefix: String = null,
    labelSuffix: String = null,
    offset: Int | Double = null,
    position: LabelPosition | String = null,
    size: Int | Double = null,
    stroke: String = null
  ): QuantitativeScaleSettingsLabelSettings = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (labelPrefix != null) __obj.updateDynamic("labelPrefix")(labelPrefix.asInstanceOf[js.Any])
    if (labelSuffix != null) __obj.updateDynamic("labelSuffix")(labelSuffix.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsLabelSettings]
  }
}

