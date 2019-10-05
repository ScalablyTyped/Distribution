package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileThumbnail extends js.Object {
  var image: js.UndefOr[String] = js.undefined
  var mimeType: js.UndefOr[String] = js.undefined
}

object FileThumbnail {
  @scala.inline
  def apply(image: String = null, mimeType: String = null): FileThumbnail = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    __obj.asInstanceOf[FileThumbnail]
  }
}

