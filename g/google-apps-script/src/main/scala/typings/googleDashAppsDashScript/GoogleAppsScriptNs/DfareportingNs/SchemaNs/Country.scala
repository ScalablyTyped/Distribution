package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  var countryCode: js.UndefOr[String] = js.undefined
  var dartId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var sslEnabled: js.UndefOr[Boolean] = js.undefined
}

object Country {
  @scala.inline
  def apply(
    countryCode: String = null,
    dartId: String = null,
    kind: String = null,
    name: String = null,
    sslEnabled: js.UndefOr[Boolean] = js.undefined
  ): Country = {
    val __obj = js.Dynamic.literal()
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (dartId != null) __obj.updateDynamic("dartId")(dartId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(sslEnabled)) __obj.updateDynamic("sslEnabled")(sslEnabled)
    __obj.asInstanceOf[Country]
  }
}

