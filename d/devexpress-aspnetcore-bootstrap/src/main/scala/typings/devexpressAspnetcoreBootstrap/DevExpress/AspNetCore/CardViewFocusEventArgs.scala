package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardViewFocusEventArgs
  extends StObject
     with ProcessingModeEventArgs {
  
  val isChangedOnServer: Boolean
}
object CardViewFocusEventArgs {
  
  inline def apply(isChangedOnServer: Boolean, processOnServer: Boolean, sender: Control): CardViewFocusEventArgs = {
    val __obj = js.Dynamic.literal(isChangedOnServer = isChangedOnServer.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewFocusEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardViewFocusEventArgs] (val x: Self) extends AnyVal {
    
    inline def setIsChangedOnServer(value: Boolean): Self = StObject.set(x, "isChangedOnServer", value.asInstanceOf[js.Any])
  }
}
