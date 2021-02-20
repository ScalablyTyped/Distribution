package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for cancelable client events.
  */
@js.native
trait ASPxClientCancelEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean = js.native
}
object ASPxClientCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean): ASPxClientCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCancelEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCancelEventArgsMutableBuilder[Self <: ASPxClientCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
  }
}
