package typings.googleCloudStorage.bucketMod

import typings.googleCloudStorage.googleCloudStorageStrings.list
import typings.googleCloudStorage.googleCloudStorageStrings.v2
import typings.googleCloudStorage.googleCloudStorageStrings.v4
import typings.googleCloudStorage.signerMod.Query
import typings.node.httpMod.OutgoingHttpHeaders
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketSignedUrlConfig extends js.Object {
  var action: list
  var cname: js.UndefOr[String] = js.undefined
  var expires: String | Double | Date
  var extensionHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var queryParams: js.UndefOr[Query] = js.undefined
  var version: js.UndefOr[v2 | v4] = js.undefined
  var virtualHostedStyle: js.UndefOr[Boolean] = js.undefined
}

object GetBucketSignedUrlConfig {
  @scala.inline
  def apply(
    action: list,
    expires: String | Double | Date,
    cname: String = null,
    extensionHeaders: OutgoingHttpHeaders = null,
    queryParams: Query = null,
    version: v2 | v4 = null,
    virtualHostedStyle: js.UndefOr[Boolean] = js.undefined
  ): GetBucketSignedUrlConfig = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any])
    if (cname != null) __obj.updateDynamic("cname")(cname.asInstanceOf[js.Any])
    if (extensionHeaders != null) __obj.updateDynamic("extensionHeaders")(extensionHeaders.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualHostedStyle)) __obj.updateDynamic("virtualHostedStyle")(virtualHostedStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketSignedUrlConfig]
  }
}

