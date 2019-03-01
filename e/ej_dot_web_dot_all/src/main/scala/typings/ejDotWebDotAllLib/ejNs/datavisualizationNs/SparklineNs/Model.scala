package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SparklineNs

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
  var theme: js.UndefOr[Theme | java.lang.String] = js.undefined
  /** Options to customize the tooltip.
    */
  var tooltip: js.UndefOr[Tooltip] = js.undefined
  /** Fires before rendering trackball tooltip. You can use this event to customize the text displayed in trackball tooltip.
    */
  var tooltipInitialize: js.UndefOr[js.Function1[/* e */ TooltipInitializeEventArgs, scala.Unit]] = js.undefined
  /** Specifies the type of the series to render in sparkline.
    * @Default {line. See Type}
    */
  var `type`: js.UndefOr[Type | java.lang.String] = js.undefined
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

object Model {
  @scala.inline
  def apply(
    Click: js.Function1[/* e */ ClickEventArgs, scala.Unit] = null,
    axisLineSettings: AxisLineSettings = null,
    background: java.lang.String = null,
    border: Border = null,
    dataSource: js.Any = null,
    doubleClick: js.Function1[/* e */ DoubleClickEventArgs, scala.Unit] = null,
    enableCanvasRendering: js.UndefOr[scala.Boolean] = js.undefined,
    enableGroupSeparator: js.UndefOr[scala.Boolean] = js.undefined,
    endPointColor: java.lang.String = null,
    fill: java.lang.String = null,
    highPointColor: java.lang.String = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    load: js.Function1[/* e */ LoadEventArgs, scala.Unit] = null,
    loaded: js.Function1[/* e */ LoadedEventArgs, scala.Unit] = null,
    locale: java.lang.String = null,
    lowPointColor: java.lang.String = null,
    markerSettings: MarkerSettings = null,
    negativePointColor: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    padding: scala.Int | scala.Double = null,
    palette: java.lang.String = null,
    pointRegionMouseClick: js.Function1[/* e */ PointRegionMouseClickEventArgs, scala.Unit] = null,
    pointRegionMouseMove: js.Function1[/* e */ PointRegionMouseMoveEventArgs, scala.Unit] = null,
    rangeBandSettings: RangeBandSettings = null,
    rightClick: js.Function1[/* e */ RightClickEventArgs, scala.Unit] = null,
    seriesRendering: js.Function1[/* e */ SeriesRenderingEventArgs, scala.Unit] = null,
    size: Size = null,
    sparklineMouseLeave: js.Function1[/* e */ SparklineMouseLeaveEventArgs, scala.Unit] = null,
    sparklineMouseMove: js.Function1[/* e */ SparklineMouseMoveEventArgs, scala.Unit] = null,
    startPointColor: java.lang.String = null,
    stroke: java.lang.String = null,
    theme: Theme | java.lang.String = null,
    tooltip: Tooltip = null,
    tooltipInitialize: js.Function1[/* e */ TooltipInitializeEventArgs, scala.Unit] = null,
    `type`: Type | java.lang.String = null,
    width: scala.Int | scala.Double = null,
    xName: java.lang.String = null,
    yName: java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Click != null) __obj.updateDynamic("Click")(Click)
    if (axisLineSettings != null) __obj.updateDynamic("axisLineSettings")(axisLineSettings)
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(doubleClick)
    if (!js.isUndefined(enableCanvasRendering)) __obj.updateDynamic("enableCanvasRendering")(enableCanvasRendering)
    if (!js.isUndefined(enableGroupSeparator)) __obj.updateDynamic("enableGroupSeparator")(enableGroupSeparator)
    if (endPointColor != null) __obj.updateDynamic("endPointColor")(endPointColor)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (highPointColor != null) __obj.updateDynamic("highPointColor")(highPointColor)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (load != null) __obj.updateDynamic("load")(load)
    if (loaded != null) __obj.updateDynamic("loaded")(loaded)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (lowPointColor != null) __obj.updateDynamic("lowPointColor")(lowPointColor)
    if (markerSettings != null) __obj.updateDynamic("markerSettings")(markerSettings)
    if (negativePointColor != null) __obj.updateDynamic("negativePointColor")(negativePointColor)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette)
    if (pointRegionMouseClick != null) __obj.updateDynamic("pointRegionMouseClick")(pointRegionMouseClick)
    if (pointRegionMouseMove != null) __obj.updateDynamic("pointRegionMouseMove")(pointRegionMouseMove)
    if (rangeBandSettings != null) __obj.updateDynamic("rangeBandSettings")(rangeBandSettings)
    if (rightClick != null) __obj.updateDynamic("rightClick")(rightClick)
    if (seriesRendering != null) __obj.updateDynamic("seriesRendering")(seriesRendering)
    if (size != null) __obj.updateDynamic("size")(size)
    if (sparklineMouseLeave != null) __obj.updateDynamic("sparklineMouseLeave")(sparklineMouseLeave)
    if (sparklineMouseMove != null) __obj.updateDynamic("sparklineMouseMove")(sparklineMouseMove)
    if (startPointColor != null) __obj.updateDynamic("startPointColor")(startPointColor)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipInitialize != null) __obj.updateDynamic("tooltipInitialize")(tooltipInitialize)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xName != null) __obj.updateDynamic("xName")(xName)
    if (yName != null) __obj.updateDynamic("yName")(yName)
    __obj.asInstanceOf[Model]
  }
}

