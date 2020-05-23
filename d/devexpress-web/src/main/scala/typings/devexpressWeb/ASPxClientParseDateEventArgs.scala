package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateEdit.ParseDate client-side event that parses a string entered into a date editor.
  */
trait ASPxClientParseDateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets the edit value of the date editor.
    */
  var date: Date
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean
  /**
    * Gets the value entered into the date editor by an end user.
    */
  var value: String
}

object ASPxClientParseDateEventArgs {
  @scala.inline
  def apply(date: Date, handled: Boolean, value: String): ASPxClientParseDateEventArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientParseDateEventArgs]
  }
}

