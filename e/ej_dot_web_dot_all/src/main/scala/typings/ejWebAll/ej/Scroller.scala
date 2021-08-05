package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scroller
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** User disables the Scroller control at any time.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** User enables the Scroller control at any time.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Returns true if horizontal scrollbar is shown, else return false.
    * @returns {boolean}
    */
  def isHScroll(): Boolean = js.native
  
  /** Returns true if vertical scrollbar is shown, else return false.
    * @returns {boolean}
    */
  def isVScroll(): Boolean = js.native
  
  @JSName("model")
  var model_Scroller: Model = js.native
  
  /** User refreshes the Scroller control at any time.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  def scrollX(pixel: String, disableAnimation: Boolean, animationSpeed: Double): Unit = js.native
  /** Horizontal scroller moves to given pixel from its origin position. We can also specify the animation speed,in which the scroller has to move while re-positioning it.
    * @param {number|string} Horizontal scroller moves to the specified pixel.
    * @param {boolean} Specifies to enable/disable the animation.
    * @param {number} Specifies the animation speed when scrolling, if animation is enabled.
    * @returns {void}
    */
  def scrollX(pixel: Double, disableAnimation: Boolean, animationSpeed: Double): Unit = js.native
  
  def scrollY(pixel: String, disableAnimation: Boolean, animationSpeed: Double): Unit = js.native
  /** Vertical scroller moves to given pixel from its origin position. We can also specify the animation speed,in which the scroller has to move while re-positioning it.
    * @param {number|string} Vertical scroller moves to the specified pixel.
    * @param {boolean} Specifies to enable/disable the animation.
    * @param {number} Specifies the animation speed when scrolling, if animation is enabled.
    * @returns {void}
    */
  def scrollY(pixel: Double, disableAnimation: Boolean, animationSpeed: Double): Unit = js.native
}
object Scroller {
  
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the scroller model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
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
    
    /** returns the scroller model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    extension [Self <: DestroyEventArgs](x: Self) {
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Specifies the swipe scrolling speed(in millisecond).
      * @Default {600}
      */
    var animationSpeed: js.UndefOr[Double] = js.undefined
    
    /** Set true to hides the scrollbar, when mouseout the content area.
      * @Default {false}
      */
    var autoHide: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the height and width of button in the scrollbar.
      * @Default {18}
      */
    var buttonSize: js.UndefOr[Double] = js.undefined
    
    /** Fires when Scroller control is created.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Fires when Scroller control is destroyed.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Save current model value to browser cookies for state maintenance. While refresh the page Rating control values are retained.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** Indicates the Right to Left direction to scroller
      * @Default {undefined}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or Disable the touch Scroll
      * @Default {true}
      */
    var enableTouchScroll: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies to enable or disable the scroller
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the height of Scroll panel and scrollbars.
      * @Default {250}
      */
    var height: js.UndefOr[Double | String] = js.undefined
    
    /** The Scroller content and scrollbars move left with given value.
      * @Default {0}
      */
    var scrollLeft: js.UndefOr[Double] = js.undefined
    
    /** While press on the arrow key the scrollbar position added to the given pixel value.
      * @Default {57}
      */
    var scrollOneStepBy: js.UndefOr[Double] = js.undefined
    
    /** The Scroller content and scrollbars move to top position with specified value.
      * @Default {0}
      */
    var scrollTop: js.UndefOr[Double] = js.undefined
    
    /** If the scrollbar has vertical it set as width, else it will set as height of the handler.
      * @Default {18}
      */
    var scrollerSize: js.UndefOr[Double] = js.undefined
    
    /** Indicates the target area to which scroller have to appear.
      * @Default {null}
      */
    var targetPane: js.UndefOr[String] = js.undefined
    
    /** Fires when a thumb point is removed from the touch surface.
      */
    var thumbEnd: js.UndefOr[js.Function1[/* e */ ThumbEndEventArgs, Unit]] = js.undefined
    
    /** Fires when a thumb point is moved along the touch surface.
      */
    var thumbMove: js.UndefOr[js.Function1[/* e */ ThumbMoveEventArgs, Unit]] = js.undefined
    
    /** Fires when a thumb point is placed on the touch surface.
      */
    var thumbStart: js.UndefOr[js.Function1[/* e */ ThumbStartEventArgs, Unit]] = js.undefined
    
    /** It fires whenever the mouse wheel is rotated either in upwards or downwards.
      */
    var wheelMove: js.UndefOr[js.Function1[/* e */ WheelMoveEventArgs, Unit]] = js.undefined
    
    /** It will fire when mouse trackball has been start to wheel.
      */
    var wheelStart: js.UndefOr[js.Function1[/* e */ WheelStartEventArgs, Unit]] = js.undefined
    
    /** It will fire when mouse trackball has been stop to wheel.
      */
    var wheelStop: js.UndefOr[js.Function1[/* e */ WheelStopEventArgs, Unit]] = js.undefined
    
