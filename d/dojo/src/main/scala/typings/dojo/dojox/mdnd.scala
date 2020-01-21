package typings.dojo.dojox

import typings.dojo.dojo.dnd.Selector
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.mdnd")
@js.native
object mdnd extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mdnd/AreaManager.html
    *
    * Drag And Drop manager
    *
    */
  @js.native
  class AreaManager () extends js.Object {
    /**
      * CSS class enabled an area if areaClass is defined
      *
      */
    var areaClass: String = js.native
    /**
      * Enable the refresh of registered areas on drag start.
      *
      */
    var autoRefresh: Boolean = js.native
    /**
      * CSS class enabled a drag handle.
      *
      */
    var dragHandleClass: String = js.native
    /**
      * To add an item programmatically.
      *
      * @param area a node corresponding to the D&D Area
      * @param node the node which has to be treated.
      * @param index the place in the area
      * @param notCheckParent
      */
    def addDragItem(area: HTMLElement, node: HTMLElement, index: Double, notCheckParent: Boolean): js.Any = js.native
    /**
      * Destroy the component.
      *
      */
    def destroy(): Unit = js.native
    /**
      * find the nearest target area according to coordinates.
      * Coordinates are representing by an object : for example, {'x':10,'y':10}
      *
      * @param coords an object encapsulating X and Y position
      * @param size an object encapsulating the area size
      */
    def findCurrentIndexArea(coords: js.Object, size: js.Object): js.Any = js.native
    /**
      * Initialize the manager by calling the registerByClass method
      *
      */
    def init(): Unit = js.native
    /**
      * Occurs when the dojo.dnd.Moveable.onDrag is fired.
      * Search the nearest target area and called the placeDropIndicator
      *
      * @param node The node which is dragged
      * @param coords an object encapsulating X and Y position
      * @param size an object encapsulating width and height values
      * @param mousePosition coordinates of mouse
      */
    def onDrag(node: HTMLElement, coords: js.Object, size: js.Object, mousePosition: js.Object): Unit = js.native
    /**
      * Optionally called by the getTargetArea method of TargetFinder class.
      *
      * @param coords coordinates of the dragged Node.
      * @param size size of the dragged Node.
      */
    def onDragEnter(coords: js.Object, size: js.Object): Unit = js.native
    /**
      * Optionally called by the getTargetArea method of TargetFinder class.
      *
      * @param coords coordinates of the dragged Node.
      * @param size size of the dragged Node.
      */
    def onDragExit(coords: js.Object, size: js.Object): Unit = js.native
    /**
      * Initialize the drag (see dojox.mdnd.Moveable.initOffsetDrag())
      *
      * @param node The node which is about to be dragged
      * @param coords an object encapsulating X and Y position
      * @param size an object encapsulating width and height values
      */
    def onDragStart(node: HTMLElement, coords: js.Object, size: js.Object): Unit = js.native
    /**
      * Drop the dragged item where the dropIndicator is displayed.
      *
      * @param node The node which is about to be dropped
      */
    def onDrop(node: HTMLElement): Unit = js.native
    /**
      * Cancel the drop.
      * The dragNode returns into the source.
      *
      */
    def onDropCancel(): Unit = js.native
    /**
      * Search the right place to insert the dropIndicator and display the dropIndicator.
      *
      * @param coords an object encapsulating X and Y position
      * @param size an object encapsulating width and height values
      */
    def placeDropIndicator(coords: js.Object, size: js.Object): js.Any = js.native
    /**
      * Register all Dnd Areas identified by the attribute areaClass :
      * insert Dnd Areas using the specific sort of dropMode.
      *
      */
    def registerByClass(): Unit = js.native
    /**
      * To register Dnd Area : insert the DndArea using the specific sort of dropMode.
      *
      * @param area a DOM node corresponding to the Dnd Area
      * @param notInitAreas if false or undefined, init the areas.
      */
    def registerByNode(area: HTMLElement, notInitAreas: Boolean): Unit = js.native
    /**
      * Delete a moveable item programmatically. The node is removed from the area.
      *
      * @param area A node corresponding to the DndArea.
      * @param node The node which has to be treated.
      */
    def removeDragItem(area: HTMLElement, node: HTMLElement): js.Any = js.native
    /**
      * Unregister a D&D Area and its children into the AreaManager.
      *
      * @param area A node corresponding to the D&D Area.
      */
    def unregister(area: HTMLElement): js.Any = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mdnd/AutoScroll.html
    *
    * Activate scrolling while dragging a widget.
    *
    */
  @js.native
  class AutoScroll () extends js.Object {
    /**
      * default mouse move offset
      *
      */
    var interval: Double = js.native
    /**
      * Default mouse margin
      *
      */
    var marginMouse: Double = js.native
    /**
      *
      */
    var recursiveTimer: Double = js.native
    /**
      * Check if an autoScroll have to be launched.
      *
      * @param e
      */
    def checkAutoScroll(e: Event_): Unit = js.native
    /**
      *
      */
    def destroy(): Unit = js.native
    /**
      * Set the visible part of the window. Varies accordion to Navigator.
      *
      */
    def getViewport(): Unit = js.native
    /**
      *
      */
    def init(): Unit = js.native
    /**
      * Set the hightest heigh and width authorized scroll.
      *
      */
    def setAutoScrollMaxPage(): Unit = js.native
    /**
      * set the node which is dragged
      *
      * @param node node to scroll
      */
    def setAutoScrollNode(node: HTMLElement): Unit = js.native
    /**
      * Stop the autoscroll.
      *
      */
    def stopAutoScroll(): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mdnd/DropIndicator.html
    *
    * DropIndicator managment for DnD.
    *
    */
  @js.native
  class DropIndicator () extends js.Object {
    /**
      * the drop indicator node
      *
      */
    var node: HTMLElement = js.native
    /**
      * destroy the dropIndicator
      *
      */
    def destroy(): Unit = js.native
    /**
      * Place the DropIndicator in the right place
      *
      * @param area the dnd targer area node
      * @param nodeRef node where the dropIndicator have to be placed into the area
      * @param size
      */
    def place(area: HTMLElement, nodeRef: HTMLElement, size: js.Object): js.Any = js.native
    /**
      * remove the DropIndicator (not destroy)
      *
      */
    def remove(): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mdnd/LazyManager.html
    *
    * This class allows to launch a drag and drop dojo on the fly.
    *
    */
  @js.native
  class LazyManager () extends js.Object {
    /**
      * cancel a drag and drop dojo on the fly.
      *
      */
    def cancelDrag(): Unit = js.native
    /**
      *
      */
    def destroy(): Unit = js.native
    /**
      *
      * @param draggedNode
      */
    def getItem(draggedNode: HTMLElement): js.Object = js.native
    /**
      * launch a dojo drag and drop on the fly.
      *
      * @param e
      * @param draggedNode               Optional
      */
    def startDrag(e: Event_, draggedNode: HTMLElement): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mdnd/Moveable.html
    *
    * Allow end-users to track a DOM node into the web page
    *
    * @param params Hash of parameters
    * @param node The draggable node
    */
  @js.native
  class Moveable protected () extends js.Object {
    def this(params: js.Object, node: HTMLElement) = this()
    /**
      * The user clicks on the handle, but the drag action will really begin
      * if they track the main node to more than 3 pixels.
      *
      */
    var dragDistance: Double = js.native
    /**
      * The node on which the user clicks to drag the main node.
      *
      */
    var handle: HTMLElement = js.native
    /**
      * A flag to control a drag action if a form element has been focused.
      * If true, the drag action is not executed.
      *
      */
    var skip: Boolean = js.native
    /**
      * Delecte associated events
      *
      */
    def destroy(): Unit = js.native
    /**
      * Initialize the gap between main node coordinates and the clicked point.
      * Call the onDragStart method.
      *
      * @param e A DOM event
      */
    def initOffsetDrag(e: Event_): Unit = js.native
    /**
      * identify the type of target node associated with a DOM event.
      *
      * @param e a DOM event
      */
    def isFormElement(e: Event_): js.Any = js.native
    /**
      * Stub function.
      * Notes : border box model for size value, margin box model for coordinates
      *
      * @param node a DOM node
      * @param coords position of the main node (equals to css left/top properties)
      * @param size an object encapsulating width and height values
      * @param mousePosition coordiantes of mouse
      */
    def onDrag(node: HTMLElement, coords: js.Object, size: js.Object, mousePosition: js.Object): Unit = js.native
    /**
      * Stub function
      * Notes : Coordinates don't contain margins
      *
      * @param node a DOM node
      */
    def onDragEnd(node: HTMLElement): Unit = js.native
    /**
      * Stub function.
      * Notes : border box model
      *
      * @param node a DOM node
      * @param coords absolute position of the main node
      * @param size an object encapsulating width an height values
      */
    def onDragStart(node: HTMLElement, coords: js.Object, size: js.Object): Unit = js.native
    /**
      * Occurs when the user moves the mouse after clicking on the
      * handle.
      * Determinate when the drag action will have to begin (see
      * dragDistance).
      *
      * @param e A DOM event
      */
    def onFirstMove(e: Event_): Unit = js.native
    /**
      * Occurs when the user clicks on the handle node.
      * Skip the drag action if a specific node is targeted.
      * Listens to mouseup and mousemove events on to the HTML document.
      *
      * @param e a DOM event
      */
    def onMouseDown(e: Event_): Unit = js.native
    /**
      * Occurs when the user releases the mouse
      * Calls the onDragEnd method.
      *
      * @param e a DOM event
      */
    def onMouseUp(e: Event_): Unit = js.native
    /**
      * Occurs when the user moves the mouse.
      * Calls the onDrag method.
      *
      * @param e a DOM event
      */
    def onMove(e: Event_): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mdnd/PureSource.html
    *
    * A Source Object, which can be used only as a DnD source.
    * A Source can contained several dnd items.
    * A dnd item is not a source.
    *
    * @param node Node or node's id to build the source on.
    * @param params       OptionalAny property of this class may be configured via the paramsobject which is mixed-in to the 'dojo.dnd.Source' instance.
    */
  @js.native
  class PureSource protected () extends Selector {
    def this(node: HTMLElement) = this()
    def this(node: HTMLElement, params: js.Object) = this()
    /**
      *
      */
    var copyOnly: Boolean = js.native
    /**
      *
      */
    var generateText: Boolean = js.native
    /**
      *
      */
    var horizontal: Boolean = js.native
    /**
      *
      */
    var isSource: Boolean = js.native
    /**
      *
      */
    var targetState: String = js.native
    /**
      *
      */
    var withHandles: Boolean = js.native
    /**
      * Returns true, if we need to copy items, false to move.
      * It is separated to be overwritten dynamically, if needed.
      *
      * @param keyPressed The "copy" was pressed.
      */
    def copyState(keyPressed: Boolean): js.Any = js.native
    /**
      * inserts an array of new nodes before/after an anchor node
      *
      * @param data Logical representation of the object being dragged.If the drag object's type is "text" then data is a String,if it's another type then data could be a different Object,perhaps a name/value hash.
      * @param before insert before the anchor, if true, and after the anchor otherwise
      * @param anchor the anchor node to be used as a point of insertion
      */
    def insertNodes(data: js.Object, before: Boolean, anchor: HTMLElement): js.Function = js.native
    /**
      * Markup methods.
      *
      * @param params ???
      * @param node ???
      */
    def markupFactory(params: js.Object, node: HTMLElement): js.Any = js.native
    /**
      * Topic event processor for /dnd/cancel, called to cancel the Dnd
      * operation.
      *
      */
    def onDndCancel(): Unit = js.native
  }
  
  @js.native
  object adapter extends js.Object {
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojox/mdnd/adapter/DndFromDojo.html
      *
      * Allow communication between Dojo dnd items and DojoX D&D areas
      *
      */
    @js.native
    class DndFromDojo () extends js.Object {
      /**
        * size by default of dropIndicator (display only into a D&D Area)
        *
        */
      var dropIndicatorSize: js.Object = js.native
      /**
        * Check if a dragNode is accepted into a dojo target.
        *
        * @param node The dragged node.
        * @param accept Object containing the type accepted for a target dojo.
        */
      def isAccepted(node: HTMLElement, accept: js.Object): js.Any = js.native
      /**
        * Called when the mouse enters or exits of a source dojo.
        *
        * @param source the dojo source/target
        */
      def onDndSource(source: js.Object): Unit = js.native
      /**
        * Occurs when the user drages an DOJO dnd item inside a D&D dojoX area.
        *
        */
      def onDragEnter(): Unit = js.native
      /**
        * Occurs when the user leaves a D&D dojoX area after dragging an DOJO dnd item over it.
        *
        */
      def onDragExit(): Unit = js.native
      /**
        * Occurs when the "/dnd/start" topic is published.
        *
        * @param source the source which provides items
        * @param nodes the list of transferred items
        * @param copy copy items, if true, move items otherwise
        */
      def onDragStart(source: js.Object, nodes: js.Array[_], copy: Boolean): Unit = js.native
      /**
        * Occurs when the user leaves a D&D dojox area after dragging an DOJO dnd item over it.
        *
        * @param source the source which provides items
        * @param nodes the list of transferred items
        * @param copy copy items, if true, move items otherwise
        */
      def onDrop(source: js.Object, nodes: js.Array[_], copy: Boolean): Unit = js.native
      /**
        * Occurs when the "/dnd/cancel" topic is published.
        *
        */
      def onDropCancel(): Unit = js.native
      /**
        * Occurs when the user moves the mouse.
        *
        * @param e the DOM event
        */
      def onMouseMove(e: Event_): Unit = js.native
      /**
        * Subscribe to somes topics of dojo drag and drop.
        *
        */
      def subscribeDnd(): Unit = js.native
      /**
        * Unsubscribe to some topics of dojo drag and drop.
        *
        */
      def unsubscribeDnd(): Unit = js.native
    }
    
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojox/mdnd/adapter/DndToDojo.html
      *
      * Allow communication between an item of dojox D&D area to a target dojo.
      *
      */
    @js.native
    class DndToDojo () extends js.Object {
      /**
        * Return true if the dragged node is accepted.
        * This method has to be overwritten according to registered target.
        *
        * @param draggedNode
        * @param target
        */
      def isAccepted(draggedNode: HTMLElement, target: js.Object): Boolean = js.native
      /**
        * Call when the mouse enters in a registered dojo target.
        *
        * @param e The current Javascript Event.
        */
      def onDragEnter(e: Event_): Unit = js.native
      /**
        * Call when the mouse exit of a registered dojo target.
        *
        * @param e current javscript event
        */
      def onDragExit(e: Event_): Unit = js.native
      /**
        * Called when an onmouseup event is loaded on a registered target dojo.
        *
        * @param e Event object.
        */
      def onDrop(e: Event_): Unit = js.native
      /**
        * Call when the mouse moving after an onStartDrag of AreaManger.
        * Check if the coordinates of the mouse is in a dojo target.
        *
        * @param e Event object.
        */
      def onMouseMove(e: Event_): Unit = js.native
      /**
        * Refresh the coordinates of all registered dojo target.
        *
        */
      def refresh(): Unit = js.native
      /**
        * Refresh the coordinates of registered dojo target with a specific type.
        *
        * @param type A String to identify dojo targets.
        */
      def refreshByType(`type`: String): Unit = js.native
      /**
        * Register a target dojo.
        * The target is represented by an object containing :
        *
        * the dojo area node
        * the type reference to identify a group node
        * the coords of the area to enable refresh position
        *
        * @param area The DOM node which has to be registered.
        * @param type A String to identify the node.
        * @param dojoTarget True if the dojo D&D have to be enable when mouse is hover the registered target dojo.
        */
      def register(area: HTMLElement, `type`: String, dojoTarget: Boolean): Unit = js.native
      /**
        * Unregister all targets dojo.
        *
        */
      def unregister(): Unit = js.native
      /**
        * Unregister a target dojo.
        *
        * @param area The DOM node of target dojo.
        */
      def unregisterByNode(area: HTMLElement): Unit = js.native
      /**
        * Unregister several targets dojo having the same type passing in parameter.
        *
        * @param type A String to identify dojo targets.
        */
      def unregisterByType(`type`: String): Unit = js.native
    }
    
  }
  
  @js.native
  object dropMode extends js.Object {
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojox/mdnd/dropMode/DefaultDropMode.html
      *
      * Enabled a type of calcul for Dnd.
      * Default class to find the nearest target.
      *
      */
    @js.native
    class DefaultDropMode () extends js.Object {
      /**
        * Add a DnD Area into an array sorting by the x position.
        *
        * @param areas array of areas
        * @param object data type of a DndArea
        */
      def addArea(areas: js.Array[_], `object`: js.Object): js.Any = js.native
      /**
        *
        */
      def destroy(): Unit = js.native
      /**
        * return coordinates of the draggable item
        * return for:
        *
        * X point : the middle
        * Y point : search if the user goes up or goes down with their mouse.
        * Up : top of the draggable item
        * Down : bottom of the draggable item
        *
        * @param coords an object encapsulating X and Y position
        * @param size an object encapsulating width and height values
        * @param mousePosition coordinates of mouse
        */
      def getDragPoint(coords: js.Object, size: js.Object, mousePosition: js.Object): js.Any = js.native
      /**
        * Return the index where the drop has to be placed.
        *
        * @param targetArea a DnD area object
        * @param coords coordinates [x,y] of the draggable item
        */
      def getDropIndex(targetArea: js.Object, coords: js.Object): js.Any = js.native
      /**
        * get the nearest DnD area.
        * Coordinates are basically provided by the getDragPoint method.
        *
        * @param areaList a list of DnD areas objects
        * @param coords coordinates [x,y] of the dragItem
        * @param currentIndexArea an index representing the active DnD area
        */
      def getTargetArea(areaList: js.Array[_], coords: js.Object, currentIndexArea: Double): js.Any = js.native
      /**
        * initialize the horizontal line in order to determinate the drop zone.
        *
        * @param area the DnD area
        */
      def initItems(area: js.Object): Unit = js.native
      /**
        * take into account the drop indicator DOM element in order to compute horizontal lines
        *
        * @param area a DnD area object
        * @param indexItem index of a draggable item
        * @param size dropIndicator size
        * @param added boolean to know if a dropIndicator has been added or deleted
        */
      def refreshItems(area: js.Object, indexItem: Double, size: js.Object, added: Boolean): Unit = js.native
      /**
        * Refresh intervals between areas to determinate the nearest area to drop an item.
        * Algorithm :
        * the marker should be the vertical line passing by the
        * central point between two contiguous areas.
        * Note:
        * If the page has only one targetArea, it's not necessary to calculate coords.
        *
        * @param areaList array of areas
        */
      def updateAreas(areaList: js.Array[_]): Unit = js.native
    }
    
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojox/mdnd/dropMode/OverDropMode.html
      *
      * Default class to find the nearest target only if the mouse is over an area.
      *
      */
    @js.native
    class OverDropMode () extends js.Object {
      /**
        * Add a D&D Area into an array sorting by the x position.
        *
        * @param areas array of areas
        * @param object data type of a DndArea
        */
      def addArea(areas: js.Array[_], `object`: js.Object): js.Any = js.native
      /**
        *
        */
      def destroy(): Unit = js.native
      /**
        * return coordinates of the draggable item.
        *
        * For X point : the x position of mouse
        * For Y point : the y position of mouse
        *
        * @param coords an object encapsulating X and Y position
        * @param size an object encapsulating width and height values
        * @param mousePosition coordinates of mouse
        */
      def getDragPoint(coords: js.Object, size: js.Object, mousePosition: js.Object): js.Any = js.native
      /**
        * Return the index where the drop has to be placed.
        *
        * @param targetArea a D&D area object.
        * @param coords coordinates [x,y] of the draggable item.
        */
      def getDropIndex(targetArea: js.Object, coords: js.Object): js.Any = js.native
      /**
        * get the nearest D&D area.
        *
        * @param areaList a list of D&D areas objects
        * @param coords coordinates [x,y] of the dragItem (see getDragPoint())
        * @param currentIndexArea an index representing the active D&D area
        */
      def getTargetArea(areaList: js.Array[_], coords: js.Object, currentIndexArea: Double): js.Any = js.native
      /**
        * initialize the horizontal line in order to determinate the drop zone.
        *
        * @param area the D&D area.
        */
      def initItems(area: js.Object): Unit = js.native
      /**
        * take into account the drop indicator DOM element in order to compute horizontal lines
        *
        * @param area a D&D area object
        * @param indexItem index of a draggable item
        * @param size dropIndicator size
        * @param added boolean to know if a dropIndicator has been added or deleted
        */
      def refreshItems(area: js.Object, indexItem: Double, size: js.Object, added: Boolean): Unit = js.native
      /**
        * refresh areas position and size to determinate the nearest area to drop an item
        * the area position (and size) is equal to the postion of the domNode associated.
        *
        * @param areaList array of areas
        */
      def updateAreas(areaList: js.Array[_]): Unit = js.native
    }
    
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojox/mdnd/dropMode/VerticalDropMode.html
      *
      * Enabled a type of calcul for Dnd.
      * Default class to find the nearest target.
      *
      */
    @js.native
    class VerticalDropMode () extends js.Object {
      /**
        * Add a DnD Area into an array sorting by the x position.
        *
        * @param areas array of areas
        * @param object data type of a DndArea
        */
      def addArea(areas: js.Array[_], `object`: js.Object): js.Any = js.native
      /**
        *
        */
      def destroy(): Unit = js.native
      /**
        * return coordinates of the draggable item
        * return for:
        *
        * X point : the middle
        * Y point : search if the user goes up or goes down with their mouse.
        * Up : top of the draggable item
        * Down : bottom of the draggable item
        *
        * @param coords an object encapsulating X and Y position
        * @param size an object encapsulating width and height values
        * @param mousePosition coordinates of mouse
        */
      def getDragPoint(coords: js.Object, size: js.Object, mousePosition: js.Object): js.Any = js.native
      /**
        * Return the index where the drop has to be placed.
        *
        * @param targetArea a DnD area object
        * @param coords coordinates [x,y] of the draggable item
        */
      def getDropIndex(targetArea: js.Object, coords: js.Object): js.Any = js.native
      /**
        * get the nearest DnD area.
        * Coordinates are basically provided by the getDragPoint method.
        *
        * @param areaList a list of DnD areas objects
        * @param coords coordinates [x,y] of the dragItem
        * @param currentIndexArea an index representing the active DnD area
        */
      def getTargetArea(areaList: js.Array[_], coords: js.Object, currentIndexArea: Double): js.Any = js.native
      /**
        * initialize the horizontal line in order to determinate the drop zone.
        *
        * @param area the DnD area
        */
      def initItems(area: js.Object): Unit = js.native
      /**
        * take into account the drop indicator DOM element in order to compute horizontal lines
        *
        * @param area a DnD area object
        * @param indexItem index of a draggable item
        * @param size dropIndicator size
        * @param added boolean to know if a dropIndicator has been added or deleted
        */
      def refreshItems(area: js.Object, indexItem: Double, size: js.Object, added: Boolean): Unit = js.native
      /**
        * Refresh intervals between areas to determinate the nearest area to drop an item.
        * Algorithm :
        * the marker should be the vertical line passing by the
        * central point between two contiguous areas.
        * Note:
        * If the page has only one targetArea, it's not necessary to calculate coords.
        *
        * @param areaList array of areas
        */
      def updateAreas(areaList: js.Array[_]): Unit = js.native
    }
    
  }
  
}

