package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLEROWPROPERTIES_DIALOG_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorTableRowPropertiesCommandArguments")
@js.native
class ASPxClientHtmlEditorTableRowPropertiesCommandArguments protected () extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorTableRowPropertiesCommandArguments class with specified settings.
    * @param htmlEditor The html editor in which the target element is located.
    * @param selectedElement The element currently selected in the HTML editor.
    */
  def this(htmlEditor: ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  /**
    * Contains the style settings specifying the appearance of the specified table row.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings = js.native
}

