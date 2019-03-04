package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxTreeView object.
  */
trait ASPxClientTreeView extends ASPxClientControl {
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
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTreeView]]
  /**
    * Fires on the client side after a node's expansion state has been changed by end-user interaction.
    */
  var ExpandedChanged: ASPxClientEvent[ASPxClientTreeViewNodeEventHandler[ASPxClientTreeView]]
  /**
    * Fires on the client side before the expansion state of a node is changed via end-user interaction.
    */
  var ExpandedChanging: ASPxClientEvent[ASPxClientTreeViewNodeCancelEventHandler[ASPxClientTreeView]]
  /**
    * Fires on the client side after a node has been clicked.
    */
  var NodeClick: ASPxClientEvent[ASPxClientTreeViewNodeClickEventHandler[ASPxClientTreeView]]
  /**
    * Collapses all nodes in the ASPxTreeView on the client side.
    */
  def CollapseAll(): scala.Unit
  /**
    * Expands all nodes in the ASPxTreeView on the client side.
    */
  def ExpandAll(): scala.Unit
  /**
    * Returns a node specified by its index within the ASPxTreeView's node collection.
    * @param index An integer value specifying the zero-based index of the node to be retrieved.
    */
  def GetNode(index: scala.Double): ASPxClientTreeViewNode
  /**
    * Returns a node specified by its name.
    * @param name A string value specifying the name of the node.
    */
  def GetNodeByName(name: java.lang.String): ASPxClientTreeViewNode
  /**
    * Returns a node specified by its text.
    * @param text A string value specifying the text content of the node.
    */
  def GetNodeByText(text: java.lang.String): ASPxClientTreeViewNode
  /**
    * Returns the number of nodes at the ASPxTreeView's zero level.
    */
  def GetNodeCount(): scala.Double
  /**
    * Gets the root node of the ASPxTreeView object.
    */
  def GetRootNode(): ASPxClientTreeViewNode
  /**
    * Returns the selected node within the ASPxTreeView control on the client side.
    */
  def GetSelectedNode(): ASPxClientTreeViewNode
  /**
    * Selects the specified node within the ASPxTreeView control on the client side.
    * @param node An ASPxClientTreeViewNode object specifying the node to select.
    */
  def SetSelectedNode(node: ASPxClientTreeViewNode): scala.Unit
}

object ASPxClientTreeView {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTreeView]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTreeView]],
    CheckedChanged: ASPxClientEvent[ASPxClientTreeViewNodeProcessingModeEventHandler[ASPxClientTreeView]],
    CollapseAll: js.Function0[scala.Unit],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTreeView]],
    ExpandAll: js.Function0[scala.Unit],
    ExpandedChanged: ASPxClientEvent[ASPxClientTreeViewNodeEventHandler[ASPxClientTreeView]],
    ExpandedChanging: ASPxClientEvent[ASPxClientTreeViewNodeCancelEventHandler[ASPxClientTreeView]],
    GetClientVisible: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetNode: js.Function1[scala.Double, ASPxClientTreeViewNode],
    GetNodeByName: js.Function1[java.lang.String, ASPxClientTreeViewNode],
    GetNodeByText: js.Function1[java.lang.String, ASPxClientTreeViewNode],
    GetNodeCount: js.Function0[scala.Double],
    GetParentControl: js.Function0[js.Object],
    GetRootNode: js.Function0[ASPxClientTreeViewNode],
    GetSelectedNode: js.Function0[ASPxClientTreeViewNode],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    NodeClick: ASPxClientEvent[ASPxClientTreeViewNodeClickEventHandler[ASPxClientTreeView]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetSelectedNode: js.Function1[ASPxClientTreeViewNode, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientTreeView = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, BeginCallback = BeginCallback, CallbackError = CallbackError, CheckedChanged = CheckedChanged, CollapseAll = CollapseAll, EndCallback = EndCallback, ExpandAll = ExpandAll, ExpandedChanged = ExpandedChanged, ExpandedChanging = ExpandedChanging, GetClientVisible = GetClientVisible, GetHeight = GetHeight, GetMainElement = GetMainElement, GetNode = GetNode, GetNodeByName = GetNodeByName, GetNodeByText = GetNodeByText, GetNodeCount = GetNodeCount, GetParentControl = GetParentControl, GetRootNode = GetRootNode, GetSelectedNode = GetSelectedNode, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, NodeClick = NodeClick, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetSelectedNode = SetSelectedNode, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[ASPxClientTreeView]
  }
}

