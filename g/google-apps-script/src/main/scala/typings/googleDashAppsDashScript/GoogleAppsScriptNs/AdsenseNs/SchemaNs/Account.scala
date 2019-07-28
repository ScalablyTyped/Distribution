package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var creation_time: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var premium: js.UndefOr[Boolean] = js.undefined
  var subAccounts: js.UndefOr[js.Array[Account]] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    creation_time: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    premium: js.UndefOr[Boolean] = js.undefined,
    subAccounts: js.Array[Account] = null,
    timezone: String = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (creation_time != null) __obj.updateDynamic("creation_time")(creation_time)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(premium)) __obj.updateDynamic("premium")(premium)
    if (subAccounts != null) __obj.updateDynamic("subAccounts")(subAccounts)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    __obj.asInstanceOf[Account]
  }
}

