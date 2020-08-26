package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CourseMaterial extends js.Object {
  var driveFile: js.UndefOr[DriveFile] = js.native
  var form: js.UndefOr[Form] = js.native
  var link: js.UndefOr[Link] = js.native
  var youTubeVideo: js.UndefOr[YouTubeVideo] = js.native
}

object CourseMaterial {
  @scala.inline
  def apply(): CourseMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CourseMaterial]
  }
  @scala.inline
  implicit class CourseMaterialOps[Self <: CourseMaterial] (val x: Self) extends AnyVal {
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
    def setDriveFile(value: DriveFile): Self = this.set("driveFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveFile: Self = this.set("driveFile", js.undefined)
    @scala.inline
    def setForm(value: Form): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setLink(value: Link): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setYouTubeVideo(value: YouTubeVideo): Self = this.set("youTubeVideo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYouTubeVideo: Self = this.set("youTubeVideo", js.undefined)
  }
  
}

