package typings.gcsResumableUpload.mod

import typings.gcsResumableUpload.gcsResumableUploadStrings.full
import typings.gcsResumableUpload.gcsResumableUploadStrings.noAcl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryParameters extends js.Object {
  var contentEncoding: js.UndefOr[String] = js.native
  var ifGenerationMatch: js.UndefOr[Double] = js.native
  var ifGenerationNotMatch: js.UndefOr[Double] = js.native
  var ifMetagenerationMatch: js.UndefOr[Double] = js.native
  var ifMetagenerationNotMatch: js.UndefOr[Double] = js.native
  var kmsKeyName: js.UndefOr[String] = js.native
  var predefinedAcl: js.UndefOr[PredefinedAcl] = js.native
  var projection: js.UndefOr[full | noAcl] = js.native
  var userProject: js.UndefOr[String] = js.native
}

object QueryParameters {
  @scala.inline
  def apply(): QueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameters]
  }
  @scala.inline
  implicit class QueryParametersOps[Self <: QueryParameters] (val x: Self) extends AnyVal {
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
    def setContentEncoding(value: String): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
    @scala.inline
    def setIfGenerationMatch(value: Double): Self = this.set("ifGenerationMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfGenerationMatch: Self = this.set("ifGenerationMatch", js.undefined)
    @scala.inline
    def setIfGenerationNotMatch(value: Double): Self = this.set("ifGenerationNotMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfGenerationNotMatch: Self = this.set("ifGenerationNotMatch", js.undefined)
    @scala.inline
    def setIfMetagenerationMatch(value: Double): Self = this.set("ifMetagenerationMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfMetagenerationMatch: Self = this.set("ifMetagenerationMatch", js.undefined)
    @scala.inline
    def setIfMetagenerationNotMatch(value: Double): Self = this.set("ifMetagenerationNotMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfMetagenerationNotMatch: Self = this.set("ifMetagenerationNotMatch", js.undefined)
    @scala.inline
    def setKmsKeyName(value: String): Self = this.set("kmsKeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyName: Self = this.set("kmsKeyName", js.undefined)
    @scala.inline
    def setPredefinedAcl(value: PredefinedAcl): Self = this.set("predefinedAcl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredefinedAcl: Self = this.set("predefinedAcl", js.undefined)
    @scala.inline
    def setProjection(value: full | noAcl): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
  }
  
}

