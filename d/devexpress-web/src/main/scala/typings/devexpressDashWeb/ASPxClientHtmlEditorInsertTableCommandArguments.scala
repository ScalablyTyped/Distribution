package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the INSERTTABLE_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorInsertTableCommandArguments extends ASPxClientHtmlEditorTablePropertiesCommandArguments {
  /**
    * Gets or sets the count of columns in the table.
    * Value: An integer value that is the count of columns.
    */
  var columns: Double
  /**
    * Gets or sets a value indicating whether all table columns should have equal width.
    * Value: true, to create equal widths for all columns; otherwise, false.
    */
  var isEqualColumnWidth: Boolean
  /**
    * Gets or sets the count of rows in the table.
    * Value: An integer value that is the count of rows.
    */
  var rows: Double
}

object ASPxClientHtmlEditorInsertTableCommandArguments {
  @scala.inline
  def apply(
    align: String,
    caption: String,
    cellPadding: Double,
    cellSpacing: Double,
    columns: Double,
    headers: String,
    isEqualColumnWidth: Boolean,
    rows: Double,
    selectedElement: js.Object,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings,
    summary: String
  ): ASPxClientHtmlEditorInsertTableCommandArguments = {
    val __obj = js.Dynamic.literal(align = align, caption = caption, cellPadding = cellPadding, cellSpacing = cellSpacing, columns = columns, headers = headers, isEqualColumnWidth = isEqualColumnWidth, rows = rows, selectedElement = selectedElement, styleSettings = styleSettings, summary = summary)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertTableCommandArguments]
  }
}

