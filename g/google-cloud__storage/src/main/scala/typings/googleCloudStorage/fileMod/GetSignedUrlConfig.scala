package typings.googleCloudStorage.fileMod

import typings.googleCloudStorage.googleCloudStorageStrings.delete
import typings.googleCloudStorage.googleCloudStorageStrings.read
import typings.googleCloudStorage.googleCloudStorageStrings.resumable
import typings.googleCloudStorage.googleCloudStorageStrings.v2
import typings.googleCloudStorage.googleCloudStorageStrings.v4
import typings.googleCloudStorage.googleCloudStorageStrings.write
import typings.node.httpMod.OutgoingHttpHeaders
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSignedUrlConfig extends js.Object {
  var action: read | write | delete | resumable
  var cname: js.UndefOr[String] = js.undefined
  var contentMd5: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var expires: String | Double | Date
  var extensionHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var promptSaveAs: js.UndefOr[String] = js.undefined
  var responseDisposition: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[v2 | v4] = js.undefined
}

object GetSignedUrlConfig {
  @scala.inline
  def apply(
    action: read | write | delete | resumable,
    expires: String | Double | Date,
    cname: String = null,
    contentMd5: String = null,
    contentType: String = null,
    extensionHeaders: OutgoingHttpHeaders = null,
    promptSaveAs: String = null,
    responseDisposition: String = null,
    responseType: String = null,
    version: v2 | v4 = null
  ): GetSignedUrlConfig = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any])
    if (cname != null) __obj.updateDynamic("cname")(cname.asInstanceOf[js.Any])
    if (contentMd5 != null) __obj.updateDynamic("contentMd5")(contentMd5.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (extensionHeaders != null) __obj.updateDynamic("extensionHeaders")(extensionHeaders.asInstanceOf[js.Any])
    if (promptSaveAs != null) __obj.updateDynamic("promptSaveAs")(promptSaveAs.asInstanceOf[js.Any])
    if (responseDisposition != null) __obj.updateDynamic("responseDisposition")(responseDisposition.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSignedUrlConfig]
  }
}

