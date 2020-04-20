package typings.googleAppsScript.GoogleAppsScript.Events

import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddonOnInstall extends js.Object {
  var authMode: AuthMode
}

object AddonOnInstall {
  @scala.inline
  def apply(authMode: AuthMode): AddonOnInstall = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonOnInstall]
  }
}

