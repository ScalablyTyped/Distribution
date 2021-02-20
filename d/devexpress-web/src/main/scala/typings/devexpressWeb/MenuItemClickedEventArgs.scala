package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.MenuItemClicked event.
  */
@js.native
trait MenuItemClickedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets or sets whether an event is handled, and that default actions are not required.
    */
  var handled: Boolean = js.native
  
  /**
    * Gets the name of the menu item which is clicked.
    */
  var itemName: String = js.native
}
object MenuItemClickedEventArgs {
  
  @scala.inline
  def apply(handled: Boolean, itemName: String): MenuItemClickedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemClickedEventArgs]
  }
  
  @scala.inline
  implicit class MenuItemClickedEventArgsMutableBuilder[Self <: MenuItemClickedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
  }
}
