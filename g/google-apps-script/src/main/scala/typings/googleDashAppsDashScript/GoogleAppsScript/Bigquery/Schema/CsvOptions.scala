package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvOptions extends js.Object {
  var allowJaggedRows: js.UndefOr[Boolean] = js.undefined
  var allowQuotedNewlines: js.UndefOr[Boolean] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var fieldDelimiter: js.UndefOr[String] = js.undefined
  var quote: js.UndefOr[String] = js.undefined
  var skipLeadingRows: js.UndefOr[String] = js.undefined
}

object CsvOptions {
  @scala.inline
  def apply(
    allowJaggedRows: js.UndefOr[Boolean] = js.undefined,
    allowQuotedNewlines: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    fieldDelimiter: String = null,
    quote: String = null,
    skipLeadingRows: String = null
  ): CsvOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowJaggedRows)) __obj.updateDynamic("allowJaggedRows")(allowJaggedRows.asInstanceOf[js.Any])
    if (!js.isUndefined(allowQuotedNewlines)) __obj.updateDynamic("allowQuotedNewlines")(allowQuotedNewlines.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fieldDelimiter != null) __obj.updateDynamic("fieldDelimiter")(fieldDelimiter.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (skipLeadingRows != null) __obj.updateDynamic("skipLeadingRows")(skipLeadingRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsvOptions]
  }
}

