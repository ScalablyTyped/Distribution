package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedFormat extends js.Object {
  var columnDelimiter: js.UndefOr[String] = js.native
  var fileEncoding: js.UndefOr[String] = js.native
  var quotingMode: js.UndefOr[String] = js.native
}

object DatafeedFormat {
  @scala.inline
  def apply(): DatafeedFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedFormat]
  }
  @scala.inline
  implicit class DatafeedFormatOps[Self <: DatafeedFormat] (val x: Self) extends AnyVal {
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
    def setColumnDelimiter(value: String): Self = this.set("columnDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnDelimiter: Self = this.set("columnDelimiter", js.undefined)
    @scala.inline
    def setFileEncoding(value: String): Self = this.set("fileEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileEncoding: Self = this.set("fileEncoding", js.undefined)
    @scala.inline
    def setQuotingMode(value: String): Self = this.set("quotingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotingMode: Self = this.set("quotingMode", js.undefined)
  }
  
}

