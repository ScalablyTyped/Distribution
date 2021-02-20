package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client events related to the beginning of a callback processing round trip.
  */
@js.native
trait ASPxClientBeginCallbackEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a command name that identifies which client action forced a callback to occur.
    */
  var command: String = js.native
}
object ASPxClientBeginCallbackEventArgs {
  
  @scala.inline
  def apply(command: String): ASPxClientBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientBeginCallbackEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientBeginCallbackEventArgsMutableBuilder[Self <: ASPxClientBeginCallbackEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
