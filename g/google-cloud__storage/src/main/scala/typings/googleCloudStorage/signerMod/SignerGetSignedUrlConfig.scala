package typings.googleCloudStorage.signerMod

import typings.googleCloudStorage.googleCloudStorageStrings.DELETE
import typings.googleCloudStorage.googleCloudStorageStrings.GET
import typings.googleCloudStorage.googleCloudStorageStrings.POST
import typings.googleCloudStorage.googleCloudStorageStrings.PUT
import typings.googleCloudStorage.googleCloudStorageStrings.v2
import typings.googleCloudStorage.googleCloudStorageStrings.v4
import typings.node.httpMod.OutgoingHttpHeaders
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignerGetSignedUrlConfig extends js.Object {
  var cname: js.UndefOr[String] = js.undefined
  var contentMd5: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var expires: String | Double | Date
  var extensionHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var method: GET | PUT | DELETE | POST
  var queryParams: js.UndefOr[Query] = js.undefined
  var version: js.UndefOr[v2 | v4] = js.undefined
  var virtualHostedStyle: js.UndefOr[Boolean] = js.undefined
}

object SignerGetSignedUrlConfig {
  @scala.inline
  def apply(
    expires: String | Double | Date,
    method: GET | PUT | DELETE | POST,
    cname: String = null,
    contentMd5: String = null,
    contentType: String = null,
    extensionHeaders: OutgoingHttpHeaders = null,
    queryParams: Query = null,
    version: v2 | v4 = null,
    virtualHostedStyle: js.UndefOr[Boolean] = js.undefined
  ): SignerGetSignedUrlConfig = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (cname != null) __obj.updateDynamic("cname")(cname.asInstanceOf[js.Any])
    if (contentMd5 != null) __obj.updateDynamic("contentMd5")(contentMd5.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (extensionHeaders != null) __obj.updateDynamic("extensionHeaders")(extensionHeaders.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualHostedStyle)) __obj.updateDynamic("virtualHostedStyle")(virtualHostedStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerGetSignedUrlConfig]
  }
}

