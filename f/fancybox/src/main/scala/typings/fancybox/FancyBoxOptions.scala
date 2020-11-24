package typings.fancybox

import typings.fancybox.anon.AutoStart_
import typings.fancybox.anon.Autostart
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
import typings.jquery.JQuery.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxOptions extends js.Object {
  
  /**
    * After instance has been closed
    */
  var afterClose: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.native
  
  /**
    * When the content of a slide is done loading
    */
  var afterLoad: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.native
  
  /**
    * When content is done loading and animating
    */
  var afterShow: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.native
  
  var ajax: js.UndefOr[FancyBoxAjaxOption] = js.native
  
  /**
    * Duration in ms for open/close animation
    */
  var animationDuration: js.UndefOr[Double] = js.native
  
  /**
    * Open/close animation type
    * Possible values:
    * false                    - disable
    * "zoom"               - zoom images from/to thumbnail
    * "fade"
    * "zoom-in-out"
    */
  var animationEffect: js.UndefOr[Boolean | zoom | fade | `zoom-in-out`] = js.native
  
  /**
    * Should display navigation arrows at the screen edges
    */
  var arrows: js.UndefOr[Boolean] = js.native
  
  /**
    * Try to focus on the first focusable element after opening
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Put focus back to active element after closing
    */
  var backFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom CSS class for layout
    */
  var baseClass: js.UndefOr[String] = js.native
  
  /**
    * Base template for layout
    */
  var baseTpl: js.UndefOr[String] = js.native
  
  /**
    * Before the instance attempts to close. Return false to cancel the close.
    */
  var beforeClose: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.native
  
  /**
    * Before the content of a slide is being loaded
    */
  var beforeLoad: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.native
  
  /**
    * Before open animation starts
    */
  var beforeShow: js.UndefOr[js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, Unit]] = js.native
  
  /**
    * Button templates
    */
  var btnTpl: js.UndefOr[FancyBoxButtonTemplateOptions] = js.native
  
  /**
    * What buttons should appear in the top right corner.
    * Buttons will be created using templates from `btnTpl` option
    * and they will be placed into toolbar (class="fancybox-toolbar"` element)
    */
  var buttons: js.UndefOr[js.Array[zoom | share | slideShow | fullScreen | download | thumbs | close]] = js.native
  
  var caption: js.UndefOr[
    String | (js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, String])
  ] = js.native
  
  /**
    * Clicked on the content
    */
  var clickContent: js.UndefOr[FancyBoxInteractions] = js.native
  
  /**
    * Clicked on the background (backdrop) element;
    * if you have not changed the layout, then most likely you need to use `clickSlide` option
    */
  var clickOutside: js.UndefOr[FancyBoxInteractions] = js.native
  
  /**
    * Clicked on the slide
    */
  var clickSlide: js.UndefOr[FancyBoxInteractions] = js.native
  
  /**
    * Close existing modals
    * Set this to false if you do not need to stack multiple instances
    */
  var closeExisting: js.UndefOr[Boolean] = js.native
  
  /**
    * Same as previous two, but for double click
    */
  var dblclickContent: js.UndefOr[FancyBoxInteractions] = js.native
  
  /**
    * Same as previous two, but for double click
    */
  var dblclickOutside: js.UndefOr[FancyBoxInteractions] = js.native
  
  /**
    * Same as previous two, but for double click
    */
  var dblclickSlide: js.UndefOr[FancyBoxInteractions] = js.native
  
  /**
    * Default content type if cannot be detected automatically
    */
  var defaultType: js.UndefOr[image | `inline` | ajax | iframe | html] = js.native
  
  /**
    * Error message template
    */
  var errorTpl: js.UndefOr[String] = js.native
  
  var fullScreen: js.UndefOr[Autostart] = js.native
  
  /**
    * Horizontal space between slides
    */
  var gutter: js.UndefOr[Double] = js.native
  
  /**
    * Hash value when initializing manually,
    * set `false` to disable hash change
    */
  var hash: js.UndefOr[js.Any] = js.native
  
  /**
    * Hide browser vertical scrollbars; use at your own risk
    */
  var hideScrollbar: js.UndefOr[Boolean] = js.native
  
  var i18n: js.UndefOr[FancyBoxInternationalizationOptions] = js.native
  
  /**
    * Detect "idle" time in seconds
    */
  var idleTime: js.UndefOr[Double] = js.native
  
  var iframe: js.UndefOr[FancyBoxIframeSettings] = js.native
  
  var image: js.UndefOr[FancyBoxImageOption] = js.native
  
  /**
    * Should display counter at the top left corner
    */
  var infobar: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable keyboard navigation
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  /**
    * Enable infinite gallery navigation
    */
  var loop: js.UndefOr[Boolean] = js.native
  
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
  var media: js.UndefOr[FancyBoxPlainObject] = js.native
  
  /**
    * Shortcut to make content "modal" - disable keyboard navigtion, hide buttons, etc
    */
  var modal: js.UndefOr[Boolean] = js.native
  
  /**
    * When instance is brought to front
    */
  var onActivate: js.UndefOr[js.Function1[/* instance */ FancyBoxInstance, Unit]] = js.native
  
  /**
    * When other instance has been activated
    */
  var onDeactivate: js.UndefOr[js.Function1[/* instance */ FancyBoxInstance, Unit]] = js.native
  
  /**
    * When instance has been initialized
    */
  var onInit: js.UndefOr[js.Function1[/* instance */ FancyBoxInstance, Unit]] = js.native
  
  /**
    * Container is injected into this element
    */
  var parentEl: js.UndefOr[String] = js.native
  
  /**
    * Should allow caption to overlap the content
    */
  var preventCaptionOverlap: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable right-click and use simple image protection for images
    */
  var protect: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom CSS class for slide element
    */
  var slideClass: js.UndefOr[String] = js.native
  
  var slideShow: js.UndefOr[AutoStart_] = js.native
  
  /**
    * Should display close button (using `btnTpl.smallBtn` template) over the content
    * Can be true, false, "auto"
    * If "auto" - will be automatically enabled for "html", "inline" or "ajax" items
    */
  var smallBtn: js.UndefOr[Boolean | auto] = js.native
  
  /**
    * Loading indicator template
    */
  var spinnerTpl: js.UndefOr[String] = js.native
  
  var thumbs: js.UndefOr[FancyThumbsOptions] = js.native
  
  /**
    * Should display toolbar (buttons at the top)
    * Can be true, false, "auto"
    * If "auto" - will be automatically hidden if "smallBtn" is enabled
    */
  var toolbar: js.UndefOr[Boolean | auto] = js.native
  
  /**
    * Set `touch: false` to disable panning/swiping
    */
  var touch: js.UndefOr[FancyBoxTouchOptions | `false`] = js.native
  
  /**
    * Duration in ms for transition animation
    */
  var transitionDuration: js.UndefOr[Double] = js.native
  
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
  var transitionEffect: js.UndefOr[fade | slide | circular | tube | `zoom-in-out` | rotate | Boolean] = js.native
  
  /**
    * Do not let user to focus on element outside modal content
    */
  var trapFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * For HTML5 video only
    */
  var video: js.UndefOr[FancyBoxVideoOptions] = js.native
  
  /**
    * Use mousewheel to navigate gallery
    * If 'auto' - enabled for images only
    */
  var wheel: js.UndefOr[auto | `false`] = js.native
  
  /**
    * Should image change opacity while zooming
    * If opacity is "auto", then opacity will be changed if image and thumbnail have different aspect ratios
    */
  var zoomOpacity: js.UndefOr[auto | Boolean] = js.native
}
object FancyBoxOptions {
  
