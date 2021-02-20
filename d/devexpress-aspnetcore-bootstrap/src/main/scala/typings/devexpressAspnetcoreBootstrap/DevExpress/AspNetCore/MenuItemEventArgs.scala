package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItemEventArgs extends EventArgs {
  
  val item: BootstrapMenuItem = js.native
}
object MenuItemEventArgs {
  
  @scala.inline
  def apply(item: BootstrapMenuItem, sender: Control): MenuItemEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemEventArgs]
  }
  
  @scala.inline
  implicit class MenuItemEventArgsMutableBuilder[Self <: MenuItemEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: BootstrapMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
