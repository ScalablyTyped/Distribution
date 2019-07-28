package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings defining the table height's measurement units and value.
  */
trait TableHeightUnit extends js.Object {
  /**
    * Gets or sets the unit type for the table height.
    * Value: One of the <see cref="TableHeightUnitType" /> enumeration values.
    */
  var `type`: js.Any
  /**
    * Gets or sets the table height value in twips.
    * Value: An integer value specifying the table height.
    */
  var value: Double
}

object TableHeightUnit {
  @scala.inline
  def apply(`type`: js.Any, value: Double): TableHeightUnit = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableHeightUnit]
  }
}

