package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdSlot extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AdSlot {
  @scala.inline
  def apply(id: java.lang.String = null, `type`: java.lang.String = null): AdSlot = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AdSlot]
  }
}

