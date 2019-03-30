package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyList extends js.Object {
  var items: js.UndefOr[js.Array[Policy]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object PolicyList {
  @scala.inline
  def apply(items: js.Array[Policy] = null, kind: java.lang.String = null): PolicyList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[PolicyList]
  }
}

