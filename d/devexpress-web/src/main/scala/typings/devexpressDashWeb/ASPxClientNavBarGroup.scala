package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the navbar's NavBarGroup object.
  */
@JSGlobal("ASPxClientNavBarGroup")
@js.native
class ASPxClientNavBarGroup () extends js.Object {
  /**
    * Gets the group's index within a collection of a navbar's groups.
    */
  var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the group.
    */
  var name: String = js.native
  /**
    * Gets the navbar to which the current group belongs.
    */
  var navBar: ASPxClientNavBar = js.native
  /**
    * Returns a value specifying whether a group is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Returns a value specifying whether the group is expanded.
    */
  def GetExpanded(): Boolean = js.native
  /**
    * Returns the group's item specified by its index. An ASPxClientNavBarItem object representing the item located at the specified index within the current group.
    * @param index An integer value specifying the zero-based index of the item to be retrieved.
    */
  def GetItem(index: Double): ASPxClientNavBarItem = js.native
  /**
    * Returns a group item specified by its name. An ASPxClientNavBarItem object that represents the item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemByName(name: String): ASPxClientNavBarItem = js.native
  /**
    * Returns the number of items in the group.
    */
  def GetItemCount(): Double = js.native
  /**
    * Returns text displayed within a group.
    */
  def GetText(): String = js.native
  /**
    * Returns a value specifying whether a group is displayed.
    */
  def GetVisible(): Boolean = js.native
  /**
    * Sets the group's expansion state.
    * @param value true to expand the group; false to collapse the group.
    */
  def SetExpanded(value: Boolean): Unit = js.native
  /**
    * Specifies the text displayed within a group.
    * @param text A string value that is the text displayed within the navbar group.
    */
  def SetText(text: String): Unit = js.native
  /**
    * Specifies whether the group is visible.
    * @param value true if the group is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit = js.native
}

