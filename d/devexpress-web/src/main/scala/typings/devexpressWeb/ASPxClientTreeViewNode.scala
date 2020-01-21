package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxTreeView's TreeViewNode object.
  */
@JSGlobal("ASPxClientTreeViewNode")
@js.native
class ASPxClientTreeViewNode () extends js.Object {
  /**
    * Gets the node's index within the parent's collection of nodes.
    */
  var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the node.
    */
  var name: String = js.native
  /**
    * Gets the current node's parent node.
    */
  var parent: ASPxClientTreeViewNode = js.native
  /**
    * Gets the client representation of the ASPxTreeView control to which the current node belongs.
    */
  var treeView: ASPxClientTreeView = js.native
  /**
    * Returns a value which specifies the node's check state.
    */
  def GetCheckState(): String = js.native
  /**
    * Returns a value indicating whether the node is checked.
    */
  def GetChecked(): Boolean = js.native
  /**
    * Returns a value specifying whether the node is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Returns a value indicating whether the node is expanded.
    */
  def GetExpanded(): Boolean = js.native
  /**
    * Gets the HTML object that contains the current node.
    */
  def GetHtmlElement(): js.Any = js.native
  /**
    * Returns the URL pointing to the image displayed within the node.
    */
  def GetImageUrl(): String = js.native
  /**
    * Gets an URL which defines the navigation location for the node's hyperlink.
    */
  def GetNavigateUrl(): String = js.native
  /**
    * Returns the current node's immediate child node specified by its index. An ASPxClientTreeViewNode object representing the node located at the specified index within the current node collection.
    * @param index An integer value specifying the zero-based index of the node to be retrieved.
    */
  def GetNode(index: Double): ASPxClientTreeViewNode = js.native
  /**
    * Returns the current node's child node specified by its name. An ASPxClientTreeViewNode object that represents the current node's child with the specified name.
    * @param name A string value specifying the name of the node.
    */
  def GetNodeByName(name: String): ASPxClientTreeViewNode = js.native
  /**
    * Returns the current node's child node specified by its text. An ASPxClientTreeViewNode object that represents the current node's child with the specified node's text content.
    * @param text A string value specifying the text content of the node.
    */
  def GetNodeByText(text: String): ASPxClientTreeViewNode = js.native
  /**
    * Returns the number of the current node's immediate child nodes.
    */
  def GetNodeCount(): Double = js.native
  /**
    * Gets the text, displayed within the node.
    */
  def GetText(): String = js.native
  /**
    * Returns a value specifying whether a node is displayed.
    */
  def GetVisible(): Boolean = js.native
  /**
    * Sets a value indicating whether the node is checked.
    * @param value true if the node is checked; otherwise, false.
    */
  def SetChecked(value: Boolean): Unit = js.native
  /**
    * Sets a value specifying whether the node is enabled.
    * @param value true to make the node enabled; false to disable it.
    */
  def SetEnabled(value: Boolean): Unit = js.native
  /**
    * Sets a value which specifies the node's expansion state.
    * @param value true if the node is expanded; otherwise, false.
    */
  def SetExpanded(value: Boolean): Unit = js.native
  /**
    * Sets the URL which points to the image displayed within the node.
    * @param value A string value specifying the URL to the image displayed within the node.
    */
  def SetImageUrl(value: String): Unit = js.native
  /**
    * Specifies a URL which defines the node's navigate URL.
    * @param value A string value which specifies a URL to where the client web browser will navigate when the node is clicked.
    */
  def SetNavigateUrl(value: String): Unit = js.native
  /**
    * Specifies the text, displayed within the node.
    * @param value A string value that represents the text displayed within the node.
    */
  def SetText(value: String): Unit = js.native
  /**
    * Specifies whether the node is visible.
    * @param value true if the node is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit = js.native
}

