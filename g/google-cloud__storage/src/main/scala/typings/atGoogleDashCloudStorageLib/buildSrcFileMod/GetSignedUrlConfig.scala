package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSignedUrlConfig extends js.Object {
  var action: atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.read | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.write | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.delete | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.resumable
  var cname: js.UndefOr[java.lang.String] = js.undefined
  var contentMd5: js.UndefOr[java.lang.String] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var expires: java.lang.String | scala.Double | stdLib.Date
  var extensionHeaders: js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders] = js.undefined
  var promptSaveAs: js.UndefOr[java.lang.String] = js.undefined
  var responseDisposition: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[java.lang.String] = js.undefined
}

object GetSignedUrlConfig {
  @scala.inline
  def apply(
    action: atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.read | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.write | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.delete | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.resumable,
    expires: java.lang.String | scala.Double | stdLib.Date,
    cname: java.lang.String = null,
    contentMd5: java.lang.String = null,
    contentType: java.lang.String = null,
    extensionHeaders: nodeLib.httpMod.OutgoingHttpHeaders = null,
    promptSaveAs: java.lang.String = null,
    responseDisposition: java.lang.String = null,
    responseType: java.lang.String = null
  ): GetSignedUrlConfig = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any])
    if (cname != null) __obj.updateDynamic("cname")(cname)
    if (contentMd5 != null) __obj.updateDynamic("contentMd5")(contentMd5)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (extensionHeaders != null) __obj.updateDynamic("extensionHeaders")(extensionHeaders)
    if (promptSaveAs != null) __obj.updateDynamic("promptSaveAs")(promptSaveAs)
    if (responseDisposition != null) __obj.updateDynamic("responseDisposition")(responseDisposition)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    __obj.asInstanceOf[GetSignedUrlConfig]
  }
}

