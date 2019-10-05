package typings.gapiDotClientDotBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleSheetsOptions extends js.Object {
  /**
    * [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the data. The default value is 0. This property is useful if
    * you have header rows that should be skipped. When autodetect is on, behavior is the following: &#42; skipLeadingRows unspecified - Autodetect tries to
    * detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. &#42;
    * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. &#42; skipLeadingRows = N > 0 -
    * Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract
    * column names for the detected schema.
    */
  var skipLeadingRows: js.UndefOr[String] = js.undefined
}

object GoogleSheetsOptions {
  @scala.inline
  def apply(skipLeadingRows: String = null): GoogleSheetsOptions = {
    val __obj = js.Dynamic.literal()
    if (skipLeadingRows != null) __obj.updateDynamic("skipLeadingRows")(skipLeadingRows)
    __obj.asInstanceOf[GoogleSheetsOptions]
  }
}

