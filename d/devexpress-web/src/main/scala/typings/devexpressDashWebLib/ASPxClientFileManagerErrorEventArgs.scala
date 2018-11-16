package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the ErrorOccurred event.
 */

trait ASPxClientFileManagerErrorEventArgs extends ASPxClientEventArgs {
  /**
       * Gets the name of the processed command.
       * Value: A string value representing the processed command's name.
       */
  var commandName: java.lang.String
  /**
       * Gets a specifically generated code that uniquely identifies an error, which occurs while editing an item.
       * Value: An integer value that specifies the code uniquely identifying an error.
       */
  var errorCode: scala.Double
  /**
       * Gets or sets the error description.
       * Value: A string value specifying the error description.
       */
  var errorText: java.lang.String
  /**
       * Gets or sets a value specifying whether an event error message is sent to the ErrorAlertDisplaying event.
       * Value: true to sent an error message; otherwise, false.
       */
  var showAlert: scala.Boolean
}

