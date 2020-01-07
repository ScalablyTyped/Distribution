package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the binary payload of an APK.
  */
@js.native
trait Schema$ApkBinary extends js.Object {
  /**
    * A sha1 hash of the APK payload, encoded as a hex string and matching the
    * output of the sha1sum command.
    */
  var sha1: js.UndefOr[String] = js.native
  /**
    * A sha256 hash of the APK payload, encoded as a hex string and matching
    * the output of the sha256sum command.
    */
  var sha256: js.UndefOr[String] = js.native
}

object Schema$ApkBinary {
  @scala.inline
  def apply(sha1: String = null, sha256: String = null): Schema$ApkBinary = {
    val __obj = js.Dynamic.literal()
    if (sha1 != null) __obj.updateDynamic("sha1")(sha1.asInstanceOf[js.Any])
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApkBinary]
  }
}

