package typings
package fullpageDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullPageJsMethods extends js.Object {
  var responsiveSlides: Anon_ToSections = js.native
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
  def destroy(): scala.Unit = js.native
  @JSName("destroy")
  def destroy_all(`type`: fullpageDotJsLib.fullpageDotJsLibStrings.all): scala.Unit = js.native
  /**
    * Scrolls to the nearest active section fitting it in the viewport.
    */
  def fitToSection(): scala.Unit = js.native
  /**
    * Scrolls one section down
    */
  def moveSectionDown(): scala.Unit = js.native
  /**
    * Scrolls one section up
    */
  def moveSectionUp(): scala.Unit = js.native
  /**
    * Slides left the slider of the active section.
    * Optional `section` param.
    */
  def moveSlideLeft(): scala.Unit = js.native
  def moveSlideLeft(section: java.lang.String): scala.Unit = js.native
  def moveSlideLeft(section: scala.Double): scala.Unit = js.native
  /**
    * Slides right the slider of the active section.
    * Optional `section` param.
    */
  def moveSlideRight(): scala.Unit = js.native
  def moveSlideRight(section: java.lang.String): scala.Unit = js.native
  def moveSlideRight(section: scala.Double): scala.Unit = js.native
  def moveTo(sectionAnchor: java.lang.String): scala.Unit = js.native
  def moveTo(sectionAnchor: java.lang.String, slideAnchor: java.lang.String): scala.Unit = js.native
  def moveTo(sectionAnchor: java.lang.String, slideAnchor: scala.Double): scala.Unit = js.native
  /**
    * Scrolls the page to the given section and slide.
    * The first slide, the visible one by default, will have index 0.
    */
  def moveTo(sectionAnchor: scala.Double): scala.Unit = js.native
  def moveTo(sectionAnchor: scala.Double, slideAnchor: java.lang.String): scala.Unit = js.native
  def moveTo(sectionAnchor: scala.Double, slideAnchor: scala.Double): scala.Unit = js.native
  /**
    * When resizing is finished, we adjust the slides sizes and positions
    */
  def reBuild(): scala.Unit = js.native
  /**
    * Adds or remove the possibility of scrolling through sections
    * by using the mouse wheel/trackpad or touch gestures.
    * Optionally a second parameter can be used to specify the direction
    * for which the action will be applied.
    */
  def setAllowScrolling(active: scala.Boolean): scala.Unit = js.native
  def setAllowScrolling(active: scala.Boolean, directions: java.lang.String): scala.Unit = js.native
  /**
    * Sets the scrolling configuration in real time.
    * Defines the way the page scrolling behaves.
    * If it is set to true, it will use the "automatic" scrolling,
    * otherwise, it will use the "manual" or "normal" scrolling of the site.
    */
  def setAutoScrolling(active: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the value for the option fitToSection
    * determining whether to fit the section
    * in the screen or not.
    */
  def setFitToSection(): scala.Unit = js.native
  /**
    *  Sets the value for the option fitToSection
    *  determining whether to fit the section in the screen or not.
    */
  def setFitToSection(active: scala.Boolean): scala.Unit = js.native
  /**
    * Adds or remove the possibility of scrolling through sections
    * by using the keyboard arrow keys
    */
  def setKeyboardScrolling(active: scala.Boolean): scala.Unit = js.native
  def setKeyboardScrolling(active: scala.Boolean, directions: java.lang.String): scala.Unit = js.native
  /**
    * Adds or remove the possibility of scrolling through sections
    * by using the mouse wheel or the trackpad.
    */
  def setLockAnchors(active: scala.Boolean): scala.Unit = js.native
  /**
    * Adds or remove the possibility of scrolling through sections
    * by using the mouse wheel or the trackpad.
    */
  def setMouseWheelScrolling(active: scala.Boolean): scala.Unit = js.native
  /**
    * Defines whether to record the history for each hash change in the URL.
    */
  def setRecordHistory(active: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the responsive mode of the page.
    * When set to true the autoScrolling will be turned off
    * and the result will be exactly the same one as when
    * the responsiveWidth or responsiveHeight options
    * get fired.
    */
  def setResponsive(active: scala.Boolean): scala.Unit = js.native
  /**
    * Defines the scrolling speed in milliseconds.
    */
  def setScrollingSpeed(speed: scala.Double): scala.Unit = js.native
  def silentMoveTo(sectionAnchor: java.lang.String): scala.Unit = js.native
  def silentMoveTo(sectionAnchor: java.lang.String, slideAnchor: java.lang.String): scala.Unit = js.native
  def silentMoveTo(sectionAnchor: java.lang.String, slideAnchor: scala.Double): scala.Unit = js.native
  /**
    * Moves the page to the given section and slide with no animation.
    * Anchors or index positions can be used as params.
    */
  def silentMoveTo(sectionAnchor: scala.Double): scala.Unit = js.native
  def silentMoveTo(sectionAnchor: scala.Double, slideAnchor: java.lang.String): scala.Unit = js.native
  def silentMoveTo(sectionAnchor: scala.Double, slideAnchor: scala.Double): scala.Unit = js.native
}

