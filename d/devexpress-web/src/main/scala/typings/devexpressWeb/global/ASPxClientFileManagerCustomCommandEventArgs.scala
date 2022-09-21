package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.CustomCommand event.
  */
@JSGlobal("ASPxClientFileManagerCustomCommandEventArgs")
@js.native
open class ASPxClientFileManagerCustomCommandEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFileManagerCustomCommandEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerCustomCommandEventArgs class with the specified setting.
    * @param commandName A string value that identifies the executed command. Initializes the ASPxClientFileManagerCustomCommandEventArgs.commandName property.
    */
  def this(commandName: String) = this()
  
  /**
    * Gets the name of the processed command.
    */
  /* CompleteClass */
  var commandName: String = js.native
}
