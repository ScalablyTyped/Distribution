package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewFocusEventArgs
  extends StObject
     with ProcessingModeEventArgs {
  
  val isChangedOnServer: Boolean
}
object GridViewFocusEventArgs {
  
  @scala.inline
  def apply(isChangedOnServer: Boolean, processOnServer: Boolean, sender: Control): GridViewFocusEventArgs = {
    val __obj = js.Dynamic.literal(isChangedOnServer = isChangedOnServer.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewFocusEventArgs]
  }
  
  @scala.inline
  implicit class GridViewFocusEventArgsMutableBuilder[Self <: GridViewFocusEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsChangedOnServer(value: Boolean): Self = StObject.set(x, "isChangedOnServer", value.asInstanceOf[js.Any])
  }
}
