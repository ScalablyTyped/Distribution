package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Specifies animationSpeed of circular gauge
    * @Default {500}
    */
  var animationSpeed: js.UndefOr[Double] = js.native
  
  /** Specifies the background color of circular gauge.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** Specify distanceFromCorner value of circular gauge
    * @Default {center}
    */
  var distanceFromCorner: js.UndefOr[Double] = js.native
  
  /** Fires, on double clicking the circular gauge.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  
  /** Triggers while the custom labels are being drawn on the gauge.
    */
  var drawCustomLabel: js.UndefOr[js.Function1[/* e */ DrawCustomLabelEventArgs, Unit]] = js.native
  
  /** Triggers while the indicators are being started to drawn on the gauge.
    */
  var drawIndicators: js.UndefOr[js.Function1[/* e */ DrawIndicatorsEventArgs, Unit]] = js.native
  
  /** Triggers while the labels are being drawn on the gauge.
    */
  var drawLabels: js.UndefOr[js.Function1[/* e */ DrawLabelsEventArgs, Unit]] = js.native
  
  /** Triggers while the pointer cap is being drawn on the gauge.
    */
  var drawPointerCap: js.UndefOr[js.Function1[/* e */ DrawPointerCapEventArgs, Unit]] = js.native
  
  /** Triggers while the pointers are being drawn on the gauge.
    */
  var drawPointers: js.UndefOr[js.Function1[/* e */ DrawPointersEventArgs, Unit]] = js.native
  
  /** Triggers when the ranges begin to be getting drawn on the gauge.
    */
  var drawRange: js.UndefOr[js.Function1[/* e */ DrawRangeEventArgs, Unit]] = js.native
  
  /** Triggers while the ticks are being drawn on the gauge.
    */
  var drawTicks: js.UndefOr[js.Function1[/* e */ DrawTicksEventArgs, Unit]] = js.native
  
  /** Specify animate value of circular gauge
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  
  /** Specify to convert the  date object to  string, using locale settings.
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[Boolean] = js.native
  
  /** Controls whether circular gauge has to be responsive while resizing.
    * @Default {false}
    */
  var enableResize: js.UndefOr[Boolean] = js.native
  
  /** This provides options for customizing export settings
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.native
  
  /** Specify the frame of circular gauge
    * @Default {Object}
    */
  var frame: js.UndefOr[Frame] = js.native
  
  /** Specify gaugePosition value of circular gauge See GaugePosition
    * @Default {center}
    */
  var gaugePosition: js.UndefOr[typings.ejWebAll.ej.datavisualization.CircularGauge.gaugePosition | String] = js.native
  
  /** Specifies the height of circular gauge.
    * @Default {360}
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Specifies the interiorGradient of circular gauge.
    * @Default {null}
    */
  var interiorGradient: js.UndefOr[js.Any] = js.native
  
  /** Specify isRadialGradient value of circular gauge
    * @Default {false}
    */
  var isRadialGradient: js.UndefOr[Boolean] = js.native
  
  /** Specify isResponsive value of circular gauge
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  
  /** Options to customize the legend.
    */
  var legend: js.UndefOr[Legend] = js.native
  
  /** Fires on clicking the legend item.
    */
  var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, Unit]] = js.native
  
  /** Fires before rendering the legend item. This event is fired for each legend item in CircularGauge. You can use this event to customize legend item shape or add custom text to
    * legend item.
    */
  var legendItemRender: js.UndefOr[js.Function1[/* e */ LegendItemRenderEventArgs, Unit]] = js.native
  
  /** Triggers while the gauge start to Load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  
  /** Name of the culture based on which circular gauge should be localized.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Specifies the maximum value of circular gauge.
    * @Default {100}
    */
  var maximum: js.UndefOr[Double] = js.native
  
  /** Specifies the minimum value of circular gauge.
    * @Default {0}
    */
  var minimum: js.UndefOr[Double] = js.native
  
  /** Triggers when the left mouse button is clicked.
    */
  var mouseClick: js.UndefOr[js.Function1[/* e */ MouseClickEventArgs, Unit]] = js.native
  
  /** Triggers when clicking and dragging the mouse pointer over the gauge pointer.
    */
  var mouseClickMove: js.UndefOr[js.Function1[/* e */ MouseClickMoveEventArgs, Unit]] = js.native
  
  /** Triggers when the mouse click is released.
    */
  var mouseClickUp: js.UndefOr[js.Function1[/* e */ MouseClickUpEventArgs, Unit]] = js.native
  
  /** Specify outerCustomLabelPosition value of circular gauge See
    * @Default {bottom}
    */
  var outerCustomLabelPosition: js.UndefOr[OuterCustomLabelPosition | String] = js.native
  
  /** Specifies the radius of circular gauge.
    * @Default {180}
    */
  var radius: js.UndefOr[Double] = js.native
  
  /** Fires when mouse moving on ranges.
    */
  var rangeMouseMove: js.UndefOr[js.Function1[/* e */ RangeMouseMoveEventArgs, Unit]] = js.native
  
  /** Specify range Z-order placement of circular gauge.
    * @Default {Rear}
    */
  var rangeZOrder: js.UndefOr[RangeZOrderPlacement | String] = js.native
  
  /** Specify readonly value of circular gauge
    * @Default {true}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /** Triggers when the rendering of the gauge is completed.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.native
  
  /** Fires, on right clicking the circular gauge.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  
  /** Specify the pointers, ticks, labels, indicators, ranges of circular gauge
    * @Default {null}
    */
  var scales: js.UndefOr[js.Array[Scale]] = js.native
  
  /** Specify the theme of circular gauge.
    * @Default {flatlight}
    */
  var theme: js.UndefOr[String] = js.native
  
  /** Specify tooltip option of circular gauge
    * @Default {object}
    */
  var tooltip: js.UndefOr[Tooltip] = js.native
  
  /** Specifies the value of circular gauge.
    * @Default {0}
    */
  var value: js.UndefOr[Double] = js.native
  
  /** Specifies the width of circular gauge.
    * @Default {360}
    */
  var width: js.UndefOr[Double] = js.native
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
    def setAnimationSpeed(value: Double): Self = this.set("animationSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationSpeed: Self = this.set("animationSpeed", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setDistanceFromCorner(value: Double): Self = this.set("distanceFromCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceFromCorner: Self = this.set("distanceFromCorner", js.undefined)
    
    @scala.inline
    def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = this.set("doubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDoubleClick: Self = this.set("doubleClick", js.undefined)
    
    @scala.inline
    def setDrawCustomLabel(value: /* e */ DrawCustomLabelEventArgs => Unit): Self = this.set("drawCustomLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawCustomLabel: Self = this.set("drawCustomLabel", js.undefined)
    
    @scala.inline
    def setDrawIndicators(value: /* e */ DrawIndicatorsEventArgs => Unit): Self = this.set("drawIndicators", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawIndicators: Self = this.set("drawIndicators", js.undefined)
    
    @scala.inline
    def setDrawLabels(value: /* e */ DrawLabelsEventArgs => Unit): Self = this.set("drawLabels", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawLabels: Self = this.set("drawLabels", js.undefined)
    
    @scala.inline
    def setDrawPointerCap(value: /* e */ DrawPointerCapEventArgs => Unit): Self = this.set("drawPointerCap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawPointerCap: Self = this.set("drawPointerCap", js.undefined)
    
    @scala.inline
    def setDrawPointers(value: /* e */ DrawPointersEventArgs => Unit): Self = this.set("drawPointers", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawPointers: Self = this.set("drawPointers", js.undefined)
    
    @scala.inline
    def setDrawRange(value: /* e */ DrawRangeEventArgs => Unit): Self = this.set("drawRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawRange: Self = this.set("drawRange", js.undefined)
    
    @scala.inline
    def setDrawTicks(value: /* e */ DrawTicksEventArgs => Unit): Self = this.set("drawTicks", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawTicks: Self = this.set("drawTicks", js.undefined)
    
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    
    @scala.inline
    def setEnableGroupSeparator(value: Boolean): Self = this.set("enableGroupSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGroupSeparator: Self = this.set("enableGroupSeparator", js.undefined)
    
    @scala.inline
    def setEnableResize(value: Boolean): Self = this.set("enableResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableResize: Self = this.set("enableResize", js.undefined)
    
    @scala.inline
    def setExportSettings(value: ExportSettings): Self = this.set("exportSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportSettings: Self = this.set("exportSettings", js.undefined)
    
    @scala.inline
    def setFrame(value: Frame): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    
    @scala.inline
    def setGaugePosition(value: gaugePosition | String): Self = this.set("gaugePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGaugePosition: Self = this.set("gaugePosition", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setInteriorGradient(value: js.Any): Self = this.set("interiorGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteriorGradient: Self = this.set("interiorGradient", js.undefined)
    
    @scala.inline
    def setIsRadialGradient(value: Boolean): Self = this.set("isRadialGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRadialGradient: Self = this.set("isRadialGradient", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setLegend(value: Legend): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setLegendItemClick(value: /* e */ LegendItemClickEventArgs => Unit): Self = this.set("legendItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLegendItemClick: Self = this.set("legendItemClick", js.undefined)
    
    @scala.inline
    def setLegendItemRender(value: /* e */ LegendItemRenderEventArgs => Unit): Self = this.set("legendItemRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLegendItemRender: Self = this.set("legendItemRender", js.undefined)
    
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    
    @scala.inline
    def setMouseClick(value: /* e */ MouseClickEventArgs => Unit): Self = this.set("mouseClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseClick: Self = this.set("mouseClick", js.undefined)
    
    @scala.inline
    def setMouseClickMove(value: /* e */ MouseClickMoveEventArgs => Unit): Self = this.set("mouseClickMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseClickMove: Self = this.set("mouseClickMove", js.undefined)
    
    @scala.inline
    def setMouseClickUp(value: /* e */ MouseClickUpEventArgs => Unit): Self = this.set("mouseClickUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseClickUp: Self = this.set("mouseClickUp", js.undefined)
    
    @scala.inline
    def setOuterCustomLabelPosition(value: OuterCustomLabelPosition | String): Self = this.set("outerCustomLabelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterCustomLabelPosition: Self = this.set("outerCustomLabelPosition", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRangeMouseMove(value: /* e */ RangeMouseMoveEventArgs => Unit): Self = this.set("rangeMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRangeMouseMove: Self = this.set("rangeMouseMove", js.undefined)
    
    @scala.inline
    def setRangeZOrder(value: RangeZOrderPlacement | String): Self = this.set("rangeZOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeZOrder: Self = this.set("rangeZOrder", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRenderComplete(value: /* e */ RenderCompleteEventArgs => Unit): Self = this.set("renderComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderComplete: Self = this.set("renderComplete", js.undefined)
    
    @scala.inline
    def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = this.set("rightClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRightClick: Self = this.set("rightClick", js.undefined)
    
    @scala.inline
    def setScalesVarargs(value: Scale*): Self = this.set("scales", js.Array(value :_*))
    
    @scala.inline
    def setScales(value: js.Array[Scale]): Self = this.set("scales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScales: Self = this.set("scales", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTooltip(value: Tooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
