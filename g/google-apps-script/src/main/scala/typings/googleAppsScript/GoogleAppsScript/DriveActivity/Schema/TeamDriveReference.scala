package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamDriveReference extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object TeamDriveReference {
  @scala.inline
  def apply(name: String = null, title: String = null): TeamDriveReference = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamDriveReference]
  }
}

