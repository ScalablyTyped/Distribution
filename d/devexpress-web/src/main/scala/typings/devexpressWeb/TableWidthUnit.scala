package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings defining the table width's measurement units and value.
  */
@js.native
trait TableWidthUnit extends js.Object {
  /**
    * Gets or sets the unit type for the table width.
    */
  var `type`: TableWidthUnitType = js.native
  /**
    * Gets or sets the table width value in twips.
    */
  var value: Double = js.native
}

object TableWidthUnit {
  @scala.inline
  def apply(`type`: TableWidthUnitType, value: Double): TableWidthUnit = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableWidthUnit]
  }
  @scala.inline
  implicit class TableWidthUnitOps[Self <: TableWidthUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: TableWidthUnitType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

