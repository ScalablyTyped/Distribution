package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.underscoreManifestNs.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Browserstyle extends js.Object {
  var browser_style: js.UndefOr[Boolean] = js.undefined
  var chrome_style: js.UndefOr[Boolean] = js.undefined
  var open_in_tab: js.UndefOr[Boolean] = js.undefined
  var page: ExtensionURL
}

object Anon_Browserstyle {
  @scala.inline
  def apply(
    page: ExtensionURL,
    browser_style: js.UndefOr[Boolean] = js.undefined,
    chrome_style: js.UndefOr[Boolean] = js.undefined,
    open_in_tab: js.UndefOr[Boolean] = js.undefined
  ): Anon_Browserstyle = {
    val __obj = js.Dynamic.literal(page = page)
    if (!js.isUndefined(browser_style)) __obj.updateDynamic("browser_style")(browser_style)
    if (!js.isUndefined(chrome_style)) __obj.updateDynamic("chrome_style")(chrome_style)
    if (!js.isUndefined(open_in_tab)) __obj.updateDynamic("open_in_tab")(open_in_tab)
    __obj.asInstanceOf[Anon_Browserstyle]
  }
}

