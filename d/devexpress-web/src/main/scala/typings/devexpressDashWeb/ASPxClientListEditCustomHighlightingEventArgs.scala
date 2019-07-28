package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomHighlighting events.
  */
trait ASPxClientListEditCustomHighlightingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that is a filter condition for the editor's items typed by a user.
    * Value: A string value specifying the filter text typed by a user.
    */
  var filter: String
  /**
    * Specifies rules according to which the editor highlights the filtered items.
    * Value: An object representing the highlighting rules.
    */
  var highlighting: js.Object
}

object ASPxClientListEditCustomHighlightingEventArgs {
  @scala.inline
  def apply(filter: String, highlighting: js.Object): ASPxClientListEditCustomHighlightingEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter, highlighting = highlighting)
  
    __obj.asInstanceOf[ASPxClientListEditCustomHighlightingEventArgs]
  }
}

