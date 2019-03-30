package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchResponse extends js.Object {
  var entries: js.UndefOr[js.Array[OrdersCustomBatchResponseEntry]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[OrdersCustomBatchResponseEntry] = null, kind: java.lang.String = null): OrdersCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[OrdersCustomBatchResponse]
  }
}

