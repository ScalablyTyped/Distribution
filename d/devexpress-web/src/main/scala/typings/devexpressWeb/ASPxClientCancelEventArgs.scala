package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for cancelable client events.
  */
trait ASPxClientCancelEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  var cancel: Boolean
}
object ASPxClientCancelEventArgs {
  
  inline def apply(cancel: Boolean): ASPxClientCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCancelEventArgs]
  }
  
  extension [Self <: ASPxClientCancelEventArgs](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
  }
}
