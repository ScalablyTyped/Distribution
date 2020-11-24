package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Fires, on clicking the bullet graph.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  
  /** Toggles the visibility of the range stroke color of the labels.
    * @Default {false}
    */
  var applyRangeStrokeToLabels: js.UndefOr[Boolean] = js.native
  
  /** Toggles the visibility of the range stroke color of the ticks.
    * @Default {false}
    */
  var applyRangeStrokeToTicks: js.UndefOr[Boolean] = js.native
  
  /** Contains property to customize the caption in bullet graph.
    */
  var captionSettings: js.UndefOr[CaptionSettings] = js.native
  
  /** Comparative measure bar in bullet graph render till the specified value.
    * @Default {0}
    */
  var comparativeMeasureValue: js.UndefOr[Double] = js.native
  
  /** Fires, on double clicking the bullet graph.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  
  /** Fires on rendering the caption of bullet graph.
    */
  var drawCaption: js.UndefOr[js.Function1[/* e */ DrawCaptionEventArgs, Unit]] = js.native
  
  /** Fires on rendering the category.
    */
  var drawCategory: js.UndefOr[js.Function1[/* e */ DrawCategoryEventArgs, Unit]] = js.native
  
  /** Fires on rendering the comparative measure symbol.
    */
  var drawComparativeMeasureSymbol: js.UndefOr[js.Function1[/* e */ DrawComparativeMeasureSymbolEventArgs, Unit]] = js.native
  
  /** Fires on rendering the feature measure bar.
    */
  var drawFeatureMeasureBar: js.UndefOr[js.Function1[/* e */ DrawFeatureMeasureBarEventArgs, Unit]] = js.native
  
  /** Fires on rendering the indicator of bullet graph.
    */
  var drawIndicator: js.UndefOr[js.Function1[/* e */ DrawIndicatorEventArgs, Unit]] = js.native
  
  /** Fires on rendering the labels.
    */
  var drawLabels: js.UndefOr[js.Function1[/* e */ DrawLabelsEventArgs, Unit]] = js.native
  
  /** Fires on rendering the qualitative ranges.
    */
  var drawQualitativeRanges: js.UndefOr[js.Function1[/* e */ DrawQualitativeRangesEventArgs, Unit]] = js.native
  
  /** Fires on rendering the ticks.
    */
  var drawTicks: js.UndefOr[js.Function1[/* e */ DrawTicksEventArgs, Unit]] = js.native
  
  /** Toggles the animation of bullet graph.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  
  /** Specifies to convert the date object to string, using locale settings.
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[Boolean] = js.native
  
  /** Controls whether bullet graph has to be responsive while resizing.
    * @Default {true}
    */
  var enableResizing: js.UndefOr[Boolean] = js.native
  
  /** Specifies the direction of flow in bullet graph. Neither it may be backward nor forward.
    * @Default {forward}
    */
  var flowDirection: js.UndefOr[FlowDirection | String] = js.native
  
  /** Specifies the height of the bullet graph.
    * @Default {90}
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Sets a value whether to make the bullet graph responsive on resize.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  
  /** Fires on loading bullet graph.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  
  /** Name of the culture based on which bulletgraph should be localized.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Bullet graph will render in the specified orientation.
    * @Default {horizontal}
    */
  var orientation: js.UndefOr[Orientation | String] = js.native
  
  /** Size of the qualitative range depends up on the specified value.
    * @Default {32}
    */
  var qualitativeRangeSize: js.UndefOr[Double] = js.native
  
  /** Contains property to customize the qualitative ranges.
    */
  var qualitativeRanges: js.UndefOr[js.Array[QualitativeRange]] = js.native
  
  /** Length of the quantitative range depends up on the specified value.
    * @Default {475}
    */
  var quantitativeScaleLength: js.UndefOr[Double] = js.native
  
  /** Contains all the properties to customize quantitative scale.
    */
  var quantitativeScaleSettings: js.UndefOr[QuantitativeScaleSettings] = js.native
  
  /** Fires, on right clicking the bullet graph.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  
  /** By specifying this property the user can change the theme of the bullet graph.
    * @Default {flatlight}
    */
  var theme: js.UndefOr[String] = js.native
  
  /** Contains all the properties to customize tooltip.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.native
  
  /** Feature measure bar in bullet graph render till the specified value.
    * @Default {0}
    */
  var value: js.UndefOr[Double] = js.native
  
  /** Specifies the width of the bullet graph.
    * @Default {595}
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
    def setClick(value: /* e */ ClickEventArgs => Unit): Self = this.set("Click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("Click", js.undefined)
    
    @scala.inline
    def setApplyRangeStrokeToLabels(value: Boolean): Self = this.set("applyRangeStrokeToLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyRangeStrokeToLabels: Self = this.set("applyRangeStrokeToLabels", js.undefined)
    
    @scala.inline
    def setApplyRangeStrokeToTicks(value: Boolean): Self = this.set("applyRangeStrokeToTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyRangeStrokeToTicks: Self = this.set("applyRangeStrokeToTicks", js.undefined)
    
    @scala.inline
    def setCaptionSettings(value: CaptionSettings): Self = this.set("captionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionSettings: Self = this.set("captionSettings", js.undefined)
    
    @scala.inline
    def setComparativeMeasureValue(value: Double): Self = this.set("comparativeMeasureValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparativeMeasureValue: Self = this.set("comparativeMeasureValue", js.undefined)
    
    @scala.inline
    def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = this.set("doubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDoubleClick: Self = this.set("doubleClick", js.undefined)
    
    @scala.inline
    def setDrawCaption(value: /* e */ DrawCaptionEventArgs => Unit): Self = this.set("drawCaption", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawCaption: Self = this.set("drawCaption", js.undefined)
    
    @scala.inline
    def setDrawCategory(value: /* e */ DrawCategoryEventArgs => Unit): Self = this.set("drawCategory", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawCategory: Self = this.set("drawCategory", js.undefined)
    
    @scala.inline
    def setDrawComparativeMeasureSymbol(value: /* e */ DrawComparativeMeasureSymbolEventArgs => Unit): Self = this.set("drawComparativeMeasureSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawComparativeMeasureSymbol: Self = this.set("drawComparativeMeasureSymbol", js.undefined)
    
    @scala.inline
    def setDrawFeatureMeasureBar(value: /* e */ DrawFeatureMeasureBarEventArgs => Unit): Self = this.set("drawFeatureMeasureBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawFeatureMeasureBar: Self = this.set("drawFeatureMeasureBar", js.undefined)
    
    @scala.inline
    def setDrawIndicator(value: /* e */ DrawIndicatorEventArgs => Unit): Self = this.set("drawIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawIndicator: Self = this.set("drawIndicator", js.undefined)
    
    @scala.inline
    def setDrawLabels(value: /* e */ DrawLabelsEventArgs => Unit): Self = this.set("drawLabels", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawLabels: Self = this.set("drawLabels", js.undefined)
    
    @scala.inline
    def setDrawQualitativeRanges(value: /* e */ DrawQualitativeRangesEventArgs => Unit): Self = this.set("drawQualitativeRanges", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawQualitativeRanges: Self = this.set("drawQualitativeRanges", js.undefined)
    
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
    def setEnableResizing(value: Boolean): Self = this.set("enableResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableResizing: Self = this.set("enableResizing", js.undefined)
    
    @scala.inline
    def setFlowDirection(value: FlowDirection | String): Self = this.set("flowDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowDirection: Self = this.set("flowDirection", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setOrientation(value: Orientation | String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setQualitativeRangeSize(value: Double): Self = this.set("qualitativeRangeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualitativeRangeSize: Self = this.set("qualitativeRangeSize", js.undefined)
    
    @scala.inline
    def setQualitativeRangesVarargs(value: QualitativeRange*): Self = this.set("qualitativeRanges", js.Array(value :_*))
    
    @scala.inline
    def setQualitativeRanges(value: js.Array[QualitativeRange]): Self = this.set("qualitativeRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualitativeRanges: Self = this.set("qualitativeRanges", js.undefined)
    
    @scala.inline
    def setQuantitativeScaleLength(value: Double): Self = this.set("quantitativeScaleLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantitativeScaleLength: Self = this.set("quantitativeScaleLength", js.undefined)
    
    @scala.inline
    def setQuantitativeScaleSettings(value: QuantitativeScaleSettings): Self = this.set("quantitativeScaleSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantitativeScaleSettings: Self = this.set("quantitativeScaleSettings", js.undefined)
    
    @scala.inline
    def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = this.set("rightClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRightClick: Self = this.set("rightClick", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTooltipSettings(value: TooltipSettings): Self = this.set("tooltipSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipSettings: Self = this.set("tooltipSettings", js.undefined)
    
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
