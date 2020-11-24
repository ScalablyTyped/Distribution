package typings.ejWebAll.ej.SunburstChart

import typings.ejWebAll.ej.datavisualization.Sunburst.Animation
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Fires, on clicking the sunburst chart.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  
  /** Animation type of sunburst
    * @Default {rotation. See Alignment}
    */
  var animationType: js.UndefOr[Animation | String] = js.native
  
  /** Background color of the plot area.
    * @Default {null}
    */
  var background: js.UndefOr[String] = js.native
  
  /** Options for customizing the sunburst border.
    */
  var border: js.UndefOr[Border] = js.native
  
  /** Fires before rendering the datalabel
    */
  var dataLabelRendering: js.UndefOr[js.Function1[/* e */ DataLabelRenderingEventArgs, Unit]] = js.native
  
  /** Options to customize the Sunburst dataLabel.
    */
  var dataLabelSettings: js.UndefOr[DataLabelSettings] = js.native
  
  /** Specifies the dataSource to the sunburst.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /** Fires, on double clicking the sunburst chart.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  
  /** Fires when resetting drilldown points.
    */
  var drillDownBack: js.UndefOr[js.Function1[/* e */ DrillDownBackEventArgs, Unit]] = js.native
  
  /** Fires when clicking the point to perform drilldown.
    */
  var drillDownClick: js.UndefOr[js.Function1[/* e */ DrillDownClickEventArgs, Unit]] = js.native
  
  /** Fires after resetting the sunburst points
    */
  var drillDownReset: js.UndefOr[js.Function1[/* e */ DrillDownResetEventArgs, Unit]] = js.native
  
  /** Enable/disable the animation for all the levels.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  
  /** Sunburst rendering will end at the specified value
    * @Default {null}
    */
  var endAngle: js.UndefOr[Double] = js.native
  
  /** Options for customizing the appearance of the levels or point while highlighting.
    */
  var highlightSettings: js.UndefOr[HighlightSettings] = js.native
  
  /** Sunburst inner radius value
    * @Default {0.4}
    */
  var innerRadius: js.UndefOr[Double] = js.native
  
  /** Controls whether sunburst has to be responsive or not.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  
  /** Options to customize the legend items and legend title.
    */
  var legend: js.UndefOr[Legend] = js.native
  
  /** Specify levels of sunburst for grouped visualization of data
    * @Default {[]}
    */
  var levels: js.UndefOr[js.Array[Level]] = js.native
  
  /** Fires before loading.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  
  /** Fires after rendering sunburst.
    */
  var loaded: js.UndefOr[js.Function1[/* e */ LoadedEventArgs, Unit]] = js.native
  
  /** Options to customize the left, right, top and bottom margins of sunburst area.
    */
  var margin: js.UndefOr[Margin] = js.native
  
  /** Opacity of the levels.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Palette color for the data points.
    * @Default {null}
    */
  var palette: js.UndefOr[String] = js.native
  
  /** Parent node of the data points.
    * @Default {null}
    */
  var parentNode: js.UndefOr[String] = js.native
  
  /** Fires after clicking the point in sunburst
    */
  var pointRegionClick: js.UndefOr[js.Function1[/* e */ PointRegionClickEventArgs, Unit]] = js.native
  
  /** Fires while moving the mouse over sunburst points
    */
  var pointRegionMouseMove: js.UndefOr[js.Function1[/* e */ PointRegionMouseMoveEventArgs, Unit]] = js.native
  
  /** Options for customizing sunburst points.
    */
  var points: js.UndefOr[Points] = js.native
  
  /** Fires before rendering sunburst.
    */
  var preRender: js.UndefOr[js.Function1[/* e */ PreRenderEventArgs, Unit]] = js.native
  
  /** Sunburst outer radius value
    * @Default {1}
    */
  var radius: js.UndefOr[Double] = js.native
  
  /** Fires, on right clicking the sunburst chart
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  
  /** Options for customizing the sunburst segment border.
    */
  var segmentBorder: js.UndefOr[SegmentBorder] = js.native
  
  /** Fires before rendering each segment
    */
  var segmentRendering: js.UndefOr[js.Function1[/* e */ SegmentRenderingEventArgs, Unit]] = js.native
  
  /** Options for customizing the appearance of the levels or data point while selection.
    */
  var selectionSettings: js.UndefOr[SelectionSettings] = js.native
  
  /** Options to customize the Sunburst size.
    */
  var size: js.UndefOr[Size] = js.native
  
  /** Sunburst rendering will start from the specified value
    * @Default {null}
    */
  var startAngle: js.UndefOr[Double] = js.native
  
  /** Specifies the theme for Sunburst.
    * @Default {Flatlight. See Theme}
    */
  var theme: js.UndefOr[SunburstTheme | String] = js.native
  
  /** Options for customizing the title and subtitle of sunburst.
    */
  var title: js.UndefOr[Title] = js.native
  
  /** Fires before rendering sunburst title.
    */
  var titleRendering: js.UndefOr[js.Function1[/* e */ TitleRenderingEventArgs, Unit]] = js.native
  
  /** Options to customize the Sunburst tooltip.
    */
  var tooltip: js.UndefOr[Tooltip] = js.native
  
  /** Fires during initialization of tooltip.
    */
  var tooltipInitialize: js.UndefOr[js.Function1[/* e */ TooltipInitializeEventArgs, Unit]] = js.native
  
  /** Bind the data field from the data source.
    * @Default {null}
    */
  var valueMemberPath: js.UndefOr[String] = js.native
  
  /** Controls the visibility of sunburst.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /** Name of the property in the datasource that contains x values.
    * @Default {null}
    */
  var xName: js.UndefOr[String] = js.native
  
  /** Name of the property in the datasource that contains y values.
    * @Default {null}
    */
  var yName: js.UndefOr[String] = js.native
  
  /** Options for enable zooming feature of chart.
    */
  var zoomSettings: js.UndefOr[ZoomSettings] = js.native
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
    def setClick(value: /* e */ ClickEventArgs => Unit): Self = this.set("Click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("Click", js.undefined)
    
    @scala.inline
    def setAnimationType(value: Animation | String): Self = this.set("animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationType: Self = this.set("animationType", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBorder(value: Border): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setDataLabelRendering(value: /* e */ DataLabelRenderingEventArgs => Unit): Self = this.set("dataLabelRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataLabelRendering: Self = this.set("dataLabelRendering", js.undefined)
    
    @scala.inline
    def setDataLabelSettings(value: DataLabelSettings): Self = this.set("dataLabelSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLabelSettings: Self = this.set("dataLabelSettings", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = this.set("doubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDoubleClick: Self = this.set("doubleClick", js.undefined)
    
    @scala.inline
    def setDrillDownBack(value: /* e */ DrillDownBackEventArgs => Unit): Self = this.set("drillDownBack", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrillDownBack: Self = this.set("drillDownBack", js.undefined)
    
    @scala.inline
    def setDrillDownClick(value: /* e */ DrillDownClickEventArgs => Unit): Self = this.set("drillDownClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrillDownClick: Self = this.set("drillDownClick", js.undefined)
    
    @scala.inline
    def setDrillDownReset(value: /* e */ DrillDownResetEventArgs => Unit): Self = this.set("drillDownReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrillDownReset: Self = this.set("drillDownReset", js.undefined)
    
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    
    @scala.inline
    def setHighlightSettings(value: HighlightSettings): Self = this.set("highlightSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightSettings: Self = this.set("highlightSettings", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: Double): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRadius: Self = this.set("innerRadius", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setLegend(value: Legend): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setLevelsVarargs(value: Level*): Self = this.set("levels", js.Array(value :_*))
    
    @scala.inline
    def setLevels(value: js.Array[Level]): Self = this.set("levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLoaded(value: /* e */ LoadedEventArgs => Unit): Self = this.set("loaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    
    @scala.inline
    def setMargin(value: Margin): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPalette(value: String): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    
    @scala.inline
    def setParentNode(value: String): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentNode: Self = this.set("parentNode", js.undefined)
    
    @scala.inline
    def setPointRegionClick(value: /* e */ PointRegionClickEventArgs => Unit): Self = this.set("pointRegionClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePointRegionClick: Self = this.set("pointRegionClick", js.undefined)
    
    @scala.inline
    def setPointRegionMouseMove(value: /* e */ PointRegionMouseMoveEventArgs => Unit): Self = this.set("pointRegionMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePointRegionMouseMove: Self = this.set("pointRegionMouseMove", js.undefined)
    
    @scala.inline
    def setPoints(value: Points): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setPreRender(value: /* e */ PreRenderEventArgs => Unit): Self = this.set("preRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreRender: Self = this.set("preRender", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = this.set("rightClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRightClick: Self = this.set("rightClick", js.undefined)
    
    @scala.inline
    def setSegmentBorder(value: SegmentBorder): Self = this.set("segmentBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentBorder: Self = this.set("segmentBorder", js.undefined)
    
    @scala.inline
    def setSegmentRendering(value: /* e */ SegmentRenderingEventArgs => Unit): Self = this.set("segmentRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSegmentRendering: Self = this.set("segmentRendering", js.undefined)
    
    @scala.inline
    def setSelectionSettings(value: SelectionSettings): Self = this.set("selectionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionSettings: Self = this.set("selectionSettings", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    
    @scala.inline
    def setTheme(value: SunburstTheme | String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTitle(value: Title): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleRendering(value: /* e */ TitleRenderingEventArgs => Unit): Self = this.set("titleRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTitleRendering: Self = this.set("titleRendering", js.undefined)
    
    @scala.inline
    def setTooltip(value: Tooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipInitialize(value: /* e */ TooltipInitializeEventArgs => Unit): Self = this.set("tooltipInitialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTooltipInitialize: Self = this.set("tooltipInitialize", js.undefined)
    
    @scala.inline
    def setValueMemberPath(value: String): Self = this.set("valueMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueMemberPath: Self = this.set("valueMemberPath", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setXName(value: String): Self = this.set("xName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXName: Self = this.set("xName", js.undefined)
    
    @scala.inline
    def setYName(value: String): Self = this.set("yName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYName: Self = this.set("yName", js.undefined)
    
    @scala.inline
    def setZoomSettings(value: ZoomSettings): Self = this.set("zoomSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomSettings: Self = this.set("zoomSettings", js.undefined)
  }
}
