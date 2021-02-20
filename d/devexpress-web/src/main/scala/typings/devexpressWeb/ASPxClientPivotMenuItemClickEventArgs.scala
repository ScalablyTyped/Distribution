package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ASPxClientPivotMenuItemClickEventArgsMutableBuilder[Self <: ASPxClientPivotMenuItemClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: String): Self = StObject.set(x, "Area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldID(value: String): Self = StObject.set(x, "FieldID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldValueIndex(value: Double): Self = StObject.set(x, "FieldValueIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemName(value: String): Self = StObject.set(x, "MenuItemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuType(value: String): Self = StObject.set(x, "MenuType", value.asInstanceOf[js.Any])
  }
}
