package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsCustomBatchResponse extends js.Object {
  var entries: js.UndefOr[js.Array[ProductsCustomBatchResponseEntry]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ProductsCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[ProductsCustomBatchResponseEntry] = null, kind: java.lang.String = null): ProductsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ProductsCustomBatchResponse]
  }
}

