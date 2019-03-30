package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupsmigrationUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groups extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var responseCode: js.UndefOr[java.lang.String] = js.undefined
}

object Groups {
  @scala.inline
  def apply(kind: java.lang.String = null, responseCode: java.lang.String = null): Groups = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode)
    __obj.asInstanceOf[Groups]
  }
}

