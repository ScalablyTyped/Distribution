package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Specifies the animationSpeed
    * @Default {500}
    */
  var animationSpeed: js.UndefOr[Double] = js.native
  
  /** Specifies the backgroundColor for Linear gauge.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** Specifies the borderColor for Linear gauge.
    * @Default {null}
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /** Fires, on double clicking the gauge.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  
  /** Triggers while the bar pointer are being drawn on the gauge.
    */
  var drawBarPointers: js.UndefOr[js.Function1[/* e */ DrawBarPointersEventArgs, Unit]] = js.native
  
  /** Triggers while the customLabel are being drawn on the gauge.
    */
  var drawCustomLabel: js.UndefOr[js.Function1[/* e */ DrawCustomLabelEventArgs, Unit]] = js.native
  
  /** Triggers while the Indicator are being drawn on the gauge.
    */
  var drawIndicators: js.UndefOr[js.Function1[/* e */ DrawIndicatorsEventArgs, Unit]] = js.native
  
  /** Triggers while the label are being drawn on the gauge.
    */
  var drawLabels: js.UndefOr[js.Function1[/* e */ DrawLabelsEventArgs, Unit]] = js.native
  
  /** Triggers while the marker are being drawn on the gauge.
    */
  var drawMarkerPointers: js.UndefOr[js.Function1[/* e */ DrawMarkerPointersEventArgs, Unit]] = js.native
  
  /** Triggers while the range are being drawn on the gauge.
    */
  var drawRange: js.UndefOr[js.Function1[/* e */ DrawRangeEventArgs, Unit]] = js.native
  
  /** Triggers while the ticks are being drawn on the gauge.
    */
  var drawTicks: js.UndefOr[js.Function1[/* e */ DrawTicksEventArgs, Unit]] = js.native
  
  /** Specifies the animate state
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  
  /** Used to Convert the date object to  string while using the  locale settings
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[Boolean] = js.native
  
  /** Specifies the animate state for marker pointer
    * @Default {true}
    */
  var enableMarkerPointerAnimation: js.UndefOr[Boolean] = js.native
  
  /** Responsiveness of the linear gauge is controlled
    * @Default {false}
    */
  var enableResize: js.UndefOr[Boolean] = js.native
  
  /** This provides options for customizing export settings
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.native
  
  /** Specify frame of linear gauge
    * @Default {null}
    */
  var frame: js.UndefOr[Frame] = js.native
  
  /** Specifies the height of Linear gauge.
    * @Default {400}
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Triggers when the gauge is initialized.
    */
  var init: js.UndefOr[js.Function1[/* e */ InitEventArgs, Unit]] = js.native
  
  /** Specifies the can resize state.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  
  /** Specifies the labelColor for Linear gauge.
    * @Default {null}
    */
  var labelColor: js.UndefOr[String] = js.native
  
  /** Triggers while the gauge start to Load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  
  /** Set the  localization culture  for the Linear gauge
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Specifies the maximum value of Linear gauge.
    * @Default {100}
    */
  var maximum: js.UndefOr[Double] = js.native
  
  /** Specifies the minimum value of Linear gauge.
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
  
  /** Specifies the orientation for Linear gauge.
    * @Default {Vertical}
    */
  var orientation: js.UndefOr[String] = js.native
  
  /** Specify labelPosition value of Linear gauge See
    * @Default {bottom}
    */
  var outerCustomLabelPosition: js.UndefOr[OuterCustomLabelPosition | String] = js.native
  
  /** Specifies the pointerGradient1 for Linear gauge.
    * @Default {null}
    */
  var pointerGradient1: js.UndefOr[js.Any] = js.native
  
  /** Specifies the pointerGradient2 for Linear gauge.
    * @Default {null}
    */
  var pointerGradient2: js.UndefOr[js.Any] = js.native
  
  /** Specifies the read only state.
    * @Default {true}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /** Triggers while the rendering of the gauge completed.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.native
  
  /** Fires, on right clicking the gauge.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  
  /** Specifies the scales
    * @Default {null}
    */
  var scales: js.UndefOr[js.Array[Scale]] = js.native
  
  /** Specifies the theme for Linear gauge. See LinearGauge.Themes
    * @Default {flatlight}
    */
  var theme: js.UndefOr[Themes | String] = js.native
  
  /** Specifies the tick Color for Linear gauge.
    * @Default {null}
    */
  var tickColor: js.UndefOr[String] = js.native
  
  /** Specify tooltip options of linear gauge
    * @Default {false}
    */
  var tooltip: js.UndefOr[Tooltip] = js.native
  
  /** Specifies the value of the Gauge.
    * @Default {0}
    */
  var value: js.UndefOr[Double] = js.native
  
  /** Specifies the width of Linear gauge.
    * @Default {150}
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = this.set("doubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDoubleClick: Self = this.set("doubleClick", js.undefined)
    
    @scala.inline
    def setDrawBarPointers(value: /* e */ DrawBarPointersEventArgs => Unit): Self = this.set("drawBarPointers", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawBarPointers: Self = this.set("drawBarPointers", js.undefined)
    
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
    def setDrawMarkerPointers(value: /* e */ DrawMarkerPointersEventArgs => Unit): Self = this.set("drawMarkerPointers", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawMarkerPointers: Self = this.set("drawMarkerPointers", js.undefined)
    
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
    def setEnableMarkerPointerAnimation(value: Boolean): Self = this.set("enableMarkerPointerAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMarkerPointerAnimation: Self = this.set("enableMarkerPointerAnimation", js.undefined)
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setInit(value: /* e */ InitEventArgs => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setLabelColor(value: String): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    
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
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setOuterCustomLabelPosition(value: OuterCustomLabelPosition | String): Self = this.set("outerCustomLabelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterCustomLabelPosition: Self = this.set("outerCustomLabelPosition", js.undefined)
    
    @scala.inline
    def setPointerGradient1(value: js.Any): Self = this.set("pointerGradient1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerGradient1: Self = this.set("pointerGradient1", js.undefined)
    
    @scala.inline
    def setPointerGradient2(value: js.Any): Self = this.set("pointerGradient2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerGradient2: Self = this.set("pointerGradient2", js.undefined)
    
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
    def setTheme(value: Themes | String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTickColor(value: String): Self = this.set("tickColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickColor: Self = this.set("tickColor", js.undefined)
    
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
