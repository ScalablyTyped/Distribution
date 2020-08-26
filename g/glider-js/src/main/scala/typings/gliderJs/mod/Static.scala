package typings.gliderJs.mod

import org.scalablytyped.runtime.Instantiable2
import typings.std.HTMLCollection
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static[T /* <: HTMLElement */] extends // tslint:disable-next-line no-misused-new
Instantiable2[/* ref */ HTMLElement, /* options */ Options, Static[HTMLElement]] {
  var animate_id: Double = js.native
  var arrows: js.Object = js.native
  var breakpoint: Double = js.native
  var containerWidth: Double = js.native
  var dots: HTMLElement = js.native
  var ele: T = js.native
  var isDrag: Boolean = js.native
  var itemWidth: Double = js.native
  var opt: Options = js.native
  var page: Double = js.native
  var preventClick: Boolean = js.native
  var slide: Double = js.native
  var slides: HTMLCollection = js.native
  var track: HTMLElement = js.native
  var trackWidth: Double = js.native
  /**
    * Add an item to the list
    * @param element HTMLElement
    */
  def addItem(element: HTMLElement): Unit = js.native
  /**
    * Destroy Glider.js.
    */
  def destroy(): Unit = js.native
  /**
    * Force a refresh of Glider.js. If rebuildPaging is true, paging
    * controls will force a rebuild as well. This arument must be true
    * if any options affecting paging controls (dots/arrows) are
    * modified.
    * @param rebuildPaging boolean
    */
  def refresh(rebuildPaging: Boolean): Unit = js.native
  /**
    * Remove an item from the list
    * @param itemIndex number
    */
  def removeItem(itemIndex: Double): Unit = js.native
  /**
    * Scroll to any slide or page. If second argument is explicitly
    * true, then the first argument will refer to the page to scroll
    * to, as opposed to the slide.
    * @param slideIndexs string | number
    * @param isActuallyDotIndex boolean
    */
  def scrollItem(slideIndex: String, isActuallyDotIndex: Boolean): Unit = js.native
  def scrollItem(slideIndex: Double, isActuallyDotIndex: Boolean): Unit = js.native
  /**
    * Scroll directly to supplied scroll position in pixels
    * @param pixelOffset number
    */
  def scrollTo(pixelOffset: Double): Unit = js.native
  /**
    * Overrides options set during initialization. If called when a
    * breakpoint is active, the settings for the active breakpoint are
    * updated. If second argument is true, the global settings are
    * updated regardless of active breakpoint. Required for overriding
    * `responsive` setting itself
    * @param arguments Glider.Options
    * @param global Boolean
    */
  def setOption(arguments: Options): Unit = js.native
  def setOption(arguments: Options, global: Boolean): Unit = js.native
  /**
    * Force a refresh of Glider.js navigation controls
    */
  def updateControls(): Unit = js.native
}

