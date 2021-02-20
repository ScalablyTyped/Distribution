package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeView extends Widget_ {
  
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
  def collapseAll(levelUntil: js.UndefOr[scala.Nothing], excludeHiddenNodes: Boolean): Unit = js.native
  def collapseAll(levelUntil: Double): Unit = js.native
  def collapseAll(levelUntil: Double, excludeHiddenNodes: Boolean): Unit = js.native
  
  /** To collapse a particular node in TreeView.
    * @param {string|any|any[]} ID of TreeView node|object of TreeView node/collection of ID/object of TreeView nodes
    * @returns {void}
    */
  def collapseNode(element: String): Unit = js.native
  def collapseNode(element: js.Any): Unit = js.native
  def collapseNode(element: js.Array[_]): Unit = js.native
  
  var defaults: Model = js.native
  
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
  def expandAll(levelUntil: js.UndefOr[scala.Nothing], excludeHiddenNodes: Boolean): Unit = js.native
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
object TreeView {
  
  @js.native
  trait BeforeAddEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the given new node data
      */
    var data: js.UndefOr[String | js.Any] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the given parent node details
      */
    var parentDetails: js.UndefOr[js.Any] = js.native
    
    /** returns the parent element, the given new nodes to be appended to the given parent element
      */
    var targetParent: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeAddEventArgs {
    
    @scala.inline
    def apply(): BeforeAddEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeAddEventArgs]
    }
    
    @scala.inline
    implicit class BeforeAddEventArgsMutableBuilder[Self <: BeforeAddEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String | js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParentDetails(value: js.Any): Self = StObject.set(x, "parentDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentDetailsUndefined: Self = StObject.set(x, "parentDetails", js.undefined)
      
      @scala.inline
      def setTargetParent(value: js.Any): Self = StObject.set(x, "targetParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetParentUndefined: Self = StObject.set(x, "targetParent", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforeCollapseEventArgs extends StObject {
    
    /** returns the format asynchronous or synchronous
      */
    var async: js.UndefOr[Boolean] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.native
    
    /** returns the id of currently clicked node
      */
    var id: js.UndefOr[String] = js.native
    
    /** returns the child nodes are loaded or not
      */
    var isChildLoaded: js.UndefOr[Boolean] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the parent id of currently clicked node
      */
    var parentId: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.native
  }
  object BeforeCollapseEventArgs {
    
    @scala.inline
    def apply(): BeforeCollapseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeCollapseEventArgs]
    }
    
    @scala.inline
    implicit class BeforeCollapseEventArgsMutableBuilder[Self <: BeforeCollapseEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsChildLoaded(value: Boolean): Self = StObject.set(x, "isChildLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChildLoadedUndefined: Self = StObject.set(x, "isChildLoaded", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait BeforeCutEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the key pressed key code value
      */
    var keyCode: js.UndefOr[Double] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the given target node values
      */
    var nodeDetails: js.UndefOr[js.Any] = js.native
    
    /** returns the target element, the given node to be cut
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeCutEventArgs {
    
    @scala.inline
    def apply(): BeforeCutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeCutEventArgs]
    }
    
    @scala.inline
    implicit class BeforeCutEventArgsMutableBuilder[Self <: BeforeCutEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setNodeDetails(value: js.Any): Self = StObject.set(x, "nodeDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeDetailsUndefined: Self = StObject.set(x, "nodeDetails", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforeDeleteEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the given target node values
      */
    var nodeDetails: js.UndefOr[js.Any] = js.native
    
    /** returns the parent node values
      */
    var parentDetails: js.UndefOr[js.Any] = js.native
    
    /** returns the current parent element of the target node
      */
    var parentElement: js.UndefOr[js.Any] = js.native
    
    /** returns the currently removed nodes
      */
    var removedNodes: js.UndefOr[js.Array[_]] = js.native
    
    /** returns the target element, the given node to be deleted
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeDeleteEventArgs {
    
    @scala.inline
    def apply(): BeforeDeleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeDeleteEventArgs]
    }
    
    @scala.inline
    implicit class BeforeDeleteEventArgsMutableBuilder[Self <: BeforeDeleteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setNodeDetails(value: js.Any): Self = StObject.set(x, "nodeDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeDetailsUndefined: Self = StObject.set(x, "nodeDetails", js.undefined)
      
      @scala.inline
      def setParentDetails(value: js.Any): Self = StObject.set(x, "parentDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentDetailsUndefined: Self = StObject.set(x, "parentDetails", js.undefined)
      
      @scala.inline
      def setParentElement(value: js.Any): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElementUndefined: Self = StObject.set(x, "parentElement", js.undefined)
      
      @scala.inline
      def setRemovedNodes(value: js.Array[_]): Self = StObject.set(x, "removedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedNodesUndefined: Self = StObject.set(x, "removedNodes", js.undefined)
      
      @scala.inline
      def setRemovedNodesVarargs(value: js.Any*): Self = StObject.set(x, "removedNodes", js.Array(value :_*))
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforeEditEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeEditEventArgs {
    
    @scala.inline
    def apply(): BeforeEditEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeEditEventArgs]
    }
    
    @scala.inline
    implicit class BeforeEditEventArgsMutableBuilder[Self <: BeforeEditEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforeExpandEventArgs extends StObject {
    
    /** returns the format asynchronous or synchronous
      */
    var async: js.UndefOr[Boolean] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.native
    
    /** returns the id of currently clicked node
      */
    var id: js.UndefOr[String] = js.native
    
    /** if the child node is ready to expanded state; otherwise, false.
      */
    var isChildLoaded: js.UndefOr[Boolean] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the parent id of currently clicked node
      */
    var parentId: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.native
  }
  object BeforeExpandEventArgs {
    
    @scala.inline
    def apply(): BeforeExpandEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeExpandEventArgs]
    }
    
    @scala.inline
    implicit class BeforeExpandEventArgsMutableBuilder[Self <: BeforeExpandEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsChildLoaded(value: Boolean): Self = StObject.set(x, "isChildLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChildLoadedUndefined: Self = StObject.set(x, "isChildLoaded", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait BeforeLoadEventArgs extends StObject {
    
    /** returns the AJAX settings object
      */
    var AjaxOptions: js.UndefOr[js.Any] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeLoadEventArgs {
    
    @scala.inline
    def apply(): BeforeLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeLoadEventArgs]
    }
    
    @scala.inline
    implicit class BeforeLoadEventArgsMutableBuilder[Self <: BeforeLoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjaxOptions(value: js.Any): Self = StObject.set(x, "AjaxOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxOptionsUndefined: Self = StObject.set(x, "AjaxOptions", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforePasteEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the key pressed key code value
      */
    var keyCode: js.UndefOr[Double] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the given target node values
      */
    var nodeDetails: js.UndefOr[js.Any] = js.native
    
    /** returns the target element, the given node to be pasted
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforePasteEventArgs {
    
    @scala.inline
    def apply(): BeforePasteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforePasteEventArgs]
    }
    
    @scala.inline
    implicit class BeforePasteEventArgsMutableBuilder[Self <: BeforePasteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setNodeDetails(value: js.Any): Self = StObject.set(x, "nodeDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeDetailsUndefined: Self = StObject.set(x, "nodeDetails", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforeSelectEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the given target node values
      */
    var nodeDetails: js.UndefOr[js.Any] = js.native
    
    /** returns the target element, the given node to be selected
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeSelectEventArgs {
    
    @scala.inline
    def apply(): BeforeSelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeSelectEventArgs]
    }
    
    @scala.inline
    implicit class BeforeSelectEventArgsMutableBuilder[Self <: BeforeSelectEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setNodeDetails(value: js.Any): Self = StObject.set(x, "nodeDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeDetailsUndefined: Self = StObject.set(x, "nodeDetails", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Fields extends StObject {
    
    /** It receives the child level or inner level data source such as Essential DataManager object and JSON object.
      */
    var child: js.UndefOr[js.Any] = js.native
    
    /** It receives Essential DataManager object and JSON object.
      */
    var dataSource: js.UndefOr[js.Any] = js.native
    
    /** Specifies the node to be in expanded state.
      */
    var expanded: js.UndefOr[String] = js.native
    
    /** Its allow us to indicate whether the node has child or not in load on demand
      */
    var hasChild: js.UndefOr[String] = js.native
    
    /** Specifies the HTML Attributes to &quot;li&quot; item list.
      */
    var htmlAttribute: js.UndefOr[js.Any] = js.native
    
    /** Specifies the id to TreeView node items list.
      */
    var id: js.UndefOr[String] = js.native
    
    /** Specifies the image attribute to â€œimgâ€ tag inside items list
      */
    var imageAttribute: js.UndefOr[js.Any] = js.native
    
    /** Specifies the HTML Attributes to &quot;li&quot; item list.
      */
    var imageUrl: js.UndefOr[String] = js.native
    
    /** If its true Checkbox node will be checked when rendered with checkbox.
      */
    var isChecked: js.UndefOr[String] = js.native
    
    /** Specifies the link attribute to â€œaâ€ tag in item list.
      */
    var linkAttribute: js.UndefOr[js.Any] = js.native
    
    /** Specifies the parent id of the node. The nodes are listed as child nodes of the specified parent node by using its parent id.
      */
    var parentId: js.UndefOr[String] = js.native
    
    /** It receives query to retrieve data from the table (query is same as SQL).
      */
    var query: js.UndefOr[js.Any] = js.native
    
    /** Allow us to specify the node to be in selected state
      */
    var selected: js.UndefOr[String] = js.native
    
    /** Specifies the sprite CSS class to &quot;li&quot; item list.
      */
    var spriteCssClass: js.UndefOr[String] = js.native
    
    /** It receives the table name to execute query on the corresponding table.
      */
    var tableName: js.UndefOr[String] = js.native
    
    /** Specifies the text of TreeView node items list.
      */
    var text: js.UndefOr[String] = js.native
  }
  object Fields {
    
    @scala.inline
    def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChild(value: js.Any): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setExpanded(value: String): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setHasChild(value: String): Self = StObject.set(x, "hasChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasChildUndefined: Self = StObject.set(x, "hasChild", js.undefined)
      
      @scala.inline
      def setHtmlAttribute(value: js.Any): Self = StObject.set(x, "htmlAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributeUndefined: Self = StObject.set(x, "htmlAttribute", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setImageAttribute(value: js.Any): Self = StObject.set(x, "imageAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageAttributeUndefined: Self = StObject.set(x, "imageAttribute", js.undefined)
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      @scala.inline
      def setIsChecked(value: String): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      @scala.inline
      def setLinkAttribute(value: js.Any): Self = StObject.set(x, "linkAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkAttributeUndefined: Self = StObject.set(x, "linkAttribute", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setSpriteCssClass(value: String): Self = StObject.set(x, "spriteCssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpriteCssClassUndefined: Self = StObject.set(x, "spriteCssClass", js.undefined)
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait InlineEditValidationEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the current node element id
      */
    var id: js.UndefOr[js.Any] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the new entered text for the node
      */
    var newText: js.UndefOr[String] = js.native
    
    /** returns the old node text
      */
    var oldText: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object InlineEditValidationEventArgs {
    
    @scala.inline
    def apply(): InlineEditValidationEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlineEditValidationEventArgs]
    }
    
    @scala.inline
    implicit class InlineEditValidationEventArgsMutableBuilder[Self <: InlineEditValidationEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewTextUndefined: Self = StObject.set(x, "newText", js.undefined)
      
      @scala.inline
      def setOldText(value: String): Self = StObject.set(x, "oldText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldTextUndefined: Self = StObject.set(x, "oldText", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait KeyPressEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the id of current TreeView node
      */
    var id: js.UndefOr[String] = js.native
    
    /** it returns when the current node is in expanded state; otherwise, false.
      */
    var isExpanded: js.UndefOr[Boolean] = js.native
    
    /** returns the key pressed key code value
      */
    var keyCode: js.UndefOr[Double] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the parentId of current TreeView node
      */
    var parentId: js.UndefOr[String] = js.native
    
    /** returns node path from root element
      */
    var path: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.native
  }
  object KeyPressEventArgs {
    
    @scala.inline
    def apply(): KeyPressEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyPressEventArgs]
    }
    
    @scala.inline
    implicit class KeyPressEventArgsMutableBuilder[Self <: KeyPressEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      @scala.inline
      def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait LoadErrorEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the AJAX error object
      */
    var error: js.UndefOr[js.Any] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LoadErrorEventArgs {
    
    @scala.inline
    def apply(): LoadErrorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadErrorEventArgs]
    }
    
    @scala.inline
    implicit class LoadErrorEventArgsMutableBuilder[Self <: LoadErrorEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait LoadSuccessEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the success data from the URL
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the given parent node details
      */
    var parentDetails: js.UndefOr[js.Any] = js.native
    
    /** returns the target parent element, the data returned from the URL to be appended to the given parent element, else in TreeView
      */
    var targetParent: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LoadSuccessEventArgs {
    
    @scala.inline
    def apply(): LoadSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadSuccessEventArgs]
    }
    
    @scala.inline
    implicit class LoadSuccessEventArgsMutableBuilder[Self <: LoadSuccessEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParentDetails(value: js.Any): Self = StObject.set(x, "parentDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentDetailsUndefined: Self = StObject.set(x, "parentDetails", js.undefined)
      
      @scala.inline
      def setTargetParent(value: js.Any): Self = StObject.set(x, "targetParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetParentUndefined: Self = StObject.set(x, "targetParent", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Gets or sets a value that indicates whether to enable drag and drop a node within the same tree.
      * @Default {false}
      */
    var allowDragAndDrop: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates whether to enable drag and drop a node in inter ej.TreeView.
      * @Default {true}
      */
    var allowDragAndDropAcrossControl: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates whether to drop a node to a child of particular node.
      * @Default {true}
      */
    var allowDropChild: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates whether to drop a node to a sibling of particular node.
      * @Default {true}
      */
    var allowDropSibling: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates whether to enable node editing support for TreeView.
      * @Default {false}
      */
    var allowEditing: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates whether to enable keyboard support for TreeView actions like nodeSelection, nodeEditing, nodeExpand, nodeCollapse, nodeCut and Paste.
      * @Default {true}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates whether to enable multi selection support for TreeView.
      * @Default {false}
      */
    var allowMultiSelection: js.UndefOr[Boolean] = js.native
    
    /** Allow us to specify the parent and child nodes to get auto check while we check or uncheck a node.
      * @Default {true}
      */
    var autoCheck: js.UndefOr[Boolean] = js.native
    
    /** Allow us to specify the parent node to be retain in checked or unchecked state instead of going for indeterminate state.
      * @Default {false}
      */
    var autoCheckParentNode: js.UndefOr[Boolean] = js.native
    
    /** Fires before adding node to TreeView.
      */
    var beforeAdd: js.UndefOr[js.Function1[/* e */ BeforeAddEventArgs, Unit]] = js.native
    
    /** Fires before collapse a node.
      */
    var beforeCollapse: js.UndefOr[js.Function1[/* e */ BeforeCollapseEventArgs, Unit]] = js.native
    
    /** Fires before cut node in TreeView.
      */
    var beforeCut: js.UndefOr[js.Function1[/* e */ BeforeCutEventArgs, Unit]] = js.native
    
    /** Fires before deleting node in TreeView.
      */
    var beforeDelete: js.UndefOr[js.Function1[/* e */ BeforeDeleteEventArgs, Unit]] = js.native
    
    /** Fires before editing the node in TreeView.
      */
    var beforeEdit: js.UndefOr[js.Function1[/* e */ BeforeEditEventArgs, Unit]] = js.native
    
    /** Fires before expanding the node.
      */
    var beforeExpand: js.UndefOr[js.Function1[/* e */ BeforeExpandEventArgs, Unit]] = js.native
    
    /** Fires before loading nodes to TreeView.
      */
    var beforeLoad: js.UndefOr[js.Function1[/* e */ BeforeLoadEventArgs, Unit]] = js.native
    
    /** Fires before paste node in TreeView.
      */
    var beforePaste: js.UndefOr[js.Function1[/* e */ BeforePasteEventArgs, Unit]] = js.native
    
    /** Fires before selecting node in TreeView.
      */
    var beforeSelect: js.UndefOr[js.Function1[/* e */ BeforeSelectEventArgs, Unit]] = js.native
    
    /** Gets or sets a value that indicates the checkedNodes index collection as an array. The given array index position denotes the nodes, that are checked while rendering TreeView.
      * @Default {[]}
      */
    var checkedNodes: js.UndefOr[js.Array[_]] = js.native
    
    /** Fires when TreeView created successfully.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
    
    /** Sets the root CSS class for TreeView which allow us to customize the appearance.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Fires when TreeView destroyed successfully.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
    
    /** Gets or sets a value that indicates whether to enable or disable the animation effect while expanding or collapsing a node.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Allow us to prevent multiple nodes to be in expanded state. If it set to false, previously expanded node will be collapsed automatically, while we expand a node.
      * @Default {true}
      */
    var enableMultipleExpand: js.UndefOr[Boolean] = js.native
    
    /** Sets a value that indicates whether to persist the TreeView model state in page using applicable medium i.e., HTML5 localStorage or cookies
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates to align content in the TreeView control from right to left by setting the property as true.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates whether a TreeView can be enabled or disabled. No actions can be performed while this property is set as false
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates the TreeView node can be expand or collapse by using the specified action.
      * @Default {dblclick}
      */
    var expandOn: js.UndefOr[String] = js.native
    
    /** Gets or sets a array of value that indicates the expandedNodes index collection as an array. The given array index position denotes the nodes, that are expanded while rendering
      * TreeView.
      * @Default {[]}
      */
    var expandedNodes: js.UndefOr[js.Array[_]] = js.native
    
    /** Gets or sets a fields object that allow us to map the data members with field properties in order to make the data binding easier.
      * @Default {null}
      */
    var fields: js.UndefOr[Fields] = js.native
    
    /** Gets or sets a value that indicates whether to enable full row selection support for TreeView.
      * @Default {false}
      */
    var fullRowSelect: js.UndefOr[Boolean] = js.native
    
    /** Defines the height of the TreeView.
      * @Default {Null}
      */
    var height: js.UndefOr[String | Double] = js.native
    
    /** Specifies the HTML Attributes for the TreeView. Using this API we can add custom attributes in TreeView control.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.native
    
    /** Fires before nodeEdit Successful.
      */
    var inlineEditValidation: js.UndefOr[js.Function1[/* e */ InlineEditValidationEventArgs, Unit]] = js.native
    
    /** Fires when key pressed successfully.
      */
    var keyPress: js.UndefOr[js.Function1[/* e */ KeyPressEventArgs, Unit]] = js.native
    
    /** Fires when data load fails.
      */
    var loadError: js.UndefOr[js.Function1[/* e */ LoadErrorEventArgs, Unit]] = js.native
    
    /** Specifies the child nodes to be loaded on demand
      * @Default {false}
      */
    var loadOnDemand: js.UndefOr[Boolean] = js.native
    
    /** Fires when data loaded successfully.
      */
    var loadSuccess: js.UndefOr[js.Function1[/* e */ LoadSuccessEventArgs, Unit]] = js.native
    
    /** Fires once node added successfully.
      */
    var nodeAdd: js.UndefOr[js.Function1[/* e */ NodeAddEventArgs, Unit]] = js.native
    
    /** Fires once node checked successfully.
      */
    var nodeCheck: js.UndefOr[js.Function1[/* e */ NodeCheckEventArgs, Unit]] = js.native
    
    /** Fires when node clicked successfully.
      */
    var nodeClick: js.UndefOr[js.Function1[/* e */ NodeClickEventArgs, Unit]] = js.native
    
    /** Fires when node collapsed successfully.
      */
    var nodeCollapse: js.UndefOr[js.Function1[/* e */ NodeCollapseEventArgs, Unit]] = js.native
    
    /** Fires when node cut successfully.
      */
    var nodeCut: js.UndefOr[js.Function1[/* e */ NodeCutEventArgs, Unit]] = js.native
    
    /** Fires when node deleted successfully.
      */
    var nodeDelete: js.UndefOr[js.Function1[/* e */ NodeDeleteEventArgs, Unit]] = js.native
    
    /** Fires when node dragging.
      */
    var nodeDrag: js.UndefOr[js.Function1[/* e */ NodeDragEventArgs, Unit]] = js.native
    
    /** Fires once node drag start successfully.
      */
    var nodeDragStart: js.UndefOr[js.Function1[/* e */ NodeDragStartEventArgs, Unit]] = js.native
    
    /** Fires before the dragged node to be dropped.
      */
    var nodeDragStop: js.UndefOr[js.Function1[/* e */ NodeDragStopEventArgs, Unit]] = js.native
    
    /** Fires once node dropped successfully.
      */
    var nodeDropped: js.UndefOr[js.Function1[/* e */ NodeDroppedEventArgs, Unit]] = js.native
    
    /** Fires once node edited successfully.
      */
    var nodeEdit: js.UndefOr[js.Function1[/* e */ NodeEditEventArgs, Unit]] = js.native
    
    /** Fires once node expanded successfully.
      */
    var nodeExpand: js.UndefOr[js.Function1[/* e */ NodeExpandEventArgs, Unit]] = js.native
    
    /** Fires once node pasted successfully.
      */
    var nodePaste: js.UndefOr[js.Function1[/* e */ NodePasteEventArgs, Unit]] = js.native
    
    /** Fires when node selected successfully.
      */
    var nodeSelect: js.UndefOr[js.Function1[/* e */ NodeSelectEventArgs, Unit]] = js.native
    
    /** Fires once node unchecked successfully.
      */
    var nodeUncheck: js.UndefOr[js.Function1[/* e */ NodeUncheckEventArgs, Unit]] = js.native
    
    /** Fires once node unselected successfully.
      */
    var nodeUnselect: js.UndefOr[js.Function1[/* e */ NodeUnselectEventArgs, Unit]] = js.native
    
    /** Fires when TreeView nodes are loaded successfully
      */
    var ready: js.UndefOr[js.Function1[/* e */ ReadyEventArgs, Unit]] = js.native
    
    /** Gets or Sets a value that indicates the index position of a tree node. The particular index tree node will be selected while rendering the TreeView.
      * @Default {-1}
      */
    var selectedNode: js.UndefOr[Double] = js.native
    
    /** Gets or sets a value that indicates the selectedNodes index collection as an array. The given array index position denotes the nodes, that are selected while rendering TreeView.
      * @Default {[]}
      */
    var selectedNodes: js.UndefOr[js.Array[_]] = js.native
    
    /** Gets or sets a value that indicates whether to display or hide checkbox for all TreeView nodes.
      * @Default {false}
      */
    var showCheckbox: js.UndefOr[Boolean] = js.native
    
    /** By using sortSettings property, you can customize the sorting option in TreeView control.
      */
    var sortSettings: js.UndefOr[SortSettings] = js.native
    
    /** Allow us to use custom template in order to create TreeView.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.native
    
    /** Defines the width of the TreeView.
      * @Default {Null}
      */
    var width: js.UndefOr[String | Double] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.TreeView.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.TreeView.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.TreeView.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDragAndDrop(value: Boolean): Self = StObject.set(x, "allowDragAndDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDragAndDropAcrossControl(value: Boolean): Self = StObject.set(x, "allowDragAndDropAcrossControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDragAndDropAcrossControlUndefined: Self = StObject.set(x, "allowDragAndDropAcrossControl", js.undefined)
      
      @scala.inline
      def setAllowDragAndDropUndefined: Self = StObject.set(x, "allowDragAndDrop", js.undefined)
      
      @scala.inline
      def setAllowDropChild(value: Boolean): Self = StObject.set(x, "allowDropChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDropChildUndefined: Self = StObject.set(x, "allowDropChild", js.undefined)
      
      @scala.inline
      def setAllowDropSibling(value: Boolean): Self = StObject.set(x, "allowDropSibling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDropSiblingUndefined: Self = StObject.set(x, "allowDropSibling", js.undefined)
      
      @scala.inline
      def setAllowEditing(value: Boolean): Self = StObject.set(x, "allowEditing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEditingUndefined: Self = StObject.set(x, "allowEditing", js.undefined)
      
      @scala.inline
      def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      @scala.inline
      def setAllowMultiSelection(value: Boolean): Self = StObject.set(x, "allowMultiSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMultiSelectionUndefined: Self = StObject.set(x, "allowMultiSelection", js.undefined)
      
      @scala.inline
      def setAutoCheck(value: Boolean): Self = StObject.set(x, "autoCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCheckParentNode(value: Boolean): Self = StObject.set(x, "autoCheckParentNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCheckParentNodeUndefined: Self = StObject.set(x, "autoCheckParentNode", js.undefined)
      
      @scala.inline
      def setAutoCheckUndefined: Self = StObject.set(x, "autoCheck", js.undefined)
      
      @scala.inline
      def setBeforeAdd(value: /* e */ BeforeAddEventArgs => Unit): Self = StObject.set(x, "beforeAdd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeAddUndefined: Self = StObject.set(x, "beforeAdd", js.undefined)
      
      @scala.inline
      def setBeforeCollapse(value: /* e */ BeforeCollapseEventArgs => Unit): Self = StObject.set(x, "beforeCollapse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeCollapseUndefined: Self = StObject.set(x, "beforeCollapse", js.undefined)
      
      @scala.inline
      def setBeforeCut(value: /* e */ BeforeCutEventArgs => Unit): Self = StObject.set(x, "beforeCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeCutUndefined: Self = StObject.set(x, "beforeCut", js.undefined)
      
      @scala.inline
      def setBeforeDelete(value: /* e */ BeforeDeleteEventArgs => Unit): Self = StObject.set(x, "beforeDelete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeDeleteUndefined: Self = StObject.set(x, "beforeDelete", js.undefined)
      
      @scala.inline
      def setBeforeEdit(value: /* e */ BeforeEditEventArgs => Unit): Self = StObject.set(x, "beforeEdit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeEditUndefined: Self = StObject.set(x, "beforeEdit", js.undefined)
      
      @scala.inline
      def setBeforeExpand(value: /* e */ BeforeExpandEventArgs => Unit): Self = StObject.set(x, "beforeExpand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeExpandUndefined: Self = StObject.set(x, "beforeExpand", js.undefined)
      
      @scala.inline
      def setBeforeLoad(value: /* e */ BeforeLoadEventArgs => Unit): Self = StObject.set(x, "beforeLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeLoadUndefined: Self = StObject.set(x, "beforeLoad", js.undefined)
      
      @scala.inline
      def setBeforePaste(value: /* e */ BeforePasteEventArgs => Unit): Self = StObject.set(x, "beforePaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforePasteUndefined: Self = StObject.set(x, "beforePaste", js.undefined)
      
      @scala.inline
      def setBeforeSelect(value: /* e */ BeforeSelectEventArgs => Unit): Self = StObject.set(x, "beforeSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeSelectUndefined: Self = StObject.set(x, "beforeSelect", js.undefined)
      
      @scala.inline
      def setCheckedNodes(value: js.Array[_]): Self = StObject.set(x, "checkedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedNodesUndefined: Self = StObject.set(x, "checkedNodes", js.undefined)
      
      @scala.inline
      def setCheckedNodesVarargs(value: js.Any*): Self = StObject.set(x, "checkedNodes", js.Array(value :_*))
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setEnableMultipleExpand(value: Boolean): Self = StObject.set(x, "enableMultipleExpand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMultipleExpandUndefined: Self = StObject.set(x, "enableMultipleExpand", js.undefined)
      
      @scala.inline
      def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setExpandOn(value: String): Self = StObject.set(x, "expandOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandOnUndefined: Self = StObject.set(x, "expandOn", js.undefined)
      
      @scala.inline
      def setExpandedNodes(value: js.Array[_]): Self = StObject.set(x, "expandedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedNodesUndefined: Self = StObject.set(x, "expandedNodes", js.undefined)
      
      @scala.inline
      def setExpandedNodesVarargs(value: js.Any*): Self = StObject.set(x, "expandedNodes", js.Array(value :_*))
      
      @scala.inline
      def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFullRowSelect(value: Boolean): Self = StObject.set(x, "fullRowSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullRowSelectUndefined: Self = StObject.set(x, "fullRowSelect", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setInlineEditValidation(value: /* e */ InlineEditValidationEventArgs => Unit): Self = StObject.set(x, "inlineEditValidation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInlineEditValidationUndefined: Self = StObject.set(x, "inlineEditValidation", js.undefined)
      
      @scala.inline
      def setKeyPress(value: /* e */ KeyPressEventArgs => Unit): Self = StObject.set(x, "keyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyPressUndefined: Self = StObject.set(x, "keyPress", js.undefined)
      
      @scala.inline
      def setLoadError(value: /* e */ LoadErrorEventArgs => Unit): Self = StObject.set(x, "loadError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadErrorUndefined: Self = StObject.set(x, "loadError", js.undefined)
      
      @scala.inline
      def setLoadOnDemand(value: Boolean): Self = StObject.set(x, "loadOnDemand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadOnDemandUndefined: Self = StObject.set(x, "loadOnDemand", js.undefined)
      
      @scala.inline
      def setLoadSuccess(value: /* e */ LoadSuccessEventArgs => Unit): Self = StObject.set(x, "loadSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadSuccessUndefined: Self = StObject.set(x, "loadSuccess", js.undefined)
      
      @scala.inline
      def setNodeAdd(value: /* e */ NodeAddEventArgs => Unit): Self = StObject.set(x, "nodeAdd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeAddUndefined: Self = StObject.set(x, "nodeAdd", js.undefined)
      
      @scala.inline
      def setNodeCheck(value: /* e */ NodeCheckEventArgs => Unit): Self = StObject.set(x, "nodeCheck", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeCheckUndefined: Self = StObject.set(x, "nodeCheck", js.undefined)
      
      @scala.inline
      def setNodeClick(value: /* e */ NodeClickEventArgs => Unit): Self = StObject.set(x, "nodeClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeClickUndefined: Self = StObject.set(x, "nodeClick", js.undefined)
      
      @scala.inline
      def setNodeCollapse(value: /* e */ NodeCollapseEventArgs => Unit): Self = StObject.set(x, "nodeCollapse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeCollapseUndefined: Self = StObject.set(x, "nodeCollapse", js.undefined)
      
      @scala.inline
      def setNodeCut(value: /* e */ NodeCutEventArgs => Unit): Self = StObject.set(x, "nodeCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeCutUndefined: Self = StObject.set(x, "nodeCut", js.undefined)
      
      @scala.inline
      def setNodeDelete(value: /* e */ NodeDeleteEventArgs => Unit): Self = StObject.set(x, "nodeDelete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeDeleteUndefined: Self = StObject.set(x, "nodeDelete", js.undefined)
      
      @scala.inline
      def setNodeDrag(value: /* e */ NodeDragEventArgs => Unit): Self = StObject.set(x, "nodeDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeDragStart(value: /* e */ NodeDragStartEventArgs => Unit): Self = StObject.set(x, "nodeDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeDragStartUndefined: Self = StObject.set(x, "nodeDragStart", js.undefined)
      
      @scala.inline
      def setNodeDragStop(value: /* e */ NodeDragStopEventArgs => Unit): Self = StObject.set(x, "nodeDragStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeDragStopUndefined: Self = StObject.set(x, "nodeDragStop", js.undefined)
      
      @scala.inline
      def setNodeDragUndefined: Self = StObject.set(x, "nodeDrag", js.undefined)
      
      @scala.inline
      def setNodeDropped(value: /* e */ NodeDroppedEventArgs => Unit): Self = StObject.set(x, "nodeDropped", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeDroppedUndefined: Self = StObject.set(x, "nodeDropped", js.undefined)
      
      @scala.inline
      def setNodeEdit(value: /* e */ NodeEditEventArgs => Unit): Self = StObject.set(x, "nodeEdit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeEditUndefined: Self = StObject.set(x, "nodeEdit", js.undefined)
      
      @scala.inline
      def setNodeExpand(value: /* e */ NodeExpandEventArgs => Unit): Self = StObject.set(x, "nodeExpand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeExpandUndefined: Self = StObject.set(x, "nodeExpand", js.undefined)
      
      @scala.inline
      def setNodePaste(value: /* e */ NodePasteEventArgs => Unit): Self = StObject.set(x, "nodePaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodePasteUndefined: Self = StObject.set(x, "nodePaste", js.undefined)
      
      @scala.inline
      def setNodeSelect(value: /* e */ NodeSelectEventArgs => Unit): Self = StObject.set(x, "nodeSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeSelectUndefined: Self = StObject.set(x, "nodeSelect", js.undefined)
      
      @scala.inline
      def setNodeUncheck(value: /* e */ NodeUncheckEventArgs => Unit): Self = StObject.set(x, "nodeUncheck", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeUncheckUndefined: Self = StObject.set(x, "nodeUncheck", js.undefined)
      
      @scala.inline
      def setNodeUnselect(value: /* e */ NodeUnselectEventArgs => Unit): Self = StObject.set(x, "nodeUnselect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeUnselectUndefined: Self = StObject.set(x, "nodeUnselect", js.undefined)
      
      @scala.inline
      def setReady(value: /* e */ ReadyEventArgs => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      @scala.inline
      def setSelectedNode(value: Double): Self = StObject.set(x, "selectedNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedNodeUndefined: Self = StObject.set(x, "selectedNode", js.undefined)
      
      @scala.inline
      def setSelectedNodes(value: js.Array[_]): Self = StObject.set(x, "selectedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedNodesUndefined: Self = StObject.set(x, "selectedNodes", js.undefined)
      
      @scala.inline
      def setSelectedNodesVarargs(value: js.Any*): Self = StObject.set(x, "selectedNodes", js.Array(value :_*))
      
      @scala.inline
      def setShowCheckbox(value: Boolean): Self = StObject.set(x, "showCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCheckboxUndefined: Self = StObject.set(x, "showCheckbox", js.undefined)
      
      @scala.inline
      def setSortSettings(value: SortSettings): Self = StObject.set(x, "sortSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortSettingsUndefined: Self = StObject.set(x, "sortSettings", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait NodeAddEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the added data, that are given initially
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the newly added elements
      */
    var nodes: js.UndefOr[js.Any] = js.native
    
    /** returns the given parent node details
      */
    var parentDetails: js.UndefOr[js.Any] = js.native
    
    /** returns the target parent element of the added element
      */
    var parentElement: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object NodeAddEventArgs {
    
    @scala.inline
    def apply(): NodeAddEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeAddEventArgs]
    }
    
    @scala.inline
    implicit class NodeAddEventArgsMutableBuilder[Self <: NodeAddEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setNodes(value: js.Any): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      @scala.inline
      def setParentDetails(value: js.Any): Self = StObject.set(x, "parentDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentDetailsUndefined: Self = StObject.set(x, "parentDetails", js.undefined)
      
      @scala.inline
      def setParentElement(value: js.Any): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElementUndefined: Self = StObject.set(x, "parentElement", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodeCheckEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** it returns the currently checked and its child node details
      */
    var currentCheckedNodes: js.UndefOr[js.Array[_]] = js.native
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.native
    
    /** it returns the currently checked node name
      */
    var currentNode: js.UndefOr[js.Array[_]] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the id of the current element of the node clicked
      */
    var id: js.UndefOr[String] = js.native
    
    /** it returns true when the node checkbox is checked; otherwise, false.
      */
    var isChecked: js.UndefOr[Boolean] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the id of the parent element of current element of the node clicked
      */
    var parentId: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.native
  }
  object NodeCheckEventArgs {
    
    @scala.inline
    def apply(): NodeCheckEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeCheckEventArgs]
    }
    
    @scala.inline
    implicit class NodeCheckEventArgsMutableBuilder[Self <: NodeCheckEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentCheckedNodes(value: js.Array[_]): Self = StObject.set(x, "currentCheckedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentCheckedNodesUndefined: Self = StObject.set(x, "currentCheckedNodes", js.undefined)
      
      @scala.inline
      def setCurrentCheckedNodesVarargs(value: js.Any*): Self = StObject.set(x, "currentCheckedNodes", js.Array(value :_*))
      
      @scala.inline
      def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      @scala.inline
      def setCurrentNode(value: js.Array[_]): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentNodeUndefined: Self = StObject.set(x, "currentNode", js.undefined)
      
      @scala.inline
      def setCurrentNodeVarargs(value: js.Any*): Self = StObject.set(x, "currentNode", js.Array(value :_*))
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait NodeClickEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the id of currently clicked TreeView node
      */
    var id: js.UndefOr[String] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the parentId of currently clicked TreeView node
      */
    var parentId: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object NodeClickEventArgs {
    
    @scala.inline
    def apply(): NodeClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeClickEventArgs]
    }
    
    @scala.inline
    implicit class NodeClickEventArgsMutableBuilder[Self <: NodeClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodeCollapseEventArgs extends StObject {
    
    /** returns the format asynchronous or synchronous
      */
    var async: js.UndefOr[Boolean] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.native
    
    /** returns the id of the current element of the node clicked
      */
    var id: js.UndefOr[String] = js.native
    
    /** returns the child nodes are loaded or not
      */
    var isChildLoaded: js.UndefOr[Boolean] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the id of the parent element of current element of the node clicked
      */
    var parentId: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.native
  }
  object NodeCollapseEventArgs {
    
    @scala.inline
    def apply(): NodeCollapseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeCollapseEventArgs]
    }
    
    @scala.inline
    implicit class NodeCollapseEventArgsMutableBuilder[Self <: NodeCollapseEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsChildLoaded(value: Boolean): Self = StObject.set(x, "isChildLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChildLoadedUndefined: Self = StObject.set(x, "isChildLoaded", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait NodeCutEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the key pressed key code value
      */
    var keyCode: js.UndefOr[Double] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the given parent node details
      */
    var parentDetails: js.UndefOr[js.Any] = js.native
    
    /** returns the current parent element of the cut node
      */
    var parentElement: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object NodeCutEventArgs {
    
    @scala.inline
    def apply(): NodeCutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeCutEventArgs]
    }
    
    @scala.inline
    implicit class NodeCutEventArgsMutableBuilder[Self <: NodeCutEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParentDetails(value: js.Any): Self = StObject.set(x, "parentDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentDetailsUndefined: Self = StObject.set(x, "parentDetails", js.undefined)
      
      @scala.inline
      def setParentElement(value: js.Any): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElementUndefined: Self = StObject.set(x, "parentElement", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodeDeleteEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the given parent node details
      */
    var parentDetails: js.UndefOr[js.Any] = js.native
    
    /** returns the current parent element of the deleted node
      */
    var parentElement: js.UndefOr[js.Any] = js.native
    
    /** returns the currently removed nodes
      */
    var removedNodes: js.UndefOr[js.Array[_]] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object NodeDeleteEventArgs {
    
    @scala.inline
    def apply(): NodeDeleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeDeleteEventArgs]
    }
    
    @scala.inline
    implicit class NodeDeleteEventArgsMutableBuilder[Self <: NodeDeleteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParentDetails(value: js.Any): Self = StObject.set(x, "parentDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentDetailsUndefined: Self = StObject.set(x, "parentDetails", js.undefined)
      
      @scala.inline
      def setParentElement(value: js.Any): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElementUndefined: Self = StObject.set(x, "parentElement", js.undefined)
      
      @scala.inline
      def setRemovedNodes(value: js.Array[_]): Self = StObject.set(x, "removedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedNodesUndefined: Self = StObject.set(x, "removedNodes", js.undefined)
      
      @scala.inline
      def setRemovedNodesVarargs(value: js.Any*): Self = StObject.set(x, "removedNodes", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodeDragEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the original drag target
      */
    var dragTarget: js.UndefOr[js.Any] = js.native
    
    /** returns the current parent element of the target node
      */
    var draggedElement: js.UndefOr[js.Any] = js.native
    
    /** returns the given parent node details
      */
    var draggedElementData: js.UndefOr[js.Any] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the current target TreeView node
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the current target details
      */
    var targetElementData: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object NodeDragEventArgs {
    
    @scala.inline
    def apply(): NodeDragEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeDragEventArgs]
    }
    
    @scala.inline
    implicit class NodeDragEventArgsMutableBuilder[Self <: NodeDragEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDragTarget(value: js.Any): Self = StObject.set(x, "dragTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragTargetUndefined: Self = StObject.set(x, "dragTarget", js.undefined)
      
      @scala.inline
      def setDraggedElement(value: js.Any): Self = StObject.set(x, "draggedElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedElementData(value: js.Any): Self = StObject.set(x, "draggedElementData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedElementDataUndefined: Self = StObject.set(x, "draggedElementData", js.undefined)
      
      @scala.inline
      def setDraggedElementUndefined: Self = StObject.set(x, "draggedElement", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementData(value: js.Any): Self = StObject.set(x, "targetElementData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementDataUndefined: Self = StObject.set(x, "targetElementData", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodeDragStartEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the original drag target
      */
    var dragTarget: js.UndefOr[js.Any] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the current dragging parent TreeView node
      */
    var parentElement: js.UndefOr[js.Any] = js.native
    
    /** returns the current dragging parent TreeView node details
      */
    var parentElementData: js.UndefOr[js.Any] = js.native
    
    /** returns the current parent element of the dragging node
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the given parent node details
      */
    var targetElementData: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object NodeDragStartEventArgs {
    
    @scala.inline
    def apply(): NodeDragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeDragStartEventArgs]
    }
    
    @scala.inline
    implicit class NodeDragStartEventArgsMutableBuilder[Self <: NodeDragStartEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDragTarget(value: js.Any): Self = StObject.set(x, "dragTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragTargetUndefined: Self = StObject.set(x, "dragTarget", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParentElement(value: js.Any): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElementData(value: js.Any): Self = StObject.set(x, "parentElementData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElementDataUndefined: Self = StObject.set(x, "parentElementData", js.undefined)
      
      @scala.inline
      def setParentElementUndefined: Self = StObject.set(x, "parentElement", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementData(value: js.Any): Self = StObject.set(x, "targetElementData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementDataUndefined: Self = StObject.set(x, "targetElementData", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodeDragStopEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the current dragged TreeView node
      */
    var draggedElement: js.UndefOr[js.Any] = js.native
    
    /** returns the current dragged TreeView node details
      */
    var draggedElementData: js.UndefOr[js.Any] = js.native
    
    /** returns the original drop target
      */
    var dropTarget: js.UndefOr[js.Any] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the drop position such as before, after or over
      */
    var position: js.UndefOr[String] = js.native
    
    /** if it is true, the parent node will be prevented from auto expanding; otherwise, it work's usually
      */
    var preventTargetExpand: js.UndefOr[Boolean] = js.native
    
    /** returns the current parent element of the dragged node
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the given parent node details
      */
    var targetElementData: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object NodeDragStopEventArgs {
    
    @scala.inline
    def apply(): NodeDragStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeDragStopEventArgs]
    }
    
    @scala.inline
    implicit class NodeDragStopEventArgsMutableBuilder[Self <: NodeDragStopEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDraggedElement(value: js.Any): Self = StObject.set(x, "draggedElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedElementData(value: js.Any): Self = StObject.set(x, "draggedElementData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedElementDataUndefined: Self = StObject.set(x, "draggedElementData", js.undefined)
      
      @scala.inline
      def setDraggedElementUndefined: Self = StObject.set(x, "draggedElement", js.undefined)
      
      @scala.inline
      def setDropTarget(value: js.Any): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPreventTargetExpand(value: Boolean): Self = StObject.set(x, "preventTargetExpand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventTargetExpandUndefined: Self = StObject.set(x, "preventTargetExpand", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementData(value: js.Any): Self = StObject.set(x, "targetElementData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementDataUndefined: Self = StObject.set(x, "targetElementData", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodeDroppedEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the original drop target
      */
    var dropTarget: js.UndefOr[js.Any] = js.native
    
    /** returns the current dropped TreeView node
      */
    var droppedElement: js.UndefOr[js.Any] = js.native
    
    /** returns the current dropped TreeView node details
      */
    var droppedElementData: js.UndefOr[js.Any] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the drop position such as before, after or over
      */
    var position: js.UndefOr[String] = js.native
    
    /** returns the current parent element of the dropped node
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the given parent node details
      */
    var targetElementData: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object NodeDroppedEventArgs {
    
    @scala.inline
    def apply(): NodeDroppedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeDroppedEventArgs]
    }
    
    @scala.inline
    implicit class NodeDroppedEventArgsMutableBuilder[Self <: NodeDroppedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDropTarget(value: js.Any): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
      
      @scala.inline
      def setDroppedElement(value: js.Any): Self = StObject.set(x, "droppedElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDroppedElementData(value: js.Any): Self = StObject.set(x, "droppedElementData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDroppedElementDataUndefined: Self = StObject.set(x, "droppedElementData", js.undefined)
      
      @scala.inline
      def setDroppedElementUndefined: Self = StObject.set(x, "droppedElement", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementData(value: js.Any): Self = StObject.set(x, "targetElementData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementDataUndefined: Self = StObject.set(x, "targetElementData", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodeEditEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the id of the element
      */
    var id: js.UndefOr[String] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the newText of the element
      */
    var newText: js.UndefOr[String] = js.native
    
    /** returns the given target node values
      */
    var nodeDetails: js.UndefOr[js.Any] = js.native
    
    /** returns the oldText of the element
      */
    var oldText: js.UndefOr[String] = js.native
    
    /** returns the target element, the given node to be cut
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object NodeEditEventArgs {
    
    @scala.inline
    def apply(): NodeEditEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeEditEventArgs]
    }
    
    @scala.inline
    implicit class NodeEditEventArgsMutableBuilder[Self <: NodeEditEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewTextUndefined: Self = StObject.set(x, "newText", js.undefined)
      
      @scala.inline
      def setNodeDetails(value: js.Any): Self = StObject.set(x, "nodeDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeDetailsUndefined: Self = StObject.set(x, "nodeDetails", js.undefined)
      
      @scala.inline
      def setOldText(value: String): Self = StObject.set(x, "oldText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldTextUndefined: Self = StObject.set(x, "oldText", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodeExpandEventArgs extends StObject {
    
    /** returns the format asynchronous or synchronous
      */
    var async: js.UndefOr[Boolean] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.native
    
    /** returns the id of currently clicked node
      */
    var id: js.UndefOr[String] = js.native
    
    /** if the child node is ready to expanded state; otherwise, false.
      */
    var isChildLoaded: js.UndefOr[Boolean] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the parent id of currently clicked node
      */
    var parentId: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.native
  }
  object NodeExpandEventArgs {
    
    @scala.inline
    def apply(): NodeExpandEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeExpandEventArgs]
    }
    
    @scala.inline
    implicit class NodeExpandEventArgsMutableBuilder[Self <: NodeExpandEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsChildLoaded(value: Boolean): Self = StObject.set(x, "isChildLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChildLoadedUndefined: Self = StObject.set(x, "isChildLoaded", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait NodePasteEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the key pressed key code value
      */
    var keyCode: js.UndefOr[Double] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the given target node values
      */
    var nodeDetails: js.UndefOr[js.Any] = js.native
    
    /** returns the pasted element
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object NodePasteEventArgs {
    
    @scala.inline
    def apply(): NodePasteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodePasteEventArgs]
    }
    
    @scala.inline
    implicit class NodePasteEventArgsMutableBuilder[Self <: NodePasteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setNodeDetails(value: js.Any): Self = StObject.set(x, "nodeDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeDetailsUndefined: Self = StObject.set(x, "nodeDetails", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodeSelectEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.native
    
    /** returns the id of the current element of the node clicked
      */
    var id: js.UndefOr[js.Any] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the id of the parent element of current element of the node clicked
      */
    var parentId: js.UndefOr[js.Any] = js.native
    
    /** returns the current selected nodes index of TreeView
      */
    var selectedNodes: js.UndefOr[js.Array[_]] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.native
  }
  object NodeSelectEventArgs {
    
    @scala.inline
    def apply(): NodeSelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeSelectEventArgs]
    }
    
    @scala.inline
    implicit class NodeSelectEventArgsMutableBuilder[Self <: NodeSelectEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParentId(value: js.Any): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setSelectedNodes(value: js.Array[_]): Self = StObject.set(x, "selectedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedNodesUndefined: Self = StObject.set(x, "selectedNodes", js.undefined)
      
      @scala.inline
      def setSelectedNodesVarargs(value: js.Any*): Self = StObject.set(x, "selectedNodes", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait NodeUncheckEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the current element of the node clicked
      */
    var currentElement: js.UndefOr[js.Any] = js.native
    
    /** it returns currently unchecked node name
      */
    var currentNode: js.UndefOr[String] = js.native
    
    /** it returns currently unchecked node and its child node details.
      */
    var currentUncheckedNodes: js.UndefOr[js.Array[_]] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the id of the current element of the node clicked
      */
    var id: js.UndefOr[js.Any] = js.native
    
    /** it returns true when the node checkbox is checked; otherwise, false.
      */
    var isChecked: js.UndefOr[Boolean] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the id of the parent element of current element of the node clicked
      */
    var parentId: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.native
  }
  object NodeUncheckEventArgs {
    
    @scala.inline
    def apply(): NodeUncheckEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeUncheckEventArgs]
    }
    
    @scala.inline
    implicit class NodeUncheckEventArgsMutableBuilder[Self <: NodeUncheckEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      @scala.inline
      def setCurrentNode(value: String): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentNodeUndefined: Self = StObject.set(x, "currentNode", js.undefined)
      
      @scala.inline
      def setCurrentUncheckedNodes(value: js.Array[_]): Self = StObject.set(x, "currentUncheckedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUncheckedNodesUndefined: Self = StObject.set(x, "currentUncheckedNodes", js.undefined)
      
      @scala.inline
      def setCurrentUncheckedNodesVarargs(value: js.Any*): Self = StObject.set(x, "currentUncheckedNodes", js.Array(value :_*))
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParentId(value: js.Any): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait NodeUnselectEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the current element of the node unselected
      */
    var currentElement: js.UndefOr[js.Any] = js.native
    
    /** returns the id of the current element of the node unselected
      */
    var id: js.UndefOr[String] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the id of the parent element of current element of the node unselected
      */
    var parentId: js.UndefOr[String] = js.native
    
    /** returns the current selected nodes index of TreeView
      */
    var selectedNodes: js.UndefOr[js.Array[_]] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the value of the node
      */
    var value: js.UndefOr[String] = js.native
  }
  object NodeUnselectEventArgs {
    
    @scala.inline
    def apply(): NodeUnselectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeUnselectEventArgs]
    }
    
    @scala.inline
    implicit class NodeUnselectEventArgsMutableBuilder[Self <: NodeUnselectEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentElement(value: js.Any): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setSelectedNodes(value: js.Array[_]): Self = StObject.set(x, "selectedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedNodesUndefined: Self = StObject.set(x, "selectedNodes", js.undefined)
      
      @scala.inline
      def setSelectedNodesVarargs(value: js.Any*): Self = StObject.set(x, "selectedNodes", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ReadyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the TreeView model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ReadyEventArgs {
    
    @scala.inline
    def apply(): ReadyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadyEventArgs]
    }
    
    @scala.inline
    implicit class ReadyEventArgsMutableBuilder[Self <: ReadyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SortSettings extends StObject {
    
    /** Enables or disables the sorting option in TreeView control
      * @Default {false}
      */
    var allowSorting: js.UndefOr[Boolean] = js.native
    
    /** Sets the sorting order type. There are two sorting types available, such as &quot;ascending&quot;, &quot;descending&quot;.
      * @Default {ej.sortOrder.Ascending}
      */
    var sortOrder: js.UndefOr[typings.ejWebAll.ej.sortOrder | String] = js.native
  }
  object SortSettings {
    
    @scala.inline
    def apply(): SortSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortSettings]
    }
    
    @scala.inline
    implicit class SortSettingsMutableBuilder[Self <: SortSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
      
      @scala.inline
      def setSortOrder(value: sortOrder | String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
}
