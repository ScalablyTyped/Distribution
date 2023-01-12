package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the CustomCommand event.
  */
trait ASPxClientGanttCustomCommandEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies the command name for a custom toolbar item.
    */
  var commandName: String
  
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: Any
}
object ASPxClientGanttCustomCommandEventArgs {
  
  inline def apply(commandName: String, parameter: Any): ASPxClientGanttCustomCommandEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttCustomCommandEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientGanttCustomCommandEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    inline def setParameter(value: Any): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
  }
}
