package typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorMappingCollectionLabel extends js.Object {
  /** Enables/disables the bold style of the heat map label.
    * @Default {false}
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  /** Specifies the font color of the heat map label.
    * @Default {black}
    */
  var fontColor: js.UndefOr[String] = js.undefined
  /** Specifies the font family of the heat map label.
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Specifies the font size of the heat map label.
    * @Default {10}
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /** Enables/disables the italic style of the heat map label.
    * @Default {false}
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  /** specifies the text value of the heat map label.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the text style of the heat map label.
    * @Default {ej.HeatMap.TextDecoration.None}
    */
  var textDecoration: js.UndefOr[TextDecoration | String] = js.undefined
}

object ColorMappingCollectionLabel {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    fontColor: String = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    textDecoration: TextDecoration | String = null
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

