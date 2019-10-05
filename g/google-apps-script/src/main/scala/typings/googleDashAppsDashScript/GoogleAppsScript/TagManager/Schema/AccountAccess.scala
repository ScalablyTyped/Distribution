package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountAccess extends js.Object {
  var permission: js.UndefOr[String] = js.undefined
}

object AccountAccess {
  @scala.inline
  def apply(permission: String = null): AccountAccess = {
    val __obj = js.Dynamic.literal()
    if (permission != null) __obj.updateDynamic("permission")(permission)
    __obj.asInstanceOf[AccountAccess]
  }
}

