package typings.flexslider

import org.scalablytyped.runtime.NumberDictionary
import typings.flexslider.flexsliderStrings.fade
import typings.flexslider.flexsliderStrings.horizontal
import typings.flexslider.flexsliderStrings.linear
import typings.flexslider.flexsliderStrings.next
import typings.flexslider.flexsliderStrings.prev
import typings.flexslider.flexsliderStrings.slide
import typings.flexslider.flexsliderStrings.swing
import typings.flexslider.flexsliderStrings.thumbnails
import typings.flexslider.flexsliderStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FlexSlider {
  
  /* Rewritten from type alias, can be one of: 
    - typings.flexslider.flexsliderStrings.play
    - typings.flexslider.flexsliderStrings.pause
    - typings.flexslider.flexsliderStrings.stop
    - typings.flexslider.flexsliderStrings.next
    - typings.flexslider.flexsliderStrings.prev
    - typings.flexslider.flexsliderStrings.previous
  */
  trait HelperActions extends StObject
  object HelperActions {
    
    inline def next: typings.flexslider.flexsliderStrings.next = "next".asInstanceOf[typings.flexslider.flexsliderStrings.next]
    
    inline def pause: typings.flexslider.flexsliderStrings.pause = "pause".asInstanceOf[typings.flexslider.flexsliderStrings.pause]
    
    inline def play: typings.flexslider.flexsliderStrings.play = "play".asInstanceOf[typings.flexslider.flexsliderStrings.play]
    
    inline def prev: typings.flexslider.flexsliderStrings.prev = "prev".asInstanceOf[typings.flexslider.flexsliderStrings.prev]
    
    inline def previous: typings.flexslider.flexsliderStrings.previous = "previous".asInstanceOf[typings.flexslider.flexsliderStrings.previous]
    
    inline def stop: typings.flexslider.flexsliderStrings.stop = "stop".asInstanceOf[typings.flexslider.flexsliderStrings.stop]
  }
  
  trait Methods extends StObject {
    
    /**
      * Fires after a slide is added
      */
    var added: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.undefined
    
    /**
      * Fires after each slider animation completes
      */
    var after: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.undefined
    
    /**
      * Fires asynchronously with each slider animation
      */
    var before: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.undefined
    
    /**
      * Fires when the slider reaches the last slide (asynchronous)
      */
    var end: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.undefined
    
    /**
      * Fires after the slider is initially setup
      */
    var init: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.undefined
    
    /**
      * Fires after a slide is removed
      */
    var removed: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.undefined
    
    /**
      * Fires when the slider loads the first slide
      */
    var start: js.UndefOr[js.Function1[/* slider */ SliderObject, Unit]] = js.undefined
  }
  object Methods {
    
    inline def apply(): Methods = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setAdded(value: /* slider */ SliderObject => Unit): Self = StObject.set(x, "added", js.Any.fromFunction1(value))
      
      inline def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
      
      inline def setAfter(value: /* slider */ SliderObject => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: /* slider */ SliderObject => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setEnd(value: /* slider */ SliderObject => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setInit(value: /* slider */ SliderObject => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setRemoved(value: /* slider */ SliderObject => Unit): Self = StObject.set(x, "removed", js.Any.fromFunction1(value))
      
      inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
      
      inline def setStart(value: /* slider */ SliderObject => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Whether or not to allow a slider comprised of a single slide
      * @default true
      */
    var allowOneSlide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Select your animation type, "fade" or "slide"
      * @default fade
      */
    var animation: js.UndefOr[fade | slide] = js.undefined
    
    /**
      * Should the animation loop? If false, directionNav will received "disable"
      * classes at either end
      * @default true
      */
    var animationLoop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the speed of animations, in milliseconds
      * @default 600
      * @since v1.9
      */
    var animationSpeed: js.UndefOr[Double] = js.undefined
    
    /**
      * Internal property exposed for turning the slider into a
      * thumbnail navigation for another slider
      */
    var asNavFor: js.UndefOr[String] = js.undefined
    
    // Primary Controls
    /**
      * Create navigation for paging control of each slide? Note: Leave true for
      * manualControls usage
      * @default true
      */
    var controlNav: js.UndefOr[thumbnails | Boolean] = js.undefined
    
    // Special properties
    /**
      * Declare which container the navigation elements should be appended too.
      * Default container is the FlexSlider element. Example use would be
      * $(".flexslider-container"). Property is ignored if given element is not
      * found.
      */
    var controlsContainer: js.UndefOr[JQuery] = js.undefined
    
    /**
      * Custom prev / next button. Must be two jQuery elements. In order to make
      * the events work they have to have the classes "prev" and "next" (plus
      * namespace)
      */
    var customDirectionNav: js.UndefOr[JQuery] = js.undefined
    
    /**
      * Select the sliding direction, "horizontal" or "vertical"
      * @default horizontal
      * @since v1.9
      */
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * Create navigation for previous/next navigation? (true/false)
      * @default true
      */
    var directionNav: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines the easing method used in jQuery transitions. jQuery easing
      * plugin is supported!
      * @default swing
      */
    var easing: js.UndefOr[swing | linear | String] = js.undefined
    
    /**
      * Fade in the first slide when animation type is "fade"
      * @default true
      */
    var fadeFirstSlide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set an initialization delay, in milliseconds
      * @default 0
      */
    var initDelay: js.UndefOr[Double] = js.undefined
    
    // Browser Specific
    /**
      * Set to true when Firefox is the browser used.
      * @default false
      */
    var isFirefox: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Margin between carousel items.
      * @default 0
      */
    var itemMargin: js.UndefOr[Double] = js.undefined
    
    // Carousel Options
    /**
      * Box-model width of individual carousel items, including
      * horizontal borders and padding.
      * @default 0
      */
    var itemWidth: js.UndefOr[Double] = js.undefined
    
    // Secondary Navigation
    /**
      * Allow slider navigating via keyboard left/right keys
      * @default true
      * @since v1.9
      */
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Declare custom control navigation. Examples would be $(".flex-control-nav
      * li") or "#tabs-nav li img", etc. The number of elements in your
      * controlNav should match the number of slides/tabs.
      */
    var manualControls: js.UndefOr[JQuery] = js.undefined
    
    /**
      * Maxmimum number of carousel items that should be visible.
      * Items will resize fluidly when above this limit.
      * @default 0
      */
    var maxItems: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum number of carousel items that should be visible.
      * Items will resize fluidly when below this.
      * @default 1
      */
    var minItems: js.UndefOr[Double] = js.undefined
    
    /**
      * Requires jquery.mousewheel.js
      * (https://github.com/brandonaaron/jquery-mousewheel) - Allows slider
      * navigating via mousewheel
      * @default false
      */
    var mousewheel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Number of carousel items that should move on animation. If
      * 0, slider will move all visible items.
      * @default 0
      */
    var move: js.UndefOr[Double] = js.undefined
    
    /**
      * Allow keyboard navigation to affect multiple sliders. Default behavior
      * cuts out keyboard navigation with more than one slider present.
      * @default false
      */
    var multipleKeyboard: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prefix string attached to the class of every element generated by the
      * plugin
      */
    var namespace: js.UndefOr[String] = js.undefined
    
    /**
      * Set the text for the "next" directionNav item
      * @default Next
      */
    var nextText: js.UndefOr[String] = js.undefined
    
    /**
      * Pause the slideshow when tab is invisible, resume when visible. Provides
      * better UX, lower CPU usage.
      * @default true
      */
    var pauseInvisible: js.UndefOr[Boolean] = js.undefined
    
    // Usability features
    /**
      * Pause the slideshow when interacting with control elements, highly
      * recommended.
      * @default true
      */
    var pauseOnAction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pause the slideshow when hovering over slider, then resume when no longer
      * hovering
      * @default false
      */
    var pauseOnHover: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Create pause/play dynamic element
      * @default false
      */
    var pausePlay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the text for the "pause" pausePlay item
      * @default Pause
      */
    var pauseText: js.UndefOr[String] = js.undefined
    
    /**
      * Set the text for the "play" pausePlay item
      * @default Play
      */
    var playText: js.UndefOr[String] = js.undefined
    
    /**
      * Set the text for the "previous" directionNav item
      * @default Previous
      */
    var prevText: js.UndefOr[String] = js.undefined
    
    /**
      * Randomize slide order
      * @default false
      */
    var randomize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Reverse the animation direction
      * @default false
      */
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not to enable RTL mode
      * @default false
      */
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Must match a simple pattern. '{container} > {slide}' -- Ignore pattern at
      * your own peril
      */
    var selector: js.UndefOr[String] = js.undefined
    
    /**
      * Animate slider automatically
      * @default true
      */
    var slideshow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the speed of the slideshow cycling, in milliseconds
      * @default 7000
      */
    var slideshowSpeed: js.UndefOr[Double] = js.undefined
    
    /**
      * Allow height of the slider to animate smoothly in horizontal mode
      * @default false
      */
    var smoothHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The slide that the slider should start on. Array notation (0 = first
      * slide)
      * @default 0
      * @since v1.9
      */
    var startAt: js.UndefOr[Double] = js.undefined
    
    /**
      * Mirror the actions performed on this slider with another
      * slider. Use with care.
      */
    var sync: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not to put captions on thumbnails when using the "thumbnails"
      * controlNav.
      * @default false
      */
    var thumbCaptions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow touch swipe navigation of the slider on touch-enabled devices
      * @default true
      */
    var touch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Slider will use CSS3 transitions if available
      * @default true
      */
    var useCSS: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If using video in the slider, will prevent CSS3 3D Transforms to avoid
      * graphical glitches
      * @default false
      */
    var video: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowOneSlide(value: Boolean): Self = StObject.set(x, "allowOneSlide", value.asInstanceOf[js.Any])
      
      inline def setAllowOneSlideUndefined: Self = StObject.set(x, "allowOneSlide", js.undefined)
      
      inline def setAnimation(value: fade | slide): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationLoop(value: Boolean): Self = StObject.set(x, "animationLoop", value.asInstanceOf[js.Any])
      
      inline def setAnimationLoopUndefined: Self = StObject.set(x, "animationLoop", js.undefined)
      
      inline def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      inline def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAsNavFor(value: String): Self = StObject.set(x, "asNavFor", value.asInstanceOf[js.Any])
      
      inline def setAsNavForUndefined: Self = StObject.set(x, "asNavFor", js.undefined)
      
      inline def setControlNav(value: thumbnails | Boolean): Self = StObject.set(x, "controlNav", value.asInstanceOf[js.Any])
      
      inline def setControlNavUndefined: Self = StObject.set(x, "controlNav", js.undefined)
      
      inline def setControlsContainer(value: JQuery): Self = StObject.set(x, "controlsContainer", value.asInstanceOf[js.Any])
      
      inline def setControlsContainerUndefined: Self = StObject.set(x, "controlsContainer", js.undefined)
      
      inline def setCustomDirectionNav(value: JQuery): Self = StObject.set(x, "customDirectionNav", value.asInstanceOf[js.Any])
      
      inline def setCustomDirectionNavUndefined: Self = StObject.set(x, "customDirectionNav", js.undefined)
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionNav(value: Boolean): Self = StObject.set(x, "directionNav", value.asInstanceOf[js.Any])
      
      inline def setDirectionNavUndefined: Self = StObject.set(x, "directionNav", js.undefined)
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEasing(value: swing | linear | String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setFadeFirstSlide(value: Boolean): Self = StObject.set(x, "fadeFirstSlide", value.asInstanceOf[js.Any])
      
      inline def setFadeFirstSlideUndefined: Self = StObject.set(x, "fadeFirstSlide", js.undefined)
      
      inline def setInitDelay(value: Double): Self = StObject.set(x, "initDelay", value.asInstanceOf[js.Any])
      
      inline def setInitDelayUndefined: Self = StObject.set(x, "initDelay", js.undefined)
      
      inline def setIsFirefox(value: Boolean): Self = StObject.set(x, "isFirefox", value.asInstanceOf[js.Any])
      
      inline def setIsFirefoxUndefined: Self = StObject.set(x, "isFirefox", js.undefined)
      
      inline def setItemMargin(value: Double): Self = StObject.set(x, "itemMargin", value.asInstanceOf[js.Any])
      
      inline def setItemMarginUndefined: Self = StObject.set(x, "itemMargin", js.undefined)
      
      inline def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      inline def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setManualControls(value: JQuery): Self = StObject.set(x, "manualControls", value.asInstanceOf[js.Any])
      
      inline def setManualControlsUndefined: Self = StObject.set(x, "manualControls", js.undefined)
      
      inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      inline def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
      
      inline def setMousewheel(value: Boolean): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
      
      inline def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
      
      inline def setMove(value: Double): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
      
      inline def setMultipleKeyboard(value: Boolean): Self = StObject.set(x, "multipleKeyboard", value.asInstanceOf[js.Any])
      
      inline def setMultipleKeyboardUndefined: Self = StObject.set(x, "multipleKeyboard", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
      
      inline def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
      
      inline def setPauseInvisible(value: Boolean): Self = StObject.set(x, "pauseInvisible", value.asInstanceOf[js.Any])
      
      inline def setPauseInvisibleUndefined: Self = StObject.set(x, "pauseInvisible", js.undefined)
      
      inline def setPauseOnAction(value: Boolean): Self = StObject.set(x, "pauseOnAction", value.asInstanceOf[js.Any])
      
      inline def setPauseOnActionUndefined: Self = StObject.set(x, "pauseOnAction", js.undefined)
      
      inline def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      inline def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      inline def setPausePlay(value: Boolean): Self = StObject.set(x, "pausePlay", value.asInstanceOf[js.Any])
      
      inline def setPausePlayUndefined: Self = StObject.set(x, "pausePlay", js.undefined)
      
      inline def setPauseText(value: String): Self = StObject.set(x, "pauseText", value.asInstanceOf[js.Any])
      
      inline def setPauseTextUndefined: Self = StObject.set(x, "pauseText", js.undefined)
      
      inline def setPlayText(value: String): Self = StObject.set(x, "playText", value.asInstanceOf[js.Any])
      
      inline def setPlayTextUndefined: Self = StObject.set(x, "playText", js.undefined)
      
      inline def setPrevText(value: String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
      
      inline def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
      
      inline def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
      
      inline def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSlideshow(value: Boolean): Self = StObject.set(x, "slideshow", value.asInstanceOf[js.Any])
      
      inline def setSlideshowSpeed(value: Double): Self = StObject.set(x, "slideshowSpeed", value.asInstanceOf[js.Any])
      
      inline def setSlideshowSpeedUndefined: Self = StObject.set(x, "slideshowSpeed", js.undefined)
      
      inline def setSlideshowUndefined: Self = StObject.set(x, "slideshow", js.undefined)
      
      inline def setSmoothHeight(value: Boolean): Self = StObject.set(x, "smoothHeight", value.asInstanceOf[js.Any])
      
      inline def setSmoothHeightUndefined: Self = StObject.set(x, "smoothHeight", js.undefined)
      
      inline def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      inline def setSync(value: String): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setThumbCaptions(value: Boolean): Self = StObject.set(x, "thumbCaptions", value.asInstanceOf[js.Any])
      
      inline def setThumbCaptionsUndefined: Self = StObject.set(x, "thumbCaptions", js.undefined)
      
      inline def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      inline def setUseCSS(value: Boolean): Self = StObject.set(x, "useCSS", value.asInstanceOf[js.Any])
      
      inline def setUseCSSUndefined: Self = StObject.set(x, "useCSS", js.undefined)
      
      inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  @js.native
  trait SliderObject
    extends StObject
       with /* index */ NumberDictionary[JQuery] {
    
    /**
      * is slider animating?
      */
    var animating: Boolean = js.native
    
    /**
      * Useful in .before(), the slide currently animating to
      */
    var animatingTo: Double = js.native
    
    /**
      * is the slider at either end?
      */
    var atEnd: Boolean = js.native
    
    /**
      * returns boolean if slider can advance
      */
    def canAdvance(target: Any): Boolean = js.native
    def canAdvance(target: Any, fromNav: Boolean): Boolean = js.native
    
    /**
      * The ul.slides within the slider
      */
    var container: JQuery = js.native
    
    /**
      * The slider controlNav
      */
    var controlNav: JQuery = js.native
    
    /**
      * The controlsContainer element of the slider
      */
    var controlsContainer: JQuery = js.native
    
    /**
      * The total number of slides in the slider
      */
    var count: Double = js.native
    
    /**
      * The slide currently being shown
      */
    var currentSlide: Double = js.native
    
    /**
      * The slider directionNav
      */
    var directionNav: JQuery = js.native
    
    /**
      * Move slider
      */
    def flexAnimate(target: Any): Any = js.native
    def flexAnimate(target: Any, pause: Boolean): Any = js.native
    def flexAnimate(target: Any, pause: Boolean, `override`: Boolean): Any = js.native
    def flexAnimate(target: Any, pause: Boolean, `override`: Boolean, withSync: Boolean): Any = js.native
    def flexAnimate(target: Any, pause: Boolean, `override`: Boolean, withSync: Boolean, fromNav: Boolean): Any = js.native
    def flexAnimate(target: Any, pause: Boolean, `override`: Boolean, withSync: Unit, fromNav: Boolean): Any = js.native
    def flexAnimate(target: Any, pause: Boolean, `override`: Unit, withSync: Boolean): Any = js.native
    def flexAnimate(target: Any, pause: Boolean, `override`: Unit, withSync: Boolean, fromNav: Boolean): Any = js.native
    def flexAnimate(target: Any, pause: Boolean, `override`: Unit, withSync: Unit, fromNav: Boolean): Any = js.native
    def flexAnimate(target: Any, pause: Unit, `override`: Boolean): Any = js.native
    def flexAnimate(target: Any, pause: Unit, `override`: Boolean, withSync: Boolean): Any = js.native
    def flexAnimate(target: Any, pause: Unit, `override`: Boolean, withSync: Boolean, fromNav: Boolean): Any = js.native
    def flexAnimate(target: Any, pause: Unit, `override`: Boolean, withSync: Unit, fromNav: Boolean): Any = js.native
    def flexAnimate(target: Any, pause: Unit, `override`: Unit, withSync: Boolean): Any = js.native
    def flexAnimate(target: Any, pause: Unit, `override`: Unit, withSync: Boolean, fromNav: Boolean): Any = js.native
    def flexAnimate(target: Any, pause: Unit, `override`: Unit, withSync: Unit, fromNav: Boolean): Any = js.native
    
    /**
      * get target given a direction
      */
    def getTarget(dir: next | prev): Any = js.native
    
    var length: Double = js.native
    
    /**
      * The manualControls element of the slider
      */
    var manualControls: JQuery = js.native
    
    /**
      * force slider to stay paused during pauseOnHover event
      */
    var manualPause: Boolean = js.native
    
    /**
      * Pause slider slideshow interval
      */
    def pause(): Any = js.native
    
    /**
      * Play slider slideshow interval
      */
    def play(): Unit = js.native
    
    /**
      * Resume slider slideshow interval
      */
    def resume(): Any = js.native
    
    /**
      * The slides of the slider
      */
    var slides: JQuery = js.native
  }
}
