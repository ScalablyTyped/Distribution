package typings.firefoxDashWebextDashBrowser.browser._manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of param can be either "purpose" or "pref". */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.purpose
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.pref
*/
trait _WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition extends js.Object

object _WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pref: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.pref = this.cast("pref")
  @scala.inline
  def purpose: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.purpose = this.cast("purpose")
}

