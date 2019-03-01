package typings
package gapiDotClientDotAppsactivityLib.gapiNs.clientNs.appsactivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  /** The ID of the target. For example, in Google Drive, this is the file or folder ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The MIME type of the target. */
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the target. For example, in Google Drive, this is the title of the file. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Target {
  @scala.inline
  def apply(id: java.lang.String = null, mimeType: java.lang.String = null, name: java.lang.String = null): Target = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Target]
  }
}

