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

