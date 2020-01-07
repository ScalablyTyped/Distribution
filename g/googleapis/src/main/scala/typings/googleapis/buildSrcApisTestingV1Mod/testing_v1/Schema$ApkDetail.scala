package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Android application details based on application manifest and apk archive
  * contents.
  */
@js.native
trait Schema$ApkDetail extends js.Object {
  var apkManifest: js.UndefOr[Schema$ApkManifest] = js.native
}

object Schema$ApkDetail {
  @scala.inline
  def apply(apkManifest: Schema$ApkManifest = null): Schema$ApkDetail = {
    val __obj = js.Dynamic.literal()
    if (apkManifest != null) __obj.updateDynamic("apkManifest")(apkManifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApkDetail]
  }
}

