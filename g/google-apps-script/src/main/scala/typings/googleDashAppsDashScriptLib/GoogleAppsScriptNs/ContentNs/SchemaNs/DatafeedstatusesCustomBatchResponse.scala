package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedstatusesCustomBatchResponse extends js.Object {
  var entries: js.UndefOr[js.Array[DatafeedstatusesCustomBatchResponseEntry]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object DatafeedstatusesCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[DatafeedstatusesCustomBatchResponseEntry] = null, kind: java.lang.String = null): DatafeedstatusesCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[DatafeedstatusesCustomBatchResponse]
  }
}

