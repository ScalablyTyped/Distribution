package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxOptions extends js.Object {
  /**
    * After instance has been closed
    */
  var afterClose: js.UndefOr[
    js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, scala.Unit]
  ] = js.undefined
  /**
    * When the content of a slide is done loading
    */
  var afterLoad: js.UndefOr[
    js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, scala.Unit]
  ] = js.undefined
  /**
    * When content is done loading and animating
    */
  var afterShow: js.UndefOr[
    js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, scala.Unit]
  ] = js.undefined
  var ajax: js.UndefOr[FancyBoxAjaxOption] = js.undefined
  /**
    * Duration in ms for open/close animation
    */
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Open/close animation type
    * Possible values:
    * false                    - disable
    * "zoom"               - zoom images from/to thumbnail
    * "fade"
    * "zoom-in-out"
    */
  var animationEffect: js.UndefOr[
    scala.Boolean | fancyboxLib.fancyboxLibStrings.zoom | fancyboxLib.fancyboxLibStrings.fade | fancyboxLib.fancyboxLibStrings.`zoom-in-out`
  ] = js.undefined
  /**
    * Should display navigation arrows at the screen edges
    */
  var arrows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Try to focus on the first focusable element after opening
    */
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Put focus back to active element after closing
    */
  var backFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Custom CSS class for layout
    */
  var baseClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Base template for layout
    */
  var baseTpl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Before the instance attempts to close. Return false to cancel the close.
    */
  var beforeClose: js.UndefOr[
    js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, scala.Unit]
  ] = js.undefined
  /**
    * Before the content of a slide is being loaded
    */
  var beforeLoad: js.UndefOr[
    js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, scala.Unit]
  ] = js.undefined
  /**
    * Before open animation starts
    */
  var beforeShow: js.UndefOr[
    js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, scala.Unit]
  ] = js.undefined
  /**
    * Button templates
    */
  var btnTpl: js.UndefOr[FancyBoxButtonTemplateOptions] = js.undefined
  /**
    * What buttons should appear in the top right corner.
    * Buttons will be created using templates from `btnTpl` option
    * and they will be placed into toolbar (class="fancybox-toolbar"` element)
    */
  var buttons: js.UndefOr[
    js.Array[
      fancyboxLib.fancyboxLibStrings.zoom | fancyboxLib.fancyboxLibStrings.share | fancyboxLib.fancyboxLibStrings.slideShow | fancyboxLib.fancyboxLibStrings.fullScreen | fancyboxLib.fancyboxLibStrings.download | fancyboxLib.fancyboxLibStrings.thumbs | fancyboxLib.fancyboxLibStrings.close
    ]
  ] = js.undefined
  var caption: js.UndefOr[
    java.lang.String | (js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, java.lang.String])
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
  var closeExisting: js.UndefOr[scala.Boolean] = js.undefined
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
  var defaultType: js.UndefOr[
    fancyboxLib.fancyboxLibStrings.image | fancyboxLib.fancyboxLibStrings.`inline` | fancyboxLib.fancyboxLibStrings.ajax | fancyboxLib.fancyboxLibStrings.iframe | fancyboxLib.fancyboxLibStrings.html
  ] = js.undefined
  /**
    * Error message template
    */
  var errorTpl: js.UndefOr[java.lang.String] = js.undefined
  var fullScreen: js.UndefOr[Anon_Autostart] = js.undefined
  /**
    * Horizontal space between slides
    */
  var gutter: js.UndefOr[scala.Double] = js.undefined
  /**
    * Hash value when initializing manually,
    * set `false` to disable hash change
    */
  var hash: js.UndefOr[js.Any] = js.undefined
  /**
    * Hide browser vertical scrollbars; use at your own risk
    */
  var hideScrollbar: js.UndefOr[scala.Boolean] = js.undefined
  var i18n: js.UndefOr[FancyBoxInternationalizationOptions] = js.undefined
  /**
    * Detect "idle" time in seconds
    */
  var idleTime: js.UndefOr[scala.Double] = js.undefined
  var iframe: js.UndefOr[FancyBoxIframeSettings] = js.undefined
  var image: js.UndefOr[FancyBoxImageOption] = js.undefined
  /**
    * Should display counter at the top left corner
    */
  var infobar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable keyboard navigation
    */
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enable infinite gallery navigation
    */
  var loop: js.UndefOr[scala.Boolean] = js.undefined
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
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When instance is brought to front
    */
  var onActivate: js.UndefOr[js.Function1[/* instance */ FancyBoxInstance, scala.Unit]] = js.undefined
  /**
    * When other instance has been activated
    */
  var onDeactivate: js.UndefOr[js.Function1[/* instance */ FancyBoxInstance, scala.Unit]] = js.undefined
  /**
    * When instance has been initialized
    */
  var onInit: js.UndefOr[js.Function1[/* instance */ FancyBoxInstance, scala.Unit]] = js.undefined
  /**
    * Container is injected into this element
    */
  var parentEl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Should allow caption to overlap the content
    */
  var preventCaptionOverlap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable right-click and use simple image protection for images
    */
  var protect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Custom CSS class for slide element
    */
  var slideClass: js.UndefOr[java.lang.String] = js.undefined
  var slideShow: js.UndefOr[Anon_AutoStart] = js.undefined
  /**
    * Should display close button (using `btnTpl.smallBtn` template) over the content
    * Can be true, false, "auto"
    * If "auto" - will be automatically enabled for "html", "inline" or "ajax" items
    */
  var smallBtn: js.UndefOr[scala.Boolean | fancyboxLib.fancyboxLibStrings.auto] = js.undefined
  /**
    * Loading indicator template
    */
  var spinnerTpl: js.UndefOr[java.lang.String] = js.undefined
  var thumbs: js.UndefOr[FancyThumbsOptions] = js.undefined
  /**
    * Should display toolbar (buttons at the top)
    * Can be true, false, "auto"
    * If "auto" - will be automatically hidden if "smallBtn" is enabled
    */
  var toolbar: js.UndefOr[scala.Boolean | fancyboxLib.fancyboxLibStrings.auto] = js.undefined
  /**
    * Set `touch: false` to disable panning/swiping
    */
  var touch: js.UndefOr[FancyBoxTouchOptions | fancyboxLib.fancyboxLibNumbers.`false`] = js.undefined
  /**
    * Duration in ms for transition animation
    */
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
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
  var transitionEffect: js.UndefOr[
    fancyboxLib.fancyboxLibStrings.fade | fancyboxLib.fancyboxLibStrings.slide | fancyboxLib.fancyboxLibStrings.circular | fancyboxLib.fancyboxLibStrings.tube | fancyboxLib.fancyboxLibStrings.`zoom-in-out` | fancyboxLib.fancyboxLibStrings.rotate | scala.Boolean
  ] = js.undefined
  /**
    * Do not let user to focus on element outside modal content
    */
  var trapFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For HTML5 video only
    */
  var video: js.UndefOr[FancyBoxVideoOptions] = js.undefined
  /**
    * Use mousewheel to navigate gallery
    * If 'auto' - enabled for images only
    */
  var wheel: js.UndefOr[fancyboxLib.fancyboxLibStrings.auto | fancyboxLib.fancyboxLibNumbers.`false`] = js.undefined
  /**
    * Should image change opacity while zooming
    * If opacity is "auto", then opacity will be changed if image and thumbnail have different aspect ratios
    */
  var zoomOpacity: js.UndefOr[fancyboxLib.fancyboxLibStrings.auto | scala.Boolean] = js.undefined
}

