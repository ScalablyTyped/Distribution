package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppManifestResponse extends js.Object {
  /**
    * Manifest content.
    */
  var data: js.UndefOr[String] = js.native
  var errors: js.Array[AppManifestError] = js.native
  /**
    * Parsed manifest properties
    */
  var parsed: js.UndefOr[AppManifestParsedProperties] = js.native
  /**
    * Manifest location.
    */
  var url: String = js.native
}

object GetAppManifestResponse {
  @scala.inline
  def apply(errors: js.Array[AppManifestError], url: String): GetAppManifestResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppManifestResponse]
  }
  @scala.inline
  implicit class GetAppManifestResponseOps[Self <: GetAppManifestResponse] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: AppManifestError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[AppManifestError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setParsed(value: AppManifestParsedProperties): Self = this.set("parsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParsed: Self = this.set("parsed", js.undefined)
  }
  
}

