package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersLabelSettingsFont extends js.Object {
  /** Font color of the data label text.
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Font family of the data label.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Font style of the data label.
    * @Default {normal.}
    */
  var fontStyle: js.UndefOr[FontStyle | java.lang.String] = js.undefined
  /** NameType DescriptionRegularstring Specifies the font weight as regular.BoldstringSpecifies the font weight as bold.LighterstringSpecifies the font weight as lighter.
    * @Default {regular. See}
    */
  var fontWeight: js.UndefOr[FontWeight | java.lang.String] = js.undefined
  /** Opacity of the text.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Font size of the data label.
    * @Default {12px}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object LayersLabelSettingsFont {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontStyle: FontStyle | java.lang.String = null,
    fontWeight: FontWeight | java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    size: java.lang.String = null
  ): LayersLabelSettingsFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[LayersLabelSettingsFont]
  }
}

