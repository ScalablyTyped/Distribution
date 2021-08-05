package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern manipulations on menu items.
  */
trait ASPxClientMenuItemEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the menu item object related to the event.
    */
  var item: ASPxClientMenuItem
}
object ASPxClientMenuItemEventArgs {
  
  inline def apply(item: ASPxClientMenuItem): ASPxClientMenuItemEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuItemEventArgs]
  }
  
  extension [Self <: ASPxClientMenuItemEventArgs](x: Self) {
    
    inline def setItem(value: ASPxClientMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
