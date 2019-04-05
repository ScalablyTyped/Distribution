package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamDrive extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[DriveItem] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object TeamDrive {
  @scala.inline
  def apply(name: java.lang.String = null, root: DriveItem = null, title: java.lang.String = null): TeamDrive = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (root != null) __obj.updateDynamic("root")(root)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TeamDrive]
  }
}

