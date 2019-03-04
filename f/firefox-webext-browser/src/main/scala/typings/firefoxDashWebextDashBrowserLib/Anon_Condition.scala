package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Condition extends js.Object {
  /** The type of param can be either "purpose" or "pref". */
  var condition: js.UndefOr[
    firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs._WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
  ] = js.undefined
  /** A url parameter name */
  var name: java.lang.String
  /** The preference to retreive the value from. */
  var pref: js.UndefOr[java.lang.String] = js.undefined
  /** The context that initiates a search, required if condition is "purpose". */
  var purpose: js.UndefOr[
    firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs._WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  ] = js.undefined
  /** A url parameter value. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Condition {
  @scala.inline
  def apply(
    name: java.lang.String,
    condition: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs._WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition = null,
    pref: java.lang.String = null,
    purpose: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs._WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose = null,
    value: java.lang.String = null
  ): Anon_Condition = {
    val __obj = js.Dynamic.literal(name = name)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (pref != null) __obj.updateDynamic("pref")(pref)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Condition]
  }
}

