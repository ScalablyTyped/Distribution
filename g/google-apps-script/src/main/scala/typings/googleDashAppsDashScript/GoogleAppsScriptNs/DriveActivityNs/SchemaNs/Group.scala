package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Group {
  @scala.inline
  def apply(email: String = null, title: String = null): Group = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Group]
  }
}

