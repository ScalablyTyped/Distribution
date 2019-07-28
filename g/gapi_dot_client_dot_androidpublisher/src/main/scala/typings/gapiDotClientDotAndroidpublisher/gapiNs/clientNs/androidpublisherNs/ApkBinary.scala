package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApkBinary extends js.Object {
  /** A sha1 hash of the APK payload, encoded as a hex string and matching the output of the sha1sum command. */
  var sha1: js.UndefOr[String] = js.undefined
  /** A sha256 hash of the APK payload, encoded as a hex string and matching the output of the sha256sum command. */
  var sha256: js.UndefOr[String] = js.undefined
}

object ApkBinary {
  @scala.inline
  def apply(sha1: String = null, sha256: String = null): ApkBinary = {
    val __obj = js.Dynamic.literal()
    if (sha1 != null) __obj.updateDynamic("sha1")(sha1)
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256)
    __obj.asInstanceOf[ApkBinary]
  }
}

