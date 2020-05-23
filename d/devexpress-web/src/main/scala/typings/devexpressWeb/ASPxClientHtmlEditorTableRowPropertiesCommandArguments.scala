package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLEROWPROPERTIES_DIALOG_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorTableRowPropertiesCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Contains the style settings specifying the appearance of the specified table row.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
}

object ASPxClientHtmlEditorTableRowPropertiesCommandArguments {
  @scala.inline
  def apply(selectedElement: js.Any, styleSettings: ASPxClientHtmlEditorCommandStyleSettings): ASPxClientHtmlEditorTableRowPropertiesCommandArguments = {
    val __obj = js.Dynamic.literal(selectedElement = selectedElement.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorTableRowPropertiesCommandArguments]
  }
}

