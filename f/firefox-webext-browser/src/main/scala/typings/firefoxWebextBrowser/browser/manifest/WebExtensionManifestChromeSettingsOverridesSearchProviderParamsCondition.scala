package typings.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of param can be either "purpose" or "pref". */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.purpose
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.pref
*/
trait WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition extends js.Object

object WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pref: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.pref = this.cast("pref")
  @scala.inline
  def purpose: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.purpose = this.cast("purpose")
}

