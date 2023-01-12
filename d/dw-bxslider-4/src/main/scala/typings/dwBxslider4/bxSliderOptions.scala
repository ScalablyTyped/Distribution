package typings.dwBxslider4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait bxSliderOptions extends StObject {
  
  /**
    * adaptiveHeight Dynamically adjust slider height based on each slide's height
    * 
    * default: false
    * options: boolean (true / false)
    */
  var adaptiveHeight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * adaptiveHeightSpeed Slide height transition duration (in ms). Note: only used if adaptiveHeight: true
    * 
    * default: 500
    * options: integer
    */
  var adaptiveHeightSpeed: js.UndefOr[Double] = js.undefined
  
  /**
    * ariaHidden Adds Aria Hidden attribute to any nonvisible slides.
    * 
    * default: true
    * options: boolean (true / false)
    */
  var ariaHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ariaLive Adds Aria Live attribute to slider.
    * 
    * default: true
    * options: boolean (true / false)
    */
  var ariaLive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * auto Slides will automatically transition
    * 
    * default: false
    * options: boolean (true / false)
    */
  var auto: js.UndefOr[Boolean] = js.undefined
  
  /**
    * autoControls If true, "Start" / "Stop" controls will be added
    * 
    * default: false
    * options: boolean (true / false)
    */
  var autoControls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * autoControlsCombine When slideshow is playing only "Stop" control is displayed and vice-versa
    * 
    * default: false
    * options: boolean (true / false)
    */
  var autoControlsCombine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * autoControlsSelector Element used to populate the auto controls
    * 
    * default: null
    * options: jQuery selector
    */
  var autoControlsSelector: js.UndefOr[String] = js.undefined
  
  /**
    * autoDelay Time (in ms) auto show should wait before starting
    * 
    * default: 0
    * options: integer
    */
  var autoDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * autoDirection The direction of auto show slide transitions
    * 
    * default: 'next'
    * options: 'next', 'prev'
    */
  var autoDirection: js.UndefOr[String] = js.undefined
  
  /**
    * autoHover Auto show will pause when mouse hovers over slider
    * 
    * default: false
    * options: boolean (true / false)
    */
  var autoHover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * autoStart Auto show starts playing on load. If false, slideshow will start when the "Start" control is clicked
    * 
    * default: true
    * options: boolean (true / false)
    */
  var autoStart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * buildPager If supplied, function is called on every slide element, and the returned value is used as the pager item markup.
    * See examples for detailed implementation
    * 
    * default: null
    * options: functoin(slideIndex)
    */
  var buildPager: js.UndefOr[js.Function1[/* slideIndex */ Double, Unit]] = js.undefined
  
  /**
    * captions Include image captions. Captions are derived from the image's title attribute
    * 
    * default: false
    * options: boolean (true / false)
    */
  var captions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * controls If true, "Next" / "Prev" controls will be added
    * 
    * default: true
    * options: boolean (true / false)
    */
  var controls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * easing The type of "easing" to use during transitions. If using CSS transitions, include a value for the transition-timing-function property. If not using CSS transitions, you may include plugins/jquery.easing.1.3.js for many options.
    * See http://gsgd.co.uk/sandbox/jquery/easing/ for more info.
    * 
    * default: null
    * options: if using CSS: 'linear', 'ease', 'ease-in', 'ease-out', 'ease-in-out', 'cubic-bezier(n,n,n,n)'. If not using CSS: 'swing', 'linear' (see the above file for more options)
    */
  var easing: js.UndefOr[String] = js.undefined
  
  /**
    * hideControlOnEnd If true, "Prev" and "Next" controls will receive a class disabled when slide is the first or the last
    * Note: Only used when infiniteLoop: false
    * 
    * default: false
    * options: boolean (true / false)
    */
  var hideControlOnEnd: js.UndefOr[Boolean] = js.undefined
  
  /**
    * infiniteLoop If true, clicking "Next" while on the last slide will transition to the first slide and vice-versa
    * 
    * default: true
    * options: boolean (true / false)
    */
  var infiniteLoop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * keyboardEnabled Allows for keyboard control of visible slider. Keypress ignored if slider not visible.
    * 
    * default: false
    * options: boolean (true / false)
    */
  var keyboardEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * maxSlides The maximum number of slides to be shown. Slides will be sized up if carousel becomes larger than the original size.
    * 
    * default: 1
    * options: integer
    */
  var maxSlides: js.UndefOr[Double] = js.undefined
  
  /**
    * minSlides The minimum number of slides to be shown. Slides will be sized down if carousel becomes smaller than the original size.
    * 
    * default: 1
    * options: integer
    */
  var minSlides: js.UndefOr[Double] = js.undefined
  
  /**
    * mode Type of transition between slides
    * 
    * default: 'horizontal'
    * options: 'horizontal', 'vertical', 'fade'
    */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * moveSlides The number of slides to move on transition. This value must be >= minSlides, and <= maxSlides. If zero (default), the number of fully-visible slides will be used.
    * 
    * default: 0
    * options: integer
    */
  var moveSlides: js.UndefOr[Double] = js.undefined
  
  /**
    * nextSelector Element used to populate the "Next" control
    * 
    * default: null
    * options: jQuery selector
    */
  var nextSelector: js.UndefOr[String] = js.undefined
  
  /**
    * nextText Text to be used for the "Next" control
    * 
    * default: 'Next'
    * options: string
    */
  var nextText: js.UndefOr[String] = js.undefined
  
  /**
    * onSlideAfter Executes immediately after each slide transition. Function argument is the current slide element (when transition completes).
    * 
    * default: function(){}
    * options: function($slideElement, oldIndex, newIndex){ // your code here }
    * arguments:
    *   $slideElement: jQuery element of the destination element
    *   oldIndex: element index of the previous slide (before the transition)
    *   newIndex: element index of the destination slide (after the transition)
    */
  var onSlideAfter: js.UndefOr[
    js.Function3[
      /* $slideElement */ js.UndefOr[JQuery], 
      /* oldIndex */ js.UndefOr[Double], 
      /* newIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * onSlideBefore Executes immediately before each slide transition.
    * 
    * default: function(){}
    * options: function($slideElement, oldIndex, newIndex){ // your code here }
    * arguments:
    *   $slideElement: jQuery element of the destination element
    *   oldIndex: element index of the previous slide (before the transition)
    *   newIndex: element index of the destination slide (after the transition)
    */
  var onSlideBefore: js.UndefOr[
    js.Function3[
      /* $slideElement */ js.UndefOr[JQuery], 
      /* oldIndex */ js.UndefOr[Double], 
      /* newIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * onSlideNext Executes immediately before each "Next" slide transition. Function argument is the target (next) slide element.
    * 
    * default: function(){}
    * options: function($slideElement, oldIndex, newIndex){ // your code here }
    * arguments:
    *   $slideElement: jQuery element of the destination element
    *   oldIndex: element index of the previous slide (before the transition)
    *   newIndex: element index of the destination slide (after the transition)
    */
  var onSlideNext: js.UndefOr[
    js.Function3[
      /* $slideElement */ js.UndefOr[JQuery], 
      /* oldIndex */ js.UndefOr[Double], 
      /* newIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * onSlidePrev Executes immediately before each "Prev" slide transition. Function argument is the target (prev) slide element.
    * 
    * default: function(){}
    * options: function($slideElement, oldIndex, newIndex){ // your code here }
    * arguments:
    *   $slideElement: jQuery element of the destination element
    *   oldIndex: element index of the previous slide (before the transition)
    *   newIndex: element index of the destination slide (after the transition)
    */
  var onSlidePrev: js.UndefOr[
    js.Function3[
      /* $slideElement */ js.UndefOr[JQuery], 
      /* oldIndex */ js.UndefOr[Double], 
      /* newIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * onSliderLoad Executes immediately after the slider is fully loaded
    * 
    * default: function(){}
    * options: function(currentIndex){ // your code here }
    * arguments:
    *   currentIndex: element index of the current slide
    */
  var onSliderLoad: js.UndefOr[js.Function1[/* currentIndex */ js.UndefOr[Double], Unit]] = js.undefined
  
  /**
    * onSliderResize Executes immediately after the slider is resized
    * 
    * default: function(){}
    * options: function(currentIndex){ // your code here }
    * arguments:
    *   currentIndex: element index of the current slide
    */
  var onSliderResize: js.UndefOr[js.Function1[/* currentIndex */ js.UndefOr[Double], Unit]] = js.undefined
  
  /**
    * oneToOneTouch If true, non-fade slides follow the finger as it swipes
    * 
    * default: true
    * options: boolean (true / false)
    */
  var oneToOneTouch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * pager If true, a pager will be added
    * 
    * default: true
    * options: boolean (true / false)
    */
  var pager: js.UndefOr[Boolean] = js.undefined
  
  /**
    * pagerCustom Parent element to be used as the pager. Parent element must contain a <a data-slide-index="x"> element for each slide. See example here. Not for use with dynamic carousels.
    * 
    * default: null
    * options: jQuery selector
    */
  var pagerCustom: js.UndefOr[String] = js.undefined
  
  /**
    * pagerSelector Element used to populate the populate the pager. By default, the pager is appended to the bx-viewport
    * 
    * default: ''
    * options: jQuery selector
    */
  var pagerSelector: js.UndefOr[String] = js.undefined
  
  /**
    * pagerShortSeparator If pagerType: 'short', pager will use this value as the separating character
    * 
    * default: ' / '
    * options: string
    */
  var pagerShortSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * pagerType If 'full', a pager link will be generated for each slide. If 'short', a x / y pager will be used (ex. 1 / 5)
    * 
    * default: 'full'
    * options: 'full', 'short'
    */
  var pagerType: js.UndefOr[String] = js.undefined
  
  /**
    * pause The amount of time (in ms) between each auto transition
    * 
    * default: 4000
    * options: integer
    */
  var pause: js.UndefOr[Double] = js.undefined
  
  /**
    * preloadImages If 'all', preloads all images before starting the slider. If 'visible', preloads only images in the initially visible slides before starting the slider (tip: use 'visible' if all slides are identical dimensions)
    * 
    * default: 'visible'
    * options: 'all', 'visible'
    */
  var preloadImages: js.UndefOr[String] = js.undefined
  
  /**
    * prevSelector Element used to populate the "Prev" control
    * 
    * default: null
    * options: jQuery selector
    */
  var prevSelector: js.UndefOr[String] = js.undefined
  
  /**
    * prevText Text to be used for the "Prev" control
    * 
    * default: 'Prev'
    * options: string
    */
  var prevText: js.UndefOr[String] = js.undefined
  
  /**
    * preventDefaultSwipeX If true, touch screen will not move along the x-axis as the finger swipes
    * 
    * default: true
    * options: boolean (true / false)
    */
  var preventDefaultSwipeX: js.UndefOr[Boolean] = js.undefined
  
  /**
    * preventDefaultSwipeY If true, touch screen will not move along the y-axis as the finger swipes
    * 
    * default: false
    * options: boolean (true / false)
    */
  var preventDefaultSwipeY: js.UndefOr[Boolean] = js.undefined
  
  /**
    * randomStart Start slider on a random slide
    * 
    * default: false
    * options: boolean (true / false)
    */
  var randomStart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * responsive Enable or disable auto resize of the slider. Useful if you need to use fixed width sliders.
    * 
    * default: true
    * options: boolean (true / false)
    */
  var responsive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * shrinkItems The Carousel will only show whole items and shrink the images to fit the viewport based on maxSlides/MinSlides.
    * 
    * default: false
    * options: boolean (true / false)
    */
  var shrinkItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    * slideMargin Margin between each slide
    * 
    * default: 0
    * options: integer
    */
  var slideMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * slideSelector Element to use as slides (ex. 'div.slide').
    * Note: by default, bxSlider will use all immediate children of the slider element
    * 
    * default: ''
    * options: jQuery selector
    */
  var slideSelector: js.UndefOr[String] = js.undefined
  
  /**
    * slideWidth The width of each slide. This setting is required for all horizontal carousels!
    * 
    * default: 0
    * options: integer
    */
  var slideWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * speed Slide transition duration (in ms)
    * 
    * default: 500
    * options: integer
    */
  var speed: js.UndefOr[Double] = js.undefined
  
  /**
    * startSlide Starting slide index (zero-based)
    * 
    * default: 0
    * options: integer
    */
  var startSlide: js.UndefOr[Double] = js.undefined
  
  /**
    * startText Text to be used for the "Start" control
    * 
    * default: 'Start'
    * options: string
    */
  var startText: js.UndefOr[String] = js.undefined
  
  /**
    * stopAutoOnClick Auto will stop on interaction with controls
    * 
    * default: false
    * options: boolean (true / false)
    */
  var stopAutoOnClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * stopText Text to be used for the "Stop" control
    * 
    * default: 'Stop'
    * options: string
    */
  var stopText: js.UndefOr[String] = js.undefined
  
  /**
    * swipeThreshold Amount of pixels a touch swipe needs to exceed in order to execute a slide transition. Note: only used if touchEnabled: true
    * 
    * default: 50
    * options: integer
    */
  var swipeThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * ticker Use slider in ticker mode (similar to a news ticker)
    * 
    * default: false
    * options: boolean (true / false)
    */
  var ticker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * tickerHover Ticker will pause when mouse hovers over slider. Note: this functionality does NOT work if using CSS transitions!
    * 
    * default: false
    * options: boolean (true / false)
    */
  var tickerHover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * touchEnabled If true, slider will allow touch swipe transitions
    * 
    * default: true
    * options: boolean (true / false)
    */
  var touchEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * useCSS If true, CSS transitions will be used for horizontal and vertical slide animations (this uses native hardware acceleration). If false, jQuery animate() will be used.
    * 
    * default: true
    * options: boolean (true / false)
    */
  var useCSS: js.UndefOr[Boolean] = js.undefined
  
  /**
    * video If any slides contain video, set this to true. Also, include plugins/jquery.fitvids.js
    * See http://fitvidsjs.com/ for more info
    * 
    * default: false
    * options: boolean (true / false)
    */
  var video: js.UndefOr[Boolean] = js.undefined
  
  /**
    * wrapperClass Class to wrap the slider in. Change to prevent from using default bxSlider styles.
    * 
    * default: 'bx-wrapper'
    * options: string
    */
  var wrapperClass: js.UndefOr[String] = js.undefined
}
object bxSliderOptions {
  
  inline def apply(): bxSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[bxSliderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: bxSliderOptions] (val x: Self) extends AnyVal {
    
    inline def setAdaptiveHeight(value: Boolean): Self = StObject.set(x, "adaptiveHeight", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveHeightSpeed(value: Double): Self = StObject.set(x, "adaptiveHeightSpeed", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveHeightSpeedUndefined: Self = StObject.set(x, "adaptiveHeightSpeed", js.undefined)
    
    inline def setAdaptiveHeightUndefined: Self = StObject.set(x, "adaptiveHeight", js.undefined)
    
    inline def setAriaHidden(value: Boolean): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
    
    inline def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
    
    inline def setAriaLive(value: Boolean): Self = StObject.set(x, "ariaLive", value.asInstanceOf[js.Any])
    
    inline def setAriaLiveUndefined: Self = StObject.set(x, "ariaLive", js.undefined)
    
    inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setAutoControls(value: Boolean): Self = StObject.set(x, "autoControls", value.asInstanceOf[js.Any])
    
    inline def setAutoControlsCombine(value: Boolean): Self = StObject.set(x, "autoControlsCombine", value.asInstanceOf[js.Any])
    
    inline def setAutoControlsCombineUndefined: Self = StObject.set(x, "autoControlsCombine", js.undefined)
    
    inline def setAutoControlsSelector(value: String): Self = StObject.set(x, "autoControlsSelector", value.asInstanceOf[js.Any])
    
    inline def setAutoControlsSelectorUndefined: Self = StObject.set(x, "autoControlsSelector", js.undefined)
    
    inline def setAutoControlsUndefined: Self = StObject.set(x, "autoControls", js.undefined)
    
    inline def setAutoDelay(value: Double): Self = StObject.set(x, "autoDelay", value.asInstanceOf[js.Any])
    
    inline def setAutoDelayUndefined: Self = StObject.set(x, "autoDelay", js.undefined)
    
    inline def setAutoDirection(value: String): Self = StObject.set(x, "autoDirection", value.asInstanceOf[js.Any])
    
    inline def setAutoDirectionUndefined: Self = StObject.set(x, "autoDirection", js.undefined)
    
    inline def setAutoHover(value: Boolean): Self = StObject.set(x, "autoHover", value.asInstanceOf[js.Any])
    
    inline def setAutoHoverUndefined: Self = StObject.set(x, "autoHover", js.undefined)
    
    inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
    
    inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    
    inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
    
    inline def setBuildPager(value: /* slideIndex */ Double => Unit): Self = StObject.set(x, "buildPager", js.Any.fromFunction1(value))
    
    inline def setBuildPagerUndefined: Self = StObject.set(x, "buildPager", js.undefined)
    
    inline def setCaptions(value: Boolean): Self = StObject.set(x, "captions", value.asInstanceOf[js.Any])
    
    inline def setCaptionsUndefined: Self = StObject.set(x, "captions", js.undefined)
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setHideControlOnEnd(value: Boolean): Self = StObject.set(x, "hideControlOnEnd", value.asInstanceOf[js.Any])
    
    inline def setHideControlOnEndUndefined: Self = StObject.set(x, "hideControlOnEnd", js.undefined)
    
    inline def setInfiniteLoop(value: Boolean): Self = StObject.set(x, "infiniteLoop", value.asInstanceOf[js.Any])
    
    inline def setInfiniteLoopUndefined: Self = StObject.set(x, "infiniteLoop", js.undefined)
    
    inline def setKeyboardEnabled(value: Boolean): Self = StObject.set(x, "keyboardEnabled", value.asInstanceOf[js.Any])
    
    inline def setKeyboardEnabledUndefined: Self = StObject.set(x, "keyboardEnabled", js.undefined)
    
    inline def setMaxSlides(value: Double): Self = StObject.set(x, "maxSlides", value.asInstanceOf[js.Any])
    
    inline def setMaxSlidesUndefined: Self = StObject.set(x, "maxSlides", js.undefined)
    
    inline def setMinSlides(value: Double): Self = StObject.set(x, "minSlides", value.asInstanceOf[js.Any])
    
    inline def setMinSlidesUndefined: Self = StObject.set(x, "minSlides", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMoveSlides(value: Double): Self = StObject.set(x, "moveSlides", value.asInstanceOf[js.Any])
    
    inline def setMoveSlidesUndefined: Self = StObject.set(x, "moveSlides", js.undefined)
    
    inline def setNextSelector(value: String): Self = StObject.set(x, "nextSelector", value.asInstanceOf[js.Any])
    
    inline def setNextSelectorUndefined: Self = StObject.set(x, "nextSelector", js.undefined)
    
    inline def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
    
    inline def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
    
    inline def setOnSlideAfter(
      value: (/* $slideElement */ js.UndefOr[JQuery], /* oldIndex */ js.UndefOr[Double], /* newIndex */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "onSlideAfter", js.Any.fromFunction3(value))
    
    inline def setOnSlideAfterUndefined: Self = StObject.set(x, "onSlideAfter", js.undefined)
    
    inline def setOnSlideBefore(
      value: (/* $slideElement */ js.UndefOr[JQuery], /* oldIndex */ js.UndefOr[Double], /* newIndex */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "onSlideBefore", js.Any.fromFunction3(value))
    
    inline def setOnSlideBeforeUndefined: Self = StObject.set(x, "onSlideBefore", js.undefined)
    
    inline def setOnSlideNext(
      value: (/* $slideElement */ js.UndefOr[JQuery], /* oldIndex */ js.UndefOr[Double], /* newIndex */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "onSlideNext", js.Any.fromFunction3(value))
    
    inline def setOnSlideNextUndefined: Self = StObject.set(x, "onSlideNext", js.undefined)
    
    inline def setOnSlidePrev(
      value: (/* $slideElement */ js.UndefOr[JQuery], /* oldIndex */ js.UndefOr[Double], /* newIndex */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "onSlidePrev", js.Any.fromFunction3(value))
    
    inline def setOnSlidePrevUndefined: Self = StObject.set(x, "onSlidePrev", js.undefined)
    
    inline def setOnSliderLoad(value: /* currentIndex */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "onSliderLoad", js.Any.fromFunction1(value))
    
    inline def setOnSliderLoadUndefined: Self = StObject.set(x, "onSliderLoad", js.undefined)
    
    inline def setOnSliderResize(value: /* currentIndex */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "onSliderResize", js.Any.fromFunction1(value))
    
    inline def setOnSliderResizeUndefined: Self = StObject.set(x, "onSliderResize", js.undefined)
    
    inline def setOneToOneTouch(value: Boolean): Self = StObject.set(x, "oneToOneTouch", value.asInstanceOf[js.Any])
    
    inline def setOneToOneTouchUndefined: Self = StObject.set(x, "oneToOneTouch", js.undefined)
    
    inline def setPager(value: Boolean): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    inline def setPagerCustom(value: String): Self = StObject.set(x, "pagerCustom", value.asInstanceOf[js.Any])
    
    inline def setPagerCustomUndefined: Self = StObject.set(x, "pagerCustom", js.undefined)
    
    inline def setPagerSelector(value: String): Self = StObject.set(x, "pagerSelector", value.asInstanceOf[js.Any])
    
    inline def setPagerSelectorUndefined: Self = StObject.set(x, "pagerSelector", js.undefined)
    
    inline def setPagerShortSeparator(value: String): Self = StObject.set(x, "pagerShortSeparator", value.asInstanceOf[js.Any])
    
    inline def setPagerShortSeparatorUndefined: Self = StObject.set(x, "pagerShortSeparator", js.undefined)
    
    inline def setPagerType(value: String): Self = StObject.set(x, "pagerType", value.asInstanceOf[js.Any])
    
    inline def setPagerTypeUndefined: Self = StObject.set(x, "pagerType", js.undefined)
    
    inline def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    inline def setPause(value: Double): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setPreloadImages(value: String): Self = StObject.set(x, "preloadImages", value.asInstanceOf[js.Any])
    
    inline def setPreloadImagesUndefined: Self = StObject.set(x, "preloadImages", js.undefined)
    
    inline def setPrevSelector(value: String): Self = StObject.set(x, "prevSelector", value.asInstanceOf[js.Any])
    
    inline def setPrevSelectorUndefined: Self = StObject.set(x, "prevSelector", js.undefined)
    
    inline def setPrevText(value: String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
    
    inline def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
    
    inline def setPreventDefaultSwipeX(value: Boolean): Self = StObject.set(x, "preventDefaultSwipeX", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultSwipeXUndefined: Self = StObject.set(x, "preventDefaultSwipeX", js.undefined)
    
    inline def setPreventDefaultSwipeY(value: Boolean): Self = StObject.set(x, "preventDefaultSwipeY", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultSwipeYUndefined: Self = StObject.set(x, "preventDefaultSwipeY", js.undefined)
    
    inline def setRandomStart(value: Boolean): Self = StObject.set(x, "randomStart", value.asInstanceOf[js.Any])
    
    inline def setRandomStartUndefined: Self = StObject.set(x, "randomStart", js.undefined)
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setShrinkItems(value: Boolean): Self = StObject.set(x, "shrinkItems", value.asInstanceOf[js.Any])
    
    inline def setShrinkItemsUndefined: Self = StObject.set(x, "shrinkItems", js.undefined)
    
    inline def setSlideMargin(value: Double): Self = StObject.set(x, "slideMargin", value.asInstanceOf[js.Any])
    
    inline def setSlideMarginUndefined: Self = StObject.set(x, "slideMargin", js.undefined)
    
    inline def setSlideSelector(value: String): Self = StObject.set(x, "slideSelector", value.asInstanceOf[js.Any])
    
    inline def setSlideSelectorUndefined: Self = StObject.set(x, "slideSelector", js.undefined)
    
    inline def setSlideWidth(value: Double): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
    
    inline def setSlideWidthUndefined: Self = StObject.set(x, "slideWidth", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setStartSlide(value: Double): Self = StObject.set(x, "startSlide", value.asInstanceOf[js.Any])
    
    inline def setStartSlideUndefined: Self = StObject.set(x, "startSlide", js.undefined)
    
    inline def setStartText(value: String): Self = StObject.set(x, "startText", value.asInstanceOf[js.Any])
    
    inline def setStartTextUndefined: Self = StObject.set(x, "startText", js.undefined)
    
    inline def setStopAutoOnClick(value: Boolean): Self = StObject.set(x, "stopAutoOnClick", value.asInstanceOf[js.Any])
    
    inline def setStopAutoOnClickUndefined: Self = StObject.set(x, "stopAutoOnClick", js.undefined)
    
    inline def setStopText(value: String): Self = StObject.set(x, "stopText", value.asInstanceOf[js.Any])
    
    inline def setStopTextUndefined: Self = StObject.set(x, "stopText", js.undefined)
    
    inline def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
    
    inline def setSwipeThresholdUndefined: Self = StObject.set(x, "swipeThreshold", js.undefined)
    
    inline def setTicker(value: Boolean): Self = StObject.set(x, "ticker", value.asInstanceOf[js.Any])
    
    inline def setTickerHover(value: Boolean): Self = StObject.set(x, "tickerHover", value.asInstanceOf[js.Any])
    
    inline def setTickerHoverUndefined: Self = StObject.set(x, "tickerHover", js.undefined)
    
    inline def setTickerUndefined: Self = StObject.set(x, "ticker", js.undefined)
    
    inline def setTouchEnabled(value: Boolean): Self = StObject.set(x, "touchEnabled", value.asInstanceOf[js.Any])
    
    inline def setTouchEnabledUndefined: Self = StObject.set(x, "touchEnabled", js.undefined)
    
    inline def setUseCSS(value: Boolean): Self = StObject.set(x, "useCSS", value.asInstanceOf[js.Any])
    
    inline def setUseCSSUndefined: Self = StObject.set(x, "useCSS", js.undefined)
    
    inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    inline def setWrapperClass(value: String): Self = StObject.set(x, "wrapperClass", value.asInstanceOf[js.Any])
    
    inline def setWrapperClassUndefined: Self = StObject.set(x, "wrapperClass", js.undefined)
  }
}
