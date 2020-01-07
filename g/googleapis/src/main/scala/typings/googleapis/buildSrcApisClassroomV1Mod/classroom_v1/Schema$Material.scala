package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Material attached to course work.  When creating attachments, setting the
  * `form` field is not supported.
  */
@js.native
trait Schema$Material extends js.Object {
  /**
    * Google Drive file material.
    */
  var driveFile: js.UndefOr[Schema$SharedDriveFile] = js.native
  /**
    * Google Forms material.
    */
  var form: js.UndefOr[Schema$Form] = js.native
  /**
    * Link material. On creation, will be upgraded to a more appropriate type
    * if possible, and this will be reflected in the response.
    */
  var link: js.UndefOr[Schema$Link] = js.native
  /**
    * YouTube video material.
    */
  var youtubeVideo: js.UndefOr[Schema$YouTubeVideo] = js.native
}

object Schema$Material {
  @scala.inline
  def apply(
    driveFile: Schema$SharedDriveFile = null,
    form: Schema$Form = null,
    link: Schema$Link = null,
    youtubeVideo: Schema$YouTubeVideo = null
  ): Schema$Material = {
    val __obj = js.Dynamic.literal()
    if (driveFile != null) __obj.updateDynamic("driveFile")(driveFile.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (youtubeVideo != null) __obj.updateDynamic("youtubeVideo")(youtubeVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Material]
  }
}

