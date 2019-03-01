package typings
package devexpressDashWebLib

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
  var handled: scala.Boolean
}

object ASPxClientHtmlEditorCustomDialogClosingEventArgs {
  @scala.inline
  def apply(handled: scala.Boolean, name: java.lang.String, status: js.Object): ASPxClientHtmlEditorCustomDialogClosingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handled")(handled)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogClosingEventArgs]
  }
}

