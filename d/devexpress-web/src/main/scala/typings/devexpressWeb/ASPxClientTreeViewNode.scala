package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxTreeView's TreeViewNode object.
  */
@js.native
trait ASPxClientTreeViewNode extends StObject {
  
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
}
object ASPxClientTreeViewNode {
  
  @scala.inline
  def apply(
    GetCheckState: () => String,
    GetChecked: () => Boolean,
    GetEnabled: () => Boolean,
    GetExpanded: () => Boolean,
    GetHtmlElement: () => js.Any,
    GetImageUrl: () => String,
    GetNavigateUrl: () => String,
    GetNode: Double => ASPxClientTreeViewNode,
    GetNodeByName: String => ASPxClientTreeViewNode,
    GetNodeByText: String => ASPxClientTreeViewNode,
    GetNodeCount: () => Double,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetChecked: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetExpanded: Boolean => Unit,
    SetImageUrl: String => Unit,
    SetNavigateUrl: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    index: Double,
    name: String,
    parent: ASPxClientTreeViewNode,
    treeView: ASPxClientTreeView
  ): ASPxClientTreeViewNode = {
    val __obj = js.Dynamic.literal(GetCheckState = js.Any.fromFunction0(GetCheckState), GetChecked = js.Any.fromFunction0(GetChecked), GetEnabled = js.Any.fromFunction0(GetEnabled), GetExpanded = js.Any.fromFunction0(GetExpanded), GetHtmlElement = js.Any.fromFunction0(GetHtmlElement), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetNode = js.Any.fromFunction1(GetNode), GetNodeByName = js.Any.fromFunction1(GetNodeByName), GetNodeByText = js.Any.fromFunction1(GetNodeByText), GetNodeCount = js.Any.fromFunction0(GetNodeCount), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetChecked = js.Any.fromFunction1(SetChecked), SetEnabled = js.Any.fromFunction1(SetEnabled), SetExpanded = js.Any.fromFunction1(SetExpanded), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], treeView = treeView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeViewNode]
  }
  
  @scala.inline
  implicit class ASPxClientTreeViewNodeMutableBuilder[Self <: ASPxClientTreeViewNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCheckState(value: () => String): Self = StObject.set(x, "GetCheckState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChecked(value: () => Boolean): Self = StObject.set(x, "GetChecked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "GetEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExpanded(value: () => Boolean): Self = StObject.set(x, "GetExpanded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHtmlElement(value: () => js.Any): Self = StObject.set(x, "GetHtmlElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetImageUrl(value: () => String): Self = StObject.set(x, "GetImageUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNavigateUrl(value: () => String): Self = StObject.set(x, "GetNavigateUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNode(value: Double => ASPxClientTreeViewNode): Self = StObject.set(x, "GetNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeByName(value: String => ASPxClientTreeViewNode): Self = StObject.set(x, "GetNodeByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeByText(value: String => ASPxClientTreeViewNode): Self = StObject.set(x, "GetNodeByText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeCount(value: () => Double): Self = StObject.set(x, "GetNodeCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "GetText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = StObject.set(x, "GetVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: ASPxClientTreeViewNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetChecked(value: Boolean => Unit): Self = StObject.set(x, "SetChecked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetExpanded(value: Boolean => Unit): Self = StObject.set(x, "SetExpanded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetImageUrl(value: String => Unit): Self = StObject.set(x, "SetImageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNavigateUrl(value: String => Unit): Self = StObject.set(x, "SetNavigateUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = StObject.set(x, "SetText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "SetVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTreeView(value: ASPxClientTreeView): Self = StObject.set(x, "treeView", value.asInstanceOf[js.Any])
  }
}
