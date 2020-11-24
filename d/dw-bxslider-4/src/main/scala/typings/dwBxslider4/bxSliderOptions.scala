package typings.dwBxslider4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait bxSliderOptions extends js.Object {
  
  /**
    * adaptiveHeight Dynamically adjust slider height based on each slide's height
    * 
    * default: false
    * options: boolean (true / false)
    */
  var adaptiveHeight: js.UndefOr[Boolean] = js.native
  
  /**
    * adaptiveHeightSpeed Slide height transition duration (in ms). Note: only used if adaptiveHeight: true
    * 
    * default: 500
    * options: integer
    */
  var adaptiveHeightSpeed: js.UndefOr[Double] = js.native
  
  /**
    * ariaHidden Adds Aria Hidden attribute to any nonvisible slides.
    * 
    * default: true
    * options: boolean (true / false)
    */
  var ariaHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * ariaLive Adds Aria Live attribute to slider.
    * 
    * default: true
    * options: boolean (true / false)
    */
  var ariaLive: js.UndefOr[Boolean] = js.native
  
  /**
    * auto Slides will automatically transition
    * 
    * default: false
    * options: boolean (true / false)
    */
  var auto: js.UndefOr[Boolean] = js.native
  
  /**
    * autoControls If true, "Start" / "Stop" controls will be added
    * 
    * default: false
    * options: boolean (true / false)
    */
  var autoControls: js.UndefOr[Boolean] = js.native
  
  /**
    * autoControlsCombine When slideshow is playing only "Stop" control is displayed and vice-versa
    * 
    * default: false
    * options: boolean (true / false)
    */
  var autoControlsCombine: js.UndefOr[Boolean] = js.native
  
  /**
    * autoControlsSelector Element used to populate the auto controls
    * 
    * default: null
    * options: jQuery selector
    */
  var autoControlsSelector: js.UndefOr[String] = js.native
  
  /**
    * autoDelay Time (in ms) auto show should wait before starting
    * 
    * default: 0
    * options: integer
    */
  var autoDelay: js.UndefOr[Double] = js.native
  
  /**
    * autoDirection The direction of auto show slide transitions
    * 
    * default: 'next'
    * options: 'next', 'prev'
    */
  var autoDirection: js.UndefOr[String] = js.native
  
  /**
    * autoHover Auto show will pause when mouse hovers over slider
    * 
    * default: false
    * options: boolean (true / false)
    */
  var autoHover: js.UndefOr[Boolean] = js.native
  
  /**
    * autoStart Auto show starts playing on load. If false, slideshow will start when the "Start" control is clicked
    * 
    * default: true
    * options: boolean (true / false)
    */
  var autoStart: js.UndefOr[Boolean] = js.native
  
  /**
    * buildPager If supplied, function is called on every slide element, and the returned value is used as the pager item markup.
    * See examples for detailed implementation
    * 
    * default: null
    * options: functoin(slideIndex)
    */
  var buildPager: js.UndefOr[js.Function1[/* slideIndex */ Double, Unit]] = js.native
  
  /**
    * captions Include image captions. Captions are derived from the image's title attribute
    * 
    * default: false
    * options: boolean (true / false)
    */
  var captions: js.UndefOr[Boolean] = js.native
  
  /**
    * controls If true, "Next" / "Prev" controls will be added
    * 
    * default: true
    * options: boolean (true / false)
    */
  var controls: js.UndefOr[Boolean] = js.native
  
  /**
    * easing The type of "easing" to use during transitions. If using CSS transitions, include a value for the transition-timing-function property. If not using CSS transitions, you may include plugins/jquery.easing.1.3.js for many options.
    * See http://gsgd.co.uk/sandbox/jquery/easing/ for more info.
    * 
    * default: null
    * options: if using CSS: 'linear', 'ease', 'ease-in', 'ease-out', 'ease-in-out', 'cubic-bezier(n,n,n,n)'. If not using CSS: 'swing', 'linear' (see the above file for more options)
    */
  var easing: js.UndefOr[String] = js.native
  
  /**
    * hideControlOnEnd If true, "Prev" and "Next" controls will receive a class disabled when slide is the first or the last
    * Note: Only used when infiniteLoop: false
    * 
    * default: false
    * options: boolean (true / false)
    */
  var hideControlOnEnd: js.UndefOr[Boolean] = js.native
  
  /**
    * infiniteLoop If true, clicking "Next" while on the last slide will transition to the first slide and vice-versa
    * 
    * default: true
    * options: boolean (true / false)
    */
  var infiniteLoop: js.UndefOr[Boolean] = js.native
  
  /**
    * keyboardEnabled Allows for keyboard control of visible slider. Keypress ignored if slider not visible.
    * 
    * default: false
    * options: boolean (true / false)
    */
  var keyboardEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * maxSlides The maximum number of slides to be shown. Slides will be sized up if carousel becomes larger than the original size.
    * 
    * default: 1
    * options: integer
    */
  var maxSlides: js.UndefOr[Double] = js.native
  
  /**
    * minSlides The minimum number of slides to be shown. Slides will be sized down if carousel becomes smaller than the original size.
    * 
    * default: 1
    * options: integer
    */
  var minSlides: js.UndefOr[Double] = js.native
  
  /**
    * mode Type of transition between slides
    * 
    * default: 'horizontal'
    * options: 'horizontal', 'vertical', 'fade'
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * moveSlides The number of slides to move on transition. This value must be >= minSlides, and <= maxSlides. If zero (default), the number of fully-visible slides will be used.
    * 
    * default: 0
    * options: integer
    */
  var moveSlides: js.UndefOr[Double] = js.native
  
  /**
    * nextSelector Element used to populate the "Next" control
    * 
    * default: null
    * options: jQuery selector
    */
  var nextSelector: js.UndefOr[String] = js.native
  
  /**
    * nextText Text to be used for the "Next" control
    * 
    * default: 'Next'
    * options: string
    */
  var nextText: js.UndefOr[String] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  /**
    * onSliderLoad Executes immediately after the slider is fully loaded
    * 
    * default: function(){}
    * options: function(currentIndex){ // your code here }
    * arguments:
    *   currentIndex: element index of the current slide
    */
  var onSliderLoad: js.UndefOr[js.Function1[/* currentIndex */ js.UndefOr[Double], Unit]] = js.native
  
  /**
    * onSliderResize Executes immediately after the slider is resized
    * 
    * default: function(){}
    * options: function(currentIndex){ // your code here }
    * arguments:
    *   currentIndex: element index of the current slide
    */
  var onSliderResize: js.UndefOr[js.Function1[/* currentIndex */ js.UndefOr[Double], Unit]] = js.native
  
  /**
    * oneToOneTouch If true, non-fade slides follow the finger as it swipes
    * 
    * default: true
    * options: boolean (true / false)
    */
  var oneToOneTouch: js.UndefOr[Boolean] = js.native
  
  /**
    * pager If true, a pager will be added
    * 
    * default: true
    * options: boolean (true / false)
    */
  var pager: js.UndefOr[Boolean] = js.native
  
  /**
    * pagerCustom Parent element to be used as the pager. Parent element must contain a <a data-slide-index="x"> element for each slide. See example here. Not for use with dynamic carousels.
    * 
    * default: null
    * options: jQuery selector
    */
  var pagerCustom: js.UndefOr[String] = js.native
  
  /**
    * pagerSelector Element used to populate the populate the pager. By default, the pager is appended to the bx-viewport
    * 
    * default: ''
    * options: jQuery selector
    */
  var pagerSelector: js.UndefOr[String] = js.native
  
  /**
    * pagerShortSeparator If pagerType: 'short', pager will use this value as the separating character
    * 
    * default: ' / '
    * options: string
    */
  var pagerShortSeparator: js.UndefOr[String] = js.native
  
  /**
    * pagerType If 'full', a pager link will be generated for each slide. If 'short', a x / y pager will be used (ex. 1 / 5)
    * 
    * default: 'full'
    * options: 'full', 'short'
    */
  var pagerType: js.UndefOr[String] = js.native
  
  /**
    * pause The amount of time (in ms) between each auto transition
    * 
    * default: 4000
    * options: integer
    */
  var pause: js.UndefOr[Double] = js.native
  
  /**
    * preloadImages If 'all', preloads all images before starting the slider. If 'visible', preloads only images in the initially visible slides before starting the slider (tip: use 'visible' if all slides are identical dimensions)
    * 
    * default: 'visible'
    * options: 'all', 'visible'
    */
  var preloadImages: js.UndefOr[String] = js.native
  
  /**
    * prevSelector Element used to populate the "Prev" control
    * 
    * default: null
    * options: jQuery selector
    */
  var prevSelector: js.UndefOr[String] = js.native
  
  /**
    * prevText Text to be used for the "Prev" control
    * 
    * default: 'Prev'
    * options: string
    */
  var prevText: js.UndefOr[String] = js.native
  
  /**
    * preventDefaultSwipeX If true, touch screen will not move along the x-axis as the finger swipes
    * 
    * default: true
    * options: boolean (true / false)
    */
  var preventDefaultSwipeX: js.UndefOr[Boolean] = js.native
  
  /**
    * preventDefaultSwipeY If true, touch screen will not move along the y-axis as the finger swipes
    * 
    * default: false
    * options: boolean (true / false)
    */
  var preventDefaultSwipeY: js.UndefOr[Boolean] = js.native
  
  /**
    * randomStart Start slider on a random slide
    * 
    * default: false
    * options: boolean (true / false)
    */
  var randomStart: js.UndefOr[Boolean] = js.native
  
  /**
    * responsive Enable or disable auto resize of the slider. Useful if you need to use fixed width sliders.
    * 
    * default: true
    * options: boolean (true / false)
    */
  var responsive: js.UndefOr[Boolean] = js.native
  
  /**
    * shrinkItems The Carousel will only show whole items and shrink the images to fit the viewport based on maxSlides/MinSlides.
    * 
    * default: false
    * options: boolean (true / false)
    */
  var shrinkItems: js.UndefOr[Boolean] = js.native
  
  /**
    * slideMargin Margin between each slide
    * 
    * default: 0
    * options: integer
    */
  var slideMargin: js.UndefOr[Double] = js.native
  
  /**
    * slideSelector Element to use as slides (ex. 'div.slide').
    * Note: by default, bxSlider will use all immediate children of the slider element
    * 
    * default: ''
    * options: jQuery selector
    */
  var slideSelector: js.UndefOr[String] = js.native
  
  /**
    * slideWidth The width of each slide. This setting is required for all horizontal carousels!
    * 
    * default: 0
    * options: integer
    */
  var slideWidth: js.UndefOr[Double] = js.native
  
  /**
    * speed Slide transition duration (in ms)
    * 
    * default: 500
    * options: integer
    */
  var speed: js.UndefOr[Double] = js.native
  
  /**
    * startSlide Starting slide index (zero-based)
    * 
    * default: 0
    * options: integer
    */
  var startSlide: js.UndefOr[Double] = js.native
  
  /**
    * startText Text to be used for the "Start" control
    * 
    * default: 'Start'
    * options: string
    */
  var startText: js.UndefOr[String] = js.native
  
  /**
    * stopAutoOnClick Auto will stop on interaction with controls
    * 
    * default: false
    * options: boolean (true / false)
    */
  var stopAutoOnClick: js.UndefOr[Boolean] = js.native
  
  /**
    * stopText Text to be used for the "Stop" control
    * 
    * default: 'Stop'
    * options: string
    */
  var stopText: js.UndefOr[String] = js.native
  
  /**
    * swipeThreshold Amount of pixels a touch swipe needs to exceed in order to execute a slide transition. Note: only used if touchEnabled: true
    * 
    * default: 50
    * options: integer
    */
  var swipeThreshold: js.UndefOr[Double] = js.native
  
  /**
    * ticker Use slider in ticker mode (similar to a news ticker)
    * 
    * default: false
    * options: boolean (true / false)
    */
  var ticker: js.UndefOr[Boolean] = js.native
  
  /**
    * tickerHover Ticker will pause when mouse hovers over slider. Note: this functionality does NOT work if using CSS transitions!
    * 
    * default: false
    * options: boolean (true / false)
    */
  var tickerHover: js.UndefOr[Boolean] = js.native
  
  /**
    * touchEnabled If true, slider will allow touch swipe transitions
    * 
    * default: true
    * options: boolean (true / false)
    */
  var touchEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * useCSS If true, CSS transitions will be used for horizontal and vertical slide animations (this uses native hardware acceleration). If false, jQuery animate() will be used.
    * 
    * default: true
    * options: boolean (true / false)
    */
  var useCSS: js.UndefOr[Boolean] = js.native
  
  /**
    * video If any slides contain video, set this to true. Also, include plugins/jquery.fitvids.js
    * See http://fitvidsjs.com/ for more info
    * 
    * default: false
    * options: boolean (true / false)
    */
  var video: js.UndefOr[Boolean] = js.native
  
  /**
    * wrapperClass Class to wrap the slider in. Change to prevent from using default bxSlider styles.
    * 
    * default: 'bx-wrapper'
    * options: string
    */
  var wrapperClass: js.UndefOr[String] = js.native
}
object bxSliderOptions {
  
