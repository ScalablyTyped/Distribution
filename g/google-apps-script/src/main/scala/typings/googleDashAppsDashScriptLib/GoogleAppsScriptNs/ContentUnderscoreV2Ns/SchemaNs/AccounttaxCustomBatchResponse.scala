package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxCustomBatchResponse extends js.Object {
  var entries: js.UndefOr[js.Array[AccounttaxCustomBatchResponseEntry]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object AccounttaxCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[AccounttaxCustomBatchResponseEntry] = null, kind: java.lang.String = null): AccounttaxCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccounttaxCustomBatchResponse]
  }
}

