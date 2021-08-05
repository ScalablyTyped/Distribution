package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeView
  extends StObject
     with Widget_ {
  
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
  def addNodes(collection: js.Array[js.Any], target: String, preventTargetExpand: Boolean): Unit = js.native
  def addNodes(collection: js.Array[js.Any], target: js.Any, preventTargetExpand: Boolean): Unit = js.native
  
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
  def checkNode(element: js.Array[js.Any]): Unit = js.native
  
  /** This method is used to collapse all nodes in TreeView control. If you want to collapse all nodes up to the specific level in TreeView control then we need to pass levelUntil as
    * argument to this method.
    * @param {number} TreeView nodes will collapse until the given level
    * @param {boolean} Weather exclude the hidden nodes of TreeView while collapse all nodes
    * @returns {void}
    */
  def collapseAll(): Unit = js.native
  def collapseAll(levelUntil: Double): Unit = js.native
  def collapseAll(levelUntil: Double, excludeHiddenNodes: Boolean): Unit = js.native
  def collapseAll(levelUntil: Unit, excludeHiddenNodes: Boolean): Unit = js.native
  
  /** To collapse a particular node in TreeView.
    * @param {string|any|any[]} ID of TreeView node|object of TreeView node/collection of ID/object of TreeView nodes
    * @returns {void}
    */
  def collapseNode(element: String): Unit = js.native
  def collapseNode(element: js.Any): Unit = js.native
  def collapseNode(element: js.Array[js.Any]): Unit = js.native
  
  var defaults: Model = js.native
  
  /** To disable the node in the TreeView.
    * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
    * @returns {void}
    */
  def disableNode(element: String): Unit = js.native
  def disableNode(element: js.Any): Unit = js.native
  def disableNode(element: js.Array[js.Any]): Unit = js.native
  
  /** To enable the node in the TreeView.
    * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
    * @returns {void}
    */
  def enableNode(element: String): Unit = js.native
  def enableNode(element: js.Any): Unit = js.native
  def enableNode(element: js.Array[js.Any]): Unit = js.native
  
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
  def expandAll(levelUntil: Unit, excludeHiddenNodes: Boolean): Unit = js.native
  
  /** To expandNode particular node in TreeView.
    * @param {string|any|any[]} ID of TreeView node/object of TreeView node/collection of ID/object of TreeView nodes
    * @returns {void}
    */
  def expandNode(element: String): Unit = js.native
  def expandNode(element: js.Any): Unit = js.native
  def expandNode(element: js.Array[js.Any]): Unit = js.native
  
  /** To get currently checked nodes in TreeView.
    * @returns {any}
    */
  def getCheckedNodes(): js.Any = js.native
  
  /** To get currently checked nodes indexes in TreeView.
    * @returns {any[]}
    */
  def getCheckedNodesIndex(): js.Array[js.Any] = js.native
  
  /** This method is used to get immediate child nodes of a node in TreeView control. If you want to get the all child nodes include nested child nodes then we need to pass
    * includeNestedChild as true along with element arguments to this method.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @param {boolean} Weather include nested child nodes of TreeView node
    * @returns {any[]}
    */
  def getChildren(element: String): js.Array[js.Any] = js.native
  def getChildren(element: String, includeNestedChild: Boolean): js.Array[js.Any] = js.native
  def getChildren(element: js.Any): js.Array[js.Any] = js.native
  def getChildren(element: js.Any, includeNestedChild: Boolean): js.Array[js.Any] = js.native
  
  /** To get currently expanded nodes in TreeView.
    * @returns {any}
    */
  def getExpandedNodes(): js.Any = js.native
  
  /** To get currently expanded nodes indexes in TreeView.
    * @returns {any[]}
    */
  def getExpandedNodesIndex(): js.Array[js.Any] = js.native
  
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
  def getSelectedNodes(): js.Array[js.Any] = js.native
  
  /** To get the index positions of currently selected nodes in TreeView.
    * @returns {any[]}
    */
  def getSelectedNodesIndex(): js.Array[js.Any] = js.native
  
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
  def getTreeData(): js.Array[js.Any] = js.native
  def getTreeData(id: String): js.Array[js.Any] = js.native
  def getTreeData(id: Double): js.Array[js.Any] = js.native
  
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
  def hideNode(element: js.Array[js.Any]): Unit = js.native
  
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
  
  @JSName("model")
  var model_TreeView: Model = js.native
  
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
  def removeNode(element: js.Array[js.Any]): Unit = js.native
  
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
  def selectNode(element: js.Array[js.Any]): Unit = js.native
  
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
  def showNode(element: js.Array[js.Any]): Unit = js.native
  
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
  def uncheckNode(element: js.Array[js.Any]): Unit = js.native
  
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
  def unselectNode(element: js.Array[js.Any]): Unit = js.native
  
  /** To edit or update the text of the TreeView node.
    * @param {string|any} ID of TreeView node/object of TreeView node
    * @param {string} New text
    * @returns {void}
    */
  def updateText(target: String, newText: String): Unit = js.native
  def updateText(target: js.Any, newText: String): Unit = js.native
}
object TreeView {
  
  trait BeforeAddEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the given new node data
      */
    var data: js.UndefOr[String | js.Any] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the given parent node details
      */
    var parentDetails: js.UndefOr[js.Any] = js.undefined
    
