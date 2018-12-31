package typings
package ejDotWebDotAllLib.ejNs.SparklineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires, on clicking the sparkline.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** Options for customizing the color,dashArray and width of the axisLine.
    */
  var axisLineSettings: js.UndefOr[AxisLineSettings] = js.undefined
  /** Background color of the plot area.
    * @Default {transparent}
    */
  var background: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the color, opacity and width of the sparkline border.
    */
  var border: js.UndefOr[Border] = js.undefined
  /** Specifies the dataSource for the series. It can be an array of JSON objects or an instance of ej.DataManager.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Fires, on double clicking the sparkline.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, scala.Unit]] = js.undefined
  /** Controls whether Sparkline has to be rendered as Canvas or SVG.Canvas rendering supports all functionalities in SVG rendering.
    * @Default {false}
    */
  var enableCanvasRendering: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify to convert the date object to string, using locale settings.
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[scala.Boolean] = js.undefined
  /** Color for series end point.
    * @Default {null}
    */
  var endPointColor: js.UndefOr[java.lang.String] = js.undefined
  /** Fill color for the sparkline series.
    * @Default {#33ccff}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Color for series high point.
    * @Default {null}
    */
  var highPointColor: js.UndefOr[java.lang.String] = js.undefined
  /** Controls whether sparkline has to be responsive or not.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires before loading the sparkline.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Fires after loaded the sparkline.
    */
  var loaded: js.UndefOr[js.Function1[/* e */ LoadedEventArgs, scala.Unit]] = js.undefined
  /** Name of the culture based on which sparkline should be localized.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Color for series low point.
    * @Default {null}
    */
  var lowPointColor: js.UndefOr[java.lang.String] = js.undefined
  /** Options for displaying and customizing marker for a data point.
    */
  var markerSettings: js.UndefOr[MarkerSettings] = js.undefined
  /** Color for series negative point.
    * @Default {null}
    */
  var negativePointColor: js.UndefOr[java.lang.String] = js.undefined
  /** Opacity of the series.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Gap or padding for sparkline.
    * @Default {8}
    */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /** Name of a field in data source, where the fill color for all the data points is generated.
    */
  var palette: js.UndefOr[java.lang.String] = js.undefined
  /** Fires on clicking a point in sparkline. You can use this event to handle clicks made on points.
    */
  var pointRegionMouseClick: js.UndefOr[js.Function1[/* e */ PointRegionMouseClickEventArgs, scala.Unit]] = js.undefined
  /** Fires when mouse is moved over a point.
    */
  var pointRegionMouseMove: js.UndefOr[js.Function1[/* e */ PointRegionMouseMoveEventArgs, scala.Unit]] = js.undefined
  /** Options for customizing the color, opacity of the sparkline start and end range.
    */
  var rangeBandSettings: js.UndefOr[RangeBandSettings] = js.undefined
  /** Fires, on right clicking the sparkline.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, scala.Unit]] = js.undefined
  /** Fires before rendering a series. This event is fired for each series in Sparkline.
    */
  var seriesRendering: js.UndefOr[js.Function1[/* e */ SeriesRenderingEventArgs, scala.Unit]] = js.undefined
  /** Options to customize the Sparkline size.
    */
  var size: js.UndefOr[Size] = js.undefined
  /** Fires on moving mouse outside the sparkline.
    */
  var sparklineMouseLeave: js.UndefOr[js.Function1[/* e */ SparklineMouseLeaveEventArgs, scala.Unit]] = js.undefined
  /** Fires on moving mouse over the sparkline.
    */
  var sparklineMouseMove: js.UndefOr[js.Function1[/* e */ SparklineMouseMoveEventArgs, scala.Unit]] = js.undefined
  /** Color for series start point.
    * @Default {null}
    */
  var startPointColor: js.UndefOr[java.lang.String] = js.undefined
  /** Border color of the series.
    * @Default {null}
    */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the theme for Sparkline.
    * @Default {Flatlight. See Theme}
    */
  var theme: js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.SparklineNs.Theme | java.lang.String] = js.undefined
  /** Options to customize the tooltip.
    */
  var tooltip: js.UndefOr[Tooltip] = js.undefined
  /** Fires before rendering trackball tooltip. You can use this event to customize the text displayed in trackball tooltip.
    */
  var tooltipInitialize: js.UndefOr[js.Function1[/* e */ TooltipInitializeEventArgs, scala.Unit]] = js.undefined
  /** Specifies the type of the series to render in sparkline.
    * @Default {line. See Type}
    */
  var `type`: js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.SparklineNs.Type | java.lang.String] = js.undefined
  /** Border width of the series.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** Name of the property in the datasource that contains x value for the series.
    * @Default {null}
    */
  var xName: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the property in the datasource that contains y value for the series.
    * @Default {null}
    */
  var yName: js.UndefOr[java.lang.String] = js.undefined
}

