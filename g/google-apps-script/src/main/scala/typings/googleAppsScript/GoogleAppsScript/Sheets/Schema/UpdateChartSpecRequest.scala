package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateChartSpecRequest extends js.Object {
  var chartId: js.UndefOr[Double] = js.native
  var spec: js.UndefOr[ChartSpec] = js.native
}

object UpdateChartSpecRequest {
  @scala.inline
  def apply(): UpdateChartSpecRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChartSpecRequest]
  }
  @scala.inline
  implicit class UpdateChartSpecRequestOps[Self <: UpdateChartSpecRequest] (val x: Self) extends AnyVal {
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
    def setChartId(value: Double): Self = this.set("chartId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartId: Self = this.set("chartId", js.undefined)
    @scala.inline
    def setSpec(value: ChartSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
  }
  
}

