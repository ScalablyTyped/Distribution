package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingModeCancelEventArgs
  extends StObject
     with ProcessingModeEventArgs {
  
  var cancel: Boolean
}
object ProcessingModeCancelEventArgs {
  
  inline def apply(cancel: Boolean, processOnServer: Boolean, sender: Control): ProcessingModeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingModeCancelEventArgs]
  }
  
  extension [Self <: ProcessingModeCancelEventArgs](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
  }
}
