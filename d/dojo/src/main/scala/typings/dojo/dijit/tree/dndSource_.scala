package typings.dojo.dijit.tree

import typings.dojo.dijit.Tree
import typings.dojo.dojo.dnd.Source
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/tree/dndSource.html
  *
  * Handles drag and drop operations (as a source or a target) for dijit.Tree
  * 
  * @param tree     
  * @param params     
  */
@JSGlobal("dijit.tree.dndSource")
@js.native
class dndSource_ protected () extends _dndSelector {
  def this(tree: Tree, params: dndSource) = this()
  /**
    * List of accepted types (text strings) for the Tree; defaults to
    * ["text"]
    * 
    */
  var accept: js.Object = js.native
  /**
    * Distance from upper/lower edge of node to allow drop to reorder nodes
    * 
    */
  var betweenThreshold: Double = js.native
  /**
    * The move delay in pixels before detecting a drag; 5 by default
    * 
    */
  var dragThreshold: Double = js.native
  /**
    * 
    */
  var generateText: Boolean = js.native
  /**
    * Can be used as a DnD source.
    * 
    */
  var isSource: Boolean = js.native
  /**
    * Checks if the target can accept nodes from this source
    * 
    * @param source The source which provides items             
    * @param nodes Array of DOM nodes corresponding to nodes being dropped, dijitTreeRow nodes ifsource is a dijit/Tree.             
    */
  def checkAcceptance(source: dndSource, nodes: js.Array[HTMLElement]): Boolean = js.native
  /**
    * Stub function to be overridden if one wants to check for the ability to drop at the node/item level
    * In the base case, this is called to check if target can become a child of source.
    * When betweenThreshold is set, position="before" or "after" means that we
    * are asking if the source node can be dropped before/after the target node.
    * 
    * @param target The dijitTreeRoot DOM node inside of the TreeNode that we are dropping on toUse dijit.getEnclosingWidget(target) to get the TreeNode.             
    * @param source The (set of) nodes we are dropping             
    * @param position "over", "before", or "after"             
    */
  def checkItemAcceptance(target: HTMLElement, source: dndSource, position: String): Boolean = js.native
  /**
    * Returns true, if we need to copy items, false to move.
    * It is separated to be overwritten dynamically, if needed.
    * 
    * @param keyPressed The "copy" control key was pressed             
    */
  def copyState(keyPressed: Boolean): js.Any = js.native
  /**
    * Returns objects passed to Tree.model.newItem() based on DnD nodes
    * dropped onto the tree.   Developer must override this method to enable
    * dropping from external sources onto this Tree, unless the Tree.model's items
    * happen to look like {id: 123, name: "Apple" } with no other attributes.
    * For each node in nodes[], which came from source, create a hash of name/value
    * pairs to be passed to Tree.model.newItem().  Returns array of those hashes.
    * 
    * @param nodes             
    * @param target             
    * @param source             
    */
  def itemCreator(nodes: js.Array[HTMLElement], target: HTMLElement, source: Source): js.Any = js.native
  /**
    * Topic event processor for /dnd/drop, called to finish the DnD operation.
    * Updates data store items according to where node was dragged from and dropped
    * to.   The tree will then respond to those data store updates and redraw itself.
    * 
    * @param source The dijit/tree/dndSource / dojo/dnd/Source which is providing the items             
    * @param nodes The list of transferred items, dndTreeNode nodes if dragging from a Tree             
    * @param copy Copy items, if true, move items otherwise             
    */
  def onDndDrop(source: js.Object, nodes: js.Array[HTMLElement], copy: Boolean): Unit = js.native
}

