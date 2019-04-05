package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatusStatistics extends js.Object {
  var active: js.UndefOr[java.lang.String] = js.undefined
  var disapproved: js.UndefOr[java.lang.String] = js.undefined
  var expiring: js.UndefOr[java.lang.String] = js.undefined
  var pending: js.UndefOr[java.lang.String] = js.undefined
}

object AccountStatusStatistics {
  @scala.inline
  def apply(
    active: java.lang.String = null,
    disapproved: java.lang.String = null,
    expiring: java.lang.String = null,
    pending: java.lang.String = null
  ): AccountStatusStatistics = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (disapproved != null) __obj.updateDynamic("disapproved")(disapproved)
    if (expiring != null) __obj.updateDynamic("expiring")(expiring)
    if (pending != null) __obj.updateDynamic("pending")(pending)
    __obj.asInstanceOf[AccountStatusStatistics]
  }
}

