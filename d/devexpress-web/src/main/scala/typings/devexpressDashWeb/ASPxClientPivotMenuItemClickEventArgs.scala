package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the PopupMenuItemClick event.
  */
trait ASPxClientPivotMenuItemClickEventArgs extends ASPxClientEventArgs {
  var Area: String
  /**
    * Gets the field's unique indentifier.
    * Value: A string which specifies the field's unique indentifier.
    */
  var FieldID: String
  /**
    * Gets the index of the field value for which the popup menu has been invoked.
    * Value: An integer value that identifies the field value.
    */
  var FieldValueIndex: Double
  /**
    * Gets the name of the menu item currently being clicked.
    * Value: A String value that identifies the clicked item by its name.
    */
  var MenuItemName: String
  /**
    * Gets the context menu's type.
    * Value: A PivotGridPopupMenuType enumeration value that identifies the context menu.
    */
  var MenuType: String
}

object ASPxClientPivotMenuItemClickEventArgs {
  @scala.inline
  def apply(Area: String, FieldID: String, FieldValueIndex: Double, MenuItemName: String, MenuType: String): ASPxClientPivotMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(Area = Area, FieldID = FieldID, FieldValueIndex = FieldValueIndex, MenuItemName = MenuItemName, MenuType = MenuType)
  
    __obj.asInstanceOf[ASPxClientPivotMenuItemClickEventArgs]
  }
}

