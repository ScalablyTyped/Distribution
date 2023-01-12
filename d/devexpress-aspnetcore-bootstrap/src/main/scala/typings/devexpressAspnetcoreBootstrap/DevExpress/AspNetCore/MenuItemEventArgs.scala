package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItemEventArgs
  extends StObject
     with EventArgs {
  
  val item: BootstrapMenuItem
}
object MenuItemEventArgs {
  
  inline def apply(item: BootstrapMenuItem, sender: Control): MenuItemEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuItemEventArgs] (val x: Self) extends AnyVal {
    
    inline def setItem(value: BootstrapMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
