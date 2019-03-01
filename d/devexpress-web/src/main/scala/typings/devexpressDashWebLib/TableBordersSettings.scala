package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to define table borders.
  */
trait TableBordersSettings extends js.Object {
  /**
    * Gets or sets the background color of table borders.
    * Value: A string value specifying the background color.
    */
  var backgroundColor: java.lang.String
  /**
    * Gets or sets the bottom border's settings.
    * Value: A TableBorderSettings object containing the table border settings.
    */
  var bottom: TableBorderSettings
  /**
    * Gets or sets the inside horizontal border's settings.
    * Value: A TableBorderSettings object containing the table border settings.
    */
  var insideHorizontal: TableBorderSettings
  /**
    * Gets or sets the inside vertical border's settings.
    * Value: A TableBorderSettings object containing the table border settings.
    */
  var insideVertical: TableBorderSettings
  /**
    * Gets or sets the left border's settings.
    * Value: A TableBorderSettings object containing the table border settings.
    */
  var left: TableBorderSettings
  /**
    * Gets or sets the right border's settings.
    * Value: A TableBorderSettings object containing the table border settings.
    */
  var right: TableBorderSettings
  /**
    * Gets or sets the top border's settings.
    * Value: A TableBorderSettings object containing the table border settings.
    */
  var top: TableBorderSettings
}

object TableBordersSettings {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String,
    bottom: TableBorderSettings,
    insideHorizontal: TableBorderSettings,
    insideVertical: TableBorderSettings,
    left: TableBorderSettings,
    right: TableBorderSettings,
    top: TableBorderSettings
  ): TableBordersSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("insideHorizontal")(insideHorizontal)
    __obj.updateDynamic("insideVertical")(insideVertical)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[TableBordersSettings]
  }
}

