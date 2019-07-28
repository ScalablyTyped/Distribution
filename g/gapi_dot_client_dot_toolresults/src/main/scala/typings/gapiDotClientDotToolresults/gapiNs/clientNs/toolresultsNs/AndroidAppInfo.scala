package typings.gapiDotClientDotToolresults.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidAppInfo extends js.Object {
  /** The name of the app. Optional */
  var name: js.UndefOr[String] = js.undefined
  /** The package name of the app. Required. */
  var packageName: js.UndefOr[String] = js.undefined
  /** The internal version code of the app. Optional. */
  var versionCode: js.UndefOr[String] = js.undefined
  /** The version name of the app. Optional. */
  var versionName: js.UndefOr[String] = js.undefined
}

object AndroidAppInfo {
  @scala.inline
  def apply(
    name: String = null,
    packageName: String = null,
    versionCode: String = null,
    versionName: String = null
  ): AndroidAppInfo = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (packageName != null) __obj.updateDynamic("packageName")(packageName)
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode)
    if (versionName != null) __obj.updateDynamic("versionName")(versionName)
    __obj.asInstanceOf[AndroidAppInfo]
  }
}

