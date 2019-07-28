package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the navbar's NavBarGroup object.
  */
trait ASPxClientNavBarGroup extends js.Object {
  /**
    * Gets the group's index within a collection of a navbar's groups.
    * Value: An integer value representing the group's zero-based index within the Groups collection of the navbar to which the group belongs.
    */
  var index: Double
  /**
    * Gets the name that uniquely identifies the group.
    * Value: A string value that represents the value assigned to the group's Name property.
    */
  var name: String
  /**
    * Gets the navbar to which the current group belongs.
    * Value: An ASPxClientNavBar object representing the navbar to which the group belongs.
    */
  var navBar: ASPxClientNavBar
  /**
    * Returns a value specifying whether a group is enabled.
    */
  def GetEnabled(): Boolean
  /**
    * Returns a value specifying whether the group is expanded.
    */
  def GetExpanded(): Boolean
  /**
    * Returns the group's item specified by its index.
    * @param index An integer value specifying the zero-based index of the item to be retrieved.
    */
  def GetItem(index: Double): ASPxClientNavBarItem
  /**
    * Returns a group item specified by its name.
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
    val __obj = js.Dynamic.literal(GetEnabled = js.Any.fromFunction0(GetEnabled), GetExpanded = js.Any.fromFunction0(GetExpanded), GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetExpanded = js.Any.fromFunction1(SetExpanded), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index, name = name, navBar = navBar)
  
    __obj.asInstanceOf[ASPxClientNavBarGroup]
  }
}

