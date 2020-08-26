package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditTemplateCellFocused event.
  */
@js.native
trait ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the currently processed column.
    */
  var column: ASPxClientGridViewColumn = js.native
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean = js.native
}

object ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs {
  @scala.inline
  def apply(column: ASPxClientGridViewColumn, handled: Boolean): ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGridViewBatchEditTemplateCellFocusedEventArgsOps[Self <: ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs] (val x: Self) extends AnyVal {
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
    def setColumn(value: ASPxClientGridViewColumn): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
  }
  
}

