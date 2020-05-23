package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.CustomCommand event.
  */
trait ASPxClientFileManagerCustomCommandEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    */
  var commandName: String
}

object ASPxClientFileManagerCustomCommandEventArgs {
  @scala.inline
  def apply(commandName: String): ASPxClientFileManagerCustomCommandEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerCustomCommandEventArgs]
  }
}

