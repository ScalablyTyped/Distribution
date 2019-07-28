package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to define a table border.
  */
trait TableBorderSettings extends js.Object {
  /**
    * Gets or sets the border color.
    * Value: A string value specifying the border color.
    */
  var color: String
  /**
    * Gets or sets the border line style.
    * Value: A <see cref="BorderLineStyle" /> object defining the border line style.
    */
  var style: js.Any
  /**
    * Gets or sets the border line width in twips.
    * Value: An integer value defining the border line width.
    */
  var width: Double
}

object TableBorderSettings {
  @scala.inline
  def apply(color: String, style: js.Any, width: Double): TableBorderSettings = {
    val __obj = js.Dynamic.literal(color = color, style = style, width = width)
  
    __obj.asInstanceOf[TableBorderSettings]
  }
}

