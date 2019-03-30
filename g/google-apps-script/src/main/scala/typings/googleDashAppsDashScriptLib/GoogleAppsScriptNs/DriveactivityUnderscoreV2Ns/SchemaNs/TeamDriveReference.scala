package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamDriveReference extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object TeamDriveReference {
  @scala.inline
  def apply(name: java.lang.String = null, title: java.lang.String = null): TeamDriveReference = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TeamDriveReference]
  }
}

