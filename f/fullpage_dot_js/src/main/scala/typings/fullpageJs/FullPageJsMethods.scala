package typings.fullpageJs

import typings.fullpageJs.anon.ToSections
import typings.fullpageJs.fullpageJsStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullPageJsMethods extends js.Object {
  var responsiveSlides: ToSections = js.native
  def apply(): js.Any = js.native
  def apply(options: FullPageJsOptions): js.Any = js.native
  /**
    * Destroys the plugin events and optionally its HTML markup and styles.
    * Ideal to use when using AJAX to load content.
    *
    * If 'all' is passed, the HTML markup
    * and styles used by fullpage.js will be removed. This way the
    * original HTML markup, the one used before any plugin
    * modification is made, will be maintained.
    *
    * @param {"all" | undefined} type
    */
  def destroy(): Unit = js.native
  @JSName("destroy")
  def destroy_all(`type`: all): Unit = js.native
  /**
    * Scrolls to the nearest active section fitting it in the viewport.
    */
  def fitToSection(): Unit = js.native
  /**
    * Scrolls one section down
    */
  def moveSectionDown(): Unit = js.native
  /**
    * Scrolls one section up
    */
  def moveSectionUp(): Unit = js.native
  /**
    * Slides left the slider of the active section.
    * Optional `section` param.
    */
  def moveSlideLeft(): Unit = js.native
  def moveSlideLeft(section: String): Unit = js.native
  def moveSlideLeft(section: Double): Unit = js.native
  /**
    * Slides right the slider of the active section.
    * Optional `section` param.
    */
  def moveSlideRight(): Unit = js.native
  def moveSlideRight(section: String): Unit = js.native
  def moveSlideRight(section: Double): Unit = js.native
  def moveTo(sectionAnchor: String): Unit = js.native
  def moveTo(sectionAnchor: String, slideAnchor: String): Unit = js.native
  def moveTo(sectionAnchor: String, slideAnchor: Double): Unit = js.native
  /**
    * Scrolls the page to the given section and slide.
    * The first slide, the visible one by default, will have index 0.
    */
  def moveTo(sectionAnchor: Double): Unit = js.native
  def moveTo(sectionAnchor: Double, slideAnchor: String): Unit = js.native
  def moveTo(sectionAnchor: Double, slideAnchor: Double): Unit = js.native
  /**
    * When resizing is finished, we adjust the slides sizes and positions
    */
  def reBuild(): Unit = js.native
  /**
    * Adds or remove the possibility of scrolling through sections
    * by using the mouse wheel/trackpad or touch gestures.
    * Optionally a second parameter can be used to specify the direction
    * for which the action will be applied.
    */
  def setAllowScrolling(active: Boolean): Unit = js.native
  def setAllowScrolling(active: Boolean, directions: String): Unit = js.native
  /**
    * Sets the scrolling configuration in real time.
    * Defines the way the page scrolling behaves.
    * If it is set to true, it will use the "automatic" scrolling,
    * otherwise, it will use the "manual" or "normal" scrolling of the site.
    */
  def setAutoScrolling(active: Boolean): Unit = js.native
  /**
    * Sets the value for the option fitToSection
    * determining whether to fit the section
    * in the screen or not.
    */
  def setFitToSection(): Unit = js.native
  /**
    *  Sets the value for the option fitToSection
    *  determining whether to fit the section in the screen or not.
    */
  def setFitToSection(active: Boolean): Unit = js.native
  /**
    * Adds or remove the possibility of scrolling through sections
    * by using the keyboard arrow keys
    */
  def setKeyboardScrolling(active: Boolean): Unit = js.native
  def setKeyboardScrolling(active: Boolean, directions: String): Unit = js.native
  /**
    * Adds or remove the possibility of scrolling through sections
    * by using the mouse wheel or the trackpad.
    */
  def setLockAnchors(active: Boolean): Unit = js.native
  /**
    * Adds or remove the possibility of scrolling through sections
    * by using the mouse wheel or the trackpad.
    */
  def setMouseWheelScrolling(active: Boolean): Unit = js.native
  /**
    * Defines whether to record the history for each hash change in the URL.
    */
  def setRecordHistory(active: Boolean): Unit = js.native
  /**
    * Sets the responsive mode of the page.
    * When set to true the autoScrolling will be turned off
    * and the result will be exactly the same one as when
    * the responsiveWidth or responsiveHeight options
    * get fired.
    */
  def setResponsive(active: Boolean): Unit = js.native
  /**
    * Defines the scrolling speed in milliseconds.
    */
  def setScrollingSpeed(speed: Double): Unit = js.native
  def silentMoveTo(sectionAnchor: String): Unit = js.native
  def silentMoveTo(sectionAnchor: String, slideAnchor: String): Unit = js.native
  def silentMoveTo(sectionAnchor: String, slideAnchor: Double): Unit = js.native
  /**
    * Moves the page to the given section and slide with no animation.
    * Anchors or index positions can be used as params.
    */
  def silentMoveTo(sectionAnchor: Double): Unit = js.native
  def silentMoveTo(sectionAnchor: Double, slideAnchor: String): Unit = js.native
  def silentMoveTo(sectionAnchor: Double, slideAnchor: Double): Unit = js.native
}

