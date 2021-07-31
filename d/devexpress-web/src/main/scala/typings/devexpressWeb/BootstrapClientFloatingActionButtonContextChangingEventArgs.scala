package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapClientFloatingActionButtonContextChangingEventArgs
  extends StObject
     with ASPxClientFloatingActionButtonContextChangingEventArgs {
  
  @JSName("action")
  var action_BootstrapClientFloatingActionButtonContextChangingEventArgs: BootstrapClientFABAction
}
object BootstrapClientFloatingActionButtonContextChangingEventArgs {
  
  @scala.inline
  def apply(action: BootstrapClientFABAction): BootstrapClientFloatingActionButtonContextChangingEventArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientFloatingActionButtonContextChangingEventArgs]
  }
  
  @scala.inline
  implicit class BootstrapClientFloatingActionButtonContextChangingEventArgsMutableBuilder[Self <: BootstrapClientFloatingActionButtonContextChangingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: BootstrapClientFABAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
