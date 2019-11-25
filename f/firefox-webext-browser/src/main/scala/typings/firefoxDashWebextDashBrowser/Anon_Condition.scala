package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser._manifest._WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
import typings.firefoxDashWebextDashBrowser.browser._manifest._WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Condition extends js.Object {
  /** The type of param can be either "purpose" or "pref". */
  var condition: js.UndefOr[_WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition] = js.undefined
  /** A url parameter name */
  var name: String
  /** The preference to retreive the value from. */
  var pref: js.UndefOr[String] = js.undefined
  /** The context that initiates a search, required if condition is "purpose". */
  var purpose: js.UndefOr[_WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose] = js.undefined
  /** A url parameter value. */
  var value: js.UndefOr[String] = js.undefined
}

object Anon_Condition {
  @scala.inline
  def apply(
    name: String,
    condition: _WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition = null,
    pref: String = null,
    purpose: _WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose = null,
    value: String = null
  ): Anon_Condition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (pref != null) __obj.updateDynamic("pref")(pref.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Condition]
  }
}

