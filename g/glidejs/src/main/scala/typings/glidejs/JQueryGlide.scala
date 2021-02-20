package typings.glidejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryGlide {
  
  @js.native
  trait IGlideApi extends StObject {
    
    /**
      * Append arrows to specifed target (eq. 'body', '.class', '#id')
      */
    def arrows(target: String): Unit = js.native
    
    /**
      * Returning current slide number
      */
    def current(): Double = js.native
    
    /**
      * Destroy and cleanup slider
      */
    def destroy(): Unit = js.native
    
    /**
      * Jump to current slide
      */
    def jump(distance: Double, callback: js.Function): Unit = js.native
    
    /**
      * Append navigation to specifed target (eq. 'body', '.class', '#id')
      */
    def nav(target: String): Unit = js.native
    
    /**
      * Slide one forward
      */
    def next(callback: js.Function): Unit = js.native
    
    /**
      * Stopping autoplay
      */
    def pause(): Unit = js.native
    
    /**
      * Starting autoplay
      */
    def play(): Unit = js.native
    
    /**
      * Slide one backward
      */
    def prev(callback: js.Function): Unit = js.native
    
    /**
      * Rebuild and recalculate dimensions of slider elements
      */
    def reinit(): Unit = js.native
  }
  object IGlideApi {
    
    @scala.inline
    def apply(
      arrows: String => Unit,
      current: () => Double,
      destroy: () => Unit,
      jump: (Double, js.Function) => Unit,
      nav: String => Unit,
      next: js.Function => Unit,
      pause: () => Unit,
      play: () => Unit,
      prev: js.Function => Unit,
      reinit: () => Unit
    ): IGlideApi = {
      val __obj = js.Dynamic.literal(arrows = js.Any.fromFunction1(arrows), current = js.Any.fromFunction0(current), destroy = js.Any.fromFunction0(destroy), jump = js.Any.fromFunction2(jump), nav = js.Any.fromFunction1(nav), next = js.Any.fromFunction1(next), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), prev = js.Any.fromFunction1(prev), reinit = js.Any.fromFunction0(reinit))
      __obj.asInstanceOf[IGlideApi]
    }
    
    @scala.inline
    implicit class IGlideApiMutableBuilder[Self <: IGlideApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrows(value: String => Unit): Self = StObject.set(x, "arrows", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCurrent(value: () => Double): Self = StObject.set(x, "current", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setJump(value: (Double, js.Function) => Unit): Self = StObject.set(x, "jump", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNav(value: String => Unit): Self = StObject.set(x, "nav", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNext(value: js.Function => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrev(value: js.Function => Unit): Self = StObject.set(x, "prev", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReinit(value: () => Unit): Self = StObject.set(x, "reinit", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IGlideOptions extends StObject {
    
    /**
      * Default: function () {}
      * {Function} Callback after plugin init
      */
    var afterInit: js.UndefOr[js.Function] = js.native
    
    /**
      * Default: function() {}
      * {Function} Callback after slide change
      */
    var afterTransition: js.UndefOr[js.Function] = js.native
    
    /**
      * Default: 500
      * Animation time in ms
      * @type {number}
      */
    var animationDuration: js.UndefOr[Double] = js.native
    
    /**
      * Default: cubic-bezier(0.165, 0.840, 0.440, 1.000)
      * cubic-bezier(0.165, 0.840, 0.440, 1.000)
      */
    var animationTimingFunc: js.UndefOr[String] = js.native
    
    /**
      * Default: 'slider-arrow--left'
      * {String} Left arrow
      */
    var arrowLeftClass: js.UndefOr[String] = js.native
    
    /**
      * Default: 'prev'
      * {String} Left arrow text
      */
    var arrowLeftText: js.UndefOr[String] = js.native
    
    /**
      * Default: 'slider-arrow'
      * {String} Main class for both arrows
      */
    var arrowMainClass: js.UndefOr[String] = js.native
    
    /**
      * Default: 'slider-arrow--right'
      * {String} Right arrow
      */
    var arrowRightClass: js.UndefOr[String] = js.native
    
    /**
      * Default: 'next'
      * {String} Right arrow text
      */
    var arrowRightText: js.UndefOr[String] = js.native
    
    /**
      * Default: true
      * {Bool or String} Show/hide/appendTo arrows
      * True for append arrows to slider wrapper
      * False for not appending arrows
      * Id or class name (e.g. '.class-name') for appending to specific HTML markup
      */
    var arrows: js.UndefOr[js.Any] = js.native
    
    /**
      * Default: 'slider-arrows'
      * {String} Arrows wrapper class
      */
    var arrowsWrapperClass: js.UndefOr[String] = js.native
    
    /**
      * Default: 4000
      * {Int or Bool} False for turning off autoplay
      */
    var autoplay: js.UndefOr[js.Any] = js.native
    
    /**
      * Default: function () {}
      * {Function} Callback before plugin init
      */
    var beforeInit: js.UndefOr[js.Function] = js.native
    
    /**
      * Default: function () {}
      * {Function} Callback before slide change
      */
    var beforeTransition: js.UndefOr[js.Function] = js.native
    
    /**
      * Default: true {Bool} Circular play (Animation continues without starting over once it reaches the last slide)
      */
    var circular: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: true {Bool} Pause autoplay on mouseover slider
      */
    var hoverpause: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: true
      * {Bool} Slide on left / right keyboard arrows press
      */
    var keyboard: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: true
      * {Bool or String} Show/hide/appendTo bullets navigation
      * True for append arrows to slider wrapper
      * False for not appending arrows
      * Id or class name (e.g. '.class-name') for appending to specific HTML markup
      */
    var navigation: js.UndefOr[js.Any] = js.native
    
    /**
      * Default: true
      * {Bool} Center bullet navigation
      */
    var navigationCenter: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: 'slider-nav'
      * {String} Navigation class
      */
    var navigationClass: js.UndefOr[String] = js.native
    
    /**
      * Default: 'slider-nav__item--current'
      * {String} Current navigation item class
      */
    var navigationCurrentItemClass: js.UndefOr[String] = js.native
    
    /**
      * Default: 'slider-nav__item'
      * {String} Navigation item class
      */
    var navigationItemClass: js.UndefOr[String] = js.native
    
    /**
      * Default: 60
      * {Int or Bool} Touch settings
      */
    var touchDistance: js.UndefOr[js.Any] = js.native
  }
  object IGlideOptions {
    
    @scala.inline
    def apply(): IGlideOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGlideOptions]
    }
    
    @scala.inline
    implicit class IGlideOptionsMutableBuilder[Self <: IGlideOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterInit(value: js.Function): Self = StObject.set(x, "afterInit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
      
      @scala.inline
      def setAfterTransition(value: js.Function): Self = StObject.set(x, "afterTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterTransitionUndefined: Self = StObject.set(x, "afterTransition", js.undefined)
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setAnimationTimingFunc(value: String): Self = StObject.set(x, "animationTimingFunc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationTimingFuncUndefined: Self = StObject.set(x, "animationTimingFunc", js.undefined)
      
      @scala.inline
      def setArrowLeftClass(value: String): Self = StObject.set(x, "arrowLeftClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowLeftClassUndefined: Self = StObject.set(x, "arrowLeftClass", js.undefined)
      
      @scala.inline
      def setArrowLeftText(value: String): Self = StObject.set(x, "arrowLeftText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowLeftTextUndefined: Self = StObject.set(x, "arrowLeftText", js.undefined)
      
      @scala.inline
      def setArrowMainClass(value: String): Self = StObject.set(x, "arrowMainClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowMainClassUndefined: Self = StObject.set(x, "arrowMainClass", js.undefined)
      
      @scala.inline
      def setArrowRightClass(value: String): Self = StObject.set(x, "arrowRightClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowRightClassUndefined: Self = StObject.set(x, "arrowRightClass", js.undefined)
      
      @scala.inline
      def setArrowRightText(value: String): Self = StObject.set(x, "arrowRightText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowRightTextUndefined: Self = StObject.set(x, "arrowRightText", js.undefined)
      
      @scala.inline
      def setArrows(value: js.Any): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      @scala.inline
      def setArrowsWrapperClass(value: String): Self = StObject.set(x, "arrowsWrapperClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowsWrapperClassUndefined: Self = StObject.set(x, "arrowsWrapperClass", js.undefined)
      
      @scala.inline
      def setAutoplay(value: js.Any): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setBeforeInit(value: js.Function): Self = StObject.set(x, "beforeInit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeInitUndefined: Self = StObject.set(x, "beforeInit", js.undefined)
      
      @scala.inline
      def setBeforeTransition(value: js.Function): Self = StObject.set(x, "beforeTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeTransitionUndefined: Self = StObject.set(x, "beforeTransition", js.undefined)
      
      @scala.inline
      def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      @scala.inline
      def setHoverpause(value: Boolean): Self = StObject.set(x, "hoverpause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverpauseUndefined: Self = StObject.set(x, "hoverpause", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setNavigation(value: js.Any): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationCenter(value: Boolean): Self = StObject.set(x, "navigationCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationCenterUndefined: Self = StObject.set(x, "navigationCenter", js.undefined)
      
      @scala.inline
      def setNavigationClass(value: String): Self = StObject.set(x, "navigationClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationClassUndefined: Self = StObject.set(x, "navigationClass", js.undefined)
      
      @scala.inline
      def setNavigationCurrentItemClass(value: String): Self = StObject.set(x, "navigationCurrentItemClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationCurrentItemClassUndefined: Self = StObject.set(x, "navigationCurrentItemClass", js.undefined)
      
      @scala.inline
      def setNavigationItemClass(value: String): Self = StObject.set(x, "navigationItemClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationItemClassUndefined: Self = StObject.set(x, "navigationItemClass", js.undefined)
      
      @scala.inline
      def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
      
      @scala.inline
      def setTouchDistance(value: js.Any): Self = StObject.set(x, "touchDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchDistanceUndefined: Self = StObject.set(x, "touchDistance", js.undefined)
    }
  }
}
