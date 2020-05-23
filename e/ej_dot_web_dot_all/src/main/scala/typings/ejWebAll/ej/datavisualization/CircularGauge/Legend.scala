package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Legend extends js.Object {
  /** Specifies the alignment of the legend.
    * @Default {Center. See Alignment}
    */
  var alignment: js.UndefOr[LegendAlignment | String] = js.undefined
  /** Options for customizing the legend border.
    */
  var border: js.UndefOr[LegendBorder] = js.undefined
  /** Fill color for the legend items. By using this property, it displays all legend item shapes in same color.Legend items representing invisible ranges is displayed in gray color.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Options to customize the font used for legend item text.
    */
  var font: js.UndefOr[LegendFont] = js.undefined
  /** Gap or padding between the legend items.
    * @Default {20}
    */
  var itemPadding: js.UndefOr[Double] = js.undefined
  /** Options to customize the style of legend items.
    */
  var itemStyle: js.UndefOr[LegendItemStyle] = js.undefined
  /** Opacity of the legend.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Places the legend at specified position. Legend can be placed at **left**, **right**, **top** or **bottom** of the circular gauge.
    * @Default {Bottom. See Position}
    */
  var position: js.UndefOr[LegendPosition | String] = js.undefined
  /** Shape of the legend items.
    * @Default {Circle. See Shape}
    */
  var shape: js.UndefOr[LegendShape | String] = js.undefined
  /** Options to customize the size of the legend.
    */
  var size: js.UndefOr[LegendSize] = js.undefined
  /** Toggles the visibility of the ranges.
    * @Default {true}
    */
  var toggleVisibility: js.UndefOr[Boolean] = js.undefined
  /** Toggles the visibility of the legend.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Legend {
  @scala.inline
  def apply(
    alignment: LegendAlignment | String = null,
    border: LegendBorder = null,
    fill: String = null,
    font: LegendFont = null,
    itemPadding: js.UndefOr[Double] = js.undefined,
    itemStyle: LegendItemStyle = null,
    opacity: js.UndefOr[Double] = js.undefined,
    position: LegendPosition | String = null,
    shape: LegendShape | String = null,
    size: LegendSize = null,
    toggleVisibility: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Legend = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(itemPadding)) __obj.updateDynamic("itemPadding")(itemPadding.get.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleVisibility)) __obj.updateDynamic("toggleVisibility")(toggleVisibility.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
}

