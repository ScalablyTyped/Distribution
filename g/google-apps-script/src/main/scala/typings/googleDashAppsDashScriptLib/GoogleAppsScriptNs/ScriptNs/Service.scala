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
  def apply(disable: () => scala.Unit, getUrl: () => java.lang.String, isEnabled: () => scala.Boolean): Service = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), getUrl = js.Any.fromFunction0(getUrl), isEnabled = js.Any.fromFunction0(isEnabled))
  
    __obj.asInstanceOf[Service]
  }
}

