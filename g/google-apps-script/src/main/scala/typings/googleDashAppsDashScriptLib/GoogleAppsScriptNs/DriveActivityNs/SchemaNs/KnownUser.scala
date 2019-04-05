package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnownUser extends js.Object {
  var isCurrentUser: js.UndefOr[scala.Boolean] = js.undefined
  var personName: js.UndefOr[java.lang.String] = js.undefined
}

object KnownUser {
  @scala.inline
  def apply(isCurrentUser: js.UndefOr[scala.Boolean] = js.undefined, personName: java.lang.String = null): KnownUser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCurrentUser)) __obj.updateDynamic("isCurrentUser")(isCurrentUser)
    if (personName != null) __obj.updateDynamic("personName")(personName)
    __obj.asInstanceOf[KnownUser]
  }
}

