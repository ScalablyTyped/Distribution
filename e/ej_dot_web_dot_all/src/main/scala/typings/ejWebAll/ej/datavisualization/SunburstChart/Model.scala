package typings.ejWebAll.ej.datavisualization.SunburstChart

import typings.ejWebAll.ej.datavisualization.Sunburst.Animation
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires, on clicking the sunburst chart.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
  /** Animation type of sunburst
    * @Default {rotation. See Alignment}
    */
  var animationType: js.UndefOr[Animation | String] = js.undefined
  /** Background color of the plot area.
    * @Default {null}
    */
  var background: js.UndefOr[String] = js.undefined
  /** Options for customizing the sunburst border.
    */
  var border: js.UndefOr[Border] = js.undefined
  /** Fires before rendering the datalabel
    */
  var dataLabelRendering: js.UndefOr[js.Function1[/* e */ DataLabelRenderingEventArgs, Unit]] = js.undefined
  /** Options to customize the Sunburst dataLabel.
    */
  var dataLabelSettings: js.UndefOr[DataLabelSettings] = js.undefined
  /** Specifies the dataSource to the sunburst.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Fires, on double clicking the sunburst chart.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
  /** Fires when resetting drilldown points.
    */
  var drillDownBack: js.UndefOr[js.Function1[/* e */ DrillDownBackEventArgs, Unit]] = js.undefined
  /** Fires when clicking the point to perform drilldown.
    */
  var drillDownClick: js.UndefOr[js.Function1[/* e */ DrillDownClickEventArgs, Unit]] = js.undefined
  /** Fires after resetting the sunburst points
    */
  var drillDownReset: js.UndefOr[js.Function1[/* e */ DrillDownResetEventArgs, Unit]] = js.undefined
  /** Enable/disable the animation for all the levels.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Sunburst rendering will end at the specified value
    * @Default {null}
    */
  var endAngle: js.UndefOr[Double] = js.undefined
  /** Options for customizing the appearance of the levels or point while highlighting.
    */
  var highlightSettings: js.UndefOr[HighlightSettings] = js.undefined
  /** Sunburst inner radius value
    * @Default {0.4}
    */
  var innerRadius: js.UndefOr[Double] = js.undefined
  /** Controls whether sunburst has to be responsive or not.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Options to customize the legend items and legend title.
    */
  var legend: js.UndefOr[Legend] = js.undefined
  /** Specify levels of sunburst for grouped visualization of data
    * @Default {[]}
    */
  var levels: js.UndefOr[js.Array[Level]] = js.undefined
  /** Fires before loading.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Fires after rendering sunburst.
    */
  var loaded: js.UndefOr[js.Function1[/* e */ LoadedEventArgs, Unit]] = js.undefined
  /** Options to customize the left, right, top and bottom margins of sunburst area.
    */
  var margin: js.UndefOr[Margin] = js.undefined
  /** Opacity of the levels.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Palette color for the data points.
    * @Default {null}
    */
  var palette: js.UndefOr[String] = js.undefined
  /** Parent node of the data points.
    * @Default {null}
    */
  var parentNode: js.UndefOr[String] = js.undefined
  /** Fires after clicking the point in sunburst
    */
  var pointRegionClick: js.UndefOr[js.Function1[/* e */ PointRegionClickEventArgs, Unit]] = js.undefined
  /** Fires while moving the mouse over sunburst points
    */
  var pointRegionMouseMove: js.UndefOr[js.Function1[/* e */ PointRegionMouseMoveEventArgs, Unit]] = js.undefined
  /** Options for customizing sunburst points.
    */
  var points: js.UndefOr[Points] = js.undefined
  /** Fires before rendering sunburst.
    */
  var preRender: js.UndefOr[js.Function1[/* e */ PreRenderEventArgs, Unit]] = js.undefined
  /** Sunburst outer radius value
    * @Default {1}
    */
  var radius: js.UndefOr[Double] = js.undefined
  /** Fires, on right clicking the sunburst chart
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
  /** Options for customizing the sunburst segment border.
    */
  var segmentBorder: js.UndefOr[SegmentBorder] = js.undefined
  /** Fires before rendering each segment
    */
  var segmentRendering: js.UndefOr[js.Function1[/* e */ SegmentRenderingEventArgs, Unit]] = js.undefined
  /** Options for customizing the appearance of the levels or data point while selection.
    */
  var selectionSettings: js.UndefOr[SelectionSettings] = js.undefined
  /** Options to customize the Sunburst size.
    */
  var size: js.UndefOr[Size] = js.undefined
  /** Sunburst rendering will start from the specified value
    * @Default {null}
    */
  var startAngle: js.UndefOr[Double] = js.undefined
  /** Specifies the theme for Sunburst.
    * @Default {Flatlight. See Theme}
    */
  var theme: js.UndefOr[SunburstTheme | String] = js.undefined
  /** Options for customizing the title and subtitle of sunburst.
    */
  var title: js.UndefOr[Title] = js.undefined
  /** Fires before rendering sunburst title.
    */
  var titleRendering: js.UndefOr[js.Function1[/* e */ TitleRenderingEventArgs, Unit]] = js.undefined
  /** Options to customize the Sunburst tooltip.
    */
  var tooltip: js.UndefOr[Tooltip] = js.undefined
  /** Fires during initialization of tooltip.
    */
  var tooltipInitialize: js.UndefOr[js.Function1[/* e */ TooltipInitializeEventArgs, Unit]] = js.undefined
  /** Bind the data field from the data source.
    * @Default {null}
    */
  var valueMemberPath: js.UndefOr[String] = js.undefined
  /** Controls the visibility of sunburst.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Name of the property in the datasource that contains x values.
    * @Default {null}
    */
  var xName: js.UndefOr[String] = js.undefined
  /** Name of the property in the datasource that contains y values.
    * @Default {null}
    */
  var yName: js.UndefOr[String] = js.undefined
  /** Options for enable zooming feature of chart.
    */
  var zoomSettings: js.UndefOr[ZoomSettings] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    Click: /* e */ ClickEventArgs => Unit = null,
    animationType: Animation | String = null,
    background: String = null,
    border: Border = null,
    dataLabelRendering: /* e */ DataLabelRenderingEventArgs => Unit = null,
    dataLabelSettings: DataLabelSettings = null,
    dataSource: js.Any = null,
    doubleClick: /* e */ DoubleClickEventArgs => Unit = null,
    drillDownBack: /* e */ DrillDownBackEventArgs => Unit = null,
    drillDownClick: /* e */ DrillDownClickEventArgs => Unit = null,
    drillDownReset: /* e */ DrillDownResetEventArgs => Unit = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    endAngle: Int | Double = null,
    highlightSettings: HighlightSettings = null,
    innerRadius: Int | Double = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    legend: Legend = null,
    levels: js.Array[Level] = null,
    load: /* e */ LoadEventArgs => Unit = null,
    loaded: /* e */ LoadedEventArgs => Unit = null,
    margin: Margin = null,
    opacity: Int | Double = null,
    palette: String = null,
    parentNode: String = null,
    pointRegionClick: /* e */ PointRegionClickEventArgs => Unit = null,
    pointRegionMouseMove: /* e */ PointRegionMouseMoveEventArgs => Unit = null,
    points: Points = null,
    preRender: /* e */ PreRenderEventArgs => Unit = null,
    radius: Int | Double = null,
    rightClick: /* e */ RightClickEventArgs => Unit = null,
    segmentBorder: SegmentBorder = null,
    segmentRendering: /* e */ SegmentRenderingEventArgs => Unit = null,
    selectionSettings: SelectionSettings = null,
    size: Size = null,
    startAngle: Int | Double = null,
    theme: SunburstTheme | String = null,
    title: Title = null,
    titleRendering: /* e */ TitleRenderingEventArgs => Unit = null,
    tooltip: Tooltip = null,
    tooltipInitialize: /* e */ TooltipInitializeEventArgs => Unit = null,
    valueMemberPath: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    xName: String = null,
    yName: String = null,
    zoomSettings: ZoomSettings = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Click != null) __obj.updateDynamic("Click")(js.Any.fromFunction1(Click))
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (dataLabelRendering != null) __obj.updateDynamic("dataLabelRendering")(js.Any.fromFunction1(dataLabelRendering))
    if (dataLabelSettings != null) __obj.updateDynamic("dataLabelSettings")(dataLabelSettings.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(js.Any.fromFunction1(doubleClick))
    if (drillDownBack != null) __obj.updateDynamic("drillDownBack")(js.Any.fromFunction1(drillDownBack))
    if (drillDownClick != null) __obj.updateDynamic("drillDownClick")(js.Any.fromFunction1(drillDownClick))
    if (drillDownReset != null) __obj.updateDynamic("drillDownReset")(js.Any.fromFunction1(drillDownReset))
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (highlightSettings != null) __obj.updateDynamic("highlightSettings")(highlightSettings.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (loaded != null) __obj.updateDynamic("loaded")(js.Any.fromFunction1(loaded))
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    if (pointRegionClick != null) __obj.updateDynamic("pointRegionClick")(js.Any.fromFunction1(pointRegionClick))
    if (pointRegionMouseMove != null) __obj.updateDynamic("pointRegionMouseMove")(js.Any.fromFunction1(pointRegionMouseMove))
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (preRender != null) __obj.updateDynamic("preRender")(js.Any.fromFunction1(preRender))
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (rightClick != null) __obj.updateDynamic("rightClick")(js.Any.fromFunction1(rightClick))
    if (segmentBorder != null) __obj.updateDynamic("segmentBorder")(segmentBorder.asInstanceOf[js.Any])
    if (segmentRendering != null) __obj.updateDynamic("segmentRendering")(js.Any.fromFunction1(segmentRendering))
    if (selectionSettings != null) __obj.updateDynamic("selectionSettings")(selectionSettings.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleRendering != null) __obj.updateDynamic("titleRendering")(js.Any.fromFunction1(titleRendering))
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipInitialize != null) __obj.updateDynamic("tooltipInitialize")(js.Any.fromFunction1(tooltipInitialize))
    if (valueMemberPath != null) __obj.updateDynamic("valueMemberPath")(valueMemberPath.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (xName != null) __obj.updateDynamic("xName")(xName.asInstanceOf[js.Any])
    if (yName != null) __obj.updateDynamic("yName")(yName.asInstanceOf[js.Any])
    if (zoomSettings != null) __obj.updateDynamic("zoomSettings")(zoomSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

