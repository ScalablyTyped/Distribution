package typings.dojo.dojox.app.widgets

import typings.dojo.dojox.mobile.scrollable
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/widgets/_ScrollableMixin.html
  *
  * Mixin for widgets to have a touch scrolling capability.
  * Actual implementation is in dojox/mobile/scrollable.js.
  * scrollable.js is not a dojo class, but just a collection
  * of functions. This module makes scrollable.js a dojo class.
  *
  */
@JSGlobal("dojox.app.widgets._ScrollableMixin")
@js.native
class ScrollableMixin () extends scrollable {
  /**
    * e.g. Allow ScrollableView in a SwapView.
    *
    */
  var allowNestedScrolls: Boolean = js.native
  /**
    * Enables the search for application-specific bars (header or footer).
    *
    */
  var appBars: Boolean = js.native
  /**
    * Parameters for dojox/mobile/scrollable.init().
    *
    */
  var scrollableParams: js.Object = js.native
  /**
    *
    */
  def buildRendering(): Unit = js.native
  /**
    * Checks if the given node is a fixed bar or not.
    *
    * @param node
    * @param local
    */
  def checkFixedBar(node: HTMLElement, local: Boolean): js.Any = js.native
  /**
    *
    */
  def destroy(): Unit = js.native
  /**
    * Search for application-specific header or footer.
    *
    */
  def findAppBars(): Unit = js.native
  /**
    * called after a scroll has been performed.
    *
    * @param e the scroll event, that contains the following attributes:x (x coordinate of the scroll destination),y (y coordinate of the scroll destination),beforeTop (a boolean that is true if the scroll detination is before the top of the scrollable),beforeTopHeight (the number of pixels before the top of the scrollable for the scroll destination),afterBottom (a boolean that is true if the scroll destination is after the bottom of the scrollable),afterBottomHeight (the number of pixels after the bottom of the scrollable for the scroll destination)
    */
  def onAfterScroll(e: Event_): Unit = js.native
  /**
    * called before a scroll is initiated. If this method returns false,
    * the scroll is canceled.
    *
    * @param e the scroll event, that contains the following attributes:x (x coordinate of the scroll destination),y (y coordinate of the scroll destination),beforeTop (a boolean that is true if the scroll detination is before the top of the scrollable),beforeTopHeight (the number of pixels before the top of the scrollable for the scroll destination),afterBottom (a boolean that is true if the scroll destination is after the bottom of the scrollable),afterBottomHeight (the number of pixels after the bottom of the scrollable for the scroll destination)
    */
  def onBeforeScroll(e: Event_): Boolean = js.native
  /**
    *
    * @param e
    */
  def onFlickAnimationEnd(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def onFlickAnimationStart(e: js.Any): Unit = js.native
  /**
    * User-defined function to handle touchEnd events.
    *
    * @param e
    */
  def onTouchEnd(e: Event_): Unit = js.native
  /**
    * User-defined function to handle touchMove events.
    *
    * @param e
    */
  def onTouchMove(e: js.Any): Unit = js.native
  /**
    * User-defined function to handle touchStart events.
    *
    * @param e
    */
  def onTouchStart(e: js.Any): Unit = js.native
  /**
    * Moves all the children to containerNode.
    *
    */
  def reparent(): Unit = js.native
  /**
    * Calls resize() of each child widget.
    *
    */
  def resize(): Unit = js.native
  /**
    *
    */
  def startup(): Unit = js.native
}

