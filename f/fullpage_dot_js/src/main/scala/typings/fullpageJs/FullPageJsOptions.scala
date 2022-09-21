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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullPageJsOptions extends StObject {
  
  /**
    * Callback fired once the sections have been loaded, after the scrolling has ended.
    * @param anchorLink anchorLink corresponding to the section.
    * @param index index of the section. Starting from 1.
    */
  var afterLoad: js.UndefOr[js.Function2[/* anchorLink */ String, /* index */ Double, Unit]] = js.undefined
  
  /**
    * This callback is fired just after the structure of the page is generated. This is the callback you want to use to initialize other plugins or fire any code which requires the document to be ready (as this plugin modifies the DOM to create the resulting structure).
    */
  var afterRender: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * This callback is fired after resizing the browser's window. Just after the sections are resized.
    */
  var afterResize: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * This callback is fired after fullpage.js changes from normal to responsive mode or from responsive mode to normal mode.
    * @param {boolean} isResponsive boolean that determines if it enters into responsive mode (true) or goes back to normal mode (false)
    */
  var afterResponsive: js.UndefOr[js.Function1[/* isResponsive */ Boolean, Unit]] = js.undefined
  
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
  ] = js.undefined
  
  /**
    * (default []) Defines the anchor links (#example) to be shown on the URL for each section. Anchors value should be unique. The position of the anchors in the array will define to which sections the anchor is applied. (second position for second section and so on). Using anchors forward and backward navigation will also be possible through the browser. This option also allows users to bookmark a specific section or slide. Be careful! anchors can not have the same value as any ID element on the site (or NAME element for IE). Now anchors can be defined directly in the HTML structure by using the attribute data-anchor as explained here.
    */
  var anchors: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * (default true) Defines whether the load of the site when given an anchor (#) will scroll with animation to its destination or will directly load on the given section.
    */
  var animateAnchor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (default true) Defines whether to use the "automatic" scrolling or the "normal" one. It also has affects the way the sections fit in the browser/device window in tablets and mobile phones.
    */
  var autoScrolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines how to scroll to a section which size is bigger than the viewport. By default fullPage.js scrolls to the top if you come from a section above the destination one and to the bottom if you come from a section below the destination one.
    */
  var bigSectionsDestination: js.UndefOr[top | bottom | Null] = js.undefined
  
  /**
    * Extension of fullpage.js. Defines whether or not to use the cards effect on sections/slides
    * @default false
    */
  var cards: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows you to configure the parameters for the cards effect when using the option `cards:true`
    */
  var cardsOptions: js.UndefOr[FadeBackground] = js.undefined
  
  /**
    * (default false) Extension of fullpage.js. Defines whether sliding right in the last slide should slide right to the first one or not, and if scrolling left in the first slide should slide left to the last one or not. Not compatible with loopHorizontal. Requires fullpage.js >= 2.8.3.
    */
  var continuousHorizontal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (default false) Defines whether scrolling down in the last section should scroll down to the first one or not, and if scrolling up in the first section should scroll up to the last one or not. Not compatible with loopTop or loopBottom.
    */
  var continuousVertical: js.UndefOr[Boolean] = js.undefined
  
  // Design
  /**
    * (default: true) Determines whether to use control arrows for the slides to move right or left.
    */
  var controlArrows: js.UndefOr[Boolean] = js.undefined
  
  // Scrolling
  /**
    * (default true). Defines whether to use JavaScript or CSS3 transforms to scroll within sections and slides. Useful to speed up the movement in tablet and mobile devices with browsers supporting CSS3. If this option is set to true and the browser doesn't support CSS3, a jQuery fallback will be used instead.
    */
  var css3: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables or disables the dragging and flicking of sections and slides by using mouse or fingers. Requires fullpage.js >= 2.8.9. Possible values are: 
    * true: enables the feature.
    * false: disables the feature.
    * vertical: enables the feature only vertically.
    * horizontal: enables the feature only horizontally.
    * fingersonly: enables the feature for touch devices only.
    * mouseonly: enables the feature for desktop devices only (mouse and trackpad).
    */
  var dragAndMove: js.UndefOr[Boolean | vertical | horizontal | fingersonly | mouseonly] = js.undefined
  
  /**
    * (default easeInOutCubic) Defines the transition effect to use for the vertical and horizontal scrolling. It requires the file vendors/jquery.easings.min.js or jQuery UI for using some of its transitions. Other libraries could be used instead.
    */
  var easing: js.UndefOr[String] = js.undefined
  
  /**
    * (default ease) Defines the transition effect to use in case of using css3:true. You can use the pre-defined ones (such as linear, ease-out...) or create your own ones using the cubic-bezier function. You might want to use Matthew Lein CSS Easing Animation Tool for it.
    */
  var easingcss3: js.UndefOr[String] = js.undefined
  
  /**
    * Defines whether to use a fading effect or not instead of the default scrolling one. Possible values are true, false, sections, slides. It can therefore be applied just vertically or horizontally, or to both at the time. Requires fullpage.js >= 2.8.6.
    */
  var fadingEffect: js.UndefOr[Boolean | sections | slides] = js.undefined
  
  /**
    * (default true). Determines whether or not to fit sections to the viewport or not. When set to true the current active section will always fill the whole viewport. Otherwise the user will be free to stop in the middle of a section (when )
    */
  var fitToSection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (default 1000). If fitToSection is set to true, this delays the fitting by the configured milliseconds.
    */
  var fitToSectionDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * (default null) Defines which elements will be taken off the scrolling structure of the plugin which is necessary when using the css3 option to keep them fixed. It requires a string with the jQuery selectors for those elements. (For example: fixedElements: '#element1, .element2')
    */
  var fixedElements: js.UndefOr[String] = js.undefined
  
  /** 
    * (default false) Extension of fullpage.js. Determines whether moving one horizontal slider will force the sliding of sliders in other section in the same direction. Possible values are true, false or an array with the interlocked sections. For example [1,3,5] starting by 1. Requires fullpage.js >= 2.8.3. 
    */
  var interlockedSlides: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
  
  // Accessibility
  /**
    * (default true) Defines if the content can be navigated using the keyboard
    */
  var keyboardScrolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Lazy loading is active by default which means it will lazy load any media element containing the attribute data-src as detailed in the Lazy Loading docs . If you want to use any other lazy loading library you can disable this fullpage.js feature.
    */ 
  var lazyLoading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (default false). Determines whether anchors in the URL will have any effect at all in the plugin. You can still using anchors internally for your own functions and callbacks, but they won't have any effect in the scrolling of the site. Useful if you want to combine fullPage.js with other plugins using anchor in the URL.
    */
  var lockAnchors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (default false) Defines whether scrolling down in the last section should scroll to the first one or not.
    */
  var loopBottom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (default true) Defines whether horizontal sliders will loop after reaching the last or previous slide or not.
    */
  var loopHorizontal: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  (default false) Defines whether scrolling up in the first section should scroll to the last one or not.
    */
  var loopTop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (default false) A selector can be used to specify the menu to link with the sections. This way the scrolling of the sections will activate the corresponding element in the menu using the class active. This won't generate a menu but will just add the active class to the element in the given menu with the corresponding anchor links. In order to link the elements of the menu with the sections, an HTML 5 data-tag (data-menuanchor) will be needed to use with the same anchor links as used within the sections.
    */
  var menu: js.UndefOr[String] = js.undefined
  
  /**
    * (default false) If set to true, it will show a navigation bar made up of small circles.
    */
  var navigation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (default none) It can be set to left or right and defines which position the navigation bar will be shown (if using one).
    */
  var navigationPosition: js.UndefOr[String] = js.undefined
  
  /**
    * (default []) Defines the tooltips to show for the navigation circles in case they are being used. Example: navigationTooltips: ['firstSlide', 'secondSlide'].
    */
  var navigationTooltips: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * (default 5) Defines the threshold for the number of hops up the html node tree Fullpage will test to see if normalScrollElements is a match to allow scrolling functionality on divs on a touch device. (For example: normalScrollElementTouchThreshold: 3)
    */
  var normalScrollElementTouchThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    *  (default null) If you want to avoid the auto scroll when scrolling over some elements, this is the option you need to use. (useful for maps, scrolling divs etc.) It requires a string with the jQuery selectors for those elements. (For example: normalScrollElements: '#element1, .element2')
    */
  var normalScrollElements: js.UndefOr[String] = js.undefined
  
  /**
    * (default false)Extension of fullpage.js. Provides a way to use non full screen sections based on percentage. Ideal to show visitors there's more content in the site by showing part of the next or previous section. Requires fullPage.js >= 2.8.8 To define the percentage of each section the attribute data-percentage must be used. The centering of the section in the viewport can be determined by using a boolean value in the attribute data-centered (default to true if not specified). For example:
    */
  var offsetSections: js.UndefOr[Boolean] = js.undefined
  
  // Events
  /**
    * This callback is fired once the user leaves a section, in the transition to the new section. Returning false will cancel the move before it takes place.
    * @param index index of the leaving section. Starting from 1.
    * @param nextIndex index of the destination section. Starting from 1.
    * @param direction it will take the values up or down depending on the scrolling direction.
    */
  var onLeave: js.UndefOr[
    js.Function3[/* index */ Double, /* nextIndex */ Double, /* direction */ String, Unit]
  ] = js.undefined
  
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
  ] = js.undefined
  
  /**
    * (default 0) Defines the bottom padding for each section with a numerical value and its measure (paddingBottom: '10px', paddingBottom: '10em'...). Useful in case of using a fixed footer.
    */
  var paddingBottom: js.UndefOr[String] = js.undefined
  
  /**
    * (default 0) Defines the top padding for each section with a numerical value and its measure (paddingTop: '10px', paddingTop: '10em'...) Useful in case of using a fixed header.
    */
  var paddingTop: js.UndefOr[String] = js.undefined
  
  /**
    * When set to true slides will be turned into vertical sections when responsive mode is fired. (by using the responsiveWidth or responsiveHeight options detailed above). Requires fullpage.js >= 2.8.5.
    */
  var parallax: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows to configure the parameters for the parallax backgrounds effect when using the option parallax:true.
    */ 
  var parallaxOptions: js.UndefOr[Percentage] = js.undefined
  
  /**
    * (default true) Defines whether to push the state of the site to the browser's history. When set to true each section/slide of the site will act as a new page and the back and forward buttons of the browser will scroll the sections/slides to reach the previous or next state of the site. When set to false, the URL will keep changing but will have no effect on the browser's history. This option is automatically turned off when using autoScrolling:false.
    */
  var recordHistory: js.UndefOr[Boolean] = js.undefined
  
  /** 
    * (default false). Extension of fullpage.js. Defines whether or not to reset every slider after leaving its section. Requires fullpage.js >= 2.8.3.
    */
  var resetSliders: js.UndefOr[Boolean] = js.undefined
  
  var resize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (default 0) A normal scroll (autoScrolling:false) will be used under the defined height in pixels. A class fp-responsive is added to the body tag in case the user wants to use it for their own responsive CSS. For example, if set to 900, whenever the browser's height is less than 900 the plugin will scroll like a normal site.
    */
  var responsiveHeight: js.UndefOr[Double] = js.undefined
  
  /** 
    * When set to true slides will be turned into vertical sections when responsive mode is fired. (by using the responsiveWidth or responsiveHeight options detailed above). Requires fullpage.js >= 2.8.5.
    */ 
  var responsiveSlides: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  (default 0) A normal scroll (autoScrolling:false) will be used under the defined width in pixels. A class fp-responsive is added to the body tag in case the user wants to use it for their own responsive CSS. For example, if set to 900, whenever the browser's width is less than 900 the plugin will scroll like a normal site.
    */
  var responsiveWidth: js.UndefOr[Double] = js.undefined
  
  /**
    *  (default false). Determines whether to use scrollbar for the site or not. In case of using scroll bar, the autoScrolling functionality will still working as expected. The user will also be free to scroll the site with the scroll bar and fullPage.js will fit the section in the screen when scrolling finishes.
    */
  var scrollBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (default false) Extension of fullpage.js. Defines whether to slide horizontally within sliders by using the mouse wheel or trackpad. Ideal for story telling. Requires fullpage.js >= 2.8.3.
    */
  var scrollHorizontally: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (default false) defines whether or not to create a scroll for the section/slide in case its content is bigger than the height of it. When set to true, your content will be wrapped by the plugin. Consider using delegation or load your other scripts in the afterRender callback. In case of setting it to true, it requires the vendor library scrolloverflow.min.js and it should be loaded before the fullPage.js plugin.
    */
  var scrollOverflow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * when using scrollOverflow:true fullpage.js will make use of a forked and modified version of iScroll.js libary. You can customize the scrolling behaviour by providing fullpage.js with the iScroll.js options you want to use. Check its documentation for more info.
    */
  var scrollOverflowOptions: js.UndefOr[Any] = js.undefined
  
  /**
    * When set to true it scrolls up the content of the section/slide with scroll bar when leaving to another vertical section. This way the section/slide will always show the start of its content even when scrolling from a section under it
    */
  var scrollOverflowReset: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (default 700) Speed in milliseconds for the scrolling transitions.
    */
  var scrollingSpeed: js.UndefOr[Double] = js.undefined
  
  // Custom selectors
  /**
    * (default .section) Defines the jQuery selector used for the plugin sections. It might need to be changed sometimes to avoid problem with other plugins using the same selectors as fullpage.js.
    */
  var sectionSelector: js.UndefOr[String] = js.undefined
  
  /**
    * (default none) Define the CSS background-color property for each section
    */
  var sectionsColor: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * (default false) Shows a persistent tooltip for the actively viewed section in the vertical navigation.
    */
  var showActiveTooltip: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (default .slide) Defines the jQuery selector used for the plugin slides. It might need to be changed sometimes to avoid problem with other plugins using the same selectors as fullpage.js.
    */
  var slideSelector: js.UndefOr[String] = js.undefined
  
  /**
    * (default bottom) Defines the position for the landscape navigation bar for sliders. Admits top and bottom as values. You may want to modify the CSS styles to determine the distance from the top or bottom as well as any other style such as color.
    */
  var slidesNavPosition: js.UndefOr[String] = js.undefined
  
  /**
    * (default false) If set to true it will show a navigation bar made up of small circles for each landscape slider on the site.
    */
  var slidesNavigation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (default 5) Defines a percentage of the browsers window width/height, and how far a swipe must measure for navigating to the next section / slide
    */
  var touchSensitivity: js.UndefOr[Double] = js.undefined
  
  /**
    * (default true) Vertically centering of the content within sections. When set to true, your content will be wrapped by the plugin. Consider using delegation or load your other scripts in the afterRender callback.
    */
  var verticalCentered: js.UndefOr[Boolean] = js.undefined
}
object FullPageJsOptions {
  
