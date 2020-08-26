package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextToColumnsRequest extends js.Object {
  var delimiter: js.UndefOr[String] = js.native
  var delimiterType: js.UndefOr[String] = js.native
  var source: js.UndefOr[GridRange] = js.native
}

object TextToColumnsRequest {
  @scala.inline
  def apply(): TextToColumnsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextToColumnsRequest]
  }
  @scala.inline
  implicit class TextToColumnsRequestOps[Self <: TextToColumnsRequest] (val x: Self) extends AnyVal {
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setDelimiterType(value: String): Self = this.set("delimiterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiterType: Self = this.set("delimiterType", js.undefined)
    @scala.inline
    def setSource(value: GridRange): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

