package typings.dojo.dijit.tree

import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/tree/_dndSelector.html
  *
  * This is a base class for dijit/tree/dndSource, and isn't meant to be used directly.
  * It's based on dojo/dnd/Selector.
  * 
  */
@JSGlobal("dijit.tree._dndSelector")
@js.native
class dndSelector () extends dndContainer {
  /**
    * (id to DomNode) map for every TreeNode that's currently selected.
    * The DOMNode is the TreeNode.rowNode.
    * 
    */
  var selection: js.Object = js.native
  /**
    * Allows selection of only one element, if true.
    * Tree hasn't been tested in singular=true mode, unclear if it works.
    * 
    */
  var singular: Boolean = js.native
  /**
    * add node to current selection
    * 
    * @param node node to add             
    * @param isAnchor               OptionalWhether the node should become anchor.             
    */
  def addTreeNode(node: HTMLElement, isAnchor: Boolean): HTMLElement = js.native
  /**
    * Iterates over selected items;
    * see dojo/dnd/Container.forInItems() for details
    * 
    * @param f             
    * @param o               Optional            
    */
  def forInSelectedItems(f: js.Function, o: js.Object): Unit = js.native
  /**
    * Returns the dojo/dnd/Container._Item (representing a dragged node) by it's key (id).
    * Called by dojo/dnd/Source.checkAcceptance().
    * 
    * @param key             
    */
  def getItem(key: String): js.Object = js.native
  /**
    * Returns a list of selected node(s).
    * Used by dndSource on the start of a drag.
    * 
    */
  def getSelectedTreeNodes(): js.Array[_] = js.native
  /**
    * return true if node is currently selected
    * 
    * @param node the node to check whether it's in the current selection             
    */
  def isTreeNodeSelected(node: HTMLElement): js.Any = js.native
  /**
    * Event processor for onmousedown/ontouchstart/onkeydown corresponding to a click event
    * 
    * @param e onmousedown/ontouchstart/onkeydown event             
    */
  def onClickPress(e: Event_): Unit = js.native
  /**
    * Event processor for onmouseup/ontouchend/onkeyup corresponding to a click event
    * 
    * @param e onmouseup/ontouchend/onkeyup event             
    */
  def onClickRelease(e: Event_): Unit = js.native
  /**
    * Event processor for onmousedown/ontouchstart
    * 
    */
  def onMouseDown(): Unit = js.native
  /**
    * event processor for onmousemove/ontouchmove
    * 
    * @param e onmouseup/ontouchend event             
    */
  def onMouseMove(e: Event_): Unit = js.native
  /**
    * Event processor for onmouseup/ontouchend
    * 
    */
  def onMouseUp(): Unit = js.native
  /**
    * remove node and it's descendants from current selection
    * 
    * @param node node to remove             
    */
  def removeTreeNode(node: HTMLElement): HTMLElement = js.native
  /**
    * set the list of selected nodes to be exactly newSelection. All changes to the
    * selection should be passed through this function, which ensures that derived
    * attributes are kept up to date. Anchor will be deleted if it has been removed
    * from the selection, but no new anchor will be added by this function.
    * 
    * @param newSelection list of tree nodes to make selected             
    */
  def setSelection(newSelection: js.Array[HTMLElement]): Unit = js.native
  /**
    * Add or remove the given node from selection, responding
    * to a user action such as a click or keypress.
    * 
    * @param node             
    * @param multi Indicates whether this is meant to be a multi-select action (e.g. ctrl-click)             
    * @param range Indicates whether this is meant to be a ranged action (e.g. shift-click)             
    */
  def userSelect(node: js.Any, multi: Boolean, range: Boolean): Unit = js.native
}

