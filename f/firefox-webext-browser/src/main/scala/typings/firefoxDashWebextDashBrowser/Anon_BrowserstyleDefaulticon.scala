package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser._manifest.IconPath
import typings.firefoxDashWebextDashBrowser.browser._manifest.MatchPattern
import typings.firefoxDashWebextDashBrowser.browser._manifest.MatchPatternRestricted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BrowserstyleDefaulticon extends js.Object {
  var browser_style: js.UndefOr[Boolean] = js.undefined
  var default_icon: js.UndefOr[IconPath] = js.undefined
  var default_popup: js.UndefOr[String] = js.undefined
  var default_title: js.UndefOr[String] = js.undefined
  var hide_matches: js.UndefOr[js.Array[MatchPatternRestricted]] = js.undefined
  var pinned: js.UndefOr[Boolean] = js.undefined
  var show_matches: js.UndefOr[js.Array[MatchPattern]] = js.undefined
}

object Anon_BrowserstyleDefaulticon {
  @scala.inline
  def apply(
    browser_style: js.UndefOr[Boolean] = js.undefined,
    default_icon: IconPath = null,
    default_popup: String = null,
    default_title: String = null,
    hide_matches: js.Array[MatchPatternRestricted] = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    show_matches: js.Array[MatchPattern] = null
  ): Anon_BrowserstyleDefaulticon = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(browser_style)) __obj.updateDynamic("browser_style")(browser_style)
    if (default_icon != null) __obj.updateDynamic("default_icon")(default_icon.asInstanceOf[js.Any])
    if (default_popup != null) __obj.updateDynamic("default_popup")(default_popup)
    if (default_title != null) __obj.updateDynamic("default_title")(default_title)
    if (hide_matches != null) __obj.updateDynamic("hide_matches")(hide_matches)
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (show_matches != null) __obj.updateDynamic("show_matches")(show_matches)
    __obj.asInstanceOf[Anon_BrowserstyleDefaulticon]
  }
}

