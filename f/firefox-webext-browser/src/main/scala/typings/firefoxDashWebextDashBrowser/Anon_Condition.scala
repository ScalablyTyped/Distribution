package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.underscoreManifestNs._WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
import typings.firefoxDashWebextDashBrowser.browserNs.underscoreManifestNs._WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
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
    val __obj = js.Dynamic.literal(name = name)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (pref != null) __obj.updateDynamic("pref")(pref)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Condition]
  }
}

