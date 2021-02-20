package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to manipulations on menu items.
  */
@js.native
trait BootstrapClientMenuItemEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the menu item object related to the event.
    */
  var item: BootstrapClientMenuItem = js.native
}
object BootstrapClientMenuItemEventArgs {
  
  @scala.inline
  def apply(item: BootstrapClientMenuItem): BootstrapClientMenuItemEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientMenuItemEventArgs]
  }
  
  @scala.inline
  implicit class BootstrapClientMenuItemEventArgsMutableBuilder[Self <: BootstrapClientMenuItemEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: BootstrapClientMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
