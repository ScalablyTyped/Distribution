package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BrowserstyleDefaultarea extends js.Object {
  var browser_style: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the location the browserAction will appear by default. The default location is navbar. */
  var default_area: js.UndefOr[
    firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs._WebExtensionManifestBrowserActionDefaultArea
  ] = js.undefined
  var default_icon: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.IconPath] = js.undefined
  var default_popup: js.UndefOr[java.lang.String] = js.undefined
  var default_title: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies icons to use for dark and light themes */
  var theme_icons: js.UndefOr[
    js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ThemeIcons]
  ] = js.undefined
}

object Anon_BrowserstyleDefaultarea {
  @scala.inline
  def apply(
    browser_style: js.UndefOr[scala.Boolean] = js.undefined,
    default_area: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs._WebExtensionManifestBrowserActionDefaultArea = null,
    default_icon: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.IconPath = null,
    default_popup: java.lang.String = null,
    default_title: java.lang.String = null,
    theme_icons: js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ThemeIcons] = null
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

