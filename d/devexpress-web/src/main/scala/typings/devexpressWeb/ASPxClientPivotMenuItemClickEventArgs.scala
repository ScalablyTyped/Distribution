package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientPivotGrid.PopupMenuItemClick event.
  */
@js.native
trait ASPxClientPivotMenuItemClickEventArgs extends ASPxClientEventArgs {
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

object ASPxClientPivotMenuItemClickEventArgs {
  @scala.inline
  def apply(Area: String, FieldID: String, FieldValueIndex: Double, MenuItemName: String, MenuType: String): ASPxClientPivotMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(Area = Area.asInstanceOf[js.Any], FieldID = FieldID.asInstanceOf[js.Any], FieldValueIndex = FieldValueIndex.asInstanceOf[js.Any], MenuItemName = MenuItemName.asInstanceOf[js.Any], MenuType = MenuType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPivotMenuItemClickEventArgs]
  }
  @scala.inline
  implicit class ASPxClientPivotMenuItemClickEventArgsOps[Self <: ASPxClientPivotMenuItemClickEventArgs] (val x: Self) extends AnyVal {
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
    def setArea(value: String): Self = this.set("Area", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldID(value: String): Self = this.set("FieldID", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldValueIndex(value: Double): Self = this.set("FieldValueIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuItemName(value: String): Self = this.set("MenuItemName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuType(value: String): Self = this.set("MenuType", value.asInstanceOf[js.Any])
  }
  
}

