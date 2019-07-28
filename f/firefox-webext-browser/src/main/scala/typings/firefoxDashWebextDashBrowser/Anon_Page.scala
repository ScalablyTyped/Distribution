package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.underscoreManifestNs.ExtensionURL
import typings.firefoxDashWebextDashBrowser.browserNs.underscoreManifestNs.PersistentBackgroundProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Page extends js.Object {
  var page: ExtensionURL
  var persistent: js.UndefOr[PersistentBackgroundProperty] = js.undefined
}

object Anon_Page {
  @scala.inline
  def apply(page: ExtensionURL, persistent: js.UndefOr[PersistentBackgroundProperty] = js.undefined): Anon_Page = {
    val __obj = js.Dynamic.literal(page = page)
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    __obj.asInstanceOf[Anon_Page]
  }
}

