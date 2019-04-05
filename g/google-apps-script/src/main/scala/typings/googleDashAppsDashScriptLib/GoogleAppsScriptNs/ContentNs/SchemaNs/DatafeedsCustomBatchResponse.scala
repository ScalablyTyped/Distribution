package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedsCustomBatchResponse extends js.Object {
  var entries: js.UndefOr[js.Array[DatafeedsCustomBatchResponseEntry]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object DatafeedsCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[DatafeedsCustomBatchResponseEntry] = null, kind: java.lang.String = null): DatafeedsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[DatafeedsCustomBatchResponse]
  }
}

