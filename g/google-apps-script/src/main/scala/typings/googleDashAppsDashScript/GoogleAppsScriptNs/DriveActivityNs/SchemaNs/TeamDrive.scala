package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamDrive extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[DriveItem] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object TeamDrive {
  @scala.inline
  def apply(name: String = null, root: DriveItem = null, title: String = null): TeamDrive = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (root != null) __obj.updateDynamic("root")(root)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TeamDrive]
  }
}

