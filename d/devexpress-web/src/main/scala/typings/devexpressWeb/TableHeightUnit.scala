package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings defining the table height's measurement units and value.
  */
trait TableHeightUnit extends js.Object {
  /**
    * Gets or sets the unit type for the table height.
    */
  var `type`: TableHeightUnitType
  /**
    * Gets or sets the table height value in twips.
    */
  var value: Double
}

object TableHeightUnit {
  @scala.inline
  def apply(`type`: TableHeightUnitType, value: Double): TableHeightUnit = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeightUnit]
  }
}

