package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the TABLECOLUMNPROPERTIES_DIALOG_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorTableColumnPropertiesCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Contains the style settings defining the appearance of the target column element.
    * Value: An <see cref="ASPxClientHtmlEditorCommandStyleSettings" /> object that contains the style settings defining the appearance of the target column element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
}

object ASPxClientHtmlEditorTableColumnPropertiesCommandArguments {
  @scala.inline
  def apply(selectedElement: js.Object, styleSettings: ASPxClientHtmlEditorCommandStyleSettings): ASPxClientHtmlEditorTableColumnPropertiesCommandArguments = {
    val __obj = js.Dynamic.literal(selectedElement = selectedElement, styleSettings = styleSettings)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorTableColumnPropertiesCommandArguments]
  }
}

