package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsCustomBatchResponse extends js.Object {
  var entries: js.UndefOr[js.Array[ShippingsettingsCustomBatchResponseEntry]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object ShippingsettingsCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[ShippingsettingsCustomBatchResponseEntry] = null, kind: String = null): ShippingsettingsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ShippingsettingsCustomBatchResponse]
  }
}

