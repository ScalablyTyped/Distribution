package typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impersonation extends js.Object {
  var impersonatedUser: js.UndefOr[User] = js.undefined
}

object Impersonation {
  @scala.inline
  def apply(impersonatedUser: User = null): Impersonation = {
    val __obj = js.Dynamic.literal()
    if (impersonatedUser != null) __obj.updateDynamic("impersonatedUser")(impersonatedUser)
    __obj.asInstanceOf[Impersonation]
  }
}

