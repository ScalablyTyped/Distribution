package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the navbar's NavBarItem object.
  */
trait ASPxClientNavBarItem extends js.Object {
  /**
    * Gets the group to which the current item belongs.
    * Value: An ASPxClientNavBarGroup object representing the group to which the item belongs.
    */
  var group: ASPxClientNavBarGroup
  /**
    * Gets the item's index within a collection of a group's items.
    * Value: An integer value representing the item's zero-based index within the Items collection of the group to which the item belongs.
    */
  var index: scala.Double
  /**
    * Gets the name that uniquely identifies the item.
    * Value: A string value that represents the value assigned to the item's Name property.
    */
  var name: java.lang.String
  /**
    * Gets the navbar to which the current item belongs.
    * Value: An ASPxClientNavBar object representing the navbar to which the item belongs.
    */
  var navBar: ASPxClientNavBar
  /**
    * Returns a value indicating whether an item is enabled.
    */
  def GetEnabled(): scala.Boolean
  /**
    * Returns the URL which points to the image displayed within the item.
    */
  def GetImageUrl(): java.lang.String
  /**
    * Gets an URL which defines the item's navigation location.
    */
  def GetNavigateUrl(): java.lang.String
  /**
    * Returns text displayed within the item.
    */
  def GetText(): java.lang.String
  /**
    * Returns a value specifying whether an item is displayed.
    */
  def GetVisible(): scala.Boolean
  /**
    * Specifies whether the item is enabled.
    * @param value true if the item is enabled; otherwise, false.
    */
  def SetEnabled(value: scala.Boolean): scala.Unit
  /**
    * Specifies the URL which points to the image displayed within the item.
    * @param value A string value that specifies the URL to the image displayed within the item.
    */
  def SetImageUrl(value: java.lang.String): scala.Unit
  /**
    * Specifies a URL which defines the item's navigation location.
    * @param value A string value which represents the URL to where the client web browser will navigate when the item is clicked.
    */
  def SetNavigateUrl(value: java.lang.String): scala.Unit
  /**
    * Specifies the text displayed within the item.
    * @param value A string value that represents the text displayed within the item.
    */
  def SetText(value: java.lang.String): scala.Unit
  /**
    * Specifies whether the item is visible.
    * @param value true is the item is visible; otherwise, false.
    */
  def SetVisible(value: scala.Boolean): scala.Unit
}

object ASPxClientNavBarItem {
  @scala.inline
  def apply(
    GetEnabled: () => scala.Boolean,
    GetImageUrl: () => java.lang.String,
    GetNavigateUrl: () => java.lang.String,
    GetText: () => java.lang.String,
    GetVisible: () => scala.Boolean,
    SetEnabled: scala.Boolean => scala.Unit,
    SetImageUrl: java.lang.String => scala.Unit,
    SetNavigateUrl: java.lang.String => scala.Unit,
    SetText: java.lang.String => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    group: ASPxClientNavBarGroup,
    index: scala.Double,
    name: java.lang.String,
    navBar: ASPxClientNavBar
  ): ASPxClientNavBarItem = {
    val __obj = js.Dynamic.literal(GetEnabled = js.Any.fromFunction0(GetEnabled), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), group = group, index = index, name = name, navBar = navBar)
  
    __obj.asInstanceOf[ASPxClientNavBarItem]
  }
}

