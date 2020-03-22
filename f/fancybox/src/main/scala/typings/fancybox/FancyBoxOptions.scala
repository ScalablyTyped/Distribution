package typings.fancybox

import typings.fancybox.fancyboxBooleans.`false`
import typings.fancybox.fancyboxStrings.`inline`
import typings.fancybox.fancyboxStrings.`zoom-in-out`
import typings.fancybox.fancyboxStrings.ajax
import typings.fancybox.fancyboxStrings.auto
import typings.fancybox.fancyboxStrings.circular
import typings.fancybox.fancyboxStrings.close
import typings.fancybox.fancyboxStrings.download
import typings.fancybox.fancyboxStrings.fade
import typings.fancybox.fancyboxStrings.fullScreen
import typings.fancybox.fancyboxStrings.html
import typings.fancybox.fancyboxStrings.iframe
import typings.fancybox.fancyboxStrings.image
import typings.fancybox.fancyboxStrings.rotate
import typings.fancybox.fancyboxStrings.share
import typings.fancybox.fancyboxStrings.slide
import typings.fancybox.fancyboxStrings.slideShow
import typings.fancybox.fancyboxStrings.thumbs
import typings.fancybox.fancyboxStrings.tube
import typings.fancybox.fancyboxStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxOptions extends js.Object {
  /**
    * After instance has been closed
    */
  var afterClose: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.undefined
  /**
    * When the content of a slide is done loading
    */
  var afterLoad: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.undefined
  /**
    * When content is done loading and animating
    */
  var afterShow: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.undefined
  var ajax: js.UndefOr[FancyBoxAjaxOption] = js.undefined
  /**
    * Duration in ms for open/close animation
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /**
    * Open/close animation type
    * Possible values:
    * false                    - disable
    * "zoom"               - zoom images from/to thumbnail
    * "fade"
    * "zoom-in-out"
    */
  var animationEffect: js.UndefOr[Boolean | zoom | fade | `zoom-in-out`] = js.undefined
  /**
    * Should display navigation arrows at the screen edges
    */
  var arrows: js.UndefOr[Boolean] = js.undefined
  /**
    * Try to focus on the first focusable element after opening
    */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Put focus back to active element after closing
    */
  var backFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom CSS class for layout
    */
  var baseClass: js.UndefOr[String] = js.undefined
  /**
    * Base template for layout
    */
  var baseTpl: js.UndefOr[String] = js.undefined
  /**
    * Before the instance attempts to close. Return false to cancel the close.
    */
  var beforeClose: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.undefined
  /**
    * Before the content of a slide is being loaded
    */
  var beforeLoad: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.undefined
  /**
    * Before open animation starts
    */
  var beforeShow: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.undefined
  /**
    * Button templates
    */
  var btnTpl: js.UndefOr[FancyBoxButtonTemplateOptions] = js.undefined
  /**
    * What buttons should appear in the top right corner.
    * Buttons will be created using templates from `btnTpl` option
    * and they will be placed into toolbar (class="fancybox-toolbar"` element)
    */
  var buttons: js.UndefOr[js.Array[zoom | share | slideShow | fullScreen | download | thumbs | close]] = js.undefined
  var caption: js.UndefOr[
    String | (js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, String])
  ] = js.undefined
  /**
    * Clicked on the content
    */
  var clickContent: js.UndefOr[FancyBoxInteractions] = js.undefined
  /**
    * Clicked on the background (backdrop) element;
    * if you have not changed the layout, then most likely you need to use `clickSlide` option
    */
  var clickOutside: js.UndefOr[FancyBoxInteractions] = js.undefined
  /**
    * Clicked on the slide
    */
  var clickSlide: js.UndefOr[FancyBoxInteractions] = js.undefined
  /**
    * Close existing modals
    * Set this to false if you do not need to stack multiple instances
    */
  var closeExisting: js.UndefOr[Boolean] = js.undefined
  /**
    * Same as previous two, but for double click
    */
  var dblclickContent: js.UndefOr[FancyBoxInteractions] = js.undefined
  /**
    * Same as previous two, but for double click
    */
  var dblclickOutside: js.UndefOr[FancyBoxInteractions] = js.undefined
  /**
    * Same as previous two, but for double click
    */
  var dblclickSlide: js.UndefOr[FancyBoxInteractions] = js.undefined
  /**
    * Default content type if cannot be detected automatically
    */
  var defaultType: js.UndefOr[image | `inline` | ajax | iframe | html] = js.undefined
  /**
    * Error message template
    */
  var errorTpl: js.UndefOr[String] = js.undefined
  var fullScreen: js.UndefOr[AnonAutostart] = js.undefined
  /**
    * Horizontal space between slides
    */
  var gutter: js.UndefOr[Double] = js.undefined
  /**
    * Hash value when initializing manually,
    * set `false` to disable hash change
    */
  var hash: js.UndefOr[js.Any] = js.undefined
  /**
    * Hide browser vertical scrollbars; use at your own risk
    */
  var hideScrollbar: js.UndefOr[Boolean] = js.undefined
  var i18n: js.UndefOr[FancyBoxInternationalizationOptions] = js.undefined
  /**
    * Detect "idle" time in seconds
    */
  var idleTime: js.UndefOr[Double] = js.undefined
  var iframe: js.UndefOr[FancyBoxIframeSettings] = js.undefined
  var image: js.UndefOr[FancyBoxImageOption] = js.undefined
  /**
    * Should display counter at the top left corner
    */
  var infobar: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable keyboard navigation
    */
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  /**
    * Enable infinite gallery navigation
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  /**
    * Customize or add new media types
    * Example:
    * media : {
    *   youtube : {
    *     params : {
    *       autoplay : 0
    *     }
    *   }
    * }
    */
  var media: js.UndefOr[FancyBoxPlainObject] = js.undefined
  /**
    * Shortcut to make content "modal" - disable keyboard navigtion, hide buttons, etc
    */
  var modal: js.UndefOr[Boolean] = js.undefined
  /**
    * When instance is brought to front
    */
  var onActivate: js.UndefOr[js.Function1[/* instance */ FancyBoxInstance, Unit]] = js.undefined
  /**
    * When other instance has been activated
    */
  var onDeactivate: js.UndefOr[js.Function1[/* instance */ FancyBoxInstance, Unit]] = js.undefined
  /**
    * When instance has been initialized
    */
  var onInit: js.UndefOr[js.Function1[/* instance */ FancyBoxInstance, Unit]] = js.undefined
  /**
    * Container is injected into this element
    */
  var parentEl: js.UndefOr[String] = js.undefined
  /**
    * Should allow caption to overlap the content
    */
  var preventCaptionOverlap: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable right-click and use simple image protection for images
    */
  var protect: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom CSS class for slide element
    */
  var slideClass: js.UndefOr[String] = js.undefined
  var slideShow: js.UndefOr[AnonAutoStart_] = js.undefined
  /**
    * Should display close button (using `btnTpl.smallBtn` template) over the content
    * Can be true, false, "auto"
    * If "auto" - will be automatically enabled for "html", "inline" or "ajax" items
    */
  var smallBtn: js.UndefOr[Boolean | auto] = js.undefined
  /**
    * Loading indicator template
    */
  var spinnerTpl: js.UndefOr[String] = js.undefined
  var thumbs: js.UndefOr[FancyThumbsOptions] = js.undefined
  /**
    * Should display toolbar (buttons at the top)
    * Can be true, false, "auto"
    * If "auto" - will be automatically hidden if "smallBtn" is enabled
    */
  var toolbar: js.UndefOr[Boolean | auto] = js.undefined
  /**
    * Set `touch: false` to disable panning/swiping
    */
  var touch: js.UndefOr[FancyBoxTouchOptions | `false`] = js.undefined
  /**
    * Duration in ms for transition animation
    */
  var transitionDuration: js.UndefOr[Double] = js.undefined
  /**
    * Transition effect between slides
    * Possible values:
    * false
    * "fade"
    * "slide"
    * "circular"
    * "tube"
    * "zoom-in-out"
    * "rotate"
    */
  var transitionEffect: js.UndefOr[fade | slide | circular | tube | `zoom-in-out` | rotate | Boolean] = js.undefined
  /**
    * Do not let user to focus on element outside modal content
    */
  var trapFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * For HTML5 video only
    */
  var video: js.UndefOr[FancyBoxVideoOptions] = js.undefined
  /**
    * Use mousewheel to navigate gallery
    * If 'auto' - enabled for images only
    */
  var wheel: js.UndefOr[auto | `false`] = js.undefined
  /**
    * Should image change opacity while zooming
    * If opacity is "auto", then opacity will be changed if image and thumbnail have different aspect ratios
    */
  var zoomOpacity: js.UndefOr[auto | Boolean] = js.undefined
}

