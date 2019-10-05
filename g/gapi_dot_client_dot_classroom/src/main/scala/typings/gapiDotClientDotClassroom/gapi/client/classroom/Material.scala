package typings.gapiDotClientDotClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Material extends js.Object {
  /** Google Drive file material. */
  var driveFile: js.UndefOr[SharedDriveFile] = js.undefined
  /** Google Forms material. */
  var form: js.UndefOr[Form] = js.undefined
  /**
    * Link material. On creation, will be upgraded to a more appropriate type
    * if possible, and this will be reflected in the response.
    */
  var link: js.UndefOr[Link] = js.undefined
  /** YouTube video material. */
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

