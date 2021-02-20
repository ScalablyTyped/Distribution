package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the corresponding event.
  */
@js.native
trait ASPxClientCardViewFocusEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets whether card focusing has been changed on the server.
    */
  var isChangedOnServer: Boolean = js.native
}
object ASPxClientCardViewFocusEventArgs {
  
  @scala.inline
  def apply(isChangedOnServer: Boolean, processOnServer: Boolean): ASPxClientCardViewFocusEventArgs = {
    val __obj = js.Dynamic.literal(isChangedOnServer = isChangedOnServer.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewFocusEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCardViewFocusEventArgsMutableBuilder[Self <: ASPxClientCardViewFocusEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsChangedOnServer(value: Boolean): Self = StObject.set(x, "isChangedOnServer", value.asInstanceOf[js.Any])
  }
}
