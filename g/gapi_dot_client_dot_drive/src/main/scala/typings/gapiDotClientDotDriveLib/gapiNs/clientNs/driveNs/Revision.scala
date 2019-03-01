package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Revision extends js.Object {
  /** The ID of the revision. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to keep this revision forever, even if it is no longer the head revision. If not set, the revision will be automatically purged 30 days after
    * newer content is uploaded. This can be set on a maximum of 200 revisions for a file.
    * This field is only applicable to files with binary content in Drive.
    */
  var keepForever: js.UndefOr[scala.Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#revision". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The last user to modify this revision. */
  var lastModifyingUser: js.UndefOr[User] = js.undefined
  /** The MD5 checksum of the revision's content. This is only applicable to files with binary content in Drive. */
  var md5Checksum: js.UndefOr[java.lang.String] = js.undefined
  /** The MIME type of the revision. */
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  /** The last time the revision was modified (RFC 3339 date-time). */
  var modifiedTime: js.UndefOr[java.lang.String] = js.undefined
  /** The original filename used to create this revision. This is only applicable to files with binary content in Drive. */
  var originalFilename: js.UndefOr[java.lang.String] = js.undefined
  /** Whether subsequent revisions will be automatically republished. This is only applicable to Google Docs. */
  var publishAuto: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether this revision is published. This is only applicable to Google Docs. */
  var published: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether this revision is published outside the domain. This is only applicable to Google Docs. */
  var publishedOutsideDomain: js.UndefOr[scala.Boolean] = js.undefined
  /** The size of the revision's content in bytes. This is only applicable to files with binary content in Drive. */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object Revision {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    keepForever: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    lastModifyingUser: User = null,
    md5Checksum: java.lang.String = null,
    mimeType: java.lang.String = null,
    modifiedTime: java.lang.String = null,
    originalFilename: java.lang.String = null,
    publishAuto: js.UndefOr[scala.Boolean] = js.undefined,
    published: js.UndefOr[scala.Boolean] = js.undefined,
    publishedOutsideDomain: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null
  ): Revision = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(keepForever)) __obj.updateDynamic("keepForever")(keepForever)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifyingUser != null) __obj.updateDynamic("lastModifyingUser")(lastModifyingUser)
    if (md5Checksum != null) __obj.updateDynamic("md5Checksum")(md5Checksum)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (modifiedTime != null) __obj.updateDynamic("modifiedTime")(modifiedTime)
    if (originalFilename != null) __obj.updateDynamic("originalFilename")(originalFilename)
    if (!js.isUndefined(publishAuto)) __obj.updateDynamic("publishAuto")(publishAuto)
    if (!js.isUndefined(published)) __obj.updateDynamic("published")(published)
    if (!js.isUndefined(publishedOutsideDomain)) __obj.updateDynamic("publishedOutsideDomain")(publishedOutsideDomain)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Revision]
  }
}

