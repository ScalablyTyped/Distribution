package typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveItem extends js.Object {
  var file: js.UndefOr[js.Any] = js.undefined
  var folder: js.UndefOr[Folder] = js.undefined
  var mimeType: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var owner: js.UndefOr[Owner] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object DriveItem {
  @scala.inline
  def apply(
    file: js.Any = null,
    folder: Folder = null,
    mimeType: String = null,
    name: String = null,
    owner: Owner = null,
    title: String = null
  ): DriveItem = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    if (folder != null) __obj.updateDynamic("folder")(folder)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (name != null) __obj.updateDynamic("name")(name)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DriveItem]
  }
}

