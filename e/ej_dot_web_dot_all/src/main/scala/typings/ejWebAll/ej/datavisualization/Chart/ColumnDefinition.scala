package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDefinition extends js.Object {
  /** Width of the column in plotting area. Width is measured in either pixel or percentage based on the value of unit property.
    * @Default {50}
    */
  var columnWidth: js.UndefOr[Double] = js.native
  /** Color of the line that indicates the starting point of the column in plotting area.
    * @Default {transparent}
    */
  var lineColor: js.UndefOr[String] = js.native
  /** Width of the line that indicates the starting point of the column in plot area.
    * @Default {1}
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /** Specifies the unit to measure the width of the column in plotting area.
    * @Default {'pixel'. See Unit}
    */
  var unit: js.UndefOr[Unit | String] = js.native
}

object ColumnDefinition {
  @scala.inline
  def apply(): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDefinition]
  }
  @scala.inline
  implicit class ColumnDefinitionOps[Self <: ColumnDefinition] (val x: Self) extends AnyVal {
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
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setUnit(value: Unit | String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

