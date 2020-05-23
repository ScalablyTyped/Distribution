package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to define a table border.
  */
trait TableBorderSettings extends js.Object {
  /**
    * Gets or sets the border color.
    */
  var color: String
  /**
    * Gets or sets the border line style.
    */
  var style: BorderLineStyle
  /**
    * Gets or sets the border line width in twips.
    */
  var width: Double
}

object TableBorderSettings {
  @scala.inline
  def apply(color: String, style: BorderLineStyle, width: Double): TableBorderSettings = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorderSettings]
  }
}

