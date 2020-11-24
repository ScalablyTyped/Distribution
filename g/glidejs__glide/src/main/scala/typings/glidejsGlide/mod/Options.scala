package typings.glidejsGlide.mod

import typings.glidejsGlide.anon.ActiveNav
import typings.glidejsGlide.anon.After
import typings.glidejsGlide.glidejsGlideBooleans.`false`
import typings.glidejsGlide.glidejsGlideStrings.ltr
import typings.glidejsGlide.glidejsGlideStrings.rtr
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Duration of the animation
    *
    * @default 400
    */
  var animationDuration: js.UndefOr[Double] = js.native
  
  /**
    * Easing function for the animation
    *
    * @default 'cubic-bezier(0.165, 0.840, 0.440, 1.000)
    */
  var animationTimingFunc: js.UndefOr[String] = js.native
  
  /**
    * Change slides after a specified interval
    *
    * @default false
    */
  var autoplay: js.UndefOr[`false` | Double] = js.native
  
  /**
    * Stop running perView number of slides from the end
    *
    * @default false
    */
  var bound: js.UndefOr[Boolean] = js.native
  
  /**
    * Collection of options applied at specified media breakpoints
    *
    * @default {}
    */
  var breakpoints: js.UndefOr[Record[Double, Options]] = js.native
  
  /**
    * Collection of used HTML classes
    */
  var classes: js.UndefOr[ActiveNav] = js.native
  
  /**
    * Moving direction mode
    *
    * @default 'ltr'
    */
  var direction: js.UndefOr[ltr | rtr] = js.native
  
  /**
    * Minimal mousedrag distance needed to change the slide
    *
    * @default 120
    */
  var dragThreshold: js.UndefOr[Double | `false`] = js.native
  
  /**
    * Focus currently active slide at a specified position
    *
    * @default 0
    */
  var focusAt: js.UndefOr[Double | String] = js.native
  
  /**
    * A size of the space between slides
    *
    * @default 10
    */
  var gap: js.UndefOr[Double] = js.native
  
  /**
    * Stop autoplay on mouseover
    *
    * @default true
    */
  var hoverpause: js.UndefOr[Boolean] = js.native
  
  /**
    * Change slides with keyboard arrows
    *
    * @default true
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  
  /**
    * The value of the future viewports which have to be visible in the
    * current view
    *
    * @default 0
    */
  var peek: js.UndefOr[Double | After] = js.native
  
  /**
    * A maximum number of slides moved per single swipe or drag
    *
    * @default false
    */
  var perTouch: js.UndefOr[Double | `false`] = js.native
  
  /**
    * A number of visible slides
    *
    * @default 1
    */
  var perView: js.UndefOr[Double] = js.native
  
  /**
    * Allow looping the slider type
    *
    * @default true
    */
  var rewind: js.UndefOr[Boolean] = js.native
  
  /**
    * Duration of the rewinding animation
    *
    * @default 800
    */
  var rewindDuration: js.UndefOr[Double] = js.native
  
  /**
    * Start at specific slide number
    *
    * @default 0
    */
  var startAt: js.UndefOr[Double] = js.native
  
  /**
    * Minimal swipe distance needed to change the slide
    *
    * @default 80
    */
  var swipeThreshold: js.UndefOr[Double | `false`] = js.native
  
  /**
    * Throttle costly events
    *
    * @default 25
    */
  var throttle: js.UndefOr[Double] = js.native
  
  /**
    * Angle required to activate slides moving
    *
    * @default 45
    */
  var touchAngle: js.UndefOr[Double] = js.native
  
  /**
    * Alternate moving distance ratio of swiping and dragging
    *
    * @default 0.5
    */
  var touchRatio: js.UndefOr[Double] = js.native
  
  /**
    * Type of the movement
    *
    * @default 'slider'
    */
  var `type`: js.UndefOr[Type] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationTimingFunc(value: String): Self = this.set("animationTimingFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationTimingFunc: Self = this.set("animationTimingFunc", js.undefined)
    
    @scala.inline
    def setAutoplay(value: `false` | Double): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setBound(value: Boolean): Self = this.set("bound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBound: Self = this.set("bound", js.undefined)
    
    @scala.inline
    def setBreakpoints(value: Record[Double, Options]): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakpoints: Self = this.set("breakpoints", js.undefined)
    
    @scala.inline
    def setClasses(value: ActiveNav): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setDirection(value: ltr | rtr): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDragThreshold(value: Double | `false`): Self = this.set("dragThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragThreshold: Self = this.set("dragThreshold", js.undefined)
    
    @scala.inline
    def setFocusAt(value: Double | String): Self = this.set("focusAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusAt: Self = this.set("focusAt", js.undefined)
    
    @scala.inline
    def setGap(value: Double): Self = this.set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    
    @scala.inline
    def setHoverpause(value: Boolean): Self = this.set("hoverpause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverpause: Self = this.set("hoverpause", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setPeek(value: Double | After): Self = this.set("peek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeek: Self = this.set("peek", js.undefined)
    
    @scala.inline
    def setPerTouch(value: Double | `false`): Self = this.set("perTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerTouch: Self = this.set("perTouch", js.undefined)
    
    @scala.inline
    def setPerView(value: Double): Self = this.set("perView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerView: Self = this.set("perView", js.undefined)
    
    @scala.inline
    def setRewind(value: Boolean): Self = this.set("rewind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRewind: Self = this.set("rewind", js.undefined)
    
    @scala.inline
    def setRewindDuration(value: Double): Self = this.set("rewindDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRewindDuration: Self = this.set("rewindDuration", js.undefined)
    
    @scala.inline
    def setStartAt(value: Double): Self = this.set("startAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAt: Self = this.set("startAt", js.undefined)
    
    @scala.inline
    def setSwipeThreshold(value: Double | `false`): Self = this.set("swipeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeThreshold: Self = this.set("swipeThreshold", js.undefined)
    
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
    
    @scala.inline
    def setTouchAngle(value: Double): Self = this.set("touchAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchAngle: Self = this.set("touchAngle", js.undefined)
    
    @scala.inline
    def setTouchRatio(value: Double): Self = this.set("touchRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchRatio: Self = this.set("touchRatio", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
