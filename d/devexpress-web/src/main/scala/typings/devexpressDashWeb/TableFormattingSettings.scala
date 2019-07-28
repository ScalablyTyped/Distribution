package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings to format a table.
  */
trait TableFormattingSettings extends js.Object {
  /**
    * Gets or sets the alignment of table rows.
    * Value: One of the <see cref="TableRowAlignment" /> values.
    */
  var alignment: js.Any
  /**
    * Gets or sets a value specifying whether spacing is allowed between table cells.
    * Value: true, to allow spacing; otherwise, false.
    */
  var allowSpacingBetweenCells: Boolean
  /**
    * Gets or sets the default bottom margin for cells in the table in twips.
    * Value: An integer value specifying the margin value.
    */
  var defaultCellMarginBottom: Double
  /**
    * Gets or sets the default left margin for cells in the table in twips.
    * Value: An integer value specifying the margin value.
    */
  var defaultCellMarginLeft: Double
  /**
    * Gets or sets the default right margin for cells in the table in twips.
    * Value: An integer value specifying the margin value.
    */
  var defaultCellMarginRight: Double
  /**
    * Gets or sets the default top margin for cells in the table in twips.
    * Value: An integer value specifying the margin value.
    */
  var defaultCellMarginTop: Double
  /**
    * Gets or sets the table's left indent in twips.
    * Value: An integer value specifying the indent.
    */
  var indent: Double
  /**
    * Gets or sets the preferred width of cells in the table.
    * Value: A <see cref="TableWidthUnit" /> object specifying the width.
    */
  var preferredWidth: TableWidthUnit
  /**
    * Gets or sets a value that specifying whether to allow automatic resizing of table cells to fit their contents.
    * Value: true, to allow automatic resizing; otherwise, false.
    */
  var resizeToFitContent: Boolean
  /**
    * Gets or sets the spacing between table cells in twips.
    * Value: An integer value specifying the spacing.
    */
  var spacingBetweenCells: Double
}

object TableFormattingSettings {
  @scala.inline
  def apply(
    alignment: js.Any,
    allowSpacingBetweenCells: Boolean,
    defaultCellMarginBottom: Double,
    defaultCellMarginLeft: Double,
    defaultCellMarginRight: Double,
    defaultCellMarginTop: Double,
    indent: Double,
    preferredWidth: TableWidthUnit,
    resizeToFitContent: Boolean,
    spacingBetweenCells: Double
  ): TableFormattingSettings = {
    val __obj = js.Dynamic.literal(alignment = alignment, allowSpacingBetweenCells = allowSpacingBetweenCells, defaultCellMarginBottom = defaultCellMarginBottom, defaultCellMarginLeft = defaultCellMarginLeft, defaultCellMarginRight = defaultCellMarginRight, defaultCellMarginTop = defaultCellMarginTop, indent = indent, preferredWidth = preferredWidth, resizeToFitContent = resizeToFitContent, spacingBetweenCells = spacingBetweenCells)
  
    __obj.asInstanceOf[TableFormattingSettings]
  }
}

