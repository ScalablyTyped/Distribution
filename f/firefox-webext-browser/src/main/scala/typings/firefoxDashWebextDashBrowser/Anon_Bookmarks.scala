package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser._manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bookmarks extends js.Object {
  /** @deprecated Unsupported on Firefox at this time. */
  var bookmarks: js.UndefOr[ExtensionURL] = js.undefined
  /** @deprecated Unsupported on Firefox at this time. */
  var history: js.UndefOr[ExtensionURL] = js.undefined
  var newtab: js.UndefOr[ExtensionURL] = js.undefined
}

object Anon_Bookmarks {
  @scala.inline
  def apply(bookmarks: ExtensionURL = null, history: ExtensionURL = null, newtab: ExtensionURL = null): Anon_Bookmarks = {
    val __obj = js.Dynamic.literal()
    if (bookmarks != null) __obj.updateDynamic("bookmarks")(bookmarks.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (newtab != null) __obj.updateDynamic("newtab")(newtab.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bookmarks]
  }
}

