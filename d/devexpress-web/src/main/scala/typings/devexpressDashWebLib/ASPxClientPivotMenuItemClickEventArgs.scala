package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the PopupMenuItemClick event.
  */
trait ASPxClientPivotMenuItemClickEventArgs extends ASPxClientEventArgs {
  var Area: java.lang.String
  /**
    * Gets the field's unique indentifier.
    * Value: A string which specifies the field's unique indentifier.
    */
  var FieldID: java.lang.String
  /**
    * Gets the index of the field value for which the popup menu has been invoked.
    * Value: An integer value that identifies the field value.
    */
  var FieldValueIndex: scala.Double
  /**
    * Gets the name of the menu item currently being clicked.
    * Value: A String value that identifies the clicked item by its name.
    */
  var MenuItemName: java.lang.String
  /**
    * Gets the context menu's type.
    * Value: A PivotGridPopupMenuType enumeration value that identifies the context menu.
    */
  var MenuType: java.lang.String
}

object ASPxClientPivotMenuItemClickEventArgs {
  @scala.inline
  def apply(
    Area: java.lang.String,
    FieldID: java.lang.String,
    FieldValueIndex: scala.Double,
    MenuItemName: java.lang.String,
    MenuType: java.lang.String
  ): ASPxClientPivotMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(Area = Area, FieldID = FieldID, FieldValueIndex = FieldValueIndex, MenuItemName = MenuItemName, MenuType = MenuType)
  
    __obj.asInstanceOf[ASPxClientPivotMenuItemClickEventArgs]
  }
}

