package typings.ejWebAll.ej.Scroller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Specifies the swipe scrolling speed(in millisecond).
    * @Default {600}
    */
  var animationSpeed: js.UndefOr[Double] = js.native
  
  /** Set true to hides the scrollbar, when mouseout the content area.
    * @Default {false}
    */
  var autoHide: js.UndefOr[Boolean] = js.native
  
  /** Specifies the height and width of button in the scrollbar.
    * @Default {18}
    */
  var buttonSize: js.UndefOr[Double] = js.native
  
  /** Fires when Scroller control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Fires when Scroller control is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** Save current model value to browser cookies for state maintenance. While refresh the page Rating control values are retained.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  
  /** Indicates the Right to Left direction to scroller
    * @Default {undefined}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** Enables or Disable the touch Scroll
    * @Default {true}
    */
  var enableTouchScroll: js.UndefOr[Boolean] = js.native
  
  /** Specifies to enable or disable the scroller
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Specifies the height of Scroll panel and scrollbars.
    * @Default {250}
    */
  var height: js.UndefOr[Double | String] = js.native
  
  /** The Scroller content and scrollbars move left with given value.
    * @Default {0}
    */
  var scrollLeft: js.UndefOr[Double] = js.native
  
  /** While press on the arrow key the scrollbar position added to the given pixel value.
    * @Default {57}
    */
  var scrollOneStepBy: js.UndefOr[Double] = js.native
  
  /** The Scroller content and scrollbars move to top position with specified value.
    * @Default {0}
    */
  var scrollTop: js.UndefOr[Double] = js.native
  
  /** If the scrollbar has vertical it set as width, else it will set as height of the handler.
    * @Default {18}
    */
  var scrollerSize: js.UndefOr[Double] = js.native
  
  /** Indicates the target area to which scroller have to appear.
    * @Default {null}
    */
  var targetPane: js.UndefOr[String] = js.native
  
  /** Fires when a thumb point is removed from the touch surface.
    */
  var thumbEnd: js.UndefOr[js.Function1[/* e */ ThumbEndEventArgs, Unit]] = js.native
  
  /** Fires when a thumb point is moved along the touch surface.
    */
  var thumbMove: js.UndefOr[js.Function1[/* e */ ThumbMoveEventArgs, Unit]] = js.native
  
  /** Fires when a thumb point is placed on the touch surface.
    */
  var thumbStart: js.UndefOr[js.Function1[/* e */ ThumbStartEventArgs, Unit]] = js.native
  
  /** It fires whenever the mouse wheel is rotated either in upwards or downwards.
    */
  var wheelMove: js.UndefOr[js.Function1[/* e */ WheelMoveEventArgs, Unit]] = js.native
  
  /** It will fire when mouse trackball has been start to wheel.
    */
  var wheelStart: js.UndefOr[js.Function1[/* e */ WheelStartEventArgs, Unit]] = js.native
  
  /** It will fire when mouse trackball has been stop to wheel.
    */
  var wheelStop: js.UndefOr[js.Function1[/* e */ WheelStopEventArgs, Unit]] = js.native
  
  /** Specifies the width of Scroll panel and scrollbars.
    * @Default {0}
    */
  var width: js.UndefOr[Double | String] = js.native
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
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    
    @scala.inline
    def setButtonSize(value: Double): Self = this.set("buttonSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonSize: Self = this.set("buttonSize", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setEnableTouchScroll(value: Boolean): Self = this.set("enableTouchScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTouchScroll: Self = this.set("enableTouchScroll", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollLeft: Self = this.set("scrollLeft", js.undefined)
    
    @scala.inline
    def setScrollOneStepBy(value: Double): Self = this.set("scrollOneStepBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollOneStepBy: Self = this.set("scrollOneStepBy", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollTop: Self = this.set("scrollTop", js.undefined)
    
    @scala.inline
    def setScrollerSize(value: Double): Self = this.set("scrollerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollerSize: Self = this.set("scrollerSize", js.undefined)
    
    @scala.inline
    def setTargetPane(value: String): Self = this.set("targetPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetPane: Self = this.set("targetPane", js.undefined)
    
    @scala.inline
    def setThumbEnd(value: /* e */ ThumbEndEventArgs => Unit): Self = this.set("thumbEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteThumbEnd: Self = this.set("thumbEnd", js.undefined)
    
    @scala.inline
    def setThumbMove(value: /* e */ ThumbMoveEventArgs => Unit): Self = this.set("thumbMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteThumbMove: Self = this.set("thumbMove", js.undefined)
    
    @scala.inline
    def setThumbStart(value: /* e */ ThumbStartEventArgs => Unit): Self = this.set("thumbStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteThumbStart: Self = this.set("thumbStart", js.undefined)
    
    @scala.inline
    def setWheelMove(value: /* e */ WheelMoveEventArgs => Unit): Self = this.set("wheelMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWheelMove: Self = this.set("wheelMove", js.undefined)
    
    @scala.inline
    def setWheelStart(value: /* e */ WheelStartEventArgs => Unit): Self = this.set("wheelStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWheelStart: Self = this.set("wheelStart", js.undefined)
    
    @scala.inline
    def setWheelStop(value: /* e */ WheelStopEventArgs => Unit): Self = this.set("wheelStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWheelStop: Self = this.set("wheelStop", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
