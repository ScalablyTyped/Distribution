package typings
package devexpressDashWebLib

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
  var marginBottom: scala.Double
  /**
    * Gets or sets a table cell's left margin in twips.
    * Value: An integer value specifying the left margin.
    */
  var marginLeft: scala.Double
  /**
    * Gets or sets a table cell's right margin in twips.
    * Value: An integer value specifying the right margin.
    */
  var marginRight: scala.Double
  /**
    * Gets or sets a table cell's top margin in twips.
    * Value: An integer value specifying the top margin.
    */
  var marginTop: scala.Double
  /**
    * Gets or sets a value specifying whether a table cell's margins are inherited from the table level settings.
    * Value: true to inherit table level margins; false to use a table cell's own margin settings.
    */
  var marginsSameAsTable: scala.Boolean
  /**
    * Gets or sets a value specifying whether text is wrapped in a table cell.
    * Value: true if text is wrapped; false if text is not wrapped.
    */
  var noWrap: scala.Boolean
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
    marginBottom: scala.Double,
    marginLeft: scala.Double,
    marginRight: scala.Double,
    marginTop: scala.Double,
    marginsSameAsTable: scala.Boolean,
    noWrap: scala.Boolean,
    preferredWidth: TableWidthUnit,
    verticalAlignment: js.Any
  ): TableCellFormattingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("marginBottom")(marginBottom)
    __obj.updateDynamic("marginLeft")(marginLeft)
    __obj.updateDynamic("marginRight")(marginRight)
    __obj.updateDynamic("marginTop")(marginTop)
    __obj.updateDynamic("marginsSameAsTable")(marginsSameAsTable)
    __obj.updateDynamic("noWrap")(noWrap)
    __obj.updateDynamic("preferredWidth")(preferredWidth)
    __obj.updateDynamic("verticalAlignment")(verticalAlignment)
    __obj.asInstanceOf[TableCellFormattingSettings]
  }
}

