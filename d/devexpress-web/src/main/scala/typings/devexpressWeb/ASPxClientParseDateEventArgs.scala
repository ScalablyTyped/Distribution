package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateEdit.ParseDate client-side event that parses a string entered into a date editor.
  */
@JSGlobal("ASPxClientParseDateEventArgs")
@js.native
class ASPxClientParseDateEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientParseDateEventArgs class with specified settings.
    * @param value A string containing the value entered into the date editor.
    */
  def this(value: String) = this()
  /**
    * Gets or sets the edit value of the date editor.
    */
  var date: Date = js.native
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean = js.native
  /**
    * Gets the value entered into the date editor by an end user.
    */
  var value: String = js.native
}

