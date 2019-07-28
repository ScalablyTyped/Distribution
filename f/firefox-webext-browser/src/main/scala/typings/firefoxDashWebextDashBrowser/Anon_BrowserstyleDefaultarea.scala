package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.underscoreManifestNs.IconPath
import typings.firefoxDashWebextDashBrowser.browserNs.underscoreManifestNs.ThemeIcons
import typings.firefoxDashWebextDashBrowser.browserNs.underscoreManifestNs._WebExtensionManifestBrowserActionDefaultArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BrowserstyleDefaultarea extends js.Object {
  var browser_style: js.UndefOr[Boolean] = js.undefined
  /** Defines the location the browserAction will appear by default. The default location is navbar. */
  var default_area: js.UndefOr[_WebExtensionManifestBrowserActionDefaultArea] = js.undefined
  var default_icon: js.UndefOr[IconPath] = js.undefined
  var default_popup: js.UndefOr[String] = js.undefined
  var default_title: js.UndefOr[String] = js.undefined
  /** Specifies icons to use for dark and light themes */
  var theme_icons: js.UndefOr[js.Array[ThemeIcons]] = js.undefined
}

object Anon_BrowserstyleDefaultarea {
  @scala.inline
  def apply(
    browser_style: js.UndefOr[Boolean] = js.undefined,
    default_area: _WebExtensionManifestBrowserActionDefaultArea = null,
    default_icon: IconPath = null,
    default_popup: String = null,
    default_title: String = null,
    theme_icons: js.Array[ThemeIcons] = null
  ): Anon_BrowserstyleDefaultarea = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(browser_style)) __obj.updateDynamic("browser_style")(browser_style)
    if (default_area != null) __obj.updateDynamic("default_area")(default_area)
    if (default_icon != null) __obj.updateDynamic("default_icon")(default_icon.asInstanceOf[js.Any])
    if (default_popup != null) __obj.updateDynamic("default_popup")(default_popup)
    if (default_title != null) __obj.updateDynamic("default_title")(default_title)
    if (theme_icons != null) __obj.updateDynamic("theme_icons")(theme_icons)
    __obj.asInstanceOf[Anon_BrowserstyleDefaultarea]
  }
}

