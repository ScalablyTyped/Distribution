package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialSlider
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** To hide the radialslider
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  @JSName("model")
  var model_RadialSlider: Model = js.native
  
  /** To show the radialslider
    * @returns {void}
    */
  def show(): Unit = js.native
}
object RadialSlider {
  
  trait ChangeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Radialslider model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the initial value of Radial slider
      */
    var oldValue: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the current value of the Radial slider
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
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
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
    
    /** returns the Radialslider model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
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
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** To show the RadialSlider in initial render.
      * @Default {false}
      */
    var autoOpen: js.UndefOr[Boolean] = js.undefined
    
    /** Event triggers when the change occurs.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Event triggers when the radial slider is created.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Sets the root class for RadialSlider theme. This cssClass API helps to use custom skinning option for RadialSlider control. By defining the root class using this API, we need to
      * include this root class in CSS.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** To enable Animation for Radial Slider.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Enable/Disable the Roundoff property of RadialSlider
      * @Default {true}
      */
    var enableRoundOff: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the endAngle value for radial slider circle.
      * @Default {360}
      */
    var endAngle: js.UndefOr[Double] = js.undefined
    
    /** Specifies the inline for label show or not on given radius.
      * @Default {false}
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies innerCircleImageClass, using this property we can give images for center radial circle through CSS classes.
      * @Default {null}
      */
    var innerCircleImageClass: js.UndefOr[String] = js.undefined
    
    /** Specifies the file name of center circle icon
      * @Default {null}
      */
    var innerCircleImageUrl: js.UndefOr[String] = js.undefined
    
    /** Specifies the Space between the radial slider element and the label.
      * @Default {30}
      */
    var labelSpace: js.UndefOr[Double] = js.undefined
    
    /** Change the Radial Slider ticks value based on the given culture.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Event triggers when the mouse pointer is dragged over the radial slider.
      */
    var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.undefined
    
    /** Specifies the radius of radial slider
      * @Default {200}
      */
    var radius: js.UndefOr[Double] = js.undefined
    
    /** To show the RadialSlider inner circle.
      * @Default {true}
      */
    var showInnerCircle: js.UndefOr[Boolean] = js.undefined
    
    /** Event triggers when the Radial slider slides.
      */
    var slide: js.UndefOr[js.Function1[/* e */ SlideEventArgs, Unit]] = js.undefined
    
    /** Event triggers when the radial slider starts.
      */
    var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.undefined
    
    /** Specifies the endAngle value for radial slider circle.
      * @Default {0}
      */
    var startAngle: js.UndefOr[Double] = js.undefined
    
    /** Event triggers when the radial slider stops.
      */
    var stop: js.UndefOr[js.Function1[/* e */ StopEventArgs, Unit]] = js.undefined
    
    /** Specifies the  strokeWidth for customize the needle, outer circle and inner circle.
      * @Default {2}
      */
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    /** Specifies the ticks value of radial slider
      */
    var ticks: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Specifies the value of radial slider
      * @Default {10}
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.RadialSlider.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.RadialSlider.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.RadialSlider.Model](x: Self) {
      
      inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
      
      inline def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
      
      inline def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setEnableRoundOff(value: Boolean): Self = StObject.set(x, "enableRoundOff", value.asInstanceOf[js.Any])
      
      inline def setEnableRoundOffUndefined: Self = StObject.set(x, "enableRoundOff", js.undefined)
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInnerCircleImageClass(value: String): Self = StObject.set(x, "innerCircleImageClass", value.asInstanceOf[js.Any])
      
      inline def setInnerCircleImageClassUndefined: Self = StObject.set(x, "innerCircleImageClass", js.undefined)
      
      inline def setInnerCircleImageUrl(value: String): Self = StObject.set(x, "innerCircleImageUrl", value.asInstanceOf[js.Any])
      
      inline def setInnerCircleImageUrlUndefined: Self = StObject.set(x, "innerCircleImageUrl", js.undefined)
      
      inline def setLabelSpace(value: Double): Self = StObject.set(x, "labelSpace", value.asInstanceOf[js.Any])
      
      inline def setLabelSpaceUndefined: Self = StObject.set(x, "labelSpace", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMouseover(value: /* e */ MouseoverEventArgs => Unit): Self = StObject.set(x, "mouseover", js.Any.fromFunction1(value))
      
      inline def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setShowInnerCircle(value: Boolean): Self = StObject.set(x, "showInnerCircle", value.asInstanceOf[js.Any])
      
      inline def setShowInnerCircleUndefined: Self = StObject.set(x, "showInnerCircle", js.undefined)
      
      inline def setSlide(value: /* e */ SlideEventArgs => Unit): Self = StObject.set(x, "slide", js.Any.fromFunction1(value))
      
      inline def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      inline def setStart(value: /* e */ StartEventArgs => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStop(value: /* e */ StopEventArgs => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setTicks(value: js.Array[js.Any]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTicksVarargs(value: js.Any*): Self = StObject.set(x, "ticks", js.Array(value :_*))
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait MouseoverEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Radialslider model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the value selected
      */
    var selectedValue: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the current value selected in Radial slider
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object MouseoverEventArgs {
    
    inline def apply(): MouseoverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseoverEventArgs]
    }
    
    extension [Self <: MouseoverEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelectedValue(value: Double): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SlideEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Radialslider model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the value selected in Radial slider
      */
    var selectedValue: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the currently selected value
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
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelectedValue(value: Double): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
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
    
    /** returns the Radialslider model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the current value selected in Radial slider
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
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
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
    
    /** returns the Radialslider model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the current value selected in Radial slider
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
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
