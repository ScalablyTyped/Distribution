package typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ScriptNs.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddonOnInstall extends js.Object {
  var authMode: AuthMode
}

object AddonOnInstall {
  @scala.inline
  def apply(authMode: AuthMode): AddonOnInstall = {
    val __obj = js.Dynamic.literal(authMode = authMode)
  
    __obj.asInstanceOf[AddonOnInstall]
  }
}

