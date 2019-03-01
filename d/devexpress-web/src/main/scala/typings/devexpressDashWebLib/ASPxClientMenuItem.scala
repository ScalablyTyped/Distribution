package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the menu's MenuItem object.
  */
trait ASPxClientMenuItem extends js.Object {
  /**
    * Gets the item's index within the parent's collection of items.
    * Value: An integer value representing the item's zero-based index within the Items collection of the parent object (a menu or item) to which the item belongs.
    */
  var index: scala.Double
  /**
    * For internal use only.
    */
  var indexPath: java.lang.String
  /**
    * Gets the menu object to which the current item belongs.
    * Value: An ASPxClientMenuBase object representing the menu to which the item belongs.
    */
  var menu: ASPxClientMenuBase
  /**
    * Gets the name that uniquely identifies the menu item.
    * Value: A string value that represents the value assigned to the item's Name property.
    */
  var name: java.lang.String
  /**
    * Gets the immediate parent item to which the current item belongs.
    * Value: An ASPxClientMenuItem object representing the item's immediate parent.
    */
  var parent: ASPxClientMenuItem
  /**
    * Indicates whether the menu item is checked.
    */
  def GetChecked(): scala.Boolean
  /**
    * Returns a value specifying whether a menu item is enabled.
    */
  def GetEnabled(): scala.Boolean
  /**
    * Returns the URL pointing to the image displayed within the menu item.
    */
  def GetImageUrl(): java.lang.String
  /**
    * Returns the current menu item's immediate subitem specified by its index.
    * @param index An integer value specifying the zero-based index of the submenu item to be retrieved.
    */
  def GetItem(index: scala.Double): ASPxClientMenuItem
  /**
    * Returns the current menu item's subitem specified by its name.
    * @param name A string value specifying the name of the menu item.
    */
  def GetItemByName(name: java.lang.String): ASPxClientMenuItem
  /**
    * Returns the number of the current menu item's immediate child items.
    */
  def GetItemCount(): scala.Double
  /**
    * Gets a URL which defines the navigation location for the menu item.
    */
  def GetNavigateUrl(): java.lang.String
  /**
    * Returns text displayed within the menu item.
    */
  def GetText(): java.lang.String
  /**
    * Returns a value specifying whether a menu item is displayed.
    */
  def GetVisible(): scala.Boolean
  /**
    * Specifies whether the menu item is checked.
    * @param value true if the menu item is checked; otherwise, false.
    */
  def SetChecked(value: scala.Boolean): scala.Unit
  /**
    * Specifies whether the menu item is enabled.
    * @param value true to enable the menu item; otherwise, false.
    */
  def SetEnabled(value: scala.Boolean): scala.Unit
  /**
    * Sets the URL which points to the image displayed within the menu item.
    * @param value A string value specifying the URL to the image displayed within the menu item.
    */
  def SetImageUrl(value: java.lang.String): scala.Unit
  /**
    * Specifies a URL which defines the navigation location for the menu item.
    * @param value A string value which specifies a URL to where the client web browser will navigate when the menu item is clicked.
    */
  def SetNavigateUrl(value: java.lang.String): scala.Unit
  /**
    * Sets the text to be displayed within the menu item.
    * @param value A string value specifying the text to be displayed within the menu item.
    */
  def SetText(value: java.lang.String): scala.Unit
  /**
    * Specifies the menu item's visibility.
    * @param value true if the menu item is visible; otherwise, false.
    */
  def SetVisible(value: scala.Boolean): scala.Unit
}

object ASPxClientMenuItem {
  @scala.inline
  def apply(
    GetChecked: js.Function0[scala.Boolean],
    GetEnabled: js.Function0[scala.Boolean],
    GetImageUrl: js.Function0[java.lang.String],
    GetItem: js.Function1[scala.Double, ASPxClientMenuItem],
    GetItemByName: js.Function1[java.lang.String, ASPxClientMenuItem],
    GetItemCount: js.Function0[scala.Double],
    GetNavigateUrl: js.Function0[java.lang.String],
    GetText: js.Function0[java.lang.String],
    GetVisible: js.Function0[scala.Boolean],
    SetChecked: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetImageUrl: js.Function1[java.lang.String, scala.Unit],
    SetNavigateUrl: js.Function1[java.lang.String, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    index: scala.Double,
    indexPath: java.lang.String,
    menu: ASPxClientMenuBase,
    name: java.lang.String,
    parent: ASPxClientMenuItem
  ): ASPxClientMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetChecked")(GetChecked)
    __obj.updateDynamic("GetEnabled")(GetEnabled)
    __obj.updateDynamic("GetImageUrl")(GetImageUrl)
    __obj.updateDynamic("GetItem")(GetItem)
    __obj.updateDynamic("GetItemByName")(GetItemByName)
    __obj.updateDynamic("GetItemCount")(GetItemCount)
    __obj.updateDynamic("GetNavigateUrl")(GetNavigateUrl)
    __obj.updateDynamic("GetText")(GetText)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("SetChecked")(SetChecked)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("SetImageUrl")(SetImageUrl)
    __obj.updateDynamic("SetNavigateUrl")(SetNavigateUrl)
    __obj.updateDynamic("SetText")(SetText)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("indexPath")(indexPath)
    __obj.updateDynamic("menu")(menu)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ASPxClientMenuItem]
  }
}