  @scala.inline
  def apply(): bxSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[bxSliderOptions]
  }
  
  @scala.inline
  implicit class bxSliderOptionsOps[Self <: bxSliderOptions] (val x: Self) extends AnyVal {
    
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
    def setAdaptiveHeight(value: Boolean): Self = this.set("adaptiveHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdaptiveHeight: Self = this.set("adaptiveHeight", js.undefined)
    
    @scala.inline
    def setAdaptiveHeightSpeed(value: Double): Self = this.set("adaptiveHeightSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdaptiveHeightSpeed: Self = this.set("adaptiveHeightSpeed", js.undefined)
    
    @scala.inline
    def setAriaHidden(value: Boolean): Self = this.set("ariaHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaHidden: Self = this.set("ariaHidden", js.undefined)
    
    @scala.inline
    def setAriaLive(value: Boolean): Self = this.set("ariaLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLive: Self = this.set("ariaLive", js.undefined)
    
    @scala.inline
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    
    @scala.inline
    def setAutoControls(value: Boolean): Self = this.set("autoControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoControls: Self = this.set("autoControls", js.undefined)
    
    @scala.inline
    def setAutoControlsCombine(value: Boolean): Self = this.set("autoControlsCombine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoControlsCombine: Self = this.set("autoControlsCombine", js.undefined)
    
    @scala.inline
    def setAutoControlsSelector(value: String): Self = this.set("autoControlsSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoControlsSelector: Self = this.set("autoControlsSelector", js.undefined)
    
    @scala.inline
    def setAutoDelay(value: Double): Self = this.set("autoDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDelay: Self = this.set("autoDelay", js.undefined)
    
    @scala.inline
    def setAutoDirection(value: String): Self = this.set("autoDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDirection: Self = this.set("autoDirection", js.undefined)
    
    @scala.inline
    def setAutoHover(value: Boolean): Self = this.set("autoHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHover: Self = this.set("autoHover", js.undefined)
    
    @scala.inline
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    
    @scala.inline
    def setBuildPager(value: /* slideIndex */ Double => Unit): Self = this.set("buildPager", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBuildPager: Self = this.set("buildPager", js.undefined)
    
    @scala.inline
    def setCaptions(value: Boolean): Self = this.set("captions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptions: Self = this.set("captions", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setHideControlOnEnd(value: Boolean): Self = this.set("hideControlOnEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideControlOnEnd: Self = this.set("hideControlOnEnd", js.undefined)
    
    @scala.inline
    def setInfiniteLoop(value: Boolean): Self = this.set("infiniteLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfiniteLoop: Self = this.set("infiniteLoop", js.undefined)
    
    @scala.inline
    def setKeyboardEnabled(value: Boolean): Self = this.set("keyboardEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardEnabled: Self = this.set("keyboardEnabled", js.undefined)
    
    @scala.inline
    def setMaxSlides(value: Double): Self = this.set("maxSlides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSlides: Self = this.set("maxSlides", js.undefined)
    
    @scala.inline
    def setMinSlides(value: Double): Self = this.set("minSlides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSlides: Self = this.set("minSlides", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMoveSlides(value: Double): Self = this.set("moveSlides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveSlides: Self = this.set("moveSlides", js.undefined)
    
    @scala.inline
    def setNextSelector(value: String): Self = this.set("nextSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextSelector: Self = this.set("nextSelector", js.undefined)
    
    @scala.inline
    def setNextText(value: String): Self = this.set("nextText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextText: Self = this.set("nextText", js.undefined)
    
    @scala.inline
    def setOnSlideAfter(
      value: (/* $slideElement */ js.UndefOr[JQuery], /* oldIndex */ js.UndefOr[Double], /* newIndex */ js.UndefOr[Double]) => Unit
    ): Self = this.set("onSlideAfter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnSlideAfter: Self = this.set("onSlideAfter", js.undefined)
    
    @scala.inline
    def setOnSlideBefore(
      value: (/* $slideElement */ js.UndefOr[JQuery], /* oldIndex */ js.UndefOr[Double], /* newIndex */ js.UndefOr[Double]) => Unit
    ): Self = this.set("onSlideBefore", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnSlideBefore: Self = this.set("onSlideBefore", js.undefined)
    
    @scala.inline
    def setOnSlideNext(
      value: (/* $slideElement */ js.UndefOr[JQuery], /* oldIndex */ js.UndefOr[Double], /* newIndex */ js.UndefOr[Double]) => Unit
    ): Self = this.set("onSlideNext", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnSlideNext: Self = this.set("onSlideNext", js.undefined)
    
    @scala.inline
    def setOnSlidePrev(
      value: (/* $slideElement */ js.UndefOr[JQuery], /* oldIndex */ js.UndefOr[Double], /* newIndex */ js.UndefOr[Double]) => Unit
    ): Self = this.set("onSlidePrev", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnSlidePrev: Self = this.set("onSlidePrev", js.undefined)
    
    @scala.inline
    def setOnSliderLoad(value: /* currentIndex */ js.UndefOr[Double] => Unit): Self = this.set("onSliderLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSliderLoad: Self = this.set("onSliderLoad", js.undefined)
    
    @scala.inline
    def setOnSliderResize(value: /* currentIndex */ js.UndefOr[Double] => Unit): Self = this.set("onSliderResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSliderResize: Self = this.set("onSliderResize", js.undefined)
    
    @scala.inline
    def setOneToOneTouch(value: Boolean): Self = this.set("oneToOneTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneToOneTouch: Self = this.set("oneToOneTouch", js.undefined)
    
    @scala.inline
    def setPager(value: Boolean): Self = this.set("pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePager: Self = this.set("pager", js.undefined)
    
    @scala.inline
    def setPagerCustom(value: String): Self = this.set("pagerCustom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagerCustom: Self = this.set("pagerCustom", js.undefined)
    
    @scala.inline
    def setPagerSelector(value: String): Self = this.set("pagerSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagerSelector: Self = this.set("pagerSelector", js.undefined)
    
    @scala.inline
    def setPagerShortSeparator(value: String): Self = this.set("pagerShortSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagerShortSeparator: Self = this.set("pagerShortSeparator", js.undefined)
    
    @scala.inline
    def setPagerType(value: String): Self = this.set("pagerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagerType: Self = this.set("pagerType", js.undefined)
    
    @scala.inline
    def setPause(value: Double): Self = this.set("pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    
    @scala.inline
    def setPreloadImages(value: String): Self = this.set("preloadImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreloadImages: Self = this.set("preloadImages", js.undefined)
    
    @scala.inline
    def setPrevSelector(value: String): Self = this.set("prevSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevSelector: Self = this.set("prevSelector", js.undefined)
    
    @scala.inline
    def setPrevText(value: String): Self = this.set("prevText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevText: Self = this.set("prevText", js.undefined)
    
    @scala.inline
    def setPreventDefaultSwipeX(value: Boolean): Self = this.set("preventDefaultSwipeX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDefaultSwipeX: Self = this.set("preventDefaultSwipeX", js.undefined)
    
    @scala.inline
    def setPreventDefaultSwipeY(value: Boolean): Self = this.set("preventDefaultSwipeY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDefaultSwipeY: Self = this.set("preventDefaultSwipeY", js.undefined)
    
    @scala.inline
    def setRandomStart(value: Boolean): Self = this.set("randomStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandomStart: Self = this.set("randomStart", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setShrinkItems(value: Boolean): Self = this.set("shrinkItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShrinkItems: Self = this.set("shrinkItems", js.undefined)
    
    @scala.inline
    def setSlideMargin(value: Double): Self = this.set("slideMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideMargin: Self = this.set("slideMargin", js.undefined)
    
    @scala.inline
    def setSlideSelector(value: String): Self = this.set("slideSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideSelector: Self = this.set("slideSelector", js.undefined)
    
    @scala.inline
    def setSlideWidth(value: Double): Self = this.set("slideWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideWidth: Self = this.set("slideWidth", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setStartSlide(value: Double): Self = this.set("startSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartSlide: Self = this.set("startSlide", js.undefined)
    
    @scala.inline
    def setStartText(value: String): Self = this.set("startText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartText: Self = this.set("startText", js.undefined)
    
    @scala.inline
    def setStopAutoOnClick(value: Boolean): Self = this.set("stopAutoOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopAutoOnClick: Self = this.set("stopAutoOnClick", js.undefined)
    
    @scala.inline
    def setStopText(value: String): Self = this.set("stopText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopText: Self = this.set("stopText", js.undefined)
    
    @scala.inline
    def setSwipeThreshold(value: Double): Self = this.set("swipeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeThreshold: Self = this.set("swipeThreshold", js.undefined)
    
    @scala.inline
    def setTicker(value: Boolean): Self = this.set("ticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicker: Self = this.set("ticker", js.undefined)
    
    @scala.inline
    def setTickerHover(value: Boolean): Self = this.set("tickerHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickerHover: Self = this.set("tickerHover", js.undefined)
    
    @scala.inline
    def setTouchEnabled(value: Boolean): Self = this.set("touchEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchEnabled: Self = this.set("touchEnabled", js.undefined)
    
    @scala.inline
    def setUseCSS(value: Boolean): Self = this.set("useCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCSS: Self = this.set("useCSS", js.undefined)
    
    @scala.inline
    def setVideo(value: Boolean): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    
    @scala.inline
    def setWrapperClass(value: String): Self = this.set("wrapperClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperClass: Self = this.set("wrapperClass", js.undefined)
  }
}
