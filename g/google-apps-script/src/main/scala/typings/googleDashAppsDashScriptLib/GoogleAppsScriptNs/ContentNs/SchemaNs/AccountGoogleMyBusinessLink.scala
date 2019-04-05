package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountGoogleMyBusinessLink extends js.Object {
  var gmbEmail: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object AccountGoogleMyBusinessLink {
  @scala.inline
  def apply(gmbEmail: java.lang.String = null, status: java.lang.String = null): AccountGoogleMyBusinessLink = {
    val __obj = js.Dynamic.literal()
    if (gmbEmail != null) __obj.updateDynamic("gmbEmail")(gmbEmail)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[AccountGoogleMyBusinessLink]
  }
}

