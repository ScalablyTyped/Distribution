package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalEndCallbackEventArgs extends EventArgs {
  
  val control: Control = js.native
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
