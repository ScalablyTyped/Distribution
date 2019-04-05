package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileThumbnail extends js.Object {
  var image: js.UndefOr[java.lang.String] = js.undefined
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
}

object FileThumbnail {
  @scala.inline
  def apply(image: java.lang.String = null, mimeType: java.lang.String = null): FileThumbnail = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    __obj.asInstanceOf[FileThumbnail]
  }
}