object FancyBoxOptions {
  @scala.inline
  def apply(
    afterClose: js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, scala.Unit] = null,
    afterLoad: js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, scala.Unit] = null,
    afterShow: js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, scala.Unit] = null,
    ajax: FancyBoxAjaxOption = null,
    animationDuration: scala.Int | scala.Double = null,
    animationEffect: scala.Boolean | fancyboxLib.fancyboxLibStrings.zoom | fancyboxLib.fancyboxLibStrings.fade | fancyboxLib.fancyboxLibStrings.`zoom-in-out` = null,
    arrows: js.UndefOr[scala.Boolean] = js.undefined,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    backFocus: js.UndefOr[scala.Boolean] = js.undefined,
    baseClass: java.lang.String = null,
    baseTpl: java.lang.String = null,
    beforeClose: js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, scala.Unit] = null,
    beforeLoad: js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, scala.Unit] = null,
    beforeShow: js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, scala.Unit] = null,
    btnTpl: FancyBoxButtonTemplateOptions = null,
    buttons: js.Array[
      fancyboxLib.fancyboxLibStrings.zoom | fancyboxLib.fancyboxLibStrings.share | fancyboxLib.fancyboxLibStrings.slideShow | fancyboxLib.fancyboxLibStrings.fullScreen | fancyboxLib.fancyboxLibStrings.download | fancyboxLib.fancyboxLibStrings.thumbs | fancyboxLib.fancyboxLibStrings.close
    ] = null,
    caption: java.lang.String | (js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, java.lang.String]) = null,
    clickContent: FancyBoxInteractions = null,
    clickOutside: FancyBoxInteractions = null,
    clickSlide: FancyBoxInteractions = null,
    closeExisting: js.UndefOr[scala.Boolean] = js.undefined,
    dblclickContent: FancyBoxInteractions = null,
    dblclickOutside: FancyBoxInteractions = null,
    dblclickSlide: FancyBoxInteractions = null,
    defaultType: fancyboxLib.fancyboxLibStrings.image | fancyboxLib.fancyboxLibStrings.`inline` | fancyboxLib.fancyboxLibStrings.ajax | fancyboxLib.fancyboxLibStrings.iframe | fancyboxLib.fancyboxLibStrings.html = null,
    errorTpl: java.lang.String = null,
    fullScreen: Anon_Autostart = null,
    gutter: scala.Int | scala.Double = null,
    hash: js.Any = null,
    hideScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    i18n: FancyBoxInternationalizationOptions = null,
    idleTime: scala.Int | scala.Double = null,
    iframe: FancyBoxIframeSettings = null,
    image: FancyBoxImageOption = null,
    infobar: js.UndefOr[scala.Boolean] = js.undefined,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    lang: java.lang.String = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    media: FancyBoxPlainObject = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    onActivate: js.Function1[/* instance */ FancyBoxInstance, scala.Unit] = null,
    onDeactivate: js.Function1[/* instance */ FancyBoxInstance, scala.Unit] = null,
    onInit: js.Function1[/* instance */ FancyBoxInstance, scala.Unit] = null,
    parentEl: java.lang.String = null,
    preventCaptionOverlap: js.UndefOr[scala.Boolean] = js.undefined,
    protect: js.UndefOr[scala.Boolean] = js.undefined,
    slideClass: java.lang.String = null,
    slideShow: Anon_AutoStart = null,
    smallBtn: scala.Boolean | fancyboxLib.fancyboxLibStrings.auto = null,
    spinnerTpl: java.lang.String = null,
    thumbs: FancyThumbsOptions = null,
    toolbar: scala.Boolean | fancyboxLib.fancyboxLibStrings.auto = null,
    touch: FancyBoxTouchOptions | fancyboxLib.fancyboxLibNumbers.`false` = null,
    transitionDuration: scala.Int | scala.Double = null,
    transitionEffect: fancyboxLib.fancyboxLibStrings.fade | fancyboxLib.fancyboxLibStrings.slide | fancyboxLib.fancyboxLibStrings.circular | fancyboxLib.fancyboxLibStrings.tube | fancyboxLib.fancyboxLibStrings.`zoom-in-out` | fancyboxLib.fancyboxLibStrings.rotate | scala.Boolean = null,
    trapFocus: js.UndefOr[scala.Boolean] = js.undefined,
    video: FancyBoxVideoOptions = null,
    wheel: fancyboxLib.fancyboxLibStrings.auto | fancyboxLib.fancyboxLibNumbers.`false` = null,
    zoomOpacity: fancyboxLib.fancyboxLibStrings.auto | scala.Boolean = null
  ): FancyBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(afterClose)
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(afterLoad)
    if (afterShow != null) __obj.updateDynamic("afterShow")(afterShow)
    if (ajax != null) __obj.updateDynamic("ajax")(ajax)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEffect != null) __obj.updateDynamic("animationEffect")(animationEffect.asInstanceOf[js.Any])
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(backFocus)) __obj.updateDynamic("backFocus")(backFocus)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (baseTpl != null) __obj.updateDynamic("baseTpl")(baseTpl)
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose)
    if (beforeLoad != null) __obj.updateDynamic("beforeLoad")(beforeLoad)
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(beforeShow)
    if (btnTpl != null) __obj.updateDynamic("btnTpl")(btnTpl)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (clickContent != null) __obj.updateDynamic("clickContent")(clickContent.asInstanceOf[js.Any])
    if (clickOutside != null) __obj.updateDynamic("clickOutside")(clickOutside.asInstanceOf[js.Any])
    if (clickSlide != null) __obj.updateDynamic("clickSlide")(clickSlide.asInstanceOf[js.Any])
    if (!js.isUndefined(closeExisting)) __obj.updateDynamic("closeExisting")(closeExisting)
    if (dblclickContent != null) __obj.updateDynamic("dblclickContent")(dblclickContent.asInstanceOf[js.Any])
    if (dblclickOutside != null) __obj.updateDynamic("dblclickOutside")(dblclickOutside.asInstanceOf[js.Any])
    if (dblclickSlide != null) __obj.updateDynamic("dblclickSlide")(dblclickSlide.asInstanceOf[js.Any])
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType.asInstanceOf[js.Any])
    if (errorTpl != null) __obj.updateDynamic("errorTpl")(errorTpl)
    if (fullScreen != null) __obj.updateDynamic("fullScreen")(fullScreen)
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (!js.isUndefined(hideScrollbar)) __obj.updateDynamic("hideScrollbar")(hideScrollbar)
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    if (idleTime != null) __obj.updateDynamic("idleTime")(idleTime.asInstanceOf[js.Any])
    if (iframe != null) __obj.updateDynamic("iframe")(iframe)
    if (image != null) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(infobar)) __obj.updateDynamic("infobar")(infobar)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (media != null) __obj.updateDynamic("media")(media)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (onActivate != null) __obj.updateDynamic("onActivate")(onActivate)
    if (onDeactivate != null) __obj.updateDynamic("onDeactivate")(onDeactivate)
    if (onInit != null) __obj.updateDynamic("onInit")(onInit)
    if (parentEl != null) __obj.updateDynamic("parentEl")(parentEl)
    if (!js.isUndefined(preventCaptionOverlap)) __obj.updateDynamic("preventCaptionOverlap")(preventCaptionOverlap)
    if (!js.isUndefined(protect)) __obj.updateDynamic("protect")(protect)
    if (slideClass != null) __obj.updateDynamic("slideClass")(slideClass)
    if (slideShow != null) __obj.updateDynamic("slideShow")(slideShow)
    if (smallBtn != null) __obj.updateDynamic("smallBtn")(smallBtn.asInstanceOf[js.Any])
    if (spinnerTpl != null) __obj.updateDynamic("spinnerTpl")(spinnerTpl)
    if (thumbs != null) __obj.updateDynamic("thumbs")(thumbs)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEffect != null) __obj.updateDynamic("transitionEffect")(transitionEffect.asInstanceOf[js.Any])
    if (!js.isUndefined(trapFocus)) __obj.updateDynamic("trapFocus")(trapFocus)
    if (video != null) __obj.updateDynamic("video")(video)
    if (wheel != null) __obj.updateDynamic("wheel")(wheel.asInstanceOf[js.Any])
    if (zoomOpacity != null) __obj.updateDynamic("zoomOpacity")(zoomOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxOptions]
  }
}

