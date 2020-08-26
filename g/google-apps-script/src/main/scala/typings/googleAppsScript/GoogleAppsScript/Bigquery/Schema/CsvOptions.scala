package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CsvOptions extends js.Object {
  var allowJaggedRows: js.UndefOr[Boolean] = js.native
  var allowQuotedNewlines: js.UndefOr[Boolean] = js.native
  var encoding: js.UndefOr[String] = js.native
  var fieldDelimiter: js.UndefOr[String] = js.native
  var quote: js.UndefOr[String] = js.native
  var skipLeadingRows: js.UndefOr[String] = js.native
}

object CsvOptions {
  @scala.inline
  def apply(): CsvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvOptions]
  }
  @scala.inline
  implicit class CsvOptionsOps[Self <: CsvOptions] (val x: Self) extends AnyVal {
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
    def setAllowJaggedRows(value: Boolean): Self = this.set("allowJaggedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowJaggedRows: Self = this.set("allowJaggedRows", js.undefined)
    @scala.inline
    def setAllowQuotedNewlines(value: Boolean): Self = this.set("allowQuotedNewlines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowQuotedNewlines: Self = this.set("allowQuotedNewlines", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setFieldDelimiter(value: String): Self = this.set("fieldDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldDelimiter: Self = this.set("fieldDelimiter", js.undefined)
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    @scala.inline
    def setSkipLeadingRows(value: String): Self = this.set("skipLeadingRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipLeadingRows: Self = this.set("skipLeadingRows", js.undefined)
  }
  
}

