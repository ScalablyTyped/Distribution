package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the navbar's NavBarGroup object.
  */
@js.native
trait ASPxClientNavBarGroup extends js.Object {
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
  implicit class ASPxClientNavBarGroupOps[Self <: ASPxClientNavBarGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = this.set("GetEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setGetExpanded(value: () => Boolean): Self = this.set("GetExpanded", js.Any.fromFunction0(value))
    @scala.inline
    def setGetItem(value: Double => ASPxClientNavBarItem): Self = this.set("GetItem", js.Any.fromFunction1(value))
    @scala.inline
    def setGetItemByName(value: String => ASPxClientNavBarItem): Self = this.set("GetItemByName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetItemCount(value: () => Double): Self = this.set("GetItemCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetText(value: () => String): Self = this.set("GetText", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = this.set("GetVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setSetExpanded(value: Boolean => Unit): Self = this.set("SetExpanded", js.Any.fromFunction1(value))
    @scala.inline
    def setSetText(value: String => Unit): Self = this.set("SetText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = this.set("SetVisible", js.Any.fromFunction1(value))
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavBar(value: ASPxClientNavBar): Self = this.set("navBar", value.asInstanceOf[js.Any])
  }
  
}