    /** returns the parent element, the given new nodes to be appended to the given parent element
      */
    var targetParent: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeAddEventArgs {
    
    inline def apply(): BeforeAddEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeAddEventArgs]
    }
    
    extension [Self <: BeforeAddEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String | js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentDetails(value: js.Any): Self = StObject.set(x, "parentDetails", value.asInstanceOf[js.Any])
      
      inline def setParentDetailsUndefined: Self = StObject.set(x, "parentDetails", js.undefined)
      
      inline def setTargetParent(value: js.Any): Self = StObject.set(x, "targetParent", value.asInstanceOf[js.Any])
      
      inline def setTargetParentUndefined: Self = StObject.set(x, "targetParent", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeCollapseEventArgs extends StObject {
    
    /** returns the format asynchronous or synchronous
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the id of currently clicked node
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** returns the child nodes are loaded or not
      */
    var isChildLoaded: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the parent id of currently clicked node
      */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object BeforeCollapseEventArgs {
    
    inline def apply(): BeforeCollapseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeCollapseEventArgs]
    }
    
    extension [Self <: BeforeCollapseEventArgs](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      inline def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsChildLoaded(value: Boolean): Self = StObject.set(x, "isChildLoaded", value.asInstanceOf[js.Any])
      
      inline def setIsChildLoadedUndefined: Self = StObject.set(x, "isChildLoaded", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait BeforeCutEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.undefined
    
    /** returns the key pressed key code value
      */
    var keyCode: js.UndefOr[Double] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the given target node values
      */
    var nodeDetails: js.UndefOr[js.Any] = js.undefined
    
    /** returns the target element, the given node to be cut
      */
    var target: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeCutEventArgs {
    
    inline def apply(): BeforeCutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeCutEventArgs]
    }
    
    extension [Self <: BeforeCutEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setNodeDetails(value: js.Any): Self = StObject.set(x, "nodeDetails", value.asInstanceOf[js.Any])
      
      inline def setNodeDetailsUndefined: Self = StObject.set(x, "nodeDetails", js.undefined)
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeDeleteEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the given target node values
      */
    var nodeDetails: js.UndefOr[js.Any] = js.undefined
    
    /** returns the parent node values
      */
    var parentDetails: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current parent element of the target node
      */
    var parentElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the currently removed nodes
      */
    var removedNodes: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** returns the target element, the given node to be deleted
      */
    var target: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeDeleteEventArgs {
    
    inline def apply(): BeforeDeleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeDeleteEventArgs]
    }
    
    extension [Self <: BeforeDeleteEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setNodeDetails(value: js.Any): Self = StObject.set(x, "nodeDetails", value.asInstanceOf[js.Any])
      
      inline def setNodeDetailsUndefined: Self = StObject.set(x, "nodeDetails", js.undefined)
      
      inline def setParentDetails(value: js.Any): Self = StObject.set(x, "parentDetails", value.asInstanceOf[js.Any])
      
      inline def setParentDetailsUndefined: Self = StObject.set(x, "parentDetails", js.undefined)
      
      inline def setParentElement(value: js.Any): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      inline def setParentElementUndefined: Self = StObject.set(x, "parentElement", js.undefined)
      
      inline def setRemovedNodes(value: js.Array[js.Any]): Self = StObject.set(x, "removedNodes", value.asInstanceOf[js.Any])
      
      inline def setRemovedNodesUndefined: Self = StObject.set(x, "removedNodes", js.undefined)
      
      inline def setRemovedNodesVarargs(value: js.Any*): Self = StObject.set(x, "removedNodes", js.Array(value :_*))
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeEditEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeEditEventArgs {
    
    inline def apply(): BeforeEditEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeEditEventArgs]
    }
    
    extension [Self <: BeforeEditEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      inline def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeExpandEventArgs extends StObject {
    
    /** returns the format asynchronous or synchronous
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the id of currently clicked node
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** if the child node is ready to expanded state; otherwise, false.
      */
    var isChildLoaded: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the parent id of currently clicked node
      */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object BeforeExpandEventArgs {
    
    inline def apply(): BeforeExpandEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeExpandEventArgs]
    }
    
    extension [Self <: BeforeExpandEventArgs](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      inline def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsChildLoaded(value: Boolean): Self = StObject.set(x, "isChildLoaded", value.asInstanceOf[js.Any])
      
      inline def setIsChildLoadedUndefined: Self = StObject.set(x, "isChildLoaded", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait BeforeLoadEventArgs extends StObject {
    
    /** returns the AJAX settings object
      */
    var AjaxOptions: js.UndefOr[js.Any] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeLoadEventArgs {
    
    inline def apply(): BeforeLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeLoadEventArgs]
    }
    
    extension [Self <: BeforeLoadEventArgs](x: Self) {
      
      inline def setAjaxOptions(value: js.Any): Self = StObject.set(x, "AjaxOptions", value.asInstanceOf[js.Any])
      
      inline def setAjaxOptionsUndefined: Self = StObject.set(x, "AjaxOptions", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforePasteEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.undefined
    
    /** returns the key pressed key code value
      */
    var keyCode: js.UndefOr[Double] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the given target node values
      */
    var nodeDetails: js.UndefOr[js.Any] = js.undefined
    
    /** returns the target element, the given node to be pasted
      */
    var target: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforePasteEventArgs {
    
    inline def apply(): BeforePasteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforePasteEventArgs]
    }
    
    extension [Self <: BeforePasteEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setNodeDetails(value: js.Any): Self = StObject.set(x, "nodeDetails", value.asInstanceOf[js.Any])
      
      inline def setNodeDetailsUndefined: Self = StObject.set(x, "nodeDetails", js.undefined)
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeSelectEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the given target node values
      */
    var nodeDetails: js.UndefOr[js.Any] = js.undefined
    
    /** returns the target element, the given node to be selected
      */
    var target: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeSelectEventArgs {
    
    inline def apply(): BeforeSelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeSelectEventArgs]
    }
    
    extension [Self <: BeforeSelectEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setNodeDetails(value: js.Any): Self = StObject.set(x, "nodeDetails", value.asInstanceOf[js.Any])
      
      inline def setNodeDetailsUndefined: Self = StObject.set(x, "nodeDetails", js.undefined)
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    extension [Self <: CreateEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    extension [Self <: DestroyEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    /** It receives the child level or inner level data source such as Essential DataManager object and JSON object.
      */
    var child: js.UndefOr[js.Any] = js.undefined
    
    /** It receives Essential DataManager object and JSON object.
      */
    var dataSource: js.UndefOr[js.Any] = js.undefined
    
    /** Specifies the node to be in expanded state.
      */
    var expanded: js.UndefOr[String] = js.undefined
    
    /** Its allow us to indicate whether the node has child or not in load on demand
      */
    var hasChild: js.UndefOr[String] = js.undefined
    
    /** Specifies the HTML Attributes to &quot;li&quot; item list.
      */
    var htmlAttribute: js.UndefOr[js.Any] = js.undefined
    
    /** Specifies the id to TreeView node items list.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Specifies the image attribute to â€œimgâ€ tag inside items list
      */
    var imageAttribute: js.UndefOr[js.Any] = js.undefined
    
    /** Specifies the HTML Attributes to &quot;li&quot; item list.
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** If its true Checkbox node will be checked when rendered with checkbox.
      */
    var isChecked: js.UndefOr[String] = js.undefined
    
    /** Specifies the link attribute to â€œaâ€ tag in item list.
      */
    var linkAttribute: js.UndefOr[js.Any] = js.undefined
    
    /** Specifies the parent id of the node. The nodes are listed as child nodes of the specified parent node by using its parent id.
      */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** It receives query to retrieve data from the table (query is same as SQL).
      */
    var query: js.UndefOr[js.Any] = js.undefined
    
    /** Allow us to specify the node to be in selected state
      */
    var selected: js.UndefOr[String] = js.undefined
    
    /** Specifies the sprite CSS class to &quot;li&quot; item list.
      */
    var spriteCssClass: js.UndefOr[String] = js.undefined
    
    /** It receives the table name to execute query on the corresponding table.
      */
    var tableName: js.UndefOr[String] = js.undefined
    
    /** Specifies the text of TreeView node items list.
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object Fields {
    
    inline def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setChild(value: js.Any): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setExpanded(value: String): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setHasChild(value: String): Self = StObject.set(x, "hasChild", value.asInstanceOf[js.Any])
      
      inline def setHasChildUndefined: Self = StObject.set(x, "hasChild", js.undefined)
      
      inline def setHtmlAttribute(value: js.Any): Self = StObject.set(x, "htmlAttribute", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributeUndefined: Self = StObject.set(x, "htmlAttribute", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImageAttribute(value: js.Any): Self = StObject.set(x, "imageAttribute", value.asInstanceOf[js.Any])
      
      inline def setImageAttributeUndefined: Self = StObject.set(x, "imageAttribute", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setIsChecked(value: String): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setLinkAttribute(value: js.Any): Self = StObject.set(x, "linkAttribute", value.asInstanceOf[js.Any])
      
      inline def setLinkAttributeUndefined: Self = StObject.set(x, "linkAttribute", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSpriteCssClass(value: String): Self = StObject.set(x, "spriteCssClass", value.asInstanceOf[js.Any])
      
      inline def setSpriteCssClassUndefined: Self = StObject.set(x, "spriteCssClass", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait InlineEditValidationEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current node element id
      */
    var id: js.UndefOr[js.Any] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the new entered text for the node
      */
    var newText: js.UndefOr[String] = js.undefined
    
    /** returns the old node text
      */
    var oldText: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object InlineEditValidationEventArgs {
    
    inline def apply(): InlineEditValidationEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlineEditValidationEventArgs]
    }
    
    extension [Self <: InlineEditValidationEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
      
      inline def setNewTextUndefined: Self = StObject.set(x, "newText", js.undefined)
      
      inline def setOldText(value: String): Self = StObject.set(x, "oldText", value.asInstanceOf[js.Any])
      
      inline def setOldTextUndefined: Self = StObject.set(x, "oldText", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait KeyPressEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.undefined
    
    /** returns the id of current TreeView node
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** it returns when the current node is in expanded state; otherwise, false.
      */
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    /** returns the key pressed key code value
      */
    var keyCode: js.UndefOr[Double] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the parentId of current TreeView node
      */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** returns node path from root element
      */
    var path: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object KeyPressEventArgs {
    
    inline def apply(): KeyPressEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyPressEventArgs]
    }
    
    extension [Self <: KeyPressEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      inline def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait LoadErrorEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the AJAX error object
      */
    var error: js.UndefOr[js.Any] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LoadErrorEventArgs {
    
    inline def apply(): LoadErrorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadErrorEventArgs]
    }
    
    extension [Self <: LoadErrorEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait LoadSuccessEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the success data from the URL
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the given parent node details
      */
    var parentDetails: js.UndefOr[js.Any] = js.undefined
    
    /** returns the target parent element, the data returned from the URL to be appended to the given parent element, else in TreeView
      */
    var targetParent: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LoadSuccessEventArgs {
    
    inline def apply(): LoadSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadSuccessEventArgs]
    }
    
    extension [Self <: LoadSuccessEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentDetails(value: js.Any): Self = StObject.set(x, "parentDetails", value.asInstanceOf[js.Any])
      
      inline def setParentDetailsUndefined: Self = StObject.set(x, "parentDetails", js.undefined)
      
      inline def setTargetParent(value: js.Any): Self = StObject.set(x, "targetParent", value.asInstanceOf[js.Any])
      
      inline def setTargetParentUndefined: Self = StObject.set(x, "targetParent", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Gets or sets a value that indicates whether to enable drag and drop a node within the same tree.
      * @Default {false}
      */
    var allowDragAndDrop: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable drag and drop a node in inter ej.TreeView.
      * @Default {true}
      */
    var allowDragAndDropAcrossControl: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to drop a node to a child of particular node.
      * @Default {true}
      */
    var allowDropChild: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to drop a node to a sibling of particular node.
      * @Default {true}
      */
    var allowDropSibling: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable node editing support for TreeView.
      * @Default {false}
      */
    var allowEditing: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable keyboard support for TreeView actions like nodeSelection, nodeEditing, nodeExpand, nodeCollapse, nodeCut and Paste.
      * @Default {true}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable multi selection support for TreeView.
      * @Default {false}
      */
    var allowMultiSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Allow us to specify the parent and child nodes to get auto check while we check or uncheck a node.
      * @Default {true}
      */
    var autoCheck: js.UndefOr[Boolean] = js.undefined
    
    /** Allow us to specify the parent node to be retain in checked or unchecked state instead of going for indeterminate state.
      * @Default {false}
      */
    var autoCheckParentNode: js.UndefOr[Boolean] = js.undefined
    
    /** Fires before adding node to TreeView.
      */
    var beforeAdd: js.UndefOr[js.Function1[/* e */ BeforeAddEventArgs, Unit]] = js.undefined
    
    /** Fires before collapse a node.
      */
    var beforeCollapse: js.UndefOr[js.Function1[/* e */ BeforeCollapseEventArgs, Unit]] = js.undefined
    
    /** Fires before cut node in TreeView.
      */
    var beforeCut: js.UndefOr[js.Function1[/* e */ BeforeCutEventArgs, Unit]] = js.undefined
    
    /** Fires before deleting node in TreeView.
      */
    var beforeDelete: js.UndefOr[js.Function1[/* e */ BeforeDeleteEventArgs, Unit]] = js.undefined
    
    /** Fires before editing the node in TreeView.
      */
    var beforeEdit: js.UndefOr[js.Function1[/* e */ BeforeEditEventArgs, Unit]] = js.undefined
    
    /** Fires before expanding the node.
      */
    var beforeExpand: js.UndefOr[js.Function1[/* e */ BeforeExpandEventArgs, Unit]] = js.undefined
    
    /** Fires before loading nodes to TreeView.
      */
    var beforeLoad: js.UndefOr[js.Function1[/* e */ BeforeLoadEventArgs, Unit]] = js.undefined
    
    /** Fires before paste node in TreeView.
      */
    var beforePaste: js.UndefOr[js.Function1[/* e */ BeforePasteEventArgs, Unit]] = js.undefined
    
    /** Fires before selecting node in TreeView.
      */
    var beforeSelect: js.UndefOr[js.Function1[/* e */ BeforeSelectEventArgs, Unit]] = js.undefined
    
    /** Gets or sets a value that indicates the checkedNodes index collection as an array. The given array index position denotes the nodes, that are checked while rendering TreeView.
      * @Default {[]}
      */
    var checkedNodes: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Fires when TreeView created successfully.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Sets the root CSS class for TreeView which allow us to customize the appearance.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Fires when TreeView destroyed successfully.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable the animation effect while expanding or collapsing a node.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Allow us to prevent multiple nodes to be in expanded state. If it set to false, previously expanded node will be collapsed automatically, while we expand a node.
      * @Default {true}
      */
    var enableMultipleExpand: js.UndefOr[Boolean] = js.undefined
    
    /** Sets a value that indicates whether to persist the TreeView model state in page using applicable medium i.e., HTML5 localStorage or cookies
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates to align content in the TreeView control from right to left by setting the property as true.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether a TreeView can be enabled or disabled. No actions can be performed while this property is set as false
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates the TreeView node can be expand or collapse by using the specified action.
      * @Default {dblclick}
      */
    var expandOn: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a array of value that indicates the expandedNodes index collection as an array. The given array index position denotes the nodes, that are expanded while rendering
      * TreeView.
      * @Default {[]}
      */
    var expandedNodes: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Gets or sets a fields object that allow us to map the data members with field properties in order to make the data binding easier.
      * @Default {null}
      */
    var fields: js.UndefOr[Fields] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable full row selection support for TreeView.
      * @Default {false}
      */
    var fullRowSelect: js.UndefOr[Boolean] = js.undefined
    
    /** Defines the height of the TreeView.
      * @Default {Null}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** Specifies the HTML Attributes for the TreeView. Using this API we can add custom attributes in TreeView control.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.undefined
    
    /** Fires before nodeEdit Successful.
      */
    var inlineEditValidation: js.UndefOr[js.Function1[/* e */ InlineEditValidationEventArgs, Unit]] = js.undefined
    
    /** Fires when key pressed successfully.
      */
    var keyPress: js.UndefOr[js.Function1[/* e */ KeyPressEventArgs, Unit]] = js.undefined
    
    /** Fires when data load fails.
      */
    var loadError: js.UndefOr[js.Function1[/* e */ LoadErrorEventArgs, Unit]] = js.undefined
    
    /** Specifies the child nodes to be loaded on demand
      * @Default {false}
      */
    var loadOnDemand: js.UndefOr[Boolean] = js.undefined
    
    /** Fires when data loaded successfully.
      */
    var loadSuccess: js.UndefOr[js.Function1[/* e */ LoadSuccessEventArgs, Unit]] = js.undefined
    
    /** Fires once node added successfully.
      */
    var nodeAdd: js.UndefOr[js.Function1[/* e */ NodeAddEventArgs, Unit]] = js.undefined
    
    /** Fires once node checked successfully.
      */
    var nodeCheck: js.UndefOr[js.Function1[/* e */ NodeCheckEventArgs, Unit]] = js.undefined
    
    /** Fires when node clicked successfully.
      */
    var nodeClick: js.UndefOr[js.Function1[/* e */ NodeClickEventArgs, Unit]] = js.undefined
    
    /** Fires when node collapsed successfully.
      */
    var nodeCollapse: js.UndefOr[js.Function1[/* e */ NodeCollapseEventArgs, Unit]] = js.undefined
    
    /** Fires when node cut successfully.
      */
    var nodeCut: js.UndefOr[js.Function1[/* e */ NodeCutEventArgs, Unit]] = js.undefined
    
    /** Fires when node deleted successfully.
      */
    var nodeDelete: js.UndefOr[js.Function1[/* e */ NodeDeleteEventArgs, Unit]] = js.undefined
    
    /** Fires when node dragging.
      */
    var nodeDrag: js.UndefOr[js.Function1[/* e */ NodeDragEventArgs, Unit]] = js.undefined
    
    /** Fires once node drag start successfully.
      */
    var nodeDragStart: js.UndefOr[js.Function1[/* e */ NodeDragStartEventArgs, Unit]] = js.undefined
    
    /** Fires before the dragged node to be dropped.
      */
    var nodeDragStop: js.UndefOr[js.Function1[/* e */ NodeDragStopEventArgs, Unit]] = js.undefined
    
    /** Fires once node dropped successfully.
      */
    var nodeDropped: js.UndefOr[js.Function1[/* e */ NodeDroppedEventArgs, Unit]] = js.undefined
    
    /** Fires once node edited successfully.
      */
    var nodeEdit: js.UndefOr[js.Function1[/* e */ NodeEditEventArgs, Unit]] = js.undefined
    
    /** Fires once node expanded successfully.
      */
    var nodeExpand: js.UndefOr[js.Function1[/* e */ NodeExpandEventArgs, Unit]] = js.undefined
    
    /** Fires once node pasted successfully.
      */
    var nodePaste: js.UndefOr[js.Function1[/* e */ NodePasteEventArgs, Unit]] = js.undefined
    
    /** Fires when node selected successfully.
      */
    var nodeSelect: js.UndefOr[js.Function1[/* e */ NodeSelectEventArgs, Unit]] = js.undefined
    
    /** Fires once node unchecked successfully.
      */
    var nodeUncheck: js.UndefOr[js.Function1[/* e */ NodeUncheckEventArgs, Unit]] = js.undefined
    
    /** Fires once node unselected successfully.
      */
    var nodeUnselect: js.UndefOr[js.Function1[/* e */ NodeUnselectEventArgs, Unit]] = js.undefined
    
    /** Fires when TreeView nodes are loaded successfully
      */
    var ready: js.UndefOr[js.Function1[/* e */ ReadyEventArgs, Unit]] = js.undefined
    
    /** Gets or Sets a value that indicates the index position of a tree node. The particular index tree node will be selected while rendering the TreeView.
      * @Default {-1}
      */
    var selectedNode: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets a value that indicates the selectedNodes index collection as an array. The given array index position denotes the nodes, that are selected while rendering TreeView.
      * @Default {[]}
      */
    var selectedNodes: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Gets or sets a value that indicates whether to display or hide checkbox for all TreeView nodes.
      * @Default {false}
      */
    var showCheckbox: js.UndefOr[Boolean] = js.undefined
    
    /** By using sortSettings property, you can customize the sorting option in TreeView control.
      */
    var sortSettings: js.UndefOr[SortSettings] = js.undefined
    
    /** Allow us to use custom template in order to create TreeView.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Defines the width of the TreeView.
      * @Default {Null}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.TreeView.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.TreeView.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.TreeView.Model](x: Self) {
      
      inline def setAllowDragAndDrop(value: Boolean): Self = StObject.set(x, "allowDragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setAllowDragAndDropAcrossControl(value: Boolean): Self = StObject.set(x, "allowDragAndDropAcrossControl", value.asInstanceOf[js.Any])
      
      inline def setAllowDragAndDropAcrossControlUndefined: Self = StObject.set(x, "allowDragAndDropAcrossControl", js.undefined)
      
      inline def setAllowDragAndDropUndefined: Self = StObject.set(x, "allowDragAndDrop", js.undefined)
      
      inline def setAllowDropChild(value: Boolean): Self = StObject.set(x, "allowDropChild", value.asInstanceOf[js.Any])
      
      inline def setAllowDropChildUndefined: Self = StObject.set(x, "allowDropChild", js.undefined)
      
      inline def setAllowDropSibling(value: Boolean): Self = StObject.set(x, "allowDropSibling", value.asInstanceOf[js.Any])
      
      inline def setAllowDropSiblingUndefined: Self = StObject.set(x, "allowDropSibling", js.undefined)
      
      inline def setAllowEditing(value: Boolean): Self = StObject.set(x, "allowEditing", value.asInstanceOf[js.Any])
      
      inline def setAllowEditingUndefined: Self = StObject.set(x, "allowEditing", js.undefined)
      
      inline def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      inline def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      inline def setAllowMultiSelection(value: Boolean): Self = StObject.set(x, "allowMultiSelection", value.asInstanceOf[js.Any])
      
      inline def setAllowMultiSelectionUndefined: Self = StObject.set(x, "allowMultiSelection", js.undefined)
      
      inline def setAutoCheck(value: Boolean): Self = StObject.set(x, "autoCheck", value.asInstanceOf[js.Any])
      
      inline def setAutoCheckParentNode(value: Boolean): Self = StObject.set(x, "autoCheckParentNode", value.asInstanceOf[js.Any])
      
      inline def setAutoCheckParentNodeUndefined: Self = StObject.set(x, "autoCheckParentNode", js.undefined)
      
      inline def setAutoCheckUndefined: Self = StObject.set(x, "autoCheck", js.undefined)
      
      inline def setBeforeAdd(value: /* e */ BeforeAddEventArgs => Unit): Self = StObject.set(x, "beforeAdd", js.Any.fromFunction1(value))
      
      inline def setBeforeAddUndefined: Self = StObject.set(x, "beforeAdd", js.undefined)
      
      inline def setBeforeCollapse(value: /* e */ BeforeCollapseEventArgs => Unit): Self = StObject.set(x, "beforeCollapse", js.Any.fromFunction1(value))
      
      inline def setBeforeCollapseUndefined: Self = StObject.set(x, "beforeCollapse", js.undefined)
      
      inline def setBeforeCut(value: /* e */ BeforeCutEventArgs => Unit): Self = StObject.set(x, "beforeCut", js.Any.fromFunction1(value))
      
      inline def setBeforeCutUndefined: Self = StObject.set(x, "beforeCut", js.undefined)
      
      inline def setBeforeDelete(value: /* e */ BeforeDeleteEventArgs => Unit): Self = StObject.set(x, "beforeDelete", js.Any.fromFunction1(value))
      
      inline def setBeforeDeleteUndefined: Self = StObject.set(x, "beforeDelete", js.undefined)
      
      inline def setBeforeEdit(value: /* e */ BeforeEditEventArgs => Unit): Self = StObject.set(x, "beforeEdit", js.Any.fromFunction1(value))
      
      inline def setBeforeEditUndefined: Self = StObject.set(x, "beforeEdit", js.undefined)
      
      inline def setBeforeExpand(value: /* e */ BeforeExpandEventArgs => Unit): Self = StObject.set(x, "beforeExpand", js.Any.fromFunction1(value))
      
      inline def setBeforeExpandUndefined: Self = StObject.set(x, "beforeExpand", js.undefined)
      
      inline def setBeforeLoad(value: /* e */ BeforeLoadEventArgs => Unit): Self = StObject.set(x, "beforeLoad", js.Any.fromFunction1(value))
      
      inline def setBeforeLoadUndefined: Self = StObject.set(x, "beforeLoad", js.undefined)
      
      inline def setBeforePaste(value: /* e */ BeforePasteEventArgs => Unit): Self = StObject.set(x, "beforePaste", js.Any.fromFunction1(value))
      
      inline def setBeforePasteUndefined: Self = StObject.set(x, "beforePaste", js.undefined)
      
      inline def setBeforeSelect(value: /* e */ BeforeSelectEventArgs => Unit): Self = StObject.set(x, "beforeSelect", js.Any.fromFunction1(value))
      
      inline def setBeforeSelectUndefined: Self = StObject.set(x, "beforeSelect", js.undefined)
      
      inline def setCheckedNodes(value: js.Array[js.Any]): Self = StObject.set(x, "checkedNodes", value.asInstanceOf[js.Any])
      
      inline def setCheckedNodesUndefined: Self = StObject.set(x, "checkedNodes", js.undefined)
      
      inline def setCheckedNodesVarargs(value: js.Any*): Self = StObject.set(x, "checkedNodes", js.Array(value :_*))
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setEnableMultipleExpand(value: Boolean): Self = StObject.set(x, "enableMultipleExpand", value.asInstanceOf[js.Any])
      
      inline def setEnableMultipleExpandUndefined: Self = StObject.set(x, "enableMultipleExpand", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setExpandOn(value: String): Self = StObject.set(x, "expandOn", value.asInstanceOf[js.Any])
      
      inline def setExpandOnUndefined: Self = StObject.set(x, "expandOn", js.undefined)
      
      inline def setExpandedNodes(value: js.Array[js.Any]): Self = StObject.set(x, "expandedNodes", value.asInstanceOf[js.Any])
      
      inline def setExpandedNodesUndefined: Self = StObject.set(x, "expandedNodes", js.undefined)
      
      inline def setExpandedNodesVarargs(value: js.Any*): Self = StObject.set(x, "expandedNodes", js.Array(value :_*))
      
      inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFullRowSelect(value: Boolean): Self = StObject.set(x, "fullRowSelect", value.asInstanceOf[js.Any])
      
      inline def setFullRowSelectUndefined: Self = StObject.set(x, "fullRowSelect", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setInlineEditValidation(value: /* e */ InlineEditValidationEventArgs => Unit): Self = StObject.set(x, "inlineEditValidation", js.Any.fromFunction1(value))
      
      inline def setInlineEditValidationUndefined: Self = StObject.set(x, "inlineEditValidation", js.undefined)
      
      inline def setKeyPress(value: /* e */ KeyPressEventArgs => Unit): Self = StObject.set(x, "keyPress", js.Any.fromFunction1(value))
      
      inline def setKeyPressUndefined: Self = StObject.set(x, "keyPress", js.undefined)
      
      inline def setLoadError(value: /* e */ LoadErrorEventArgs => Unit): Self = StObject.set(x, "loadError", js.Any.fromFunction1(value))
      
      inline def setLoadErrorUndefined: Self = StObject.set(x, "loadError", js.undefined)
      
      inline def setLoadOnDemand(value: Boolean): Self = StObject.set(x, "loadOnDemand", value.asInstanceOf[js.Any])
      
      inline def setLoadOnDemandUndefined: Self = StObject.set(x, "loadOnDemand", js.undefined)
      
      inline def setLoadSuccess(value: /* e */ LoadSuccessEventArgs => Unit): Self = StObject.set(x, "loadSuccess", js.Any.fromFunction1(value))
      
      inline def setLoadSuccessUndefined: Self = StObject.set(x, "loadSuccess", js.undefined)
      
      inline def setNodeAdd(value: /* e */ NodeAddEventArgs => Unit): Self = StObject.set(x, "nodeAdd", js.Any.fromFunction1(value))
      
      inline def setNodeAddUndefined: Self = StObject.set(x, "nodeAdd", js.undefined)
      
      inline def setNodeCheck(value: /* e */ NodeCheckEventArgs => Unit): Self = StObject.set(x, "nodeCheck", js.Any.fromFunction1(value))
      
      inline def setNodeCheckUndefined: Self = StObject.set(x, "nodeCheck", js.undefined)
      
      inline def setNodeClick(value: /* e */ NodeClickEventArgs => Unit): Self = StObject.set(x, "nodeClick", js.Any.fromFunction1(value))
      
      inline def setNodeClickUndefined: Self = StObject.set(x, "nodeClick", js.undefined)
      
      inline def setNodeCollapse(value: /* e */ NodeCollapseEventArgs => Unit): Self = StObject.set(x, "nodeCollapse", js.Any.fromFunction1(value))
      
      inline def setNodeCollapseUndefined: Self = StObject.set(x, "nodeCollapse", js.undefined)
      
      inline def setNodeCut(value: /* e */ NodeCutEventArgs => Unit): Self = StObject.set(x, "nodeCut", js.Any.fromFunction1(value))
      
      inline def setNodeCutUndefined: Self = StObject.set(x, "nodeCut", js.undefined)
      
      inline def setNodeDelete(value: /* e */ NodeDeleteEventArgs => Unit): Self = StObject.set(x, "nodeDelete", js.Any.fromFunction1(value))
      
      inline def setNodeDeleteUndefined: Self = StObject.set(x, "nodeDelete", js.undefined)
      
      inline def setNodeDrag(value: /* e */ NodeDragEventArgs => Unit): Self = StObject.set(x, "nodeDrag", js.Any.fromFunction1(value))
      
      inline def setNodeDragStart(value: /* e */ NodeDragStartEventArgs => Unit): Self = StObject.set(x, "nodeDragStart", js.Any.fromFunction1(value))
      
      inline def setNodeDragStartUndefined: Self = StObject.set(x, "nodeDragStart", js.undefined)
      
      inline def setNodeDragStop(value: /* e */ NodeDragStopEventArgs => Unit): Self = StObject.set(x, "nodeDragStop", js.Any.fromFunction1(value))
      
      inline def setNodeDragStopUndefined: Self = StObject.set(x, "nodeDragStop", js.undefined)
      
      inline def setNodeDragUndefined: Self = StObject.set(x, "nodeDrag", js.undefined)
      
      inline def setNodeDropped(value: /* e */ NodeDroppedEventArgs => Unit): Self = StObject.set(x, "nodeDropped", js.Any.fromFunction1(value))
      
      inline def setNodeDroppedUndefined: Self = StObject.set(x, "nodeDropped", js.undefined)
      
      inline def setNodeEdit(value: /* e */ NodeEditEventArgs => Unit): Self = StObject.set(x, "nodeEdit", js.Any.fromFunction1(value))
      
      inline def setNodeEditUndefined: Self = StObject.set(x, "nodeEdit", js.undefined)
      
      inline def setNodeExpand(value: /* e */ NodeExpandEventArgs => Unit): Self = StObject.set(x, "nodeExpand", js.Any.fromFunction1(value))
      
      inline def setNodeExpandUndefined: Self = StObject.set(x, "nodeExpand", js.undefined)
      
      inline def setNodePaste(value: /* e */ NodePasteEventArgs => Unit): Self = StObject.set(x, "nodePaste", js.Any.fromFunction1(value))
      
      inline def setNodePasteUndefined: Self = StObject.set(x, "nodePaste", js.undefined)
      
      inline def setNodeSelect(value: /* e */ NodeSelectEventArgs => Unit): Self = StObject.set(x, "nodeSelect", js.Any.fromFunction1(value))
      
      inline def setNodeSelectUndefined: Self = StObject.set(x, "nodeSelect", js.undefined)
      
      inline def setNodeUncheck(value: /* e */ NodeUncheckEventArgs => Unit): Self = StObject.set(x, "nodeUncheck", js.Any.fromFunction1(value))
      
      inline def setNodeUncheckUndefined: Self = StObject.set(x, "nodeUncheck", js.undefined)
      
      inline def setNodeUnselect(value: /* e */ NodeUnselectEventArgs => Unit): Self = StObject.set(x, "nodeUnselect", js.Any.fromFunction1(value))
      
      inline def setNodeUnselectUndefined: Self = StObject.set(x, "nodeUnselect", js.undefined)
      
      inline def setReady(value: /* e */ ReadyEventArgs => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setSelectedNode(value: Double): Self = StObject.set(x, "selectedNode", value.asInstanceOf[js.Any])
      
      inline def setSelectedNodeUndefined: Self = StObject.set(x, "selectedNode", js.undefined)
      
      inline def setSelectedNodes(value: js.Array[js.Any]): Self = StObject.set(x, "selectedNodes", value.asInstanceOf[js.Any])
      
      inline def setSelectedNodesUndefined: Self = StObject.set(x, "selectedNodes", js.undefined)
      
      inline def setSelectedNodesVarargs(value: js.Any*): Self = StObject.set(x, "selectedNodes", js.Array(value :_*))
      
      inline def setShowCheckbox(value: Boolean): Self = StObject.set(x, "showCheckbox", value.asInstanceOf[js.Any])
      
      inline def setShowCheckboxUndefined: Self = StObject.set(x, "showCheckbox", js.undefined)
      
      inline def setSortSettings(value: SortSettings): Self = StObject.set(x, "sortSettings", value.asInstanceOf[js.Any])
      
      inline def setSortSettingsUndefined: Self = StObject.set(x, "sortSettings", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait NodeAddEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the added data, that are given initially
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the newly added elements
      */
    var nodes: js.UndefOr[js.Any] = js.undefined
    
    /** returns the given parent node details
      */
    var parentDetails: js.UndefOr[js.Any] = js.undefined
    
    /** returns the target parent element of the added element
      */
    var parentElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NodeAddEventArgs {
    
    inline def apply(): NodeAddEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeAddEventArgs]
    }
    
    extension [Self <: NodeAddEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setNodes(value: js.Any): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setParentDetails(value: js.Any): Self = StObject.set(x, "parentDetails", value.asInstanceOf[js.Any])
      
      inline def setParentDetailsUndefined: Self = StObject.set(x, "parentDetails", js.undefined)
      
      inline def setParentElement(value: js.Any): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      inline def setParentElementUndefined: Self = StObject.set(x, "parentElement", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NodeCheckEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** it returns the currently checked and its child node details
      */
    var currentCheckedNodes: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.undefined
    
    /** it returns the currently checked node name
      */
    var currentNode: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.undefined
    
    /** returns the id of the current element of the node clicked
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** it returns true when the node checkbox is checked; otherwise, false.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the id of the parent element of current element of the node clicked
      */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object NodeCheckEventArgs {
    
    inline def apply(): NodeCheckEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeCheckEventArgs]
    }
    
    extension [Self <: NodeCheckEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentCheckedNodes(value: js.Array[js.Any]): Self = StObject.set(x, "currentCheckedNodes", value.asInstanceOf[js.Any])
      
      inline def setCurrentCheckedNodesUndefined: Self = StObject.set(x, "currentCheckedNodes", js.undefined)
      
      inline def setCurrentCheckedNodesVarargs(value: js.Any*): Self = StObject.set(x, "currentCheckedNodes", js.Array(value :_*))
      
      inline def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      inline def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      inline def setCurrentNode(value: js.Array[js.Any]): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
      
      inline def setCurrentNodeUndefined: Self = StObject.set(x, "currentNode", js.undefined)
      
      inline def setCurrentNodeVarargs(value: js.Any*): Self = StObject.set(x, "currentNode", js.Array(value :_*))
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait NodeClickEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.undefined
    
    /** returns the id of currently clicked TreeView node
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the parentId of currently clicked TreeView node
      */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NodeClickEventArgs {
    
    inline def apply(): NodeClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeClickEventArgs]
    }
    
    extension [Self <: NodeClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      inline def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NodeCollapseEventArgs extends StObject {
    
    /** returns the format asynchronous or synchronous
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the id of the current element of the node clicked
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** returns the child nodes are loaded or not
      */
    var isChildLoaded: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the id of the parent element of current element of the node clicked
      */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object NodeCollapseEventArgs {
    
    inline def apply(): NodeCollapseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeCollapseEventArgs]
    }
    
    extension [Self <: NodeCollapseEventArgs](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      inline def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsChildLoaded(value: Boolean): Self = StObject.set(x, "isChildLoaded", value.asInstanceOf[js.Any])
      
      inline def setIsChildLoadedUndefined: Self = StObject.set(x, "isChildLoaded", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait NodeCutEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.undefined
    
    /** returns the key pressed key code value
      */
    var keyCode: js.UndefOr[Double] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the given parent node details
      */
    var parentDetails: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current parent element of the cut node
      */
    var parentElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NodeCutEventArgs {
    
    inline def apply(): NodeCutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeCutEventArgs]
    }
    
    extension [Self <: NodeCutEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentDetails(value: js.Any): Self = StObject.set(x, "parentDetails", value.asInstanceOf[js.Any])
      
      inline def setParentDetailsUndefined: Self = StObject.set(x, "parentDetails", js.undefined)
      
      inline def setParentElement(value: js.Any): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      inline def setParentElementUndefined: Self = StObject.set(x, "parentElement", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NodeDeleteEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the given parent node details
      */
    var parentDetails: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current parent element of the deleted node
      */
    var parentElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the currently removed nodes
      */
    var removedNodes: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NodeDeleteEventArgs {
    
    inline def apply(): NodeDeleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeDeleteEventArgs]
    }
    
    extension [Self <: NodeDeleteEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentDetails(value: js.Any): Self = StObject.set(x, "parentDetails", value.asInstanceOf[js.Any])
      
      inline def setParentDetailsUndefined: Self = StObject.set(x, "parentDetails", js.undefined)
      
      inline def setParentElement(value: js.Any): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      inline def setParentElementUndefined: Self = StObject.set(x, "parentElement", js.undefined)
      
      inline def setRemovedNodes(value: js.Array[js.Any]): Self = StObject.set(x, "removedNodes", value.asInstanceOf[js.Any])
      
      inline def setRemovedNodesUndefined: Self = StObject.set(x, "removedNodes", js.undefined)
      
      inline def setRemovedNodesVarargs(value: js.Any*): Self = StObject.set(x, "removedNodes", js.Array(value :_*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NodeDragEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the original drag target
      */
    var dragTarget: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current parent element of the target node
      */
    var draggedElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the given parent node details
      */
    var draggedElementData: js.UndefOr[js.Any] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the current target TreeView node
      */
    var target: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current target details
      */
    var targetElementData: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NodeDragEventArgs {
    
    inline def apply(): NodeDragEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeDragEventArgs]
    }
    
    extension [Self <: NodeDragEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDragTarget(value: js.Any): Self = StObject.set(x, "dragTarget", value.asInstanceOf[js.Any])
      
      inline def setDragTargetUndefined: Self = StObject.set(x, "dragTarget", js.undefined)
      
      inline def setDraggedElement(value: js.Any): Self = StObject.set(x, "draggedElement", value.asInstanceOf[js.Any])
      
      inline def setDraggedElementData(value: js.Any): Self = StObject.set(x, "draggedElementData", value.asInstanceOf[js.Any])
      
      inline def setDraggedElementDataUndefined: Self = StObject.set(x, "draggedElementData", js.undefined)
      
      inline def setDraggedElementUndefined: Self = StObject.set(x, "draggedElement", js.undefined)
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetElementData(value: js.Any): Self = StObject.set(x, "targetElementData", value.asInstanceOf[js.Any])
      
      inline def setTargetElementDataUndefined: Self = StObject.set(x, "targetElementData", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NodeDragStartEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the original drag target
      */
    var dragTarget: js.UndefOr[js.Any] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the current dragging parent TreeView node
      */
    var parentElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current dragging parent TreeView node details
      */
    var parentElementData: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current parent element of the dragging node
      */
    var target: js.UndefOr[js.Any] = js.undefined
    
    /** returns the given parent node details
      */
    var targetElementData: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NodeDragStartEventArgs {
    
    inline def apply(): NodeDragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeDragStartEventArgs]
    }
    
    extension [Self <: NodeDragStartEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDragTarget(value: js.Any): Self = StObject.set(x, "dragTarget", value.asInstanceOf[js.Any])
      
      inline def setDragTargetUndefined: Self = StObject.set(x, "dragTarget", js.undefined)
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentElement(value: js.Any): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      inline def setParentElementData(value: js.Any): Self = StObject.set(x, "parentElementData", value.asInstanceOf[js.Any])
      
      inline def setParentElementDataUndefined: Self = StObject.set(x, "parentElementData", js.undefined)
      
      inline def setParentElementUndefined: Self = StObject.set(x, "parentElement", js.undefined)
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetElementData(value: js.Any): Self = StObject.set(x, "targetElementData", value.asInstanceOf[js.Any])
      
      inline def setTargetElementDataUndefined: Self = StObject.set(x, "targetElementData", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NodeDragStopEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current dragged TreeView node
      */
    var draggedElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current dragged TreeView node details
      */
    var draggedElementData: js.UndefOr[js.Any] = js.undefined
    
    /** returns the original drop target
      */
    var dropTarget: js.UndefOr[js.Any] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the drop position such as before, after or over
      */
    var position: js.UndefOr[String] = js.undefined
    
    /** if it is true, the parent node will be prevented from auto expanding; otherwise, it work's usually
      */
    var preventTargetExpand: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current parent element of the dragged node
      */
    var target: js.UndefOr[js.Any] = js.undefined
    
    /** returns the given parent node details
      */
    var targetElementData: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NodeDragStopEventArgs {
    
    inline def apply(): NodeDragStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeDragStopEventArgs]
    }
    
    extension [Self <: NodeDragStopEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDraggedElement(value: js.Any): Self = StObject.set(x, "draggedElement", value.asInstanceOf[js.Any])
      
      inline def setDraggedElementData(value: js.Any): Self = StObject.set(x, "draggedElementData", value.asInstanceOf[js.Any])
      
      inline def setDraggedElementDataUndefined: Self = StObject.set(x, "draggedElementData", js.undefined)
      
      inline def setDraggedElementUndefined: Self = StObject.set(x, "draggedElement", js.undefined)
      
      inline def setDropTarget(value: js.Any): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
      
      inline def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPreventTargetExpand(value: Boolean): Self = StObject.set(x, "preventTargetExpand", value.asInstanceOf[js.Any])
      
      inline def setPreventTargetExpandUndefined: Self = StObject.set(x, "preventTargetExpand", js.undefined)
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetElementData(value: js.Any): Self = StObject.set(x, "targetElementData", value.asInstanceOf[js.Any])
      
      inline def setTargetElementDataUndefined: Self = StObject.set(x, "targetElementData", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NodeDroppedEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the original drop target
      */
    var dropTarget: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current dropped TreeView node
      */
    var droppedElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current dropped TreeView node details
      */
    var droppedElementData: js.UndefOr[js.Any] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the drop position such as before, after or over
      */
    var position: js.UndefOr[String] = js.undefined
    
    /** returns the current parent element of the dropped node
      */
    var target: js.UndefOr[js.Any] = js.undefined
    
    /** returns the given parent node details
      */
    var targetElementData: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NodeDroppedEventArgs {
    
    inline def apply(): NodeDroppedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeDroppedEventArgs]
    }
    
    extension [Self <: NodeDroppedEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDropTarget(value: js.Any): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
      
      inline def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
      
      inline def setDroppedElement(value: js.Any): Self = StObject.set(x, "droppedElement", value.asInstanceOf[js.Any])
      
      inline def setDroppedElementData(value: js.Any): Self = StObject.set(x, "droppedElementData", value.asInstanceOf[js.Any])
      
      inline def setDroppedElementDataUndefined: Self = StObject.set(x, "droppedElementData", js.undefined)
      
      inline def setDroppedElementUndefined: Self = StObject.set(x, "droppedElement", js.undefined)
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetElementData(value: js.Any): Self = StObject.set(x, "targetElementData", value.asInstanceOf[js.Any])
      
      inline def setTargetElementDataUndefined: Self = StObject.set(x, "targetElementData", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NodeEditEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.undefined
    
    /** returns the id of the element
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the newText of the element
      */
    var newText: js.UndefOr[String] = js.undefined
    
    /** returns the given target node values
      */
    var nodeDetails: js.UndefOr[js.Any] = js.undefined
    
    /** returns the oldText of the element
      */
    var oldText: js.UndefOr[String] = js.undefined
    
    /** returns the target element, the given node to be cut
      */
    var target: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NodeEditEventArgs {
    
    inline def apply(): NodeEditEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeEditEventArgs]
    }
    
    extension [Self <: NodeEditEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
      
      inline def setNewTextUndefined: Self = StObject.set(x, "newText", js.undefined)
      
      inline def setNodeDetails(value: js.Any): Self = StObject.set(x, "nodeDetails", value.asInstanceOf[js.Any])
      
      inline def setNodeDetailsUndefined: Self = StObject.set(x, "nodeDetails", js.undefined)
      
      inline def setOldText(value: String): Self = StObject.set(x, "oldText", value.asInstanceOf[js.Any])
      
      inline def setOldTextUndefined: Self = StObject.set(x, "oldText", js.undefined)
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NodeExpandEventArgs extends StObject {
    
    /** returns the format asynchronous or synchronous
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the id of currently clicked node
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** if the child node is ready to expanded state; otherwise, false.
      */
    var isChildLoaded: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the parent id of currently clicked node
      */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object NodeExpandEventArgs {
    
    inline def apply(): NodeExpandEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeExpandEventArgs]
    }
    
    extension [Self <: NodeExpandEventArgs](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      inline def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsChildLoaded(value: Boolean): Self = StObject.set(x, "isChildLoaded", value.asInstanceOf[js.Any])
      
      inline def setIsChildLoadedUndefined: Self = StObject.set(x, "isChildLoaded", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait NodePasteEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.undefined
    
    /** returns the key pressed key code value
      */
    var keyCode: js.UndefOr[Double] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the given target node values
      */
    var nodeDetails: js.UndefOr[js.Any] = js.undefined
    
    /** returns the pasted element
      */
    var target: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NodePasteEventArgs {
    
    inline def apply(): NodePasteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodePasteEventArgs]
    }
    
    extension [Self <: NodePasteEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setNodeDetails(value: js.Any): Self = StObject.set(x, "nodeDetails", value.asInstanceOf[js.Any])
      
      inline def setNodeDetailsUndefined: Self = StObject.set(x, "nodeDetails", js.undefined)
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NodeSelectEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the id of the current element of the node clicked
      */
    var id: js.UndefOr[js.Any] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the id of the parent element of current element of the node clicked
      */
    var parentId: js.UndefOr[js.Any] = js.undefined
    
    /** returns the current selected nodes index of TreeView
      */
    var selectedNodes: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object NodeSelectEventArgs {
    
    inline def apply(): NodeSelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeSelectEventArgs]
    }
    
    extension [Self <: NodeSelectEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      inline def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentId(value: js.Any): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setSelectedNodes(value: js.Array[js.Any]): Self = StObject.set(x, "selectedNodes", value.asInstanceOf[js.Any])
      
      inline def setSelectedNodesUndefined: Self = StObject.set(x, "selectedNodes", js.undefined)
      
      inline def setSelectedNodesVarargs(value: js.Any*): Self = StObject.set(x, "selectedNodes", js.Array(value :_*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait NodeUncheckEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.undefined
    
    /** it returns currently unchecked node name
      */
    var currentNode: js.UndefOr[String] = js.undefined
    
    /** it returns currently unchecked node and its child node details.
      */
    var currentUncheckedNodes: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.undefined
    
    /** returns the id of the current element of the node clicked
      */
    var id: js.UndefOr[js.Any] = js.undefined
    
    /** it returns true when the node checkbox is checked; otherwise, false.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the id of the parent element of current element of the node clicked
      */
    var parentId: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object NodeUncheckEventArgs {
    
    inline def apply(): NodeUncheckEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeUncheckEventArgs]
    }
    
    extension [Self <: NodeUncheckEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      inline def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      inline def setCurrentNode(value: String): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
      
      inline def setCurrentNodeUndefined: Self = StObject.set(x, "currentNode", js.undefined)
      
      inline def setCurrentUncheckedNodes(value: js.Array[js.Any]): Self = StObject.set(x, "currentUncheckedNodes", value.asInstanceOf[js.Any])
      
      inline def setCurrentUncheckedNodesUndefined: Self = StObject.set(x, "currentUncheckedNodes", js.undefined)
      
      inline def setCurrentUncheckedNodesVarargs(value: js.Any*): Self = StObject.set(x, "currentUncheckedNodes", js.Array(value :_*))
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentId(value: js.Any): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait NodeUnselectEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current element of the node unselected
      */
    var currentElement: js.UndefOr[js.Any] = js.undefined
    
    /** returns the id of the current element of the node unselected
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the id of the parent element of current element of the node unselected
      */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** returns the current selected nodes index of TreeView
      */
    var selectedNodes: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object NodeUnselectEventArgs {
    
    inline def apply(): NodeUnselectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeUnselectEventArgs]
    }
    
    extension [Self <: NodeUnselectEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      inline def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setSelectedNodes(value: js.Array[js.Any]): Self = StObject.set(x, "selectedNodes", value.asInstanceOf[js.Any])
      
      inline def setSelectedNodesUndefined: Self = StObject.set(x, "selectedNodes", js.undefined)
      
      inline def setSelectedNodesVarargs(value: js.Any*): Self = StObject.set(x, "selectedNodes", js.Array(value :_*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ReadyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ReadyEventArgs {
    
    inline def apply(): ReadyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadyEventArgs]
    }
    
    extension [Self <: ReadyEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SortSettings extends StObject {
    
    /** Enables or disables the sorting option in TreeView control
      * @Default {false}
      */
    var allowSorting: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the sorting order type. There are two sorting types available, such as &quot;ascending&quot;, &quot;descending&quot;.
      * @Default {ej.sortOrder.Ascending}
      */
    var sortOrder: js.UndefOr[typings.ejWebAll.ej.sortOrder | String] = js.undefined
  }
  object SortSettings {
    
    inline def apply(): SortSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortSettings]
    }
    
    extension [Self <: SortSettings](x: Self) {
      
      inline def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
      
      inline def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
      
      inline def setSortOrder(value: sortOrder | String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
}
