package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxTreeView object.
  */
@JSGlobal("ASPxClientTreeView")
@js.native
class ASPxClientTreeView () extends ASPxClientControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTreeView]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientTreeView.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTreeView]] = js.native
  /**
    * Occurs on the client side when the node's checked state is changed by clicking on a check box.
    */
  var CheckedChanged: ASPxClientEvent[ASPxClientTreeViewNodeProcessingModeEventHandler[ASPxClientTreeView]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTreeView]] = js.native
  /**
    * Fires on the client side after a node's expansion state has been changed by end-user interaction.
    */
  var ExpandedChanged: ASPxClientEvent[ASPxClientTreeViewNodeEventHandler[ASPxClientTreeView]] = js.native
  /**
    * Fires on the client side before the expansion state of a node is changed via end-user interaction.
    */
  var ExpandedChanging: ASPxClientEvent[ASPxClientTreeViewNodeCancelEventHandler[ASPxClientTreeView]] = js.native
  /**
    * Fires on the client side after a node has been clicked.
    */
  var NodeClick: ASPxClientEvent[ASPxClientTreeViewNodeClickEventHandler[ASPxClientTreeView]] = js.native
  /**
    * Collapses all nodes in the ASPxTreeView on the client side.
    */
  def CollapseAll(): Unit = js.native
  /**
    * Expands all nodes in the ASPxTreeView on the client side.
    */
  def ExpandAll(): Unit = js.native
  /**
    * Returns a node specified by its index within the ASPxTreeView's node collection. An ASPxClientTreeViewNode object, representing the node located at the specified index within the ASPxTreeView's node collection.
    * @param index An integer value specifying the zero-based index of the node to be retrieved.
    */
  def GetNode(index: Double): ASPxClientTreeViewNode = js.native
  /**
    * Returns a node specified by its name. An ASPxClientTreeViewNode object that represents the node with the specified name.
    * @param name A string value specifying the name of the node.
    */
  def GetNodeByName(name: String): ASPxClientTreeViewNode = js.native
  /**
    * Returns a node specified by its text. An ASPxClientTreeViewNode object that represents the node with the specified node's text content.
    * @param text A string value specifying the text content of the node.
    */
  def GetNodeByText(text: String): ASPxClientTreeViewNode = js.native
  /**
    * Returns the number of nodes at the ASPxTreeView's zero level.
    */
  def GetNodeCount(): Double = js.native
  /**
    * Gets the root node of the ASPxTreeView object.
    */
  def GetRootNode(): ASPxClientTreeViewNode = js.native
  /**
    * Returns the selected node within the ASPxTreeView control on the client side.
    */
  def GetSelectedNode(): ASPxClientTreeViewNode = js.native
  /**
    * Selects the specified node within the ASPxTreeView control on the client side.
    * @param node An ASPxClientTreeViewNode object specifying the node to select.
    */
  def SetSelectedNode(node: ASPxClientTreeViewNode): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientTreeView")
@js.native
object ASPxClientTreeView extends js.Object {
  /**
    * Converts the specified object to the ASPxClientTreeView type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientTreeView = js.native
}

