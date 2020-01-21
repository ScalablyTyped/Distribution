package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Material attached to course work.  When creating attachments, setting the
  * `form` field is not supported.
  */
@js.native
trait SchemaMaterial extends js.Object {
  /**
    * Google Drive file material.
    */
  var driveFile: js.UndefOr[SchemaSharedDriveFile] = js.native
  /**
    * Google Forms material.
    */
  var form: js.UndefOr[SchemaForm] = js.native
  /**
    * Link material. On creation, will be upgraded to a more appropriate type
    * if possible, and this will be reflected in the response.
    */
  var link: js.UndefOr[SchemaLink] = js.native
  /**
    * YouTube video material.
    */
  var youtubeVideo: js.UndefOr[SchemaYouTubeVideo] = js.native
}

object SchemaMaterial {
  @scala.inline
  def apply(
    driveFile: SchemaSharedDriveFile = null,
    form: SchemaForm = null,
    link: SchemaLink = null,
    youtubeVideo: SchemaYouTubeVideo = null
  ): SchemaMaterial = {
    val __obj = js.Dynamic.literal()
    if (driveFile != null) __obj.updateDynamic("driveFile")(driveFile.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (youtubeVideo != null) __obj.updateDynamic("youtubeVideo")(youtubeVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMaterial]
  }
}

