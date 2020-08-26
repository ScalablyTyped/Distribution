package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request of `GenerateDownloadUrl` method.
  */
@js.native
trait SchemaGenerateDownloadUrlRequest extends js.Object {
  /**
    * The optional version of function. If not set, default, current version is
    * used.
    */
  var versionId: js.UndefOr[String] = js.native
}

object SchemaGenerateDownloadUrlRequest {
  @scala.inline
  def apply(): SchemaGenerateDownloadUrlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateDownloadUrlRequest]
  }
  @scala.inline
  implicit class SchemaGenerateDownloadUrlRequestOps[Self <: SchemaGenerateDownloadUrlRequest] (val x: Self) extends AnyVal {
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
    def setVersionId(value: String): Self = this.set("versionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
  
}

