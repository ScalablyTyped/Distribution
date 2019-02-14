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