    /** Specifies the width of Scroll panel and scrollbars.
      * @Default {0}
      */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Scroller.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Scroller.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.Scroller.Model](x: Self) {
      
      inline def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      inline def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      inline def setButtonSize(value: Double): Self = StObject.set(x, "buttonSize", value.asInstanceOf[js.Any])
      
      inline def setButtonSizeUndefined: Self = StObject.set(x, "buttonSize", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnableTouchScroll(value: Boolean): Self = StObject.set(x, "enableTouchScroll", value.asInstanceOf[js.Any])
      
      inline def setEnableTouchScrollUndefined: Self = StObject.set(x, "enableTouchScroll", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
      
      inline def setScrollOneStepBy(value: Double): Self = StObject.set(x, "scrollOneStepBy", value.asInstanceOf[js.Any])
      
      inline def setScrollOneStepByUndefined: Self = StObject.set(x, "scrollOneStepBy", js.undefined)
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
      
      inline def setScrollerSize(value: Double): Self = StObject.set(x, "scrollerSize", value.asInstanceOf[js.Any])
      
      inline def setScrollerSizeUndefined: Self = StObject.set(x, "scrollerSize", js.undefined)
      
      inline def setTargetPane(value: String): Self = StObject.set(x, "targetPane", value.asInstanceOf[js.Any])
      
      inline def setTargetPaneUndefined: Self = StObject.set(x, "targetPane", js.undefined)
      
      inline def setThumbEnd(value: /* e */ ThumbEndEventArgs => Unit): Self = StObject.set(x, "thumbEnd", js.Any.fromFunction1(value))
      
      inline def setThumbEndUndefined: Self = StObject.set(x, "thumbEnd", js.undefined)
      
      inline def setThumbMove(value: /* e */ ThumbMoveEventArgs => Unit): Self = StObject.set(x, "thumbMove", js.Any.fromFunction1(value))
      
      inline def setThumbMoveUndefined: Self = StObject.set(x, "thumbMove", js.undefined)
      
      inline def setThumbStart(value: /* e */ ThumbStartEventArgs => Unit): Self = StObject.set(x, "thumbStart", js.Any.fromFunction1(value))
      
      inline def setThumbStartUndefined: Self = StObject.set(x, "thumbStart", js.undefined)
      
      inline def setWheelMove(value: /* e */ WheelMoveEventArgs => Unit): Self = StObject.set(x, "wheelMove", js.Any.fromFunction1(value))
      
      inline def setWheelMoveUndefined: Self = StObject.set(x, "wheelMove", js.undefined)
      
      inline def setWheelStart(value: /* e */ WheelStartEventArgs => Unit): Self = StObject.set(x, "wheelStart", js.Any.fromFunction1(value))
      
      inline def setWheelStartUndefined: Self = StObject.set(x, "wheelStart", js.undefined)
      
      inline def setWheelStop(value: /* e */ WheelStopEventArgs => Unit): Self = StObject.set(x, "wheelStop", js.Any.fromFunction1(value))
      
      inline def setWheelStopUndefined: Self = StObject.set(x, "wheelStop", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ThumbEndEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the scroller model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the original event name and its event properties of the current event.
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current data related to the event.
      */
    var scrollData: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ThumbEndEventArgs {
    
    inline def apply(): ThumbEndEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbEndEventArgs]
    }
    
    extension [Self <: ThumbEndEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
      
      inline def setScrollData(value: js.Any): Self = StObject.set(x, "scrollData", value.asInstanceOf[js.Any])
      
      inline def setScrollDataUndefined: Self = StObject.set(x, "scrollData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ThumbMoveEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the scroller model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the original event name and its event properties of the current event.
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current data related to the event.
      */
    var scrollData: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ThumbMoveEventArgs {
    
    inline def apply(): ThumbMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbMoveEventArgs]
    }
    
    extension [Self <: ThumbMoveEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
      
      inline def setScrollData(value: js.Any): Self = StObject.set(x, "scrollData", value.asInstanceOf[js.Any])
      
      inline def setScrollDataUndefined: Self = StObject.set(x, "scrollData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ThumbStartEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the scroller model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the original event name and its event properties of the current event.
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current data related to the event.
      */
    var scrollData: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ThumbStartEventArgs {
    
    inline def apply(): ThumbStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbStartEventArgs]
    }
    
    extension [Self <: ThumbStartEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
      
      inline def setScrollData(value: js.Any): Self = StObject.set(x, "scrollData", value.asInstanceOf[js.Any])
      
      inline def setScrollDataUndefined: Self = StObject.set(x, "scrollData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait WheelMoveEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the scroller model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the original event name and its event properties of the current event.
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
  }
  object WheelMoveEventArgs {
    
    inline def apply(): WheelMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WheelMoveEventArgs]
    }
    
    extension [Self <: WheelMoveEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait WheelStartEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the scroller model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the original event name and its event properties of the current event.
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current data related to the event.
      */
    var scrollData: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object WheelStartEventArgs {
    
    inline def apply(): WheelStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WheelStartEventArgs]
    }
    
    extension [Self <: WheelStartEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
      
      inline def setScrollData(value: js.Any): Self = StObject.set(x, "scrollData", value.asInstanceOf[js.Any])
      
      inline def setScrollDataUndefined: Self = StObject.set(x, "scrollData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait WheelStopEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the scroller model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the original event name and its event properties of the current event.
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object WheelStopEventArgs {
    
    inline def apply(): WheelStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WheelStopEventArgs]
    }
    
    extension [Self <: WheelStopEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
