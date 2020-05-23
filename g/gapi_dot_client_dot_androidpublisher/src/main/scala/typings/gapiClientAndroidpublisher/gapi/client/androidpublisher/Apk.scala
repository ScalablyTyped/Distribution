package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apk extends js.Object {
  /** Information about the binary payload of this APK. */
  var binary: js.UndefOr[ApkBinary] = js.undefined
  /** The version code of the APK, as specified in the APK's manifest file. */
  var versionCode: js.UndefOr[Double] = js.undefined
}

object Apk {
  @scala.inline
  def apply(binary: ApkBinary = null, versionCode: js.UndefOr[Double] = js.undefined): Apk = {
    val __obj = js.Dynamic.literal()
    if (binary != null) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (!js.isUndefined(versionCode)) __obj.updateDynamic("versionCode")(versionCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apk]
  }
}

