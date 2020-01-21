package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for parameters used in the ASPxHtmlEditor's client-side commands.
  */
@JSGlobal("ASPxClientHtmlEditorCommandArguments")
@js.native
class ASPxClientHtmlEditorCommandArguments protected () extends js.Object {
  def this(htmlEditor: ASPxClientHtmlEditor) = this()
  def this(htmlEditor: ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  var selectedElement: js.Any = js.native
}

