package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.CustomDialogClosed client event.
  */
trait ASPxClientHtmlEditorCustomDialogClosedEventArgs extends ASPxClientHtmlEditorCustomDialogCloseEventArgsBase {
  /**
    * Gets an object associated with the closed dialog.
    */
  var data: js.Any
}

object ASPxClientHtmlEditorCustomDialogClosedEventArgs {
  @scala.inline
  def apply(data: js.Any, name: String, status: js.Any): ASPxClientHtmlEditorCustomDialogClosedEventArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogClosedEventArgs]
  }
}

