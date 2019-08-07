package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings to define the table cell formatting.
  */
@JSGlobal("TableCellFormattingSettings")
@js.native
class TableCellFormattingSettings () extends js.Object {
  /**
    * Gets or sets a table cell's bottom margin in twips.
    */
  var marginBottom: Double = js.native
  /**
    * Gets or sets a table cell's left margin in twips.
    */
  var marginLeft: Double = js.native
  /**
    * Gets or sets a table cell's right margin in twips.
    */
  var marginRight: Double = js.native
  /**
    * Gets or sets a table cell's top margin in twips.
    */
  var marginTop: Double = js.native
  /**
    * Specifies whether a table cell's margins are inherited from the table level settings.
    */
  var marginsSameAsTable: Boolean = js.native
  /**
    * Sspecifies whether text is wrapped in a table cell.
    */
  var noWrap: Boolean = js.native
  /**
    * Gets or sets a table cell's preferred width.
    */
  var preferredWidth: TableWidthUnit = js.native
  /**
    * Gets or sets the vertical alignment of a table cell's content.
    */
  var verticalAlignment: TableCellVerticalAlignment = js.native
}

