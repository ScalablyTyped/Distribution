package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Page extends js.Object {
  var page: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL
  var persistent: js.UndefOr[
    firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.PersistentBackgroundProperty
  ] = js.undefined
}

object Anon_Page {
  @scala.inline
  def apply(
    page: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL,
    persistent: js.UndefOr[
      firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.PersistentBackgroundProperty
    ] = js.undefined
  ): Anon_Page = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("page")(page)
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    __obj.asInstanceOf[Anon_Page]
  }
}

