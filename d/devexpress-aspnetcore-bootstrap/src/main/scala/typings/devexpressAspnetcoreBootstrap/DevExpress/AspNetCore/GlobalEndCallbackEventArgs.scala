package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalEndCallbackEventArgs
  extends StObject
     with EventArgs {
  
  val control: Control
}
object GlobalEndCallbackEventArgs {
  
  @scala.inline
  def apply(control: Control, sender: Control): GlobalEndCallbackEventArgs = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalEndCallbackEventArgs]
  }
  
  @scala.inline
  implicit class GlobalEndCallbackEventArgsMutableBuilder[Self <: GlobalEndCallbackEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControl(value: Control): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
  }
}
