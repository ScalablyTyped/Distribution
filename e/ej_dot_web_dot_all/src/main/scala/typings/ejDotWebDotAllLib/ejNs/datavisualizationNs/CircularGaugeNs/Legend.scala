package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Legend extends js.Object {
  /** Specifies the alignment of the legend.
    * @Default {Center. See Alignment}
    */
  var alignment: js.UndefOr[LegendAlignment | java.lang.String] = js.undefined
  /** Options for customizing the legend border.
    */
  var border: js.UndefOr[LegendBorder] = js.undefined
  /** Fill color for the legend items. By using this property, it displays all legend item shapes in same color.Legend items representing invisible ranges is displayed in gray color.
    * @Default {null}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Options to customize the font used for legend item text.
    */
  var font: js.UndefOr[LegendFont] = js.undefined
  /** Gap or padding between the legend items.
    * @Default {20}
    */
  var itemPadding: js.UndefOr[scala.Double] = js.undefined
  /** Options to customize the style of legend items.
    */
  var itemStyle: js.UndefOr[LegendItemStyle] = js.undefined
  /** Opacity of the legend.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Places the legend at specified position. Legend can be placed at **left**, **right**, **top** or **bottom** of the circular gauge.
    * @Default {Bottom. See Position}
    */
  var position: js.UndefOr[LegendPosition | java.lang.String] = js.undefined
  /** Shape of the legend items.
    * @Default {Circle. See Shape}
    */
  var shape: js.UndefOr[LegendShape | java.lang.String] = js.undefined
  /** Options to customize the size of the legend.
    */
  var size: js.UndefOr[LegendSize] = js.undefined
  /** Toggles the visibility of the ranges.
    * @Default {true}
    */
  var toggleVisibility: js.UndefOr[scala.Boolean] = js.undefined
  /** Toggles the visibility of the legend.
    * @Default {false}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

