package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attachment added to student assignment work.  When creating attachments,
  * setting the `form` field is not supported.
  */
@js.native
trait Schema$Attachment extends js.Object {
  /**
    * Google Drive file attachment.
    */
  var driveFile: js.UndefOr[Schema$DriveFile] = js.native
  /**
    * Google Forms attachment.
    */
  var form: js.UndefOr[Schema$Form] = js.native
  /**
    * Link attachment.
    */
  var link: js.UndefOr[Schema$Link] = js.native
  /**
    * Youtube video attachment.
    */
  var youTubeVideo: js.UndefOr[Schema$YouTubeVideo] = js.native
}

object Schema$Attachment {
  @scala.inline
  def apply(
    driveFile: Schema$DriveFile = null,
    form: Schema$Form = null,
    link: Schema$Link = null,
    youTubeVideo: Schema$YouTubeVideo = null
  ): Schema$Attachment = {
    val __obj = js.Dynamic.literal()
    if (driveFile != null) __obj.updateDynamic("driveFile")(driveFile.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (youTubeVideo != null) __obj.updateDynamic("youTubeVideo")(youTubeVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Attachment]
  }
}

