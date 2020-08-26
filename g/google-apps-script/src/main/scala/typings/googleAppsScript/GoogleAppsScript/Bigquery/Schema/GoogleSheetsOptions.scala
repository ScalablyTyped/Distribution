package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleSheetsOptions extends js.Object {
  var range: js.UndefOr[String] = js.native
  var skipLeadingRows: js.UndefOr[String] = js.native
}

object GoogleSheetsOptions {
  @scala.inline
  def apply(): GoogleSheetsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSheetsOptions]
  }
  @scala.inline
  implicit class GoogleSheetsOptionsOps[Self <: GoogleSheetsOptions] (val x: Self) extends AnyVal {
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
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setSkipLeadingRows(value: String): Self = this.set("skipLeadingRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipLeadingRows: Self = this.set("skipLeadingRows", js.undefined)
  }
  
}

