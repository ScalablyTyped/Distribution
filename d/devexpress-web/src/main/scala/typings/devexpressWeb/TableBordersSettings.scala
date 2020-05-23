package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to define table borders.
  */
trait TableBordersSettings extends js.Object {
  /**
    * Gets or sets the background color of table borders.
    */
  var backgroundColor: String
  /**
    * Gets or sets the bottom border's settings.
    */
  var bottom: TableBorderSettings
  /**
    * Gets or sets the inside horizontal border's settings.
    */
  var insideHorizontal: TableBorderSettings
  /**
    * Gets or sets the inside vertical border's settings.
    */
  var insideVertical: TableBorderSettings
  /**
    * Gets or sets the left border's settings.
    */
  var left: TableBorderSettings
  /**
    * Gets or sets the right border's settings.
    */
  var right: TableBorderSettings
  /**
    * Gets or sets the top border's settings.
    */
  var top: TableBorderSettings
}

object TableBordersSettings {
  @scala.inline
  def apply(
    backgroundColor: String,
    bottom: TableBorderSettings,
    insideHorizontal: TableBorderSettings,
    insideVertical: TableBorderSettings,
    left: TableBorderSettings,
    right: TableBorderSettings,
    top: TableBorderSettings
  ): TableBordersSettings = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], insideHorizontal = insideHorizontal.asInstanceOf[js.Any], insideVertical = insideVertical.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBordersSettings]
  }
}

