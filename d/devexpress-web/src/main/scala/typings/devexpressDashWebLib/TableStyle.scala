package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the table style settings.
  */
trait TableStyle extends StyleBase {
  /**
    * Gets or sets the style from which the current style inherits.
    * Value: A <see cref="TableStyle" /> object that is the parent style.
    */
  var parent: TableStyle
}

object TableStyle {
  @scala.inline
  def apply(isDeleted: scala.Boolean, name: java.lang.String, parent: TableStyle): TableStyle = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted, name = name, parent = parent)
  
    __obj.asInstanceOf[TableStyle]
  }
}

