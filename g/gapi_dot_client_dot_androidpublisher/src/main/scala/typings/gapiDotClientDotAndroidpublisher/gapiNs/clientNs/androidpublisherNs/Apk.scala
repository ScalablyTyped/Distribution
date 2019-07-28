package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

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
  def apply(binary: ApkBinary = null, versionCode: Int | Double = null): Apk = {
    val __obj = js.Dynamic.literal()
    if (binary != null) __obj.updateDynamic("binary")(binary)
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apk]
  }
}

