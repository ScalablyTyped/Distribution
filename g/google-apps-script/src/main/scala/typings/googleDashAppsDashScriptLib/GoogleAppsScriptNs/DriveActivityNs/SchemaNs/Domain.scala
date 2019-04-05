package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  var legacyId: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Domain {
  @scala.inline
  def apply(legacyId: java.lang.String = null, name: java.lang.String = null): Domain = {
    val __obj = js.Dynamic.literal()
    if (legacyId != null) __obj.updateDynamic("legacyId")(legacyId)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Domain]
  }
}

