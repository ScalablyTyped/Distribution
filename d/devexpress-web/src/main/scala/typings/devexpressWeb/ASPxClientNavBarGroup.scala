package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the navbar's NavBarGroup object.
  */
trait ASPxClientNavBarGroup extends StObject {
  
  /**
    * Returns a value specifying whether a group is enabled.
    */
  def GetEnabled(): Boolean
  
  /**
    * Returns a value specifying whether the group is expanded.
    */
  def GetExpanded(): Boolean
  
  /**
    * Returns the group's item specified by its index. An ASPxClientNavBarItem object representing the item located at the specified index within the current group.
    * @param index An integer value specifying the zero-based index of the item to be retrieved.
    */
  def GetItem(index: Double): ASPxClientNavBarItem
  
  /**
    * Returns a group item specified by its name. An ASPxClientNavBarItem object that represents the item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemByName(name: String): ASPxClientNavBarItem
  
  /**
    * Returns the number of items in the group.
    */
  def GetItemCount(): Double
  
  /**
    * Returns text displayed within a group.
    */
  def GetText(): String
  
  /**
    * Returns a value specifying whether a group is displayed.
    */
  def GetVisible(): Boolean
  
  /**
    * Sets the group's expansion state.
    * @param value true to expand the group; false to collapse the group.
    */
  def SetExpanded(value: Boolean): Unit
  
  /**
    * Specifies the text displayed within a group.
    * @param text A string value that is the text displayed within the navbar group.
    */
  def SetText(text: String): Unit
  
  /**
    * Specifies whether the group is visible.
    * @param value true if the group is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit
  
  /**
    * Gets the group's index within a collection of a navbar's groups.
    */
  var index: Double
  
  /**
    * Gets the name that uniquely identifies the group.
    */
  var name: String
  
  /**
    * Gets the navbar to which the current group belongs.
    */
  var navBar: ASPxClientNavBar
}
object ASPxClientNavBarGroup {
  
  @scala.inline
  def apply(
    GetEnabled: () => Boolean,
    GetExpanded: () => Boolean,
    GetItem: Double => ASPxClientNavBarItem,
    GetItemByName: String => ASPxClientNavBarItem,
    GetItemCount: () => Double,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetExpanded: Boolean => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    index: Double,
    name: String,
    navBar: ASPxClientNavBar
  ): ASPxClientNavBarGroup = {
    val __obj = js.Dynamic.literal(GetEnabled = js.Any.fromFunction0(GetEnabled), GetExpanded = js.Any.fromFunction0(GetExpanded), GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetExpanded = js.Any.fromFunction1(SetExpanded), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navBar = navBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarGroup]
  }
  
  @scala.inline
  implicit class ASPxClientNavBarGroupMutableBuilder[Self <: ASPxClientNavBarGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "GetEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExpanded(value: () => Boolean): Self = StObject.set(x, "GetExpanded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => ASPxClientNavBarItem): Self = StObject.set(x, "GetItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemByName(value: String => ASPxClientNavBarItem): Self = StObject.set(x, "GetItemByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemCount(value: () => Double): Self = StObject.set(x, "GetItemCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "GetText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = StObject.set(x, "GetVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavBar(value: ASPxClientNavBar): Self = StObject.set(x, "navBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetExpanded(value: Boolean => Unit): Self = StObject.set(x, "SetExpanded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = StObject.set(x, "SetText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "SetVisible", js.Any.fromFunction1(value))
  }
}
