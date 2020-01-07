package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DisplayName extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  var packageName: js.UndefOr[String] = js.native
  var permission: js.UndefOr[js.Array[String]] = js.native
  var versionCode: js.UndefOr[Double] = js.native
  var versionName: js.UndefOr[String] = js.native
}

object Anon_DisplayName {
  @scala.inline
  def apply(
    displayName: String = null,
    packageName: String = null,
    permission: js.Array[String] = null,
    versionCode: Int | Double = null,
    versionName: String = null
  ): Anon_DisplayName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode.asInstanceOf[js.Any])
    if (versionName != null) __obj.updateDynamic("versionName")(versionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DisplayName]
  }
}

