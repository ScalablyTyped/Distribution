package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the CustomCommand event.
  */
@JSGlobal("ASPxClientGanttCustomCommandEventArgs")
@js.native
open class ASPxClientGanttCustomCommandEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttCustomCommandEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttCustomCommandEventArgs class with specified settings.
    * @param commandName The command name.
    * @param parameter The parameter that complements the processed command.
    */
  def this(commandName: String, parameter: Any) = this()
  
  /**
    * Specifies the command name for a custom toolbar item.
    */
  /* CompleteClass */
  var commandName: String = js.native
  
  /**
    * Gets an optional parameter that complements the processed command.
    */
  /* CompleteClass */
  var parameter: Any = js.native
}
