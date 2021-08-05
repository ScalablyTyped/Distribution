package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItemClickedEventArgs
  extends StObject
     with EventArgs {
  
  var handled: Boolean
  
  val itemName: String
}
object MenuItemClickedEventArgs {
  
  inline def apply(handled: Boolean, itemName: String, sender: Control): MenuItemClickedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemClickedEventArgs]
  }
  
  extension [Self <: MenuItemClickedEventArgs](x: Self) {
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
  }
}