  @scala.inline
  def apply(): FancyBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxOptions]
  }
  
  @scala.inline
  implicit class FancyBoxOptionsOps[Self <: FancyBoxOptions] (val x: Self) extends AnyVal {
    
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
    def setAfterClose(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = this.set("afterClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterClose: Self = this.set("afterClose", js.undefined)
    
    @scala.inline
    def setAfterLoad(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = this.set("afterLoad", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterLoad: Self = this.set("afterLoad", js.undefined)
    
    @scala.inline
    def setAfterShow(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = this.set("afterShow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterShow: Self = this.set("afterShow", js.undefined)
    
    @scala.inline
    def setAjax(value: FancyBoxAjaxOption): Self = this.set("ajax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjax: Self = this.set("ajax", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEffect(value: Boolean | zoom | fade | `zoom-in-out`): Self = this.set("animationEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationEffect: Self = this.set("animationEffect", js.undefined)
    
    @scala.inline
    def setArrows(value: Boolean): Self = this.set("arrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrows: Self = this.set("arrows", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setBackFocus(value: Boolean): Self = this.set("backFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackFocus: Self = this.set("backFocus", js.undefined)
    
    @scala.inline
    def setBaseClass(value: String): Self = this.set("baseClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseClass: Self = this.set("baseClass", js.undefined)
    
    @scala.inline
    def setBaseTpl(value: String): Self = this.set("baseTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseTpl: Self = this.set("baseTpl", js.undefined)
    
    @scala.inline
    def setBeforeClose(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = this.set("beforeClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    
    @scala.inline
    def setBeforeLoad(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = this.set("beforeLoad", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeLoad: Self = this.set("beforeLoad", js.undefined)
    
    @scala.inline
    def setBeforeShow(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => Unit): Self = this.set("beforeShow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeShow: Self = this.set("beforeShow", js.undefined)
    
    @scala.inline
    def setBtnTpl(value: FancyBoxButtonTemplateOptions): Self = this.set("btnTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtnTpl: Self = this.set("btnTpl", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: (zoom | share | slideShow | fullScreen | download | thumbs | close)*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[zoom | share | slideShow | fullScreen | download | thumbs | close]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setCaptionFunction2(value: (/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide) => String): Self = this.set("caption", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCaption(
      value: String | (js.Function2[/* instance */ FancyBoxInstance, /* current */ FancyBoxSlide, String])
    ): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setClickContentFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = this.set("clickContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClickContent(value: FancyBoxInteractions): Self = this.set("clickContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickContent: Self = this.set("clickContent", js.undefined)
    
    @scala.inline
    def setClickOutsideFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = this.set("clickOutside", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClickOutside(value: FancyBoxInteractions): Self = this.set("clickOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickOutside: Self = this.set("clickOutside", js.undefined)
    
    @scala.inline
    def setClickSlideFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = this.set("clickSlide", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClickSlide(value: FancyBoxInteractions): Self = this.set("clickSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickSlide: Self = this.set("clickSlide", js.undefined)
    
    @scala.inline
    def setCloseExisting(value: Boolean): Self = this.set("closeExisting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseExisting: Self = this.set("closeExisting", js.undefined)
    
    @scala.inline
    def setDblclickContentFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = this.set("dblclickContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDblclickContent(value: FancyBoxInteractions): Self = this.set("dblclickContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDblclickContent: Self = this.set("dblclickContent", js.undefined)
    
    @scala.inline
    def setDblclickOutsideFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = this.set("dblclickOutside", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDblclickOutside(value: FancyBoxInteractions): Self = this.set("dblclickOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDblclickOutside: Self = this.set("dblclickOutside", js.undefined)
    
    @scala.inline
    def setDblclickSlideFunction2(
      value: (/* slide */ js.UndefOr[FancyBoxSlide], /* event */ js.UndefOr[Event]) => FancyBoxInteractionTypes
    ): Self = this.set("dblclickSlide", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDblclickSlide(value: FancyBoxInteractions): Self = this.set("dblclickSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDblclickSlide: Self = this.set("dblclickSlide", js.undefined)
    
    @scala.inline
    def setDefaultType(value: image | `inline` | ajax | iframe | html): Self = this.set("defaultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultType: Self = this.set("defaultType", js.undefined)
    
    @scala.inline
    def setErrorTpl(value: String): Self = this.set("errorTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorTpl: Self = this.set("errorTpl", js.undefined)
    
    @scala.inline
    def setFullScreen(value: Autostart): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    
    @scala.inline
    def setGutter(value: Double): Self = this.set("gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    
    @scala.inline
    def setHash(value: js.Any): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setHideScrollbar(value: Boolean): Self = this.set("hideScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideScrollbar: Self = this.set("hideScrollbar", js.undefined)
    
    @scala.inline
    def setI18n(value: FancyBoxInternationalizationOptions): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    
    @scala.inline
    def setIdleTime(value: Double): Self = this.set("idleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleTime: Self = this.set("idleTime", js.undefined)
    
    @scala.inline
    def setIframe(value: FancyBoxIframeSettings): Self = this.set("iframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIframe: Self = this.set("iframe", js.undefined)
    
    @scala.inline
    def setImage(value: FancyBoxImageOption): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setInfobar(value: Boolean): Self = this.set("infobar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfobar: Self = this.set("infobar", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMedia(value: FancyBoxPlainObject): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setOnActivate(value: /* instance */ FancyBoxInstance => Unit): Self = this.set("onActivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnActivate: Self = this.set("onActivate", js.undefined)
    
    @scala.inline
    def setOnDeactivate(value: /* instance */ FancyBoxInstance => Unit): Self = this.set("onDeactivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDeactivate: Self = this.set("onDeactivate", js.undefined)
    
    @scala.inline
    def setOnInit(value: /* instance */ FancyBoxInstance => Unit): Self = this.set("onInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
    
    @scala.inline
    def setParentEl(value: String): Self = this.set("parentEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentEl: Self = this.set("parentEl", js.undefined)
    
    @scala.inline
    def setPreventCaptionOverlap(value: Boolean): Self = this.set("preventCaptionOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventCaptionOverlap: Self = this.set("preventCaptionOverlap", js.undefined)
    
    @scala.inline
    def setProtect(value: Boolean): Self = this.set("protect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtect: Self = this.set("protect", js.undefined)
    
    @scala.inline
    def setSlideClass(value: String): Self = this.set("slideClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideClass: Self = this.set("slideClass", js.undefined)
    
    @scala.inline
    def setSlideShow(value: AutoStart_): Self = this.set("slideShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideShow: Self = this.set("slideShow", js.undefined)
    
    @scala.inline
    def setSmallBtn(value: Boolean | auto): Self = this.set("smallBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallBtn: Self = this.set("smallBtn", js.undefined)
    
    @scala.inline
    def setSpinnerTpl(value: String): Self = this.set("spinnerTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinnerTpl: Self = this.set("spinnerTpl", js.undefined)
    
    @scala.inline
    def setThumbs(value: FancyThumbsOptions): Self = this.set("thumbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbs: Self = this.set("thumbs", js.undefined)
    
    @scala.inline
    def setToolbar(value: Boolean | auto): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setTouch(value: FancyBoxTouchOptions | `false`): Self = this.set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    
    @scala.inline
    def setTransitionEffect(value: fade | slide | circular | tube | `zoom-in-out` | rotate | Boolean): Self = this.set("transitionEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionEffect: Self = this.set("transitionEffect", js.undefined)
    
    @scala.inline
    def setTrapFocus(value: Boolean): Self = this.set("trapFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrapFocus: Self = this.set("trapFocus", js.undefined)
    
    @scala.inline
    def setVideo(value: FancyBoxVideoOptions): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    
    @scala.inline
    def setWheel(value: auto | `false`): Self = this.set("wheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheel: Self = this.set("wheel", js.undefined)
    
    @scala.inline
    def setZoomOpacity(value: auto | Boolean): Self = this.set("zoomOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomOpacity: Self = this.set("zoomOpacity", js.undefined)
  }
}
