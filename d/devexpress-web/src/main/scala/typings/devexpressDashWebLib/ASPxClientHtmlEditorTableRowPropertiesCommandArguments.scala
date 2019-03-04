package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the TABLEROWPROPERTIES_DIALOG_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorTableRowPropertiesCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Contains the style settings specifying the appearance of the specified table row.
    * Value: An <see cref="ASPxClientHtmlEditorCommandStyleSettings" /> object that contains the style settings specifying the appearance of the specified table row.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
}

object ASPxClientHtmlEditorTableRowPropertiesCommandArguments {
  @scala.inline
  def apply(selectedElement: js.Object, styleSettings: ASPxClientHtmlEditorCommandStyleSettings): ASPxClientHtmlEditorTableRowPropertiesCommandArguments = {
    val __obj = js.Dynamic.literal(selectedElement = selectedElement, styleSettings = styleSettings)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorTableRowPropertiesCommandArguments]
  }
}

