package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleSheetsOptions extends js.Object {
  var range: js.UndefOr[String] = js.undefined
  var skipLeadingRows: js.UndefOr[String] = js.undefined
}

object GoogleSheetsOptions {
  @scala.inline
  def apply(range: String = null, skipLeadingRows: String = null): GoogleSheetsOptions = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range)
    if (skipLeadingRows != null) __obj.updateDynamic("skipLeadingRows")(skipLeadingRows)
    __obj.asInstanceOf[GoogleSheetsOptions]
  }
}

