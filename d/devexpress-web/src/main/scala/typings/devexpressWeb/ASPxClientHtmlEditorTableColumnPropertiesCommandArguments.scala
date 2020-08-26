package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLECOLUMNPROPERTIES_DIALOG_COMMAND command parameter.
  */
@js.native
trait ASPxClientHtmlEditorTableColumnPropertiesCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Contains the style settings defining the appearance of the target column element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings = js.native
}

object ASPxClientHtmlEditorTableColumnPropertiesCommandArguments {
  @scala.inline
  def apply(selectedElement: js.Any, styleSettings: ASPxClientHtmlEditorCommandStyleSettings): ASPxClientHtmlEditorTableColumnPropertiesCommandArguments = {
    val __obj = js.Dynamic.literal(selectedElement = selectedElement.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorTableColumnPropertiesCommandArguments]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorTableColumnPropertiesCommandArgumentsOps[Self <: ASPxClientHtmlEditorTableColumnPropertiesCommandArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStyleSettings(value: ASPxClientHtmlEditorCommandStyleSettings): Self = this.set("styleSettings", value.asInstanceOf[js.Any])
  }
  
}

