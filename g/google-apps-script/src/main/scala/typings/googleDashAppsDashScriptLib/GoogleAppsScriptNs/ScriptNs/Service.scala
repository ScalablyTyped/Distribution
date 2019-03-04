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
    val __obj = js.Dynamic.literal(disable = disable, getUrl = getUrl, isEnabled = isEnabled)
  
    __obj.asInstanceOf[Service]
  }
}

