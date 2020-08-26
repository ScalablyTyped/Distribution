package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsChart extends js.Object {
  var chartId: js.UndefOr[Double] = js.native
  var contentUrl: js.UndefOr[String] = js.native
  var sheetsChartProperties: js.UndefOr[SheetsChartProperties] = js.native
  var spreadsheetId: js.UndefOr[String] = js.native
}

object SheetsChart {
  @scala.inline
  def apply(): SheetsChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsChart]
  }
  @scala.inline
  implicit class SheetsChartOps[Self <: SheetsChart] (val x: Self) extends AnyVal {
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
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    @scala.inline
    def setSheetsChartProperties(value: SheetsChartProperties): Self = this.set("sheetsChartProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetsChartProperties: Self = this.set("sheetsChartProperties", js.undefined)
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
  }
  
}

