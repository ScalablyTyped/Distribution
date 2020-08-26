package typings.flexslider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexSliderOptions extends js.Object {
                //Callback: function(slider) - Fires when the slider reaches the last slide (asynchronous)
  var added: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.native
             //Callback: function(slider) - Fires asynchronously with each slider animation
  var after: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.native
         //{NEW} Selector: Must match a simple pattern. '{container} > {slide}' -- Ignore pattern at your own peril
  var animation: js.UndefOr[String] = js.native
                   //{NEW} Boolean: Reverse the animation direction
  var animationLoop: js.UndefOr[Boolean] = js.native
             //Integer: Set the speed of the slideshow cycling, in milliseconds
  var animationSpeed: js.UndefOr[Double] = js.native
                         //{NEW} Selector: Mirror the actions performed on this slider with another slider. Use with care.
  var asNavFor: js.UndefOr[String] = js.native
              //Callback: function(slider) - Fires when the slider loads the first slide
  var before: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.native
                     //{NEW} Boolean: If using video in the slider, will prevent CSS3 3D Transforms to avoid graphical glitches
  // Primary Controls
  var controlNav: js.UndefOr[js.Any] = js.native
                 //String: Set the text for the "play" pausePlay item
  // Special properties
  var controlsContainer: js.UndefOr[String] = js.native
                 //{NEW} String: Determines the easing method used in jQuery transitions. jQuery easing plugin is supported!
  var direction: js.UndefOr[String] = js.native
                 //Boolean: Create navigation for paging control of each clide? Note: Leave true for manualControls usage
  var directionNav: js.UndefOr[Boolean] = js.native
                //String: Select your animation type, "fade" or "slide"
  var easing: js.UndefOr[String] = js.native
              //Callback: function(slider) - Fires after each slider animation completes
  var end: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.native
              //Integer: Set the speed of animations, in milliseconds
  var initDelay: js.UndefOr[Double] = js.native
                     //{NEW} Integer: Box-model width of individual carousel items, including horizontal borders and padding.
  var itemMargin: js.UndefOr[Double] = js.native
                     //{NEW} Selector: Internal property exposed for turning the slider into a thumbnail navigation for another slider
  // Carousel Options
  var itemWidth: js.UndefOr[Double] = js.native
                 //String: Set the text for the "next" directionNav item
  // Secondary Navigation
  var keyboard: js.UndefOr[Boolean] = js.native
            //{UPDATED} Selector: USE CLASS SELECTOR. Declare which container the navigation elements should be appended too. Default container is the FlexSlider element. Example use would be ".flexslider-container". Property is ignored if given element is not found.
  var manualControls: js.UndefOr[String] = js.native
                      //{NEW} Integer: Minimum number of carousel items that should be visible. Items will resize fluidly when below this.
  var maxItems: js.UndefOr[Double] = js.native
                    //{NEW} Integer: Margin between carousel items.
  var minItems: js.UndefOr[Double] = js.native
          //{NEW} Boolean: Allow keyboard navigation to affect multiple sliders. Default behavior cuts out keyboard navigation with more than one slider present.
  var mousewheel: js.UndefOr[Boolean] = js.native
                      //{NEW} Integer: Maxmimum number of carousel items that should be visible. Items will resize fluidly when above this limit.
  var move: js.UndefOr[Double] = js.native
                   //Boolean: Allow slider navigating via keyboard left/right keys
  var multipleKeyboard: js.UndefOr[Boolean] = js.native
  var namespace: js.UndefOr[String] = js.native
             //String: Set the text for the "previous" directionNav item
  var nextText: js.UndefOr[String] = js.native
                 //Boolean: Randomize slide order
  // Usability features
  var pauseOnAction: js.UndefOr[Boolean] = js.native
              //Boolean: Pause the slideshow when interacting with control elements, highly recommended.
  var pauseOnHover: js.UndefOr[Boolean] = js.native
                //{UPDATED} Boolean: Requires jquery.mousewheel.js (https://github.com/brandonaaron/jquery-mousewheel) - Allows slider navigating via mousewheel
  var pausePlay: js.UndefOr[Boolean] = js.native
                 //Boolean: Create pause/play dynamic element
  var pauseText: js.UndefOr[String] = js.native
               //String: Set the text for the "pause" pausePlay item
  var playText: js.UndefOr[String] = js.native
               //Boolean: Create navigation for previous/next navigation? (true/false)
  var prevText: js.UndefOr[String] = js.native
                     //{NEW} Integer: Set an initialization delay, in milliseconds
  var randomize: js.UndefOr[Boolean] = js.native
              //{NEW} Callback: function(slider) - Fires after a slide is added
  var removed: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.native
          //String: Select the sliding direction, "horizontal" or "vertical"
  var reverse: js.UndefOr[Boolean] = js.native
               //{NEW} String: Prefix string attached to the class of every element generated by the plugin
  var selector: js.UndefOr[String] = js.native
                       //Integer: The slide that the slider should start on. Array notation (0 = first slide)
  var slideshow: js.UndefOr[Boolean] = js.native
                  //Boolean: Animate slider automatically
  var slideshowSpeed: js.UndefOr[Double] = js.native
               //Boolean: Should the animation loop? If boolean; directionNav will received "disable" classes at either end
  var smoothHeight: js.UndefOr[Boolean] = js.native
                          //{NEW} Integer: Number of carousel items that should move on animation. If number; slider will move all visible items.
  // Callback API
  var start: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.native
              //{NEW} Boolean: Allow height of the slider to animate smoothly in horizontal mode
  var startAt: js.UndefOr[Double] = js.native
               //Selector: Declare custom control navigation. Examples would be ".flex-control-nav li" or "#tabs-nav li img", etc. The number of elements in your controlNav should match the number of slides/tabs.
  var sync: js.UndefOr[String] = js.native
                     //{NEW} Boolean: Slider will use CSS3 transitions if available
  var touch: js.UndefOr[Boolean] = js.native
              //Boolean: Pause the slideshow when hovering over slider, then resume when no longer hovering
  var useCSS: js.UndefOr[Boolean] = js.native
                      //{NEW} Boolean: Allow touch swipe navigation of the slider on touch-enabled devices
  var video: js.UndefOr[Boolean] = js.native
}

