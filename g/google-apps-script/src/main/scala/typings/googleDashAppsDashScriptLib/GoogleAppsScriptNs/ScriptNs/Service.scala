package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  def disable(): scala.Unit
  def getUrl(): java.lang.String
  def isEnabled(): scala.Boolean
}

object Service {
  @scala.inline
  def apply(
    disable: js.Function0[scala.Unit],
    getUrl: js.Function0[java.lang.String],
    isEnabled: js.Function0[scala.Boolean]
  ): Service = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(disable)
    __obj.updateDynamic("getUrl")(getUrl)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.asInstanceOf[Service]
  }
}

