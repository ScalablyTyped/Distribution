package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings to format a table.
  */
trait TableFormattingSettings extends js.Object {
  /**
    * Gets or sets the alignment of table rows.
    */
  var alignment: TableRowAlignment
  /**
    * Gets or sets a value specifying whether spacing is allowed between table cells.
    */
  var allowSpacingBetweenCells: Boolean
  /**
    * Gets or sets the default bottom margin for cells in the table in twips.
    */
  var defaultCellMarginBottom: Double
  /**
    * Gets or sets the default left margin for cells in the table in twips.
    */
  var defaultCellMarginLeft: Double
  /**
    * Gets or sets the default right margin for cells in the table in twips.
    */
  var defaultCellMarginRight: Double
  /**
    * Gets or sets the default top margin for cells in the table in twips.
    */
  var defaultCellMarginTop: Double
  /**
    * Gets or sets the table's left indent in twips.
    */
  var indent: Double
  /**
    * Gets or sets the preferred width of cells in the table.
    */
  var preferredWidth: TableWidthUnit
  /**
    * Gets or sets a value that specifying whether to allow automatic resizing of table cells to fit their contents.
    */
  var resizeToFitContent: Boolean
  /**
    * Gets or sets the spacing between table cells in twips.
    */
  var spacingBetweenCells: Double
}

object TableFormattingSettings {
  @scala.inline
  def apply(
    alignment: TableRowAlignment,
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
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], allowSpacingBetweenCells = allowSpacingBetweenCells.asInstanceOf[js.Any], defaultCellMarginBottom = defaultCellMarginBottom.asInstanceOf[js.Any], defaultCellMarginLeft = defaultCellMarginLeft.asInstanceOf[js.Any], defaultCellMarginRight = defaultCellMarginRight.asInstanceOf[js.Any], defaultCellMarginTop = defaultCellMarginTop.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], preferredWidth = preferredWidth.asInstanceOf[js.Any], resizeToFitContent = resizeToFitContent.asInstanceOf[js.Any], spacingBetweenCells = spacingBetweenCells.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableFormattingSettings]
  }
}

