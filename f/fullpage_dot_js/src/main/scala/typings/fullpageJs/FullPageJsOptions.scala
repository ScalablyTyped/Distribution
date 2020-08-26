package typings.fullpageJs

import typings.fullpageJs.anon.FadeBackground
import typings.fullpageJs.anon.Percentage
import typings.fullpageJs.fullpageJsStrings.bottom
import typings.fullpageJs.fullpageJsStrings.fingersonly
import typings.fullpageJs.fullpageJsStrings.horizontal
import typings.fullpageJs.fullpageJsStrings.mouseonly
import typings.fullpageJs.fullpageJsStrings.sections
import typings.fullpageJs.fullpageJsStrings.slides
import typings.fullpageJs.fullpageJsStrings.top
import typings.fullpageJs.fullpageJsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullPageJsOptions extends js.Object {
  /**
    * Callback fired once the sections have been loaded, after the scrolling has ended.
    * @param anchorLink anchorLink corresponding to the section.
    * @param index index of the section. Starting from 1.
    */
  var afterLoad: js.UndefOr[js.Function2[/* anchorLink */ String, /* index */ Double, Unit]] = js.native
  /**
    * This callback is fired just after the structure of the page is generated. This is the callback you want to use to initialize other plugins or fire any code which requires the document to be ready (as this plugin modifies the DOM to create the resulting structure).
    */
  var afterRender: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * This callback is fired after resizing the browser's window. Just after the sections are resized.
    */
  var afterResize: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * This callback is fired after fullpage.js changes from normal to responsive mode or from responsive mode to normal mode.
    * @param {boolean} isResponsive boolean that determines if it enters into responsive mode (true) or goes back to normal mode (false)
    */
  var afterResponsive: js.UndefOr[js.Function1[/* isResponsive */ Boolean, Unit]] = js.native
  /**
    * Callback fired once the slide of a section have been loaded, after the scrolling has ended.
    *
    * In case of not having anchorLinks defined for the slide or slides the slideIndex parameter would be the only one to use.
    *
    * Parameters:
    *
    * @param anchorLink anchorLink corresponding to the section.
    * @param index index of the section. Starting from 1.
    * @param slideAnchor anchor corresponding to the slide (in case there is)
    * @param slideIndex index of the slide. Starting from 1. (the default slide doesn't count as slide, but as a section)
    */
  var afterSlideLoad: js.UndefOr[
    js.Function4[
      /* anchorLink */ String, 
      /* index */ Double, 
      /* slideAnchor */ String, 
      /* slideIndex */ Double, 
      Unit
    ]
  ] = js.native
  /**
    * (default []) Defines the anchor links (#example) to be shown on the URL for each section. Anchors value should be unique. The position of the anchors in the array will define to which sections the anchor is applied. (second position for second section and so on). Using anchors forward and backward navigation will also be possible through the browser. This option also allows users to bookmark a specific section or slide. Be careful! anchors can not have the same value as any ID element on the site (or NAME element for IE). Now anchors can be defined directly in the HTML structure by using the attribute data-anchor as explained here.
    */
  var anchors: js.UndefOr[js.Array[String]] = js.native
  /**
    * (default true) Defines whether the load of the site when given an anchor (#) will scroll with animation to its destination or will directly load on the given section.
    */
  var animateAnchor: js.UndefOr[Boolean] = js.native
  /**
    * (default true) Defines whether to use the "automatic" scrolling or the "normal" one. It also has affects the way the sections fit in the browser/device window in tablets and mobile phones.
    */
  var autoScrolling: js.UndefOr[Boolean] = js.native
  /**
    * Defines how to scroll to a section which size is bigger than the viewport. By default fullPage.js scrolls to the top if you come from a section above the destination one and to the bottom if you come from a section below the destination one.
    */
  var bigSectionsDestination: js.UndefOr[top | bottom | Null] = js.native
  /**
    * Extension of fullpage.js. Defines whether or not to use the cards effect on sections/slides
    * @default false
    */
  var cards: js.UndefOr[Boolean] = js.native
  /**
    * Allows you to configure the parameters for the cards effect when using the option `cards:true`
    */
  var cardsOptions: js.UndefOr[FadeBackground] = js.native
  /**
    * (default false) Extension of fullpage.js. Defines whether sliding right in the last slide should slide right to the first one or not, and if scrolling left in the first slide should slide left to the last one or not. Not compatible with loopHorizontal. Requires fullpage.js >= 2.8.3.
    */
  var continuousHorizontal: js.UndefOr[Boolean] = js.native
  /**
    * (default false) Defines whether scrolling down in the last section should scroll down to the first one or not, and if scrolling up in the first section should scroll up to the last one or not. Not compatible with loopTop or loopBottom.
    */
  var continuousVertical: js.UndefOr[Boolean] = js.native
  // Design
  /**
    * (default: true) Determines whether to use control arrows for the slides to move right or left.
    */
  var controlArrows: js.UndefOr[Boolean] = js.native
  // Scrolling
  /**
    * (default true). Defines whether to use JavaScript or CSS3 transforms to scroll within sections and slides. Useful to speed up the movement in tablet and mobile devices with browsers supporting CSS3. If this option is set to true and the browser doesn't support CSS3, a jQuery fallback will be used instead.
    */
  var css3: js.UndefOr[Boolean] = js.native
  /**
    * Enables or disables the dragging and flicking of sections and slides by using mouse or fingers. Requires fullpage.js >= 2.8.9. Possible values are: 
    * true: enables the feature.
    * false: disables the feature.
    * vertical: enables the feature only vertically.
    * horizontal: enables the feature only horizontally.
    * fingersonly: enables the feature for touch devices only.
    * mouseonly: enables the feature for desktop devices only (mouse and trackpad).
    */
  var dragAndMove: js.UndefOr[Boolean | vertical | horizontal | fingersonly | mouseonly] = js.native
  /**
    * (default easeInOutCubic) Defines the transition effect to use for the vertical and horizontal scrolling. It requires the file vendors/jquery.easings.min.js or jQuery UI for using some of its transitions. Other libraries could be used instead.
    */
  var easing: js.UndefOr[String] = js.native
  /**
    * (default ease) Defines the transition effect to use in case of using css3:true. You can use the pre-defined ones (such as linear, ease-out...) or create your own ones using the cubic-bezier function. You might want to use Matthew Lein CSS Easing Animation Tool for it.
    */
  var easingcss3: js.UndefOr[String] = js.native
  /**
    * Defines whether to use a fading effect or not instead of the default scrolling one. Possible values are true, false, sections, slides. It can therefore be applied just vertically or horizontally, or to both at the time. Requires fullpage.js >= 2.8.6.
    */
  var fadingEffect: js.UndefOr[Boolean | sections | slides] = js.native
  /**
    * (default true). Determines whether or not to fit sections to the viewport or not. When set to true the current active section will always fill the whole viewport. Otherwise the user will be free to stop in the middle of a section (when )
    */
  var fitToSection: js.UndefOr[Boolean] = js.native
  /**
    * (default 1000). If fitToSection is set to true, this delays the fitting by the configured milliseconds.
    */
  var fitToSectionDelay: js.UndefOr[Double] = js.native
  /**
    * (default null) Defines which elements will be taken off the scrolling structure of the plugin which is necessary when using the css3 option to keep them fixed. It requires a string with the jQuery selectors for those elements. (For example: fixedElements: '#element1, .element2')
    */
  var fixedElements: js.UndefOr[String] = js.native
  /** 
    * (default false) Extension of fullpage.js. Determines whether moving one horizontal slider will force the sliding of sliders in other section in the same direction. Possible values are true, false or an array with the interlocked sections. For example [1,3,5] starting by 1. Requires fullpage.js >= 2.8.3. 
    */
  var interlockedSlides: js.UndefOr[Boolean | js.Array[Double]] = js.native
  // Accessibility
  /**
    * (default true) Defines if the content can be navigated using the keyboard
    */
  var keyboardScrolling: js.UndefOr[Boolean] = js.native
  /**
    * Lazy loading is active by default which means it will lazy load any media element containing the attribute data-src as detailed in the Lazy Loading docs . If you want to use any other lazy loading library you can disable this fullpage.js feature.
    */ 
  var lazyLoading: js.UndefOr[Boolean] = js.native
  /**
    * (default false). Determines whether anchors in the URL will have any effect at all in the plugin. You can still using anchors internally for your own functions and callbacks, but they won't have any effect in the scrolling of the site. Useful if you want to combine fullPage.js with other plugins using anchor in the URL.
    */
  var lockAnchors: js.UndefOr[Boolean] = js.native
  /**
    * (default false) Defines whether scrolling down in the last section should scroll to the first one or not.
    */
  var loopBottom: js.UndefOr[Boolean] = js.native
  /**
    * (default true) Defines whether horizontal sliders will loop after reaching the last or previous slide or not.
    */
  var loopHorizontal: js.UndefOr[Boolean] = js.native
  /**
    *  (default false) Defines whether scrolling up in the first section should scroll to the last one or not.
    */
  var loopTop: js.UndefOr[Boolean] = js.native
  /**
    * (default false) A selector can be used to specify the menu to link with the sections. This way the scrolling of the sections will activate the corresponding element in the menu using the class active. This won't generate a menu but will just add the active class to the element in the given menu with the corresponding anchor links. In order to link the elements of the menu with the sections, an HTML 5 data-tag (data-menuanchor) will be needed to use with the same anchor links as used within the sections.
    */
  var menu: js.UndefOr[String] = js.native
  /**
    * (default false) If set to true, it will show a navigation bar made up of small circles.
    */
  var navigation: js.UndefOr[Boolean] = js.native
  /**
    * (default none) It can be set to left or right and defines which position the navigation bar will be shown (if using one).
    */
  var navigationPosition: js.UndefOr[String] = js.native
  /**
    * (default []) Defines the tooltips to show for the navigation circles in case they are being used. Example: navigationTooltips: ['firstSlide', 'secondSlide'].
    */
  var navigationTooltips: js.UndefOr[js.Array[String]] = js.native
  /**
    * (default 5) Defines the threshold for the number of hops up the html node tree Fullpage will test to see if normalScrollElements is a match to allow scrolling functionality on divs on a touch device. (For example: normalScrollElementTouchThreshold: 3)
    */
  var normalScrollElementTouchThreshold: js.UndefOr[Double] = js.native
  /**
    *  (default null) If you want to avoid the auto scroll when scrolling over some elements, this is the option you need to use. (useful for maps, scrolling divs etc.) It requires a string with the jQuery selectors for those elements. (For example: normalScrollElements: '#element1, .element2')
    */
  var normalScrollElements: js.UndefOr[String] = js.native
  /**
    * (default false)Extension of fullpage.js. Provides a way to use non full screen sections based on percentage. Ideal to show visitors there's more content in the site by showing part of the next or previous section. Requires fullPage.js >= 2.8.8 To define the percentage of each section the attribute data-percentage must be used. The centering of the section in the viewport can be determined by using a boolean value in the attribute data-centered (default to true if not specified). For example:
    */
  var offsetSections: js.UndefOr[Boolean] = js.native
  // Events
  /**
    * This callback is fired once the user leaves a section, in the transition to the new section. Returning false will cancel the move before it takes place.
    * @param index index of the leaving section. Starting from 1.
    * @param nextIndex index of the destination section. Starting from 1.
    * @param direction it will take the values up or down depending on the scrolling direction.
    */
  var onLeave: js.UndefOr[
    js.Function3[/* index */ Double, /* nextIndex */ Double, /* direction */ String, Unit]
  ] = js.native
  /**
    * This callback is fired once the user leaves an slide to go to another, in the transition to the new slide. Returning false will cancel the move before it takes place.
    * @param anchorLink: anchorLink corresponding to the section.
    * @param index index of the section. Starting from 1.
    * @param slideIndex index of the slide. Starting from 0.
    * @param direction takes the values right or left depending on the scrolling direction.
    * @param nextSlideIndex index of the destination slide. Starting from 0.
    */
  var onSlideLeave: js.UndefOr[
    js.Function5[
      /* anchorLink */ String, 
      /* index */ Double, 
      /* slideIndex */ Double, 
      /* direction */ String, 
      /* nextSlideIndex */ Double, 
      Unit
    ]
  ] = js.native
  /**
    * (default 0) Defines the bottom padding for each section with a numerical value and its measure (paddingBottom: '10px', paddingBottom: '10em'...). Useful in case of using a fixed footer.
    */
  var paddingBottom: js.UndefOr[String] = js.native
  /**
    * (default 0) Defines the top padding for each section with a numerical value and its measure (paddingTop: '10px', paddingTop: '10em'...) Useful in case of using a fixed header.
    */
  var paddingTop: js.UndefOr[String] = js.native
  /**
    * When set to true slides will be turned into vertical sections when responsive mode is fired. (by using the responsiveWidth or responsiveHeight options detailed above). Requires fullpage.js >= 2.8.5.
    */
  var parallax: js.UndefOr[Boolean] = js.native
  /**
    * Allows to configure the parameters for the parallax backgrounds effect when using the option parallax:true.
    */ 
  var parallaxOptions: js.UndefOr[Percentage] = js.native
  /**
    * (default true) Defines whether to push the state of the site to the browser's history. When set to true each section/slide of the site will act as a new page and the back and forward buttons of the browser will scroll the sections/slides to reach the previous or next state of the site. When set to false, the URL will keep changing but will have no effect on the browser's history. This option is automatically turned off when using autoScrolling:false.
    */
  var recordHistory: js.UndefOr[Boolean] = js.native
  /** 
    * (default false). Extension of fullpage.js. Defines whether or not to reset every slider after leaving its section. Requires fullpage.js >= 2.8.3.
    */
  var resetSliders: js.UndefOr[Boolean] = js.native
  var resize: js.UndefOr[Boolean] = js.native
  /**
    * (default 0) A normal scroll (autoScrolling:false) will be used under the defined height in pixels. A class fp-responsive is added to the body tag in case the user wants to use it for their own responsive CSS. For example, if set to 900, whenever the browser's height is less than 900 the plugin will scroll like a normal site.
    */
  var responsiveHeight: js.UndefOr[Double] = js.native
  /** 
    * When set to true slides will be turned into vertical sections when responsive mode is fired. (by using the responsiveWidth or responsiveHeight options detailed above). Requires fullpage.js >= 2.8.5.
    */ 
  var responsiveSlides: js.UndefOr[Boolean] = js.native
  /**
    *  (default 0) A normal scroll (autoScrolling:false) will be used under the defined width in pixels. A class fp-responsive is added to the body tag in case the user wants to use it for their own responsive CSS. For example, if set to 900, whenever the browser's width is less than 900 the plugin will scroll like a normal site.
    */
  var responsiveWidth: js.UndefOr[Double] = js.native
  /**
    *  (default false). Determines whether to use scrollbar for the site or not. In case of using scroll bar, the autoScrolling functionality will still working as expected. The user will also be free to scroll the site with the scroll bar and fullPage.js will fit the section in the screen when scrolling finishes.
    */
  var scrollBar: js.UndefOr[Boolean] = js.native
  /**
    * (default false) Extension of fullpage.js. Defines whether to slide horizontally within sliders by using the mouse wheel or trackpad. Ideal for story telling. Requires fullpage.js >= 2.8.3.
    */
  var scrollHorizontally: js.UndefOr[Boolean] = js.native
  /**
    * (default false) defines whether or not to create a scroll for the section/slide in case its content is bigger than the height of it. When set to true, your content will be wrapped by the plugin. Consider using delegation or load your other scripts in the afterRender callback. In case of setting it to true, it requires the vendor library scrolloverflow.min.js and it should be loaded before the fullPage.js plugin.
    */
  var scrollOverflow: js.UndefOr[Boolean] = js.native
  /**
    * when using scrollOverflow:true fullpage.js will make use of a forked and modified version of iScroll.js libary. You can customize the scrolling behaviour by providing fullpage.js with the iScroll.js options you want to use. Check its documentation for more info.
    */
  var scrollOverflowOptions: js.UndefOr[js.Any] = js.native
  /**
    * When set to true it scrolls up the content of the section/slide with scroll bar when leaving to another vertical section. This way the section/slide will always show the start of its content even when scrolling from a section under it
    */
  var scrollOverflowReset: js.UndefOr[Boolean] = js.native
  /**
    * (default 700) Speed in milliseconds for the scrolling transitions.
    */
  var scrollingSpeed: js.UndefOr[Double] = js.native
  // Custom selectors
  /**
    * (default .section) Defines the jQuery selector used for the plugin sections. It might need to be changed sometimes to avoid problem with other plugins using the same selectors as fullpage.js.
    */
  var sectionSelector: js.UndefOr[String] = js.native
  /**
    * (default none) Define the CSS background-color property for each section
    */
  var sectionsColor: js.UndefOr[js.Array[String]] = js.native
  /**
    * (default false) Shows a persistent tooltip for the actively viewed section in the vertical navigation.
    */
  var showActiveTooltip: js.UndefOr[Boolean] = js.native
  /**
    * (default .slide) Defines the jQuery selector used for the plugin slides. It might need to be changed sometimes to avoid problem with other plugins using the same selectors as fullpage.js.
    */
  var slideSelector: js.UndefOr[String] = js.native
  /**
    * (default bottom) Defines the position for the landscape navigation bar for sliders. Admits top and bottom as values. You may want to modify the CSS styles to determine the distance from the top or bottom as well as any other style such as color.
    */
  var slidesNavPosition: js.UndefOr[String] = js.native
  /**
    * (default false) If set to true it will show a navigation bar made up of small circles for each landscape slider on the site.
    */
  var slidesNavigation: js.UndefOr[Boolean] = js.native
  /**
    * (default 5) Defines a percentage of the browsers window width/height, and how far a swipe must measure for navigating to the next section / slide
    */
  var touchSensitivity: js.UndefOr[Double] = js.native
  /**
    * (default true) Vertically centering of the content within sections. When set to true, your content will be wrapped by the plugin. Consider using delegation or load your other scripts in the afterRender callback.
    */
  var verticalCentered: js.UndefOr[Boolean] = js.native
}

