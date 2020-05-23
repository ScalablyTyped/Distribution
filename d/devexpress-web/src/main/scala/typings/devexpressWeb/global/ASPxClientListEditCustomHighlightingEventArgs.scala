package typings.devexpressWeb.global

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
class ASPxClientListEditCustomHighlightingEventArgs ()
  extends typings.devexpressWeb.ASPxClientListEditCustomHighlightingEventArgs {
  /**
    * Gets a string that is a filter condition for the editor's items typed by a user.
    */
  /* CompleteClass */
  override var filter: String = js.native
  /**
    * Specifies rules according to which the editor highlights the filtered items.
    */
  /* CompleteClass */
  override var highlighting: js.Any = js.native
}

