package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings to define the table cell formatting.
  */
trait TableCellFormattingSettings extends js.Object {
  /**
    * Gets or sets a table cell's bottom margin in twips.
    * Value: An integer value specifying the bottom margin.
    */
  var marginBottom: Double
  /**
    * Gets or sets a table cell's left margin in twips.
    * Value: An integer value specifying the left margin.
    */
  var marginLeft: Double
  /**
    * Gets or sets a table cell's right margin in twips.
    * Value: An integer value specifying the right margin.
    */
  var marginRight: Double
  /**
    * Gets or sets a table cell's top margin in twips.
    * Value: An integer value specifying the top margin.
    */
  var marginTop: Double
  /**
    * Gets or sets a value specifying whether a table cell's margins are inherited from the table level settings.
    * Value: true to inherit table level margins; false to use a table cell's own margin settings.
    */
  var marginsSameAsTable: Boolean
  /**
    * Gets or sets a value specifying whether text is wrapped in a table cell.
    * Value: true if text is wrapped; false if text is not wrapped.
    */
  var noWrap: Boolean
  /**
    * Gets or sets a table cell's preferred width.
    * Value: A <see cref="TableWidthUnit" /> object specifying the preferred cell width.
    */
  var preferredWidth: TableWidthUnit
  /**
    * Gets or sets the vertical alignment of a table cell's content.
    * Value: One the <see cref="TableCellVerticalAlignment" /> values.
    */
  var verticalAlignment: js.Any
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
    verticalAlignment: js.Any
  ): TableCellFormattingSettings = {
    val __obj = js.Dynamic.literal(marginBottom = marginBottom, marginLeft = marginLeft, marginRight = marginRight, marginTop = marginTop, marginsSameAsTable = marginsSameAsTable, noWrap = noWrap, preferredWidth = preferredWidth, verticalAlignment = verticalAlignment)
  
    __obj.asInstanceOf[TableCellFormattingSettings]
  }
}

