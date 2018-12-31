package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires, on clicking the sunburst chart.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** Animation type of sunburst
    * @Default {rotation. See Alignment}
    */
  var animationType: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.Animation | java.lang.String
  ] = js.undefined
  /** Background color of the plot area.
    * @Default {null}
    */
  var background: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the sunburst border.
    */
  var border: js.UndefOr[Border] = js.undefined
  /** Fires before rendering the datalabel
    */
  var dataLabelRendering: js.UndefOr[js.Function1[/* e */ DataLabelRenderingEventArgs, scala.Unit]] = js.undefined
  /** Options to customize the Sunburst dataLabel.
    */
  var dataLabelSettings: js.UndefOr[DataLabelSettings] = js.undefined
  /** Specifies the dataSource to the sunburst.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Fires, on double clicking the sunburst chart.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, scala.Unit]] = js.undefined
  /** Fires when resetting drilldown points.
    */
  var drillDownBack: js.UndefOr[js.Function1[/* e */ DrillDownBackEventArgs, scala.Unit]] = js.undefined
  /** Fires when clicking the point to perform drilldown.
    */
  var drillDownClick: js.UndefOr[js.Function1[/* e */ DrillDownClickEventArgs, scala.Unit]] = js.undefined
  /** Fires after resetting the sunburst points
    */
  var drillDownReset: js.UndefOr[js.Function1[/* e */ DrillDownResetEventArgs, scala.Unit]] = js.undefined
  /** Enable/disable the animation for all the levels.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Sunburst rendering will end at the specified value
    * @Default {null}
    */
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing the appearance of the levels or point while highlighting.
    */
  var highlightSettings: js.UndefOr[HighlightSettings] = js.undefined
  /** Sunburst inner radius value
    * @Default {0.4}
    */
  var innerRadius: js.UndefOr[scala.Double] = js.undefined
  /** Controls whether sunburst has to be responsive or not.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Options to customize the legend items and legend title.
    */
  var legend: js.UndefOr[Legend] = js.undefined
  /** Specify levels of sunburst for grouped visualization of data
    * @Default {[]}
    */
  var levels: js.UndefOr[js.Array[Level]] = js.undefined
  /** Fires before loading.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Fires after rendering sunburst.
    */
  var loaded: js.UndefOr[js.Function1[/* e */ LoadedEventArgs, scala.Unit]] = js.undefined
  /** Options to customize the left, right, top and bottom margins of sunburst area.
    */
  var margin: js.UndefOr[Margin] = js.undefined
  /** Opacity of the levels.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Palette color for the data points.
    * @Default {null}
    */
  var palette: js.UndefOr[java.lang.String] = js.undefined
  /** Parent node of the data points.
    * @Default {null}
    */
  var parentNode: js.UndefOr[java.lang.String] = js.undefined
  /** Fires after clicking the point in sunburst
    */
  var pointRegionClick: js.UndefOr[js.Function1[/* e */ PointRegionClickEventArgs, scala.Unit]] = js.undefined
  /** Fires while moving the mouse over sunburst points
    */
  var pointRegionMouseMove: js.UndefOr[js.Function1[/* e */ PointRegionMouseMoveEventArgs, scala.Unit]] = js.undefined
  /** Options for customizing sunburst points.
    */
  var points: js.UndefOr[Points] = js.undefined
  /** Fires before rendering sunburst.
    */
  var preRender: js.UndefOr[js.Function1[/* e */ PreRenderEventArgs, scala.Unit]] = js.undefined
  /** Sunburst outer radius value
    * @Default {1}
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /** Fires, on right clicking the sunburst chart
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, scala.Unit]] = js.undefined
  /** Options for customizing the sunburst segment border.
    */
  var segmentBorder: js.UndefOr[SegmentBorder] = js.undefined
  /** Fires before rendering each segment
    */
  var segmentRendering: js.UndefOr[js.Function1[/* e */ SegmentRenderingEventArgs, scala.Unit]] = js.undefined
  /** Options for customizing the appearance of the levels or data point while selection.
    */
  var selectionSettings: js.UndefOr[SelectionSettings] = js.undefined
  /** Options to customize the Sunburst size.
    */
  var size: js.UndefOr[Size] = js.undefined
  /** Sunburst rendering will start from the specified value
    * @Default {null}
    */
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the theme for Sunburst.
    * @Default {Flatlight. See Theme}
    */
  var theme: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstTheme | java.lang.String
  ] = js.undefined
  /** Options for customizing the title and subtitle of sunburst.
    */
  var title: js.UndefOr[Title] = js.undefined
  /** Fires before rendering sunburst title.
    */
  var titleRendering: js.UndefOr[js.Function1[/* e */ TitleRenderingEventArgs, scala.Unit]] = js.undefined
  /** Options to customize the Sunburst tooltip.
    */
  var tooltip: js.UndefOr[Tooltip] = js.undefined
  /** Fires during initialization of tooltip.
    */
  var tooltipInitialize: js.UndefOr[js.Function1[/* e */ TooltipInitializeEventArgs, scala.Unit]] = js.undefined
  /** Bind the data field from the data source.
    * @Default {null}
    */
  var valueMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /** Controls the visibility of sunburst.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Name of the property in the datasource that contains x values.
    * @Default {null}
    */
  var xName: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the property in the datasource that contains y values.
    * @Default {null}
    */
  var yName: js.UndefOr[java.lang.String] = js.undefined
  /** Options for enable zooming feature of chart.
    */
  var zoomSettings: js.UndefOr[ZoomSettings] = js.undefined
}

