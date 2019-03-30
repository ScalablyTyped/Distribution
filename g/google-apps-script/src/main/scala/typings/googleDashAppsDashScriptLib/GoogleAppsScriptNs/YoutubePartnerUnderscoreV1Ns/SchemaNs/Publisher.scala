package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Publisher extends js.Object {
  var caeNumber: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var ipiNumber: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Publisher {
  @scala.inline
  def apply(
    caeNumber: java.lang.String = null,
    id: java.lang.String = null,
    ipiNumber: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null
  ): Publisher = {
    val __obj = js.Dynamic.literal()
    if (caeNumber != null) __obj.updateDynamic("caeNumber")(caeNumber)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ipiNumber != null) __obj.updateDynamic("ipiNumber")(ipiNumber)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Publisher]
  }
}

