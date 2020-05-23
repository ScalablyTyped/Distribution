package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLECELLPROPERTIES_DIALOG_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorTableCellPropertiesCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Gets or sets a value that indicates whether the cell settings should be applied to all cells in the table.
    */
  var applyForAll: Boolean
  /**
    * Contains the style settings defining the appearance of the target cell element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
}

object ASPxClientHtmlEditorTableCellPropertiesCommandArguments {
  @scala.inline
  def apply(
    applyForAll: Boolean,
    selectedElement: js.Any,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorTableCellPropertiesCommandArguments = {
    val __obj = js.Dynamic.literal(applyForAll = applyForAll.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorTableCellPropertiesCommandArguments]
  }
}

