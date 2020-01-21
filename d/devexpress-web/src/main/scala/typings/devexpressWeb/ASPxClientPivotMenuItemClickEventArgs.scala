package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientPivotGrid.PopupMenuItemClick event.
  */
@JSGlobal("ASPxClientPivotMenuItemClickEventArgs")
@js.native
class ASPxClientPivotMenuItemClickEventArgs () extends ASPxClientEventArgs {
  var Area: String = js.native
  /**
    * Gets the field's unique indentifier.
    */
  var FieldID: String = js.native
  /**
    * Gets the index of the field value for which the popup menu has been invoked.
    */
  var FieldValueIndex: Double = js.native
  /**
    * Gets the name of the menu item currently being clicked.
    */
  var MenuItemName: String = js.native
  /**
    * Gets the context menu's type.
    */
  var MenuType: String = js.native
}

