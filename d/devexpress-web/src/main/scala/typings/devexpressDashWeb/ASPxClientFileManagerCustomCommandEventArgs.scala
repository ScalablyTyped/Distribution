package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.CustomCommand event.
  */
@JSGlobal("ASPxClientFileManagerCustomCommandEventArgs")
@js.native
class ASPxClientFileManagerCustomCommandEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerCustomCommandEventArgs class with the specified setting.
    * @param commandName A string value that identifies the executed command. Initializes the ASPxClientFileManagerCustomCommandEventArgs.commandName property.
    */
  def this(commandName: String) = this()
  /**
    * Gets the name of the processed command.
    */
  var commandName: String = js.native
}

