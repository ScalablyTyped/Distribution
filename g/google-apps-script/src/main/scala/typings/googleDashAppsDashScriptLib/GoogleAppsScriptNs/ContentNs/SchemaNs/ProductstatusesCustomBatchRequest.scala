package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductstatusesCustomBatchRequest extends js.Object {
  var entries: js.UndefOr[js.Array[ProductstatusesCustomBatchRequestEntry]] = js.undefined
}

object ProductstatusesCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[ProductstatusesCustomBatchRequestEntry] = null): ProductstatusesCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    __obj.asInstanceOf[ProductstatusesCustomBatchRequest]
  }
}

