package typings
package devexpressDashWebLib

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
  var columns: scala.Double
  /**
    * Gets or sets a value indicating whether all table columns should have equal width.
    * Value: true, to create equal widths for all columns; otherwise, false.
    */
  var isEqualColumnWidth: scala.Boolean
  /**
    * Gets or sets the count of rows in the table.
    * Value: An integer value that is the count of rows.
    */
  var rows: scala.Double
}

object ASPxClientHtmlEditorInsertTableCommandArguments {
  @scala.inline
  def apply(
    align: java.lang.String,
    caption: java.lang.String,
    cellPadding: scala.Double,
    cellSpacing: scala.Double,
    columns: scala.Double,
    headers: java.lang.String,
    isEqualColumnWidth: scala.Boolean,
    rows: scala.Double,
    selectedElement: js.Object,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings,
    summary: java.lang.String
  ): ASPxClientHtmlEditorInsertTableCommandArguments = {
    val __obj = js.Dynamic.literal(align = align, caption = caption, cellPadding = cellPadding, cellSpacing = cellSpacing, columns = columns, headers = headers, isEqualColumnWidth = isEqualColumnWidth, rows = rows, selectedElement = selectedElement, styleSettings = styleSettings, summary = summary)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertTableCommandArguments]
  }
}

