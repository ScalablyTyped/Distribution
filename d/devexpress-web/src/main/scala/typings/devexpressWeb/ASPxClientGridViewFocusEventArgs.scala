package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the corresponding event.
  */
@js.native
trait ASPxClientGridViewFocusEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets whether the row focusing has been changed on the server.
    */
  var isChangedOnServer: Boolean = js.native
}
object ASPxClientGridViewFocusEventArgs {
  
  @scala.inline
  def apply(isChangedOnServer: Boolean, processOnServer: Boolean): ASPxClientGridViewFocusEventArgs = {
    val __obj = js.Dynamic.literal(isChangedOnServer = isChangedOnServer.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewFocusEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewFocusEventArgsMutableBuilder[Self <: ASPxClientGridViewFocusEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsChangedOnServer(value: Boolean): Self = StObject.set(x, "isChangedOnServer", value.asInstanceOf[js.Any])
  }
}
