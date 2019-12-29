package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Revision extends js.Object {
  var downloadUrl: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var exportLinks: js.UndefOr[js.Object] = js.undefined
  var fileSize: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lastModifyingUser: js.UndefOr[User] = js.undefined
  var lastModifyingUserName: js.UndefOr[String] = js.undefined
  var md5Checksum: js.UndefOr[String] = js.undefined
  var mimeType: js.UndefOr[String] = js.undefined
  var modifiedDate: js.UndefOr[String] = js.undefined
  var originalFilename: js.UndefOr[String] = js.undefined
  var pinned: js.UndefOr[Boolean] = js.undefined
  var publishAuto: js.UndefOr[Boolean] = js.undefined
  var published: js.UndefOr[Boolean] = js.undefined
  var publishedLink: js.UndefOr[String] = js.undefined
  var publishedOutsideDomain: js.UndefOr[Boolean] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
}

object Revision {
  @scala.inline
  def apply(
    downloadUrl: String = null,
    etag: String = null,
    exportLinks: js.Object = null,
    fileSize: String = null,
    id: String = null,
    kind: String = null,
    lastModifyingUser: User = null,
    lastModifyingUserName: String = null,
    md5Checksum: String = null,
    mimeType: String = null,
    modifiedDate: String = null,
    originalFilename: String = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    publishAuto: js.UndefOr[Boolean] = js.undefined,
    published: js.UndefOr[Boolean] = js.undefined,
    publishedLink: String = null,
    publishedOutsideDomain: js.UndefOr[Boolean] = js.undefined,
    selfLink: String = null
  ): Revision = {
    val __obj = js.Dynamic.literal()
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (exportLinks != null) __obj.updateDynamic("exportLinks")(exportLinks.asInstanceOf[js.Any])
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifyingUser != null) __obj.updateDynamic("lastModifyingUser")(lastModifyingUser.asInstanceOf[js.Any])
    if (lastModifyingUserName != null) __obj.updateDynamic("lastModifyingUserName")(lastModifyingUserName.asInstanceOf[js.Any])
    if (md5Checksum != null) __obj.updateDynamic("md5Checksum")(md5Checksum.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (modifiedDate != null) __obj.updateDynamic("modifiedDate")(modifiedDate.asInstanceOf[js.Any])
    if (originalFilename != null) __obj.updateDynamic("originalFilename")(originalFilename.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAuto)) __obj.updateDynamic("publishAuto")(publishAuto.asInstanceOf[js.Any])
    if (!js.isUndefined(published)) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (publishedLink != null) __obj.updateDynamic("publishedLink")(publishedLink.asInstanceOf[js.Any])
    if (!js.isUndefined(publishedOutsideDomain)) __obj.updateDynamic("publishedOutsideDomain")(publishedOutsideDomain.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision]
  }
}

