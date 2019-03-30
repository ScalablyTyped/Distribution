package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Streamingbuffer extends js.Object {
  var estimatedBytes: js.UndefOr[java.lang.String] = js.undefined
  var estimatedRows: js.UndefOr[java.lang.String] = js.undefined
  var oldestEntryTime: js.UndefOr[java.lang.String] = js.undefined
}

object Streamingbuffer {
  @scala.inline
  def apply(
    estimatedBytes: java.lang.String = null,
    estimatedRows: java.lang.String = null,
    oldestEntryTime: java.lang.String = null
  ): Streamingbuffer = {
    val __obj = js.Dynamic.literal()
    if (estimatedBytes != null) __obj.updateDynamic("estimatedBytes")(estimatedBytes)
    if (estimatedRows != null) __obj.updateDynamic("estimatedRows")(estimatedRows)
    if (oldestEntryTime != null) __obj.updateDynamic("oldestEntryTime")(oldestEntryTime)
    __obj.asInstanceOf[Streamingbuffer]
  }
}

