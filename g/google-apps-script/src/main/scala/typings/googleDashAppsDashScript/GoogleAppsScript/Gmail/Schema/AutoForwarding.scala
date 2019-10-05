package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoForwarding extends js.Object {
  var disposition: js.UndefOr[String] = js.undefined
  var emailAddress: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object AutoForwarding {
  @scala.inline
  def apply(
    disposition: String = null,
    emailAddress: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): AutoForwarding = {
    val __obj = js.Dynamic.literal()
    if (disposition != null) __obj.updateDynamic("disposition")(disposition)
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[AutoForwarding]
  }
}

