package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLEPROPERTIES_DIALOG_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorTablePropertiesCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Determines the position of the target table element.
    */
  var align: String
  /**
    * Gets or sets a value that is the table caption.
    */
  var caption: String
  /**
    * Gets or sets a table cell padding.
    */
  var cellPadding: Double
  /**
    * Gets or sets the table cell spacing.
    */
  var cellSpacing: Double
  /**
    * Gets or sets a value indicating whether the first row/column serves as the table's header.
    */
  var headers: String
  /**
    * Contains the style settings defining the appearance of the target table element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  /**
    * Gets or sets the table's summary.
    */
  var summary: String
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
}

