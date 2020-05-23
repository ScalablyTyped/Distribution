package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings to define the table cell formatting.
  */
trait TableCellFormattingSettings extends js.Object {
  /**
    * Gets or sets a table cell's bottom margin in twips.
    */
  var marginBottom: Double
  /**
    * Gets or sets a table cell's left margin in twips.
    */
  var marginLeft: Double
  /**
    * Gets or sets a table cell's right margin in twips.
    */
  var marginRight: Double
  /**
    * Gets or sets a table cell's top margin in twips.
    */
  var marginTop: Double
  /**
    * Specifies whether a table cell's margins are inherited from the table level settings.
    */
  var marginsSameAsTable: Boolean
  /**
    * Sspecifies whether text is wrapped in a table cell.
    */
  var noWrap: Boolean
  /**
    * Gets or sets a table cell's preferred width.
    */
  var preferredWidth: TableWidthUnit
  /**
    * Gets or sets the vertical alignment of a table cell's content.
    */
  var verticalAlignment: TableCellVerticalAlignment
}

object TableCellFormattingSettings {
  @scala.inline
  def apply(
    marginBottom: Double,
    marginLeft: Double,
    marginRight: Double,
    marginTop: Double,
    marginsSameAsTable: Boolean,
    noWrap: Boolean,
    preferredWidth: TableWidthUnit,
    verticalAlignment: TableCellVerticalAlignment
  ): TableCellFormattingSettings = {
    val __obj = js.Dynamic.literal(marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], marginsSameAsTable = marginsSameAsTable.asInstanceOf[js.Any], noWrap = noWrap.asInstanceOf[js.Any], preferredWidth = preferredWidth.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellFormattingSettings]
  }
}

