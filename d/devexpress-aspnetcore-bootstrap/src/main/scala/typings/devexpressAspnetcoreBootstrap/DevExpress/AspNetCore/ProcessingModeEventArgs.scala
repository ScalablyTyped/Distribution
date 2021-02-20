package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessingModeEventArgs extends EventArgs {
  
  var processOnServer: Boolean = js.native
}
object ProcessingModeEventArgs {
  
  @scala.inline
  def apply(processOnServer: Boolean, sender: Control): ProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingModeEventArgs]
  }
  
  @scala.inline
  implicit class ProcessingModeEventArgsMutableBuilder[Self <: ProcessingModeEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessOnServer(value: Boolean): Self = StObject.set(x, "processOnServer", value.asInstanceOf[js.Any])
  }
}
