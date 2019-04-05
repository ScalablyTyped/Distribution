package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsCustomBatchResponse extends js.Object {
  var entries: js.UndefOr[js.Array[ShippingsettingsCustomBatchResponseEntry]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ShippingsettingsCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[ShippingsettingsCustomBatchResponseEntry] = null, kind: java.lang.String = null): ShippingsettingsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ShippingsettingsCustomBatchResponse]
  }
}

