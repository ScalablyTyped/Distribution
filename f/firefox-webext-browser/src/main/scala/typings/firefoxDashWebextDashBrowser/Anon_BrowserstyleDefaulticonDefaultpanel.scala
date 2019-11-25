package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser._manifest.IconPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BrowserstyleDefaulticonDefaultpanel extends js.Object {
  var browser_style: js.UndefOr[Boolean] = js.undefined
  var default_icon: js.UndefOr[IconPath] = js.undefined
  var default_panel: String
  var default_title: js.UndefOr[String] = js.undefined
  /** Whether or not the sidebar is opened at install. Default is `true`. */
  var open_at_install: js.UndefOr[Boolean] = js.undefined
}

object Anon_BrowserstyleDefaulticonDefaultpanel {
  @scala.inline
  def apply(
    default_panel: String,
    browser_style: js.UndefOr[Boolean] = js.undefined,
    default_icon: IconPath = null,
    default_title: String = null,
    open_at_install: js.UndefOr[Boolean] = js.undefined
  ): Anon_BrowserstyleDefaulticonDefaultpanel = {
    val __obj = js.Dynamic.literal(default_panel = default_panel.asInstanceOf[js.Any])
    if (!js.isUndefined(browser_style)) __obj.updateDynamic("browser_style")(browser_style.asInstanceOf[js.Any])
    if (default_icon != null) __obj.updateDynamic("default_icon")(default_icon.asInstanceOf[js.Any])
    if (default_title != null) __obj.updateDynamic("default_title")(default_title.asInstanceOf[js.Any])
    if (!js.isUndefined(open_at_install)) __obj.updateDynamic("open_at_install")(open_at_install.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BrowserstyleDefaulticonDefaultpanel]
  }
}

