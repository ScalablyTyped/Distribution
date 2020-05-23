package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.CustomDialogClosing client event.
  */
trait ASPxClientHtmlEditorCustomDialogClosingEventArgs extends ASPxClientHtmlEditorCustomDialogCloseEventArgsBase {
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean
}

object ASPxClientHtmlEditorCustomDialogClosingEventArgs {
  @scala.inline
  def apply(handled: Boolean, name: String, status: js.Any): ASPxClientHtmlEditorCustomDialogClosingEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogClosingEventArgs]
  }
}

