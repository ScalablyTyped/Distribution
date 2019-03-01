package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxTreeView's TreeViewNode object.
  */
trait ASPxClientTreeViewNode extends js.Object {
  /**
    * Gets the node's index within the parent's collection of nodes.
    * Value: An integer value representing the node's zero-based index within the Nodes collection of the node to which the node belongs.
    */
  var index: scala.Double
  /**
    * Gets the name that uniquely identifies the node.
    * Value: A string value that represents the value assigned to the node's Name property.
    */
  var name: java.lang.String
  /**
    * Gets the current node's parent node.
    * Value: An ASPxClientTreeViewNode object representing the node's immediate parent.
    */
  var parent: ASPxClientTreeViewNode
  /**
    * Gets the client representation of the ASPxTreeView control to which the current node belongs.
    * Value: An ASPxClientTreeView object representing the control to which the node belongs.
    */
  var treeView: ASPxClientTreeView
  /**
    * Returns a value which specifies the node's check state.
    */
  def GetCheckState(): java.lang.String
  /**
    * Returns a value indicating whether the node is checked.
    */
  def GetChecked(): scala.Boolean
  /**
    * Returns a value specifying whether the node is enabled.
    */
  def GetEnabled(): scala.Boolean
  /**
    * Returns a value indicating whether the node is expanded.
    */
  def GetExpanded(): scala.Boolean
  /**
    * Gets the HTML object that contains the current node.
    */
  def GetHtmlElement(): js.Object
  /**
    * Returns the URL pointing to the image displayed within the node.
    */
  def GetImageUrl(): java.lang.String
  /**
    * Gets an URL which defines the navigation location for the node's hyperlink.
    */
  def GetNavigateUrl(): java.lang.String
  /**
    * Returns the current node's immediate child node specified by its index.
    * @param index An integer value specifying the zero-based index of the node to be retrieved.
    */
  def GetNode(index: scala.Double): ASPxClientTreeViewNode
  /**
    * Returns the current node's child node specified by its name.
    * @param name A string value specifying the name of the node.
    */
  def GetNodeByName(name: java.lang.String): ASPxClientTreeViewNode
  /**
    * Returns the current node's child node specified by its text.
    * @param text A string value specifying the text content of the node.
    */
  def GetNodeByText(text: java.lang.String): ASPxClientTreeViewNode
  /**
    * Returns the number of the current node's immediate child nodes.
    */
  def GetNodeCount(): scala.Double
  /**
    * Gets the text, displayed within the node.
    */
  def GetText(): java.lang.String
  /**
    * Returns a value specifying whether a node is displayed.
    */
  def GetVisible(): scala.Boolean
  /**
    * Sets a value indicating whether the node is checked.
    * @param value true if the node is checked; otherwise, false.
    */
  def SetChecked(value: scala.Boolean): scala.Unit
  /**
    * Sets a value specifying whether the node is enabled.
    * @param value true to make the node enabled; false to disable it.
    */
  def SetEnabled(value: scala.Boolean): scala.Unit
  /**
    * Sets a value which specifies the node's expansion state.
    * @param value true if the node is expanded; otherwise, false.
    */
  def SetExpanded(value: scala.Boolean): scala.Unit
  /**
    * Sets the URL which points to the image displayed within the node.
    * @param value A string value specifying the URL to the image displayed within the node.
    */
  def SetImageUrl(value: java.lang.String): scala.Unit
  /**
    * Specifies a URL which defines the node's navigate URL.
    * @param value A string value which specifies a URL to where the client web browser will navigate when the node is clicked.
    */
  def SetNavigateUrl(value: java.lang.String): scala.Unit
  /**
    * Specifies the text, displayed within the node.
    * @param value A string value that represents the text displayed within the node.
    */
  def SetText(value: java.lang.String): scala.Unit
  /**
    * Specifies whether the node is visible.
    * @param value true if the node is visible; otherwise, false.
    */
  def SetVisible(value: scala.Boolean): scala.Unit
}

object ASPxClientTreeViewNode {
  @scala.inline
  def apply(
    GetCheckState: js.Function0[java.lang.String],
    GetChecked: js.Function0[scala.Boolean],
    GetEnabled: js.Function0[scala.Boolean],
    GetExpanded: js.Function0[scala.Boolean],
    GetHtmlElement: js.Function0[js.Object],
    GetImageUrl: js.Function0[java.lang.String],
    GetNavigateUrl: js.Function0[java.lang.String],
    GetNode: js.Function1[scala.Double, ASPxClientTreeViewNode],
    GetNodeByName: js.Function1[java.lang.String, ASPxClientTreeViewNode],
    GetNodeByText: js.Function1[java.lang.String, ASPxClientTreeViewNode],
    GetNodeCount: js.Function0[scala.Double],
    GetText: js.Function0[java.lang.String],
    GetVisible: js.Function0[scala.Boolean],
    SetChecked: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetExpanded: js.Function1[scala.Boolean, scala.Unit],
    SetImageUrl: js.Function1[java.lang.String, scala.Unit],
    SetNavigateUrl: js.Function1[java.lang.String, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    index: scala.Double,
    name: java.lang.String,
    parent: ASPxClientTreeViewNode,
    treeView: ASPxClientTreeView
  ): ASPxClientTreeViewNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetCheckState")(GetCheckState)
    __obj.updateDynamic("GetChecked")(GetChecked)
    __obj.updateDynamic("GetEnabled")(GetEnabled)
    __obj.updateDynamic("GetExpanded")(GetExpanded)
    __obj.updateDynamic("GetHtmlElement")(GetHtmlElement)
    __obj.updateDynamic("GetImageUrl")(GetImageUrl)
    __obj.updateDynamic("GetNavigateUrl")(GetNavigateUrl)
    __obj.updateDynamic("GetNode")(GetNode)
    __obj.updateDynamic("GetNodeByName")(GetNodeByName)
    __obj.updateDynamic("GetNodeByText")(GetNodeByText)
    __obj.updateDynamic("GetNodeCount")(GetNodeCount)
    __obj.updateDynamic("GetText")(GetText)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("SetChecked")(SetChecked)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("SetExpanded")(SetExpanded)
    __obj.updateDynamic("SetImageUrl")(SetImageUrl)
    __obj.updateDynamic("SetNavigateUrl")(SetNavigateUrl)
    __obj.updateDynamic("SetText")(SetText)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("treeView")(treeView)
    __obj.asInstanceOf[ASPxClientTreeViewNode]
  }
}

