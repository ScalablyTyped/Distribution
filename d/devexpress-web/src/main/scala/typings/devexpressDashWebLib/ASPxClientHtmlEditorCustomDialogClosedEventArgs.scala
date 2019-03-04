package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomDialogClosed client event.
  */
trait ASPxClientHtmlEditorCustomDialogClosedEventArgs extends ASPxClientHtmlEditorCustomDialogCloseEventArgsBase {
  /**
    * Gets an object associated with the closed dialog.
    * Value: An object containing custom data associated with dialog closing.
    */
  var data: js.Object
}

object ASPxClientHtmlEditorCustomDialogClosedEventArgs {
  @scala.inline
  def apply(data: js.Object, name: java.lang.String, status: js.Object): ASPxClientHtmlEditorCustomDialogClosedEventArgs = {
    val __obj = js.Dynamic.literal(data = data, name = name, status = status)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogClosedEventArgs]
  }
}

