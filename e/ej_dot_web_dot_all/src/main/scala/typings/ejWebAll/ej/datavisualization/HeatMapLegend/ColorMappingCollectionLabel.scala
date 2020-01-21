package typings.ejWebAll.ej.datavisualization.HeatMapLegend

import typings.ejWebAll.ej.datavisualization.HeatMap.TextDecoration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorMappingCollectionLabel extends js.Object {
  /** Enables/disables the bold style of the heatmap legend label.
    * @Default {false}
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  /** Specifies the font color of the heatmap legend label.
    * @Default {black}
    */
  var fontColor: js.UndefOr[String] = js.undefined
  /** Specifies the font family of the heatmap legend label.
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Specifies the font size of the heatmap legend label.
    * @Default {10}
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /** Enables/disables the italic style of the heatmap legend label.
    * @Default {false}
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  /** specifies the text value of the heatmap legend label.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the text style of the heatmap legend label.
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
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorMappingCollectionLabel]
  }
}

