package typings
package ejDotWebDotAllLib.ejNs.SunburstChartNs

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

object Model {
  @scala.inline
  def apply(
    Click: js.Function1[/* e */ ClickEventArgs, scala.Unit] = null,
    animationType: ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.Animation | java.lang.String = null,
    background: java.lang.String = null,
    border: Border = null,
    dataLabelRendering: js.Function1[/* e */ DataLabelRenderingEventArgs, scala.Unit] = null,
    dataLabelSettings: DataLabelSettings = null,
    dataSource: js.Any = null,
    doubleClick: js.Function1[/* e */ DoubleClickEventArgs, scala.Unit] = null,
    drillDownBack: js.Function1[/* e */ DrillDownBackEventArgs, scala.Unit] = null,
    drillDownClick: js.Function1[/* e */ DrillDownClickEventArgs, scala.Unit] = null,
    drillDownReset: js.Function1[/* e */ DrillDownResetEventArgs, scala.Unit] = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    endAngle: scala.Int | scala.Double = null,
    highlightSettings: HighlightSettings = null,
    innerRadius: scala.Int | scala.Double = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    legend: Legend = null,
    levels: js.Array[Level] = null,
    load: js.Function1[/* e */ LoadEventArgs, scala.Unit] = null,
    loaded: js.Function1[/* e */ LoadedEventArgs, scala.Unit] = null,
    margin: Margin = null,
    opacity: scala.Int | scala.Double = null,
    palette: java.lang.String = null,
    parentNode: java.lang.String = null,
    pointRegionClick: js.Function1[/* e */ PointRegionClickEventArgs, scala.Unit] = null,
    pointRegionMouseMove: js.Function1[/* e */ PointRegionMouseMoveEventArgs, scala.Unit] = null,
    points: Points = null,
    preRender: js.Function1[/* e */ PreRenderEventArgs, scala.Unit] = null,
    radius: scala.Int | scala.Double = null,
    rightClick: js.Function1[/* e */ RightClickEventArgs, scala.Unit] = null,
    segmentBorder: SegmentBorder = null,
    segmentRendering: js.Function1[/* e */ SegmentRenderingEventArgs, scala.Unit] = null,
    selectionSettings: SelectionSettings = null,
    size: Size = null,
    startAngle: scala.Int | scala.Double = null,
    theme: ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstTheme | java.lang.String = null,
    title: Title = null,
    titleRendering: js.Function1[/* e */ TitleRenderingEventArgs, scala.Unit] = null,
    tooltip: Tooltip = null,
    tooltipInitialize: js.Function1[/* e */ TooltipInitializeEventArgs, scala.Unit] = null,
    valueMemberPath: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    xName: java.lang.String = null,
    yName: java.lang.String = null,
    zoomSettings: ZoomSettings = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Click != null) __obj.updateDynamic("Click")(Click)
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (dataLabelRendering != null) __obj.updateDynamic("dataLabelRendering")(dataLabelRendering)
    if (dataLabelSettings != null) __obj.updateDynamic("dataLabelSettings")(dataLabelSettings)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(doubleClick)
    if (drillDownBack != null) __obj.updateDynamic("drillDownBack")(drillDownBack)
    if (drillDownClick != null) __obj.updateDynamic("drillDownClick")(drillDownClick)
    if (drillDownReset != null) __obj.updateDynamic("drillDownReset")(drillDownReset)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (highlightSettings != null) __obj.updateDynamic("highlightSettings")(highlightSettings)
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (levels != null) __obj.updateDynamic("levels")(levels)
    if (load != null) __obj.updateDynamic("load")(load)
    if (loaded != null) __obj.updateDynamic("loaded")(loaded)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette)
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode)
    if (pointRegionClick != null) __obj.updateDynamic("pointRegionClick")(pointRegionClick)
    if (pointRegionMouseMove != null) __obj.updateDynamic("pointRegionMouseMove")(pointRegionMouseMove)
    if (points != null) __obj.updateDynamic("points")(points)
    if (preRender != null) __obj.updateDynamic("preRender")(preRender)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (rightClick != null) __obj.updateDynamic("rightClick")(rightClick)
    if (segmentBorder != null) __obj.updateDynamic("segmentBorder")(segmentBorder)
    if (segmentRendering != null) __obj.updateDynamic("segmentRendering")(segmentRendering)
    if (selectionSettings != null) __obj.updateDynamic("selectionSettings")(selectionSettings)
    if (size != null) __obj.updateDynamic("size")(size)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleRendering != null) __obj.updateDynamic("titleRendering")(titleRendering)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipInitialize != null) __obj.updateDynamic("tooltipInitialize")(tooltipInitialize)
    if (valueMemberPath != null) __obj.updateDynamic("valueMemberPath")(valueMemberPath)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (xName != null) __obj.updateDynamic("xName")(xName)
    if (yName != null) __obj.updateDynamic("yName")(yName)
    if (zoomSettings != null) __obj.updateDynamic("zoomSettings")(zoomSettings)
    __obj.asInstanceOf[Model]
  }
}

