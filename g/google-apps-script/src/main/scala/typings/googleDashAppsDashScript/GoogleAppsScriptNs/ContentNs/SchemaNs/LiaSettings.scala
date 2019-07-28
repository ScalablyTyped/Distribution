package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiaSettings extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var countrySettings: js.UndefOr[js.Array[LiaCountrySettings]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object LiaSettings {
  @scala.inline
  def apply(
    accountId: String = null,
    countrySettings: js.Array[LiaCountrySettings] = null,
    kind: String = null
  ): LiaSettings = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (countrySettings != null) __obj.updateDynamic("countrySettings")(countrySettings)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[LiaSettings]
  }
}

