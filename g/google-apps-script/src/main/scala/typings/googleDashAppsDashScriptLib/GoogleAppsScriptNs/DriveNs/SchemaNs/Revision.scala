package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Revision extends js.Object {
  var downloadUrl: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var exportLinks: js.UndefOr[js.Object] = js.undefined
  var fileSize: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lastModifyingUser: js.UndefOr[User] = js.undefined
  var lastModifyingUserName: js.UndefOr[java.lang.String] = js.undefined
  var md5Checksum: js.UndefOr[java.lang.String] = js.undefined
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  var modifiedDate: js.UndefOr[java.lang.String] = js.undefined
  var originalFilename: js.UndefOr[java.lang.String] = js.undefined
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  var publishAuto: js.UndefOr[scala.Boolean] = js.undefined
  var published: js.UndefOr[scala.Boolean] = js.undefined
  var publishedLink: js.UndefOr[java.lang.String] = js.undefined
  var publishedOutsideDomain: js.UndefOr[scala.Boolean] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

object Revision {
  @scala.inline
  def apply(
    downloadUrl: java.lang.String = null,
    etag: java.lang.String = null,
    exportLinks: js.Object = null,
    fileSize: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    lastModifyingUser: User = null,
    lastModifyingUserName: java.lang.String = null,
    md5Checksum: java.lang.String = null,
    mimeType: java.lang.String = null,
    modifiedDate: java.lang.String = null,
    originalFilename: java.lang.String = null,
    pinned: js.UndefOr[scala.Boolean] = js.undefined,
    publishAuto: js.UndefOr[scala.Boolean] = js.undefined,
    published: js.UndefOr[scala.Boolean] = js.undefined,
    publishedLink: java.lang.String = null,
    publishedOutsideDomain: js.UndefOr[scala.Boolean] = js.undefined,
    selfLink: java.lang.String = null
  ): Revision = {
    val __obj = js.Dynamic.literal()
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (exportLinks != null) __obj.updateDynamic("exportLinks")(exportLinks)
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifyingUser != null) __obj.updateDynamic("lastModifyingUser")(lastModifyingUser)
    if (lastModifyingUserName != null) __obj.updateDynamic("lastModifyingUserName")(lastModifyingUserName)
    if (md5Checksum != null) __obj.updateDynamic("md5Checksum")(md5Checksum)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (modifiedDate != null) __obj.updateDynamic("modifiedDate")(modifiedDate)
    if (originalFilename != null) __obj.updateDynamic("originalFilename")(originalFilename)
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (!js.isUndefined(publishAuto)) __obj.updateDynamic("publishAuto")(publishAuto)
    if (!js.isUndefined(published)) __obj.updateDynamic("published")(published)
    if (publishedLink != null) __obj.updateDynamic("publishedLink")(publishedLink)
    if (!js.isUndefined(publishedOutsideDomain)) __obj.updateDynamic("publishedOutsideDomain")(publishedOutsideDomain)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[Revision]
  }
}

