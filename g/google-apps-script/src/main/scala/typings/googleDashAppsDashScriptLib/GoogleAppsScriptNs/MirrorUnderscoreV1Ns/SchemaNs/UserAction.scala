package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAction extends js.Object {
  var payload: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object UserAction {
  @scala.inline
  def apply(payload: java.lang.String = null, `type`: java.lang.String = null): UserAction = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UserAction]
  }
}

