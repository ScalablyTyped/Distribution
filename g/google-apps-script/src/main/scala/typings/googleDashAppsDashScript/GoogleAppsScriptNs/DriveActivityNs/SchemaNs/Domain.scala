package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  var legacyId: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Domain {
  @scala.inline
  def apply(legacyId: String = null, name: String = null): Domain = {
    val __obj = js.Dynamic.literal()
    if (legacyId != null) __obj.updateDynamic("legacyId")(legacyId)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Domain]
  }
}

