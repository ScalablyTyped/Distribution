package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedFormat extends js.Object {
  /**
    * Delimiter for the separation of values in a delimiter-separated values feed. If not specified, the delimiter will be auto-detected. Ignored for non-DSV
    * data feeds.
    */
  var columnDelimiter: js.UndefOr[String] = js.native
  /** Character encoding scheme of the data feed. If not specified, the encoding will be auto-detected. */
  var fileEncoding: js.UndefOr[String] = js.native
  /** Specifies how double quotes are interpreted. If not specified, the mode will be auto-detected. Ignored for non-DSV data feeds. */
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

