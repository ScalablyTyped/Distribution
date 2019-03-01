package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorMappingCollectionLabel extends js.Object {
  /** Enables/disables the bold style of the heat map label.
    * @Default {false}
    */
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the font color of the heat map label.
    * @Default {black}
    */
  var fontColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the font family of the heat map label.
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the font size of the heat map label.
    * @Default {10}
    */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  /** Enables/disables the italic style of the heat map label.
    * @Default {false}
    */
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  /** specifies the text value of the heat map label.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the text style of the heat map label.
    * @Default {ej.HeatMap.TextDecoration.None}
    */
  var textDecoration: js.UndefOr[TextDecoration | java.lang.String] = js.undefined
}

object ColorMappingCollectionLabel {
  @scala.inline
  def apply(
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    fontColor: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null,
    textDecoration: TextDecoration | java.lang.String = null
  ): ColorMappingCollectionLabel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorMappingCollectionLabel]
  }
}

