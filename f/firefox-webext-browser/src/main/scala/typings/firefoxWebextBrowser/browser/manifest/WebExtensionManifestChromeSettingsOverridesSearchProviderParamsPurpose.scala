package typings.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The context that initiates a search, required if condition is "purpose". */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.contextmenu
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.searchbar
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.homepage
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.newtab
*/
trait WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose extends js.Object

object WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def contextmenu: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.contextmenu = this.cast("contextmenu")
  @scala.inline
  def homepage: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.homepage = this.cast("homepage")
  @scala.inline
  def keyword: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword = this.cast("keyword")
  @scala.inline
  def newtab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.newtab = this.cast("newtab")
  @scala.inline
  def searchbar: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.searchbar = this.cast("searchbar")
}

