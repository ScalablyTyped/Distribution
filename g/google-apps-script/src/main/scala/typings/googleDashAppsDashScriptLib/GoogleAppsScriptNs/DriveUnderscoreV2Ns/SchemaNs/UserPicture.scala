package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPicture extends js.Object {
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object UserPicture {
  @scala.inline
  def apply(url: java.lang.String = null): UserPicture = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[UserPicture]
  }
}

