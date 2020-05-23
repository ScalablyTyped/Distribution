package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientPivotGrid.PopupMenuItemClick event.
  */
trait ASPxClientPivotMenuItemClickEventArgs extends ASPxClientEventArgs {
  var Area: String
  /**
    * Gets the field's unique indentifier.
    */
  var FieldID: String
  /**
    * Gets the index of the field value for which the popup menu has been invoked.
    */
  var FieldValueIndex: Double
  /**
    * Gets the name of the menu item currently being clicked.
    */
  var MenuItemName: String
  /**
    * Gets the context menu's type.
    */
  var MenuType: String
}

object ASPxClientPivotMenuItemClickEventArgs {
  @scala.inline
  def apply(Area: String, FieldID: String, FieldValueIndex: Double, MenuItemName: String, MenuType: String): ASPxClientPivotMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(Area = Area.asInstanceOf[js.Any], FieldID = FieldID.asInstanceOf[js.Any], FieldValueIndex = FieldValueIndex.asInstanceOf[js.Any], MenuItemName = MenuItemName.asInstanceOf[js.Any], MenuType = MenuType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPivotMenuItemClickEventArgs]
  }
}

