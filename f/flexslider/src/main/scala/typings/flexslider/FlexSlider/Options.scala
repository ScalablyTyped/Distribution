package typings.flexslider.FlexSlider

import typings.flexslider.JQuery
import typings.flexslider.flexsliderStrings.fade
import typings.flexslider.flexsliderStrings.horizontal
import typings.flexslider.flexsliderStrings.linear
import typings.flexslider.flexsliderStrings.slide
import typings.flexslider.flexsliderStrings.swing
import typings.flexslider.flexsliderStrings.thumbnails
import typings.flexslider.flexsliderStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Whether or not to allow a slider comprised of a single slide
    * @default true
    */
  var allowOneSlide: js.UndefOr[Boolean] = js.native
  
  /**
    * Select your animation type, "fade" or "slide"
    * @default fade
    */
  var animation: js.UndefOr[fade | slide] = js.native
  
  /**
    * Should the animation loop? If false, directionNav will received "disable"
    * classes at either end
    * @default true
    */
  var animationLoop: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the speed of animations, in milliseconds
    * @default 600
    * @since v1.9
    */
  var animationSpeed: js.UndefOr[Double] = js.native
  
  /**
    * Internal property exposed for turning the slider into a
    * thumbnail navigation for another slider
    */
  var asNavFor: js.UndefOr[String] = js.native
  
  // Primary Controls
  /**
    * Create navigation for paging control of each slide? Note: Leave true for
    * manualControls usage
    * @default true
    */
  var controlNav: js.UndefOr[thumbnails | Boolean] = js.native
  
  // Special properties
  /**
    * Declare which container the navigation elements should be appended too.
    * Default container is the FlexSlider element. Example use would be
    * $(".flexslider-container"). Property is ignored if given element is not
    * found.
    */
  var controlsContainer: js.UndefOr[JQuery] = js.native
  
  /**
    * Custom prev / next button. Must be two jQuery elements. In order to make
    * the events work they have to have the classes "prev" and "next" (plus
    * namespace)
    */
  var customDirectionNav: js.UndefOr[JQuery] = js.native
  
  /**
    * Select the sliding direction, "horizontal" or "vertical"
    * @default horizontal
    * @since v1.9
    */
  var direction: js.UndefOr[horizontal | vertical] = js.native
  
  /**
    * Create navigation for previous/next navigation? (true/false)
    * @default true
    */
  var directionNav: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines the easing method used in jQuery transitions. jQuery easing
    * plugin is supported!
    * @default swing
    */
  var easing: js.UndefOr[swing | linear | String] = js.native
  
  /**
    * Fade in the first slide when animation type is "fade"
    * @default true
    */
  var fadeFirstSlide: js.UndefOr[Boolean] = js.native
  
  /**
    * Set an initialization delay, in milliseconds
    * @default 0
    */
  var initDelay: js.UndefOr[Double] = js.native
  
  // Browser Specific
  /**
    * Set to true when Firefox is the browser used.
    * @default false
    */
  var isFirefox: js.UndefOr[Boolean] = js.native
  
  /**
    * Margin between carousel items.
    * @default 0
    */
  var itemMargin: js.UndefOr[Double] = js.native
  
  // Carousel Options
  /**
    * Box-model width of individual carousel items, including
    * horizontal borders and padding.
    * @default 0
    */
  var itemWidth: js.UndefOr[Double] = js.native
  
  // Secondary Navigation
  /**
    * Allow slider navigating via keyboard left/right keys
    * @default true
    * @since v1.9
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  
  /**
    * Declare custom control navigation. Examples would be $(".flex-control-nav
    * li") or "#tabs-nav li img", etc. The number of elements in your
    * controlNav should match the number of slides/tabs.
    */
  var manualControls: js.UndefOr[JQuery] = js.native
  
  /**
    * Maxmimum number of carousel items that should be visible.
    * Items will resize fluidly when above this limit.
    * @default 0
    */
  var maxItems: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of carousel items that should be visible.
    * Items will resize fluidly when below this.
    * @default 1
    */
  var minItems: js.UndefOr[Double] = js.native
  
  /**
    * Requires jquery.mousewheel.js
    * (https://github.com/brandonaaron/jquery-mousewheel) - Allows slider
    * navigating via mousewheel
    * @default false
    */
  var mousewheel: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of carousel items that should move on animation. If
    * 0, slider will move all visible items.
    * @default 0
    */
  var move: js.UndefOr[Double] = js.native
  
  /**
    * Allow keyboard navigation to affect multiple sliders. Default behavior
    * cuts out keyboard navigation with more than one slider present.
    * @default false
    */
  var multipleKeyboard: js.UndefOr[Boolean] = js.native
  
  /**
    * Prefix string attached to the class of every element generated by the
    * plugin
    */
  var namespace: js.UndefOr[String] = js.native
  
  /**
    * Set the text for the "next" directionNav item
    * @default Next
    */
  var nextText: js.UndefOr[String] = js.native
  
  /**
    * Pause the slideshow when tab is invisible, resume when visible. Provides
    * better UX, lower CPU usage.
    * @default true
    */
  var pauseInvisible: js.UndefOr[Boolean] = js.native
  
  // Usability features
  /**
    * Pause the slideshow when interacting with control elements, highly
    * recommended.
    * @default true
    */
  var pauseOnAction: js.UndefOr[Boolean] = js.native
  
  /**
    * Pause the slideshow when hovering over slider, then resume when no longer
    * hovering
    * @default false
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  
  /**
    * Create pause/play dynamic element
    * @default false
    */
  var pausePlay: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the text for the "pause" pausePlay item
    * @default Pause
    */
  var pauseText: js.UndefOr[String] = js.native
  
  /**
    * Set the text for the "play" pausePlay item
    * @default Play
    */
  var playText: js.UndefOr[String] = js.native
  
  /**
    * Set the text for the "previous" directionNav item
    * @default Previous
    */
  var prevText: js.UndefOr[String] = js.native
  
  /**
    * Randomize slide order
    * @default false
    */
  var randomize: js.UndefOr[Boolean] = js.native
  
  /**
    * Reverse the animation direction
    * @default false
    */
  var reverse: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not to enable RTL mode
    * @default false
    */
  var rtl: js.UndefOr[Boolean] = js.native
  
  /**
    * Must match a simple pattern. '{container} > {slide}' -- Ignore pattern at
    * your own peril
    */
  var selector: js.UndefOr[String] = js.native
  
  /**
    * Animate slider automatically
    * @default true
    */
  var slideshow: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the speed of the slideshow cycling, in milliseconds
    * @default 7000
    */
  var slideshowSpeed: js.UndefOr[Double] = js.native
  
  /**
    * Allow height of the slider to animate smoothly in horizontal mode
    * @default false
    */
  var smoothHeight: js.UndefOr[Boolean] = js.native
  
  /**
    * The slide that the slider should start on. Array notation (0 = first
    * slide)
    * @default 0
    * @since v1.9
    */
  var startAt: js.UndefOr[Double] = js.native
  
  /**
    * Mirror the actions performed on this slider with another
    * slider. Use with care.
    */
  var sync: js.UndefOr[String] = js.native
  
  /**
    * Whether or not to put captions on thumbnails when using the "thumbnails"
    * controlNav.
    * @default false
    */
  var thumbCaptions: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow touch swipe navigation of the slider on touch-enabled devices
    * @default true
    */
  var touch: js.UndefOr[Boolean] = js.native
  
  /**
    * Slider will use CSS3 transitions if available
    * @default true
    */
  var useCSS: js.UndefOr[Boolean] = js.native
  
  /**
    * If using video in the slider, will prevent CSS3 3D Transforms to avoid
    * graphical glitches
    * @default false
    */
  var video: js.UndefOr[Boolean] = js.native
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
    def setAllowOneSlide(value: Boolean): Self = this.set("allowOneSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOneSlide: Self = this.set("allowOneSlide", js.undefined)
    
    @scala.inline
    def setAnimation(value: fade | slide): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAnimationLoop(value: Boolean): Self = this.set("animationLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationLoop: Self = this.set("animationLoop", js.undefined)
    
    @scala.inline
    def setAnimationSpeed(value: Double): Self = this.set("animationSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationSpeed: Self = this.set("animationSpeed", js.undefined)
    
    @scala.inline
    def setAsNavFor(value: String): Self = this.set("asNavFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsNavFor: Self = this.set("asNavFor", js.undefined)
    
    @scala.inline
    def setControlNav(value: thumbnails | Boolean): Self = this.set("controlNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlNav: Self = this.set("controlNav", js.undefined)
    
    @scala.inline
    def setControlsContainer(value: JQuery): Self = this.set("controlsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlsContainer: Self = this.set("controlsContainer", js.undefined)
    
    @scala.inline
    def setCustomDirectionNav(value: JQuery): Self = this.set("customDirectionNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDirectionNav: Self = this.set("customDirectionNav", js.undefined)
    
    @scala.inline
    def setDirection(value: horizontal | vertical): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDirectionNav(value: Boolean): Self = this.set("directionNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionNav: Self = this.set("directionNav", js.undefined)
    
    @scala.inline
    def setEasing(value: swing | linear | String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setFadeFirstSlide(value: Boolean): Self = this.set("fadeFirstSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeFirstSlide: Self = this.set("fadeFirstSlide", js.undefined)
    
    @scala.inline
    def setInitDelay(value: Double): Self = this.set("initDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitDelay: Self = this.set("initDelay", js.undefined)
    
    @scala.inline
    def setIsFirefox(value: Boolean): Self = this.set("isFirefox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFirefox: Self = this.set("isFirefox", js.undefined)
    
    @scala.inline
    def setItemMargin(value: Double): Self = this.set("itemMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemMargin: Self = this.set("itemMargin", js.undefined)
    
    @scala.inline
    def setItemWidth(value: Double): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setManualControls(value: JQuery): Self = this.set("manualControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualControls: Self = this.set("manualControls", js.undefined)
    
    @scala.inline
    def setMaxItems(value: Double): Self = this.set("maxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItems: Self = this.set("maxItems", js.undefined)
    
    @scala.inline
    def setMinItems(value: Double): Self = this.set("minItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinItems: Self = this.set("minItems", js.undefined)
    
    @scala.inline
    def setMousewheel(value: Boolean): Self = this.set("mousewheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMousewheel: Self = this.set("mousewheel", js.undefined)
    
    @scala.inline
    def setMove(value: Double): Self = this.set("move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    
    @scala.inline
    def setMultipleKeyboard(value: Boolean): Self = this.set("multipleKeyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleKeyboard: Self = this.set("multipleKeyboard", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setNextText(value: String): Self = this.set("nextText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextText: Self = this.set("nextText", js.undefined)
    
    @scala.inline
    def setPauseInvisible(value: Boolean): Self = this.set("pauseInvisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseInvisible: Self = this.set("pauseInvisible", js.undefined)
    
    @scala.inline
    def setPauseOnAction(value: Boolean): Self = this.set("pauseOnAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseOnAction: Self = this.set("pauseOnAction", js.undefined)
    
    @scala.inline
    def setPauseOnHover(value: Boolean): Self = this.set("pauseOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseOnHover: Self = this.set("pauseOnHover", js.undefined)
    
    @scala.inline
    def setPausePlay(value: Boolean): Self = this.set("pausePlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePausePlay: Self = this.set("pausePlay", js.undefined)
    
    @scala.inline
    def setPauseText(value: String): Self = this.set("pauseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseText: Self = this.set("pauseText", js.undefined)
    
    @scala.inline
    def setPlayText(value: String): Self = this.set("playText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayText: Self = this.set("playText", js.undefined)
    
    @scala.inline
    def setPrevText(value: String): Self = this.set("prevText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevText: Self = this.set("prevText", js.undefined)
    
    @scala.inline
    def setRandomize(value: Boolean): Self = this.set("randomize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandomize: Self = this.set("randomize", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setSlideshow(value: Boolean): Self = this.set("slideshow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideshow: Self = this.set("slideshow", js.undefined)
    
    @scala.inline
    def setSlideshowSpeed(value: Double): Self = this.set("slideshowSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideshowSpeed: Self = this.set("slideshowSpeed", js.undefined)
    
    @scala.inline
    def setSmoothHeight(value: Boolean): Self = this.set("smoothHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmoothHeight: Self = this.set("smoothHeight", js.undefined)
    
    @scala.inline
    def setStartAt(value: Double): Self = this.set("startAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAt: Self = this.set("startAt", js.undefined)
    
    @scala.inline
    def setSync(value: String): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
    
    @scala.inline
    def setThumbCaptions(value: Boolean): Self = this.set("thumbCaptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbCaptions: Self = this.set("thumbCaptions", js.undefined)
    
    @scala.inline
    def setTouch(value: Boolean): Self = this.set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
    
    @scala.inline
    def setUseCSS(value: Boolean): Self = this.set("useCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCSS: Self = this.set("useCSS", js.undefined)
    
    @scala.inline
    def setVideo(value: Boolean): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
}
