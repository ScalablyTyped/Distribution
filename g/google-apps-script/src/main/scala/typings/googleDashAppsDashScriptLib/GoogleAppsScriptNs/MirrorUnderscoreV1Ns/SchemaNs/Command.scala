package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Command {
  @scala.inline
  def apply(`type`: java.lang.String = null): Command = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Command]
  }
}

