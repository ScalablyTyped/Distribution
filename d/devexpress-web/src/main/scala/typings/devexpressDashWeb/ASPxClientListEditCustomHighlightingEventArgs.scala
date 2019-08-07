package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientComboBox.CustomHighlighting and ASPxClientListBox.CustomHighlighting events.
  */
@JSGlobal("ASPxClientListEditCustomHighlightingEventArgs")
@js.native
/**
  * Initializes a new instance of the ASPxClientListEditCustomHighlightingEventArgs class.
  */
class ASPxClientListEditCustomHighlightingEventArgs () extends ASPxClientEventArgs {
  /**
    * Gets a string that is a filter condition for the editor's items typed by a user.
    */
  var filter: String = js.native
  /**
    * Specifies rules according to which the editor highlights the filtered items.
    */
  var highlighting: js.Any = js.native
}

