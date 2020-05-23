package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events that relate to custom dialog operations.
  */
trait ASPxClientHtmlEditorCustomDialogEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name that uniquely identifies the processed custom dialog.
    */
  var name: String
}

object ASPxClientHtmlEditorCustomDialogEventArgs {
  @scala.inline
  def apply(name: String): ASPxClientHtmlEditorCustomDialogEventArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogEventArgs]
  }
}

