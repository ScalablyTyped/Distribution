package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the TreeView's BootstrapTreeViewNode object.
  */
trait BootstrapClientTreeViewNode extends ASPxClientTreeViewNode {
  /**
    * Gets the current node's parent node.
    * Value: A BootstrapClientTreeViewNode object representing the node's immediate parent.
    */
  @JSName("parent")
  var parent_BootstrapClientTreeViewNode: BootstrapClientTreeViewNode
  /**
    * Gets the BootstrapClientTreeView object to which the current node belongs.
    * Value: A <see cref="BootstrapClientTreeView" /> object that is the node's owner.
    */
  @JSName("treeView")
  var treeView_BootstrapClientTreeViewNode: BootstrapClientTreeView
  /**
    * Gets the CSS class of the icon displayed within the node badge.
    */
  def GetBadgeIconCssClass(): java.lang.String
  /**
    * Gets the text displayed within the node badge.
    */
  def GetBadgeText(): java.lang.String
  /**
    * Gets the CSS class of the icon displayed by the node.
    */
  def GetIconCssClass(): java.lang.String
  /**
    * Sets the CSS class of the icon displayed within the node badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: java.lang.String): scala.Unit
  /**
    * Sets the text displayed within the node badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: java.lang.String): scala.Unit
  /**
    * Sets the CSS class of the icon displayed by the node.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: java.lang.String): scala.Unit
}

object BootstrapClientTreeViewNode {
  @scala.inline
  def apply(
    GetBadgeIconCssClass: js.Function0[java.lang.String],
    GetBadgeText: js.Function0[java.lang.String],
    GetCheckState: js.Function0[java.lang.String],
    GetChecked: js.Function0[scala.Boolean],
    GetEnabled: js.Function0[scala.Boolean],
    GetExpanded: js.Function0[scala.Boolean],
    GetHtmlElement: js.Function0[js.Object],
    GetIconCssClass: js.Function0[java.lang.String],
    GetImageUrl: js.Function0[java.lang.String],
    GetNavigateUrl: js.Function0[java.lang.String],
    GetNode: js.Function1[scala.Double, BootstrapClientTreeViewNode],
    GetNodeByName: js.Function1[java.lang.String, BootstrapClientTreeViewNode],
    GetNodeByText: js.Function1[java.lang.String, BootstrapClientTreeViewNode],
    GetNodeCount: js.Function0[scala.Double],
    GetText: js.Function0[java.lang.String],
    GetVisible: js.Function0[scala.Boolean],
    SetBadgeIconCssClass: js.Function1[java.lang.String, scala.Unit],
    SetBadgeText: js.Function1[java.lang.String, scala.Unit],
    SetChecked: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetExpanded: js.Function1[scala.Boolean, scala.Unit],
    SetIconCssClass: js.Function1[java.lang.String, scala.Unit],
    SetImageUrl: js.Function1[java.lang.String, scala.Unit],
    SetNavigateUrl: js.Function1[java.lang.String, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    index: scala.Double,
    name: java.lang.String,
    parent: BootstrapClientTreeViewNode,
    treeView: BootstrapClientTreeView
  ): BootstrapClientTreeViewNode = {
    val __obj = js.Dynamic.literal(GetBadgeIconCssClass = GetBadgeIconCssClass, GetBadgeText = GetBadgeText, GetCheckState = GetCheckState, GetChecked = GetChecked, GetEnabled = GetEnabled, GetExpanded = GetExpanded, GetHtmlElement = GetHtmlElement, GetIconCssClass = GetIconCssClass, GetImageUrl = GetImageUrl, GetNavigateUrl = GetNavigateUrl, GetNode = GetNode, GetNodeByName = GetNodeByName, GetNodeByText = GetNodeByText, GetNodeCount = GetNodeCount, GetText = GetText, GetVisible = GetVisible, SetBadgeIconCssClass = SetBadgeIconCssClass, SetBadgeText = SetBadgeText, SetChecked = SetChecked, SetEnabled = SetEnabled, SetExpanded = SetExpanded, SetIconCssClass = SetIconCssClass, SetImageUrl = SetImageUrl, SetNavigateUrl = SetNavigateUrl, SetText = SetText, SetVisible = SetVisible, index = index, name = name, parent = parent, treeView = treeView)
  
    __obj.asInstanceOf[BootstrapClientTreeViewNode]
  }
}

