package typings.googleAppsScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contact extends js.Object {
  var acceptCommands: js.UndefOr[js.Array[Command]] = js.native
  var acceptTypes: js.UndefOr[js.Array[String]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var imageUrls: js.UndefOr[js.Array[String]] = js.native
  var kind: js.UndefOr[String] = js.native
  var phoneNumber: js.UndefOr[String] = js.native
  var priority: js.UndefOr[Double] = js.native
  var sharingFeatures: js.UndefOr[js.Array[String]] = js.native
  var source: js.UndefOr[String] = js.native
  var speakableName: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Contact {
  @scala.inline
  def apply(): Contact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contact]
  }
  @scala.inline
  implicit class ContactOps[Self <: Contact] (val x: Self) extends AnyVal {
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
    def setAcceptCommandsVarargs(value: Command*): Self = this.set("acceptCommands", js.Array(value :_*))
    @scala.inline
    def setAcceptCommands(value: js.Array[Command]): Self = this.set("acceptCommands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptCommands: Self = this.set("acceptCommands", js.undefined)
    @scala.inline
    def setAcceptTypesVarargs(value: String*): Self = this.set("acceptTypes", js.Array(value :_*))
    @scala.inline
    def setAcceptTypes(value: js.Array[String]): Self = this.set("acceptTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptTypes: Self = this.set("acceptTypes", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImageUrlsVarargs(value: String*): Self = this.set("imageUrls", js.Array(value :_*))
    @scala.inline
    def setImageUrls(value: js.Array[String]): Self = this.set("imageUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrls: Self = this.set("imageUrls", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setSharingFeaturesVarargs(value: String*): Self = this.set("sharingFeatures", js.Array(value :_*))
    @scala.inline
    def setSharingFeatures(value: js.Array[String]): Self = this.set("sharingFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharingFeatures: Self = this.set("sharingFeatures", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSpeakableName(value: String): Self = this.set("speakableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeakableName: Self = this.set("speakableName", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

