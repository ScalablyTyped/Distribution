package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  var dartId: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var sslEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object Country {
  @scala.inline
  def apply(
    countryCode: java.lang.String = null,
    dartId: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    sslEnabled: js.UndefOr[scala.Boolean] = js.undefined
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

