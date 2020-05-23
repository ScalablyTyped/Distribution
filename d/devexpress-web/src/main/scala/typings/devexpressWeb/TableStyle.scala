package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the table style settings.
  */
trait TableStyle extends StyleBase {
  /**
    * Gets or sets the style from which the current style inherits.
    */
  val parent: TableStyle
}

object TableStyle {
  @scala.inline
  def apply(isDeleted: Boolean, name: String, parent: TableStyle): TableStyle = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableStyle]
  }
}

