package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSheetsChartRequest extends js.Object {
  var chartId: js.UndefOr[Double] = js.native
  var elementProperties: js.UndefOr[PageElementProperties] = js.native
  var linkingMode: js.UndefOr[String] = js.native
  var objectId: js.UndefOr[String] = js.native
  var spreadsheetId: js.UndefOr[String] = js.native
}

object CreateSheetsChartRequest {
  @scala.inline
  def apply(): CreateSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSheetsChartRequest]
  }
  @scala.inline
  implicit class CreateSheetsChartRequestOps[Self <: CreateSheetsChartRequest] (val x: Self) extends AnyVal {
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
    def setElementProperties(value: PageElementProperties): Self = this.set("elementProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementProperties: Self = this.set("elementProperties", js.undefined)
    @scala.inline
    def setLinkingMode(value: String): Self = this.set("linkingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkingMode: Self = this.set("linkingMode", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
  }
  
}

