package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomCommand event.
  */
trait ASPxClientFileManagerCustomCommandEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    * Value: A string value that is the processed command's name.
    */
  var commandName: String
}

object ASPxClientFileManagerCustomCommandEventArgs {
  @scala.inline
  def apply(commandName: String): ASPxClientFileManagerCustomCommandEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName)
  
    __obj.asInstanceOf[ASPxClientFileManagerCustomCommandEventArgs]
  }
}

