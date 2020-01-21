package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.manifest.IconPath
import typings.firefoxWebextBrowser.browser.manifest.MatchPattern
import typings.firefoxWebextBrowser.browser.manifest.MatchPatternRestricted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBrowserstyleDefaulticon extends js.Object {
  var browser_style: js.UndefOr[Boolean] = js.undefined
  var default_icon: js.UndefOr[IconPath] = js.undefined
  var default_popup: js.UndefOr[String] = js.undefined
  var default_title: js.UndefOr[String] = js.undefined
  var hide_matches: js.UndefOr[js.Array[MatchPatternRestricted]] = js.undefined
  var pinned: js.UndefOr[Boolean] = js.undefined
  var show_matches: js.UndefOr[js.Array[MatchPattern]] = js.undefined
}

object AnonBrowserstyleDefaulticon {
  @scala.inline
  def apply(
    browser_style: js.UndefOr[Boolean] = js.undefined,
    default_icon: IconPath = null,
    default_popup: String = null,
    default_title: String = null,
    hide_matches: js.Array[MatchPatternRestricted] = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    show_matches: js.Array[MatchPattern] = null
  ): AnonBrowserstyleDefaulticon = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(browser_style)) __obj.updateDynamic("browser_style")(browser_style.asInstanceOf[js.Any])
    if (default_icon != null) __obj.updateDynamic("default_icon")(default_icon.asInstanceOf[js.Any])
    if (default_popup != null) __obj.updateDynamic("default_popup")(default_popup.asInstanceOf[js.Any])
    if (default_title != null) __obj.updateDynamic("default_title")(default_title.asInstanceOf[js.Any])
    if (hide_matches != null) __obj.updateDynamic("hide_matches")(hide_matches.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (show_matches != null) __obj.updateDynamic("show_matches")(show_matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBrowserstyleDefaulticon]
  }
}

