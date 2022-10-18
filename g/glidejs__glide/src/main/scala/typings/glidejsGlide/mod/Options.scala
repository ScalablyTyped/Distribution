package typings.glidejsGlide.mod

import typings.glidejsGlide.anon.ActiveNav
import typings.glidejsGlide.anon.After
import typings.glidejsGlide.glidejsGlideBooleans.`false`
import typings.glidejsGlide.glidejsGlideStrings.ltr
import typings.glidejsGlide.glidejsGlideStrings.rtl
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * Duration of the animation
    *
    * @default 400
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Easing function for the animation
    *
    * @default 'cubic-bezier(0.165, 0.840, 0.440, 1.000)
    */
  var animationTimingFunc: js.UndefOr[String] = js.undefined
  
  /**
    * Change slides after a specified interval
    *
    * @default false
    */
  var autoplay: js.UndefOr[`false` | Double] = js.undefined
  
  /**
    * Stop running perView number of slides from the end
    *
    * @default false
    */
  var bound: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Collection of options applied at specified media breakpoints
    *
    * @default {}
    */
  var breakpoints: js.UndefOr[Record[Double, Options]] = js.undefined
  
  /**
    * Collection of used HTML classes
    */
  var classes: js.UndefOr[ActiveNav] = js.undefined
  
  /**
    * Moving direction mode
    *
    * @default 'ltr'
    */
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  
  /**
    * Minimal mousedrag distance needed to change the slide
    *
    * @default 120
    */
  var dragThreshold: js.UndefOr[Double | `false`] = js.undefined
  
  /**
    * Focus currently active slide at a specified position
    *
    * @default 0
    */
  var focusAt: js.UndefOr[Double | String] = js.undefined
  
  /**
    * A size of the space between slides
    *
    * @default 10
    */
  var gap: js.UndefOr[Double] = js.undefined
  
  /**
    * Stop autoplay on mouseover
    *
    * @default true
    */
  var hoverpause: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Change slides with keyboard arrows
    *
    * @default true
    */
  var keyboard: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of the future viewports which have to be visible in the
    * current view
    *
    * @default 0
    */
  var peek: js.UndefOr[Double | After] = js.undefined
  
  /**
    * A maximum number of slides moved per single swipe or drag
    *
    * @default false
    */
  var perTouch: js.UndefOr[Double | `false`] = js.undefined
  
  /**
    * A number of visible slides
    *
    * @default 1
    */
  var perView: js.UndefOr[Double] = js.undefined
  
  /**
    * Allow looping the slider type
    *
    * @default true
    */
  var rewind: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Duration of the rewinding animation
    *
    * @default 800
    */
  var rewindDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Start at specific slide number
    *
    * @default 0
    */
  var startAt: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimal swipe distance needed to change the slide
    *
    * @default 80
    */
  var swipeThreshold: js.UndefOr[Double | `false`] = js.undefined
  
  /**
    * Throttle costly events
    *
    * @default 25
    */
  var throttle: js.UndefOr[Double] = js.undefined
  
  /**
    * Angle required to activate slides moving
    *
    * @default 45
    */
  var touchAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * Alternate moving distance ratio of swiping and dragging
    *
    * @default 0.5
    */
  var touchRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * Type of the movement
    *
    * @default 'slider'
    */
  var `type`: js.UndefOr[Type] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationTimingFunc(value: String): Self = StObject.set(x, "animationTimingFunc", value.asInstanceOf[js.Any])
    
    inline def setAnimationTimingFuncUndefined: Self = StObject.set(x, "animationTimingFunc", js.undefined)
    
    inline def setAutoplay(value: `false` | Double): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setBound(value: Boolean): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
    
    inline def setBoundUndefined: Self = StObject.set(x, "bound", js.undefined)
    
    inline def setBreakpoints(value: Record[Double, Options]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    inline def setClasses(value: ActiveNav): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDragThreshold(value: Double | `false`): Self = StObject.set(x, "dragThreshold", value.asInstanceOf[js.Any])
    
    inline def setDragThresholdUndefined: Self = StObject.set(x, "dragThreshold", js.undefined)
    
    inline def setFocusAt(value: Double | String): Self = StObject.set(x, "focusAt", value.asInstanceOf[js.Any])
    
    inline def setFocusAtUndefined: Self = StObject.set(x, "focusAt", js.undefined)
    
    inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setHoverpause(value: Boolean): Self = StObject.set(x, "hoverpause", value.asInstanceOf[js.Any])
    
    inline def setHoverpauseUndefined: Self = StObject.set(x, "hoverpause", js.undefined)
    
    inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setPeek(value: Double | After): Self = StObject.set(x, "peek", value.asInstanceOf[js.Any])
    
    inline def setPeekUndefined: Self = StObject.set(x, "peek", js.undefined)
    
    inline def setPerTouch(value: Double | `false`): Self = StObject.set(x, "perTouch", value.asInstanceOf[js.Any])
    
    inline def setPerTouchUndefined: Self = StObject.set(x, "perTouch", js.undefined)
    
    inline def setPerView(value: Double): Self = StObject.set(x, "perView", value.asInstanceOf[js.Any])
    
    inline def setPerViewUndefined: Self = StObject.set(x, "perView", js.undefined)
    
    inline def setRewind(value: Boolean): Self = StObject.set(x, "rewind", value.asInstanceOf[js.Any])
    
    inline def setRewindDuration(value: Double): Self = StObject.set(x, "rewindDuration", value.asInstanceOf[js.Any])
    
    inline def setRewindDurationUndefined: Self = StObject.set(x, "rewindDuration", js.undefined)
    
    inline def setRewindUndefined: Self = StObject.set(x, "rewind", js.undefined)
    
    inline def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    
    inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
    
    inline def setSwipeThreshold(value: Double | `false`): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
    
    inline def setSwipeThresholdUndefined: Self = StObject.set(x, "swipeThreshold", js.undefined)
    
    inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    
    inline def setTouchAngle(value: Double): Self = StObject.set(x, "touchAngle", value.asInstanceOf[js.Any])
    
    inline def setTouchAngleUndefined: Self = StObject.set(x, "touchAngle", js.undefined)
    
    inline def setTouchRatio(value: Double): Self = StObject.set(x, "touchRatio", value.asInstanceOf[js.Any])
    
    inline def setTouchRatioUndefined: Self = StObject.set(x, "touchRatio", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
