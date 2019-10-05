package typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveItemReference extends js.Object {
  var file: js.UndefOr[js.Any] = js.undefined
  var folder: js.UndefOr[Folder] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object DriveItemReference {
  @scala.inline
  def apply(file: js.Any = null, folder: Folder = null, name: String = null, title: String = null): DriveItemReference = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    if (folder != null) __obj.updateDynamic("folder")(folder)
    if (name != null) __obj.updateDynamic("name")(name)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DriveItemReference]
  }
}

