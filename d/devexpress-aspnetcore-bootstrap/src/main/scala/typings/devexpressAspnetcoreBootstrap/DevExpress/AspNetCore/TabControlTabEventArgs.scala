package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabControlTabEventArgs
  extends StObject
     with EventArgs {
  
  val tab: BootstrapTab
}
object TabControlTabEventArgs {
  
  inline def apply(sender: Control, tab: BootstrapTab): TabControlTabEventArgs = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabControlTabEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabControlTabEventArgs] (val x: Self) extends AnyVal {
    
    inline def setTab(value: BootstrapTab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
