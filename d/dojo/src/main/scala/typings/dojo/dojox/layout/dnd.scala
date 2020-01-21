package typings.dojo.dojox.layout

import typings.dojo.dojo.dnd.Source
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.layout.dnd")
@js.native
object dnd extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/layout/dnd/Avatar.html
    *
    * An Object, which represents the object being moved in a GridContainer
    *
    * @param manager
    * @param opacity
    */
  @js.native
  class Avatar protected ()
    extends typings.dojo.dojo.dnd.Avatar {
    def this(manager: js.Any, opacity: js.Any) = this()
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/layout/dnd/PlottedDnd.html
    *
    * dnd source handling plotted zone to show the dropping area
    *
    * @param node
    * @param params
    */
  @js.native
  class PlottedDnd protected () extends Source {
    def this(node: HTMLElement, params: js.Object) = this()
    /**
      *
      */
    var GC_OFFSET_X: js.Object = js.native
    /**
      *
      */
    var GC_OFFSET_Y: js.Object = js.native
    /**
      * hide the dashed zone
      *
      */
    def deleteDashedZone(): Unit = js.native
    /**
      * Return one or more widget selected during the drag.
      *
      * @param node
      */
    def getDraggedWidget(node: HTMLElement): js.Any = js.native
    /**
      * Insert the dashed zone at the right place
      *
      * @param before
      */
    def insertDashedZone(before: Boolean): Unit = js.native
    /**
      * inserts an array of new nodes before/after an anchor node
      *
      * @param data Logical representation of the object being dragged.If the drag object's type is "text" then data is a String,if it's another type then data could be a different Object,perhaps a name/value hash.
      * @param before insert before the anchor, if true, and after the anchor otherwise
      * @param anchor the anchor node to be used as a point of insertion
      */
    def insertNodes(data: js.Object, before: Boolean, anchor: HTMLElement): js.Function = js.native
    /**
      * test if this node can be accepted
      *
      * @param node
      */
    def isAccepted(node: HTMLElement): js.Object = js.native
    /**
      * Called to finish the DnD operation
      *
      * @param source
      * @param nodes
      * @param copy
      * @param target
      */
    def onDndDrop(source: js.Any, nodes: js.Any, copy: js.Any, target: js.Any): Unit = js.native
    /**
      * Called to initiate the DnD operation.
      *
      * @param source
      * @param nodes
      * @param copy
      */
    def onDndStart(source: js.Object, nodes: js.Array[_], copy: js.Object): Unit = js.native
    /**
      * Event processor for onmousemove
      *
      * @param e
      */
    def onMouseMove(e: js.Any): Unit = js.native
    /**
      * set an item as selectable
      *
      * @param node
      * @param isSelectable
      */
    def setDndItemSelectable(node: HTMLElement, isSelectable: Boolean): Unit = js.native
    /**
      * set the position of the drop indicator
      *
      * @param e
      */
    def setIndicatorPosition(e: Event_): Boolean = js.native
  }
  
}

