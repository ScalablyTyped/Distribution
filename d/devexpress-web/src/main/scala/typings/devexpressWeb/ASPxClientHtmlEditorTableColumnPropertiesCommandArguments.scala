package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLECOLUMNPROPERTIES_DIALOG_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorTableColumnPropertiesCommandArguments")
@js.native
class ASPxClientHtmlEditorTableColumnPropertiesCommandArguments protected () extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorTableColumnPropertiesCommandArguments class with specified settings.
    * @param htmlEditor The HTML editor executing a command.
    * @param selectedElement An object containing the currently selected element in the HTML editor.
    */
  def this(htmlEditor: ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  /**
    * Contains the style settings defining the appearance of the target column element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings = js.native
}

