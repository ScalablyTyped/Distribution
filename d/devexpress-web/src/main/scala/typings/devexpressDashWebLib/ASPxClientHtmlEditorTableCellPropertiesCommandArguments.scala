package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the TABLECELLPROPERTIES_DIALOG_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorTableCellPropertiesCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Gets or sets a value that indicates whether the cell settings should be applied to all cells in the table.
    * Value: true, if the cell settings should be applied to all cells in the table; otherwise, false.
    */
  var applyForAll: scala.Boolean
  /**
    * Contains the style settings defining the appearance of the target cell element.
    * Value: An <see cref="ASPxClientHtmlEditorCommandStyleSettings" /> object that contains the style settings defining the appearance of the target cell element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
}

object ASPxClientHtmlEditorTableCellPropertiesCommandArguments {
  @scala.inline
  def apply(
    applyForAll: scala.Boolean,
    selectedElement: js.Object,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorTableCellPropertiesCommandArguments = {
    val __obj = js.Dynamic.literal(applyForAll = applyForAll, selectedElement = selectedElement, styleSettings = styleSettings)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorTableCellPropertiesCommandArguments]
  }
}

