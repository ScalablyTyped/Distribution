package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A revision of a file.
  */
@js.native
trait Schema$Revision extends js.Object {
  /**
    * Short term download URL for the file. This will only be populated on
    * files with content stored in Drive.
    */
  var downloadUrl: js.UndefOr[String] = js.native
  /**
    * The ETag of the revision.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Links for exporting Google Docs to specific formats.
    */
  var exportLinks: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The size of the revision in bytes. This will only be populated on files
    * with content stored in Drive.
    */
  var fileSize: js.UndefOr[String] = js.native
  /**
    * The ID of the revision.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * This is always drive#revision.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The last user to modify this revision.
    */
  var lastModifyingUser: js.UndefOr[Schema$User] = js.native
  /**
    * Name of the last user to modify this revision.
    */
  var lastModifyingUserName: js.UndefOr[String] = js.native
  /**
    * An MD5 checksum for the content of this revision. This will only be
    * populated on files with content stored in Drive.
    */
  var md5Checksum: js.UndefOr[String] = js.native
  /**
    * The MIME type of the revision.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Last time this revision was modified (formatted RFC 3339 timestamp).
    */
  var modifiedDate: js.UndefOr[String] = js.native
  /**
    * The original filename when this revision was created. This will only be
    * populated on files with content stored in Drive.
    */
  var originalFilename: js.UndefOr[String] = js.native
  /**
    * Whether this revision is pinned to prevent automatic purging. This will
    * only be populated and can only be modified on files with content stored
    * in Drive which are not Google Docs. Revisions can also be pinned when
    * they are created through the drive.files.insert/update/copy by using the
    * pinned query parameter.
    */
  var pinned: js.UndefOr[Boolean] = js.native
  /**
    * Whether subsequent revisions will be automatically republished. This is
    * only populated and can only be modified for Google Docs.
    */
  var publishAuto: js.UndefOr[Boolean] = js.native
  /**
    * Whether this revision is published. This is only populated and can only
    * be modified for Google Docs.
    */
  var published: js.UndefOr[Boolean] = js.native
  /**
    * A link to the published revision.
    */
  var publishedLink: js.UndefOr[String] = js.native
  /**
    * Whether this revision is published outside the domain. This is only
    * populated and can only be modified for Google Docs.
    */
  var publishedOutsideDomain: js.UndefOr[Boolean] = js.native
  /**
    * A link back to this revision.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object Schema$Revision {
  @scala.inline
  def apply(
    downloadUrl: String = null,
    etag: String = null,
    exportLinks: StringDictionary[String] = null,
    fileSize: String = null,
    id: String = null,
    kind: String = null,
    lastModifyingUser: Schema$User = null,
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
  ): Schema$Revision = {
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
    __obj.asInstanceOf[Schema$Revision]
  }
}

