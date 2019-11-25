package typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema

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
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamDrive]
  }
}

