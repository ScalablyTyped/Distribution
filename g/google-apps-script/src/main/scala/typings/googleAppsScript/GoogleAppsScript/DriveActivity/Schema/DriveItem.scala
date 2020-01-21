package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

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
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveItem]
  }
}

