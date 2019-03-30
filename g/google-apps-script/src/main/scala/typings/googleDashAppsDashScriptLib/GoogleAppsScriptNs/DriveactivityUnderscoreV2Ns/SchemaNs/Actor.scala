package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actor extends js.Object {
  var administrator: js.UndefOr[java.lang.String] = js.undefined
  var anonymous: js.UndefOr[java.lang.String] = js.undefined
  var impersonation: js.UndefOr[Impersonation] = js.undefined
  var system: js.UndefOr[SystemEvent] = js.undefined
  var user: js.UndefOr[User] = js.undefined
}

object Actor {
  @scala.inline
  def apply(
    administrator: java.lang.String = null,
    anonymous: java.lang.String = null,
    impersonation: Impersonation = null,
    system: SystemEvent = null,
    user: User = null
  ): Actor = {
    val __obj = js.Dynamic.literal()
    if (administrator != null) __obj.updateDynamic("administrator")(administrator)
    if (anonymous != null) __obj.updateDynamic("anonymous")(anonymous)
    if (impersonation != null) __obj.updateDynamic("impersonation")(impersonation)
    if (system != null) __obj.updateDynamic("system")(system)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Actor]
  }
}

