package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for parameters used in the ASPxHtmlEditor's client-side commands.
  */
trait ASPxClientHtmlEditorCommandArguments extends js.Object {
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  var selectedElement: js.Any
}

object ASPxClientHtmlEditorCommandArguments {
  @scala.inline
  def apply(selectedElement: js.Any): ASPxClientHtmlEditorCommandArguments = {
    val __obj = js.Dynamic.literal(selectedElement = selectedElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCommandArguments]
  }
}

