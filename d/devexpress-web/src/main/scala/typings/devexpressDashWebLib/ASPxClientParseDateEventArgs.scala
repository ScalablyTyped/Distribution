package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ParseDate client-side event that parses a string entered into a date editor.
  */
trait ASPxClientParseDateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets the edit value of the date editor.
    * Value: A date/time value representing the edit value of the date editor.
    */
  var date: stdLib.Date
  /**
    * Gets or sets a value specifying whether the event was handled.
    * Value: true if the event was handled and default processing should not occur; false if the event should be handled using default processing.
    */
  var handled: scala.Boolean
  /**
    * Gets the value entered into the date editor by an end user.
    * Value: The string value entered into the date editor by an end user.
    */
  var value: java.lang.String
}

object ASPxClientParseDateEventArgs {
  @scala.inline
  def apply(date: stdLib.Date, handled: scala.Boolean, value: java.lang.String): ASPxClientParseDateEventArgs = {
    val __obj = js.Dynamic.literal(date = date, handled = handled, value = value)
  
    __obj.asInstanceOf[ASPxClientParseDateEventArgs]
  }
}

