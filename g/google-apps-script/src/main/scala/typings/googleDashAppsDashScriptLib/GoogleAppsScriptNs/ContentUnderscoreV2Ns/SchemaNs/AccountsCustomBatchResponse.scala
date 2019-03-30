package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsCustomBatchResponse extends js.Object {
  var entries: js.UndefOr[js.Array[AccountsCustomBatchResponseEntry]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object AccountsCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[AccountsCustomBatchResponseEntry] = null, kind: java.lang.String = null): AccountsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccountsCustomBatchResponse]
  }
}

