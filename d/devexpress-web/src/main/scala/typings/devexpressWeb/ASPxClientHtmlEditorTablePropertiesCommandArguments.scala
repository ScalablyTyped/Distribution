package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLEPROPERTIES_DIALOG_COMMAND command parameter.
  */
@js.native
trait ASPxClientHtmlEditorTablePropertiesCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Determines the position of the target table element.
    */
  var align: String = js.native
  /**
    * Gets or sets a value that is the table caption.
    */
  var caption: String = js.native
  /**
    * Gets or sets a table cell padding.
    */
  var cellPadding: Double = js.native
  /**
    * Gets or sets the table cell spacing.
    */
  var cellSpacing: Double = js.native
  /**
    * Gets or sets a value indicating whether the first row/column serves as the table's header.
    */
  var headers: String = js.native
  /**
    * Contains the style settings defining the appearance of the target table element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings = js.native
  /**
    * Gets or sets the table's summary.
    */
  var summary: String = js.native
}

object ASPxClientHtmlEditorTablePropertiesCommandArguments {
  @scala.inline
  def apply(
    align: String,
    caption: String,
    cellPadding: Double,
    cellSpacing: Double,
    headers: String,
    selectedElement: js.Any,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings,
    summary: String
  ): ASPxClientHtmlEditorTablePropertiesCommandArguments = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], cellPadding = cellPadding.asInstanceOf[js.Any], cellSpacing = cellSpacing.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorTablePropertiesCommandArguments]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorTablePropertiesCommandArgumentsOps[Self <: ASPxClientHtmlEditorTablePropertiesCommandArguments] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellPadding(value: Double): Self = this.set("cellPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellSpacing(value: Double): Self = this.set("cellSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: String): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleSettings(value: ASPxClientHtmlEditorCommandStyleSettings): Self = this.set("styleSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
  }
  
}

