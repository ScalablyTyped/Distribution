package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Legend extends js.Object {
  /** Horizontal alignment of the legend.
               * @Default {Center. See Alignment}
               */
  var alignment: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstAlignment | java.lang.String
  ] = js.undefined
  /** Options for customizing the legend border.
               */
  var border: js.UndefOr[LegendBorder] = js.undefined
  /** Interactive action of legend items.
               * @Default {toggleSegmentVisibility. See Alignment}
               */
  var clickAction: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstClickAction | java.lang.String
  ] = js.undefined
  /** Number of columns to arrange the legend items.
               * @Default {null}
               */
  var columnCount: js.UndefOr[scala.Double] = js.undefined
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
  /** Options to customize the location of sunburst legend. Legend is placed in provided location only when value of position property is custom
               */
  var location: js.UndefOr[LegendLocation] = js.undefined
  /** Places the legend at specified position. Legend can be placed at **left**, **right**, **top** or **bottom** of the chart area. To manually specify the location of legend, set
               * **custom** as value to this property.
               * @Default {Bottom. See Position}
               */
  var position: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLegendPosition | java.lang.String
  ] = js.undefined
  /** Number of rows to arrange the legend items.
               * @Default {null}
               */
  var rowCount: js.UndefOr[scala.Double] = js.undefined
  /** Shape of the legend items.
               * @Default {None. See Shape}
               */
  var shape: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLegendShape | java.lang.String
  ] = js.undefined
  /** Options to customize the size of the legend.
               */
  var size: js.UndefOr[LegendSize] = js.undefined
  /** Options to customize the legend title.
               */
  var title: js.UndefOr[LegendTitle] = js.undefined
  /** Visibility of the legend.
               * @Default {false}
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

