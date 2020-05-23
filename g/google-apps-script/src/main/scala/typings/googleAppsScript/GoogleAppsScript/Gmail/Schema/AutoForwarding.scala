package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

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
    if (disposition != null) __obj.updateDynamic("disposition")(disposition.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoForwarding]
  }
}

