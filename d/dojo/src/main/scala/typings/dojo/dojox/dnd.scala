package typings.dojo.dojox

import typings.dojo.dojox.dnd.Selector
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.dnd")
@js.native
object dnd extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/dnd/BoundingBoxController.html
    *
    * Allows the user draw bounding boxes around nodes on the page.
    * Publishes to the "/dojox/dnd/bounding" topic to tell the selector to check
    * to see whether any dnd items fall within the coordinates of the bounding box
    *
    * @param sources an array of dojox.dnd.Selectors which need to be aware ofthe positioning of the bounding box.
    * @param domNode the DOM node or id which represents the bounding box on the page.
    */
  @js.native
  class BoundingBoxController protected () extends js.Object {
    def this(sources: js.Array[Selector], domNode: String) = this()
    /**
      * Override-able by the client as an extra check to ensure that a bounding
      * box is viable. In some instances, it might not make sense that
      * a mouse down -> mouse move -> mouse up interaction represents a bounding box.
      * For example, if a dialog is open the client might want to suppress a bounding
      * box. This function could be used by the client to ensure that a bounding box is only
      * drawn on the document when certain conditions are met.
      *
      * @param evt the mouse event which caused this callback to fire.
      */
    def boundingBoxIsViable(evt: js.Object): Boolean = js.native
    /**
      * prepares this object to be garbage-collected
      *
      */
    def destroy(): Unit = js.native
    /**
      * Override-able by the client as an extra check to ensure that a bounding
      * box should begin to be drawn. If the client has any preconditions to when a
      * bounding box should be drawn, they should be included in this method.
      *
      * @param evt the mouse event which caused this callback to fire.
      */
    def shouldStartDrawingBox(evt: js.Object): Boolean = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/dnd/Selector.html
    *
    *
    * @param node node or node's id to build the selector on
    * @param params       Optionala dictionary of parameters
    */
  @js.native
  class Selector protected ()
    extends typings.dojo.dojo.dnd.Selector {
    def this(node: HTMLElement) = this()
    def this(node: HTMLElement, params: js.Object) = this()
    /**
      *
      */
    var conservative: Boolean = js.native
    /**
      * deselects a node
      *
      * @param node Node to deselect (id or DOM Node)
      */
    def deselectNode(node: String): js.Function = js.native
    /**
      * deselects a node
      *
      * @param node Node to deselect (id or DOM Node)
      */
    def deselectNode(node: HTMLElement): js.Function = js.native
    /**
      * inserts an array of new nodes before/after an anchor node
      *
      * @param data Logical representation of the object being dragged.If the drag object's type is "text" then data is a String,if it's another type then data could be a different Object,perhaps a name/value hash.
      * @param before insert before the anchor, if true, and after the anchor otherwise
      * @param anchor the anchor node to be used as a point of insertion
      */
    def insertNodes(data: js.Object, before: Boolean, anchor: HTMLElement): js.Function = js.native
    /**
      * checks if node is selected
      *
      * @param node Node to check (id or DOM Node)
      */
    def isSelected(node: String): js.Any = js.native
    /**
      * checks if node is selected
      *
      * @param node Node to check (id or DOM Node)
      */
    def isSelected(node: HTMLElement): js.Any = js.native
    /**
      * selects nodes by bounding box
      *
      * @param left Left coordinate of the bounding box
      * @param top Top coordinate of the bounding box
      * @param right Right coordinate of the bounding box
      * @param bottom Bottom coordinate of the bounding box
      * @param add               OptionalIf true, node is added to selection, otherwise currentselection is removed, and node will be the only selection.
      */
    def selectByBBox(left: Double, top: Double, right: Double, bottom: Double, add: Boolean): js.Function = js.native
    /**
      * selects a node
      *
      * @param node Node to select (id or DOM Node)
      * @param add               OptionalIf true, node is added to selection, otherwise currentselection is removed, and node will be the only selection.
      */
    def selectNode(node: String, add: Boolean): js.Function = js.native
    /**
      * selects a node
      *
      * @param node Node to select (id or DOM Node)
      * @param add               OptionalIf true, node is added to selection, otherwise currentselection is removed, and node will be the only selection.
      */
    def selectNode(node: HTMLElement, add: Boolean): js.Function = js.native
    /**
      * shifts the currently selected dnd item forwards and backwards.
      * One possible use would be to allow a user select different
      * dnd items using the right and left keys.
      *
      * @param toNext If true, we select the next node, otherwise the previous one.
      * @param add               OptionalIf true, add to selection, otherwise current selection isremoved before adding any nodes.
      */
    def shift(toNext: Boolean, add: Boolean): Unit = js.native
  }
  
}

