package typings.fancybox

import typings.jquery.JQuery.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxInstanceMethods extends StObject {
  
  /**
    * Activates current instance - brings container to the front and enables keyboard,
    * notifies other instances about deactivating
    */
  def activate(): Unit = js.native
  
  /**
    * Populate current group with fresh content
    * Check if each object has valid type and content
    * @param content
    */
  def addContent(content: FancyBoxPlainObject): Unit = js.native
  def addContent(content: JQuery): Unit = js.native
  
  /**
    * Attach an event handler functions for:
    *   - navigation buttons
    *   - browser scrolling, resizing;
    *   - focusing
    *   - keyboard
    *   - detecting inactivity
    */
  def addEvents(): Unit = js.native
  
  /**
    * Prevent caption overlap,
    * fix css inconsistency across browsers
    * @param slide
    */
  def adjustCaption(slide: FancyBoxSlide): Unit = js.native
  
  /**
    * Simple hack to fix inconsistency across browsers, described here (affects Edge, too):
    * https://bugzilla.mozilla.org/show_bug.cgi?id=748518
    * @param slide
    */
  def adjustLayout(slide: FancyBoxSlide): Unit = js.native
  
  /**
    * Adjustments after slide content has been loaded
    * @param slide
    */
  def afterLoad(slide: FancyBoxSlide): Unit = js.native
  
  /**
    * Check if image dimensions exceed parent element
    * @param nextWidth
    * @param nextHeight
    */
  def canPan(): Boolean = js.native
  def canPan(nextWidth: js.UndefOr[scala.Nothing], nextHeight: Double): Boolean = js.native
  def canPan(nextWidth: Double): Boolean = js.native
  def canPan(nextWidth: Double, nextHeight: Double): Boolean = js.native
  
  /**
    * Horizontally center slide
    * @param duration
    */
  def centerSlide(duration: Double): Unit = js.native
  
  /**
    * Check if image has srcset and get the source
    * @param slide
    */
  def checkSrcset(slide: FancyBoxSlide): Unit = js.native
  
  /**
    * Final adjustments after removing the instance
    * @param e
    */
  def cleanUp(e: Event): Unit = js.native
  
  /**
    * Close current or all instances
    * @param e
    * @param duration
    */
  def close(e: Event): Unit = js.native
  def close(e: Event, duration: Double): Unit = js.native
  
  /**
    * Final adjustments after current gallery item is moved to position
    * and it`s content is loaded
    */
  def complete(): Unit = js.native
  
  /**
    * Create new "slide" element
    * These are gallery items  that are actually added to DOM
    * @param pos
    */
  def createSlide(pos: Double): FancyBoxSlide = js.native
  
  /**
    * Try to find and focus on the first focusable element
    * @param e
    * @param firstRun
    */
  def focus(e: Event, firstRun: Boolean): Unit = js.native
  
  /**
    * Calculate image size to fit inside viewport
    * @param slide
    */
  def getFitPos(slide: FancyBoxSlide): FancyBoxGetFitPosResults = js.native
  
  /**
    * Check if we can and have to zoom from thumbnail
    * @param slide
    */
  def getThumbPos(slide: FancyBoxSlide): FancyBoxThumbPos = js.native
  
  /**
    * Hide toolbar and caption
    * @param andCaption
    */
  def hideControls(andCaption: Boolean): Unit = js.native
  
  /**
    * Remove loading icon from the slide
    * @param slide
    */
  def hideLoading(slide: FancyBoxSlide): Unit = js.native
  
  /**
    * Create DOM structure
    */
  def init(): Unit = js.native
  
  /**
    * Check if current slide is moved (swiped)
    * @param slide
    */
  def isMoved(slide: FancyBoxSlide): Boolean = js.native
  
  /**
    * Check if current image dimensions are smaller than actual
    * @param nextWidth
    * @param nextHeight
    */
  def isScaledDown(): Boolean = js.native
  def isScaledDown(nextWidth: js.UndefOr[scala.Nothing], nextHeight: Double): Boolean = js.native
  def isScaledDown(nextWidth: Double): Boolean = js.native
  def isScaledDown(nextWidth: Double, nextHeight: Double): Boolean = js.native
  
  /**
    * Check if current slide is zoomable
    */
  def isZoomable(): Boolean = js.native
  
  /**
    * Switch to selected gallery item
    * @param pos
    * @param duration
    */
  def jumpTo(pos: Double, duration: Double): Unit = js.native
  
  /**
    * Load content into the slide
    * @param slide
    */
  def loadSlide(slide: FancyBoxSlide): Unit = js.native
  
  /**
    * Change to next gallery item
    * @param duration
    */
  def next(duration: Double): Unit = js.native
  
  /**
    * Preload next and previous slides
    * @param type
    */
  def preload(`type`: String): Unit = js.native
  
  /**
    * Change to previous gallery item
    * @param duration
    */
  def previous(duration: Double): Unit = js.native
  
  /**
    * Remove events added by the core
    */
  def removeEvents(): Unit = js.native
  
  /**
    * Computes the slide size from image size and maxWidth/maxHeight
    * @param slide
    * @param imgWidth
    * @param imgHeight
    */
  def resolveImageSlideSize(slide: FancyBoxSlide, imgWidth: Double, imgHeight: Double): Unit = js.native
  
  /**
    * Make content visible
    * This method is called right after content has been loaded or
    * user navigates gallery and transition should start
    * @param slide
    */
  def revealContent(slide: FancyBoxSlide): Unit = js.native
  
  /**
    * Scale image to the actual size of the image;
    * x and y values should be relative to the slide
    * @param x
    * @param y
    * @param duration
    */
  def scaleToActual(): Unit = js.native
  def scaleToActual(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], duration: Double): Unit = js.native
  def scaleToActual(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def scaleToActual(x: js.UndefOr[scala.Nothing], y: Double, duration: Double): Unit = js.native
  def scaleToActual(x: Double): Unit = js.native
  def scaleToActual(x: Double, y: js.UndefOr[scala.Nothing], duration: Double): Unit = js.native
  def scaleToActual(x: Double, y: Double): Unit = js.native
  def scaleToActual(x: Double, y: Double, duration: Double): Unit = js.native
  
  /**
    * Scale image to fit inside parent element
    * @param duration
    */
  def scaleToFit(duration: Double): Unit = js.native
  
  /**
    * Create full-size image
    * @param slide
    */
  def setBigImage(slide: FancyBoxSlide): Unit = js.native
  
  def setContent(slide: FancyBoxSlide, content: String): Unit = js.native
  /**
    * Wrap and append content to the slide
    * @param slide
    * @param content
    */
  def setContent(slide: FancyBoxSlide, content: JQuery): Unit = js.native
  
  /**
    * Display error message
    * @param slide
    */
  def setError(slide: FancyBoxSlide): Unit = js.native
  
  /**
    * Create iframe wrapper, iframe and bindings
    * @param slide
    */
  def setIframe(slide: FancyBoxSlide): Unit = js.native
  
  /**
    * Use thumbnail image, if possible
    * @param slide
    */
  def setImage(slide: FancyBoxSlide): Unit = js.native
  
  /**
    * Show toolbar and caption
    */
  def showControls(): Unit = js.native
  
  /**
    * Show loading icon inside the slide
    * @param slide
    */
  def showLoading(slide: FancyBoxSlide): Unit = js.native
  
  /**
    * Toggle toolbar and caption
    */
  def toggleControls(): Unit = js.native
  
  /**
    * Simple i18n support - replaces object keys found in template
    * with corresponding values
    * @param obj
    * @param str
    */
  def translate(obj: js.Any, str: String): String = js.native
  
  /**
    * Call callback and trigger an event
    * @param name
    * @param slide
    */
  def trigger(name: String, slide: FancyBoxSlide): Unit = js.native
  
  /**
    * Update content size and position for all slides
    * @param e
    */
  def update(e: js.Any): Unit = js.native
  
  /**
    * Update infobar values, navigation button states and reveal caption
    */
  def updateControls(): Unit = js.native
  
  /**
    * Update cursor style depending if content can be zoomed
    * @param nextWidth
    * @param nextHeight
    */
  def updateCursor(nextWidth: Double, nextHeight: Double): Unit = js.native
  
  /**
    * Update slide content position and size
    * @param slide
    * @param e
    */
  def updateSlide(slide: FancyBoxSlide): Unit = js.native
  def updateSlide(slide: FancyBoxSlide, e: js.Any): Unit = js.native
}
