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

