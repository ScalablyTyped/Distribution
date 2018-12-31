package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CommandExecuting event.
  */
trait ASPxClientHtmlEditorCommandExecutingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the name of the processed command.
    * Value: A string value specifying the processed command's name.
    */
  var commandName: java.lang.String
  /**
    * Gets an optional parameter that complements the processed command.
    * Value: An object containing additional information about the processed command.
    */
  var parameter: js.Object
}

