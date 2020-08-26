package typings.googleCloudStorage.signerMod

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSignedUrlConfigInternal extends js.Object {
  var bucket: String = js.native
  var cname: js.UndefOr[String] = js.native
  var contentMd5: js.UndefOr[String] = js.native
  var contentType: js.UndefOr[String] = js.native
  var expiration: Double = js.native
  var extensionHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
  var file: js.UndefOr[String] = js.native
  var method: String = js.native
  var queryParams: js.UndefOr[Query] = js.native
}

object GetSignedUrlConfigInternal {
  @scala.inline
  def apply(bucket: String, expiration: Double, method: String): GetSignedUrlConfigInternal = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSignedUrlConfigInternal]
  }
  @scala.inline
  implicit class GetSignedUrlConfigInternalOps[Self <: GetSignedUrlConfigInternal] (val x: Self) extends AnyVal {
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
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiration(value: Double): Self = this.set("expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setCname(value: String): Self = this.set("cname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCname: Self = this.set("cname", js.undefined)
    @scala.inline
    def setContentMd5(value: String): Self = this.set("contentMd5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentMd5: Self = this.set("contentMd5", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setExtensionHeaders(value: OutgoingHttpHeaders): Self = this.set("extensionHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensionHeaders: Self = this.set("extensionHeaders", js.undefined)
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setQueryParams(value: Query): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
  }
  
}

