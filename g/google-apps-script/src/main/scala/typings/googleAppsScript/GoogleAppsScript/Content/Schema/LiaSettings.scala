package typings.googleAppsScript.GoogleAppsScript.Content.Schema

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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (countrySettings != null) __obj.updateDynamic("countrySettings")(countrySettings.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiaSettings]
  }
}

