package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.androidWorkaroud
import typings.dojo.dojoStrings.dirLock
import typings.dojo.dojoStrings.disableFlashScrollBar
import typings.dojo.dojoStrings.fadeScrollBar
import typings.dojo.dojoStrings.fixedFooterHeight
import typings.dojo.dojoStrings.fixedHeaderHeight
import typings.dojo.dojoStrings.height
import typings.dojo.dojoStrings.isLocalFooter
import typings.dojo.dojoStrings.items
import typings.dojo.dojoStrings.labelFrom
import typings.dojo.dojoStrings.labelTo
import typings.dojo.dojoStrings.labels
import typings.dojo.dojoStrings.scrollBar
import typings.dojo.dojoStrings.scrollDir
import typings.dojo.dojoStrings.scrollType
import typings.dojo.dojoStrings.step
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.tabIndex
import typings.dojo.dojoStrings.threshold
import typings.dojo.dojoStrings.touchNode
import typings.dojo.dojoStrings.value
import typings.dojo.dojoStrings.weight
import typings.dojo.dojoStrings.zeroPad
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/SpinWheelSlot.html
  *
  * A slot of a SpinWheel.
  * SpinWheelSlot is a slot that is placed in the SpinWheel widget.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.mobile.scrollable because Inheritance from two classes. Inlined constraint, dirLock, disableFlashScrollBar, fadeScrollBar, fixedFooterHeight, fixedHeaderHeight, height, isLocalFooter, propagatable, scrollBar, scrollDir, scrollType, threshold, touchNode, weight, abort, addCover, adjustDestination, calcScrollBarPos, calcSpeed, cleanup, createMask, findDisp, flashScrollBar, getDim, getPos, getScreenSize, getSpeed, hideScrollBar, init, isFormElement, isTopLevel, makeTranslateStr, removeCover, resetScrollBar, resize, scrollIntoView, scrollScrollBarTo, scrollTo, setKeyframes, setSelectable, showScrollBar, slideScrollBarTo, slideTo, stopAnimation