object FancyBoxOptions {
  @scala.inline
  def apply(
    afterClose: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit = null,
    afterLoad: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit = null,
    afterShow: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit = null,
    ajax: FancyBoxAjaxOption = null,
    animationDuration: Int | Double = null,
    animationEffect: Boolean | zoom | fade | `zoom-in-out` = null,
    arrows: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backFocus: js.UndefOr[Boolean] = js.undefined,
    baseClass: String = null,
    baseTpl: String = null,
    beforeClose: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit = null,
    beforeLoad: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit = null,
    beforeShow: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit = null,
    btnTpl: FancyBoxButtonTemplateOptions = null,
    buttons: js.Array[zoom | share | slideShow | fullScreen | download | thumbs | close] = null,
    caption: String | (js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, String]) = null,
    clickContent: FancyBoxInteractions = null,
    clickOutside: FancyBoxInteractions = null,
    clickSlide: FancyBoxInteractions = null,
    closeExisting: js.UndefOr[Boolean] = js.undefined,
    dblclickContent: FancyBoxInteractions = null,
    dblclickOutside: FancyBoxInteractions = null,
    dblclickSlide: FancyBoxInteractions = null,
    defaultType: image | `inline` | ajax | iframe | html = null,
    errorTpl: String = null,
    fullScreen: AnonAutostart = null,
    gutter: Int | Double = null,
    hash: js.Any = null,
    hideScrollbar: js.UndefOr[Boolean] = js.undefined,
    i18n: FancyBoxInternationalizationOptions = null,
    idleTime: Int | Double = null,
    iframe: FancyBoxIframeSettings = null,
    image: FancyBoxImageOption = null,
    infobar: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    lang: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    media: FancyBoxPlainObject = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    onActivate: /* instance */ FancyBoxInstance => Unit = null,
    onDeactivate: /* instance */ FancyBoxInstance => Unit = null,
    onInit: /* instance */ FancyBoxInstance => Unit = null,
    parentEl: String = null,
    preventCaptionOverlap: js.UndefOr[Boolean] = js.undefined,
    protect: js.UndefOr[Boolean] = js.undefined,
    slideClass: String = null,
    slideShow: AnonAutoStart_ = null,
    smallBtn: Boolean | auto = null,
    spinnerTpl: String = null,
    thumbs: FancyThumbsOptions = null,
    toolbar: Boolean | auto = null,
    touch: FancyBoxTouchOptions | `false` = null,
    transitionDuration: Int | Double = null,
    transitionEffect: fade | slide | circular | tube | `zoom-in-out` | rotate | Boolean = null,
    trapFocus: js.UndefOr[Boolean] = js.undefined,
    video: FancyBoxVideoOptions = null,
    wheel: auto | `false` = null,
    zoomOpacity: auto | Boolean = null
  ): FancyBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction2(afterClose))
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(js.Any.fromFunction2(afterLoad))
    if (afterShow != null) __obj.updateDynamic("afterShow")(js.Any.fromFunction2(afterShow))
    if (ajax != null) __obj.updateDynamic("ajax")(ajax.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEffect != null) __obj.updateDynamic("animationEffect")(animationEffect.asInstanceOf[js.Any])
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(backFocus)) __obj.updateDynamic("backFocus")(backFocus.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (baseTpl != null) __obj.updateDynamic("baseTpl")(baseTpl.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction2(beforeClose))
    if (beforeLoad != null) __obj.updateDynamic("beforeLoad")(js.Any.fromFunction2(beforeLoad))
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(js.Any.fromFunction2(beforeShow))
    if (btnTpl != null) __obj.updateDynamic("btnTpl")(btnTpl.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (clickContent != null) __obj.updateDynamic("clickContent")(clickContent.asInstanceOf[js.Any])
    if (clickOutside != null) __obj.updateDynamic("clickOutside")(clickOutside.asInstanceOf[js.Any])
    if (clickSlide != null) __obj.updateDynamic("clickSlide")(clickSlide.asInstanceOf[js.Any])
    if (!js.isUndefined(closeExisting)) __obj.updateDynamic("closeExisting")(closeExisting.asInstanceOf[js.Any])
    if (dblclickContent != null) __obj.updateDynamic("dblclickContent")(dblclickContent.asInstanceOf[js.Any])
    if (dblclickOutside != null) __obj.updateDynamic("dblclickOutside")(dblclickOutside.asInstanceOf[js.Any])
    if (dblclickSlide != null) __obj.updateDynamic("dblclickSlide")(dblclickSlide.asInstanceOf[js.Any])
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType.asInstanceOf[js.Any])
    if (errorTpl != null) __obj.updateDynamic("errorTpl")(errorTpl.asInstanceOf[js.Any])
    if (fullScreen != null) __obj.updateDynamic("fullScreen")(fullScreen.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (!js.isUndefined(hideScrollbar)) __obj.updateDynamic("hideScrollbar")(hideScrollbar.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (idleTime != null) __obj.updateDynamic("idleTime")(idleTime.asInstanceOf[js.Any])
    if (iframe != null) __obj.updateDynamic("iframe")(iframe.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(infobar)) __obj.updateDynamic("infobar")(infobar.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction1(onActivate))
    if (onDeactivate != null) __obj.updateDynamic("onDeactivate")(js.Any.fromFunction1(onDeactivate))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction1(onInit))
    if (parentEl != null) __obj.updateDynamic("parentEl")(parentEl.asInstanceOf[js.Any])
    if (!js.isUndefined(preventCaptionOverlap)) __obj.updateDynamic("preventCaptionOverlap")(preventCaptionOverlap.asInstanceOf[js.Any])
    if (!js.isUndefined(protect)) __obj.updateDynamic("protect")(protect.asInstanceOf[js.Any])
    if (slideClass != null) __obj.updateDynamic("slideClass")(slideClass.asInstanceOf[js.Any])
    if (slideShow != null) __obj.updateDynamic("slideShow")(slideShow.asInstanceOf[js.Any])
    if (smallBtn != null) __obj.updateDynamic("smallBtn")(smallBtn.asInstanceOf[js.Any])
    if (spinnerTpl != null) __obj.updateDynamic("spinnerTpl")(spinnerTpl.asInstanceOf[js.Any])
    if (thumbs != null) __obj.updateDynamic("thumbs")(thumbs.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEffect != null) __obj.updateDynamic("transitionEffect")(transitionEffect.asInstanceOf[js.Any])
    if (!js.isUndefined(trapFocus)) __obj.updateDynamic("trapFocus")(trapFocus.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (wheel != null) __obj.updateDynamic("wheel")(wheel.asInstanceOf[js.Any])
    if (zoomOpacity != null) __obj.updateDynamic("zoomOpacity")(zoomOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxOptions]
  }
}

