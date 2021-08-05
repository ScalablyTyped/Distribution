package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDropDownEdit.DropDownCommandButtonClick event.
  */
trait ASPxClientDropDownCommandEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the name of the processed command in the ASPxClientDropDownEdit.DropDownCommandButtonClick event.
    */
  var commandName: String
}
object ASPxClientDropDownCommandEventArgs {
  
  inline def apply(cancel: Boolean, commandName: String): ASPxClientDropDownCommandEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], commandName = commandName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDropDownCommandEventArgs]
  }
  
  extension [Self <: ASPxClientDropDownCommandEventArgs](x: Self) {
    
    inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
  }
}
