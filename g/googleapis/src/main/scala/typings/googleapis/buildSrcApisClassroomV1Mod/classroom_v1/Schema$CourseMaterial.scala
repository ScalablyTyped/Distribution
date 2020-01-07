package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A material attached to a course as part of a material set.
  */
@js.native
trait Schema$CourseMaterial extends js.Object {
  /**
    * Google Drive file attachment.
    */
  var driveFile: js.UndefOr[Schema$DriveFile] = js.native
  /**
    * Google Forms attachment.
    */
  var form: js.UndefOr[Schema$Form] = js.native
  /**
    * Link atatchment.
    */
  var link: js.UndefOr[Schema$Link] = js.native
  /**
    * Youtube video attachment.
    */
  var youTubeVideo: js.UndefOr[Schema$YouTubeVideo] = js.native
}

object Schema$CourseMaterial {
  @scala.inline
  def apply(
    driveFile: Schema$DriveFile = null,
    form: Schema$Form = null,
    link: Schema$Link = null,
    youTubeVideo: Schema$YouTubeVideo = null
  ): Schema$CourseMaterial = {
    val __obj = js.Dynamic.literal()
    if (driveFile != null) __obj.updateDynamic("driveFile")(driveFile.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (youTubeVideo != null) __obj.updateDynamic("youTubeVideo")(youTubeVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CourseMaterial]
  }
}

