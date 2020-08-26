package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieChartSeries extends dxPieChartSeriesTypesCommonPieChartSeries {
  /** @name PieChartSeries.name */
  var name: js.UndefOr[String] = js.native
  /** @name PieChartSeries.tag */
  var tag: js.UndefOr[js.Any] = js.native
}

object PieChartSeries {
  @scala.inline
  def apply(): PieChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartSeries]
  }
  @scala.inline
  implicit class PieChartSeriesOps[Self <: PieChartSeries] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTag(value: js.Any): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

