package typings
package dwDashBxsliderDash4Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait bxSliderOptions extends js.Object {
  /**
    * adaptiveHeight Dynamically adjust slider height based on each slide's height
    * 
    * default: false
    * options: boolean (true / false)
    */
  var adaptiveHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * adaptiveHeightSpeed Slide height transition duration (in ms). Note: only used if adaptiveHeight: true
    * 
    * default: 500
    * options: integer
    */
  var adaptiveHeightSpeed: js.UndefOr[scala.Double] = js.undefined
  /**
    * ariaHidden Adds Aria Hidden attribute to any nonvisible slides.
    * 
    * default: true
    * options: boolean (true / false)
    */
  var ariaHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * ariaLive Adds Aria Live attribute to slider.
    * 
    * default: true
    * options: boolean (true / false)
    */
  var ariaLive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * auto Slides will automatically transition
    * 
    * default: false
    * options: boolean (true / false)
    */
  var auto: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * autoControls If true, "Start" / "Stop" controls will be added
    * 
    * default: false
    * options: boolean (true / false)
    */
  var autoControls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * autoControlsCombine When slideshow is playing only "Stop" control is displayed and vice-versa
    * 
    * default: false
    * options: boolean (true / false)
    */
  var autoControlsCombine: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * autoControlsSelector Element used to populate the auto controls
    * 
    * default: null
    * options: jQuery selector
    */
  var autoControlsSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * autoDelay Time (in ms) auto show should wait before starting
    * 
    * default: 0
    * options: integer
    */
  var autoDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * autoDirection The direction of auto show slide transitions
    * 
    * default: 'next'
    * options: 'next', 'prev'
    */
  var autoDirection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * autoHover Auto show will pause when mouse hovers over slider
    * 
    * default: false
    * options: boolean (true / false)
    */
  var autoHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * autoStart Auto show starts playing on load. If false, slideshow will start when the "Start" control is clicked
    * 
    * default: true
    * options: boolean (true / false)
    */
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * buildPager If supplied, function is called on every slide element, and the returned value is used as the pager item markup.
    * See examples for detailed implementation
    * 
    * default: null
    * options: functoin(slideIndex)
    */
  var buildPager: js.UndefOr[js.Function1[/* slideIndex */ scala.Double, scala.Unit]] = js.undefined
  /**
    * captions Include image captions. Captions are derived from the image's title attribute
    * 
    * default: false
    * options: boolean (true / false)
    */
  var captions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * controls If true, "Next" / "Prev" controls will be added
    * 
    * default: true
    * options: boolean (true / false)
    */
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * easing The type of "easing" to use during transitions. If using CSS transitions, include a value for the transition-timing-function property. If not using CSS transitions, you may include plugins/jquery.easing.1.3.js for many options.
    * See http://gsgd.co.uk/sandbox/jquery/easing/ for more info.
    * 
    * default: null
    * options: if using CSS: 'linear', 'ease', 'ease-in', 'ease-out', 'ease-in-out', 'cubic-bezier(n,n,n,n)'. If not using CSS: 'swing', 'linear' (see the above file for more options)
    */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * hideControlOnEnd If true, "Prev" and "Next" controls will receive a class disabled when slide is the first or the last
    * Note: Only used when infiniteLoop: false
    * 
    * default: false
    * options: boolean (true / false)
    */
  var hideControlOnEnd: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * infiniteLoop If true, clicking "Next" while on the last slide will transition to the first slide and vice-versa
    * 
    * default: true
    * options: boolean (true / false)
    */
  var infiniteLoop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * keyboardEnabled Allows for keyboard control of visible slider. Keypress ignored if slider not visible.
    * 
    * default: false
    * options: boolean (true / false)
    */
  var keyboardEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * maxSlides The maximum number of slides to be shown. Slides will be sized up if carousel becomes larger than the original size.
    * 
    * default: 1
    * options: integer
    */
  var maxSlides: js.UndefOr[scala.Double] = js.undefined
  /**
    * minSlides The minimum number of slides to be shown. Slides will be sized down if carousel becomes smaller than the original size.
    * 
    * default: 1
    * options: integer
    */
  var minSlides: js.UndefOr[scala.Double] = js.undefined
  /**
    * mode Type of transition between slides
    * 
    * default: 'horizontal'
    * options: 'horizontal', 'vertical', 'fade'
    */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * moveSlides The number of slides to move on transition. This value must be >= minSlides, and <= maxSlides. If zero (default), the number of fully-visible slides will be used.
    * 
    * default: 0
    * options: integer
    */
  var moveSlides: js.UndefOr[scala.Double] = js.undefined
  /**
    * nextSelector Element used to populate the "Next" control
    * 
    * default: null
    * options: jQuery selector
    */
  var nextSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * nextText Text to be used for the "Next" control
    * 
    * default: 'Next'
    * options: string
    */
  var nextText: js.UndefOr[java.lang.String] = js.undefined
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
      /* oldIndex */ js.UndefOr[scala.Double], 
      /* newIndex */ js.UndefOr[scala.Double], 
      scala.Unit
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
      /* oldIndex */ js.UndefOr[scala.Double], 
      /* newIndex */ js.UndefOr[scala.Double], 
      scala.Unit
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
      /* oldIndex */ js.UndefOr[scala.Double], 
      /* newIndex */ js.UndefOr[scala.Double], 
      scala.Unit
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
      /* oldIndex */ js.UndefOr[scala.Double], 
      /* newIndex */ js.UndefOr[scala.Double], 
      scala.Unit
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
  var onSliderLoad: js.UndefOr[js.Function1[/* currentIndex */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /**
    * onSliderResize Executes immediately after the slider is resized
    * 
    * default: function(){}
    * options: function(currentIndex){ // your code here }
    * arguments:
    *   currentIndex: element index of the current slide
    */
  var onSliderResize: js.UndefOr[js.Function1[/* currentIndex */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /**
    * oneToOneTouch If true, non-fade slides follow the finger as it swipes
    * 
    * default: true
    * options: boolean (true / false)
    */
  var oneToOneTouch: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * pager If true, a pager will be added
    * 
    * default: true
    * options: boolean (true / false)
    */
  var pager: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * pagerCustom Parent element to be used as the pager. Parent element must contain a <a data-slide-index="x"> element for each slide. See example here. Not for use with dynamic carousels.
    * 
    * default: null
    * options: jQuery selector
    */
  var pagerCustom: js.UndefOr[java.lang.String] = js.undefined
  /**
    * pagerSelector Element used to populate the populate the pager. By default, the pager is appended to the bx-viewport
    * 
    * default: ''
    * options: jQuery selector
    */
  var pagerSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * pagerShortSeparator If pagerType: 'short', pager will use this value as the separating character
    * 
    * default: ' / '
    * options: string
    */
  var pagerShortSeparator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * pagerType If 'full', a pager link will be generated for each slide. If 'short', a x / y pager will be used (ex. 1 / 5)
    * 
    * default: 'full'
    * options: 'full', 'short'
    */
  var pagerType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * pause The amount of time (in ms) between each auto transition
    * 
    * default: 4000
    * options: integer
    */
  var pause: js.UndefOr[scala.Double] = js.undefined
  /**
    * preloadImages If 'all', preloads all images before starting the slider. If 'visible', preloads only images in the initially visible slides before starting the slider (tip: use 'visible' if all slides are identical dimensions)
    * 
    * default: 'visible'
    * options: 'all', 'visible'
    */
  var preloadImages: js.UndefOr[java.lang.String] = js.undefined
  /**
    * prevSelector Element used to populate the "Prev" control
    * 
    * default: null
    * options: jQuery selector
    */
  var prevSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * prevText Text to be used for the "Prev" control
    * 
    * default: 'Prev'
    * options: string
    */
  var prevText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * preventDefaultSwipeX If true, touch screen will not move along the x-axis as the finger swipes
    * 
    * default: true
    * options: boolean (true / false)
    */
  var preventDefaultSwipeX: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * preventDefaultSwipeY If true, touch screen will not move along the y-axis as the finger swipes
    * 
    * default: false
    * options: boolean (true / false)
    */
  var preventDefaultSwipeY: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * randomStart Start slider on a random slide
    * 
    * default: false
    * options: boolean (true / false)
    */
  var randomStart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * responsive Enable or disable auto resize of the slider. Useful if you need to use fixed width sliders.
    * 
    * default: true
    * options: boolean (true / false)
    */
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * shrinkItems The Carousel will only show whole items and shrink the images to fit the viewport based on maxSlides/MinSlides.
    * 
    * default: false
    * options: boolean (true / false)
    */
  var shrinkItems: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * slideMargin Margin between each slide
    * 
    * default: 0
    * options: integer
    */
  var slideMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    * slideSelector Element to use as slides (ex. 'div.slide').
    * Note: by default, bxSlider will use all immediate children of the slider element
    * 
    * default: ''
    * options: jQuery selector
    */
  var slideSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * slideWidth The width of each slide. This setting is required for all horizontal carousels!
    * 
    * default: 0
    * options: integer
    */
  var slideWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * speed Slide transition duration (in ms)
    * 
    * default: 500
    * options: integer
    */
  var speed: js.UndefOr[scala.Double] = js.undefined
  /**
    * startSlide Starting slide index (zero-based)
    * 
    * default: 0
    * options: integer
    */
  var startSlide: js.UndefOr[scala.Double] = js.undefined
  /**
    * startText Text to be used for the "Start" control
    * 
    * default: 'Start'
    * options: string
    */
  var startText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * stopAutoOnClick Auto will stop on interaction with controls
    * 
    * default: false
    * options: boolean (true / false)
    */
  var stopAutoOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * stopText Text to be used for the "Stop" control
    * 
    * default: 'Stop'
    * options: string
    */
  var stopText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * swipeThreshold Amount of pixels a touch swipe needs to exceed in order to execute a slide transition. Note: only used if touchEnabled: true
    * 
    * default: 50
    * options: integer
    */
  var swipeThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * ticker Use slider in ticker mode (similar to a news ticker)
    * 
    * default: false
    * options: boolean (true / false)
    */
  var ticker: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * tickerHover Ticker will pause when mouse hovers over slider. Note: this functionality does NOT work if using CSS transitions!
    * 
    * default: false
    * options: boolean (true / false)
    */
  var tickerHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * touchEnabled If true, slider will allow touch swipe transitions
    * 
    * default: true
    * options: boolean (true / false)
    */
  var touchEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * useCSS If true, CSS transitions will be used for horizontal and vertical slide animations (this uses native hardware acceleration). If false, jQuery animate() will be used.
    * 
    * default: true
    * options: boolean (true / false)
    */
  var useCSS: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * video If any slides contain video, set this to true. Also, include plugins/jquery.fitvids.js
    * See http://fitvidsjs.com/ for more info
    * 
    * default: false
    * options: boolean (true / false)
    */
  var video: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * wrapperClass Class to wrap the slider in. Change to prevent from using default bxSlider styles.
    * 
    * default: 'bx-wrapper'
    * options: string
    */
  var wrapperClass: js.UndefOr[java.lang.String] = js.undefined
}

