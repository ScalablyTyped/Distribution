package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBundle extends js.Object {
  /**
    * A sha1 hash of the upload payload, encoded as a hex string and matching
    * the output of the sha1sum command.
    */
  var sha1: js.UndefOr[String] = js.native
  /**
    * A sha256 hash of the upload payload, encoded as a hex string and matching
    * the output of the sha256sum command.
    */
  var sha256: js.UndefOr[String] = js.native
  /**
    * The version code of the Android App Bundle. As specified in the Android
    * App Bundle&#39;s base module APK manifest file.
    */
  var versionCode: js.UndefOr[Double] = js.native
}

object SchemaBundle {
  @scala.inline
  def apply(sha1: String = null, sha256: String = null, versionCode: js.UndefOr[Double] = js.undefined): SchemaBundle = {
    val __obj = js.Dynamic.literal()
    if (sha1 != null) __obj.updateDynamic("sha1")(sha1.asInstanceOf[js.Any])
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256.asInstanceOf[js.Any])
    if (!js.isUndefined(versionCode)) __obj.updateDynamic("versionCode")(versionCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBundle]
  }
}

