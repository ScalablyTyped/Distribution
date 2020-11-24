package typings.ejWebAll.ej.Slider_

import typings.ejWebAll.ej.Orientation
import typings.ejWebAll.ej.slider.sliderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Specifies the allowMouseWheel of the slider.
    * @Default {false}
    */
  var allowMouseWheel: js.UndefOr[Boolean] = js.native
  
  /** Specifies the animationSpeed of the slider.
    * @Default {500}
    */
  var animationSpeed: js.UndefOr[Double] = js.native
  
  /** Fires once Slider control value is changed successfully.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  
  /** Fires once Slider control has been created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Specify the CSS class to slider to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Fires when Slider control has been destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** Specifies the animation behavior of the slider.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  
  /** Specify the enablePersistence to slider to save current model value to browser cookies for state maintains
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  
  /** Specifies the Right to Left Direction of the slider.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** Specifies the state of the slider.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Specifies the height of the slider.
    * @Default {14}
    */
  var height: js.UndefOr[String] = js.native
  
  /** Specifies the HTML Attributes of the ejSlider.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  
  /** Specifies the incremental step value of the slider.
    * @Default {1}
    */
  var incrementStep: js.UndefOr[Double] = js.native
  
  /** Specifies the distance between two major (large) ticks from the scale of the slider.
    * @Default {10}
    */
  var largeStep: js.UndefOr[Double] = js.native
  
  /** Specifies the ending value of the slider.
    * @Default {100}
    */
  var maxValue: js.UndefOr[Double] = js.native
  
  /** Specifies the starting value of the slider.
    * @Default {0}
    */
  var minValue: js.UndefOr[Double] = js.native
  
  /** Specifies the orientation of the slider.
    * @Default {ej.orientation.Horizontal}
    */
  var orientation: js.UndefOr[Orientation | String] = js.native
  
  /** Specifies the readOnly of the slider.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /** Fires before creating each slider scale tick. You can use this event to add custom text in tick values.
    */
  var renderingTicks: js.UndefOr[js.Function1[/* e */ RenderingTicksEventArgs, Unit]] = js.native
  
  /** Shows/Hides the increment and decrement buttons of the slider.
    * @Default {false}
    */
  var showButtons: js.UndefOr[Boolean] = js.native
  
  /** Specifies the rounded corner behavior for slider.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  
  /** Shows/Hide the major (large) and minor (small) ticks in the scale of the slider.
    * @Default {false}
    */
  var showScale: js.UndefOr[Boolean] = js.native
  
  /** Specifies the small ticks from the scale of the slider.
    * @Default {true}
    */
  var showSmallTicks: js.UndefOr[Boolean] = js.native
  
  /** Specifies the showTooltip to shows the current Slider value, while moving the Slider handle or clicking on the slider handle of the slider.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  
  /** Fires once Slider control is sliding successfully.
    */
  var slide: js.UndefOr[js.Function1[/* e */ SlideEventArgs, Unit]] = js.native
  
  /** Specifies the sliderType of the slider.
    * @Default {ej.SliderType.Default}
    */
  var sliderType: js.UndefOr[typings.ejWebAll.ej.slider.sliderType | String] = js.native
  
  /** Specifies the distance between two minor (small) ticks from the scale of the slider.
    * @Default {1}
    */
  var smallStep: js.UndefOr[Double] = js.native
  
  /** Fires once Slider control is started successfully.
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.native
  
  /** Fires when Slider control is stopped successfully.
    */
  var stop: js.UndefOr[js.Function1[/* e */ StopEventArgs, Unit]] = js.native
  
  /** Fires when display the custom tooltip.
    */
  var tooltipChange: js.UndefOr[js.Function1[/* e */ TooltipChangeEventArgs, Unit]] = js.native
  
  /** Specifies the value of the slider. But it's not applicable for range slider. To range slider we can use values property.
    * @Default {0}
    */
  var value: js.UndefOr[Double] = js.native
  
  /** Specifies the values of the range slider. But it's not applicable for default and minRange sliders. we can use value property for default and minRange sliders.
    * @Default {[minValue,maxValue]}
    */
  var values: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the width of the slider.
    * @Default {100%}
    */
  var width: js.UndefOr[String] = js.native
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
    def setAllowMouseWheel(value: Boolean): Self = this.set("allowMouseWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMouseWheel: Self = this.set("allowMouseWheel", js.undefined)
    
    @scala.inline
    def setAnimationSpeed(value: Double): Self = this.set("animationSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationSpeed: Self = this.set("animationSpeed", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    
    @scala.inline
    def setIncrementStep(value: Double): Self = this.set("incrementStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementStep: Self = this.set("incrementStep", js.undefined)
    
    @scala.inline
    def setLargeStep(value: Double): Self = this.set("largeStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeStep: Self = this.set("largeStep", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setOrientation(value: Orientation | String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRenderingTicks(value: /* e */ RenderingTicksEventArgs => Unit): Self = this.set("renderingTicks", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderingTicks: Self = this.set("renderingTicks", js.undefined)
    
    @scala.inline
    def setShowButtons(value: Boolean): Self = this.set("showButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowButtons: Self = this.set("showButtons", js.undefined)
    
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    
    @scala.inline
    def setShowScale(value: Boolean): Self = this.set("showScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowScale: Self = this.set("showScale", js.undefined)
    
    @scala.inline
    def setShowSmallTicks(value: Boolean): Self = this.set("showSmallTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSmallTicks: Self = this.set("showSmallTicks", js.undefined)
    
    @scala.inline
    def setShowTooltip(value: Boolean): Self = this.set("showTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTooltip: Self = this.set("showTooltip", js.undefined)
    
    @scala.inline
    def setSlide(value: /* e */ SlideEventArgs => Unit): Self = this.set("slide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSlide: Self = this.set("slide", js.undefined)
    
    @scala.inline
    def setSliderType(value: sliderType | String): Self = this.set("sliderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSliderType: Self = this.set("sliderType", js.undefined)
    
    @scala.inline
    def setSmallStep(value: Double): Self = this.set("smallStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallStep: Self = this.set("smallStep", js.undefined)
    
    @scala.inline
    def setStart(value: /* e */ StartEventArgs => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStop(value: /* e */ StopEventArgs => Unit): Self = this.set("stop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    
    @scala.inline
    def setTooltipChange(value: /* e */ TooltipChangeEventArgs => Unit): Self = this.set("tooltipChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTooltipChange: Self = this.set("tooltipChange", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
