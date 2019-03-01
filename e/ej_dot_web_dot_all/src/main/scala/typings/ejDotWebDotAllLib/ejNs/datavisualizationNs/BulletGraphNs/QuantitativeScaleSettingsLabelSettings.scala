package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

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
  var labelPlacement: js.UndefOr[LabelPlacement | java.lang.String] = js.undefined
  /** Specifies the prefix to be added with labels in bullet graph.
    * @Default {Empty string}
    */
  var labelPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the suffix to be added after labels in bullet graph.
    * @Default {Empty string}
    */
  var labelSuffix: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the horizontal/vertical padding of labels.
    * @Default {15}
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the position of the labels to render either above or below the graph. See
    * @Default {below}
    */
  var position: js.UndefOr[LabelPosition | java.lang.String] = js.undefined
  /** Specifies the Size of the labels.
    * @Default {12}
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the stroke color of the labels in bullet graph.
    * @Default {null}
    */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
}

object QuantitativeScaleSettingsLabelSettings {
  @scala.inline
  def apply(
    font: QuantitativeScaleSettingsLabelSettingsFont = null,
    labelPlacement: LabelPlacement | java.lang.String = null,
    labelPrefix: java.lang.String = null,
    labelSuffix: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    position: LabelPosition | java.lang.String = null,
    size: scala.Int | scala.Double = null,
    stroke: java.lang.String = null
  ): QuantitativeScaleSettingsLabelSettings = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (labelPrefix != null) __obj.updateDynamic("labelPrefix")(labelPrefix)
    if (labelSuffix != null) __obj.updateDynamic("labelSuffix")(labelSuffix)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[QuantitativeScaleSettingsLabelSettings]
  }
}

