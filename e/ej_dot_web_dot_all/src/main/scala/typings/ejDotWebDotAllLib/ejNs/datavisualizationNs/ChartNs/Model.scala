package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires, after the chart is resized.
    */
  var afterResize: js.UndefOr[js.Function1[/* e */ AfterResizeEventArgs, scala.Unit]] = js.undefined
  /** Fires after the series animation is completed. This event will be triggered for each series when animation is enabled.
    */
  var animationComplete: js.UndefOr[js.Function1[/* e */ AnimationCompleteEventArgs, scala.Unit]] = js.undefined
  /** Fires on clicking the annotation.
    */
  var annotationClick: js.UndefOr[js.Function1[/* e */ AnnotationClickEventArgs, scala.Unit]] = js.undefined
  /** Options for adding and customizing annotations in Chart.
    */
  var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
  /** To override x axis for particular series, create an axis object by providing unique name by using name property and add it to axes array. Then, assign the name to the seriesâ€™s
    * xAxisName property to link both axis and series.
    */
  var axes: js.UndefOr[js.Array[Axis]] = js.undefined
  /** Fires before rendering the labels. This event is fired for each label in axis. You can use this event to add custom text to axis labels.
    */
  var axesLabelRendering: js.UndefOr[js.Function1[/* e */ AxesLabelRenderingEventArgs, scala.Unit]] = js.undefined
  /** Fires during the initialization of axis labels.
    */
  var axesLabelsInitialize: js.UndefOr[js.Function1[/* e */ AxesLabelsInitializeEventArgs, scala.Unit]] = js.undefined
  /** Fires during axes range calculation. This event is fired for each axis present in Chart. You can use this event to customize axis range as required.
    */
  var axesRangeCalculate: js.UndefOr[js.Function1[/* e */ AxesRangeCalculateEventArgs, scala.Unit]] = js.undefined
  /** Fires before rendering the axis title. This event is triggered for each axis with title. You can use this event to add custom text to axis title.
    */
  var axesTitleRendering: js.UndefOr[js.Function1[/* e */ AxesTitleRenderingEventArgs, scala.Unit]] = js.undefined
  /** Fires, on clicking the axis label.
    */
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ AxisLabelClickEventArgs, scala.Unit]] = js.undefined
  /** Fires on moving mouse over the axis label.
    */
  var axisLabelMouseMove: js.UndefOr[js.Function1[/* e */ AxisLabelMouseMoveEventArgs, scala.Unit]] = js.undefined
  /** URL of the image to be used as chart background.
    * @Default {null}
    */
  var backGroundImageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the background color of the  chart.
    * @Default {transparent}
    */
  var background: js.UndefOr[java.lang.String] = js.undefined
  /** Fires, when chart size is changing.
    */
  var beforeResize: js.UndefOr[js.Function1[/* e */ BeforeResizeEventArgs, scala.Unit]] = js.undefined
  /** Options for customizing the color, opacity and width of the chart border.
    */
  var border: js.UndefOr[Border] = js.undefined
  /** Options for configuring the border and background of the plot area.
    */
  var chartArea: js.UndefOr[ChartArea] = js.undefined
  /** Fires during the calculation of chart area bounds. You can use this event to customize the bounds of chart area.
    */
  var chartAreaBoundsCalculate: js.UndefOr[js.Function1[/* e */ ChartAreaBoundsCalculateEventArgs, scala.Unit]] = js.undefined
  /** Fires, on the clicking the chart.
    */
  var chartClick: js.UndefOr[js.Function1[/* e */ ChartClickEventArgs, scala.Unit]] = js.undefined
  /** Fires, on double clicking the chart.
    */
  var chartDoubleClick: js.UndefOr[js.Function1[/* e */ ChartDoubleClickEventArgs, scala.Unit]] = js.undefined
  /** Fires when the mouse pointer leaves the chart
    */
  var chartMouseLeave: js.UndefOr[js.Function1[/* e */ ChartMouseLeaveEventArgs, scala.Unit]] = js.undefined
  /** Fires on moving mouse over the chart.
    */
  var chartMouseMove: js.UndefOr[js.Function1[/* e */ ChartMouseMoveEventArgs, scala.Unit]] = js.undefined
  /** Options to split Chart into multiple plotting areas vertically. Each object in the collection represents a plotting area in Chart.
    */
  var columnDefinitions: js.UndefOr[js.Array[ColumnDefinition]] = js.undefined
  /** Options for configuring the properties of all the series. You can also override the options for specific series by using series collection.
    */
  var commonSeriesOptions: js.UndefOr[CommonSeriesOptions] = js.undefined
  /** Fires after chart is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Options for displaying and customizing the crosshair.
    */
  var crosshair: js.UndefOr[Crosshair] = js.undefined
  /** Depth of the 3D Chart from front view of series to background wall. This property is applicable only for 3D view.
    * @Default {100}
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /** Fires when chart is destroyed completely.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Fires before rendering the data labels. This event is triggered for each data label in the series. You can use this event to add custom text in data labels.
    */
  var displayTextRendering: js.UndefOr[js.Function1[/* e */ DisplayTextRenderingEventArgs, scala.Unit]] = js.undefined
  /** Fires when the dragging is completed
    */
  var dragEnd: js.UndefOr[js.Function1[/* e */ DragEndEventArgs, scala.Unit]] = js.undefined
  /** Fires when the dragging is started
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, scala.Unit]] = js.undefined
  /** Fires while  dragging
    */
  var dragging: js.UndefOr[js.Function1[/* e */ DraggingEventArgs, scala.Unit]] = js.undefined
  /** Controls whether 3D view has to be enabled or not. 3D view is supported only for column, bar. Stacking column, stacking bar, pie and doughnut series types.
    * @Default {false}
    */
  var enable3D: js.UndefOr[scala.Boolean] = js.undefined
  /** Controls whether Chart has to be rendered as Canvas or SVG. Canvas rendering supports all functionalities in SVG rendering except 3D Charts.
    * @Default {false}
    */
  var enableCanvasRendering: js.UndefOr[scala.Boolean] = js.undefined
  /** Controls whether 3D view has to be rotated on dragging. This property is applicable only for 3D view.
    * @Default {false}
    */
  var enableRotation: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires, when error bar is rendering.
    */
  var errorBarRendering: js.UndefOr[js.Function1[/* e */ ErrorBarRenderingEventArgs, scala.Unit]] = js.undefined
  /** This provides options for customizing export settings
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.undefined
  /** Options to customize the technical indicators.
    */
  var indicators: js.UndefOr[js.Array[Indicator]] = js.undefined
  /** Controls whether the series has to be rendered at initial loading of chart, this will be useful in scenarios where chart is placed at the bottom of the web page and we need to
    * render the series only when the chart is visible while scrolling to the top.
    * @Default {true}
    */
  var initSeriesRender: js.UndefOr[scala.Boolean] = js.undefined
  /** Controls whether Chart has to be responsive while resizing.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Options to customize the legend items and legend title.
    */
  var legend: js.UndefOr[Legend] = js.undefined
  /** Fires during the calculation of legend bounds. You can use this event to customize the bounds of legend.
    */
  var legendBoundsCalculate: js.UndefOr[js.Function1[/* e */ LegendBoundsCalculateEventArgs, scala.Unit]] = js.undefined
  /** Fires on clicking the legend item.
    */
  var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, scala.Unit]] = js.undefined
  /** Fires when moving mouse over legend item. You can use this event for hit testing on legend items.
    */
  var legendItemMouseMove: js.UndefOr[js.Function1[/* e */ LegendItemMouseMoveEventArgs, scala.Unit]] = js.undefined
  /** Fires before rendering the legend item. This event is fired for each legend item in Chart. You can use this event to customize legend item shape or add custom text to legend item.
    */
  var legendItemRendering: js.UndefOr[js.Function1[/* e */ LegendItemRenderingEventArgs, scala.Unit]] = js.undefined
  /** Fires before loading the chart.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Name of the culture based on which chart should be localized. Number and date time values are localized with respect to the culture name.String type properties like title text are
    * not localized automatically. Provide localized text as value to string type properties.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Options to customize the left, right, top and bottom margins of chart area.
    */
  var margin: js.UndefOr[Margin] = js.undefined
  /** Fires, on the clicking the Multi level labels of the chart .
    */
  var multiLevelLabelClick: js.UndefOr[js.Function1[/* e */ MultiLevelLabelClickEventArgs, scala.Unit]] = js.undefined
  /** Fires, when multi level labels are rendering.
    */
  var multiLevelLabelRendering: js.UndefOr[js.Function1[/* e */ MultiLevelLabelRenderingEventArgs, scala.Unit]] = js.undefined
  /** Palette is used to store the series fill color in array and apply the color to series collection in the order of series index.
    * @Default {null}
    */
  var palette: js.UndefOr[js.Array[_]] = js.undefined
  /** Perspective angle of the 3D view. Chart appears closer when perspective angle is decreased, and distant when perspective angle is increased.This property is applicable only when
    * 3D view is enabled
    * @Default {90}
    */
  var perspectiveAngle: js.UndefOr[scala.Double] = js.undefined
  /** Fires on clicking a point in chart. You can use this event to handle clicks made on points.
    */
  var pointRegionClick: js.UndefOr[js.Function1[/* e */ PointRegionClickEventArgs, scala.Unit]] = js.undefined
  /** Fires when mouse is moved over a point.
    */
  var pointRegionMouseMove: js.UndefOr[js.Function1[/* e */ PointRegionMouseMoveEventArgs, scala.Unit]] = js.undefined
  /** Fires before rendering chart.
    */
  var preRender: js.UndefOr[js.Function1[/* e */ PreRenderEventArgs, scala.Unit]] = js.undefined
  /** This is a horizontal axis that contains options to configure axis and it is the primary x axis for all the series in series array. To override x axis for particular series, create
    * an axis object by providing unique name by using name property and add it to axes array. Then, assign the name to the seriesâ€™s xAxisName property to link both axis and series.
    */
  var primaryXAxis: js.UndefOr[PrimaryXAxis] = js.undefined
  /** This is a vertical axis that contains options to configure axis. This is the primary y axis for all the series in series array. To override y axis for particular series, create an
    * axis object by providing unique name by using name property and add it to axes array. Then, assign the name to the seriesâ€™s yAxisName property to link both axis and series.
    */
  var primaryYAxis: js.UndefOr[PrimaryYAxis] = js.undefined
  /** Fires after selected the data in chart.
    */
  var rangeSelected: js.UndefOr[js.Function1[/* e */ RangeSelectedEventArgs, scala.Unit]] = js.undefined
  /** Rotation angle of the 3D view. This property is applicable only when 3D view is enabled.
    * @Default {0}
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /** Options to split Chart into multiple plotting areas horizontally. Each object in the collection represents a plotting area in Chart.
    */
  var rowDefinitions: js.UndefOr[js.Array[RowDefinition]] = js.undefined
  /** Trigger, after the scrollbar position is changed.
    */
  var scrollChanged: js.UndefOr[js.Function1[/* e */ ScrollChangedEventArgs, scala.Unit]] = js.undefined
  /** Event triggered when scroll end
    */
  var scrollEnd: js.UndefOr[js.Function1[/* e */ ScrollEndEventArgs, scala.Unit]] = js.undefined
  /** Event triggered when scroll starts
    */
  var scrollStart: js.UndefOr[js.Function1[/* e */ ScrollStartEventArgs, scala.Unit]] = js.undefined
  /** Options for displaying the chart along with selected points while loading
    * @Default {[ ]}
    */
  var selectedDataPointIndexes: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the properties used for customizing the series.
    */
  var series: js.UndefOr[js.Array[Series]] = js.undefined
  /** Fires after selecting a series. This event is triggered after selecting a series only if selection mode is series.
    */
  var seriesRegionClick: js.UndefOr[js.Function1[/* e */ SeriesRegionClickEventArgs, scala.Unit]] = js.undefined
  /** Fires before rendering a series. This event is fired for each series in Chart.
    */
  var seriesRendering: js.UndefOr[js.Function1[/* e */ SeriesRenderingEventArgs, scala.Unit]] = js.undefined
  /** Controls whether data points has to be displayed side by side or along the depth of the axis.
    * @Default {false}
    */
  var sideBySideSeriesPlacement: js.UndefOr[scala.Boolean] = js.undefined
  /** Options to customize the Chart size.
    */
  var size: js.UndefOr[Size] = js.undefined
  /** Fires when the sub Title of the chart is rendered
    */
  var subTitleRendering: js.UndefOr[js.Function1[/* e */ SubTitleRenderingEventArgs, scala.Unit]] = js.undefined
  /** Fires before rendering the marker symbols. This event is triggered for each marker in Chart.
    */
  var symbolRendering: js.UndefOr[js.Function1[/* e */ SymbolRenderingEventArgs, scala.Unit]] = js.undefined
  /** Specifies the theme for Chart.
    * @Default {Flatlight. See Theme}
    */
  var theme: js.UndefOr[Theme | java.lang.String] = js.undefined
  /** Slope angle of 3D Chart. This property is applicable only when 3D view is enabled.
    * @Default {0}
    */
  var tilt: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing the title and subtitle of Chart.
    */
  var title: js.UndefOr[Title] = js.undefined
  /** Fires before rendering the Chart title. You can use this event to add custom text in Chart title.
    */
  var titleRendering: js.UndefOr[js.Function1[/* e */ TitleRenderingEventArgs, scala.Unit]] = js.undefined
  /** Fires before rendering the tooltip. This event is fired when tooltip is enabled and mouse is hovered on a Chart point. You can use this event to customize tooltip before rendering.
    */
  var toolTipInitialize: js.UndefOr[js.Function1[/* e */ ToolTipInitializeEventArgs, scala.Unit]] = js.undefined
  /** Fires before rendering crosshair tooltip in axis. This event is fired for each axis with crosshair label enabled. You can use this event to customize crosshair label before
    * rendering
    */
  var trackAxisToolTip: js.UndefOr[js.Function1[/* e */ TrackAxisToolTipEventArgs, scala.Unit]] = js.undefined
  /** Fires before rendering trackball tooltip. This event is fired for each series in Chart because trackball tooltip is displayed for all the series. You can use this event to
    * customize the text displayed in trackball tooltip.
    */
  var trackToolTip: js.UndefOr[js.Function1[/* e */ TrackToolTipEventArgs, scala.Unit]] = js.undefined
  /** Fires, when trendlines are rendering.
    */
  var trendlineRendering: js.UndefOr[js.Function1[/* e */ TrendlineRenderingEventArgs, scala.Unit]] = js.undefined
  /** Width of the wall used in 3D Chart. Wall is present only in Cartesian type 3D series and not in 3D pie or Doughnut series. This property is applicable only when 3D view is enabled.
    * @Default {2}
    */
  var wallSize: js.UndefOr[scala.Double] = js.undefined
  /** Fires while performing rectangle zooming in chart.
    */
  var zoomed: js.UndefOr[js.Function1[/* e */ ZoomedEventArgs, scala.Unit]] = js.undefined
  /** Options for enabling zooming feature of chart.
    */
  var zooming: js.UndefOr[Zooming] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    afterResize: js.Function1[/* e */ AfterResizeEventArgs, scala.Unit] = null,
    animationComplete: js.Function1[/* e */ AnimationCompleteEventArgs, scala.Unit] = null,
    annotationClick: js.Function1[/* e */ AnnotationClickEventArgs, scala.Unit] = null,
    annotations: js.Array[Annotation] = null,
    axes: js.Array[Axis] = null,
    axesLabelRendering: js.Function1[/* e */ AxesLabelRenderingEventArgs, scala.Unit] = null,
    axesLabelsInitialize: js.Function1[/* e */ AxesLabelsInitializeEventArgs, scala.Unit] = null,
    axesRangeCalculate: js.Function1[/* e */ AxesRangeCalculateEventArgs, scala.Unit] = null,
    axesTitleRendering: js.Function1[/* e */ AxesTitleRenderingEventArgs, scala.Unit] = null,
    axisLabelClick: js.Function1[/* e */ AxisLabelClickEventArgs, scala.Unit] = null,
    axisLabelMouseMove: js.Function1[/* e */ AxisLabelMouseMoveEventArgs, scala.Unit] = null,
    backGroundImageUrl: java.lang.String = null,
    background: java.lang.String = null,
    beforeResize: js.Function1[/* e */ BeforeResizeEventArgs, scala.Unit] = null,
    border: Border = null,
    chartArea: ChartArea = null,
    chartAreaBoundsCalculate: js.Function1[/* e */ ChartAreaBoundsCalculateEventArgs, scala.Unit] = null,
    chartClick: js.Function1[/* e */ ChartClickEventArgs, scala.Unit] = null,
    chartDoubleClick: js.Function1[/* e */ ChartDoubleClickEventArgs, scala.Unit] = null,
    chartMouseLeave: js.Function1[/* e */ ChartMouseLeaveEventArgs, scala.Unit] = null,
    chartMouseMove: js.Function1[/* e */ ChartMouseMoveEventArgs, scala.Unit] = null,
    columnDefinitions: js.Array[ColumnDefinition] = null,
    commonSeriesOptions: CommonSeriesOptions = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    crosshair: Crosshair = null,
    depth: scala.Int | scala.Double = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    displayTextRendering: js.Function1[/* e */ DisplayTextRenderingEventArgs, scala.Unit] = null,
    dragEnd: js.Function1[/* e */ DragEndEventArgs, scala.Unit] = null,
    dragStart: js.Function1[/* e */ DragStartEventArgs, scala.Unit] = null,
    dragging: js.Function1[/* e */ DraggingEventArgs, scala.Unit] = null,
    enable3D: js.UndefOr[scala.Boolean] = js.undefined,
    enableCanvasRendering: js.UndefOr[scala.Boolean] = js.undefined,
    enableRotation: js.UndefOr[scala.Boolean] = js.undefined,
    errorBarRendering: js.Function1[/* e */ ErrorBarRenderingEventArgs, scala.Unit] = null,
    exportSettings: ExportSettings = null,
    indicators: js.Array[Indicator] = null,
    initSeriesRender: js.UndefOr[scala.Boolean] = js.undefined,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    legend: Legend = null,
    legendBoundsCalculate: js.Function1[/* e */ LegendBoundsCalculateEventArgs, scala.Unit] = null,
    legendItemClick: js.Function1[/* e */ LegendItemClickEventArgs, scala.Unit] = null,
    legendItemMouseMove: js.Function1[/* e */ LegendItemMouseMoveEventArgs, scala.Unit] = null,
    legendItemRendering: js.Function1[/* e */ LegendItemRenderingEventArgs, scala.Unit] = null,
    load: js.Function1[/* e */ LoadEventArgs, scala.Unit] = null,
    locale: java.lang.String = null,
    margin: Margin = null,
    multiLevelLabelClick: js.Function1[/* e */ MultiLevelLabelClickEventArgs, scala.Unit] = null,
    multiLevelLabelRendering: js.Function1[/* e */ MultiLevelLabelRenderingEventArgs, scala.Unit] = null,
    palette: js.Array[_] = null,
    perspectiveAngle: scala.Int | scala.Double = null,
    pointRegionClick: js.Function1[/* e */ PointRegionClickEventArgs, scala.Unit] = null,
    pointRegionMouseMove: js.Function1[/* e */ PointRegionMouseMoveEventArgs, scala.Unit] = null,
    preRender: js.Function1[/* e */ PreRenderEventArgs, scala.Unit] = null,
    primaryXAxis: PrimaryXAxis = null,
    primaryYAxis: PrimaryYAxis = null,
    rangeSelected: js.Function1[/* e */ RangeSelectedEventArgs, scala.Unit] = null,
    rotation: scala.Int | scala.Double = null,
    rowDefinitions: js.Array[RowDefinition] = null,
    scrollChanged: js.Function1[/* e */ ScrollChangedEventArgs, scala.Unit] = null,
    scrollEnd: js.Function1[/* e */ ScrollEndEventArgs, scala.Unit] = null,
    scrollStart: js.Function1[/* e */ ScrollStartEventArgs, scala.Unit] = null,
    selectedDataPointIndexes: js.Array[_] = null,
    series: js.Array[Series] = null,
    seriesRegionClick: js.Function1[/* e */ SeriesRegionClickEventArgs, scala.Unit] = null,
    seriesRendering: js.Function1[/* e */ SeriesRenderingEventArgs, scala.Unit] = null,
    sideBySideSeriesPlacement: js.UndefOr[scala.Boolean] = js.undefined,
    size: Size = null,
    subTitleRendering: js.Function1[/* e */ SubTitleRenderingEventArgs, scala.Unit] = null,
    symbolRendering: js.Function1[/* e */ SymbolRenderingEventArgs, scala.Unit] = null,
    theme: Theme | java.lang.String = null,
    tilt: scala.Int | scala.Double = null,
    title: Title = null,
    titleRendering: js.Function1[/* e */ TitleRenderingEventArgs, scala.Unit] = null,
    toolTipInitialize: js.Function1[/* e */ ToolTipInitializeEventArgs, scala.Unit] = null,
    trackAxisToolTip: js.Function1[/* e */ TrackAxisToolTipEventArgs, scala.Unit] = null,
    trackToolTip: js.Function1[/* e */ TrackToolTipEventArgs, scala.Unit] = null,
    trendlineRendering: js.Function1[/* e */ TrendlineRenderingEventArgs, scala.Unit] = null,
    wallSize: scala.Int | scala.Double = null,
    zoomed: js.Function1[/* e */ ZoomedEventArgs, scala.Unit] = null,
    zooming: Zooming = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (afterResize != null) __obj.updateDynamic("afterResize")(afterResize)
    if (animationComplete != null) __obj.updateDynamic("animationComplete")(animationComplete)
    if (annotationClick != null) __obj.updateDynamic("annotationClick")(annotationClick)
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (axesLabelRendering != null) __obj.updateDynamic("axesLabelRendering")(axesLabelRendering)
    if (axesLabelsInitialize != null) __obj.updateDynamic("axesLabelsInitialize")(axesLabelsInitialize)
    if (axesRangeCalculate != null) __obj.updateDynamic("axesRangeCalculate")(axesRangeCalculate)
    if (axesTitleRendering != null) __obj.updateDynamic("axesTitleRendering")(axesTitleRendering)
    if (axisLabelClick != null) __obj.updateDynamic("axisLabelClick")(axisLabelClick)
    if (axisLabelMouseMove != null) __obj.updateDynamic("axisLabelMouseMove")(axisLabelMouseMove)
    if (backGroundImageUrl != null) __obj.updateDynamic("backGroundImageUrl")(backGroundImageUrl)
    if (background != null) __obj.updateDynamic("background")(background)
    if (beforeResize != null) __obj.updateDynamic("beforeResize")(beforeResize)
    if (border != null) __obj.updateDynamic("border")(border)
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea)
    if (chartAreaBoundsCalculate != null) __obj.updateDynamic("chartAreaBoundsCalculate")(chartAreaBoundsCalculate)
    if (chartClick != null) __obj.updateDynamic("chartClick")(chartClick)
    if (chartDoubleClick != null) __obj.updateDynamic("chartDoubleClick")(chartDoubleClick)
    if (chartMouseLeave != null) __obj.updateDynamic("chartMouseLeave")(chartMouseLeave)
    if (chartMouseMove != null) __obj.updateDynamic("chartMouseMove")(chartMouseMove)
    if (columnDefinitions != null) __obj.updateDynamic("columnDefinitions")(columnDefinitions)
    if (commonSeriesOptions != null) __obj.updateDynamic("commonSeriesOptions")(commonSeriesOptions)
    if (create != null) __obj.updateDynamic("create")(create)
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (displayTextRendering != null) __obj.updateDynamic("displayTextRendering")(displayTextRendering)
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(dragEnd)
    if (dragStart != null) __obj.updateDynamic("dragStart")(dragStart)
    if (dragging != null) __obj.updateDynamic("dragging")(dragging)
    if (!js.isUndefined(enable3D)) __obj.updateDynamic("enable3D")(enable3D)
    if (!js.isUndefined(enableCanvasRendering)) __obj.updateDynamic("enableCanvasRendering")(enableCanvasRendering)
    if (!js.isUndefined(enableRotation)) __obj.updateDynamic("enableRotation")(enableRotation)
    if (errorBarRendering != null) __obj.updateDynamic("errorBarRendering")(errorBarRendering)
    if (exportSettings != null) __obj.updateDynamic("exportSettings")(exportSettings)
    if (indicators != null) __obj.updateDynamic("indicators")(indicators)
    if (!js.isUndefined(initSeriesRender)) __obj.updateDynamic("initSeriesRender")(initSeriesRender)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (legendBoundsCalculate != null) __obj.updateDynamic("legendBoundsCalculate")(legendBoundsCalculate)
    if (legendItemClick != null) __obj.updateDynamic("legendItemClick")(legendItemClick)
    if (legendItemMouseMove != null) __obj.updateDynamic("legendItemMouseMove")(legendItemMouseMove)
    if (legendItemRendering != null) __obj.updateDynamic("legendItemRendering")(legendItemRendering)
    if (load != null) __obj.updateDynamic("load")(load)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (multiLevelLabelClick != null) __obj.updateDynamic("multiLevelLabelClick")(multiLevelLabelClick)
    if (multiLevelLabelRendering != null) __obj.updateDynamic("multiLevelLabelRendering")(multiLevelLabelRendering)
    if (palette != null) __obj.updateDynamic("palette")(palette)
    if (perspectiveAngle != null) __obj.updateDynamic("perspectiveAngle")(perspectiveAngle.asInstanceOf[js.Any])
    if (pointRegionClick != null) __obj.updateDynamic("pointRegionClick")(pointRegionClick)
    if (pointRegionMouseMove != null) __obj.updateDynamic("pointRegionMouseMove")(pointRegionMouseMove)
    if (preRender != null) __obj.updateDynamic("preRender")(preRender)
    if (primaryXAxis != null) __obj.updateDynamic("primaryXAxis")(primaryXAxis)
    if (primaryYAxis != null) __obj.updateDynamic("primaryYAxis")(primaryYAxis)
    if (rangeSelected != null) __obj.updateDynamic("rangeSelected")(rangeSelected)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (rowDefinitions != null) __obj.updateDynamic("rowDefinitions")(rowDefinitions)
    if (scrollChanged != null) __obj.updateDynamic("scrollChanged")(scrollChanged)
    if (scrollEnd != null) __obj.updateDynamic("scrollEnd")(scrollEnd)
    if (scrollStart != null) __obj.updateDynamic("scrollStart")(scrollStart)
    if (selectedDataPointIndexes != null) __obj.updateDynamic("selectedDataPointIndexes")(selectedDataPointIndexes)
    if (series != null) __obj.updateDynamic("series")(series)
    if (seriesRegionClick != null) __obj.updateDynamic("seriesRegionClick")(seriesRegionClick)
    if (seriesRendering != null) __obj.updateDynamic("seriesRendering")(seriesRendering)
    if (!js.isUndefined(sideBySideSeriesPlacement)) __obj.updateDynamic("sideBySideSeriesPlacement")(sideBySideSeriesPlacement)
    if (size != null) __obj.updateDynamic("size")(size)
    if (subTitleRendering != null) __obj.updateDynamic("subTitleRendering")(subTitleRendering)
    if (symbolRendering != null) __obj.updateDynamic("symbolRendering")(symbolRendering)
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tilt != null) __obj.updateDynamic("tilt")(tilt.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleRendering != null) __obj.updateDynamic("titleRendering")(titleRendering)
    if (toolTipInitialize != null) __obj.updateDynamic("toolTipInitialize")(toolTipInitialize)
    if (trackAxisToolTip != null) __obj.updateDynamic("trackAxisToolTip")(trackAxisToolTip)
    if (trackToolTip != null) __obj.updateDynamic("trackToolTip")(trackToolTip)
    if (trendlineRendering != null) __obj.updateDynamic("trendlineRendering")(trendlineRendering)
    if (wallSize != null) __obj.updateDynamic("wallSize")(wallSize.asInstanceOf[js.Any])
    if (zoomed != null) __obj.updateDynamic("zoomed")(zoomed)
    if (zooming != null) __obj.updateDynamic("zooming")(zooming)
    __obj.asInstanceOf[Model]
  }
}

