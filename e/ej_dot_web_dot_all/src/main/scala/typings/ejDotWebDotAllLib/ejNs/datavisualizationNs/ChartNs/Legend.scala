package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Legend extends js.Object {
  /** Horizontal alignment of the legend.
    * @Default {Center. See Alignment}
    */
  var alignment: js.UndefOr[Alignment | java.lang.String] = js.undefined
  /** Background for the legend. Use this property to add a background image or background color for the legend.
    */
  var background: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the legend border.
    */
  var border: js.UndefOr[LegendBorder] = js.undefined
  /** Number of columns to arrange the legend items.
    * @Default {null}
    */
  var columnCount: js.UndefOr[scala.Double] = js.undefined
  /** Controls whether legend has to use scrollbar or not. When enabled, scroll bar appears depending upon size and position properties of legend.
    * @Default {true}
    */
  var enableScrollbar: js.UndefOr[scala.Boolean] = js.undefined
  /** Fill color for the legend items. By using this property, it displays all legend item shapes in same color.Legend items representing invisible series is displayed in gray color.
    * @Default {null}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Options to customize the font used for legend item text.
    */
  var font: js.UndefOr[LegendFont] = js.undefined
  /** Gap or padding between the legend items.
    * @Default {10}
    */
  var itemPadding: js.UndefOr[scala.Double] = js.undefined
  /** Options to customize the style of legend items.
    */
  var itemStyle: js.UndefOr[LegendItemStyle] = js.undefined
  /** Options to customize the location of chart legend. Legend is placed in provided location only when value of position property is custom
    */
  var location: js.UndefOr[LegendLocation] = js.undefined
  /** Opacity of the legend.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Places the legend at specified position. Legend can be placed at **left**, **right**, **top** or **bottom** of the chart area. To manually specify the location of legend, set
    * **custom** as value to this property.
    * @Default {Bottom. See Position}
    */
  var position: js.UndefOr[Position | java.lang.String] = js.undefined
  /** Number of rows to arrange the legend items.
    * @Default {null}
    */
  var rowCount: js.UndefOr[scala.Double] = js.undefined
  /** Shape of the legend items. Default shape for pie and doughnut series is circle and all other series uses rectangle.
    * @Default {None. See Shape}
    */
  var shape: js.UndefOr[Shape | java.lang.String] = js.undefined
  /** Options to customize the size of the legend.
    */
  var size: js.UndefOr[LegendSize] = js.undefined
  /** Specifies the action taken when the legend width is more than the textWidth.
    * @Default {none. See textOverflow}
    */
  var textOverflow: js.UndefOr[TextOverflow | java.lang.String] = js.undefined
  /** Text width for legend item.
    * @Default {34}
    */
  var textWidth: js.UndefOr[scala.Double] = js.undefined
  /** Options to customize the legend title.
    */
  var title: js.UndefOr[LegendTitle] = js.undefined
  /** Controls the selection through the legend.
    * @Default {true}
    */
  var toggleSeriesVisibility: js.UndefOr[scala.Boolean] = js.undefined
  /** Controls the visibility of the legend.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object Legend {
  @scala.inline
  def apply(
    alignment: Alignment | java.lang.String = null,
    background: java.lang.String = null,
    border: LegendBorder = null,
    columnCount: scala.Int | scala.Double = null,
    enableScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    fill: java.lang.String = null,
    font: LegendFont = null,
    itemPadding: scala.Int | scala.Double = null,
    itemStyle: LegendItemStyle = null,
    location: LegendLocation = null,
    opacity: scala.Int | scala.Double = null,
    position: Position | java.lang.String = null,
    rowCount: scala.Int | scala.Double = null,
    shape: Shape | java.lang.String = null,
    size: LegendSize = null,
    textOverflow: TextOverflow | java.lang.String = null,
    textWidth: scala.Int | scala.Double = null,
    title: LegendTitle = null,
    toggleSeriesVisibility: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): Legend = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (!js.isUndefined(enableScrollbar)) __obj.updateDynamic("enableScrollbar")(enableScrollbar)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (itemPadding != null) __obj.updateDynamic("itemPadding")(itemPadding.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (location != null) __obj.updateDynamic("location")(location)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (textWidth != null) __obj.updateDynamic("textWidth")(textWidth.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(toggleSeriesVisibility)) __obj.updateDynamic("toggleSeriesVisibility")(toggleSeriesVisibility)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Legend]
  }
}

