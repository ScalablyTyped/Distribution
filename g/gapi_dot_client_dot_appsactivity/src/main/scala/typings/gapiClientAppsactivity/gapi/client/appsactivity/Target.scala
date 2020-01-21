package typings.gapiClientAppsactivity.gapi.client.appsactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  /** The ID of the target. For example, in Google Drive, this is the file or folder ID. */
  var id: js.UndefOr[String] = js.undefined
  /** The MIME type of the target. */
  var mimeType: js.UndefOr[String] = js.undefined
  /** The name of the target. For example, in Google Drive, this is the title of the file. */
  var name: js.UndefOr[String] = js.undefined
}

object Target {
  @scala.inline
  def apply(id: String = null, mimeType: String = null, name: String = null): Target = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

