package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientComboBox.CustomHighlighting and ASPxClientListBox.CustomHighlighting events.
  */
trait ASPxClientListEditCustomHighlightingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that is a filter condition for the editor's items typed by a user.
    */
  var filter: String
  /**
    * Specifies rules according to which the editor highlights the filtered items.
    */
  var highlighting: js.Any
}

object ASPxClientListEditCustomHighlightingEventArgs {
  @scala.inline
  def apply(filter: String, highlighting: js.Any): ASPxClientListEditCustomHighlightingEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], highlighting = highlighting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientListEditCustomHighlightingEventArgs]
  }
}

