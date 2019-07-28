package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.TreeView")
@js.native
class TreeView protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.TreeViewNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.TreeViewNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.TreeViewNs.Model = js.native
  @JSName("model")
  var model_TreeView: typings.ejDotWebDotAll.ejNs.TreeViewNs.Model = js.native
  /** To add a Node or collection of nodes in TreeView. If target tree node is specified, then the given nodes are added as child of target tree node, otherwise nodes are added in
    * TreeView.
    * @param {string|any} New node text or JSON object
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @param {boolean} Parent node will be prevented from auto expanding
    * @returns {void}
    */
  def addNode(newNodeText: String, target: String, preventTargetExpand: Boolean): Unit = js.native
  def addNode(newNodeText: String, target: js.Any, preventTargetExpand: Boolean): Unit = js.native
  def addNode(newNodeText: js.Any, target: String, preventTargetExpand: Boolean): Unit = js.native
  def addNode(newNodeText: js.Any, target: js.Any, preventTargetExpand: Boolean): Unit = js.native
  /** To add a collection of nodes in TreeView. If target tree node is specified, then the given nodes are added as child of target tree node, otherwise nodes are added in TreeView.
    * @param {any|any[]} New node details in JSON object
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @param {boolean} Parent node will be prevented from auto expanding
    * @returns {void}
    */
  def addNodes(collection: js.Any, target: String, preventTargetExpand: Boolean): Unit = js.native
  def addNodes(collection: js.Any, target: js.Any, preventTargetExpand: Boolean): Unit = js.native
  def addNodes(collection: js.Array[_], target: String, preventTargetExpand: Boolean): Unit = js.native
  def addNodes(collection: js.Array[_], target: js.Any, preventTargetExpand: Boolean): Unit = js.native
  /** To check all the nodes in TreeView.
    * @returns {void}
    */
  def checkAll(): Unit = js.native
  /** To check a node in TreeView.
    * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
    * @returns {void}
    */
  def checkNode(element: String): Unit = js.native
  def checkNode(element: js.Any): Unit = js.native
  def checkNode(element: js.Array[_]): Unit = js.native
  /** This method is used to collapse all nodes in TreeView control. If you want to collapse all nodes up to the specific level in TreeView control then we need to pass levelUntil as
    * argument to this method.
    * @param {number} TreeView nodes will collapse until the given level
    * @param {boolean} Weather exclude the hidden nodes of TreeView while collapse all nodes
    * @returns {void}
    */
  def collapseAll(): Unit = js.native
  def collapseAll(levelUntil: Double): Unit = js.native
  def collapseAll(levelUntil: Double, excludeHiddenNodes: Boolean): Unit = js.native
  /** To collapse a particular node in TreeView.
    * @param {string|any|any[]} ID of TreeView node|object of TreeView node/collection of ID/object of TreeView nodes
    * @returns {void}
    */
  def collapseNode(element: String): Unit = js.native
  def collapseNode(element: js.Any): Unit = js.native
  def collapseNode(element: js.Array[_]): Unit = js.native
  /** To disable the node in the TreeView.
    * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
    * @returns {void}
    */
  def disableNode(element: String): Unit = js.native
  def disableNode(element: js.Any): Unit = js.native
  def disableNode(element: js.Array[_]): Unit = js.native
  /** To enable the node in the TreeView.
    * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
    * @returns {void}
    */
  def enableNode(element: String): Unit = js.native
  def enableNode(element: js.Any): Unit = js.native
  def enableNode(element: js.Array[_]): Unit = js.native
  /** To ensure that the TreeView node is visible in the TreeView. This method is useful if we need select a TreeView node dynamically.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @returns {boolean}
    */
  def ensureVisible(element: String): Boolean = js.native
  def ensureVisible(element: js.Any): Boolean = js.native
  /** This method is used to expand all nodes in TreeView control. If you want to expand all nodes up to the specific level in TreeView control then we need to pass levelUntil as
    * argument to this method.
    * @param {number} TreeView nodes will expand until the given level
    * @param {boolean} Weather exclude the hidden nodes of TreeView while expand all nodes
    * @returns {void}
    */
  def expandAll(): Unit = js.native
  def expandAll(levelUntil: Double): Unit = js.native
  def expandAll(levelUntil: Double, excludeHiddenNodes: Boolean): Unit = js.native
  /** To expandNode particular node in TreeView.
    * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
    * @returns {void}
    */
  def expandNode(element: String): Unit = js.native
  def expandNode(element: js.Any): Unit = js.native
  def expandNode(element: js.Array[_]): Unit = js.native
  /** To get currently checked nodes in TreeView.
    * @returns {any}
    */
  def getCheckedNodes(): js.Any = js.native
  /** To get currently checked nodes indexes in TreeView.
    * @returns {any[]}
    */
  def getCheckedNodesIndex(): js.Array[_] = js.native
  /** This method is used to get immediate child nodes of a node in TreeView control. If you want to get the all child nodes include nested child nodes then we need to pass
    * includeNestedChild as true along with element arguments to this method.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @param {boolean} Weather include nested child nodes of TreeView node
    * @returns {any[]}
    */
  def getChildren(element: String): js.Array[_] = js.native
  def getChildren(element: String, includeNestedChild: Boolean): js.Array[_] = js.native
  def getChildren(element: js.Any): js.Array[_] = js.native
  def getChildren(element: js.Any, includeNestedChild: Boolean): js.Array[_] = js.native
  /** To get currently expanded nodes in TreeView.
    * @returns {any}
    */
  def getExpandedNodes(): js.Any = js.native
  /** To get currently expanded nodes indexes in TreeView.
    * @returns {any[]}
    */
  def getExpandedNodesIndex(): js.Array[_] = js.native
  /** To get TreeView node data such as id, text, parentId, selected, checked, expanded, level, childes and index.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @returns {any}
    */
  def getNode(element: String): js.Any = js.native
  def getNode(element: js.Any): js.Any = js.native
  /** To get TreeView node by using index position in TreeView.
    * @param {number} Index position of TreeView node
    * @returns {any}
    */
  def getNodeByIndex(index: Double): js.Any = js.native
  /** To get number of nodes in TreeView.
    * @returns {number}
    */
  def getNodeCount(): Double = js.native
  /** To get current index position of TreeView node.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @returns {number}
    */
  def getNodeIndex(element: String): Double = js.native
  def getNodeIndex(element: js.Any): Double = js.native
  /** To get immediate parent TreeView node of particular TreeView node.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @returns {any}
    */
  def getParent(element: String): js.Any = js.native
  def getParent(element: js.Any): js.Any = js.native
  /** To get the currently selected node in TreeView.
    * @returns {any}
    */
  def getSelectedNode(): js.Any = js.native
  /** To get the index position of currently selected node in TreeView.
    * @returns {number}
    */
  def getSelectedNodeIndex(): Double = js.native
  /** To get the currently selected nodes in TreeView.
    * @returns {any[]}
    */
  def getSelectedNodes(): js.Array[_] = js.native
  /** To get the index positions of currently selected nodes in TreeView.
    * @returns {any[]}
    */
  def getSelectedNodesIndex(): js.Array[_] = js.native
  /** To get the text of a node in TreeView.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @returns {string}
    */
  def getText(element: String): String = js.native
  def getText(element: js.Any): String = js.native
  /** To get the updated datasource of TreeView after performing some operation like drag and drop, node editing, adding and removing node.
    * @param {string|number} ID of TreeView node
    * @returns {any[]}
    */
  def getTreeData(): js.Array[_] = js.native
  def getTreeData(id: String): js.Array[_] = js.native
  def getTreeData(id: Double): js.Array[_] = js.native
  /** To get currently visible nodes in TreeView.
    * @returns {any}
    */
  def getVisibleNodes(): js.Any = js.native
  /** To check a node having child or not.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @returns {boolean}
    */
  def hasChildNode(element: String): Boolean = js.native
  def hasChildNode(element: js.Any): Boolean = js.native
  /** To show nodes in TreeView.
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** To hide particular node in TreeView.
    * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
    * @returns {void}
    */
  def hideNode(element: String): Unit = js.native
  def hideNode(element: js.Any): Unit = js.native
  def hideNode(element: js.Array[_]): Unit = js.native
  /** To add a Node or collection of nodes after the particular TreeView node.
    * @param {string|any} New node text or JSON object
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @returns {void}
    */
  def insertAfter(newNodeText: String, target: String): Unit = js.native
  def insertAfter(newNodeText: String, target: js.Any): Unit = js.native
  def insertAfter(newNodeText: js.Any, target: String): Unit = js.native
  def insertAfter(newNodeText: js.Any, target: js.Any): Unit = js.native
  /** To add a Node or collection of nodes before the particular TreeView node.
    * @param {string|any} New node text or JSON object
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @returns {void}
    */
  def insertBefore(newNodeText: String, target: String): Unit = js.native
  def insertBefore(newNodeText: String, target: js.Any): Unit = js.native
  def insertBefore(newNodeText: js.Any, target: String): Unit = js.native
  def insertBefore(newNodeText: js.Any, target: js.Any): Unit = js.native
  /** To check whether the child nodes are loaded of the given TreeView node.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @returns {boolean}
    */
  def isChildLoaded(element: String): Boolean = js.native
  def isChildLoaded(element: js.Any): Boolean = js.native
  /** To check the given TreeView node is disabled or enabled.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @returns {boolean}
    */
  def isDisabled(element: String): Boolean = js.native
  def isDisabled(element: js.Any): Boolean = js.native
  /** To check the given node is exist in TreeView.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @returns {boolean}
    */
  def isExist(element: String): Boolean = js.native
  def isExist(element: js.Any): Boolean = js.native
  /** To get the expand status of the given TreeView node.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @returns {boolean}
    */
  def isExpanded(element: String): Boolean = js.native
  def isExpanded(element: js.Any): Boolean = js.native
  /** To check the given TreeView node is checked or unchecked.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @returns {boolean}
    */
  def isNodeChecked(element: String): Boolean = js.native
  def isNodeChecked(element: js.Any): Boolean = js.native
  /** To get the select status of the given TreeView node.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @returns {boolean}
    */
  def isSelected(element: String): Boolean = js.native
  def isSelected(element: js.Any): Boolean = js.native
  /** To get the visibility status of the given TreeView node.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @returns {boolean}
    */
  def isVisible(element: String): Boolean = js.native
  def isVisible(element: js.Any): Boolean = js.native
  /** To load the TreeView nodes from the particular URL. If target tree node is specified, then the given nodes are added as child of target tree node, otherwise nodes are added in
    * TreeView.
    * @param {string} URL location, the data returned from the URL will be loaded in TreeView
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @returns {void}
    */
  def loadData(URL: String, target: String): Unit = js.native
  def loadData(URL: String, target: js.Any): Unit = js.native
  /** To move the TreeView node with in same TreeView. The new position of given TreeView node will be based on destination node and index position.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @param {number} New index position of given source node
    * @returns {void}
    */
  def moveNode(sourceNode: String, destinationNode: String, index: Double): Unit = js.native
  def moveNode(sourceNode: String, destinationNode: js.Any, index: Double): Unit = js.native
  def moveNode(sourceNode: js.Any, destinationNode: String, index: Double): Unit = js.native
  def moveNode(sourceNode: js.Any, destinationNode: js.Any, index: Double): Unit = js.native
  /** To refresh the TreeView
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** To remove all the nodes in TreeView.
    * @returns {void}
    */
  def removeAll(): Unit = js.native
  /** To remove a node in TreeView.
    * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
    * @returns {void}
    */
  def removeNode(element: String): Unit = js.native
  def removeNode(element: js.Any): Unit = js.native
  def removeNode(element: js.Array[_]): Unit = js.native
  /** To select all the TreeView nodes when enable allowMultiSelection property.
    * @returns {void}
    */
  def selectAll(): Unit = js.native
  /** This method is used to select a node in TreeView control. If you want to select the collection of nodes in TreeView control then we need to enable allowMultiSelection property.
    * @param {string|any|any[]} ID of TreeView node/object of TreeView node/ collection of ID/object of TreeView nodes
    * @returns {void}
    */
  def selectNode(element: String): Unit = js.native
  def selectNode(element: js.Any): Unit = js.native
  def selectNode(element: js.Array[_]): Unit = js.native
  /** To show nodes in TreeView.
    * @returns {void}
    */
  def show(): Unit = js.native
  /** To show a node in TreeView.
    * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
    * @returns {void}
    */
  def showNode(element: String): Unit = js.native
  def showNode(element: js.Any): Unit = js.native
  def showNode(element: js.Array[_]): Unit = js.native
  /** To uncheck all the nodes in TreeView.
    * @returns {void}
    */
  def unCheckAll(): Unit = js.native
  /** To uncheck a node in TreeView.
    * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
    * @returns {void}
    */
  def uncheckNode(element: String): Unit = js.native
  def uncheckNode(element: js.Any): Unit = js.native
  def uncheckNode(element: js.Array[_]): Unit = js.native
  /** To unselect all the TreeView nodes when enable allowMultiSelection property.
    * @returns {void}
    */
  def unselectAll(): Unit = js.native
  /** This method is used to unselect a node in TreeView control. If you want to unselect the collection of nodes in TreeView control then we need to enable allowMultiSelection property.
    * @param {string|any|any[]} ID of TreeView node/object of TreeView node/ collection of ID/object of TreeView nodes
    * @returns {void}
    */
  def unselectNode(element: String): Unit = js.native
  def unselectNode(element: js.Any): Unit = js.native
  def unselectNode(element: js.Array[_]): Unit = js.native
  /** To edit or update the text of the TreeView node.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @param {string} New text
    * @returns {void}
    */
  def updateText(target: String, newText: String): Unit = js.native
  def updateText(target: js.Any, newText: String): Unit = js.native
}

/* static members */
@JSGlobal("ej.TreeView")
@js.native
object TreeView extends js.Object {
  var Locale: js.Any = js.native
  var fn: TreeView = js.native
}

