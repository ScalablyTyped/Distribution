package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventorySetResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object InventorySetResponse {
  @scala.inline
  def apply(kind: java.lang.String = null): InventorySetResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[InventorySetResponse]
  }
}

