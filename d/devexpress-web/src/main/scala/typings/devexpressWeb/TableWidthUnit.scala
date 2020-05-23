package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings defining the table width's measurement units and value.
  */
trait TableWidthUnit extends js.Object {
  /**
    * Gets or sets the unit type for the table width.
    */
  var `type`: TableWidthUnitType
  /**
    * Gets or sets the table width value in twips.
    */
  var value: Double
}

object TableWidthUnit {
  @scala.inline
  def apply(`type`: TableWidthUnitType, value: Double): TableWidthUnit = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableWidthUnit]
  }
}

