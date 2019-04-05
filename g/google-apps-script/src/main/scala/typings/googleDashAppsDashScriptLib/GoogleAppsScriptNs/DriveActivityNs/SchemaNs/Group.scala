package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Group {
  @scala.inline
  def apply(email: java.lang.String = null, title: java.lang.String = null): Group = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Group]
  }
}

