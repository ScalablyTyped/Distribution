package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the TABLEPROPERTIES_DIALOG_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorTablePropertiesCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Determines the position of the target table element.
    * Value: A string value indicating the position of the target table element.
    */
  var align: String
  /**
    * Gets or sets a value that is the table caption.
    * Value: A string value that is the caption.
    */
  var caption: String
  /**
    * Gets or sets a table cell padding.
    * Value: An integer value that is the cell padding.
    */
  var cellPadding: Double
  /**
    * Gets or sets the table cell spacing.
    * Value: An integer value that is the table cell spacing.
    */
  var cellSpacing: Double
  /**
    * Gets or sets a value indicating whether the first row/column serves as the table's header.
    * Value: A string value that specifies whether the first row/column serves as the table's header.
    */
  var headers: String
  /**
    * Contains the style settings defining the appearance of the target table element.
    * Value: An <see cref="ASPxClientHtmlEditorCommandStyleSettings" /> object that contains the style settings defining the appearance of the target table element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  /**
    * Gets or sets the table's summary.
    * Value: A string value that is the table's summary.
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
    selectedElement: js.Object,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings,
    summary: String
  ): ASPxClientHtmlEditorTablePropertiesCommandArguments = {
    val __obj = js.Dynamic.literal(align = align, caption = caption, cellPadding = cellPadding, cellSpacing = cellSpacing, headers = headers, selectedElement = selectedElement, styleSettings = styleSettings, summary = summary)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorTablePropertiesCommandArguments]
  }
}

