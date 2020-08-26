package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoChartSelection extends js.Object {
  var row: Double = js.native
}

object GeoChartSelection {
  @scala.inline
  def apply(row: Double): GeoChartSelection = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoChartSelection]
  }
  @scala.inline
  implicit class GeoChartSelectionOps[Self <: GeoChartSelection] (val x: Self) extends AnyVal {
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
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
  }
  
}

