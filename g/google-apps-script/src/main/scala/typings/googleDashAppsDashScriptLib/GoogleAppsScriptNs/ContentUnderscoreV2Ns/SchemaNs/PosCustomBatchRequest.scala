package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosCustomBatchRequest extends js.Object {
  var entries: js.UndefOr[js.Array[PosCustomBatchRequestEntry]] = js.undefined
}

object PosCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[PosCustomBatchRequestEntry] = null): PosCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    __obj.asInstanceOf[PosCustomBatchRequest]
  }
}

