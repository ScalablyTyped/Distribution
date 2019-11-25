package typings.firefoxDashWebextDashBrowser.browser._manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The context that initiates a search, required if condition is "purpose". */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.contextmenu
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.searchbar
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.homepage
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.keyword
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.newtab
*/
trait _WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose extends js.Object

object _WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def contextmenu: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.contextmenu = this.cast("contextmenu")
  @scala.inline
  def homepage: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.homepage = this.cast("homepage")
  @scala.inline
  def keyword: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.keyword = this.cast("keyword")
  @scala.inline
  def newtab: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.newtab = this.cast("newtab")
  @scala.inline
  def searchbar: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.searchbar = this.cast("searchbar")
}

