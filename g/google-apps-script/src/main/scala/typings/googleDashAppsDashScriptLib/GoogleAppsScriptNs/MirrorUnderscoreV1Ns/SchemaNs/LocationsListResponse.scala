package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsListResponse extends js.Object {
  var items: js.UndefOr[js.Array[Location]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object LocationsListResponse {
  @scala.inline
  def apply(items: js.Array[Location] = null, kind: java.lang.String = null): LocationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[LocationsListResponse]
  }
}

