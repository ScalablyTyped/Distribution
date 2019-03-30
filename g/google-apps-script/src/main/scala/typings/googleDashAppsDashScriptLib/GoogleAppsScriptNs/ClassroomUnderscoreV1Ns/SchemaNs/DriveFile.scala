package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveFile extends js.Object {
  var alternateLink: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var thumbnailUrl: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object DriveFile {
  @scala.inline
  def apply(
    alternateLink: java.lang.String = null,
    id: java.lang.String = null,
    thumbnailUrl: java.lang.String = null,
    title: java.lang.String = null
  ): DriveFile = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink)
    if (id != null) __obj.updateDynamic("id")(id)
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DriveFile]
  }
}

