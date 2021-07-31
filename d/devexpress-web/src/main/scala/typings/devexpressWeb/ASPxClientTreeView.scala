package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxTreeView object.
  */
trait ASPxClientTreeView
  extends StObject
     with ASPxClientControl {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTreeView]]
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientTreeView.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTreeView]]
  
  /**
    * Occurs on the client side when the node's checked state is changed by clicking on a check box.
    */
  var CheckedChanged: ASPxClientEvent[ASPxClientTreeViewNodeProcessingModeEventHandler[ASPxClientTreeView]]
  
  /**
    * Collapses all nodes in the ASPxTreeView on the client side.
    */
  def CollapseAll(): Unit
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTreeView]]
  
  /**
    * Expands all nodes in the ASPxTreeView on the client side.
    */
  def ExpandAll(): Unit
  
  /**
    * Fires on the client side after a node's expansion state has been changed by end-user interaction.
    */
  var ExpandedChanged: ASPxClientEvent[ASPxClientTreeViewNodeEventHandler[ASPxClientTreeView]]
  
  /**
    * Fires on the client side before the expansion state of a node is changed via end-user interaction.
    */
  var ExpandedChanging: ASPxClientEvent[ASPxClientTreeViewNodeCancelEventHandler[ASPxClientTreeView]]
  
  /**
    * Returns a node specified by its index within the ASPxTreeView's node collection. An ASPxClientTreeViewNode object, representing the node located at the specified index within the ASPxTreeView's node collection.
    * @param index An integer value specifying the zero-based index of the node to be retrieved.
    */
  def GetNode(index: Double): ASPxClientTreeViewNode
  
  /**
    * Returns a node specified by its name. An ASPxClientTreeViewNode object that represents the node with the specified name.
    * @param name A string value specifying the name of the node.
    */
  def GetNodeByName(name: String): ASPxClientTreeViewNode
  
  /**
    * Returns a node specified by its text. An ASPxClientTreeViewNode object that represents the node with the specified node's text content.
    * @param text A string value specifying the text content of the node.
    */
  def GetNodeByText(text: String): ASPxClientTreeViewNode
  
  /**
    * Returns the number of nodes at the ASPxTreeView's zero level.
    */
  def GetNodeCount(): Double
  
  /**
    * Gets the root node of the ASPxTreeView object.
    */
  def GetRootNode(): ASPxClientTreeViewNode
  
  /**
    * Returns the selected node within the ASPxTreeView control on the client side.
    */
  def GetSelectedNode(): ASPxClientTreeViewNode
  
  /**
    * Fires on the client side after a node has been clicked.
    */
  var NodeClick: ASPxClientEvent[ASPxClientTreeViewNodeClickEventHandler[ASPxClientTreeView]]
  
  /**
    * Selects the specified node within the ASPxTreeView control on the client side.
    * @param node An ASPxClientTreeViewNode object specifying the node to select.
    */
  def SetSelectedNode(node: ASPxClientTreeViewNode): Unit
}
object ASPxClientTreeView {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTreeView]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTreeView]],
    CheckedChanged: ASPxClientEvent[ASPxClientTreeViewNodeProcessingModeEventHandler[ASPxClientTreeView]],
    CollapseAll: () => Unit,
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTreeView]],
    ExpandAll: () => Unit,
    ExpandedChanged: ASPxClientEvent[ASPxClientTreeViewNodeEventHandler[ASPxClientTreeView]],
    ExpandedChanging: ASPxClientEvent[ASPxClientTreeViewNodeCancelEventHandler[ASPxClientTreeView]],
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetNode: Double => ASPxClientTreeViewNode,
    GetNodeByName: String => ASPxClientTreeViewNode,
    GetNodeByText: String => ASPxClientTreeViewNode,
    GetNodeCount: () => Double,
    GetParentControl: () => js.Any,
    GetRootNode: () => ASPxClientTreeViewNode,
    GetSelectedNode: () => ASPxClientTreeViewNode,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    NodeClick: ASPxClientEvent[ASPxClientTreeViewNodeClickEventHandler[ASPxClientTreeView]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetSelectedNode: ASPxClientTreeViewNode => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientTreeView = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], CheckedChanged = CheckedChanged.asInstanceOf[js.Any], CollapseAll = js.Any.fromFunction0(CollapseAll), EndCallback = EndCallback.asInstanceOf[js.Any], ExpandAll = js.Any.fromFunction0(ExpandAll), ExpandedChanged = ExpandedChanged.asInstanceOf[js.Any], ExpandedChanging = ExpandedChanging.asInstanceOf[js.Any], GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetNode = js.Any.fromFunction1(GetNode), GetNodeByName = js.Any.fromFunction1(GetNodeByName), GetNodeByText = js.Any.fromFunction1(GetNodeByText), GetNodeCount = js.Any.fromFunction0(GetNodeCount), GetParentControl = js.Any.fromFunction0(GetParentControl), GetRootNode = js.Any.fromFunction0(GetRootNode), GetSelectedNode = js.Any.fromFunction0(GetSelectedNode), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], NodeClick = NodeClick.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetSelectedNode = js.Any.fromFunction1(SetSelectedNode), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeView]
  }
  
  @scala.inline
  implicit class ASPxClientTreeViewMutableBuilder[Self <: ASPxClientTreeView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTreeView]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTreeView]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedChanged(value: ASPxClientEvent[ASPxClientTreeViewNodeProcessingModeEventHandler[ASPxClientTreeView]]): Self = StObject.set(x, "CheckedChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseAll(value: () => Unit): Self = StObject.set(x, "CollapseAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTreeView]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandAll(value: () => Unit): Self = StObject.set(x, "ExpandAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpandedChanged(value: ASPxClientEvent[ASPxClientTreeViewNodeEventHandler[ASPxClientTreeView]]): Self = StObject.set(x, "ExpandedChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedChanging(value: ASPxClientEvent[ASPxClientTreeViewNodeCancelEventHandler[ASPxClientTreeView]]): Self = StObject.set(x, "ExpandedChanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetNode(value: Double => ASPxClientTreeViewNode): Self = StObject.set(x, "GetNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeByName(value: String => ASPxClientTreeViewNode): Self = StObject.set(x, "GetNodeByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeByText(value: String => ASPxClientTreeViewNode): Self = StObject.set(x, "GetNodeByText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeCount(value: () => Double): Self = StObject.set(x, "GetNodeCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRootNode(value: () => ASPxClientTreeViewNode): Self = StObject.set(x, "GetRootNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedNode(value: () => ASPxClientTreeViewNode): Self = StObject.set(x, "GetSelectedNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNodeClick(value: ASPxClientEvent[ASPxClientTreeViewNodeClickEventHandler[ASPxClientTreeView]]): Self = StObject.set(x, "NodeClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSelectedNode(value: ASPxClientTreeViewNode => Unit): Self = StObject.set(x, "SetSelectedNode", js.Any.fromFunction1(value))
  }
}
