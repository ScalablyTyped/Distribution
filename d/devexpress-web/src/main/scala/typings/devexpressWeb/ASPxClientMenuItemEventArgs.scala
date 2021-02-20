package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern manipulations on menu items.
  */
@js.native
trait ASPxClientMenuItemEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the menu item object related to the event.
    */
  var item: ASPxClientMenuItem = js.native
}
object ASPxClientMenuItemEventArgs {
  
  @scala.inline
  def apply(item: ASPxClientMenuItem): ASPxClientMenuItemEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuItemEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientMenuItemEventArgsMutableBuilder[Self <: ASPxClientMenuItemEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: ASPxClientMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
