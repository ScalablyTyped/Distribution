package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.MenuItemClicked event.
  */
trait MenuItemClickedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets or sets whether an event is handled, and that default actions are not required.
    */
  var handled: Boolean
  
  /**
    * Gets the name of the menu item which is clicked.
    */
  var itemName: String
}
object MenuItemClickedEventArgs {
  
  inline def apply(handled: Boolean, itemName: String): MenuItemClickedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemClickedEventArgs]
  }
  
  extension [Self <: MenuItemClickedEventArgs](x: Self) {
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
  }
}
