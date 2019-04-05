package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAbout extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object UserAbout {
  @scala.inline
  def apply(contentType: java.lang.String = null, value: java.lang.String = null): UserAbout = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UserAbout]
  }
}

