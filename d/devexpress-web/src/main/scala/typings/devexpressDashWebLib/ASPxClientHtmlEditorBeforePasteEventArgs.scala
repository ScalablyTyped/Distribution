package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BeforePaste event.
  */
trait ASPxClientHtmlEditorBeforePasteEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    * Value: A string value identifying the command's name.
    */
  var commandName: java.lang.String
  /**
    * Gets or sets the HTML markup that is about to be pasted to the ASPxHtmlEditor's content.
    * Value: A string value that specifies the HTML content to paste.
    */
  var html: java.lang.String
}

