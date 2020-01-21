package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings to format a table.
  */
@JSGlobal("TableFormattingSettings")
@js.native
class TableFormattingSettings () extends js.Object {
  /**
    * Gets or sets the alignment of table rows.
    */
  var alignment: TableRowAlignment = js.native
  /**
    * Gets or sets a value specifying whether spacing is allowed between table cells.
    */
  var allowSpacingBetweenCells: Boolean = js.native
  /**
    * Gets or sets the default bottom margin for cells in the table in twips.
    */
  var defaultCellMarginBottom: Double = js.native
  /**
    * Gets or sets the default left margin for cells in the table in twips.
    */
  var defaultCellMarginLeft: Double = js.native
  /**
    * Gets or sets the default right margin for cells in the table in twips.
    */
  var defaultCellMarginRight: Double = js.native
  /**
    * Gets or sets the default top margin for cells in the table in twips.
    */
  var defaultCellMarginTop: Double = js.native
  /**
    * Gets or sets the table's left indent in twips.
    */
  var indent: Double = js.native
  /**
    * Gets or sets the preferred width of cells in the table.
    */
  var preferredWidth: TableWidthUnit = js.native
  /**
    * Gets or sets a value that specifying whether to allow automatic resizing of table cells to fit their contents.
    */
  var resizeToFitContent: Boolean = js.native
  /**
    * Gets or sets the spacing between table cells in twips.
    */
  var spacingBetweenCells: Double = js.native
}

