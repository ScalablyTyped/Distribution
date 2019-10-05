package typings.dojo.dojo.dnd

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/Source.html
  *
  * a Source object, which can be used as a DnD source, or a DnD target
  *
  * @param node node or node's id to build the source on
  * @param params       Optionalany property of this class may be configured via the paramsobject which is mixed-in to the dojo/dnd/Source instance
  */
@JSGlobal("dojo.dnd.Source")
@js.native
class Source protected () extends Selector {
  def this(node: HTMLElement) = this()
  def this(node: HTMLElement, params: js.Object) = this()
  /**
    *
    */
  var accept: js.Array[_] = js.native
  /**
    *
    */
  var autoSync: Boolean = js.native
  /**
    *
    */
  var copyOnly: Boolean = js.native
  /**
    *
    */
  var delay: Double = js.native
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
  var selfAccept: Boolean = js.native
  /**
    *
    */
  var selfCopy: Boolean = js.native
  /**
    *
    */
  var withHandles: Boolean = js.native
  /**
    * checks if the target can accept nodes from this source
    *
    * @param source the source which provides items
    * @param nodes the list of transferred items
    */
  def checkAcceptance(source: js.Object, nodes: js.Array[_]): Boolean = js.native
  /**
    * Returns true if we need to copy items, false to move.
    * It is separated to be overwritten dynamically, if needed.
    *
    * @param keyPressed the "copy" key was pressed
    * @param self               Optionaloptional flag that means that we are about to drop on itself
    */
  def copyState(keyPressed: Boolean): js.Any = js.native
  def copyState(keyPressed: Boolean, self: Boolean): js.Any = js.native
  /**
    * topic event processor for /dnd/cancel, called to cancel the DnD operation
    *
    */
  def onDndCancel(): Unit = js.native
  /**
    * topic event processor for /dnd/drop, called to finish the DnD operation
    *
    * @param source the source which provides items
    * @param nodes the list of transferred items
    * @param copy copy items, if true, move items otherwise
    * @param target the target which accepts items
    */
  def onDndDrop(source: js.Object, nodes: js.Array[_], copy: Boolean, target: js.Object): Unit = js.native
  /**
    * topic event processor for /dnd/source/over, called when detected a current source
    *
    * @param source the source which has the mouse over it
    */
  def onDndSourceOver(source: js.Object): Unit = js.native
  /**
    * topic event processor for /dnd/start, called to initiate the DnD operation
    *
    * @param source the source which provides items
    * @param nodes the list of transferred items
    * @param copy copy items, if true, move items otherwise
    */
  def onDndStart(source: js.Object, nodes: js.Array[_], copy: Boolean): Unit = js.native
  /**
    * called during the active DnD operation, when items
    * are dragged away from this target, and it is not disabled
    *
    */
  def onDraggingOut(): Unit = js.native
  /**
    * called during the active DnD operation, when items
    * are dragged over this target, and it is not disabled
    *
    */
  def onDraggingOver(): Unit = js.native
  /**
    * called only on the current target, when drop is performed
    *
    * @param source the source which provides items
    * @param nodes the list of transferred items
    * @param copy copy items, if true, move items otherwise
    */
  def onDrop(source: js.Object, nodes: js.Array[_], copy: Boolean): Unit = js.native
  /**
    * called only on the current target, when drop is performed
    * from an external source
    *
    * @param source the source which provides items
    * @param nodes the list of transferred items
    * @param copy copy items, if true, move items otherwise
    */
  def onDropExternal(source: js.Object, nodes: js.Array[_], copy: Boolean): Unit = js.native
  /**
    * called only on the current target, when drop is performed
    * from the same target/source
    *
    * @param nodes the list of transferred items
    * @param copy copy items, if true, move items otherwise
    */
  def onDropInternal(nodes: js.Array[_], copy: Boolean): Unit = js.native
}

