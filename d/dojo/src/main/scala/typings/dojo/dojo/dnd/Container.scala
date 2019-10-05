package typings.dojo.dojo.dnd

import typings.dojo.dojo.Evented
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/Container.html
  *
  * a Container object, which knows when mouse hovers over it,
  * and over which element it hovers
  *
  * @param node node or node's id to build the container on
  * @param params a dictionary of parameters
  */
@JSGlobal("dojo.dnd.Container")
@js.native
class Container protected () extends Evented {
  def this(node: HTMLElement, params: js.Object) = this()
  /**
    * Indicates whether to allow dnd item nodes to be nested within other elements.
    * By default this is false, indicating that only direct children of the container can
    * be draggable dnd item nodes
    *
    */
  var allowNested: Boolean = js.native
  /**
    * The DOM node the mouse is currently hovered over
    *
    */
  var current: HTMLElement = js.native
  /**
    * Map from an item's id (which is also the DOMNode's id) to
    * the dojo/dnd/Container.Item itself.
    *
    */
  var map: js.Object = js.native
  var node: HTMLElement = js.native
  /**
    *
    */
  var skipForm: Boolean = js.native
  /**
    * Represents (one of) the source node(s) being dragged.
    * Contains (at least) the "type" and "data" attributes.
    *
    */
  def Item(): Unit = js.native
  /**
    * removes all data items from the map
    *
    */
  def clearItems(): Unit = js.native
  /**
    * creator function, dummy at the moment
    *
    */
  def creator(): Unit = js.native
  /**
    * removes a data item from the map by its key (id)
    *
    * @param key
    */
  def delItem(key: String): Unit = js.native
  /**
    * prepares this object to be garbage-collected
    *
    */
  def destroy(): Unit = js.native
  /**
    *
    * @param type
    * @param event
    */
  def emit(`type`: js.Any, event: js.Any): js.Any = js.native
  /**
    * iterates over a data map skipping members that
    * are present in the empty object (IE and/or 3rd-party libraries).
    *
    * @param f
    * @param o               Optional
    */
  def forInItems(f: js.Function, o: js.Object): String = js.native
  /**
    * returns a list (an array) of all valid child nodes
    *
    */
  def getAllNodes(): js.Any = js.native
  /**
    * returns a data item by its key (id)
    *
    * @param key
    */
  def getItem(key: String): js.Any = js.native
  /**
    * inserts an array of new nodes before/after an anchor node
    *
    * @param data Logical representation of the object being dragged.If the drag object's type is "text" then data is a String,if it's another type then data could be a different Object,perhaps a name/value hash.
    * @param before insert before the anchor, if true, and after the anchor otherwise
    * @param anchor the anchor node to be used as a point of insertion
    */
  def insertNodes(): js.Function = js.native
  def insertNodes(addSelected: Boolean): js.Function = js.native
  def insertNodes(addSelected: Boolean, data: js.Array[_]): js.Function = js.native
  def insertNodes(addSelected: Boolean, data: js.Array[_], before: Boolean): js.Function = js.native
  def insertNodes(addSelected: Boolean, data: js.Array[_], before: Boolean, anchor: HTMLElement): js.Function = js.native
  /**
    *
    * @param params
    * @param node
    * @param Ctor
    */
  def markupFactory(params: js.Any, node: js.Any, Ctor: js.Any): js.Any = js.native
  /**
    *
    * @param type
    * @param listener
    */
  def on(`type`: js.Any, listener: js.Any): js.Any = js.native
  /**
    * event processor for onmouseout
    *
    * @param e mouse event
    */
  def onMouseOut(e: Event): Unit = js.native
  /**
    * event processor for onmouseover or touch, to mark that element as the current element
    *
    * @param e mouse event
    */
  def onMouseOver(e: Event): Unit = js.native
  /**
    * this function is called once, when mouse is out of our container
    *
    */
  def onOutEvent(): Unit = js.native
  /**
    * this function is called once, when mouse is over our container
    *
    */
  def onOverEvent(): Unit = js.native
  /**
    * event processor for onselectevent and ondragevent
    *
    * @param e mouse event
    */
  def onSelectStart(e: Event): Unit = js.native
  /**
    * associates a data item with its key (id)
    *
    * @param key
    * @param data
    */
  def setItem(key: String, data: js.Any): Unit = js.native
  /**
    * collects valid child items and populate the map
    *
    */
  def startup(): Unit = js.native
  /**
    * sync up the node list with the data map
    *
    */
  def sync(): js.Function = js.native
}

@JSGlobal("dojo.dnd.Container")
@js.native
object Container extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/Container.__ContainerArgs.html
    *
    *
    */
  @js.native
  class __ContainerArgs () extends js.Object {
    /**
      * node or node's id to use as the parent node for dropped items
      * (must be underneath the 'node' parameter in the DOM)
      *
      */
    var dropParent: HTMLElement = js.native
    /**
      * don't start the drag operation, if clicked on form elements
      *
      */
    var skipForm: Boolean = js.native
    /**
      * a creator function, which takes a data item, and returns an object like that:
      * {node: newNode, data: usedData, type: arrayOfStrings}
      *
      */
    def creator(): Unit = js.native
  }
  
}

