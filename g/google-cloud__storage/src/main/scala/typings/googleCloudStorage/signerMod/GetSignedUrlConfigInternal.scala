package typings.googleCloudStorage.signerMod

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSignedUrlConfigInternal extends js.Object {
  var bucket: String
  var cname: js.UndefOr[String] = js.undefined
  var contentMd5: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var expiration: Double
  var extensionHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var file: js.UndefOr[String] = js.undefined
  var method: String
  var queryParams: js.UndefOr[Query] = js.undefined
}

object GetSignedUrlConfigInternal {
  @scala.inline
  def apply(
    bucket: String,
    expiration: Double,
    method: String,
    cname: String = null,
    contentMd5: String = null,
    contentType: String = null,
    extensionHeaders: OutgoingHttpHeaders = null,
    file: String = null,
    queryParams: Query = null
  ): GetSignedUrlConfigInternal = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (cname != null) __obj.updateDynamic("cname")(cname.asInstanceOf[js.Any])
    if (contentMd5 != null) __obj.updateDynamic("contentMd5")(contentMd5.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (extensionHeaders != null) __obj.updateDynamic("extensionHeaders")(extensionHeaders.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSignedUrlConfigInternal]
  }
}

