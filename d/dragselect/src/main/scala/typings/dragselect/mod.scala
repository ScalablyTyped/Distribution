package typings.dragselect

import typings.dragselect.anon.Bottom
import typings.dragselect.anon.PartialareaHTMLElementSVG
import typings.dragselect.anon.X
import typings.dragselect.anon.Y
import typings.dragselect.dragselectBooleans.`false`
import typings.dragselect.dragselectStrings.altKey
import typings.dragselect.dragselectStrings.bottom
import typings.dragselect.dragselectStrings.ctrlKey
import typings.dragselect.dragselectStrings.left
import typings.dragselect.dragselectStrings.metaKey
import typings.dragselect.dragselectStrings.right
import typings.dragselect.dragselectStrings.shiftKey
import typings.dragselect.dragselectStrings.top
import typings.std.ArrayLike
import typings.std.Document
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.SVGElement
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dragselect", JSImport.Namespace)
  @js.native
  /**
    * @param [options.area=document] area in which you can drag. If not provided it will be the whole document
    * @param [options.autoScrollSpeed=1] Speed in which the area scrolls while selecting (if available). Unit is pixel per movement. Default = 1
    * @param [options.zoom=1] Zoom scale factor (in case of using CSS style transform: scale() which messes with real positions). Unit scale zoom. Default = 1
    * @param [options.callback=(selected, event) => {}] a callback function that gets fired when the element is dropped. This callback gets a property which is an array that holds all selected
    *     nodes. The second property passed is the event object.
    * @param [options.customStyles=false] if set to true, no styles (except for position absolute) will be applied by default
    * @param [options.hoverClass=ds-hover] the class assigned to the mouse hovered items
    * @param [options.multiSelectMode=false] Add newly selected elements to the selection instead of replacing them. Default = false
    * @param [options.onDragMove=()=>{}] It is fired when the user drags. This callback gets the event object. Executed before DragSelect function code ran, after getting the current mouse position.
    * @param [options.onDragStartBegin=()=>{}] Is fired when the user clicks in the area. This callback gets the event object. Executed *before* DragSelect function code ran.
    * @param [options.onDragStart=()=>{}] It is fired when the user clicks in the area. This callback gets the event object. Executed after DragSelect function code ran, before the setup of event
    *     listeners.
    * @param [options.onElementSelect=()=>{}] It is fired every time an element is selected. This callback gets a property which is the just selected node
    * @param [options.onElementUnselect=()=>{}] It is fired every time an element is de-selected. This callback gets a property which is the just de-selected node
    * @param [options.selectableClass=ds-selectable] the class assigned to the elements that can be selected
    * @param [options.selectables=[]] the elements that can be selected
    * @param [options.selectedClass=ds-selected] the class assigned to the selected items
    * @param [options.selector=HTMLElement] the square that will draw the selection
    * @param [options.selectorClass=ds-selector] the class assigned to the square selector helper
    * @param [options.multiSelectKeys=['ctrlKey', 'shiftKey', 'metaKey']] An array of keys that allows switching to the multi-select mode (see the @multiSelectMode option). The only possible values
    *     are keys that are provided via the event object. So far: <kbd>ctrlKey</kbd>, <kbd>shiftKey</kbd>, <kbd>metaKey</kbd> and <kbd>altKey</kbd>. Provide an empty array `[]` if you want to turn
    *     off the functionality.
    */
  class ^ ()
    extends StObject
       with DragSelect {
    def this(options: PartialareaHTMLElementSVG) = this()
  }
  
  @js.native
  trait DragSelect extends StObject {
    
    /**
      * Add nodes that can be selected.
      * The algorithm makes sure that no node is added twice
      * @param _nodes dom nodes
      * @param [addToSelection] if elements should also be added to current selection
      * @return _nodes the added node(s)
      */
    def addSelectables(_nodes: ArrayLike[HTMLElement | SVGElement]): js.Array[HTMLElement | SVGElement] = js.native
    def addSelectables(_nodes: ArrayLike[HTMLElement | SVGElement], addToSelection: Boolean): js.Array[HTMLElement | SVGElement] = js.native
    
    /**
      * Adds several items to the selection list
      * also adds the specific classes and take into account all calculations.
      * Does not clear the selection, in contrary to .setSelection
      * Can add multiple nodes at once, in contrary to .select
      * @param _nodes one or multiple nodes
      * @param [triggerCallback] - if callback should be called
      * @param [dontAddToSelectables] - if element should not be added to the list of selectable nodes
      * @return all selected nodes
      */
    def addSelection(_nodes: ArrayLike[HTMLElement | SVGElement]): js.Array[HTMLElement | SVGElement] = js.native
    def addSelection(_nodes: ArrayLike[HTMLElement | SVGElement], triggerCallback: Boolean): js.Array[HTMLElement | SVGElement] = js.native
    def addSelection(
      _nodes: ArrayLike[HTMLElement | SVGElement],
      triggerCallback: Boolean,
      dontAddToSelectables: Boolean
    ): js.Array[HTMLElement | SVGElement] = js.native
    def addSelection(_nodes: ArrayLike[HTMLElement | SVGElement], triggerCallback: Unit, dontAddToSelectables: Boolean): js.Array[HTMLElement | SVGElement] = js.native
    
    var area: HTMLElement | SVGElement | Document = js.native
    
    var autoScrollSpeed: Double = js.native
    
    /**
      * Function break: used in callbacks to disable the execution of the upcoming code at the specific moment
      * In contrary to stop():
      * - Event listeners, callback calls and calculation will continue working
      * - Selector won’t display and will not select
      */
    def break(): Unit = js.native
    
    def callback(selected: js.Array[HTMLElement | SVGElement], event: MouseEvent): Unit = js.native
    def callback(selected: js.Array[HTMLElement | SVGElement], event: TouchEvent): Unit = js.native
    
    /**
      * Checks if any selectable element is inside selection.
      * @param [force] forces through. Handles first clicks and accessibility. Here is user is clicking directly onto some element at start, (contrary to later hovers) we can assume that he really
      *     wants to select/deselect that item.
      */
    def checkIfInsideSelection(): Boolean = js.native
    def checkIfInsideSelection(force: Boolean): Boolean = js.native
    
    /**
      * Unselect / Deselect all current selected Nodes
      * @param [triggerCallback] - if callback should be called
      * @return this.selected, should be empty
      */
    def clearSelection(): js.Array[HTMLElement | SVGElement] = js.native
    def clearSelection(triggerCallback: Boolean): js.Array[HTMLElement | SVGElement] = js.native
    
    var customStyles: Boolean = js.native
    
    def getAreaRect(area: Document): Bottom = js.native
    /**
      * Returns the top/left/bottom/right/width/height
      * values of a node. If Area is document then everything
      * except the sizes will be nulled.
      * @param area
      */
    def getAreaRect(area: HTMLElement): Bottom = js.native
    def getAreaRect(area: SVGElement): Bottom = js.native
    
    /**
      * Returns the last seen position of the cursor/selector
      */
    def getCurrentCursorPosition(): X = js.native
    
    /**
      * Returns cursor x, y position based on event object
      * Will be relative to an area including the scroll unless advised otherwise
      * @param [event]
      * @param [_area] containing area / this.area if === undefined / document if === false
      * @param [ignoreScroll] if true, the scroll will be ignored
      * @return cursor { x/y }
      */
    def getCursorPos(): X = js.native
    def getCursorPos(event: Unit, _area: Unit, ignoreScroll: Boolean): X = js.native
    def getCursorPos(event: Unit, _area: HTMLElement): X = js.native
    def getCursorPos(event: Unit, _area: HTMLElement, ignoreScroll: Boolean): X = js.native
    def getCursorPos(event: Unit, _area: SVGElement): X = js.native
    def getCursorPos(event: Unit, _area: SVGElement, ignoreScroll: Boolean): X = js.native
    def getCursorPos(event: MouseEvent): X = js.native
    def getCursorPos(event: MouseEvent, _area: Unit, ignoreScroll: Boolean): X = js.native
    def getCursorPos(event: MouseEvent, _area: HTMLElement): X = js.native
    def getCursorPos(event: MouseEvent, _area: HTMLElement, ignoreScroll: Boolean): X = js.native
    def getCursorPos(event: MouseEvent, _area: SVGElement): X = js.native
    def getCursorPos(event: MouseEvent, _area: SVGElement, ignoreScroll: Boolean): X = js.native
    def getCursorPos(event: TouchEvent): X = js.native
    def getCursorPos(event: TouchEvent, _area: Unit, ignoreScroll: Boolean): X = js.native
    def getCursorPos(event: TouchEvent, _area: HTMLElement): X = js.native
    def getCursorPos(event: TouchEvent, _area: HTMLElement, ignoreScroll: Boolean): X = js.native
    def getCursorPos(event: TouchEvent, _area: SVGElement): X = js.native
    def getCursorPos(event: TouchEvent, _area: SVGElement, ignoreScroll: Boolean): X = js.native
    @JSName("getCursorPos")
    def getCursorPos_false(event: Unit, _area: `false`): X = js.native
    @JSName("getCursorPos")
    def getCursorPos_false(event: Unit, _area: `false`, ignoreScroll: Boolean): X = js.native
    @JSName("getCursorPos")
    def getCursorPos_false(event: MouseEvent, _area: `false`): X = js.native
    @JSName("getCursorPos")
    def getCursorPos_false(event: MouseEvent, _area: `false`, ignoreScroll: Boolean): X = js.native
    @JSName("getCursorPos")
    def getCursorPos_false(event: TouchEvent, _area: `false`): X = js.native
    @JSName("getCursorPos")
    def getCursorPos_false(event: TouchEvent, _area: `false`, ignoreScroll: Boolean): X = js.native
    
    /**
      * Returns the cursor position difference between start and now
      * If usePreviousCursorDifference is passed,
      * it will output the cursor position difference between the previous selection and now
      * @param [usePreviousCursorDifference]
      */
    def getCursorPositionDifference(): X = js.native
    def getCursorPositionDifference(usePreviousCursorDifference: Boolean): X = js.native
    
    /**
      * Returns the starting/initial position of the cursor/selector
      */
    def getInitialCursorPosition(): X = js.native
    
    /**
      * Returns the previous position of the cursor/selector
      */
    def getPreviousCursorPosition(): X = js.native
    
    /**
      * Returns the current x, y scroll value of a container
      * If container has no scroll it will return 0
      * @param [area]
      * @return scroll X/Y
      */
    def getScroll(): Y = js.native
    def getScroll(area: HTMLElement): Y = js.native
    def getScroll(area: SVGElement): Y = js.native
    
    /**
      * Gets all nodes that can be selected
      * @return this.selectables
      */
    def getSelectables(): js.Array[HTMLElement | SVGElement] = js.native
    
    /**
      * Returns the current selected nodes
      */
    def getSelection(): js.Array[HTMLElement | SVGElement] = js.native
    
    var hoverClass: String = js.native
    
    def isCursorNearEdge(event: Unit, area: HTMLElement): `false` | left | right | top | bottom = js.native
    def isCursorNearEdge(event: Unit, area: SVGElement): `false` | left | right | top | bottom = js.native
    /**
      * Check if the selector is near an edge of the area
      * @param [event] event object.
      * @param area the area.
      */
    def isCursorNearEdge(event: MouseEvent, area: HTMLElement): `false` | left | right | top | bottom = js.native
    def isCursorNearEdge(event: MouseEvent, area: SVGElement): `false` | left | right | top | bottom = js.native
    def isCursorNearEdge(event: TouchEvent, area: HTMLElement): `false` | left | right | top | bottom = js.native
    def isCursorNearEdge(event: TouchEvent, area: SVGElement): `false` | left | right | top | bottom = js.native
    
    def moveCallback(event: MouseEvent): Unit = js.native
    def moveCallback(event: TouchEvent): Unit = js.native
    
    def moveStartCallback(event: MouseEvent): Unit = js.native
    def moveStartCallback(event: TouchEvent): Unit = js.native
    
    var multiSelectKeys: js.Array[ctrlKey | shiftKey | metaKey | altKey] = js.native
    
    var multiSelectMode: Boolean = js.native
    
    def onDragStartBegin(event: MouseEvent): Unit = js.native
    def onDragStartBegin(event: TouchEvent): Unit = js.native
    
    /**
      * Remove nodes from the nodes that can be selected.
      * @param _nodes – dom nodes
      * @param [removeFromSelection] if elements should also be removed from current selection
      * @return _nodes – the removed node(s)
      */
    def removeSelectables(_nodes: ArrayLike[HTMLElement | SVGElement]): js.Array[HTMLElement | SVGElement] = js.native
    def removeSelectables(_nodes: ArrayLike[HTMLElement | SVGElement], removeFromSelection: Boolean): js.Array[HTMLElement | SVGElement] = js.native
    
    /**
      * Removes specific nodes from the selection
      * Multiple nodes can be given at once, in contrary to unselect
      * @param _nodes one or multiple nodes
      * @param [triggerCallback] - if callback should be called
      * @param [removeFromSelectables] - if element should be removed from the list of selectable nodes
      * @return all selected nodes
      */
    def removeSelection(_nodes: ArrayLike[HTMLElement | SVGElement]): js.Array[HTMLElement | SVGElement] = js.native
    def removeSelection(_nodes: ArrayLike[HTMLElement | SVGElement], triggerCallback: Boolean): js.Array[HTMLElement | SVGElement] = js.native
    def removeSelection(
      _nodes: ArrayLike[HTMLElement | SVGElement],
      triggerCallback: Boolean,
      removeFromSelectables: Boolean
    ): js.Array[HTMLElement | SVGElement] = js.native
    def removeSelection(_nodes: ArrayLike[HTMLElement | SVGElement], triggerCallback: Unit, removeFromSelectables: Boolean): js.Array[HTMLElement | SVGElement] = js.native
    
    /**
      * Unbind functions i.e. when mouse click is released
      * @param [event] - The event object.
      * @param [withCallback] - whether or not the callback should be called
      */
    def reset(): Boolean = js.native
    def reset(event: Unit, withCallback: Boolean): Boolean = js.native
    def reset(event: MouseEvent): Boolean = js.native
    def reset(event: MouseEvent, withCallback: Boolean): Boolean = js.native
    def reset(event: TouchEvent): Boolean = js.native
    def reset(event: TouchEvent, withCallback: Boolean): Boolean = js.native
    
    /**
      * Adds an item to the selection.
      * @param item selected item.
      * @return item
      */
    def select(item: HTMLElement): HTMLElement | SVGElement | `false` = js.native
    def select(item: SVGElement): HTMLElement | SVGElement | `false` = js.native
    
    def selectCallback(selected: HTMLElement): Unit = js.native
    def selectCallback(selected: SVGElement): Unit = js.native
    
    var selectableClass: String = js.native
    
    var selectables: (ArrayLike[HTMLElement | SVGElement]) | HTMLElement | SVGElement = js.native
    
    // These properties store the options passed to the constructor, or the
    // defaults if the relevant options aren't passed. See the docs below.
    var selectedClass: String = js.native
    
    var selector: HTMLElement = js.native
    
    var selectorClass: String = js.native
    
    /**
      * Sets all elements that can be selected.
      * Removes all current selectables (& their respective classes).
      * Adds the new set to the selectables set, thus replacing the original set.
      * @param nodes – dom nodes
      * @param [removeFromSelection] if elements should also be removed from current selection
      * @param [addToSelection] if elements should also be added to current selection
      * @return nodes – the added node(s)
      */
    def setSelectables(nodes: ArrayLike[HTMLElement | SVGElement]): js.Array[HTMLElement | SVGElement] = js.native
    def setSelectables(nodes: ArrayLike[HTMLElement | SVGElement], removeFromSelection: Boolean): js.Array[HTMLElement | SVGElement] = js.native
    def setSelectables(nodes: ArrayLike[HTMLElement | SVGElement], removeFromSelection: Boolean, addToSelection: Boolean): js.Array[HTMLElement | SVGElement] = js.native
    def setSelectables(nodes: ArrayLike[HTMLElement | SVGElement], removeFromSelection: Unit, addToSelection: Boolean): js.Array[HTMLElement | SVGElement] = js.native
    
    /**
      * Sets the current selected nodes and optionally run the callback
      * By default, adds new elements also to the list of selectables
      * @param _nodes – dom nodes
      * @param [triggerCallback] - if callback should be called
      * @param [dontAddToSelectables] - if element should not be added to the list of selectable nodes
      */
    def setSelection(_nodes: ArrayLike[HTMLElement | SVGElement]): js.Array[HTMLElement | SVGElement] = js.native
    def setSelection(_nodes: ArrayLike[HTMLElement | SVGElement], triggerCallback: Boolean): js.Array[HTMLElement | SVGElement] = js.native
    def setSelection(
      _nodes: ArrayLike[HTMLElement | SVGElement],
      triggerCallback: Boolean,
      dontAddToSelectables: Boolean
    ): js.Array[HTMLElement | SVGElement] = js.native
    def setSelection(_nodes: ArrayLike[HTMLElement | SVGElement], triggerCallback: Unit, dontAddToSelectables: Boolean): js.Array[HTMLElement | SVGElement] = js.native
    
    /**
      * Starts the functionality. Automatically triggered when created.
      * Also, reset the functionality after a teardown
      */
    def start(): Unit = js.native
    
    /**
      * Complete function teardown
      * Will teardown/stop the whole functionality
      * @param [remove=true] - if elements should be removed.
      * @param [fromSelection=true] - if elements should also be added/removed to the selection.
      * @param [withCallback] - if elements should also be added/removed to the selection.
      */
    def stop(): Unit = js.native
    def stop(remove: Boolean): Unit = js.native
    def stop(remove: Boolean, fromSelection: Boolean): Unit = js.native
    def stop(remove: Boolean, fromSelection: Boolean, withCallback: Boolean): Unit = js.native
    def stop(remove: Boolean, fromSelection: Unit, withCallback: Boolean): Unit = js.native
    def stop(remove: Unit, fromSelection: Boolean): Unit = js.native
    def stop(remove: Unit, fromSelection: Boolean, withCallback: Boolean): Unit = js.native
    def stop(remove: Unit, fromSelection: Unit, withCallback: Boolean): Unit = js.native
    
    /**
      * Adds/Removes an item to the selection.
      * If it is already selected = remove, if not = add.
      * @param item – item to select.
      * @return item
      */
    def toggle(item: HTMLElement): HTMLElement | SVGElement = js.native
    def toggle(item: SVGElement): HTMLElement | SVGElement = js.native
    
    /**
      * Toggles specific nodes from the selection:
      * If element is not in selection it will be added, if it is already selected, it will be removed.
      * Multiple nodes can be given at once.
      * @param _nodes one or multiple nodes
      * @param [triggerCallback] - if callback should be called
      * @param [special] - if true, it also removes selected elements from possible selectable nodes & don’t add them to selectables if they are not
      * @return all selected nodes
      */
    def toggleSelection(_nodes: ArrayLike[HTMLElement | SVGElement]): js.Array[HTMLElement | SVGElement] = js.native
    def toggleSelection(_nodes: ArrayLike[HTMLElement | SVGElement], triggerCallback: Boolean): js.Array[HTMLElement | SVGElement] = js.native
    def toggleSelection(_nodes: ArrayLike[HTMLElement | SVGElement], triggerCallback: Boolean, special: Boolean): js.Array[HTMLElement | SVGElement] = js.native
    def toggleSelection(_nodes: ArrayLike[HTMLElement | SVGElement], triggerCallback: Unit, special: Boolean): js.Array[HTMLElement | SVGElement] = js.native
    
    /**
      * Removes an item from the selection.
      * @param item selected item.
      * @return item
      */
    def unselect(item: HTMLElement): HTMLElement | SVGElement | `false` = js.native
    def unselect(item: SVGElement): HTMLElement | SVGElement | `false` = js.native
    
    def unselectCallback(selected: HTMLElement): Unit = js.native
    def unselectCallback(selected: SVGElement): Unit = js.native
    
    var zoom: Double = js.native
  }
}
