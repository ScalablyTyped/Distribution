package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomDialogClosing client event.
  */
trait ASPxClientHtmlEditorCustomDialogClosingEventArgs extends ASPxClientHtmlEditorCustomDialogCloseEventArgsBase {
  /**
    * Gets or sets a value specifying whether the event was handled.
    * Value: true if the event was handled and default processing should not occur; false if the event should be handled using default processing.
    */
  var handled: Boolean
}

object ASPxClientHtmlEditorCustomDialogClosingEventArgs {
  @scala.inline
  def apply(handled: Boolean, name: String, status: js.Object): ASPxClientHtmlEditorCustomDialogClosingEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, name = name, status = status)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogClosingEventArgs]
  }
}

