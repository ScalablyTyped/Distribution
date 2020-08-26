package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientComboBox.CustomHighlighting and ASPxClientListBox.CustomHighlighting events.
  */
@js.native
trait ASPxClientListEditCustomHighlightingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that is a filter condition for the editor's items typed by a user.
    */
  var filter: String = js.native
  /**
    * Specifies rules according to which the editor highlights the filtered items.
    */
  var highlighting: js.Any = js.native
}

object ASPxClientListEditCustomHighlightingEventArgs {
  @scala.inline
  def apply(filter: String, highlighting: js.Any): ASPxClientListEditCustomHighlightingEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], highlighting = highlighting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientListEditCustomHighlightingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientListEditCustomHighlightingEventArgsOps[Self <: ASPxClientListEditCustomHighlightingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlighting(value: js.Any): Self = this.set("highlighting", value.asInstanceOf[js.Any])
  }
  
}

