package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientPivotGrid.PopupMenuItemClick event.
  */
@JSGlobal("ASPxClientPivotMenuItemClickEventArgs")
@js.native
class ASPxClientPivotMenuItemClickEventArgs ()
  extends typings.devexpressWeb.ASPxClientPivotMenuItemClickEventArgs {
  /* CompleteClass */
  override var Area: String = js.native
  /**
    * Gets the field's unique indentifier.
    */
  /* CompleteClass */
  override var FieldID: String = js.native
  /**
    * Gets the index of the field value for which the popup menu has been invoked.
    */
  /* CompleteClass */
  override var FieldValueIndex: Double = js.native
  /**
    * Gets the name of the menu item currently being clicked.
    */
  /* CompleteClass */
  override var MenuItemName: String = js.native
  /**
    * Gets the context menu's type.
    */
  /* CompleteClass */
  override var MenuType: String = js.native
}