- typings.dojo.dijit._Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling */ @JSGlobal("dojox.mobile.SpinWheelSlot")
@js.native
class SpinWheelSlot () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    *
    */
  var androidWorkaroud: Boolean = js.native
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
    * An array of array of key-label pairs
    * (e.g. [[0, "Jan"], [1, "Feb"], ...]). If key values for each label
    * are not necessary, labels can be used instead.
    *
    */
  var items: js.Array[_] = js.native
  /**
    * The start value of display values of the slot. This parameter is
    * especially useful when the slot has serial values.
    *
    */
  var labelFrom: Double = js.native
  /**
    * The end value of display values of the slot.
    *
    */
  var labelTo: Double = js.native
  /**
    * An array of labels to be displayed on the slot
    * (e.g. ["Jan", "Feb", ...]). This is a simplified version of the
    * items property.
    *
    */
  var labels: js.Array[_] = js.native
  /**
    * let touchstart event propagate up
    *
    */
  var propagatable: Boolean = js.native
  /**
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
    * The steps between labelFrom and labelTo.
    *
    */
  var step: Double = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_SpinWheelSlot: String = js.native
  /**
    * Tabindex setting for this widget so users can hit the tab key to
    * focus on it.
    *
    */
  var tabIndex: String = js.native
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
    * The initial value of the slot.
    *
    */
  var value: String = js.native
  /**
    * frictional drag
    *
    */
  var weight: Double = js.native
  /**
    * Length of zero padding numbers.
    * Ex. zeroPad=2 -> "00", "01", ...
    * Ex. zeroPad=3 -> "000", "001", ...
    *
    */
  var zeroPad: Double = js.native
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
    * Adjusts the position of slot panels.
    *
    */
  def adjust(): Unit = js.native
  /**
    * Overrides dojox/mobile/scrollable.adjustDestination().
    *
    * @param to
    * @param pos
    * @param dim
    */
  def adjustDestination(to: js.Any, pos: js.Any, dim: js.Any): Boolean = js.native
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
    * Overrides dojox/mobile/scrollable.calcSpeed().
    *
    * @param d
    * @param t
    */
  /**
    * Calculate the speed given the distance and time.
    *
    * @param distance
    * @param time
    */
  def calcSpeed(d: Double, t: Double): Double = js.native
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
    * Grays out the items with an index higher or equal to the specified number.
    *
    * @param n
    */
  def disableValues(n: Double): Unit = js.native
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
    * Gets the currently selected item.
    *
    */
  def getCenterItem(): js.Any = js.native
  /**
    * Returns various internal dimensional information needed for calculation.
    *
    */
  def getDim(): js.Object = js.native
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    *
    */
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    * 
    */
  def getIndexInParent(): js.Any = js.native
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    *
    */
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    * 
    */
  def getNextSibling(): js.Any = js.native
  /**
    * Gets the top position in the midst of animation.
    *
    */
  def getPos(): js.Object = js.native
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    *
    */
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    * 
    */
  def getPreviousSibling(): js.Any = js.native
  /**
    * Returns the dimensions of the browser window.
    *
    */
  def getScreenSize(): js.Object = js.native
  /**
    * Overrides dojox/mobile/scrollable.getSpeed().
    *
    */
  /**
    * Returns an object that indicates the scrolling speed.
    * From the position and elapsed time information, calculates the
    * scrolling speed, and returns an object with x and y.
    *
    */
  def getSpeed(): js.Object = js.native
  @JSName("get")
  def get_androidWorkaroud(property: androidWorkaroud): Boolean = js.native
  @JSName("get")
  def get_dirLock(property: dirLock): Boolean = js.native
  @JSName("get")
  def get_disableFlashScrollBar(property: disableFlashScrollBar): Boolean = js.native
  @JSName("get")
  def get_fadeScrollBar(property: fadeScrollBar): Boolean = js.native
  @JSName("get")
  def get_fixedFooterHeight(property: fixedFooterHeight): Double = js.native
  @JSName("get")
  def get_fixedHeaderHeight(property: fixedHeaderHeight): Double = js.native
  @JSName("get")
  def get_height(property: height): String = js.native
  @JSName("get")
  def get_isLocalFooter(property: isLocalFooter): Boolean = js.native
  @JSName("get")
  def get_items(property: items): js.Array[_] = js.native
  @JSName("get")
  def get_labelFrom(property: labelFrom): Double = js.native
  @JSName("get")
  def get_labelTo(property: labelTo): Double = js.native
  @JSName("get")
  def get_labels(property: labels): js.Array[_] = js.native
  @JSName("get")
  def get_scrollBar(property: scrollBar): Boolean = js.native
  @JSName("get")
  def get_scrollDir(property: scrollDir): String = js.native
  @JSName("get")
  def get_scrollType(property: scrollType): Double = js.native
  @JSName("get")
  def get_step(property: step): Double = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): String = js.native
  @JSName("get")
  def get_threshold(property: threshold): Double = js.native
  @JSName("get")
  def get_touchNode(property: touchNode): HTMLElement = js.native
  @JSName("get")
  def get_value(property: value): String = js.native
  @JSName("get")
  def get_weight(property: weight): Double = js.native
  @JSName("get")
  def get_zeroPad(property: zeroPad): Double = js.native
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
    * called after a scroll has been performed.
    *
    * @param e the scroll event, that contains the following attributes:x (x coordinate of the scroll destination),y (y coordinate of the scroll destination),beforeTop (a boolean that is true if the scroll detination is before the top of the scrollable),beforeTopHeight (the number of pixels before the top of the scrollable for the scroll destination),afterBottom (a boolean that is true if the scroll destination is after the bottom of the scrollable),afterBottomHeight (the number of pixels after the bottom of the scrollable for the scroll destination)
    */
  def onAfterScroll(e: Event): Unit = js.native
  /**
    * called before a scroll is initiated. If this method returns false,
    * the scroll is canceled.
    *
    * @param e the scroll event, that contains the following attributes:x (x coordinate of the scroll destination),y (y coordinate of the scroll destination),beforeTop (a boolean that is true if the scroll detination is before the top of the scrollable),beforeTopHeight (the number of pixels before the top of the scrollable for the scroll destination),afterBottom (a boolean that is true if the scroll destination is after the bottom of the scrollable),afterBottomHeight (the number of pixels after the bottom of the scrollable for the scroll destination)
    */
  def onBeforeScroll(e: Event): Boolean = js.native
  /**
    * Overrides dojox/mobile/scrollable.onFlickAnimationEnd().
    *
    * @param e
    */
  def onFlickAnimationEnd(e: js.Any): Unit = js.native
  /**
    * Overrides dojox/mobile/scrollable.onFlickAnimationStart().
    *
    * @param e
    */
  def onFlickAnimationStart(e: js.Any): Unit = js.native
  /**
    * User-defined function to handle touchEnd events.
    *
    * @param e
    */
  def onTouchEnd(e: Event): Unit = js.native
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
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
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
    *
    * @param e
    */
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
    * Sets the color of the specified item as blue.
    *
    * @param value
    * @param color               Optional
    */
  def setColor(value: String, color: String): Unit = js.native
  /**
    * Sets the initial value using this.value or the first item.
    *
    */
  def setInitialValue(): Unit = js.native
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
  @JSName("set")
  def set_androidWorkaroud(property: androidWorkaroud, value: Boolean): Unit = js.native
  @JSName("set")
  def set_dirLock(property: dirLock, value: Boolean): Unit = js.native
  @JSName("set")
  def set_disableFlashScrollBar(property: disableFlashScrollBar, value: Boolean): Unit = js.native
  @JSName("set")
  def set_fadeScrollBar(property: fadeScrollBar, value: Boolean): Unit = js.native
  @JSName("set")
  def set_fixedFooterHeight(property: fixedFooterHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_fixedHeaderHeight(property: fixedHeaderHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_height(property: height, value: String): Unit = js.native
  @JSName("set")
  def set_isLocalFooter(property: isLocalFooter, value: Boolean): Unit = js.native
  @JSName("set")
  def set_items(property: items, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_labelFrom(property: labelFrom, value: Double): Unit = js.native
  @JSName("set")
  def set_labelTo(property: labelTo, value: Double): Unit = js.native
  @JSName("set")
  def set_labels(property: labels, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_scrollBar(property: scrollBar, value: Boolean): Unit = js.native
  @JSName("set")
  def set_scrollDir(property: scrollDir, value: String): Unit = js.native
  @JSName("set")
  def set_scrollType(property: scrollType, value: Double): Unit = js.native
  @JSName("set")
  def set_step(property: step, value: Double): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_tabIndex(property: tabIndex, value: String): Unit = js.native
  @JSName("set")
  def set_threshold(property: threshold, value: Double): Unit = js.native
  @JSName("set")
  def set_touchNode(property: touchNode, value: HTMLElement): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("set")
  def set_weight(property: weight, value: Double): Unit = js.native
  @JSName("set")
  def set_zeroPad(property: zeroPad, value: Double): Unit = js.native
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
    * Overrides dojox/mobile/scrollable.slideTo().
    *
    * @param to
    * @param duration
    * @param easing
    */
  /**
    * Scrolls to the given position with the slide animation.
    *
    * @param to The scroll destination position. An object with x and/or y.ex. {x:0, y:-5}, {y:-29}, etc.
    * @param duration Duration of scrolling in seconds. (ex. 0.3)
    * @param easing The name of easing effect which webkit supports."ease", "linear", "ease-in", "ease-out", etc.
    */
  def slideTo(to: js.Object, duration: Double, easing: String): Unit = js.native
  /**
    * Spins the slot as specified by steps.
    *
    * @param steps
    */
  def spin(steps: Double): Unit = js.native
  /**
    * Stops the currently running animation.
    *
    */
  def stopAnimation(): Unit = js.native
  @JSName("watch")
  def watch_androidWorkaroud(
    property: androidWorkaroud,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_dirLock(
    property: dirLock,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_disableFlashScrollBar(
    property: disableFlashScrollBar,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_fadeScrollBar(
    property: fadeScrollBar,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_fixedFooterHeight(
    property: fixedFooterHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_fixedHeaderHeight(
    property: fixedHeaderHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_height(
    property: height,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_isLocalFooter(
    property: isLocalFooter,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_items(
    property: items,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_labelFrom(
    property: labelFrom,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_labelTo(
    property: labelTo,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_labels(
    property: labels,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_scrollBar(
    property: scrollBar,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_scrollDir(
    property: scrollDir,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_scrollType(
    property: scrollType,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_step(
    property: step,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_tabIndex(
    property: tabIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_threshold(
    property: threshold,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_touchNode(
    property: touchNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[HTMLElement], 
      /* newValue */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_value(
    property: value,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_weight(
    property: weight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_zeroPad(
    property: zeroPad,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

