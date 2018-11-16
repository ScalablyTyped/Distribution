package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.TreeView")
@js.native
class TreeView protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.TreeViewNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.TreeViewNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.TreeViewNs.Model = js.native
  @JSName("model")
  var model_TreeView: ejDotWebDotAllLib.ejNs.TreeViewNs.Model = js.native
  /** To add a Node or collection of nodes in TreeView. If target tree node is specified, then the given nodes are added as child of target tree node, otherwise nodes are added in
           * TreeView.
           * @param {string|any} New node text or JSON object
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {boolean} Parent node will be prevented from auto expanding
           * @returns {void}
           */
  def addNode(newNodeText: java.lang.String, target: java.lang.String, preventTargetExpand: scala.Boolean): scala.Unit = js.native
  /** To add a Node or collection of nodes in TreeView. If target tree node is specified, then the given nodes are added as child of target tree node, otherwise nodes are added in
           * TreeView.
           * @param {string|any} New node text or JSON object
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {boolean} Parent node will be prevented from auto expanding
           * @returns {void}
           */
  def addNode(newNodeText: java.lang.String, target: js.Any, preventTargetExpand: scala.Boolean): scala.Unit = js.native
  /** To add a Node or collection of nodes in TreeView. If target tree node is specified, then the given nodes are added as child of target tree node, otherwise nodes are added in
           * TreeView.
           * @param {string|any} New node text or JSON object
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {boolean} Parent node will be prevented from auto expanding
           * @returns {void}
           */
  def addNode(newNodeText: js.Any, target: java.lang.String, preventTargetExpand: scala.Boolean): scala.Unit = js.native
  /** To add a Node or collection of nodes in TreeView. If target tree node is specified, then the given nodes are added as child of target tree node, otherwise nodes are added in
           * TreeView.
           * @param {string|any} New node text or JSON object
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {boolean} Parent node will be prevented from auto expanding
           * @returns {void}
           */
  def addNode(newNodeText: js.Any, target: js.Any, preventTargetExpand: scala.Boolean): scala.Unit = js.native
  /** To add a collection of nodes in TreeView. If target tree node is specified, then the given nodes are added as child of target tree node, otherwise nodes are added in TreeView.
           * @param {any|any[]} New node details in JSON object
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {boolean} Parent node will be prevented from auto expanding
           * @returns {void}
           */
  def addNodes(collection: js.Any, target: java.lang.String, preventTargetExpand: scala.Boolean): scala.Unit = js.native
  /** To add a collection of nodes in TreeView. If target tree node is specified, then the given nodes are added as child of target tree node, otherwise nodes are added in TreeView.
           * @param {any|any[]} New node details in JSON object
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {boolean} Parent node will be prevented from auto expanding
           * @returns {void}
           */
  def addNodes(collection: js.Any, target: js.Any, preventTargetExpand: scala.Boolean): scala.Unit = js.native
  /** To add a collection of nodes in TreeView. If target tree node is specified, then the given nodes are added as child of target tree node, otherwise nodes are added in TreeView.
           * @param {any|any[]} New node details in JSON object
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {boolean} Parent node will be prevented from auto expanding
           * @returns {void}
           */
  def addNodes(collection: js.Array[_], target: java.lang.String, preventTargetExpand: scala.Boolean): scala.Unit = js.native
  /** To add a collection of nodes in TreeView. If target tree node is specified, then the given nodes are added as child of target tree node, otherwise nodes are added in TreeView.
           * @param {any|any[]} New node details in JSON object
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {boolean} Parent node will be prevented from auto expanding
           * @returns {void}
           */
  def addNodes(collection: js.Array[_], target: js.Any, preventTargetExpand: scala.Boolean): scala.Unit = js.native
  /** To check all the nodes in TreeView.
           * @returns {void}
           */
  def checkAll(): scala.Unit = js.native
  /** To check a node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def checkNode(element: java.lang.String): scala.Unit = js.native
  /** To check a node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def checkNode(element: js.Any): scala.Unit = js.native
  /** To check a node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def checkNode(element: js.Array[_]): scala.Unit = js.native
  /** This method is used to collapse all nodes in TreeView control. If you want to collapse all nodes up to the specific level in TreeView control then we need to pass levelUntil as
           * argument to this method.
           * @param {number} TreeView nodes will collapse until the given level
           * @param {boolean} Weather exclude the hidden nodes of TreeView while collapse all nodes
           * @returns {void}
           */
  def collapseAll(): scala.Unit = js.native
  /** This method is used to collapse all nodes in TreeView control. If you want to collapse all nodes up to the specific level in TreeView control then we need to pass levelUntil as
           * argument to this method.
           * @param {number} TreeView nodes will collapse until the given level
           * @param {boolean} Weather exclude the hidden nodes of TreeView while collapse all nodes
           * @returns {void}
           */
  def collapseAll(levelUntil: scala.Double): scala.Unit = js.native
  /** This method is used to collapse all nodes in TreeView control. If you want to collapse all nodes up to the specific level in TreeView control then we need to pass levelUntil as
           * argument to this method.
           * @param {number} TreeView nodes will collapse until the given level
           * @param {boolean} Weather exclude the hidden nodes of TreeView while collapse all nodes
           * @returns {void}
           */
  def collapseAll(levelUntil: scala.Double, excludeHiddenNodes: scala.Boolean): scala.Unit = js.native
  /** To collapse a particular node in TreeView.
           * @param {string|any|any[]} ID of TreeView node|object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def collapseNode(element: java.lang.String): scala.Unit = js.native
  /** To collapse a particular node in TreeView.
           * @param {string|any|any[]} ID of TreeView node|object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def collapseNode(element: js.Any): scala.Unit = js.native
  /** To collapse a particular node in TreeView.
           * @param {string|any|any[]} ID of TreeView node|object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def collapseNode(element: js.Array[_]): scala.Unit = js.native
  /** To disable the node in the TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def disableNode(element: java.lang.String): scala.Unit = js.native
  /** To disable the node in the TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def disableNode(element: js.Any): scala.Unit = js.native
  /** To disable the node in the TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def disableNode(element: js.Array[_]): scala.Unit = js.native
  /** To enable the node in the TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def enableNode(element: java.lang.String): scala.Unit = js.native
  /** To enable the node in the TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def enableNode(element: js.Any): scala.Unit = js.native
  /** To enable the node in the TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def enableNode(element: js.Array[_]): scala.Unit = js.native
  /** To ensure that the TreeView node is visible in the TreeView. This method is useful if we need select a TreeView node dynamically.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def ensureVisible(element: java.lang.String): scala.Boolean = js.native
  /** To ensure that the TreeView node is visible in the TreeView. This method is useful if we need select a TreeView node dynamically.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def ensureVisible(element: js.Any): scala.Boolean = js.native
  /** This method is used to expand all nodes in TreeView control. If you want to expand all nodes up to the specific level in TreeView control then we need to pass levelUntil as
           * argument to this method.
           * @param {number} TreeView nodes will expand until the given level
           * @param {boolean} Weather exclude the hidden nodes of TreeView while expand all nodes
           * @returns {void}
           */
  def expandAll(): scala.Unit = js.native
  /** This method is used to expand all nodes in TreeView control. If you want to expand all nodes up to the specific level in TreeView control then we need to pass levelUntil as
           * argument to this method.
           * @param {number} TreeView nodes will expand until the given level
           * @param {boolean} Weather exclude the hidden nodes of TreeView while expand all nodes
           * @returns {void}
           */
  def expandAll(levelUntil: scala.Double): scala.Unit = js.native
  /** This method is used to expand all nodes in TreeView control. If you want to expand all nodes up to the specific level in TreeView control then we need to pass levelUntil as
           * argument to this method.
           * @param {number} TreeView nodes will expand until the given level
           * @param {boolean} Weather exclude the hidden nodes of TreeView while expand all nodes
           * @returns {void}
           */
  def expandAll(levelUntil: scala.Double, excludeHiddenNodes: scala.Boolean): scala.Unit = js.native
  /** To expandNode particular node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def expandNode(element: java.lang.String): scala.Unit = js.native
  /** To expandNode particular node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def expandNode(element: js.Any): scala.Unit = js.native
  /** To expandNode particular node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def expandNode(element: js.Array[_]): scala.Unit = js.native
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
  def getChildren(element: java.lang.String): js.Array[_] = js.native
  /** This method is used to get immediate child nodes of a node in TreeView control. If you want to get the all child nodes include nested child nodes then we need to pass
           * includeNestedChild as true along with element arguments to this method.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {boolean} Weather include nested child nodes of TreeView node
           * @returns {any[]}
           */
  def getChildren(element: java.lang.String, includeNestedChild: scala.Boolean): js.Array[_] = js.native
  /** This method is used to get immediate child nodes of a node in TreeView control. If you want to get the all child nodes include nested child nodes then we need to pass
           * includeNestedChild as true along with element arguments to this method.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {boolean} Weather include nested child nodes of TreeView node
           * @returns {any[]}
           */
  def getChildren(element: js.Any): js.Array[_] = js.native
  /** This method is used to get immediate child nodes of a node in TreeView control. If you want to get the all child nodes include nested child nodes then we need to pass
           * includeNestedChild as true along with element arguments to this method.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {boolean} Weather include nested child nodes of TreeView node
           * @returns {any[]}
           */
  def getChildren(element: js.Any, includeNestedChild: scala.Boolean): js.Array[_] = js.native
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
  def getNode(element: java.lang.String): js.Any = js.native
  /** To get TreeView node data such as id, text, parentId, selected, checked, expanded, level, childes and index.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {any}
           */
  def getNode(element: js.Any): js.Any = js.native
  /** To get TreeView node by using index position in TreeView.
           * @param {number} Index position of TreeView node
           * @returns {any}
           */
  def getNodeByIndex(index: scala.Double): js.Any = js.native
  /** To get number of nodes in TreeView.
           * @returns {number}
           */
  def getNodeCount(): scala.Double = js.native
  /** To get current index position of TreeView node.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {number}
           */
  def getNodeIndex(element: java.lang.String): scala.Double = js.native
  /** To get current index position of TreeView node.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {number}
           */
  def getNodeIndex(element: js.Any): scala.Double = js.native
  /** To get immediate parent TreeView node of particular TreeView node.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {any}
           */
  def getParent(element: java.lang.String): js.Any = js.native
  /** To get immediate parent TreeView node of particular TreeView node.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {any}
           */
  def getParent(element: js.Any): js.Any = js.native
  /** To get the currently selected node in TreeView.
           * @returns {any}
           */
  def getSelectedNode(): js.Any = js.native
  /** To get the index position of currently selected node in TreeView.
           * @returns {number}
           */
  def getSelectedNodeIndex(): scala.Double = js.native
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
  def getText(element: java.lang.String): java.lang.String = js.native
  /** To get the text of a node in TreeView.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {string}
           */
  def getText(element: js.Any): java.lang.String = js.native
  /** To get the updated datasource of TreeView after performing some operation like drag and drop, node editing, adding and removing node.
           * @param {string|number} ID of TreeView node
           * @returns {any[]}
           */
  def getTreeData(): js.Array[_] = js.native
  /** To get the updated datasource of TreeView after performing some operation like drag and drop, node editing, adding and removing node.
           * @param {string|number} ID of TreeView node
           * @returns {any[]}
           */
  def getTreeData(id: java.lang.String): js.Array[_] = js.native
  /** To get the updated datasource of TreeView after performing some operation like drag and drop, node editing, adding and removing node.
           * @param {string|number} ID of TreeView node
           * @returns {any[]}
           */
  def getTreeData(id: scala.Double): js.Array[_] = js.native
  /** To get currently visible nodes in TreeView.
           * @returns {any}
           */
  def getVisibleNodes(): js.Any = js.native
  /** To check a node having child or not.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def hasChildNode(element: java.lang.String): scala.Boolean = js.native
  /** To check a node having child or not.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def hasChildNode(element: js.Any): scala.Boolean = js.native
  /** To show nodes in TreeView.
           * @returns {void}
           */
  def hide(): scala.Unit = js.native
  /** To hide particular node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def hideNode(element: java.lang.String): scala.Unit = js.native
  /** To hide particular node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def hideNode(element: js.Any): scala.Unit = js.native
  /** To hide particular node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def hideNode(element: js.Array[_]): scala.Unit = js.native
  /** To add a Node or collection of nodes after the particular TreeView node.
           * @param {string|any} New node text or JSON object
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {void}
           */
  def insertAfter(newNodeText: java.lang.String, target: java.lang.String): scala.Unit = js.native
  /** To add a Node or collection of nodes after the particular TreeView node.
           * @param {string|any} New node text or JSON object
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {void}
           */
  def insertAfter(newNodeText: java.lang.String, target: js.Any): scala.Unit = js.native
  /** To add a Node or collection of nodes after the particular TreeView node.
           * @param {string|any} New node text or JSON object
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {void}
           */
  def insertAfter(newNodeText: js.Any, target: java.lang.String): scala.Unit = js.native
  /** To add a Node or collection of nodes after the particular TreeView node.
           * @param {string|any} New node text or JSON object
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {void}
           */
  def insertAfter(newNodeText: js.Any, target: js.Any): scala.Unit = js.native
  /** To add a Node or collection of nodes before the particular TreeView node.
           * @param {string|any} New node text or JSON object
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {void}
           */
  def insertBefore(newNodeText: java.lang.String, target: java.lang.String): scala.Unit = js.native
  /** To add a Node or collection of nodes before the particular TreeView node.
           * @param {string|any} New node text or JSON object
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {void}
           */
  def insertBefore(newNodeText: java.lang.String, target: js.Any): scala.Unit = js.native
  /** To add a Node or collection of nodes before the particular TreeView node.
           * @param {string|any} New node text or JSON object
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {void}
           */
  def insertBefore(newNodeText: js.Any, target: java.lang.String): scala.Unit = js.native
  /** To add a Node or collection of nodes before the particular TreeView node.
           * @param {string|any} New node text or JSON object
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {void}
           */
  def insertBefore(newNodeText: js.Any, target: js.Any): scala.Unit = js.native
  /** To check whether the child nodes are loaded of the given TreeView node.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def isChildLoaded(element: java.lang.String): scala.Boolean = js.native
  /** To check whether the child nodes are loaded of the given TreeView node.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def isChildLoaded(element: js.Any): scala.Boolean = js.native
  /** To check the given TreeView node is disabled or enabled.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def isDisabled(element: java.lang.String): scala.Boolean = js.native
  /** To check the given TreeView node is disabled or enabled.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def isDisabled(element: js.Any): scala.Boolean = js.native
  /** To check the given node is exist in TreeView.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def isExist(element: java.lang.String): scala.Boolean = js.native
  /** To check the given node is exist in TreeView.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def isExist(element: js.Any): scala.Boolean = js.native
  /** To get the expand status of the given TreeView node.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def isExpanded(element: java.lang.String): scala.Boolean = js.native
  /** To get the expand status of the given TreeView node.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def isExpanded(element: js.Any): scala.Boolean = js.native
  /** To check the given TreeView node is checked or unchecked.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def isNodeChecked(element: java.lang.String): scala.Boolean = js.native
  /** To check the given TreeView node is checked or unchecked.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def isNodeChecked(element: js.Any): scala.Boolean = js.native
  /** To get the select status of the given TreeView node.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def isSelected(element: java.lang.String): scala.Boolean = js.native
  /** To get the select status of the given TreeView node.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def isSelected(element: js.Any): scala.Boolean = js.native
  /** To get the visibility status of the given TreeView node.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def isVisible(element: java.lang.String): scala.Boolean = js.native
  /** To get the visibility status of the given TreeView node.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {boolean}
           */
  def isVisible(element: js.Any): scala.Boolean = js.native
  /** To load the TreeView nodes from the particular URL. If target tree node is specified, then the given nodes are added as child of target tree node, otherwise nodes are added in
           * TreeView.
           * @param {string} URL location, the data returned from the URL will be loaded in TreeView
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {void}
           */
  def loadData(URL: java.lang.String, target: java.lang.String): scala.Unit = js.native
  /** To load the TreeView nodes from the particular URL. If target tree node is specified, then the given nodes are added as child of target tree node, otherwise nodes are added in
           * TreeView.
           * @param {string} URL location, the data returned from the URL will be loaded in TreeView
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @returns {void}
           */
  def loadData(URL: java.lang.String, target: js.Any): scala.Unit = js.native
  /** To move the TreeView node with in same TreeView. The new position of given TreeView node will be based on destination node and index position.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {number} New index position of given source node
           * @returns {void}
           */
  def moveNode(sourceNode: java.lang.String, destinationNode: java.lang.String, index: scala.Double): scala.Unit = js.native
  /** To move the TreeView node with in same TreeView. The new position of given TreeView node will be based on destination node and index position.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {number} New index position of given source node
           * @returns {void}
           */
  def moveNode(sourceNode: java.lang.String, destinationNode: js.Any, index: scala.Double): scala.Unit = js.native
  /** To move the TreeView node with in same TreeView. The new position of given TreeView node will be based on destination node and index position.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {number} New index position of given source node
           * @returns {void}
           */
  def moveNode(sourceNode: js.Any, destinationNode: java.lang.String, index: scala.Double): scala.Unit = js.native
  /** To move the TreeView node with in same TreeView. The new position of given TreeView node will be based on destination node and index position.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {number} New index position of given source node
           * @returns {void}
           */
  def moveNode(sourceNode: js.Any, destinationNode: js.Any, index: scala.Double): scala.Unit = js.native
  /** To refresh the TreeView
           * @returns {void}
           */
  def refresh(): scala.Unit = js.native
  /** To remove all the nodes in TreeView.
           * @returns {void}
           */
  def removeAll(): scala.Unit = js.native
  /** To remove a node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def removeNode(element: java.lang.String): scala.Unit = js.native
  /** To remove a node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def removeNode(element: js.Any): scala.Unit = js.native
  /** To remove a node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def removeNode(element: js.Array[_]): scala.Unit = js.native
  /** To select all the TreeView nodes when enable allowMultiSelection property.
           * @returns {void}
           */
  def selectAll(): scala.Unit = js.native
  /** This method is used to select a node in TreeView control. If you want to select the collection of nodes in TreeView control then we need to enable allowMultiSelection property.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/ collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def selectNode(element: java.lang.String): scala.Unit = js.native
  /** This method is used to select a node in TreeView control. If you want to select the collection of nodes in TreeView control then we need to enable allowMultiSelection property.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/ collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def selectNode(element: js.Any): scala.Unit = js.native
  /** This method is used to select a node in TreeView control. If you want to select the collection of nodes in TreeView control then we need to enable allowMultiSelection property.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/ collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def selectNode(element: js.Array[_]): scala.Unit = js.native
  /** To show nodes in TreeView.
           * @returns {void}
           */
  def show(): scala.Unit = js.native
  /** To show a node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def showNode(element: java.lang.String): scala.Unit = js.native
  /** To show a node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def showNode(element: js.Any): scala.Unit = js.native
  /** To show a node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def showNode(element: js.Array[_]): scala.Unit = js.native
  /** To uncheck all the nodes in TreeView.
           * @returns {void}
           */
  def unCheckAll(): scala.Unit = js.native
  /** To uncheck a node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def uncheckNode(element: java.lang.String): scala.Unit = js.native
  /** To uncheck a node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def uncheckNode(element: js.Any): scala.Unit = js.native
  /** To uncheck a node in TreeView.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def uncheckNode(element: js.Array[_]): scala.Unit = js.native
  /** To unselect all the TreeView nodes when enable allowMultiSelection property.
           * @returns {void}
           */
  def unselectAll(): scala.Unit = js.native
  /** This method is used to unselect a node in TreeView control. If you want to unselect the collection of nodes in TreeView control then we need to enable allowMultiSelection property.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/ collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def unselectNode(element: java.lang.String): scala.Unit = js.native
  /** This method is used to unselect a node in TreeView control. If you want to unselect the collection of nodes in TreeView control then we need to enable allowMultiSelection property.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/ collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def unselectNode(element: js.Any): scala.Unit = js.native
  /** This method is used to unselect a node in TreeView control. If you want to unselect the collection of nodes in TreeView control then we need to enable allowMultiSelection property.
           * @param {string|any|any[]} ID of TreeView node/object of TreeView node/ collection of ID/object of TreeView nodes
           * @returns {void}
           */
  def unselectNode(element: js.Array[_]): scala.Unit = js.native
  /** To edit or update the text of the TreeView node.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {string} New text
           * @returns {void}
           */
  def updateText(target: java.lang.String, newText: java.lang.String): scala.Unit = js.native
  /** To edit or update the text of the TreeView node.
           * @param {string|any} ID of TreeView node/object of TreeView node
           * @param {string} New text
           * @returns {void}
           */
  def updateText(target: js.Any, newText: java.lang.String): scala.Unit = js.native
}

@JSGlobal("ej.TreeView")
@js.native
object TreeView extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.TreeView = js.native
}

