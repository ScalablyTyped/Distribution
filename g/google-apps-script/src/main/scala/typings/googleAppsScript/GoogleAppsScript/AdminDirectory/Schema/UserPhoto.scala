package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPhoto extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var mimeType: js.UndefOr[String] = js.native
  var photoData: js.UndefOr[String] = js.native
  var primaryEmail: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object UserPhoto {
  @scala.inline
  def apply(): UserPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPhoto]
  }
  @scala.inline
  implicit class UserPhotoOps[Self <: UserPhoto] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setPhotoData(value: String): Self = this.set("photoData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotoData: Self = this.set("photoData", js.undefined)
    @scala.inline
    def setPrimaryEmail(value: String): Self = this.set("primaryEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryEmail: Self = this.set("primaryEmail", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

