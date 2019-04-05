package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Material extends js.Object {
  var driveFile: js.UndefOr[SharedDriveFile] = js.undefined
  var form: js.UndefOr[Form] = js.undefined
  var link: js.UndefOr[Link] = js.undefined
  var youtubeVideo: js.UndefOr[YouTubeVideo] = js.undefined
}

object Material {
  @scala.inline
  def apply(
    driveFile: SharedDriveFile = null,
    form: Form = null,
    link: Link = null,
    youtubeVideo: YouTubeVideo = null
  ): Material = {
    val __obj = js.Dynamic.literal()
    if (driveFile != null) __obj.updateDynamic("driveFile")(driveFile)
    if (form != null) __obj.updateDynamic("form")(form)
    if (link != null) __obj.updateDynamic("link")(link)
    if (youtubeVideo != null) __obj.updateDynamic("youtubeVideo")(youtubeVideo)
    __obj.asInstanceOf[Material]
  }
}

