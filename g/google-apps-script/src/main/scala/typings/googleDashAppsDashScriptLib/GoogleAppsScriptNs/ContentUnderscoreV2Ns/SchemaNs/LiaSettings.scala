package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiaSettings extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var countrySettings: js.UndefOr[js.Array[LiaCountrySettings]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object LiaSettings {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    countrySettings: js.Array[LiaCountrySettings] = null,
    kind: java.lang.String = null
  ): LiaSettings = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (countrySettings != null) __obj.updateDynamic("countrySettings")(countrySettings)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[LiaSettings]
  }
}