  inline def apply(): FullPageJsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullPageJsOptions]
  }
  
  extension [Self <: FullPageJsOptions](x: Self) {
    
    inline def setAfterLoad(value: (/* anchorLink */ String, /* index */ Double) => Unit): Self = StObject.set(x, "afterLoad", js.Any.fromFunction2(value))
    
    inline def setAfterLoadUndefined: Self = StObject.set(x, "afterLoad", js.undefined)
    
    inline def setAfterRender(value: () => Unit): Self = StObject.set(x, "afterRender", js.Any.fromFunction0(value))
    
    inline def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
    
    inline def setAfterResize(value: () => Unit): Self = StObject.set(x, "afterResize", js.Any.fromFunction0(value))
    
    inline def setAfterResizeUndefined: Self = StObject.set(x, "afterResize", js.undefined)
    
    inline def setAfterResponsive(value: /* isResponsive */ Boolean => Unit): Self = StObject.set(x, "afterResponsive", js.Any.fromFunction1(value))
    
    inline def setAfterResponsiveUndefined: Self = StObject.set(x, "afterResponsive", js.undefined)
    
    inline def setAfterSlideLoad(
      value: (/* anchorLink */ String, /* index */ Double, /* slideAnchor */ String, /* slideIndex */ Double) => Unit
    ): Self = StObject.set(x, "afterSlideLoad", js.Any.fromFunction4(value))
    
    inline def setAfterSlideLoadUndefined: Self = StObject.set(x, "afterSlideLoad", js.undefined)
    
    inline def setAnchors(value: js.Array[String]): Self = StObject.set(x, "anchors", value.asInstanceOf[js.Any])
    
    inline def setAnchorsUndefined: Self = StObject.set(x, "anchors", js.undefined)
    
    inline def setAnchorsVarargs(value: String*): Self = StObject.set(x, "anchors", js.Array(value*))
    
    inline def setAnimateAnchor(value: Boolean): Self = StObject.set(x, "animateAnchor", value.asInstanceOf[js.Any])
    
    inline def setAnimateAnchorUndefined: Self = StObject.set(x, "animateAnchor", js.undefined)
    
    inline def setAutoScrolling(value: Boolean): Self = StObject.set(x, "autoScrolling", value.asInstanceOf[js.Any])
    
    inline def setAutoScrollingUndefined: Self = StObject.set(x, "autoScrolling", js.undefined)
    
    inline def setBigSectionsDestination(value: top | bottom): Self = StObject.set(x, "bigSectionsDestination", value.asInstanceOf[js.Any])
    
    inline def setBigSectionsDestinationNull: Self = StObject.set(x, "bigSectionsDestination", null)
    
    inline def setBigSectionsDestinationUndefined: Self = StObject.set(x, "bigSectionsDestination", js.undefined)
    
    inline def setCards(value: Boolean): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    inline def setCardsOptions(value: FadeBackground): Self = StObject.set(x, "cardsOptions", value.asInstanceOf[js.Any])
    
    inline def setCardsOptionsUndefined: Self = StObject.set(x, "cardsOptions", js.undefined)
    
    inline def setCardsUndefined: Self = StObject.set(x, "cards", js.undefined)
    
    inline def setContinuousHorizontal(value: Boolean): Self = StObject.set(x, "continuousHorizontal", value.asInstanceOf[js.Any])
    
    inline def setContinuousHorizontalUndefined: Self = StObject.set(x, "continuousHorizontal", js.undefined)
    
    inline def setContinuousVertical(value: Boolean): Self = StObject.set(x, "continuousVertical", value.asInstanceOf[js.Any])
    
    inline def setContinuousVerticalUndefined: Self = StObject.set(x, "continuousVertical", js.undefined)
    
    inline def setControlArrows(value: Boolean): Self = StObject.set(x, "controlArrows", value.asInstanceOf[js.Any])
    
    inline def setControlArrowsUndefined: Self = StObject.set(x, "controlArrows", js.undefined)
    
    inline def setCss3(value: Boolean): Self = StObject.set(x, "css3", value.asInstanceOf[js.Any])
    
    inline def setCss3Undefined: Self = StObject.set(x, "css3", js.undefined)
    
    inline def setDragAndMove(value: Boolean | vertical | horizontal | fingersonly | mouseonly): Self = StObject.set(x, "dragAndMove", value.asInstanceOf[js.Any])
    
    inline def setDragAndMoveUndefined: Self = StObject.set(x, "dragAndMove", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEasingcss3(value: String): Self = StObject.set(x, "easingcss3", value.asInstanceOf[js.Any])
    
    inline def setEasingcss3Undefined: Self = StObject.set(x, "easingcss3", js.undefined)
    
    inline def setFadingEffect(value: Boolean | sections | slides): Self = StObject.set(x, "fadingEffect", value.asInstanceOf[js.Any])
    
    inline def setFadingEffectUndefined: Self = StObject.set(x, "fadingEffect", js.undefined)
    
    inline def setFitToSection(value: Boolean): Self = StObject.set(x, "fitToSection", value.asInstanceOf[js.Any])
    
    inline def setFitToSectionDelay(value: Double): Self = StObject.set(x, "fitToSectionDelay", value.asInstanceOf[js.Any])
    
    inline def setFitToSectionDelayUndefined: Self = StObject.set(x, "fitToSectionDelay", js.undefined)
    
    inline def setFitToSectionUndefined: Self = StObject.set(x, "fitToSection", js.undefined)
    
    inline def setFixedElements(value: String): Self = StObject.set(x, "fixedElements", value.asInstanceOf[js.Any])
    
    inline def setFixedElementsUndefined: Self = StObject.set(x, "fixedElements", js.undefined)
    
    inline def setInterlockedSlides(value: Boolean | js.Array[Double]): Self = StObject.set(x, "interlockedSlides", value.asInstanceOf[js.Any])
    
    inline def setInterlockedSlidesUndefined: Self = StObject.set(x, "interlockedSlides", js.undefined)
    
    inline def setInterlockedSlidesVarargs(value: Double*): Self = StObject.set(x, "interlockedSlides", js.Array(value*))
    
    inline def setKeyboardScrolling(value: Boolean): Self = StObject.set(x, "keyboardScrolling", value.asInstanceOf[js.Any])
    
    inline def setKeyboardScrollingUndefined: Self = StObject.set(x, "keyboardScrolling", js.undefined)
    
    inline def setLazyLoading(value: Boolean): Self = StObject.set(x, "lazyLoading", value.asInstanceOf[js.Any])
    
    inline def setLazyLoadingUndefined: Self = StObject.set(x, "lazyLoading", js.undefined)
    
    inline def setLockAnchors(value: Boolean): Self = StObject.set(x, "lockAnchors", value.asInstanceOf[js.Any])
    
    inline def setLockAnchorsUndefined: Self = StObject.set(x, "lockAnchors", js.undefined)
    
    inline def setLoopBottom(value: Boolean): Self = StObject.set(x, "loopBottom", value.asInstanceOf[js.Any])
    
    inline def setLoopBottomUndefined: Self = StObject.set(x, "loopBottom", js.undefined)
    
    inline def setLoopHorizontal(value: Boolean): Self = StObject.set(x, "loopHorizontal", value.asInstanceOf[js.Any])
    
    inline def setLoopHorizontalUndefined: Self = StObject.set(x, "loopHorizontal", js.undefined)
    
    inline def setLoopTop(value: Boolean): Self = StObject.set(x, "loopTop", value.asInstanceOf[js.Any])
    
    inline def setLoopTopUndefined: Self = StObject.set(x, "loopTop", js.undefined)
    
    inline def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setNavigation(value: Boolean): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setNavigationPosition(value: String): Self = StObject.set(x, "navigationPosition", value.asInstanceOf[js.Any])
    
    inline def setNavigationPositionUndefined: Self = StObject.set(x, "navigationPosition", js.undefined)
    
    inline def setNavigationTooltips(value: js.Array[String]): Self = StObject.set(x, "navigationTooltips", value.asInstanceOf[js.Any])
    
    inline def setNavigationTooltipsUndefined: Self = StObject.set(x, "navigationTooltips", js.undefined)
    
    inline def setNavigationTooltipsVarargs(value: String*): Self = StObject.set(x, "navigationTooltips", js.Array(value*))
    
    inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    inline def setNormalScrollElementTouchThreshold(value: Double): Self = StObject.set(x, "normalScrollElementTouchThreshold", value.asInstanceOf[js.Any])
    
    inline def setNormalScrollElementTouchThresholdUndefined: Self = StObject.set(x, "normalScrollElementTouchThreshold", js.undefined)
    
    inline def setNormalScrollElements(value: String): Self = StObject.set(x, "normalScrollElements", value.asInstanceOf[js.Any])
    
    inline def setNormalScrollElementsUndefined: Self = StObject.set(x, "normalScrollElements", js.undefined)
    
    inline def setOffsetSections(value: Boolean): Self = StObject.set(x, "offsetSections", value.asInstanceOf[js.Any])
    
    inline def setOffsetSectionsUndefined: Self = StObject.set(x, "offsetSections", js.undefined)
    
    inline def setOnLeave(value: (/* index */ Double, /* nextIndex */ Double, /* direction */ String) => Unit): Self = StObject.set(x, "onLeave", js.Any.fromFunction3(value))
    
    inline def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
    
    inline def setOnSlideLeave(
      value: (/* anchorLink */ String, /* index */ Double, /* slideIndex */ Double, /* direction */ String, /* nextSlideIndex */ Double) => Unit
    ): Self = StObject.set(x, "onSlideLeave", js.Any.fromFunction5(value))
    
    inline def setOnSlideLeaveUndefined: Self = StObject.set(x, "onSlideLeave", js.undefined)
    
    inline def setPaddingBottom(value: String): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    inline def setPaddingTop(value: String): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    inline def setParallax(value: Boolean): Self = StObject.set(x, "parallax", value.asInstanceOf[js.Any])
    
    inline def setParallaxOptions(value: Percentage): Self = StObject.set(x, "parallaxOptions", value.asInstanceOf[js.Any])
    
    inline def setParallaxOptionsUndefined: Self = StObject.set(x, "parallaxOptions", js.undefined)
    
    inline def setParallaxUndefined: Self = StObject.set(x, "parallax", js.undefined)
    
    inline def setRecordHistory(value: Boolean): Self = StObject.set(x, "recordHistory", value.asInstanceOf[js.Any])
    
    inline def setRecordHistoryUndefined: Self = StObject.set(x, "recordHistory", js.undefined)
    
    inline def setResetSliders(value: Boolean): Self = StObject.set(x, "resetSliders", value.asInstanceOf[js.Any])
    
    inline def setResetSlidersUndefined: Self = StObject.set(x, "resetSliders", js.undefined)
    
    inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setResponsiveHeight(value: Double): Self = StObject.set(x, "responsiveHeight", value.asInstanceOf[js.Any])
    
    inline def setResponsiveHeightUndefined: Self = StObject.set(x, "responsiveHeight", js.undefined)
    
    inline def setResponsiveSlides(value: Boolean): Self = StObject.set(x, "responsiveSlides", value.asInstanceOf[js.Any])
    
    inline def setResponsiveSlidesUndefined: Self = StObject.set(x, "responsiveSlides", js.undefined)
    
    inline def setResponsiveWidth(value: Double): Self = StObject.set(x, "responsiveWidth", value.asInstanceOf[js.Any])
    
    inline def setResponsiveWidthUndefined: Self = StObject.set(x, "responsiveWidth", js.undefined)
    
    inline def setScrollBar(value: Boolean): Self = StObject.set(x, "scrollBar", value.asInstanceOf[js.Any])
    
    inline def setScrollBarUndefined: Self = StObject.set(x, "scrollBar", js.undefined)
    
    inline def setScrollHorizontally(value: Boolean): Self = StObject.set(x, "scrollHorizontally", value.asInstanceOf[js.Any])
    
    inline def setScrollHorizontallyUndefined: Self = StObject.set(x, "scrollHorizontally", js.undefined)
    
    inline def setScrollOverflow(value: Boolean): Self = StObject.set(x, "scrollOverflow", value.asInstanceOf[js.Any])
    
    inline def setScrollOverflowOptions(value: Any): Self = StObject.set(x, "scrollOverflowOptions", value.asInstanceOf[js.Any])
    
    inline def setScrollOverflowOptionsUndefined: Self = StObject.set(x, "scrollOverflowOptions", js.undefined)
    
    inline def setScrollOverflowReset(value: Boolean): Self = StObject.set(x, "scrollOverflowReset", value.asInstanceOf[js.Any])
    
    inline def setScrollOverflowResetUndefined: Self = StObject.set(x, "scrollOverflowReset", js.undefined)
    
    inline def setScrollOverflowUndefined: Self = StObject.set(x, "scrollOverflow", js.undefined)
    
    inline def setScrollingSpeed(value: Double): Self = StObject.set(x, "scrollingSpeed", value.asInstanceOf[js.Any])
    
    inline def setScrollingSpeedUndefined: Self = StObject.set(x, "scrollingSpeed", js.undefined)
    
    inline def setSectionSelector(value: String): Self = StObject.set(x, "sectionSelector", value.asInstanceOf[js.Any])
    
    inline def setSectionSelectorUndefined: Self = StObject.set(x, "sectionSelector", js.undefined)
    
    inline def setSectionsColor(value: js.Array[String]): Self = StObject.set(x, "sectionsColor", value.asInstanceOf[js.Any])
    
    inline def setSectionsColorUndefined: Self = StObject.set(x, "sectionsColor", js.undefined)
    
    inline def setSectionsColorVarargs(value: String*): Self = StObject.set(x, "sectionsColor", js.Array(value*))
    
    inline def setShowActiveTooltip(value: Boolean): Self = StObject.set(x, "showActiveTooltip", value.asInstanceOf[js.Any])
    
    inline def setShowActiveTooltipUndefined: Self = StObject.set(x, "showActiveTooltip", js.undefined)
    
    inline def setSlideSelector(value: String): Self = StObject.set(x, "slideSelector", value.asInstanceOf[js.Any])
    
    inline def setSlideSelectorUndefined: Self = StObject.set(x, "slideSelector", js.undefined)
    
    inline def setSlidesNavPosition(value: String): Self = StObject.set(x, "slidesNavPosition", value.asInstanceOf[js.Any])
    
    inline def setSlidesNavPositionUndefined: Self = StObject.set(x, "slidesNavPosition", js.undefined)
    
    inline def setSlidesNavigation(value: Boolean): Self = StObject.set(x, "slidesNavigation", value.asInstanceOf[js.Any])
    
    inline def setSlidesNavigationUndefined: Self = StObject.set(x, "slidesNavigation", js.undefined)
    
    inline def setTouchSensitivity(value: Double): Self = StObject.set(x, "touchSensitivity", value.asInstanceOf[js.Any])
    
    inline def setTouchSensitivityUndefined: Self = StObject.set(x, "touchSensitivity", js.undefined)
    
    inline def setVerticalCentered(value: Boolean): Self = StObject.set(x, "verticalCentered", value.asInstanceOf[js.Any])
    
    inline def setVerticalCenteredUndefined: Self = StObject.set(x, "verticalCentered", js.undefined)
  }
}
