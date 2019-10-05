package typings.dojo.dojox.mobile

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/scrollable.html
  *
  * Mixin for enabling touch scrolling capability.
  * Mixin for enabling touch scrolling capability.
  * Mobile WebKit browsers do not allow scrolling inner DIVs. (For instance,
  * on iOS you need the two-finger operation to scroll them.)
  * That means you cannot have fixed-positioned header/footer bars.
  * To solve this issue, this module disables the browsers default scrolling
  * behavior, and rebuilds its own scrolling machinery by handling touch
  * events. In this module, this.domNode has height "100%" and is fixed to
  * the window, and this.containerNode scrolls. If you place a bar outside
  * of this.containerNode, then it will be fixed-positioned while
  * this.containerNode is scrollable.
  *
  * This module has the following features:
  *
  * Scrolls inner DIVs vertically, horizontally, or both.
  * Vertical and horizontal scroll bars.
  * Flashes the scroll bars when a view is shown.
  * Simulates the flick operation using animation.
  * Respects header/footer bars if any.
  *
  */
@JSGlobal("dojox.mobile.scrollable")
@js.native
class scrollable () extends js.Object {
  /**
    * bounce back to the content area
    *
    */
  var constraint: Boolean = js.native
  /**
    * disable the move handler if scroll starts in the unexpected direction
    *
    */
  var dirLock: Boolean = js.native
  /**
    *
    */
  var disableFlashScrollBar: Boolean = js.native
  /**
    *
    */
  var fadeScrollBar: Boolean = js.native
  /**
    * height of a fixed footer
    *
    */
  var fixedFooterHeight: Double = js.native
  /**
    * height of a fixed header
    *
    */
  var fixedHeaderHeight: Double = js.native
  /**
    * explicitly specified height of this widget (ex. "300px")
    *
    */
  var height: String = js.native
  /**
    * footer is view-local (as opposed to application-wide)
    *
    */
  var isLocalFooter: Boolean = js.native
  /**
    * let touchstart event propagate up
    *
    */
  var propagatable: Boolean = js.native
  /**
    * show scroll bar or not
    *
    */
  var scrollBar: Boolean = js.native
  /**
    * v: vertical, h: horizontal, vh: both, f: flip
    *
    */
  var scrollDir: String = js.native
  /**
    *
    * 1: use (-webkit-)transform:translate3d(x,y,z) style, use (-webkit-)animation for slide animation
    * 2: use top/left style,
    * 3: use (-webkit-)transform:translate3d(x,y,z) style, use (-webkit-)transition for slide animation
    * 0: use default value (3 for Android, iOS6+, and BlackBerry; otherwise 1)
    *
    */
  var scrollType: Double = js.native
  /**
    * drag threshold value in pixels
    *
    */
  var threshold: Double = js.native
  /**
    * a node that will have touch event handlers
    *
    */
  var touchNode: HTMLElement = js.native
  /**
    * frictional drag
    *
    */
  var weight: Double = js.native
  /**
    * Aborts scrolling.
    * This function stops the scrolling animation that is currently
    * running. It is called when the user touches the screen while
    * scrolling.
    *
    */
  def abort(): Unit = js.native
  /**
    * Adds the transparent DIV cover.
    * The cover is to prevent DOM events from affecting the child
    * widgets such as a list widget. Without the cover, for example,
    * child widgets may receive a click event and respond to it
    * unexpectedly when the user flicks the screen to scroll.
    * Note that only the desktop browsers need the cover.
    *
    */
  def addCover(): Unit = js.native
  /**
    * A stub function to be overridden by subclasses.
    * This function is called from onTouchEnd(). The purpose is to give its
    * subclasses a chance to adjust the destination position. If this
    * function returns false, onTouchEnd() returns immediately without
    * performing scroll.
    *
    * @param to The destination position. An object with x and y.
    * @param pos The current position. An object with x and y.
    * @param dim Dimension information returned by getDim().
    */
  def adjustDestination(to: js.Object, pos: js.Object, dim: js.Object): Boolean = js.native
  /**
    * Calculates the scroll bar position.
    * Given the scroll destination position, calculates the top and/or
    * the left of the scroll bar(s). Returns an object with x and y.
    *
    * @param to The scroll destination position. An object with x and y.ex. {x:0, y:-5}
    */
  def calcScrollBarPos(to: js.Object): js.Object = js.native
  /**
    * Calculate the speed given the distance and time.
    *
    * @param distance
    * @param time
    */
  def calcSpeed(distance: Double, time: Double): Double = js.native
  /**
    * Uninitialize the module.
    *
    */
  def cleanup(): Unit = js.native
  /**
    * Creates a mask for a scroll bar edge.
    * This function creates a mask that hides corners of one scroll
    * bar edge to make it round edge. The other side of the edge is
    * always visible and round shaped with the border-radius style.
    *
    */
  def createMask(): Unit = js.native
  /**
    * Finds the currently displayed view node from my sibling nodes.
    *
    * @param node
    */
  def findDisp(node: HTMLElement): js.Any = js.native
  /**
    * Shows the scroll bar instantly.
    * This function shows the scroll bar, and then hides it 300ms
    * later. This is used to show the scroll bar to the user for a
    * short period of time when a hidden view is revealed.
    *
    */
  def flashScrollBar(): Unit = js.native
  /**
    * Returns various internal dimensional information needed for calculation.
    *
    */
  def getDim(): js.Object = js.native
  /**
    * Gets the top position in the midst of animation.
    *
    */
  def getPos(): js.Object = js.native
  /**
    * Returns the dimensions of the browser window.
    *
    */
  def getScreenSize(): js.Object = js.native
  /**
    * Returns an object that indicates the scrolling speed.
    * From the position and elapsed time information, calculates the
    * scrolling speed, and returns an object with x and y.
    *
    */
  def getSpeed(): js.Object = js.native
  /**
    * Hides the scroll bar.
    * If the fadeScrollBar property is true, hides the scroll bar with
    * the fade animation.
    *
    */
  def hideScrollBar(): Unit = js.native
  /**
    * Initialize according to the given params.
    * Mixes in the given params into this instance. At least domNode
    * and containerNode have to be given.
    * Starts listening to the touchstart events.
    * Calls resize(), if this widget is a top level widget.
    *
    * @param params               Optional
    */
  def init(params: js.Object): Unit = js.native
  /**
    * Returns true if the given node is a form control.
    *
    * @param node
    */
  def isFormElement(node: HTMLElement): Boolean = js.native
  /**
    * Returns true if this is a top-level widget.
    * Subclass may want to override.
    *
    */
  def isTopLevel(): Boolean = js.native
  /**
    * Constructs a string value that is passed to the -webkit-transform property.
    * Return value example: "translate3d(0px,-8px,0px)"
    *
    * @param to The destination position. An object with x and/or y.
    */
  def makeTranslateStr(to: js.Object): String = js.native
  /**
    * Removes the transparent DIV cover.
    *
    */
  def removeCover(): Unit = js.native
  /**
    * Resets the scroll bar length, position, etc.
    *
    */
  def resetScrollBar(): Unit = js.native
  /**
    * Adjusts the height of the widget.
    * If the height property is 'inherit', the height is inherited
    * from its offset parent. If 'auto', the content height, which
    * could be smaller than the entire screen height, is used. If an
    * explicit height value (ex. "300px"), it is used as the new
    * height. If nothing is specified as the height property, from the
    * current top position of the widget to the bottom of the screen
    * will be the new height.
    *
    * @param e
    */
  def resize(e: js.Any): Unit = js.native
  /**
    * Scrolls the pane until the searching node is in the view.
    * Just like the scrollIntoView method of DOM elements, this
    * function causes the given node to scroll into view, aligning it
    * either at the top or bottom of the pane.
    *
    * @param node A DOM node to be searched for view.
    * @param alignWithTop               OptionalIf true, aligns the node at the top of the pane.If false, aligns the node at the bottom of the pane.
    * @param duration               OptionalDuration of scrolling in seconds. (ex. 0.3)If not specified, scrolls without animation.
    */
  def scrollIntoView(node: HTMLElement, alignWithTop: Boolean, duration: Double): Unit = js.native
  /**
    * Moves the scroll bar(s) to the given position without animation.
    *
    * @param to The destination position. An object with x and/or y.ex. {x:2, y:5}, {y:20}, etc.
    */
  def scrollScrollBarTo(to: js.Object): Unit = js.native
  /**
    * Scrolls to the given position immediately without animation.
    *
    * @param to The destination position. An object with x and y.ex. {x:0, y:-5}
    * @param doNotMoveScrollBar               OptionalIf true, the scroll bar will not be updated. If not specified,it will be updated.
    * @param node               OptionalA DOM node to scroll. If not specified, defaults tothis.containerNode.
    */
  def scrollTo(to: js.Object, doNotMoveScrollBar: Boolean, node: HTMLElement): Unit = js.native
  /**
    * Programmatically sets key frames for the scroll animation.
    *
    * @param from
    * @param to
    * @param idx
    */
  def setKeyframes(from: js.Object, to: js.Object, idx: Double): Unit = js.native
  /**
    * Sets the given node as selectable or unselectable.
    *
    * @param node
    * @param selectable
    */
  def setSelectable(node: HTMLElement, selectable: Boolean): Unit = js.native
  /**
    * Shows the scroll bar.
    * This function creates the scroll bar instance if it does not
    * exist yet, and calls resetScrollBar() to reset its length and
    * position.
    *
    */
  def showScrollBar(): Unit = js.native
  /**
    * Moves the scroll bar(s) to the given position with the slide animation.
    *
    * @param to The destination position. An object with x and y.ex. {x:0, y:-5}
    * @param duration Duration of the animation in seconds. (ex. 0.3)
    * @param easing The name of easing effect which webkit supports."ease", "linear", "ease-in", "ease-out", etc.
    */
  def slideScrollBarTo(to: js.Object, duration: Double, easing: String): Unit = js.native
  /**
    * Scrolls to the given position with the slide animation.
    *
    * @param to The scroll destination position. An object with x and/or y.ex. {x:0, y:-5}, {y:-29}, etc.
    * @param duration Duration of scrolling in seconds. (ex. 0.3)
    * @param easing The name of easing effect which webkit supports."ease", "linear", "ease-in", "ease-out", etc.
    */
  def slideTo(to: js.Object, duration: Double, easing: String): Unit = js.native
  /**
    * Stops the currently running animation.
    *
    */
  def stopAnimation(): Unit = js.native
}

