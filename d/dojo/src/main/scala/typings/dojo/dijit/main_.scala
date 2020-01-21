package typings.dojo.dijit

import typings.dojo.dijit.place.Position
import typings.std.HTMLDocument
import typings.std.HTMLElement
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/main.html
  *
  * The dijit package main module.
  * Deprecated.   Users should access individual modules (ex: dijit/registry) directly.
  * 
  */
@js.native
trait main_ extends js.Object {
  /**
    * The default fx.animation speed (in ms) to use for all Dijit
    * transitional fx.animations, unless otherwise specified
    * on a per-instance basis. Defaults to 200, overrided by
    * djConfig.defaultDuration
    * 
    */
  var defaultDuration: Double = js.native
  /**
    * Code to place a DOMNode relative to another DOMNode.
    * Load using require(["dijit/place"], function(place){ ... }).
    * 
    */
  var place: js.Object = js.native
  /**
    * 
    */
  var popup: js.Object = js.native
  /**
    * Registry of existing widget on page, plus some utility methods.
    * 
    */
  var registry: js.Object = js.native
  /**
    * These functions are used to repetitively call a user specified callback
    * method when a specific key or mouse click over a specific DOM node is
    * held down for a specific amount of time.
    * Only 1 such event is allowed to occur on the browser page at 1 time.
    * 
    */
  var typematic: js.Object = js.native
  /**
    * For IE/FF z-index shenanigans. id attribute is required.
    * new dijit.BackgroundIframe(node).
    * 
    * Makes a background iframe as a child of node, that fills
    * area (and position) of node
    * 
    * @param node             
    */
  def BackgroundIframe(node: HTMLElement): Unit = js.native
  /**
    * Returns effective tabIndex of an element, either a number, or undefined if element isn't focusable.
    * 
    * @param elem             
    */
  def effectiveTabIndex(elem: HTMLElement): js.Any = js.native
  /**
    * 
    * @param node             
    */
  def focus(node: js.Any): Unit = js.native
  /**
    * Retrieves a bookmark that can be used with moveToBookmark to return to the same range
    * 
    */
  def getBookmark(): js.Any = js.native
  /**
    * 
    * @param doc             
    */
  def getDocumentWindow(doc: js.Any): Unit = js.native
  /**
    * Finds the descendant of the specified root node
    * that is first in the tabbing order
    * 
    * @param root             
    * @param doc               Optional            
    */
  def getFirstInTabbingOrder(root: String, doc: HTMLDocument): js.Any = js.native
  /**
    * Finds the descendant of the specified root node
    * that is first in the tabbing order
    * 
    * @param root             
    * @param doc               Optional            
    */
  def getFirstInTabbingOrder(root: HTMLElement, doc: HTMLDocument): js.Any = js.native
  /**
    * Called as getFocus(), this returns an Object showing the current focus
    * and selected text.
    * 
    * Called as getFocus(widget), where widget is a (widget representing) a button
    * that was just pressed, it returns where focus was before that button
    * was pressed.   (Pressing the button may have either shifted focus to the button,
    * or removed focus altogether.)   In this case the selected text is not returned,
    * since it can't be accurately determined.
    * 
    * @param menu               OptionalThe button that was just pressed.  If focus has disappeared or movedto this button, returns the previous focus.  In this case the bookmarkinformation is already lost, and null is returned.             
    * @param openedForWindow               Optionaliframe in which menu was opened             
    */
  def getFocus(menu: WidgetBase, openedForWindow: Window_): js.Any = js.native
  /**
    * Finds the descendant of the specified root node
    * that is last in the tabbing order
    * 
    * @param root             
    * @param doc               Optional            
    */
  def getLastInTabbingOrder(root: String, doc: HTMLDocument): js.Any = js.native
  /**
    * Finds the descendant of the specified root node
    * that is last in the tabbing order
    * 
    * @param root             
    * @param doc               Optional            
    */
  def getLastInTabbingOrder(root: HTMLElement, doc: HTMLDocument): js.Any = js.native
  /**
    * Deprecated method, unneeded when using dijit/place directly.
    * Transforms the passed array of preferred positions into a format suitable for
    * passing as the aroundCorners argument to dijit/place.placeOnScreenAroundElement.
    * 
    * @param position This variable controls the position of the drop down.It's an array of strings with the following values:before: places drop down to the left of the target node/widget, or to the right inthe case of RTL scripts like Hebrew and Arabicafter: places drop down to the right of the target node/widget, or to the left inthe case of RTL scripts like Hebrew and Arabicabove: drop down goes above target nodebelow: drop down goes below target nodeThe list is positions is tried, in order, until a position is found where the drop down fitswithin the viewport.             
    * @param leftToRight Whether the popup will be displaying in leftToRight mode.             
    */
  def getPopupAroundAlignment(position: js.Array[String], leftToRight: Boolean): Unit = js.native
  /**
    * Deprecated method to return the dimensions and scroll position of the viewable area of a browser window.
    * New code should use windowUtils.getBox()
    * 
    */
  def getViewport(): Unit = js.native
  /**
    * Gets the role for an element (which should be a wai role).
    * 
    * @param elem             
    */
  def getWaiRole(elem: HTMLElement): js.Any = js.native
  /**
    * Gets the value of a state on an element.
    * Checks for an attribute called "aria-"+state.
    * 
    * @param elem             
    * @param state             
    */
  def getWaiState(elem: HTMLElement, state: String): js.Any = js.native
  /**
    * Tests if element is tab-navigable even without an explicit tabIndex setting
    * 
    * @param elem             
    */
  def hasDefaultTabStop(elem: HTMLElement): js.Any = js.native
  /**
    * Determines if an element has a particular role.
    * 
    * @param elem             
    * @param role               Optional            
    */
  def hasWaiRole(elem: HTMLElement, role: String): js.Any = js.native
  /**
    * Determines if an element has a given state.
    * Checks for an attribute called "aria-"+state.
    * 
    * @param elem             
    * @param state             
    */
  def hasWaiState(elem: HTMLElement, state: String): js.Any = js.native
  /**
    * Static method to hide the tooltip displayed via showTooltip()
    * 
    * @param aroundNode             
    */
  def hideTooltip(aroundNode: js.Any): js.Any = js.native
  /**
    * Returns true if there is no text selected
    * 
    */
  def isCollapsed(): js.Any = js.native
  /**
    * Tests if an element is focusable by tabbing to it, or clicking it with the mouse.
    * 
    * @param elem             
    */
  def isFocusable(elem: HTMLElement): Boolean = js.native
  /**
    * Tests if an element is tab-navigable
    * 
    * @param elem             
    */
  def isTabNavigable(elem: HTMLElement): Boolean = js.native
  /**
    * Moves current selection to a bookmark
    * 
    * @param bookmark This should be a returned object from dijit.getBookmark()             
    */
  def moveToBookmark(bookmark: js.Object): js.Any = js.native
  /**
    * Positions node kitty-corner to the rectangle centered at (pos.x, pos.y) with width and height of
    * padding.x  2 and padding.y  2, or zero if padding not specified.  Picks first corner in corners[]
    * where node is fully visible, or the corner where it's most visible.
    * 
    * Node is assumed to be absolutely or relatively positioned.
    * 
    * @param node The node to position             
    * @param pos Object like {x: 10, y: 20}             
    * @param corners Array of Strings representing order to try corners of the node in, like ["TR", "BL"].Possible values are:"BL" - bottom left"BR" - bottom right"TL" - top left"TR" - top right             
    * @param padding               OptionalOptional param to set padding, to put some buffer around the element you want to position.Defaults to zero.             
    * @param layoutNode For things like tooltip, they are displayed differently (and have different dimensions)based on their orientation relative to the parent.  This adjusts the popup based on orientation.             
    */
  def placeOnScreen(node: HTMLElement, pos: Position, corners: js.Array[String], padding: Position, layoutNode: js.Any): js.Any = js.native
  /**
    * Like dijit.placeOnScreenAroundNode(), except it accepts an arbitrary object
    * for the "around" argument and finds a proper processor to place a node.
    * Deprecated, new code should use dijit/place.around() instead.
    * 
    * @param node             
    * @param aroundNode             
    * @param aroundCorners             
    * @param layoutNode             
    */
  def placeOnScreenAroundElement(node: js.Any, aroundNode: js.Any, aroundCorners: js.Any, layoutNode: js.Any): Unit = js.native
  /**
    * Position node adjacent or kitty-corner to aroundNode
    * such that it's fully visible in viewport.
    * Deprecated, new code should use dijit/place.around() instead.
    * 
    * @param node             
    * @param aroundNode             
    * @param aroundCorners             
    * @param layoutNode             
    */
  def placeOnScreenAroundNode(node: js.Any, aroundNode: js.Any, aroundCorners: js.Any, layoutNode: js.Any): Unit = js.native
  /**
    * Like dijit.placeOnScreenAroundNode(), except that the "around"
    * parameter is an arbitrary rectangle on the screen (x, y, width, height)
    * instead of a dom node.
    * Deprecated, new code should use dijit/place.around() instead.
    * 
    * @param node             
    * @param aroundRect             
    * @param aroundCorners             
    * @param layoutNode             
    */
  def placeOnScreenAroundRectangle(node: js.Any, aroundRect: js.Any, aroundCorners: js.Any, layoutNode: js.Any): Unit = js.native
  /**
    * Registers listeners on the specified iframe so that any click
    * or focus event on that iframe (or anything in it) is reported
    * as a focus/click event on the <iframe> itself.
    * Currently only used by editor.
    * 
    * @param iframe             
    */
  def registerIframe(iframe: HTMLElement): js.Any = js.native
  /**
    * Registers listeners on the specified window (either the main
    * window or an iframe's window) to detect when the user has clicked somewhere
    * or focused somewhere.
    * Users should call registerIframe() instead of this method.
    * 
    * @param targetWindow               OptionalIf specified this is the window associated with the iframe,i.e. iframe.contentWindow.             
    * @param effectiveNode               OptionalIf specified, report any focus events inside targetWindow asan event on effectiveNode, rather than on evt.target.             
    */
  def registerWin(targetWindow: Window_, effectiveNode: HTMLElement): js.Any = js.native
  /**
    * Removes the specified role from an element.
    * Removes role attribute if no specific role provided (for backwards compat.)
    * 
    * @param elem             
    * @param role             
    */
  def removeWaiRole(elem: HTMLElement, role: String): Unit = js.native
  /**
    * Removes a state from an element.
    * Sets an attribute called "aria-"+state.
    * 
    * @param elem             
    * @param state             
    */
  def removeWaiState(elem: HTMLElement, state: String): Unit = js.native
  /**
    * Scroll the passed node into view, if it is not already.
    * Deprecated, use windowUtils.scrollIntoView instead.
    * 
    * @param node             
    * @param pos               Optional            
    */
  def scrollIntoView(node: HTMLElement, pos: js.Object): Unit = js.native
  /**
    * Select text in the input element argument, from start (default 0), to stop (default end).
    * 
    * @param element             
    * @param start               Optional            
    * @param stop               Optional            
    */
  def selectInputText(element: HTMLElement, start: Double, stop: Double): Unit = js.native
  /**
    * Sets the role on an element.
    * Replace existing role attribute with new role.
    * 
    * @param elem             
    * @param role             
    */
  def setWaiRole(elem: HTMLElement, role: String): Unit = js.native
  /**
    * Sets a state on an element.
    * Sets an attribute called "aria-"+state.
    * 
    * @param elem             
    * @param state             
    * @param value             
    */
  def setWaiState(elem: HTMLElement, state: String, value: String): Unit = js.native
  /**
    * Static method to display tooltip w/specified contents in specified position.
    * See description of dijit/Tooltip.defaultPosition for details on position parameter.
    * If position is not specified then dijit/Tooltip.defaultPosition is used.
    * 
    * @param innerHTML Contents of the tooltip             
    * @param aroundNode Specifies that tooltip should be next to this node / area             
    * @param position               OptionalList of positions to try to position tooltip (ex: ["right", "above"])             
    * @param rtl               OptionalCorresponds to WidgetBase.dir attribute, where false means "ltr" and truemeans "rtl"; specifies GUI direction, not text direction.             
    * @param textDir               OptionalCorresponds to WidgetBase.textdir attribute; specifies direction of text.             
    */
  def showTooltip(
    innerHTML: String,
    aroundNode: js.Object,
    position: js.Array[String],
    rtl: Boolean,
    textDir: String
  ): js.Any = js.native
  /**
    * Unregisters listeners on the specified iframe created by registerIframe.
    * After calling be sure to delete or null out the handle itself.
    * 
    * @param handle Handle returned by registerIframe()             
    */
  def unregisterIframe(handle: js.Object): Unit = js.native
  /**
    * Unregisters listeners on the specified window (either the main
    * window or an iframe's window) according to handle returned from registerWin().
    * After calling be sure to delete or null out the handle itself.
    * 
    * @param handle             
    */
  def unregisterWin(handle: js.Object): Unit = js.native
}

