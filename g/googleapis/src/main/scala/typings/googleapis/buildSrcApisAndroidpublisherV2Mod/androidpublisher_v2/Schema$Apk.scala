package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Apk extends js.Object {
  /**
    * Information about the binary payload of this APK.
    */
  var binary: js.UndefOr[Schema$ApkBinary] = js.native
  /**
    * The version code of the APK, as specified in the APK&#39;s manifest file.
    */
  var versionCode: js.UndefOr[Double] = js.native
}

object Schema$Apk {
  @scala.inline
  def apply(binary: Schema$ApkBinary = null, versionCode: Int | Double = null): Schema$Apk = {
    val __obj = js.Dynamic.literal()
    if (binary != null) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Apk]
  }
}

