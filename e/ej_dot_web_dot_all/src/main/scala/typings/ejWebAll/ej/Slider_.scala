package typings.ejWebAll.ej

import typings.ejWebAll.ej.slider.sliderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slider_
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** To disable the slider
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** To enable the slider
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** To get value from slider handle
    * @returns {number}
    */
  def getValue(): Double = js.native
  
  @JSName("model")
  var model_Slider_ : Model = js.native
  
  /** To set value to slider handle.By default animation is false while set the value. If you want to enable the animation, pass the enableAnimation as true to this method.
    * @returns {void}
    */
  def setValue(): Unit = js.native
}
object Slider_ {
  
  trait ChangeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns slider id.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** returns true if event triggered by interaction else returns false.
      */
    var isInteraction: js.UndefOr[Boolean] = js.undefined
    
    /** returns the slider model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns current handle number or index
      */
    var sliderIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the slider value.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object ChangeEventArgs {
    
    inline def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    extension [Self <: ChangeEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      inline def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSliderIndex(value: Double): Self = StObject.set(x, "sliderIndex", value.asInstanceOf[js.Any])
      
      inline def setSliderIndexUndefined: Self = StObject.set(x, "sliderIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the slider model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    extension [Self <: CreateEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the slider model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    extension [Self <: DestroyEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Specifies the allowMouseWheel of the slider.
      * @Default {false}
      */
    var allowMouseWheel: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the animationSpeed of the slider.
      * @Default {500}
      */
    var animationSpeed: js.UndefOr[Double] = js.undefined
    
    /** Fires once Slider control value is changed successfully.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Fires once Slider control has been created successfully.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Specify the CSS class to slider to achieve custom theme.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Fires when Slider control has been destroyed successfully.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Specifies the animation behavior of the slider.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Specify the enablePersistence to slider to save current model value to browser cookies for state maintains
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the Right to Left Direction of the slider.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the state of the slider.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the height of the slider.
      * @Default {14}
      */
    var height: js.UndefOr[String] = js.undefined
    
    /** Specifies the HTML Attributes of the ejSlider.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.undefined
    
    /** Specifies the incremental step value of the slider.
      * @Default {1}
      */
    var incrementStep: js.UndefOr[Double] = js.undefined
    
    /** Specifies the distance between two major (large) ticks from the scale of the slider.
      * @Default {10}
      */
    var largeStep: js.UndefOr[Double] = js.undefined
    
    /** Specifies the ending value of the slider.
      * @Default {100}
      */
    var maxValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the starting value of the slider.
      * @Default {0}
      */
    var minValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the orientation of the slider.
      * @Default {ej.orientation.Horizontal}
      */
    var orientation: js.UndefOr[Orientation | String] = js.undefined
    
    /** Specifies the readOnly of the slider.
      * @Default {false}
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Fires before creating each slider scale tick. You can use this event to add custom text in tick values.
      */
    var renderingTicks: js.UndefOr[js.Function1[/* e */ RenderingTicksEventArgs, Unit]] = js.undefined
    
    /** Shows/Hides the increment and decrement buttons of the slider.
      * @Default {false}
      */
    var showButtons: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the rounded corner behavior for slider.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** Shows/Hide the major (large) and minor (small) ticks in the scale of the slider.
      * @Default {false}
      */
    var showScale: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the small ticks from the scale of the slider.
      * @Default {true}
      */
    var showSmallTicks: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the showTooltip to shows the current Slider value, while moving the Slider handle or clicking on the slider handle of the slider.
      * @Default {true}
      */
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Fires once Slider control is sliding successfully.
      */
    var slide: js.UndefOr[js.Function1[/* e */ SlideEventArgs, Unit]] = js.undefined
    
    /** Specifies the sliderType of the slider.
      * @Default {ej.SliderType.Default}
      */
    var sliderType: js.UndefOr[typings.ejWebAll.ej.slider.sliderType | String] = js.undefined
    
    /** Specifies the distance between two minor (small) ticks from the scale of the slider.
      * @Default {1}
      */
    var smallStep: js.UndefOr[Double] = js.undefined
    
    /** Fires once Slider control is started successfully.
      */
    var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.undefined
    
    /** Fires when Slider control is stopped successfully.
      */
    var stop: js.UndefOr[js.Function1[/* e */ StopEventArgs, Unit]] = js.undefined
    
    /** Fires when display the custom tooltip.
      */
    var tooltipChange: js.UndefOr[js.Function1[/* e */ TooltipChangeEventArgs, Unit]] = js.undefined
    
    /** Specifies the value of the slider. But it's not applicable for range slider. To range slider we can use values property.
      * @Default {0}
      */
    var value: js.UndefOr[Double] = js.undefined
    
    /** Specifies the values of the range slider. But it's not applicable for default and minRange sliders. we can use value property for default and minRange sliders.
      * @Default {[minValue,maxValue]}
      */
    var values: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Specifies the width of the slider.
      * @Default {100%}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Slider_.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Slider_.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.Slider_.Model](x: Self) {
      
      inline def setAllowMouseWheel(value: Boolean): Self = StObject.set(x, "allowMouseWheel", value.asInstanceOf[js.Any])
      
      inline def setAllowMouseWheelUndefined: Self = StObject.set(x, "allowMouseWheel", js.undefined)
      
      inline def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      inline def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      inline def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setIncrementStep(value: Double): Self = StObject.set(x, "incrementStep", value.asInstanceOf[js.Any])
      
      inline def setIncrementStepUndefined: Self = StObject.set(x, "incrementStep", js.undefined)
      
      inline def setLargeStep(value: Double): Self = StObject.set(x, "largeStep", value.asInstanceOf[js.Any])
      
      inline def setLargeStepUndefined: Self = StObject.set(x, "largeStep", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setOrientation(value: Orientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRenderingTicks(value: /* e */ RenderingTicksEventArgs => Unit): Self = StObject.set(x, "renderingTicks", js.Any.fromFunction1(value))
      
      inline def setRenderingTicksUndefined: Self = StObject.set(x, "renderingTicks", js.undefined)
      
      inline def setShowButtons(value: Boolean): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
      
      inline def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
      
      inline def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      inline def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      inline def setShowScale(value: Boolean): Self = StObject.set(x, "showScale", value.asInstanceOf[js.Any])
      
      inline def setShowScaleUndefined: Self = StObject.set(x, "showScale", js.undefined)
      
      inline def setShowSmallTicks(value: Boolean): Self = StObject.set(x, "showSmallTicks", value.asInstanceOf[js.Any])
      
      inline def setShowSmallTicksUndefined: Self = StObject.set(x, "showSmallTicks", js.undefined)
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setSlide(value: /* e */ SlideEventArgs => Unit): Self = StObject.set(x, "slide", js.Any.fromFunction1(value))
      
      inline def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      inline def setSliderType(value: sliderType | String): Self = StObject.set(x, "sliderType", value.asInstanceOf[js.Any])
      
      inline def setSliderTypeUndefined: Self = StObject.set(x, "sliderType", js.undefined)
      
      inline def setSmallStep(value: Double): Self = StObject.set(x, "smallStep", value.asInstanceOf[js.Any])
      
      inline def setSmallStepUndefined: Self = StObject.set(x, "smallStep", js.undefined)
      
      inline def setStart(value: /* e */ StartEventArgs => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStop(value: /* e */ StopEventArgs => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      inline def setTooltipChange(value: /* e */ TooltipChangeEventArgs => Unit): Self = StObject.set(x, "tooltipChange", js.Any.fromFunction1(value))
      
      inline def setTooltipChangeUndefined: Self = StObject.set(x, "tooltipChange", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait RenderingTicksEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current Li element
      */
    var tick: js.UndefOr[js.Any] = js.undefined
    
    /** returns slider tick value
      */
    var value: js.UndefOr[Double] = js.undefined
    
    /** returns the value type either tooltip or label value
      */
    var valueType: js.UndefOr[String] = js.undefined
  }
  object RenderingTicksEventArgs {
    
    inline def apply(): RenderingTicksEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderingTicksEventArgs]
    }
    
    extension [Self <: RenderingTicksEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setTick(value: js.Any): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
      
      inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SlideEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns slider id
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** returns the slider model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns current handle number or index
      */
    var sliderIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the slider value
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object SlideEventArgs {
    
    inline def apply(): SlideEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideEventArgs]
    }
    
    extension [Self <: SlideEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSliderIndex(value: Double): Self = StObject.set(x, "sliderIndex", value.asInstanceOf[js.Any])
      
      inline def setSliderIndexUndefined: Self = StObject.set(x, "sliderIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait StartEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns slider id
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** returns the slider model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns current handle number or index
      */
    var sliderIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the slider value
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object StartEventArgs {
    
    inline def apply(): StartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartEventArgs]
    }
    
    extension [Self <: StartEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSliderIndex(value: Double): Self = StObject.set(x, "sliderIndex", value.asInstanceOf[js.Any])
      
      inline def setSliderIndexUndefined: Self = StObject.set(x, "sliderIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait StopEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns slider id
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** returns the slider model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns current handle number or index
      */
    var sliderIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the slider value
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object StopEventArgs {
    
    inline def apply(): StopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopEventArgs]
    }
    
    extension [Self <: StopEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSliderIndex(value: Double): Self = StObject.set(x, "sliderIndex", value.asInstanceOf[js.Any])
      
      inline def setSliderIndexUndefined: Self = StObject.set(x, "sliderIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TooltipChangeEventArgs extends StObject {
    
    /** returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns slider id.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** returns true if event triggered by interaction else returns false.
      */
    var isInteraction: js.UndefOr[Boolean] = js.undefined
    
    /** returns the slider model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns current handle number or index
      */
    var sliderIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the slider value.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object TooltipChangeEventArgs {
    
    inline def apply(): TooltipChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipChangeEventArgs]
    }
    
    extension [Self <: TooltipChangeEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      inline def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSliderIndex(value: Double): Self = StObject.set(x, "sliderIndex", value.asInstanceOf[js.Any])
      
      inline def setSliderIndexUndefined: Self = StObject.set(x, "sliderIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
