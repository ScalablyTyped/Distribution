package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BrowserstyleDefaulticonDefaultpanel extends js.Object {
  var browser_style: js.UndefOr[scala.Boolean] = js.undefined
  var default_icon: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.IconPath] = js.undefined
  var default_panel: java.lang.String
  var default_title: js.UndefOr[java.lang.String] = js.undefined
  /** Whether or not the sidebar is opened at install. Default is `true`. */
  var open_at_install: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BrowserstyleDefaulticonDefaultpanel {
  @scala.inline
  def apply(
    default_panel: java.lang.String,
    browser_style: js.UndefOr[scala.Boolean] = js.undefined,
    default_icon: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.IconPath = null,
    default_title: java.lang.String = null,
    open_at_install: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BrowserstyleDefaulticonDefaultpanel = {
    val __obj = js.Dynamic.literal(default_panel = default_panel)
    if (!js.isUndefined(browser_style)) __obj.updateDynamic("browser_style")(browser_style)
    if (default_icon != null) __obj.updateDynamic("default_icon")(default_icon.asInstanceOf[js.Any])
    if (default_title != null) __obj.updateDynamic("default_title")(default_title)
    if (!js.isUndefined(open_at_install)) __obj.updateDynamic("open_at_install")(open_at_install)
    __obj.asInstanceOf[Anon_BrowserstyleDefaulticonDefaultpanel]
  }
}

