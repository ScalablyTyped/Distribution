package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Fires, after the chart is resized.
    */
  var afterResize: js.UndefOr[js.Function1[/* e */ AfterResizeEventArgs, scala.Unit]] = js.native
  
  /** Fires after the series animation is completed. This event will be triggered for each series when animation is enabled.
    */
  var animationComplete: js.UndefOr[js.Function1[/* e */ AnimationCompleteEventArgs, scala.Unit]] = js.native
  
  /** Fires on clicking the annotation.
    */
  var annotationClick: js.UndefOr[js.Function1[/* e */ AnnotationClickEventArgs, scala.Unit]] = js.native
  
  /** Options for adding and customizing annotations in Chart.
    */
  var annotations: js.UndefOr[js.Array[Annotation]] = js.native
  
  /** To override x axis for particular series, create an axis object by providing unique name by using name property and add it to axes array. Then, assign the name to the seriesâ€™s
    * xAxisName property to link both axis and series.
    */
  var axes: js.UndefOr[js.Array[Axis]] = js.native
  
  /** Fires before rendering the labels. This event is fired for each label in axis. You can use this event to add custom text to axis labels.
    */
  var axesLabelRendering: js.UndefOr[js.Function1[/* e */ AxesLabelRenderingEventArgs, scala.Unit]] = js.native
  
  /** Fires during the initialization of axis labels.
    */
  var axesLabelsInitialize: js.UndefOr[js.Function1[/* e */ AxesLabelsInitializeEventArgs, scala.Unit]] = js.native
  
  /** Fires during axes range calculation. This event is fired for each axis present in Chart. You can use this event to customize axis range as required.
    */
  var axesRangeCalculate: js.UndefOr[js.Function1[/* e */ AxesRangeCalculateEventArgs, scala.Unit]] = js.native
  
  /** Fires before rendering the axis title. This event is triggered for each axis with title. You can use this event to add custom text to axis title.
    */
  var axesTitleRendering: js.UndefOr[js.Function1[/* e */ AxesTitleRenderingEventArgs, scala.Unit]] = js.native
  
  /** Fires, on clicking the axis label.
    */
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ AxisLabelClickEventArgs, scala.Unit]] = js.native
  
  /** Fires on moving mouse over the axis label.
    */
  var axisLabelMouseMove: js.UndefOr[js.Function1[/* e */ AxisLabelMouseMoveEventArgs, scala.Unit]] = js.native
  
  /** URL of the image to be used as chart background.
    * @Default {null}
    */
  var backGroundImageUrl: js.UndefOr[String] = js.native
  
  /** Sets the background color of the  chart.
    * @Default {transparent}
    */
  var background: js.UndefOr[String] = js.native
  
  /** Fires, when chart size is changing.
    */
  var beforeResize: js.UndefOr[js.Function1[/* e */ BeforeResizeEventArgs, scala.Unit]] = js.native
  
  /** Options for customizing the color, opacity and width of the chart border.
    */
  var border: js.UndefOr[Border] = js.native
  
  /** Options for configuring the border and background of the plot area.
    */
  var chartArea: js.UndefOr[ChartArea] = js.native
  
  /** Fires during the calculation of chart area bounds. You can use this event to customize the bounds of chart area.
    */
  var chartAreaBoundsCalculate: js.UndefOr[js.Function1[/* e */ ChartAreaBoundsCalculateEventArgs, scala.Unit]] = js.native
  
  /** Fires, on the clicking the chart.
    */
  var chartClick: js.UndefOr[js.Function1[/* e */ ChartClickEventArgs, scala.Unit]] = js.native
  
  /** Fires, on double clicking the chart.
    */
  var chartDoubleClick: js.UndefOr[js.Function1[/* e */ ChartDoubleClickEventArgs, scala.Unit]] = js.native
  
  /** Fires when the mouse pointer leaves the chart
    */
  var chartMouseLeave: js.UndefOr[js.Function1[/* e */ ChartMouseLeaveEventArgs, scala.Unit]] = js.native
  
  /** Fires on moving mouse over the chart.
    */
  var chartMouseMove: js.UndefOr[js.Function1[/* e */ ChartMouseMoveEventArgs, scala.Unit]] = js.native
  
  /** Options to split Chart into multiple plotting areas vertically. Each object in the collection represents a plotting area in Chart.
    */
  var columnDefinitions: js.UndefOr[js.Array[ColumnDefinition]] = js.native
  
  /** Options for configuring the properties of all the series. You can also override the options for specific series by using series collection.
    */
  var commonSeriesOptions: js.UndefOr[CommonSeriesOptions] = js.native
  
  /** Fires after chart is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.native
  
  /** Options for displaying and customizing the crosshair.
    */
  var crosshair: js.UndefOr[Crosshair] = js.native
  
  /** Depth of the 3D Chart from front view of series to background wall. This property is applicable only for 3D view.
    * @Default {100}
    */
  var depth: js.UndefOr[Double] = js.native
  
  /** Fires when chart is destroyed completely.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.native
  
  /** Fires before rendering the data labels. This event is triggered for each data label in the series. You can use this event to add custom text in data labels.
    */
  var displayTextRendering: js.UndefOr[js.Function1[/* e */ DisplayTextRenderingEventArgs, scala.Unit]] = js.native
  
  /** Fires when the dragging is completed
    */
  var dragEnd: js.UndefOr[js.Function1[/* e */ DragEndEventArgs, scala.Unit]] = js.native
  
  /** Fires when the dragging is started
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, scala.Unit]] = js.native
  
  /** Fires while  dragging
    */
  var dragging: js.UndefOr[js.Function1[/* e */ DraggingEventArgs, scala.Unit]] = js.native
  
  /** Controls whether 3D view has to be enabled or not. 3D view is supported only for column, bar. Stacking column, stacking bar, pie and doughnut series types.
    * @Default {false}
    */
  var enable3D: js.UndefOr[Boolean] = js.native
  
  /** Controls whether Chart has to be rendered as Canvas or SVG. Canvas rendering supports all functionalities in SVG rendering except 3D Charts.
    * @Default {false}
    */
  var enableCanvasRendering: js.UndefOr[Boolean] = js.native
  
  /** Controls whether 3D view has to be rotated on dragging. This property is applicable only for 3D view.
    * @Default {false}
    */
  var enableRotation: js.UndefOr[Boolean] = js.native
  
  /** Fires, when error bar is rendering.
    */
  var errorBarRendering: js.UndefOr[js.Function1[/* e */ ErrorBarRenderingEventArgs, scala.Unit]] = js.native
  
  /** This provides options for customizing export settings
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.native
  
  /** Options to customize the technical indicators.
    */
  var indicators: js.UndefOr[js.Array[Indicator]] = js.native
  
  /** Controls whether the series has to be rendered at initial loading of chart, this will be useful in scenarios where chart is placed at the bottom of the web page and we need to
    * render the series only when the chart is visible while scrolling to the top.
    * @Default {true}
    */
  var initSeriesRender: js.UndefOr[Boolean] = js.native
  
  /** Controls whether Chart has to be responsive while resizing.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  
  /** Options to customize the legend items and legend title.
    */
  var legend: js.UndefOr[Legend] = js.native
  
  /** Fires during the calculation of legend bounds. You can use this event to customize the bounds of legend.
    */
  var legendBoundsCalculate: js.UndefOr[js.Function1[/* e */ LegendBoundsCalculateEventArgs, scala.Unit]] = js.native
  
  /** Fires on clicking the legend item.
    */
  var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, scala.Unit]] = js.native
  
  /** Fires when moving mouse over legend item. You can use this event for hit testing on legend items.
    */
  var legendItemMouseMove: js.UndefOr[js.Function1[/* e */ LegendItemMouseMoveEventArgs, scala.Unit]] = js.native
  
  /** Fires before rendering the legend item. This event is fired for each legend item in Chart. You can use this event to customize legend item shape or add custom text to legend item.
    */
  var legendItemRendering: js.UndefOr[js.Function1[/* e */ LegendItemRenderingEventArgs, scala.Unit]] = js.native
  
  /** Fires before loading the chart.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.native
  
  /** Name of the culture based on which chart should be localized. Number and date time values are localized with respect to the culture name.String type properties like title text are
    * not localized automatically. Provide localized text as value to string type properties.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Options to customize the left, right, top and bottom margins of chart area.
    */
  var margin: js.UndefOr[Margin] = js.native
  
  /** Fires, on the clicking the Multi level labels of the chart .
    */
  var multiLevelLabelClick: js.UndefOr[js.Function1[/* e */ MultiLevelLabelClickEventArgs, scala.Unit]] = js.native
  
  /** Fires, when multi level labels are rendering.
    */
  var multiLevelLabelRendering: js.UndefOr[js.Function1[/* e */ MultiLevelLabelRenderingEventArgs, scala.Unit]] = js.native
  
  /** Palette is used to store the series fill color in array and apply the color to series collection in the order of series index.
    * @Default {null}
    */
  var palette: js.UndefOr[js.Array[_]] = js.native
  
  /** Perspective angle of the 3D view. Chart appears closer when perspective angle is decreased, and distant when perspective angle is increased.This property is applicable only when
    * 3D view is enabled
    * @Default {90}
    */
  var perspectiveAngle: js.UndefOr[Double] = js.native
  
  /** Fires on clicking a point in chart. You can use this event to handle clicks made on points.
    */
  var pointRegionClick: js.UndefOr[js.Function1[/* e */ PointRegionClickEventArgs, scala.Unit]] = js.native
  
  /** Fires when mouse is moved over a point.
    */
  var pointRegionMouseMove: js.UndefOr[js.Function1[/* e */ PointRegionMouseMoveEventArgs, scala.Unit]] = js.native
  
  /** Fires before rendering chart.
    */
  var preRender: js.UndefOr[js.Function1[/* e */ PreRenderEventArgs, scala.Unit]] = js.native
  
  /** This is a horizontal axis that contains options to configure axis and it is the primary x axis for all the series in series array. To override x axis for particular series, create
    * an axis object by providing unique name by using name property and add it to axes array. Then, assign the name to the seriesâ€™s xAxisName property to link both axis and series.
    */
  var primaryXAxis: js.UndefOr[PrimaryXAxis] = js.native
  
  /** This is a vertical axis that contains options to configure axis. This is the primary y axis for all the series in series array. To override y axis for particular series, create an
    * axis object by providing unique name by using name property and add it to axes array. Then, assign the name to the seriesâ€™s yAxisName property to link both axis and series.
    */
  var primaryYAxis: js.UndefOr[PrimaryYAxis] = js.native
  
  /** Fires after selected the data in chart.
    */
  var rangeSelected: js.UndefOr[js.Function1[/* e */ RangeSelectedEventArgs, scala.Unit]] = js.native
  
  /** Rotation angle of the 3D view. This property is applicable only when 3D view is enabled.
    * @Default {0}
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /** Options to split Chart into multiple plotting areas horizontally. Each object in the collection represents a plotting area in Chart.
    */
  var rowDefinitions: js.UndefOr[js.Array[RowDefinition]] = js.native
  
  /** Trigger, after the scrollbar position is changed.
    */
  var scrollChanged: js.UndefOr[js.Function1[/* e */ ScrollChangedEventArgs, scala.Unit]] = js.native
  
  /** Event triggered when scroll end
    */
  var scrollEnd: js.UndefOr[js.Function1[/* e */ ScrollEndEventArgs, scala.Unit]] = js.native
  
  /** Event triggered when scroll starts
    */
  var scrollStart: js.UndefOr[js.Function1[/* e */ ScrollStartEventArgs, scala.Unit]] = js.native
  
  /** Options for displaying the chart along with selected points while loading
    * @Default {[ ]}
    */
  var selectedDataPointIndexes: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the properties used for customizing the series.
    */
  var series: js.UndefOr[js.Array[Series]] = js.native
  
  /** Fires after selecting a series. This event is triggered after selecting a series only if selection mode is series.
    */
  var seriesRegionClick: js.UndefOr[js.Function1[/* e */ SeriesRegionClickEventArgs, scala.Unit]] = js.native
  
  /** Fires before rendering a series. This event is fired for each series in Chart.
    */
  var seriesRendering: js.UndefOr[js.Function1[/* e */ SeriesRenderingEventArgs, scala.Unit]] = js.native
  
  /** Controls whether data points has to be displayed side by side or along the depth of the axis.
    * @Default {false}
    */
  var sideBySideSeriesPlacement: js.UndefOr[Boolean] = js.native
  
  /** Options to customize the Chart size.
    */
  var size: js.UndefOr[Size] = js.native
  
  /** Fires when the sub Title of the chart is rendered
    */
  var subTitleRendering: js.UndefOr[js.Function1[/* e */ SubTitleRenderingEventArgs, scala.Unit]] = js.native
  
  /** Fires before rendering the marker symbols. This event is triggered for each marker in Chart.
    */
  var symbolRendering: js.UndefOr[js.Function1[/* e */ SymbolRenderingEventArgs, scala.Unit]] = js.native
  
  /** Specifies the theme for Chart.
    * @Default {Flatlight. See Theme}
    */
  var theme: js.UndefOr[Theme | String] = js.native
  
  /** Slope angle of 3D Chart. This property is applicable only when 3D view is enabled.
    * @Default {0}
    */
  var tilt: js.UndefOr[Double] = js.native
  
  /** Options for customizing the title and subtitle of Chart.
    */
  var title: js.UndefOr[Title] = js.native
  
  /** Fires before rendering the Chart title. You can use this event to add custom text in Chart title.
    */
  var titleRendering: js.UndefOr[js.Function1[/* e */ TitleRenderingEventArgs, scala.Unit]] = js.native
  
  /** Fires before rendering the tooltip. This event is fired when tooltip is enabled and mouse is hovered on a Chart point. You can use this event to customize tooltip before rendering.
    */
  var toolTipInitialize: js.UndefOr[js.Function1[/* e */ ToolTipInitializeEventArgs, scala.Unit]] = js.native
  
  /** Fires before rendering crosshair tooltip in axis. This event is fired for each axis with crosshair label enabled. You can use this event to customize crosshair label before
    * rendering
    */
  var trackAxisToolTip: js.UndefOr[js.Function1[/* e */ TrackAxisToolTipEventArgs, scala.Unit]] = js.native
  
  /** Fires before rendering trackball tooltip. This event is fired for each series in Chart because trackball tooltip is displayed for all the series. You can use this event to
    * customize the text displayed in trackball tooltip.
    */
  var trackToolTip: js.UndefOr[js.Function1[/* e */ TrackToolTipEventArgs, scala.Unit]] = js.native
  
  /** Fires, when trendlines are rendering.
    */
  var trendlineRendering: js.UndefOr[js.Function1[/* e */ TrendlineRenderingEventArgs, scala.Unit]] = js.native
  
  /** Width of the wall used in 3D Chart. Wall is present only in Cartesian type 3D series and not in 3D pie or Doughnut series. This property is applicable only when 3D view is enabled.
    * @Default {2}
    */
  var wallSize: js.UndefOr[Double] = js.native
  
  /** Fires while performing rectangle zooming in chart.
    */
  var zoomed: js.UndefOr[js.Function1[/* e */ ZoomedEventArgs, scala.Unit]] = js.native
  
  /** Options for enabling zooming feature of chart.
    */
  var zooming: js.UndefOr[Zooming] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterResize(value: /* e */ AfterResizeEventArgs => scala.Unit): Self = this.set("afterResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterResize: Self = this.set("afterResize", js.undefined)
    
    @scala.inline
    def setAnimationComplete(value: /* e */ AnimationCompleteEventArgs => scala.Unit): Self = this.set("animationComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAnimationComplete: Self = this.set("animationComplete", js.undefined)
    
    @scala.inline
    def setAnnotationClick(value: /* e */ AnnotationClickEventArgs => scala.Unit): Self = this.set("annotationClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAnnotationClick: Self = this.set("annotationClick", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: Annotation*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: js.Array[Annotation]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setAxesVarargs(value: Axis*): Self = this.set("axes", js.Array(value :_*))
    
    @scala.inline
    def setAxes(value: js.Array[Axis]): Self = this.set("axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    
    @scala.inline
    def setAxesLabelRendering(value: /* e */ AxesLabelRenderingEventArgs => scala.Unit): Self = this.set("axesLabelRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAxesLabelRendering: Self = this.set("axesLabelRendering", js.undefined)
    
    @scala.inline
    def setAxesLabelsInitialize(value: /* e */ AxesLabelsInitializeEventArgs => scala.Unit): Self = this.set("axesLabelsInitialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAxesLabelsInitialize: Self = this.set("axesLabelsInitialize", js.undefined)
    
    @scala.inline
    def setAxesRangeCalculate(value: /* e */ AxesRangeCalculateEventArgs => scala.Unit): Self = this.set("axesRangeCalculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAxesRangeCalculate: Self = this.set("axesRangeCalculate", js.undefined)
    
    @scala.inline
    def setAxesTitleRendering(value: /* e */ AxesTitleRenderingEventArgs => scala.Unit): Self = this.set("axesTitleRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAxesTitleRendering: Self = this.set("axesTitleRendering", js.undefined)
    
    @scala.inline
    def setAxisLabelClick(value: /* e */ AxisLabelClickEventArgs => scala.Unit): Self = this.set("axisLabelClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAxisLabelClick: Self = this.set("axisLabelClick", js.undefined)
    
    @scala.inline
    def setAxisLabelMouseMove(value: /* e */ AxisLabelMouseMoveEventArgs => scala.Unit): Self = this.set("axisLabelMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAxisLabelMouseMove: Self = this.set("axisLabelMouseMove", js.undefined)
    
    @scala.inline
    def setBackGroundImageUrl(value: String): Self = this.set("backGroundImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackGroundImageUrl: Self = this.set("backGroundImageUrl", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBeforeResize(value: /* e */ BeforeResizeEventArgs => scala.Unit): Self = this.set("beforeResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeResize: Self = this.set("beforeResize", js.undefined)
    
    @scala.inline
    def setBorder(value: Border): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setChartArea(value: ChartArea): Self = this.set("chartArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartArea: Self = this.set("chartArea", js.undefined)
    
    @scala.inline
    def setChartAreaBoundsCalculate(value: /* e */ ChartAreaBoundsCalculateEventArgs => scala.Unit): Self = this.set("chartAreaBoundsCalculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChartAreaBoundsCalculate: Self = this.set("chartAreaBoundsCalculate", js.undefined)
    
    @scala.inline
    def setChartClick(value: /* e */ ChartClickEventArgs => scala.Unit): Self = this.set("chartClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChartClick: Self = this.set("chartClick", js.undefined)
    
    @scala.inline
    def setChartDoubleClick(value: /* e */ ChartDoubleClickEventArgs => scala.Unit): Self = this.set("chartDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChartDoubleClick: Self = this.set("chartDoubleClick", js.undefined)
    
    @scala.inline
    def setChartMouseLeave(value: /* e */ ChartMouseLeaveEventArgs => scala.Unit): Self = this.set("chartMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChartMouseLeave: Self = this.set("chartMouseLeave", js.undefined)
    
    @scala.inline
    def setChartMouseMove(value: /* e */ ChartMouseMoveEventArgs => scala.Unit): Self = this.set("chartMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChartMouseMove: Self = this.set("chartMouseMove", js.undefined)
    
    @scala.inline
    def setColumnDefinitionsVarargs(value: ColumnDefinition*): Self = this.set("columnDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setColumnDefinitions(value: js.Array[ColumnDefinition]): Self = this.set("columnDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnDefinitions: Self = this.set("columnDefinitions", js.undefined)
    
    @scala.inline
    def setCommonSeriesOptions(value: CommonSeriesOptions): Self = this.set("commonSeriesOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonSeriesOptions: Self = this.set("commonSeriesOptions", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => scala.Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCrosshair(value: Crosshair): Self = this.set("crosshair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshair: Self = this.set("crosshair", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => scala.Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setDisplayTextRendering(value: /* e */ DisplayTextRenderingEventArgs => scala.Unit): Self = this.set("displayTextRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDisplayTextRendering: Self = this.set("displayTextRendering", js.undefined)
    
    @scala.inline
    def setDragEnd(value: /* e */ DragEndEventArgs => scala.Unit): Self = this.set("dragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragEnd: Self = this.set("dragEnd", js.undefined)
    
    @scala.inline
    def setDragStart(value: /* e */ DragStartEventArgs => scala.Unit): Self = this.set("dragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    
    @scala.inline
    def setDragging(value: /* e */ DraggingEventArgs => scala.Unit): Self = this.set("dragging", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragging: Self = this.set("dragging", js.undefined)
    
    @scala.inline
    def setEnable3D(value: Boolean): Self = this.set("enable3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable3D: Self = this.set("enable3D", js.undefined)
    
    @scala.inline
    def setEnableCanvasRendering(value: Boolean): Self = this.set("enableCanvasRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCanvasRendering: Self = this.set("enableCanvasRendering", js.undefined)
    
    @scala.inline
    def setEnableRotation(value: Boolean): Self = this.set("enableRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRotation: Self = this.set("enableRotation", js.undefined)
    
    @scala.inline
    def setErrorBarRendering(value: /* e */ ErrorBarRenderingEventArgs => scala.Unit): Self = this.set("errorBarRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteErrorBarRendering: Self = this.set("errorBarRendering", js.undefined)
    
    @scala.inline
    def setExportSettings(value: ExportSettings): Self = this.set("exportSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportSettings: Self = this.set("exportSettings", js.undefined)
    
    @scala.inline
    def setIndicatorsVarargs(value: Indicator*): Self = this.set("indicators", js.Array(value :_*))
    
    @scala.inline
    def setIndicators(value: js.Array[Indicator]): Self = this.set("indicators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicators: Self = this.set("indicators", js.undefined)
    
    @scala.inline
    def setInitSeriesRender(value: Boolean): Self = this.set("initSeriesRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitSeriesRender: Self = this.set("initSeriesRender", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setLegend(value: Legend): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setLegendBoundsCalculate(value: /* e */ LegendBoundsCalculateEventArgs => scala.Unit): Self = this.set("legendBoundsCalculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLegendBoundsCalculate: Self = this.set("legendBoundsCalculate", js.undefined)
    
    @scala.inline
    def setLegendItemClick(value: /* e */ LegendItemClickEventArgs => scala.Unit): Self = this.set("legendItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLegendItemClick: Self = this.set("legendItemClick", js.undefined)
    
    @scala.inline
    def setLegendItemMouseMove(value: /* e */ LegendItemMouseMoveEventArgs => scala.Unit): Self = this.set("legendItemMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLegendItemMouseMove: Self = this.set("legendItemMouseMove", js.undefined)
    
    @scala.inline
    def setLegendItemRendering(value: /* e */ LegendItemRenderingEventArgs => scala.Unit): Self = this.set("legendItemRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLegendItemRendering: Self = this.set("legendItemRendering", js.undefined)
    
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => scala.Unit): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMargin(value: Margin): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMultiLevelLabelClick(value: /* e */ MultiLevelLabelClickEventArgs => scala.Unit): Self = this.set("multiLevelLabelClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMultiLevelLabelClick: Self = this.set("multiLevelLabelClick", js.undefined)
    
    @scala.inline
    def setMultiLevelLabelRendering(value: /* e */ MultiLevelLabelRenderingEventArgs => scala.Unit): Self = this.set("multiLevelLabelRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMultiLevelLabelRendering: Self = this.set("multiLevelLabelRendering", js.undefined)
    
    @scala.inline
    def setPaletteVarargs(value: js.Any*): Self = this.set("palette", js.Array(value :_*))
    
    @scala.inline
    def setPalette(value: js.Array[_]): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    
    @scala.inline
    def setPerspectiveAngle(value: Double): Self = this.set("perspectiveAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerspectiveAngle: Self = this.set("perspectiveAngle", js.undefined)
    
    @scala.inline
    def setPointRegionClick(value: /* e */ PointRegionClickEventArgs => scala.Unit): Self = this.set("pointRegionClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePointRegionClick: Self = this.set("pointRegionClick", js.undefined)
    
    @scala.inline
    def setPointRegionMouseMove(value: /* e */ PointRegionMouseMoveEventArgs => scala.Unit): Self = this.set("pointRegionMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePointRegionMouseMove: Self = this.set("pointRegionMouseMove", js.undefined)
    
    @scala.inline
    def setPreRender(value: /* e */ PreRenderEventArgs => scala.Unit): Self = this.set("preRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreRender: Self = this.set("preRender", js.undefined)
    
    @scala.inline
    def setPrimaryXAxis(value: PrimaryXAxis): Self = this.set("primaryXAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryXAxis: Self = this.set("primaryXAxis", js.undefined)
    
    @scala.inline
    def setPrimaryYAxis(value: PrimaryYAxis): Self = this.set("primaryYAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryYAxis: Self = this.set("primaryYAxis", js.undefined)
    
    @scala.inline
    def setRangeSelected(value: /* e */ RangeSelectedEventArgs => scala.Unit): Self = this.set("rangeSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRangeSelected: Self = this.set("rangeSelected", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setRowDefinitionsVarargs(value: RowDefinition*): Self = this.set("rowDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setRowDefinitions(value: js.Array[RowDefinition]): Self = this.set("rowDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowDefinitions: Self = this.set("rowDefinitions", js.undefined)
    
    @scala.inline
    def setScrollChanged(value: /* e */ ScrollChangedEventArgs => scala.Unit): Self = this.set("scrollChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScrollChanged: Self = this.set("scrollChanged", js.undefined)
    
    @scala.inline
    def setScrollEnd(value: /* e */ ScrollEndEventArgs => scala.Unit): Self = this.set("scrollEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScrollEnd: Self = this.set("scrollEnd", js.undefined)
    
    @scala.inline
    def setScrollStart(value: /* e */ ScrollStartEventArgs => scala.Unit): Self = this.set("scrollStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScrollStart: Self = this.set("scrollStart", js.undefined)
    
    @scala.inline
    def setSelectedDataPointIndexesVarargs(value: js.Any*): Self = this.set("selectedDataPointIndexes", js.Array(value :_*))
    
    @scala.inline
    def setSelectedDataPointIndexes(value: js.Array[_]): Self = this.set("selectedDataPointIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedDataPointIndexes: Self = this.set("selectedDataPointIndexes", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: Series*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: js.Array[Series]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setSeriesRegionClick(value: /* e */ SeriesRegionClickEventArgs => scala.Unit): Self = this.set("seriesRegionClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSeriesRegionClick: Self = this.set("seriesRegionClick", js.undefined)
    
    @scala.inline
    def setSeriesRendering(value: /* e */ SeriesRenderingEventArgs => scala.Unit): Self = this.set("seriesRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSeriesRendering: Self = this.set("seriesRendering", js.undefined)
    
    @scala.inline
    def setSideBySideSeriesPlacement(value: Boolean): Self = this.set("sideBySideSeriesPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideBySideSeriesPlacement: Self = this.set("sideBySideSeriesPlacement", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSubTitleRendering(value: /* e */ SubTitleRenderingEventArgs => scala.Unit): Self = this.set("subTitleRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSubTitleRendering: Self = this.set("subTitleRendering", js.undefined)
    
    @scala.inline
    def setSymbolRendering(value: /* e */ SymbolRenderingEventArgs => scala.Unit): Self = this.set("symbolRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSymbolRendering: Self = this.set("symbolRendering", js.undefined)
    
    @scala.inline
    def setTheme(value: Theme | String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTilt(value: Double): Self = this.set("tilt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTilt: Self = this.set("tilt", js.undefined)
    
    @scala.inline
    def setTitle(value: Title): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleRendering(value: /* e */ TitleRenderingEventArgs => scala.Unit): Self = this.set("titleRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTitleRendering: Self = this.set("titleRendering", js.undefined)
    
    @scala.inline
    def setToolTipInitialize(value: /* e */ ToolTipInitializeEventArgs => scala.Unit): Self = this.set("toolTipInitialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToolTipInitialize: Self = this.set("toolTipInitialize", js.undefined)
    
    @scala.inline
    def setTrackAxisToolTip(value: /* e */ TrackAxisToolTipEventArgs => scala.Unit): Self = this.set("trackAxisToolTip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTrackAxisToolTip: Self = this.set("trackAxisToolTip", js.undefined)
    
    @scala.inline
    def setTrackToolTip(value: /* e */ TrackToolTipEventArgs => scala.Unit): Self = this.set("trackToolTip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTrackToolTip: Self = this.set("trackToolTip", js.undefined)
    
    @scala.inline
    def setTrendlineRendering(value: /* e */ TrendlineRenderingEventArgs => scala.Unit): Self = this.set("trendlineRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTrendlineRendering: Self = this.set("trendlineRendering", js.undefined)
    
    @scala.inline
    def setWallSize(value: Double): Self = this.set("wallSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWallSize: Self = this.set("wallSize", js.undefined)
    
    @scala.inline
    def setZoomed(value: /* e */ ZoomedEventArgs => scala.Unit): Self = this.set("zoomed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteZoomed: Self = this.set("zoomed", js.undefined)
    
    @scala.inline
    def setZooming(value: Zooming): Self = this.set("zooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZooming: Self = this.set("zooming", js.undefined)
  }
}