object FullPageJsOptions {
  @scala.inline
  def apply(): FullPageJsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullPageJsOptions]
  }
  @scala.inline
  implicit class FullPageJsOptionsOps[Self <: FullPageJsOptions] (val x: Self) extends AnyVal {
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
    def setAfterLoad(value: (/* anchorLink */ String, /* index */ Double) => Unit): Self = this.set("afterLoad", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterLoad: Self = this.set("afterLoad", js.undefined)
    @scala.inline
    def setAfterRender(value: () => Unit): Self = this.set("afterRender", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterRender: Self = this.set("afterRender", js.undefined)
    @scala.inline
    def setAfterResize(value: () => Unit): Self = this.set("afterResize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterResize: Self = this.set("afterResize", js.undefined)
    @scala.inline
    def setAfterResponsive(value: /* isResponsive */ Boolean => Unit): Self = this.set("afterResponsive", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterResponsive: Self = this.set("afterResponsive", js.undefined)
    @scala.inline
    def setAfterSlideLoad(
      value: (/* anchorLink */ String, /* index */ Double, /* slideAnchor */ String, /* slideIndex */ Double) => Unit
    ): Self = this.set("afterSlideLoad", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterSlideLoad: Self = this.set("afterSlideLoad", js.undefined)
    @scala.inline
    def setAnchorsVarargs(value: String*): Self = this.set("anchors", js.Array(value :_*))
    @scala.inline
    def setAnchors(value: js.Array[String]): Self = this.set("anchors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchors: Self = this.set("anchors", js.undefined)
    @scala.inline
    def setAnimateAnchor(value: Boolean): Self = this.set("animateAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateAnchor: Self = this.set("animateAnchor", js.undefined)
    @scala.inline
    def setAutoScrolling(value: Boolean): Self = this.set("autoScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScrolling: Self = this.set("autoScrolling", js.undefined)
    @scala.inline
    def setBigSectionsDestination(value: top | bottom): Self = this.set("bigSectionsDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBigSectionsDestination: Self = this.set("bigSectionsDestination", js.undefined)
    @scala.inline
    def setBigSectionsDestinationNull: Self = this.set("bigSectionsDestination", null)
    @scala.inline
    def setCards(value: Boolean): Self = this.set("cards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCards: Self = this.set("cards", js.undefined)
    @scala.inline
    def setCardsOptions(value: FadeBackground): Self = this.set("cardsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardsOptions: Self = this.set("cardsOptions", js.undefined)
    @scala.inline
    def setContinuousHorizontal(value: Boolean): Self = this.set("continuousHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinuousHorizontal: Self = this.set("continuousHorizontal", js.undefined)
    @scala.inline
    def setContinuousVertical(value: Boolean): Self = this.set("continuousVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinuousVertical: Self = this.set("continuousVertical", js.undefined)
    @scala.inline
    def setControlArrows(value: Boolean): Self = this.set("controlArrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlArrows: Self = this.set("controlArrows", js.undefined)
    @scala.inline
    def setCss3(value: Boolean): Self = this.set("css3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss3: Self = this.set("css3", js.undefined)
    @scala.inline
    def setDragAndMove(value: Boolean | vertical | horizontal | fingersonly | mouseonly): Self = this.set("dragAndMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragAndMove: Self = this.set("dragAndMove", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setEasingcss3(value: String): Self = this.set("easingcss3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasingcss3: Self = this.set("easingcss3", js.undefined)
    @scala.inline
    def setFadingEffect(value: Boolean | sections | slides): Self = this.set("fadingEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadingEffect: Self = this.set("fadingEffect", js.undefined)
    @scala.inline
    def setFitToSection(value: Boolean): Self = this.set("fitToSection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitToSection: Self = this.set("fitToSection", js.undefined)
    @scala.inline
    def setFitToSectionDelay(value: Double): Self = this.set("fitToSectionDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitToSectionDelay: Self = this.set("fitToSectionDelay", js.undefined)
    @scala.inline
    def setFixedElements(value: String): Self = this.set("fixedElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedElements: Self = this.set("fixedElements", js.undefined)
    @scala.inline
    def setInterlockedSlidesVarargs(value: Double*): Self = this.set("interlockedSlides", js.Array(value :_*))
    @scala.inline
    def setInterlockedSlides(value: Boolean | js.Array[Double]): Self = this.set("interlockedSlides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterlockedSlides: Self = this.set("interlockedSlides", js.undefined)
    @scala.inline
    def setKeyboardScrolling(value: Boolean): Self = this.set("keyboardScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardScrolling: Self = this.set("keyboardScrolling", js.undefined)
    @scala.inline
    def setLazyLoading(value: Boolean): Self = this.set("lazyLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazyLoading: Self = this.set("lazyLoading", js.undefined)
    @scala.inline
    def setLockAnchors(value: Boolean): Self = this.set("lockAnchors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockAnchors: Self = this.set("lockAnchors", js.undefined)
    @scala.inline
    def setLoopBottom(value: Boolean): Self = this.set("loopBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoopBottom: Self = this.set("loopBottom", js.undefined)
    @scala.inline
    def setLoopHorizontal(value: Boolean): Self = this.set("loopHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoopHorizontal: Self = this.set("loopHorizontal", js.undefined)
    @scala.inline
    def setLoopTop(value: Boolean): Self = this.set("loopTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoopTop: Self = this.set("loopTop", js.undefined)
    @scala.inline
    def setMenu(value: String): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    @scala.inline
    def setNavigation(value: Boolean): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    @scala.inline
    def setNavigationPosition(value: String): Self = this.set("navigationPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationPosition: Self = this.set("navigationPosition", js.undefined)
    @scala.inline
    def setNavigationTooltipsVarargs(value: String*): Self = this.set("navigationTooltips", js.Array(value :_*))
    @scala.inline
    def setNavigationTooltips(value: js.Array[String]): Self = this.set("navigationTooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationTooltips: Self = this.set("navigationTooltips", js.undefined)
    @scala.inline
    def setNormalScrollElementTouchThreshold(value: Double): Self = this.set("normalScrollElementTouchThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalScrollElementTouchThreshold: Self = this.set("normalScrollElementTouchThreshold", js.undefined)
    @scala.inline
    def setNormalScrollElements(value: String): Self = this.set("normalScrollElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalScrollElements: Self = this.set("normalScrollElements", js.undefined)
    @scala.inline
    def setOffsetSections(value: Boolean): Self = this.set("offsetSections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetSections: Self = this.set("offsetSections", js.undefined)
    @scala.inline
    def setOnLeave(value: (/* index */ Double, /* nextIndex */ Double, /* direction */ String) => Unit): Self = this.set("onLeave", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnLeave: Self = this.set("onLeave", js.undefined)
    @scala.inline
    def setOnSlideLeave(
      value: (/* anchorLink */ String, /* index */ Double, /* slideIndex */ Double, /* direction */ String, /* nextSlideIndex */ Double) => Unit
    ): Self = this.set("onSlideLeave", js.Any.fromFunction5(value))
    @scala.inline
    def deleteOnSlideLeave: Self = this.set("onSlideLeave", js.undefined)
    @scala.inline
    def setPaddingBottom(value: String): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    @scala.inline
    def setPaddingTop(value: String): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    @scala.inline
    def setParallax(value: Boolean): Self = this.set("parallax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallax: Self = this.set("parallax", js.undefined)
    @scala.inline
    def setParallaxOptions(value: Percentage): Self = this.set("parallaxOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallaxOptions: Self = this.set("parallaxOptions", js.undefined)
    @scala.inline
    def setRecordHistory(value: Boolean): Self = this.set("recordHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordHistory: Self = this.set("recordHistory", js.undefined)
    @scala.inline
    def setResetSliders(value: Boolean): Self = this.set("resetSliders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetSliders: Self = this.set("resetSliders", js.undefined)
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setResponsiveHeight(value: Double): Self = this.set("responsiveHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveHeight: Self = this.set("responsiveHeight", js.undefined)
    @scala.inline
    def setResponsiveSlides(value: Boolean): Self = this.set("responsiveSlides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveSlides: Self = this.set("responsiveSlides", js.undefined)
    @scala.inline
    def setResponsiveWidth(value: Double): Self = this.set("responsiveWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveWidth: Self = this.set("responsiveWidth", js.undefined)
    @scala.inline
    def setScrollBar(value: Boolean): Self = this.set("scrollBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollBar: Self = this.set("scrollBar", js.undefined)
    @scala.inline
    def setScrollHorizontally(value: Boolean): Self = this.set("scrollHorizontally", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollHorizontally: Self = this.set("scrollHorizontally", js.undefined)
    @scala.inline
    def setScrollOverflow(value: Boolean): Self = this.set("scrollOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollOverflow: Self = this.set("scrollOverflow", js.undefined)
    @scala.inline
    def setScrollOverflowOptions(value: js.Any): Self = this.set("scrollOverflowOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollOverflowOptions: Self = this.set("scrollOverflowOptions", js.undefined)
    @scala.inline
    def setScrollOverflowReset(value: Boolean): Self = this.set("scrollOverflowReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollOverflowReset: Self = this.set("scrollOverflowReset", js.undefined)
    @scala.inline
    def setScrollingSpeed(value: Double): Self = this.set("scrollingSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollingSpeed: Self = this.set("scrollingSpeed", js.undefined)
    @scala.inline
    def setSectionSelector(value: String): Self = this.set("sectionSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectionSelector: Self = this.set("sectionSelector", js.undefined)
    @scala.inline
    def setSectionsColorVarargs(value: String*): Self = this.set("sectionsColor", js.Array(value :_*))
    @scala.inline
    def setSectionsColor(value: js.Array[String]): Self = this.set("sectionsColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectionsColor: Self = this.set("sectionsColor", js.undefined)
    @scala.inline
    def setShowActiveTooltip(value: Boolean): Self = this.set("showActiveTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowActiveTooltip: Self = this.set("showActiveTooltip", js.undefined)
    @scala.inline
    def setSlideSelector(value: String): Self = this.set("slideSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideSelector: Self = this.set("slideSelector", js.undefined)
    @scala.inline
    def setSlidesNavPosition(value: String): Self = this.set("slidesNavPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesNavPosition: Self = this.set("slidesNavPosition", js.undefined)
    @scala.inline
    def setSlidesNavigation(value: Boolean): Self = this.set("slidesNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesNavigation: Self = this.set("slidesNavigation", js.undefined)
    @scala.inline
    def setTouchSensitivity(value: Double): Self = this.set("touchSensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchSensitivity: Self = this.set("touchSensitivity", js.undefined)
    @scala.inline
    def setVerticalCentered(value: Boolean): Self = this.set("verticalCentered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalCentered: Self = this.set("verticalCentered", js.undefined)
  }
  
}

