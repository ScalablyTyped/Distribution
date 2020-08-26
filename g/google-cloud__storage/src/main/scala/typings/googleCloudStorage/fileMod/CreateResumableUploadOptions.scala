package typings.googleCloudStorage.fileMod

import typings.googleCloudCommon.serviceObjectMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResumableUploadOptions extends js.Object {
  var configPath: js.UndefOr[String] = js.native
  var metadata: js.UndefOr[Metadata] = js.native
  var offset: js.UndefOr[Double] = js.native
  var origin: js.UndefOr[String] = js.native
  var predefinedAcl: js.UndefOr[PredefinedAcl] = js.native
  var `private`: js.UndefOr[Boolean] = js.native
  var public: js.UndefOr[Boolean] = js.native
  var uri: js.UndefOr[String] = js.native
  var userProject: js.UndefOr[String] = js.native
}

object CreateResumableUploadOptions {
  @scala.inline
  def apply(): CreateResumableUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResumableUploadOptions]
  }
  @scala.inline
  implicit class CreateResumableUploadOptionsOps[Self <: CreateResumableUploadOptions] (val x: Self) extends AnyVal {
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
    def setConfigPath(value: String): Self = this.set("configPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigPath: Self = this.set("configPath", js.undefined)
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setPredefinedAcl(value: PredefinedAcl): Self = this.set("predefinedAcl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredefinedAcl: Self = this.set("predefinedAcl", js.undefined)
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
  }
  
}

