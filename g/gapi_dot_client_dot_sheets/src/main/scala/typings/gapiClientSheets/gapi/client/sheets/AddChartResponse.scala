package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddChartResponse extends js.Object {
  /** The newly added chart. */
  var chart: js.UndefOr[EmbeddedChart] = js.native
}

object AddChartResponse {
  @scala.inline
  def apply(): AddChartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddChartResponse]
  }
  @scala.inline
  implicit class AddChartResponseOps[Self <: AddChartResponse] (val x: Self) extends AnyVal {
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
    def setChart(value: EmbeddedChart): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
  }
  
}

