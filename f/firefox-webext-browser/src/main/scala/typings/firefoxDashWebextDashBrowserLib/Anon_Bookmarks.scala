package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bookmarks extends js.Object {
  /** @deprecated Unsupported on Firefox at this time. */
  var bookmarks: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL] = js.undefined
  /** @deprecated Unsupported on Firefox at this time. */
  var history: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL] = js.undefined
  var newtab: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL] = js.undefined
}

object Anon_Bookmarks {
  @scala.inline
  def apply(
    bookmarks: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL = null,
    history: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL = null,
    newtab: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL = null
  ): Anon_Bookmarks = {
    val __obj = js.Dynamic.literal()
    if (bookmarks != null) __obj.updateDynamic("bookmarks")(bookmarks)
    if (history != null) __obj.updateDynamic("history")(history)
    if (newtab != null) __obj.updateDynamic("newtab")(newtab)
    __obj.asInstanceOf[Anon_Bookmarks]
  }
}

