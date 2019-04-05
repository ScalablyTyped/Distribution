package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoForwarding extends js.Object {
  var disposition: js.UndefOr[java.lang.String] = js.undefined
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
}

object AutoForwarding {
  @scala.inline
  def apply(
    disposition: java.lang.String = null,
    emailAddress: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined
  ): AutoForwarding = {
    val __obj = js.Dynamic.literal()
    if (disposition != null) __obj.updateDynamic("disposition")(disposition)
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[AutoForwarding]
  }
}

