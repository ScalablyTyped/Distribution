package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NamePurpose extends js.Object {
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

