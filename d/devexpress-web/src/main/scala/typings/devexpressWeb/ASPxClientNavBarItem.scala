package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the navbar's NavBarItem object.
  */
trait ASPxClientNavBarItem extends js.Object {
  /**
    * Gets the group to which the current item belongs.
    */
  var group: ASPxClientNavBarGroup
  /**
    * Gets the item's index within a collection of a group's items.
    */
  var index: Double
  /**
    * Gets the name that uniquely identifies the item.
    */
  var name: String
  /**
    * Gets the navbar to which the current item belongs.
    */
  var navBar: ASPxClientNavBar
  /**
    * Returns a value indicating whether an item is enabled.
    */
  def GetEnabled(): Boolean
  /**
    * Returns the URL which points to the image displayed within the item.
    */
  def GetImageUrl(): String
  /**
    * Gets an URL which defines the item's navigation location.
    */
  def GetNavigateUrl(): String
  /**
    * Returns text displayed within the item.
    */
  def GetText(): String
  /**
    * Returns a value specifying whether an item is displayed.
    */
  def GetVisible(): Boolean
  /**
    * Specifies whether the item is enabled.
    * @param value true if the item is enabled; otherwise, false.
    */
  def SetEnabled(value: Boolean): Unit
  /**
    * Specifies the URL which points to the image displayed within the item.
    * @param value A string value that specifies the URL to the image displayed within the item.
    */
  def SetImageUrl(value: String): Unit
  /**
    * Specifies a URL which defines the item's navigation location.
    * @param value A string value which represents the URL to where the client web browser will navigate when the item is clicked.
    */
  def SetNavigateUrl(value: String): Unit
  /**
    * Specifies the text displayed within the item.
    * @param value A string value that represents the text displayed within the item.
    */
  def SetText(value: String): Unit
  /**
    * Specifies whether the item is visible.
    * @param value true is the item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit
}

object ASPxClientNavBarItem {
  @scala.inline
  def apply(
    GetEnabled: () => Boolean,
    GetImageUrl: () => String,
    GetNavigateUrl: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetEnabled: Boolean => Unit,
    SetImageUrl: String => Unit,
    SetNavigateUrl: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    group: ASPxClientNavBarGroup,
    index: Double,
    name: String,
    navBar: ASPxClientNavBar
  ): ASPxClientNavBarItem = {
    val __obj = js.Dynamic.literal(GetEnabled = js.Any.fromFunction0(GetEnabled), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navBar = navBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarItem]
  }
}

