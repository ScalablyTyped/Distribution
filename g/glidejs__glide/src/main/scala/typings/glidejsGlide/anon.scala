package typings.glidejsGlide

import typings.glidejsGlide.glidejsGlideBooleans.`false`
import typings.glidejsGlide.glidejsGlideStrings.ltr
import typings.glidejsGlide.glidejsGlideStrings.rtl
import typings.glidejsGlide.mod.Options
import typings.glidejsGlide.mod.Type
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActiveNav extends StObject {
    
    /**
      * @default 'glide__bullet--active'
      */
    var activeNav: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'glide__slide--active'
      */
    var activeSlide: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'glide--carousel'
      */
    var carousel: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'glide__slide--clone'
      */
    var cloneSlide: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[Ltr] = js.undefined
    
    /**
      * @default 'glide__arrow--disabled'
      */
    var disabledArrow: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'glide--dragging'
      */
    var dragging: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'glide--slider'
      */
    var slider: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'glide--swipeable'
      */
    var swipeable: js.UndefOr[String] = js.undefined
  }
  object ActiveNav {
    
    inline def apply(): ActiveNav = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActiveNav]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActiveNav] (val x: Self) extends AnyVal {
      
      inline def setActiveNav(value: String): Self = StObject.set(x, "activeNav", value.asInstanceOf[js.Any])
      
      inline def setActiveNavUndefined: Self = StObject.set(x, "activeNav", js.undefined)
      
      inline def setActiveSlide(value: String): Self = StObject.set(x, "activeSlide", value.asInstanceOf[js.Any])
      
      inline def setActiveSlideUndefined: Self = StObject.set(x, "activeSlide", js.undefined)
      
      inline def setCarousel(value: String): Self = StObject.set(x, "carousel", value.asInstanceOf[js.Any])
      
      inline def setCarouselUndefined: Self = StObject.set(x, "carousel", js.undefined)
      
      inline def setCloneSlide(value: String): Self = StObject.set(x, "cloneSlide", value.asInstanceOf[js.Any])
      
      inline def setCloneSlideUndefined: Self = StObject.set(x, "cloneSlide", js.undefined)
      
      inline def setDirection(value: Ltr): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabledArrow(value: String): Self = StObject.set(x, "disabledArrow", value.asInstanceOf[js.Any])
      
      inline def setDisabledArrowUndefined: Self = StObject.set(x, "disabledArrow", js.undefined)
      
      inline def setDragging(value: String): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      inline def setSlider(value: String): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setSwipeable(value: String): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
      
      inline def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
    }
  }
  
  trait After extends StObject {
    
    var after: Double
    
    var before: Double
  }
  object After {
    
    inline def apply(after: Double, before: Double): After = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[After]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: After] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: Double): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: Double): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  trait Before extends StObject {
    
    var after: js.UndefOr[Double] = js.undefined
    
    var before: js.UndefOr[Double] = js.undefined
  }
  object Before {
    
    inline def apply(): Before = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Before]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Before] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: Double): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: Double): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    }
  }
  
  trait Ltr extends StObject {
    
    /**
      * @default 'glide--ltr'
      */
    var ltr: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'glide--rtl'
      */
    var rtl: js.UndefOr[String] = js.undefined
  }
  object Ltr {
    
    inline def apply(): Ltr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ltr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ltr] (val x: Self) extends AnyVal {
      
      inline def setLtr(value: String): Self = StObject.set(x, "ltr", value.asInstanceOf[js.Any])
      
      inline def setLtrUndefined: Self = StObject.set(x, "ltr", js.undefined)
      
      inline def setRtl(value: String): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    }
  }
  
  trait Modify extends StObject {
    
    /**
      * Modifies passed translate value by 100 pixels.
      */
    def modify(translate: Double): Double
  }
  object Modify {
    
    inline def apply(modify: Double => Double): Modify = {
      val __obj = js.Dynamic.literal(modify = js.Any.fromFunction1(modify))
      __obj.asInstanceOf[Modify]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Modify] (val x: Self) extends AnyVal {
      
      inline def setModify(value: Double => Double): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Required<@glidejs/glide.@glidejs/glide.Options> */
  trait RequiredOptions extends StObject {
    
    var animationDuration: Double
    
    var animationTimingFunc: String
    
    var autoplay: `false` | Double
    
    var bound: Boolean
    
    var breakpoints: Record[Double, Options]
    
    var classes: ActiveNav
    
    var direction: ltr | rtl
    
    var dragThreshold: Double | `false`
    
    var focusAt: Double | String
    
    var gap: Double
    
    var hoverpause: Boolean
    
    var keyboard: Boolean
    
    var peek: Double | Before
    
    var perTouch: Double | `false`
    
    var perView: Double
    
    var rewind: Boolean
    
    var rewindDuration: Double
    
    var startAt: Double
    
    var swipeThreshold: Double | `false`
    
    var throttle: Double
    
    var touchAngle: Double
    
    var touchRatio: Double
    
    var `type`: Type
  }
  object RequiredOptions {
    
    inline def apply(
      animationDuration: Double,
      animationTimingFunc: String,
      autoplay: `false` | Double,
      bound: Boolean,
      breakpoints: Record[Double, Options],
      classes: ActiveNav,
      direction: ltr | rtl,
      dragThreshold: Double | `false`,
      focusAt: Double | String,
      gap: Double,
      hoverpause: Boolean,
      keyboard: Boolean,
      peek: Double | Before,
      perTouch: Double | `false`,
      perView: Double,
      rewind: Boolean,
      rewindDuration: Double,
      startAt: Double,
      swipeThreshold: Double | `false`,
      throttle: Double,
      touchAngle: Double,
      touchRatio: Double,
      `type`: Type
    ): RequiredOptions = {
      val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], animationTimingFunc = animationTimingFunc.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], bound = bound.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dragThreshold = dragThreshold.asInstanceOf[js.Any], focusAt = focusAt.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any], hoverpause = hoverpause.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], peek = peek.asInstanceOf[js.Any], perTouch = perTouch.asInstanceOf[js.Any], perView = perView.asInstanceOf[js.Any], rewind = rewind.asInstanceOf[js.Any], rewindDuration = rewindDuration.asInstanceOf[js.Any], startAt = startAt.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any], touchAngle = touchAngle.asInstanceOf[js.Any], touchRatio = touchRatio.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationTimingFunc(value: String): Self = StObject.set(x, "animationTimingFunc", value.asInstanceOf[js.Any])
      
      inline def setAutoplay(value: `false` | Double): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setBound(value: Boolean): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
      
      inline def setBreakpoints(value: Record[Double, Options]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setClasses(value: ActiveNav): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDragThreshold(value: Double | `false`): Self = StObject.set(x, "dragThreshold", value.asInstanceOf[js.Any])
      
      inline def setFocusAt(value: Double | String): Self = StObject.set(x, "focusAt", value.asInstanceOf[js.Any])
      
      inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setHoverpause(value: Boolean): Self = StObject.set(x, "hoverpause", value.asInstanceOf[js.Any])
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setPeek(value: Double | Before): Self = StObject.set(x, "peek", value.asInstanceOf[js.Any])
      
      inline def setPerTouch(value: Double | `false`): Self = StObject.set(x, "perTouch", value.asInstanceOf[js.Any])
      
      inline def setPerView(value: Double): Self = StObject.set(x, "perView", value.asInstanceOf[js.Any])
      
      inline def setRewind(value: Boolean): Self = StObject.set(x, "rewind", value.asInstanceOf[js.Any])
      
      inline def setRewindDuration(value: Double): Self = StObject.set(x, "rewindDuration", value.asInstanceOf[js.Any])
      
      inline def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      inline def setSwipeThreshold(value: Double | `false`): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setTouchAngle(value: Double): Self = StObject.set(x, "touchAngle", value.asInstanceOf[js.Any])
      
      inline def setTouchRatio(value: Double): Self = StObject.set(x, "touchRatio", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
