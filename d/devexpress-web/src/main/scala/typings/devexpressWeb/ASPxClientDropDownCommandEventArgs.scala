package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDropDownEdit.DropDownCommandButtonClick event.
  */
@js.native
trait ASPxClientDropDownCommandEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets the name of the processed command in the ASPxClientDropDownEdit.DropDownCommandButtonClick event.
    */
  var commandName: String = js.native
}
object ASPxClientDropDownCommandEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, commandName: String): ASPxClientDropDownCommandEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], commandName = commandName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDropDownCommandEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDropDownCommandEventArgsMutableBuilder[Self <: ASPxClientDropDownCommandEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
  }
}
