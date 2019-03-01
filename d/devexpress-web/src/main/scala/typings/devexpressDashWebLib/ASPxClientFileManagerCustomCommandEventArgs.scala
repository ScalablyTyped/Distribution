package typings
package devexpressDashWebLib

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
  var commandName: java.lang.String
}

object ASPxClientFileManagerCustomCommandEventArgs {
  @scala.inline
  def apply(commandName: java.lang.String): ASPxClientFileManagerCustomCommandEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commandName")(commandName)
    __obj.asInstanceOf[ASPxClientFileManagerCustomCommandEventArgs]
  }
}

