package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaterfallChartDomain extends js.Object {
  /** The data of the WaterfallChartDomain. */
  var data: js.UndefOr[ChartData] = js.native
  /** True to reverse the order of the domain values (horizontal axis). */
  var reversed: js.UndefOr[Boolean] = js.native
}

object WaterfallChartDomain {
  @scala.inline
  def apply(): WaterfallChartDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartDomain]
  }
  @scala.inline
  implicit class WaterfallChartDomainOps[Self <: WaterfallChartDomain] (val x: Self) extends AnyVal {
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
    def setData(value: ChartData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
  }
  
}

