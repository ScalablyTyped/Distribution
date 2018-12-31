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
  var expires: scala.Double
  var extensionHeaders: js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders] = js.undefined
  var promptSaveAs: js.UndefOr[java.lang.String] = js.undefined
  var responseDisposition: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[java.lang.String] = js.undefined
}

