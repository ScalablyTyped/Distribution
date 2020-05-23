package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLECOLUMNPROPERTIES_DIALOG_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorTableColumnPropertiesCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Contains the style settings defining the appearance of the target column element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
}

object ASPxClientHtmlEditorTableColumnPropertiesCommandArguments {
  @scala.inline
  def apply(selectedElement: js.Any, styleSettings: ASPxClientHtmlEditorCommandStyleSettings): ASPxClientHtmlEditorTableColumnPropertiesCommandArguments = {
    val __obj = js.Dynamic.literal(selectedElement = selectedElement.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorTableColumnPropertiesCommandArguments]
  }
}

