package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the TreeView's BootstrapTreeViewNode object.
  */
trait BootstrapClientTreeViewNode
  extends StObject
     with ASPxClientTreeViewNode {
  
  /**
    * Gets the CSS class of the icon displayed within the node badge.
    */
  def GetBadgeIconCssClass(): String
  
  /**
    * Gets the text displayed within the node badge.
    */
  def GetBadgeText(): String
  
  /**
    * Gets the CSS class of the icon displayed by the node.
    */
  def GetIconCssClass(): String
  
  /**
    * Sets the CSS class of the icon displayed within the node badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: String): Unit
  
  /**
    * Sets the text displayed within the node badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: String): Unit
  
  /**
    * Sets the CSS class of the icon displayed by the node.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: String): Unit
  
  /**
    * Gets the current node's parent node.
    */
  @JSName("parent")
  var parent_BootstrapClientTreeViewNode: BootstrapClientTreeViewNode
  
  /**
    * Gets the BootstrapClientTreeView object to which the current node belongs.
    */
  @JSName("treeView")
  var treeView_BootstrapClientTreeViewNode: BootstrapClientTreeView
}
object BootstrapClientTreeViewNode {
  
  @scala.inline
  def apply(
    GetBadgeIconCssClass: () => String,
    GetBadgeText: () => String,
    GetCheckState: () => String,
    GetChecked: () => Boolean,
    GetEnabled: () => Boolean,
    GetExpanded: () => Boolean,
    GetHtmlElement: () => js.Any,
    GetIconCssClass: () => String,
    GetImageUrl: () => String,
    GetNavigateUrl: () => String,
    GetNode: Double => ASPxClientTreeViewNode,
    GetNodeByName: String => ASPxClientTreeViewNode,
    GetNodeByText: String => ASPxClientTreeViewNode,
    GetNodeCount: () => Double,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetBadgeIconCssClass: String => Unit,
    SetBadgeText: String => Unit,
    SetChecked: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetExpanded: Boolean => Unit,
    SetIconCssClass: String => Unit,
    SetImageUrl: String => Unit,
    SetNavigateUrl: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    index: Double,
    name: String,
    parent: BootstrapClientTreeViewNode,
    treeView: BootstrapClientTreeView
  ): BootstrapClientTreeViewNode = {
    val __obj = js.Dynamic.literal(GetBadgeIconCssClass = js.Any.fromFunction0(GetBadgeIconCssClass), GetBadgeText = js.Any.fromFunction0(GetBadgeText), GetCheckState = js.Any.fromFunction0(GetCheckState), GetChecked = js.Any.fromFunction0(GetChecked), GetEnabled = js.Any.fromFunction0(GetEnabled), GetExpanded = js.Any.fromFunction0(GetExpanded), GetHtmlElement = js.Any.fromFunction0(GetHtmlElement), GetIconCssClass = js.Any.fromFunction0(GetIconCssClass), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetNode = js.Any.fromFunction1(GetNode), GetNodeByName = js.Any.fromFunction1(GetNodeByName), GetNodeByText = js.Any.fromFunction1(GetNodeByText), GetNodeCount = js.Any.fromFunction0(GetNodeCount), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetBadgeIconCssClass = js.Any.fromFunction1(SetBadgeIconCssClass), SetBadgeText = js.Any.fromFunction1(SetBadgeText), SetChecked = js.Any.fromFunction1(SetChecked), SetEnabled = js.Any.fromFunction1(SetEnabled), SetExpanded = js.Any.fromFunction1(SetExpanded), SetIconCssClass = js.Any.fromFunction1(SetIconCssClass), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], treeView = treeView.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTreeViewNode]
  }
  
  @scala.inline
  implicit class BootstrapClientTreeViewNodeMutableBuilder[Self <: BootstrapClientTreeViewNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBadgeIconCssClass(value: () => String): Self = StObject.set(x, "GetBadgeIconCssClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBadgeText(value: () => String): Self = StObject.set(x, "GetBadgeText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIconCssClass(value: () => String): Self = StObject.set(x, "GetIconCssClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: BootstrapClientTreeViewNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetBadgeIconCssClass(value: String => Unit): Self = StObject.set(x, "SetBadgeIconCssClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBadgeText(value: String => Unit): Self = StObject.set(x, "SetBadgeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIconCssClass(value: String => Unit): Self = StObject.set(x, "SetIconCssClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTreeView(value: BootstrapClientTreeView): Self = StObject.set(x, "treeView", value.asInstanceOf[js.Any])
  }
}
