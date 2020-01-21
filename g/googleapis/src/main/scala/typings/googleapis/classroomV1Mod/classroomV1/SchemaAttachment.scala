package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attachment added to student assignment work.  When creating attachments,
  * setting the `form` field is not supported.
  */
@js.native
trait SchemaAttachment extends js.Object {
  /**
    * Google Drive file attachment.
    */
  var driveFile: js.UndefOr[SchemaDriveFile] = js.native
  /**
    * Google Forms attachment.
    */
  var form: js.UndefOr[SchemaForm] = js.native
  /**
    * Link attachment.
    */
  var link: js.UndefOr[SchemaLink] = js.native
  /**
    * Youtube video attachment.
    */
  var youTubeVideo: js.UndefOr[SchemaYouTubeVideo] = js.native
}

object SchemaAttachment {
  @scala.inline
  def apply(
    driveFile: SchemaDriveFile = null,
    form: SchemaForm = null,
    link: SchemaLink = null,
    youTubeVideo: SchemaYouTubeVideo = null
  ): SchemaAttachment = {
    val __obj = js.Dynamic.literal()
    if (driveFile != null) __obj.updateDynamic("driveFile")(driveFile.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (youTubeVideo != null) __obj.updateDynamic("youTubeVideo")(youTubeVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAttachment]
  }
}

