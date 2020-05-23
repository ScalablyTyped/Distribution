package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxTreeView's TreeViewNode object.
  */
@JSGlobal("ASPxClientTreeViewNode")
@js.native
class ASPxClientTreeViewNode ()
  extends typings.devexpressWeb.ASPxClientTreeViewNode {
  /**
    * Gets the node's index within the parent's collection of nodes.
    */
  /* CompleteClass */
  override var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the node.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Gets the current node's parent node.
    */
  /* CompleteClass */
  override var parent: typings.devexpressWeb.ASPxClientTreeViewNode = js.native
  /**
    * Gets the client representation of the ASPxTreeView control to which the current node belongs.
    */
  /* CompleteClass */
  override var treeView: typings.devexpressWeb.ASPxClientTreeView = js.native
  /**
    * Returns a value which specifies the node's check state.
    */
  /* CompleteClass */
  override def GetCheckState(): String = js.native
  /**
    * Returns a value indicating whether the node is checked.
    */
  /* CompleteClass */
  override def GetChecked(): Boolean = js.native
  /**
    * Returns a value specifying whether the node is enabled.
    */
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  /**
    * Returns a value indicating whether the node is expanded.
    */
  /* CompleteClass */
  override def GetExpanded(): Boolean = js.native
  /**
    * Gets the HTML object that contains the current node.
    */
  /* CompleteClass */
  override def GetHtmlElement(): js.Any = js.native
  /**
    * Returns the URL pointing to the image displayed within the node.
    */
  /* CompleteClass */
  override def GetImageUrl(): String = js.native
  /**
    * Gets an URL which defines the navigation location for the node's hyperlink.
    */
  /* CompleteClass */
  override def GetNavigateUrl(): String = js.native
  /**
    * Returns the current node's immediate child node specified by its index. An ASPxClientTreeViewNode object representing the node located at the specified index within the current node collection.
    * @param index An integer value specifying the zero-based index of the node to be retrieved.
    */
  /* CompleteClass */
  override def GetNode(index: Double): typings.devexpressWeb.ASPxClientTreeViewNode = js.native
  /**
    * Returns the current node's child node specified by its name. An ASPxClientTreeViewNode object that represents the current node's child with the specified name.
    * @param name A string value specifying the name of the node.
    */
  /* CompleteClass */
  override def GetNodeByName(name: String): typings.devexpressWeb.ASPxClientTreeViewNode = js.native
  /**
    * Returns the current node's child node specified by its text. An ASPxClientTreeViewNode object that represents the current node's child with the specified node's text content.
    * @param text A string value specifying the text content of the node.
    */
  /* CompleteClass */
  override def GetNodeByText(text: String): typings.devexpressWeb.ASPxClientTreeViewNode = js.native
  /**
    * Returns the number of the current node's immediate child nodes.
    */
  /* CompleteClass */
  override def GetNodeCount(): Double = js.native
  /**
    * Gets the text, displayed within the node.
    */
  /* CompleteClass */
  override def GetText(): String = js.native
  /**
    * Returns a value specifying whether a node is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  /**
    * Sets a value indicating whether the node is checked.
    * @param value true if the node is checked; otherwise, false.
    */
  /* CompleteClass */
  override def SetChecked(value: Boolean): Unit = js.native
  /**
    * Sets a value specifying whether the node is enabled.
    * @param value true to make the node enabled; false to disable it.
    */
  /* CompleteClass */
  override def SetEnabled(value: Boolean): Unit = js.native
  /**
    * Sets a value which specifies the node's expansion state.
    * @param value true if the node is expanded; otherwise, false.
    */
  /* CompleteClass */
  override def SetExpanded(value: Boolean): Unit = js.native
  /**
    * Sets the URL which points to the image displayed within the node.
    * @param value A string value specifying the URL to the image displayed within the node.
    */
  /* CompleteClass */
  override def SetImageUrl(value: String): Unit = js.native
  /**
    * Specifies a URL which defines the node's navigate URL.
    * @param value A string value which specifies a URL to where the client web browser will navigate when the node is clicked.
    */
  /* CompleteClass */
  override def SetNavigateUrl(value: String): Unit = js.native
  /**
    * Specifies the text, displayed within the node.
    * @param value A string value that represents the text displayed within the node.
    */
  /* CompleteClass */
  override def SetText(value: String): Unit = js.native
  /**
    * Specifies whether the node is visible.
    * @param value true if the node is visible; otherwise, false.
    */
  /* CompleteClass */
  override def SetVisible(value: Boolean): Unit = js.native
}

