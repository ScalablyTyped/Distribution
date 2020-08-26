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
  def apply(): SchemaMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaterial]
  }
  @scala.inline
  implicit class SchemaMaterialOps[Self <: SchemaMaterial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDriveFile(value: SchemaSharedDriveFile): Self = this.set("driveFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveFile: Self = this.set("driveFile", js.undefined)
    @scala.inline
    def setForm(value: SchemaForm): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setLink(value: SchemaLink): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setYoutubeVideo(value: SchemaYouTubeVideo): Self = this.set("youtubeVideo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYoutubeVideo: Self = this.set("youtubeVideo", js.undefined)
  }
  
}

