package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs

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
    if (estimatedBytes != null) __obj.updateDynamic("estimatedBytes")(estimatedBytes)
    if (estimatedRows != null) __obj.updateDynamic("estimatedRows")(estimatedRows)
    if (oldestEntryTime != null) __obj.updateDynamic("oldestEntryTime")(oldestEntryTime)
    __obj.asInstanceOf[Streamingbuffer]
  }
}

