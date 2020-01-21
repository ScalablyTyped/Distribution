package typings.dojo.dojox.app.widgets

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.WidgetBase
import typings.dojo.dojoStrings.allowNestedScrolls
import typings.dojo.dojoStrings.appBars
import typings.dojo.dojoStrings.constraint
import typings.dojo.dojoStrings.dirLock
import typings.dojo.dojoStrings.disableFlashScrollBar
import typings.dojo.dojoStrings.fadeScrollBar
import typings.dojo.dojoStrings.fixedFooter
import typings.dojo.dojoStrings.fixedFooterHeight
import typings.dojo.dojoStrings.fixedHeader
import typings.dojo.dojoStrings.fixedHeaderHeight
import typings.dojo.dojoStrings.height
import typings.dojo.dojoStrings.isLocalFooter
import typings.dojo.dojoStrings.propagatable
import typings.dojo.dojoStrings.scrollBar
import typings.dojo.dojoStrings.scrollDir
import typings.dojo.dojoStrings.scrollType
import typings.dojo.dojoStrings.scrollable
import typings.dojo.dojoStrings.scrollableParams
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.threshold
import typings.dojo.dojoStrings.touchNode
import typings.dojo.dojoStrings.weight
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/widgets/Container.html
  *
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.mobile.scrollable because Inheritance from two classes. Inlined 
- typings.dojo.dojox.app.widgets.ScrollableMixin because Inheritance from two classes. Inlined allowNestedScrolls, appBars, constraint, dirLock, disableFlashScrollBar, fadeScrollBar, fixedFooterHeight, fixedHeaderHeight, height, isLocalFooter, propagatable, scrollableParams, scrollBar, scrollDir, scrollType, threshold, touchNode, weight, abort, addCover, adjustDestination, calcScrollBarPos, calcSpeed, checkFixedBar, cleanup, createMask, destroy, findAppBars, findDisp, flashScrollBar, getDim, getPos, getScreenSize, getSpeed, hideScrollBar, init, isFormElement, isTopLevel, makeTranslateStr, removeCover, reparent, resetScrollBar, resize, scrollIntoView, scrollScrollBarTo, scrollTo, setKeyframes, setSelectable, showScrollBar, slideScrollBarTo, slideTo, startup, stopAnimation, onAfterScroll, onBeforeScroll, onFlickAnimationEnd, onFlickAnimationStart, onTouchEnd, onTouchMove, onTouchStart
- typings.dojo.dijit.Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
- typings.dojo.dijit.Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dojox.app.widgets.Container")
@js.native
class Container () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
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
    *
    */
  var fixedFooter: String = js.native
  /**
    * height of a fixed footer
    *
    */
  var fixedFooterHeight: Double = js.native
  /**
    *
    */
  var fixedHeader: String = js.native
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
    *
    */
  var scrollable: Boolean = js.native
  /**
    * Parameters for dojox/mobile/scrollable.init().
    *
    */
  var scrollableParams: js.Object = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Container: String = js.native
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
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  def addChild(widget: WidgetBase): Unit = js.native
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    *
    * @param widget
    * @param insertIndex               Optional
    */
  def addChild(widget: WidgetBase, insertIndex: Double): Unit = js.native
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
    * Checks if the given node is a fixed bar or not.
    *
    * @param node
    * @param local
    */
  def checkFixedBar(node: HTMLElement, local: Boolean): js.Any = js.native
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
    * Search for application-specific header or footer.
    *
    */
  def findAppBars(): Unit = js.native
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
    * Gets the index of the child in this container or -1 if not found
    *
    * @param child
    */
  /**
    * Gets the index of the child in this container or -1 if not found
    * 
    * @param child             
    */
  def getIndexOfChild(child: WidgetBase): js.Any = js.native
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
    * Returns an object that indicates the scrolling speed.
    * From the position and elapsed time information, calculates the
    * scrolling speed, and returns an object with x and y.
    *
    */
  def getSpeed(): js.Object = js.native
  @JSName("get")
  def get_allowNestedScrolls(property: allowNestedScrolls): Boolean = js.native
  @JSName("get")
  def get_appBars(property: appBars): Boolean = js.native
  @JSName("get")
  def get_constraint(property: constraint): Boolean = js.native
  @JSName("get")
  def get_dirLock(property: dirLock): Boolean = js.native
  @JSName("get")
  def get_disableFlashScrollBar(property: disableFlashScrollBar): Boolean = js.native
  @JSName("get")
  def get_fadeScrollBar(property: fadeScrollBar): Boolean = js.native
  @JSName("get")
  def get_fixedFooter(property: fixedFooter): String = js.native
  @JSName("get")
  def get_fixedFooterHeight(property: fixedFooterHeight): Double = js.native
  @JSName("get")
  def get_fixedHeader(property: fixedHeader): String = js.native
  @JSName("get")
  def get_fixedHeaderHeight(property: fixedHeaderHeight): Double = js.native
  @JSName("get")
  def get_height(property: height): String = js.native
  @JSName("get")
  def get_isLocalFooter(property: isLocalFooter): Boolean = js.native
  @JSName("get")
  def get_propagatable(property: propagatable): Boolean = js.native
  @JSName("get")
  def get_scrollBar(property: scrollBar): Boolean = js.native
  @JSName("get")
  def get_scrollDir(property: scrollDir): String = js.native
  @JSName("get")
  def get_scrollType(property: scrollType): Double = js.native
  @JSName("get")
  def get_scrollable(property: scrollable): Boolean = js.native
  @JSName("get")
  def get_scrollableParams(property: scrollableParams): js.Object = js.native
  @JSName("get")
  def get_threshold(property: threshold): Double = js.native
  @JSName("get")
  def get_touchNode(property: touchNode): HTMLElement = js.native
  @JSName("get")
  def get_weight(property: weight): Double = js.native
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    *
    */
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    * 
    */
  def hasChildren(): Boolean = js.native
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
    * layout container
    *
    */
  def layout(): Unit = js.native
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
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    *
    * @param widget
    */
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: Double): Unit = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    *
    * @param widget
    */
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: WidgetBase): Unit = js.native
  /**
    * Removes the transparent DIV cover.
    *
    */
  def removeCover(): Unit = js.native
  /**
    * Moves all the children to containerNode.
    *
    */
  def reparent(): Unit = js.native
  /**
    * Resets the scroll bar length, position, etc.
    *
    */
  def resetScrollBar(): Unit = js.native
  /**
    * Call this to resize a widget, or after its size has changed.
    * Change size mode
    * When changeSize is specified, changes the marginBox of this widget
    * and forces it to re-layout its contents accordingly.
    * changeSize may specify height, width, or both.
    *
    * If resultSize is specified it indicates the size the widget will
    * become after changeSize has been applied.
    *
    * Notification mode
    * When changeSize is null, indicates that the caller has already changed
    * the size of the widget, or perhaps it changed because the browser
    * window was resized.  Tells widget to re-layout its contents accordingly.
    *
    * If resultSize is also specified it indicates the size the widget has
    * become.
    *
    * In either mode, this method also:
    *
    * Sets this._borderBox and this._contentBox to the new size of
    *  the widget.  Queries the current domNode size if necessary.
    * Calls layout() to resize contents (and maybe adjust child widgets).
    *
    * @param changeSize               OptionalSets the widget to this margin-box size and position.May include any/all of the following properties:{w: int, h: int, l: int, t: int}
    * @param resultSize               OptionalThe margin-box size of this widget after applying changeSize (ifchangeSize is specified).  If caller knows this size andpasses it in, we don't need to query the browser to get the size.{w: int, h: int}
    */
  /**
    * Calls resize() of each child widget.
    *
    */
  def resize(): Unit = js.native
  def resize(changeSize: js.Object): Unit = js.native
  def resize(changeSize: js.Object, resultSize: js.Object): Unit = js.native
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
  @JSName("set")
  def set_allowNestedScrolls(property: allowNestedScrolls, value: Boolean): Unit = js.native
  @JSName("set")
  def set_appBars(property: appBars, value: Boolean): Unit = js.native
  @JSName("set")
  def set_constraint(property: constraint, value: Boolean): Unit = js.native
  @JSName("set")
  def set_dirLock(property: dirLock, value: Boolean): Unit = js.native
  @JSName("set")
  def set_disableFlashScrollBar(property: disableFlashScrollBar, value: Boolean): Unit = js.native
  @JSName("set")
  def set_fadeScrollBar(property: fadeScrollBar, value: Boolean): Unit = js.native
  @JSName("set")
  def set_fixedFooter(property: fixedFooter, value: String): Unit = js.native
  @JSName("set")
  def set_fixedFooterHeight(property: fixedFooterHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_fixedHeader(property: fixedHeader, value: String): Unit = js.native
  @JSName("set")
  def set_fixedHeaderHeight(property: fixedHeaderHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_height(property: height, value: String): Unit = js.native
  @JSName("set")
  def set_isLocalFooter(property: isLocalFooter, value: Boolean): Unit = js.native
  @JSName("set")
  def set_propagatable(property: propagatable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_scrollBar(property: scrollBar, value: Boolean): Unit = js.native
  @JSName("set")
  def set_scrollDir(property: scrollDir, value: String): Unit = js.native
  @JSName("set")
  def set_scrollType(property: scrollType, value: Double): Unit = js.native
  @JSName("set")
  def set_scrollable(property: scrollable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_scrollableParams(property: scrollableParams, value: js.Object): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_threshold(property: threshold, value: Double): Unit = js.native
  @JSName("set")
  def set_touchNode(property: touchNode, value: HTMLElement): Unit = js.native
  @JSName("set")
  def set_weight(property: weight, value: Double): Unit = js.native
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
  @JSName("watch")
  def watch_allowNestedScrolls(
    property: allowNestedScrolls,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_appBars(
    property: appBars,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_constraint(
    property: constraint,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dirLock(
    property: dirLock,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_disableFlashScrollBar(
    property: disableFlashScrollBar,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_fadeScrollBar(
    property: fadeScrollBar,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_fixedFooter(
    property: fixedFooter,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_fixedFooterHeight(
    property: fixedFooterHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_fixedHeader(
    property: fixedHeader,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_fixedHeaderHeight(
    property: fixedHeaderHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_height(
    property: height,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_isLocalFooter(
    property: isLocalFooter,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_propagatable(
    property: propagatable,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_scrollBar(
    property: scrollBar,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_scrollDir(
    property: scrollDir,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_scrollType(
    property: scrollType,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_scrollable(
    property: scrollable,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_scrollableParams(
    property: scrollableParams,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_threshold(
    property: threshold,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_touchNode(
    property: touchNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[HTMLElement], 
      /* newValue */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_weight(
    property: weight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

