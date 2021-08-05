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
  
  inline def apply(action: BootstrapClientFABAction): BootstrapClientFloatingActionButtonContextChangingEventArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientFloatingActionButtonContextChangingEventArgs]
  }
  
  extension [Self <: BootstrapClientFloatingActionButtonContextChangingEventArgs](x: Self) {
    
    inline def setAction(value: BootstrapClientFABAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
