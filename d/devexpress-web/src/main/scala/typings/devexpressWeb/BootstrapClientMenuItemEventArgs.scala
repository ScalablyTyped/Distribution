package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to manipulations on menu items.
  */
trait BootstrapClientMenuItemEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the menu item object related to the event.
    */
  var item: BootstrapClientMenuItem
}
object BootstrapClientMenuItemEventArgs {
  
  inline def apply(item: BootstrapClientMenuItem): BootstrapClientMenuItemEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientMenuItemEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootstrapClientMenuItemEventArgs] (val x: Self) extends AnyVal {
    
    inline def setItem(value: BootstrapClientMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
