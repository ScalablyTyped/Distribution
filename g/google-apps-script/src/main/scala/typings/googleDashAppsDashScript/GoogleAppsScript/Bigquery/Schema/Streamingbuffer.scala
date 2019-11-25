package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Streamingbuffer extends js.Object {
  var estimatedBytes: js.UndefOr[String] = js.undefined
  var estimatedRows: js.UndefOr[String] = js.undefined
  var oldestEntryTime: js.UndefOr[String] = js.undefined
}

object Streamingbuffer {
  @scala.inline
  def apply(estimatedBytes: String = null, estimatedRows: String = null, oldestEntryTime: String = null): Streamingbuffer = {
    val __obj = js.Dynamic.literal()
    if (estimatedBytes != null) __obj.updateDynamic("estimatedBytes")(estimatedBytes.asInstanceOf[js.Any])
    if (estimatedRows != null) __obj.updateDynamic("estimatedRows")(estimatedRows.asInstanceOf[js.Any])
    if (oldestEntryTime != null) __obj.updateDynamic("oldestEntryTime")(oldestEntryTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Streamingbuffer]
  }
}