object FlexSliderOptions {
  @scala.inline
  def apply(): FlexSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexSliderOptions]
  }
  @scala.inline
  implicit class FlexSliderOptionsOps[Self <: FlexSliderOptions] (val x: Self) extends AnyVal {
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
    def setAdded(value: /* slider */ SliderObject => _): Self = this.set("added", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAdded: Self = this.set("added", js.undefined)
    @scala.inline
    def setAfter(value: /* slider */ SliderObject => _): Self = this.set("after", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
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
    def setBefore(value: /* slider */ SliderObject => _): Self = this.set("before", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setControlNav(value: js.Any): Self = this.set("controlNav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlNav: Self = this.set("controlNav", js.undefined)
    @scala.inline
    def setControlsContainer(value: String): Self = this.set("controlsContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlsContainer: Self = this.set("controlsContainer", js.undefined)
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDirectionNav(value: Boolean): Self = this.set("directionNav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectionNav: Self = this.set("directionNav", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setEnd(value: /* slider */ SliderObject => _): Self = this.set("end", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setInitDelay(value: Double): Self = this.set("initDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitDelay: Self = this.set("initDelay", js.undefined)
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
    def setManualControls(value: String): Self = this.set("manualControls", value.asInstanceOf[js.Any])
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
    def setRemoved(value: /* slider */ SliderObject => _): Self = this.set("removed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoved: Self = this.set("removed", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
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
    def setStart(value: /* slider */ SliderObject => _): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStartAt(value: Double): Self = this.set("startAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAt: Self = this.set("startAt", js.undefined)
    @scala.inline
    def setSync(value: String): Self = this.set("sync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
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

